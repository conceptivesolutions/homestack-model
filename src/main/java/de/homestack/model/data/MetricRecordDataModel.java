package de.homestack.model.data;

import java.util.*;

/**
 * POJO for a single metric record for a single device
 * Care, this will be used in REST directly
 *
 * @author w.glanzer, 12.10.2020
 */
@SuppressWarnings("unused")
public final class MetricRecordDataModel
{
  /**
   * ID of the device this metric belongs to
   */
  public String deviceID;

  /**
   * Time when this metric was recorded
   */
  public Date recordTime;

  /**
   * Type of this metric (ping, tracert, etc.)
   *
   * @see MetricDataModel#type
   */
  public String type;

  /**
   * State of this metric
   */
  public EState state;

  /**
   * Additional properties to the current state
   */
  public Map<String, String> result;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    MetricRecordDataModel that = (MetricRecordDataModel) pO;
    return Objects.equals(deviceID, that.deviceID) && Objects.equals(recordTime, that.recordTime) &&
        Objects.equals(type, that.type) && state == that.state && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(deviceID, recordTime, type, state, result);
  }

  /**
   * State to determine, what to expect from a device
   */
  public enum EState
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
}
