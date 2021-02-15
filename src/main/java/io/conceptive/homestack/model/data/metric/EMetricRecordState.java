package io.conceptive.homestack.model.data.metric;

/**
 * State to determine, what to expect from a device
 *
 * @author w.glanzer, 10.02.2021
 */
public enum EMetricRecordState
{
  /**
   * Device FAILED, so it can not be used anywhere
   */
  FAILURE,

  /**
   * Device can be used, but may not work correctly
   */
  WARNING,

  /**
   * Device is OK and ready to use
   */
  SUCCESS,

  /**
   * State could not be determined
   */
  UNKNOWN
}
