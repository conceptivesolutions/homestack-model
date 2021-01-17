package io.conceptive.homestack.model.data;

import java.util.Objects;

/**
 * Specifies a single network slot of a device.
 * This slot can be connected to another slot, of another device
 *
 * @author w.glanzer, 14.01.2021
 */
@SuppressWarnings("unused")
public class NetworkSlotDataModel
{

  /**
   * Global unique id of the slot
   */
  public String id;

  /**
   * Current state
   */
  public EState state;

  /**
   * The slot id, if this slot is connected to another
   */
  public String targetSlotID;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO) return true;
    if (pO == null || getClass() != pO.getClass()) return false;
    NetworkSlotDataModel that = (NetworkSlotDataModel) pO;
    return Objects.equals(id, that.id) && Objects.equals(targetSlotID, that.targetSlotID);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, targetSlotID);
  }

  public enum EState
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

}
