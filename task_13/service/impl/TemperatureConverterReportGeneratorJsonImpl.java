package com.globant.levelling.reportgenerator.service.impl;

import com.globant.levelling.reportgenerator.domain.TemperatureRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureReportGenerator;
import com.globant.levelling.reportgenerator.util.FormatISO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Collection;
import java.util.List;

public class TemperatureConverterReportGeneratorJsonImpl implements ITemperatureReportGenerator {

    ITemperatureConverterReport reportConverter;

    /**
     * Constructor with dependency injection
     *
     * @param reportConverter
     */
    public TemperatureConverterReportGeneratorJsonImpl(ITemperatureConverterReport reportConverter) {
        this.reportConverter = reportConverter;
    }


    @Override
    public void saveReportInCelsius(Collection<TemperatureRecord> temperatureRecords, String outputPath) throws WritingReportFailException {
        // Writes a new file, in case it exists already throws an exception
        File file = new File(outputPath);

        if(file.exists() && file.isFile()){
            throw new WritingReportFailException(
                    "There is already exists in path: " + outputPath, null);
        }
        // Writes the Json file with the given values of the temperatureRecords
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))){
            List<TemperatureRecord> reportInCelsius = reportConverter.convertToCelsius(temperatureRecords);
            writer.write("[");
            writer.newLine();
            for (int index = 0; index < reportInCelsius.size(); index++) {
                writer.write("{");
                writer.newLine();

                FormatISO formatISO = new FormatISO(reportInCelsius.get(index).getTimeStamp());

                writer.write("\"time\": " + '"' + formatISO.formatedData() + '"'+',');
                writer.newLine();
                writer.write("\"temperature\": " + reportInCelsius.get(index).getTemperature());

                writer.newLine();

                if (index!=reportInCelsius.size()-1){
                    writer.write("},");
                }else writer.write("}");

                writer.newLine();
            }
            writer.write("]");
        }catch (Exception e){
            throw new WritingReportFailException(
                "Whoops, an error occurred writing report at: " + outputPath, e
            );
        }
    }
}
