package com.globant.levelling.reportgenerator.service.impl;

import com.globant.levelling.reportgenerator.domain.TemperatureRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureReportGenerator;
import com.globant.levelling.reportgenerator.util.FormatISO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public class TemperatureConverterReportGeneratorTxtImpl implements ITemperatureReportGenerator {

    ITemperatureConverterReport reportConverter;

    /**
     * Constructor with dependency injection
     *
     * @param reportConverter
     */
    public TemperatureConverterReportGeneratorTxtImpl(ITemperatureConverterReport reportConverter) {
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
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ){
            List<TemperatureRecord> reportInCelsius = reportConverter.convertToCelsius(temperatureRecords);
            writer.write("Temperature | Format ISO 8601");
            writer.newLine();
            for (int index = 0; index < reportInCelsius.size(); index++) {
                TemperatureRecord temperature = reportInCelsius.get(index);

                LocalDateTime date = temperature.getTimeStamp();

                FormatISO formatISO = new FormatISO(date);

                Double temp = temperature.getTemperature();
                String formatedTemp =  temp == null
                        ? "--"
                        : String.format("%.6f", temp);

                String line = temp + "°C | " + formatISO.formatedData();

                writer.write(line);
                writer.newLine();
            }
        }catch (Exception e){
            throw new WritingReportFailException(
                "Whoops, an error occurred writing report at: " + outputPath, e
            );
        }
    }
}
