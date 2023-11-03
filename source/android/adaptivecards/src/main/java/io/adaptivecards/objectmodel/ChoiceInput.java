/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ChoiceInput {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ChoiceInput(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChoiceInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ChoiceInput(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ChoiceInput() {
    this(AdaptiveCardObjectModelJNI.new_ChoiceInput(), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ChoiceInput_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_GetTitle(swigCPtr, this);
  }

  public void SetTitle(String value) {
    AdaptiveCardObjectModelJNI.ChoiceInput_SetTitle(swigCPtr, this, value);
  }

  public String GetValue() {
    return AdaptiveCardObjectModelJNI.ChoiceInput_GetValue(swigCPtr, this);
  }

  public void SetValue(String value) {
    AdaptiveCardObjectModelJNI.ChoiceInput_SetValue(swigCPtr, this, value);
  }

  public static ChoiceInput Deserialize(ParseContext arg0, JsonValue root) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_Deserialize(ParseContext.getCPtr(arg0), arg0, JsonValue.getCPtr(root), root);
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

  public static ChoiceInput DeserializeFromString(ParseContext arg0, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_DeserializeFromString(ParseContext.getCPtr(arg0), arg0, jsonString);
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

  public static ChoiceInput dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceInput_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ChoiceInput(cPtr, true);
  }

}
