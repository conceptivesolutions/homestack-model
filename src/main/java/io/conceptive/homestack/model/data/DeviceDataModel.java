package io.conceptive.homestack.model.data;

import java.util.*;

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
   * ID of the stack this device belongs to
   */
  public String stackID;

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

  /**
   * Contains all available slots with "row" and "column" coordinates
   */
  public List<List<NetworkSlotDataModel>> slots;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    DeviceDataModel that = (DeviceDataModel) pO;
    return Objects.equals(id, that.id) && Objects.equals(stackID, that.stackID) && Objects.equals(icon, that.icon) &&
        Objects.equals(address, that.address) && Objects.equals(location, that.location) && Objects.equals(slots, that.slots);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, stackID, icon, address, location, slots);
  }
}
