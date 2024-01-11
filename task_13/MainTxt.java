package com.globant.levelling.reportgenerator;
import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.impl.DistanceConvertReportImpl;
import com.globant.levelling.reportgenerator.service.impl.DistanceConverterImpl;
import com.globant.levelling.reportgenerator.service.impl.DistanceConverterReportGeneratorTxtImpl;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceReportGenerator;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collection;
import java.util.List;

public class MainTxt {

  // demo for txt implementation
  public static void main(String[] args) {
    IDistanceReportGenerator txtGenerator =
        new DistanceConverterReportGeneratorTxtImpl(
            new DistanceConvertReportImpl(new DistanceConverterImpl()));

    // dummy report
    Collection<DistanceRecord> recordsMiles =
        List.of(
            new DistanceRecord(1D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,0)),
            new DistanceRecord(1.23D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,12)),
            new DistanceRecord(1.34D, LocalDateTime.of(2024, Month.JANUARY,8,10,0,30)),
            new DistanceRecord(1.69D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,2)),
            new DistanceRecord(1.88D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,27)),
            new DistanceRecord(2.03D, LocalDateTime.of(2024, Month.JANUARY,8,10,1,43)));
    try {
      System.out.println("iniciando generación reporte...");
      txtGenerator.saveReportInKm(recordsMiles, "/Users/andres.yate/Documents/report.txt");
      System.out.println("Reporte generado en archivo.");
    } catch (WritingReportFailException e) {
      System.out.println("Ocurrió error");
      e.printStackTrace();
    }

  }
}
