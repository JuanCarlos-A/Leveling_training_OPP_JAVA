package com.globant.levelling.reportgenerator.service.interfaces;

import com.globant.levelling.reportgenerator.domain.TemperatureRecord;

import java.util.Collection;
import java.util.List;

/**
 * Given a Collection of TemperatureRecord with degrees in Kelvin, return a List
 * with records converted to Celsius.
 *
 * @Param List of TemperatureRecord with Kelvin degrees.
 *
 * @Returns List gaven converted to Celsius degrees.
 */
public interface ITemperatureConverterReport {
    List<TemperatureRecord> convertToCelsius(Collection<TemperatureRecord> tempRecord);

}
