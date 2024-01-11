package com.globant.levelling.reportgenerator.service.interfaces;
import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import java.util.Collection;
import java.util.List;

/**
 * Report converter converts a report of DistanceRecord with distance given
 * in miles o a report with distances given in Kilometers.
 *
 * A report is represented by a Collection of DistanceRecords.
 */
public interface IDistanceConverterReport {


  List<DistanceRecord> convertToKmReport (Collection<DistanceRecord> listInMiles);
}
