package com.globant.levelling.reportgenerator.service.interfaces;

/**
 * This interface defines a converter from a physical unit A to B
 * and reverse convertion from B to A by multiplying by some conversion factor.
 *
 * For instance, a converter from distance units, like Km to Miles or
 * power units like Watt to Horse Power.
 */
public  interface IUnitFactorConverter {

  /**
   * Performs convertion from  unit A to B
   *
   * @param u the magnitude to be converted in A
   * @return the result of magnitude in B. If u is null,
   * then null will be returned.
   */
  Double convert(Double u);

  /**
   * Performs reverse conversion from unit B to A
   *
   * @param u the magnitude to be converted in B
   * @return the result of magnitude in A. If u is null,
   *  then null will be returned.
   */
  Double reverseConvert(Double u);

}
