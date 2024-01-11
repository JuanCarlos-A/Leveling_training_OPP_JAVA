package com.globant.levelling.reportgenerator.service.impl;
import com.globant.levelling.reportgenerator.domain.DistanceRecord;
import com.globant.levelling.reportgenerator.service.interfaces.IDistanceConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.IUnitFactorConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Implementación de convertidor de lista
 */
public class DistanceConvertReportImpl implements IDistanceConverterReport {

  /**
   * For convert a report, a record converted is used
   *
   */
  IUnitFactorConverter milesToKmConverter;

  /**
   * Constuctor for dependency injection
   *
   * @param milesToKmConverter
   */
  public DistanceConvertReportImpl(IUnitFactorConverter milesToKmConverter) {
    this.milesToKmConverter = milesToKmConverter;
  }

  @Override
  public List<DistanceRecord> convertToKmReport(Collection<DistanceRecord> listInMiles) {
    // for null parameter, an empty list will be returned
    if (listInMiles == null) {
      return new ArrayList<>();
    }

    // result list
    final List<DistanceRecord> reportInKm = new ArrayList<>(listInMiles.size());

    // iterate over collection via iterator
    final Iterator<DistanceRecord> iterator = listInMiles.iterator();
    while(iterator.hasNext()) {
      final DistanceRecord recordInMiles = iterator.next();

      // convert to record in Km
      final DistanceRecord recordInKm = new DistanceRecord(
         milesToKmConverter.convert(recordInMiles.getDistance()),
         recordInMiles.getTimeStamp());
      reportInKm.add(recordInKm);
    }

    return reportInKm;
  }
}
