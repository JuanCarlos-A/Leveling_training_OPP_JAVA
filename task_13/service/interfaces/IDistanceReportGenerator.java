package com.globant.levelling.reportgenerator.service.interfaces;

import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.exceptions.WritingReportFailException;
import java.util.Collection;

/**
 * Report generators creates a report of distances
 * and writes it to a file in disk
 */
public interface IDistanceReportGenerator {
  public void saveReportInKm(Collection<DistanceRecord> reportInMiles, String outputPath) throws WritingReportFailException;
}
