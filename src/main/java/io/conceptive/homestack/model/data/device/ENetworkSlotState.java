package io.conceptive.homestack.model.data.device;

/**
 * @author w.glanzer, 10.02.2021
 */
public enum ENetworkSlotState
{
  /**
   * All ok, slot is currently active and working correctly
   */
  ONLINE,

  /**
   * Slot is connected, but not ready to send anything
   */
  OFFLINE,

  /**
   * Slot is disabled
   */
  DISABLED
}
