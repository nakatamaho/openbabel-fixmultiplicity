/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class obMessageLevel {
  public final static obMessageLevel obError = new obMessageLevel("obError");
  public final static obMessageLevel obWarning = new obMessageLevel("obWarning");
  public final static obMessageLevel obInfo = new obMessageLevel("obInfo");
  public final static obMessageLevel obAuditMsg = new obMessageLevel("obAuditMsg");
  public final static obMessageLevel obDebug = new obMessageLevel("obDebug");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static obMessageLevel swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + obMessageLevel.class + " with value " + swigValue);
  }

  private obMessageLevel(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private obMessageLevel(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private obMessageLevel(String swigName, obMessageLevel swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static obMessageLevel[] swigValues = { obError, obWarning, obInfo, obAuditMsg, obDebug };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

