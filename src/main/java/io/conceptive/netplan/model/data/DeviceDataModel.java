package io.conceptive.netplan.model.data;

import java.util.Objects;

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

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    DeviceDataModel that = (DeviceDataModel) pO;
    return Objects.equals(id, that.id) && Objects.equals(hostID, that.hostID) && Objects.equals(icon, that.icon) &&
        Objects.equals(address, that.address) && Objects.equals(location, that.location);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, hostID, icon, address, location);
  }
}
