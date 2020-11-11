package io.conceptive.netplan.model.data;

/**
 * POJO for a single host.
 * Care, this will be used in REST directly
 *
 * @author w.glanzer, 15.10.2020
 */
@SuppressWarnings("unused")
public final class HostDataModel
{

  /**
   * ID of the host
   */
  public String id;

  /**
   * Displayable String
   */
  public String displayName;

}
