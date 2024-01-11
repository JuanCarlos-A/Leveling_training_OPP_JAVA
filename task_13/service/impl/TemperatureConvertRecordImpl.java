package com.globant.levelling.reportgenerator.service.impl;

import com.globant.levelling.reportgenerator.domain.TemperatureRecord;
import com.globant.levelling.reportgenerator.service.interfaces.ITemperatureConverterReport;
import com.globant.levelling.reportgenerator.service.interfaces.IUnitFactorConverter;

import java.util.*;

public class TemperatureConvertRecordImpl implements ITemperatureConverterReport {

    IUnitFactorConverter    kelvinToCelsiusConverter;

    public TemperatureConvertRecordImpl(TemperatureConverterImpl temperatureConverter) {
        this.kelvinToCelsiusConverter = temperatureConverter;
    }

    /**
     * Convert a list of TemperatureRecord given in Kelvin to Celsius.
     *
     * @Param List of TemperatureRecord.
     *
     * @Returns List of TemperatureRecord given converted to Celsius.
     */
    @Override
    public List<TemperatureRecord> convertToCelsius(Collection<TemperatureRecord> tempRecord) {
        // In case the parameter is null, is returned an empty arrayList
        if (tempRecord==null){
            return new ArrayList<>();
        }

        // To return list.
        final List<TemperatureRecord> reportInCelsius = new ArrayList<>(tempRecord.size());

        final Iterator<TemperatureRecord> iterator = tempRecord.iterator();

        // Iterates over the collection trough iterator
        while (iterator.hasNext()){
            final TemperatureRecord recordInKelvin  = iterator.next();

            // Convert record to Celsius
            final  TemperatureRecord recordInCelsius = new TemperatureRecord(
                    kelvinToCelsiusConverter.convert(recordInKelvin.getTemperature())
                    ,recordInKelvin.getTimeStamp()
            );
            reportInCelsius.add(recordInCelsius);
        }

        return  reportInCelsius;
    }

}