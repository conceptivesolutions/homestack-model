package io.conceptive.homestack.model.data.satellite;

import java.time.Instant;
import java.util.Objects;

/**
 * A model for a single satellite lease
 *
 * @author w.glanzer, 29.11.2020
 */
public class LeaseDataModel
{

  /**
   * ID of the lease (same as the id of the satellite)
   */
  public String id;

  /**
   * ID of the user, who owns this lease
   */
  public String userID;

  /**
   * Date, when this lease was revoked by user
   */
  public Instant revokedDate;

  /**
   * Token for the satellite
   */
  public String token;

  @Override
  public boolean equals(Object pO)
  {
    if (this == pO)
      return true;
    if (pO == null || getClass() != pO.getClass())
      return false;
    LeaseDataModel that = (LeaseDataModel) pO;
    return Objects.equals(id, that.id) &&
        Objects.equals(userID, that.userID) &&
        Objects.equals(revokedDate, that.revokedDate) &&
        Objects.equals(token, that.token);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, userID, revokedDate, token);
  }
}
