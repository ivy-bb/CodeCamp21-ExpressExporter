package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class StatisticData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class StatisticData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6637584277135562725L;

  private transient ch.ivy.addon.portalkit.bo.PriorityStatistic priorityStatistic;

  /**
   * Gets the field priorityStatistic.
   * @return the value of the field priorityStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.PriorityStatistic getPriorityStatistic()
  {
    return priorityStatistic;
  }

  /**
   * Sets the field priorityStatistic.
   * @param _priorityStatistic the new value of the field priorityStatistic.
   */
  public void setPriorityStatistic(ch.ivy.addon.portalkit.bo.PriorityStatistic _priorityStatistic)
  {
    priorityStatistic = _priorityStatistic;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpiryStatistic expiryStatistic;

  /**
   * Gets the field expiryStatistic.
   * @return the value of the field expiryStatistic; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpiryStatistic getExpiryStatistic()
  {
    return expiryStatistic;
  }

  /**
   * Sets the field expiryStatistic.
   * @param _expiryStatistic the new value of the field expiryStatistic.
   */
  public void setExpiryStatistic(ch.ivy.addon.portalkit.bo.ExpiryStatistic _expiryStatistic)
  {
    expiryStatistic = _expiryStatistic;
  }

}
