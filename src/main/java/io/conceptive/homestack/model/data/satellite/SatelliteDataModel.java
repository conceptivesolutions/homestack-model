package io.conceptive.homestack.model.data.satellite;

import io.conceptive.homestack.model.data.ScreenLocationDataModel;

/**
 * Model for a single satellite
 *
 * @author w.glanzer, 30.11.2020
 */
public class SatelliteDataModel
{

  /**
   * ID of the satellite
   */
  public String id;

  /**
   * ID of the host this satellite belongs to
   */
  public String hostID;

  /**
   * Determines, where this device is located
   */
  public ScreenLocationDataModel location;

}
