/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FeatureRegistration {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected FeatureRegistration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FeatureRegistration obj) {
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
        AdaptiveCardObjectModelJNI.delete_FeatureRegistration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FeatureRegistration() {
    this(AdaptiveCardObjectModelJNI.new_FeatureRegistration(), true);
  }

  public void AddFeature(String featureName, String featureVersion) {
    AdaptiveCardObjectModelJNI.FeatureRegistration_AddFeature(swigCPtr, this, featureName, featureVersion);
  }

  public void RemoveFeature(String featureName) {
    AdaptiveCardObjectModelJNI.FeatureRegistration_RemoveFeature(swigCPtr, this, featureName);
  }

  public SemanticVersion GetAdaptiveCardsVersion() {
    return new SemanticVersion(AdaptiveCardObjectModelJNI.FeatureRegistration_GetAdaptiveCardsVersion(swigCPtr, this), true);
  }

  public String GetFeatureVersion(String featureName) {
    return AdaptiveCardObjectModelJNI.FeatureRegistration_GetFeatureVersion(swigCPtr, this, featureName);
  }

}
