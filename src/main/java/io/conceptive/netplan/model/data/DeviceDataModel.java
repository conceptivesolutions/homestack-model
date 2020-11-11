package io.conceptive.netplan.model.data;

/**
 * @author w.glanzer, 13.09.2020
 */
@SuppressWarnings("unused")
public final class DeviceDataModel
{

  /**
   * Unique ID of the device
   */
  public String id;

  /**
   * ID of the host this device belongs to
   */
  public String hostID;

  /**
   * Name of the icon for this device (mainly present in gui)
   */
  public String icon;

  /**
   * Address (IP or Hostname) of the device
   */
  public String address;

  /**
   * Determines, where this device is located
   */
  public ScreenLocationDataModel location;

}
