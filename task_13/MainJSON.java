package com.globant.levelling.reportgenerator;

import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.domain.TemperatureRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.impl.TemperatureConvertRecordImpl;
import com.globant.levelling.reportgenerator.service.impl.TemperatureConverterImpl;
import com.globant.levelling.reportgenerator.service.impl.TemperatureConverterReportGeneratorJsonImpl;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureReportGenerator;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collection;
import java.util.List;

public class MainJSON {

    public static void main(String[] args) {

    ITemperatureReportGenerator jsonGenerator =
            new TemperatureConverterReportGeneratorJsonImpl(
            new TemperatureConvertRecordImpl( new TemperatureConverterImpl() )
            );

    Collection<TemperatureRecord> recordsCelcius =
            List.of(
                    new TemperatureRecord(1D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,0)),
                    new TemperatureRecord(1.23D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,12)),
                    new TemperatureRecord(1.34D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,30)),
                    new TemperatureRecord(1.69D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,2)),
                    new TemperatureRecord(1.88D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,27)),
                    new TemperatureRecord(2.03D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,43)));

            try {
                System.out.println("iniciando generación reporte...");
                jsonGenerator.saveReportInCelsius(recordsCelcius, "C:/Users/deyby.ariza/Documents/report.JSON");
                System.out.println("Reporte generado en archivo.");
            } catch (WritingReportFailException e) {
                System.out.println("Ocurrió error");
                e.printStackTrace();
            }
    }
}
