package com.globant.levelling.reportgenerator.service.impl;

import com.globant.levelling.reportgenerator.service.interfaces.IUnitFactorConverter;
/*
* Temperature in Kelvin to Celsius converter;
 */
public class TemperatureConverterImpl implements IUnitFactorConverter {

    private static final double CONVERSION_FACTOR=273D;

    @Override
    public Double convert(Double u) {
        return u == null
                ? null :
                u - CONVERSION_FACTOR;
    }

    @Override
    public Double reverseConvert(Double u) {
         return u == null
                ? null :
                u + CONVERSION_FACTOR;
    }

}
