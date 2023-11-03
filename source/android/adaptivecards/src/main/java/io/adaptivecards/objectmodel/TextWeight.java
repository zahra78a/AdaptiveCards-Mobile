/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum TextWeight {
  Lighter(0),
  Default,
  Bolder;

  public final int swigValue() {
    return swigValue;
  }

  public static TextWeight swigToEnum(int swigValue) {
    TextWeight[] swigValues = TextWeight.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TextWeight swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TextWeight.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TextWeight() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TextWeight(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TextWeight(TextWeight swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

