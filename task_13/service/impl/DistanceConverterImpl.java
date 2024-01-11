package com.globant.levelling.reportgenerator.service.impl;

import com.globant.levelling.reportgenerator.service.interfaces.IUnitFactorConverter;

/**
 * Distance Miles to Km converter
 */
public class DistanceConverterImpl implements IUnitFactorConverter {
  /**
   * Conversion factor
   *
   * 1 Mile is approximately 1.069 Kilometers.
   */
  private static final double CONVERSION_FACTOR = 1.609D;

  @Override
  public Double convert(Double u) {
    // use of ? : ternary operator
    return u == null
        ? null :
        u * CONVERSION_FACTOR;
  }
  @Override
  public Double reverseConvert(Double u) {
    if (u == null) {
      return null;
    }
    return u / CONVERSION_FACTOR;
  }
}
