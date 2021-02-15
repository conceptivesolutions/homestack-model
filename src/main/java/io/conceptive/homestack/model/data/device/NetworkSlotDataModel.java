package io.conceptive.homestack.model.data.device;

import lombok.*;

/**
 * Specifies a single network slot of a device.
 * This slot can be connected to another slot, of another device
 *
 * @author w.glanzer, 14.01.2021
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NetworkSlotDataModel
{

  /**
   * Global unique id of the slot
   */
  @NonNull
  public String id;

  /**
   * Current state
   */
  public ENetworkSlotState state;

  /**
   * The slot id, if this slot is connected to another
   */
  public String targetSlotID;

}
