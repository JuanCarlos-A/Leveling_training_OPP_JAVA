package com.globant.levelling.reportgenerator.service.impl;
import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceReportGenerator;
import com.globant.levelling.reportgenerator.util.FormatISO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.Normalizer;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


/**
 * Saves a distance Report in TXT file
 *
 * Format of txt is the following:
 *
 *  time | distance
 *
 *
 *  time = datetime in format yyyy-mm-ddTHH:MM:SS
 *  distance = with 6 decimals or string -- if value is null
 *  One record per line
 */
public class DistanceConverterReportGeneratorTxtImpl implements IDistanceReportGenerator {

  // report converter
  IDistanceConverterReport reportConverter;

  /**
   * Constructor with dependency injeciton
   *
   * @param reportConverter
   */
  public DistanceConverterReportGeneratorTxtImpl(IDistanceConverterReport reportConverter) {
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

      writer.write("Distance | Format ISO 8601");
      writer.newLine();
      // iterate report in Km to write each line of file
      for(int i = 0; i < reportKm.size(); i++) {
        // get the i-th record
        DistanceRecord record = reportKm.get(i);

        // generate string with the line
        LocalDateTime date = record.getTimeStamp();
        // format date
        // excercise: use a date formatter
        FormatISO formatISO = new FormatISO(date);
        String formatedISO = formatISO.formatedData();
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
        String line = formatedDistance + " | " + formatedISO;

        // write line to file
        writer.write(line);
        // write new line chars
        writer.newLine();
      }
    } catch (Exception e) {
      throw new WritingReportFailException(
          "An error ocurred while writing the report at file: " + outputPath,
          e);
    }
  }
}
