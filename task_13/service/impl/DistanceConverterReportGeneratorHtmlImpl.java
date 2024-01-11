package com.globant.levelling.reportgenerator.service.impl;
import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceReportGenerator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * Implementation of HTML report generator
 */
public class DistanceConverterReportGeneratorHtmlImpl implements IDistanceReportGenerator {
  // report converter
  IDistanceConverterReport reportConverter;

  /**
   * Constructor with dependency injeciton
   *
   * @param reportConverter
   */
  public DistanceConverterReportGeneratorHtmlImpl(IDistanceConverterReport reportConverter) {
    this.reportConverter = reportConverter;
  }

  @Override
  public void saveReportInKm(Collection<DistanceRecord> reportInMiles, String outputPath) throws WritingReportFailException {
    // if file given by output path currently exists
    // an exception is thrown
    File f = new File(outputPath);
    if (f.exists() && f.isFile()) {
      throw new WritingReportFailException(
          "The file at path " + outputPath + " already exists",
          null);
    }

    // create write text file and write the report
    try (
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
    ) {

      // convert the report to km
      List<DistanceRecord> reportKm = reportConverter.convertToKmReport(reportInMiles);

      // write html head
      writer.write("<!DOCTYPE html>");
      writer.newLine();
      writer.write("<html>");
      writer.newLine();
      writer.write("<head>");
      writer.newLine();
      writer.write("<title>Report</title>");
      writer.newLine();
      writer.write("</head>");
      writer.newLine();

      // table head
      writer.write("<table border=\"1\">");
      writer.newLine();
      writer.write("<thead>");
      writer.newLine();
      writer.write("<tr>");
      writer.newLine();
      writer.write("<th>Date / Time</th>");
      writer.newLine();
      writer.write("<th>Distance (Km)</th>");
      writer.newLine();
      writer.write("</tr>");
      writer.newLine();
      writer.write("</thead>");
      writer.newLine();
      writer.write("<tbody>");
      writer.newLine();

      // iterate report in Km to write each line of file
      for(int i = 0; i < reportKm.size(); i++) {
        // get the i-th record
        DistanceRecord record = reportKm.get(i);

        // generate string with the line
        LocalDateTime date = record.getTimeStamp();
        // format date
        // excercise: use a date formatter
        String formatedDate = String.format("%04d-%02d-%02dT%02d:%02d:%02d",
            date.getYear(),
            date.getMonthValue(),
            date.getDayOfMonth(),
            date.getHour(),
            date.getMinute(),
            date.getSecond());
        Double distance = record.getDistance();
        String formatedDistance =  distance == null
            ? "--"
            : String.format("%.6f", distance);

        // write table row
        writer.write("<tr>");
        writer.newLine();
        writer.write("<th>" + formatedDate + "</th>");
        writer.newLine();
        writer.write("<th>" + formatedDistance + "</th>");
        writer.newLine();
        writer.write("</tr>");
        writer.newLine();


      }
      // close table
      writer.write("</tbody>");
      writer.newLine();
      writer.write("</table>");
      writer.newLine();

      // write html foot
      writer.write("</body>");
      writer.newLine();
      writer.write("</html>");
      writer.newLine();
    } catch (Exception e) {
      throw new WritingReportFailException(
          "An error ocurred while writing the report at file: " + outputPath,
          e);
    }
  }
}
