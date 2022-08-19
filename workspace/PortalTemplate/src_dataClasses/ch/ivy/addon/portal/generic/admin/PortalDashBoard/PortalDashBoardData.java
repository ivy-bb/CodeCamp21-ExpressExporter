package ch.ivy.addon.portal.generic.admin.PortalDashBoard;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalDashBoardData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalDashBoardData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3132821293881285403L;

  private java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> statisticChartList;

  /**
   * Gets the field statisticChartList.
   * @return the value of the field statisticChartList; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> getStatisticChartList()
  {
    return statisticChartList;
  }

  /**
   * Sets the field statisticChartList.
   * @param _statisticChartList the new value of the field statisticChartList.
   */
  public void setStatisticChartList(java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> _statisticChartList)
  {
    statisticChartList = _statisticChartList;
  }

  /**
   * Customized TaskQuery
   */
  private ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

  /**
   * Gets the field taskQuery.
   * @return the value of the field taskQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.TaskQuery getTaskQuery()
  {
    return taskQuery;
  }

  /**
   * Sets the field taskQuery.
   * @param _taskQuery the new value of the field taskQuery.
   */
  public void setTaskQuery(ch.ivyteam.ivy.workflow.query.TaskQuery _taskQuery)
  {
    taskQuery = _taskQuery;
  }

}
