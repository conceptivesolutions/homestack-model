package io.conceptive.netplan.model.data;

/**
 * Simple relation between two devices
 *
 * @author w.glanzer, 12.10.2020
 */
@SuppressWarnings("unused")
public final class EdgeDataModel
{
  /**
   * ID of the edge
   */
  public String id;

  /**
   * ID of the source device
   */
  public String sourceID;

  /**
   * ID of the target device
   */
  public String targetID;
}
