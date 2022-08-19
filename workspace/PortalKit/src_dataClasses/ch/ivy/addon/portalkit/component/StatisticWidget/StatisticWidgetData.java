package ch.ivy.addon.portalkit.component.StatisticWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class StatisticWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class StatisticWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 9040235910172511994L;

  private java.lang.Boolean compactMode;

  /**
   * Gets the field compactMode.
   * @return the value of the field compactMode; may be null.
   */
  public java.lang.Boolean getCompactMode()
  {
    return compactMode;
  }

  /**
   * Sets the field compactMode.
   * @param _compactMode the new value of the field compactMode.
   */
  public void setCompactMode(java.lang.Boolean _compactMode)
  {
    compactMode = _compactMode;
  }

  private java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
  }

  /**
   * Customized TaskQuery
   */
  private java.lang.String jsonQuery;

  /**
   * Gets the field jsonQuery.
   * @return the value of the field jsonQuery; may be null.
   */
  public java.lang.String getJsonQuery()
  {
    return jsonQuery;
  }

  /**
   * Sets the field jsonQuery.
   * @param _jsonQuery the new value of the field jsonQuery.
   */
  public void setJsonQuery(java.lang.String _jsonQuery)
  {
    jsonQuery = _jsonQuery;
  }

  private java.lang.Boolean createMode;

  /**
   * Gets the field createMode.
   * @return the value of the field createMode; may be null.
   */
  public java.lang.Boolean getCreateMode()
  {
    return createMode;
  }

  /**
   * Sets the field createMode.
   * @param _createMode the new value of the field createMode.
   */
  public void setCreateMode(java.lang.Boolean _createMode)
  {
    createMode = _createMode;
  }

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

  private java.lang.Boolean isDrilldownElapsedTime;

  /**
   * Gets the field isDrilldownElapsedTime.
   * @return the value of the field isDrilldownElapsedTime; may be null.
   */
  public java.lang.Boolean getIsDrilldownElapsedTime()
  {
    return isDrilldownElapsedTime;
  }

  /**
   * Sets the field isDrilldownElapsedTime.
   * @param _isDrilldownElapsedTime the new value of the field isDrilldownElapsedTime.
   */
  public void setIsDrilldownElapsedTime(java.lang.Boolean _isDrilldownElapsedTime)
  {
    isDrilldownElapsedTime = _isDrilldownElapsedTime;
  }

  private java.lang.Boolean isDrilldownExpiryChart;

  /**
   * Gets the field isDrilldownExpiryChart.
   * @return the value of the field isDrilldownExpiryChart; may be null.
   */
  public java.lang.Boolean getIsDrilldownExpiryChart()
  {
    return isDrilldownExpiryChart;
  }

  /**
   * Sets the field isDrilldownExpiryChart.
   * @param _isDrilldownExpiryChart the new value of the field isDrilldownExpiryChart.
   */
  public void setIsDrilldownExpiryChart(java.lang.Boolean _isDrilldownExpiryChart)
  {
    isDrilldownExpiryChart = _isDrilldownExpiryChart;
  }

  private java.lang.Boolean isBackFromDrilldown;

  /**
   * Gets the field isBackFromDrilldown.
   * @return the value of the field isBackFromDrilldown; may be null.
   */
  public java.lang.Boolean getIsBackFromDrilldown()
  {
    return isBackFromDrilldown;
  }

  /**
   * Sets the field isBackFromDrilldown.
   * @param _isBackFromDrilldown the new value of the field isBackFromDrilldown.
   */
  public void setIsBackFromDrilldown(java.lang.Boolean _isBackFromDrilldown)
  {
    isBackFromDrilldown = _isBackFromDrilldown;
  }

  private java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> defaultCharts;

  /**
   * Gets the field defaultCharts.
   * @return the value of the field defaultCharts; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> getDefaultCharts()
  {
    return defaultCharts;
  }

  /**
   * Sets the field defaultCharts.
   * @param _defaultCharts the new value of the field defaultCharts.
   */
  public void setDefaultCharts(java.util.List<ch.ivy.addon.portalkit.statistics.StatisticChart> _defaultCharts)
  {
    defaultCharts = _defaultCharts;
  }

  /**
   * Check user has permission to creating new charts
   */
  private java.lang.Boolean canCreateNewCharts;

  /**
   * Gets the field canCreateNewCharts.
   * @return the value of the field canCreateNewCharts; may be null.
   */
  public java.lang.Boolean getCanCreateNewCharts()
  {
    return canCreateNewCharts;
  }

  /**
   * Sets the field canCreateNewCharts.
   * @param _canCreateNewCharts the new value of the field canCreateNewCharts.
   */
  public void setCanCreateNewCharts(java.lang.Boolean _canCreateNewCharts)
  {
    canCreateNewCharts = _canCreateNewCharts;
  }

  private java.lang.Boolean hasDefaultChart;

  /**
   * Gets the field hasDefaultChart.
   * @return the value of the field hasDefaultChart; may be null.
   */
  public java.lang.Boolean getHasDefaultChart()
  {
    return hasDefaultChart;
  }

  /**
   * Sets the field hasDefaultChart.
   * @param _hasDefaultChart the new value of the field hasDefaultChart.
   */
  public void setHasDefaultChart(java.lang.Boolean _hasDefaultChart)
  {
    hasDefaultChart = _hasDefaultChart;
  }

  /**
   * Check user has permission to analyzing task
   */
  private java.lang.Boolean canAnalyzeTask;

  /**
   * Gets the field canAnalyzeTask.
   * @return the value of the field canAnalyzeTask; may be null.
   */
  public java.lang.Boolean getCanAnalyzeTask()
  {
    return canAnalyzeTask;
  }

  /**
   * Sets the field canAnalyzeTask.
   * @param _canAnalyzeTask the new value of the field canAnalyzeTask.
   */
  public void setCanAnalyzeTask(java.lang.Boolean _canAnalyzeTask)
  {
    canAnalyzeTask = _canAnalyzeTask;
  }

  /**
   * Is show all chart link at home page
   */
  private java.lang.Boolean isDisplayShowAllChartLink;

  /**
   * Gets the field isDisplayShowAllChartLink.
   * @return the value of the field isDisplayShowAllChartLink; may be null.
   */
  public java.lang.Boolean getIsDisplayShowAllChartLink()
  {
    return isDisplayShowAllChartLink;
  }

  /**
   * Sets the field isDisplayShowAllChartLink.
   * @param _isDisplayShowAllChartLink the new value of the field isDisplayShowAllChartLink.
   */
  public void setIsDisplayShowAllChartLink(java.lang.Boolean _isDisplayShowAllChartLink)
  {
    isDisplayShowAllChartLink = _isDisplayShowAllChartLink;
  }

  private ch.ivy.addon.portalkit.statistics.StatisticColors chartColors;

  /**
   * Gets the field chartColors.
   * @return the value of the field chartColors; may be null.
   */
  public ch.ivy.addon.portalkit.statistics.StatisticColors getChartColors()
  {
    return chartColors;
  }

  /**
   * Sets the field chartColors.
   * @param _chartColors the new value of the field chartColors.
   */
  public void setChartColors(ch.ivy.addon.portalkit.statistics.StatisticColors _chartColors)
  {
    chartColors = _chartColors;
  }

}
