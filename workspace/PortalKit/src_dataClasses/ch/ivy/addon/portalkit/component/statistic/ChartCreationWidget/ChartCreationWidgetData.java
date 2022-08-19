package ch.ivy.addon.portalkit.component.statistic.ChartCreationWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ChartCreationWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ChartCreationWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 410356650812853664L;

  private ch.ivy.addon.portalkit.statistics.StatisticFilter statisticFilter;

  /**
   * Gets the field statisticFilter.
   * @return the value of the field statisticFilter; may be null.
   */
  public ch.ivy.addon.portalkit.statistics.StatisticFilter getStatisticFilter()
  {
    return statisticFilter;
  }

  /**
   * Sets the field statisticFilter.
   * @param _statisticFilter the new value of the field statisticFilter.
   */
  public void setStatisticFilter(ch.ivy.addon.portalkit.statistics.StatisticFilter _statisticFilter)
  {
    statisticFilter = _statisticFilter;
  }

  private ch.ivy.addon.portalkit.enums.StatisticChartType chartType;

  /**
   * Gets the field chartType.
   * @return the value of the field chartType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.StatisticChartType getChartType()
  {
    return chartType;
  }

  /**
   * Sets the field chartType.
   * @param _chartType the new value of the field chartType.
   */
  public void setChartType(ch.ivy.addon.portalkit.enums.StatisticChartType _chartType)
  {
    chartType = _chartType;
  }

  private java.lang.Boolean isChartNameExisted;

  /**
   * Gets the field isChartNameExisted.
   * @return the value of the field isChartNameExisted; may be null.
   */
  public java.lang.Boolean getIsChartNameExisted()
  {
    return isChartNameExisted;
  }

  /**
   * Sets the field isChartNameExisted.
   * @param _isChartNameExisted the new value of the field isChartNameExisted.
   */
  public void setIsChartNameExisted(java.lang.Boolean _isChartNameExisted)
  {
    isChartNameExisted = _isChartNameExisted;
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

  private java.lang.Boolean isAllowedToCreateChart;

  /**
   * Gets the field isAllowedToCreateChart.
   * @return the value of the field isAllowedToCreateChart; may be null.
   */
  public java.lang.Boolean getIsAllowedToCreateChart()
  {
    return isAllowedToCreateChart;
  }

  /**
   * Sets the field isAllowedToCreateChart.
   * @param _isAllowedToCreateChart the new value of the field isAllowedToCreateChart.
   */
  public void setIsAllowedToCreateChart(java.lang.Boolean _isAllowedToCreateChart)
  {
    isAllowedToCreateChart = _isAllowedToCreateChart;
  }

  private ch.ivy.addon.portalkit.statistics.StatisticFilter oldStatisticFilter;

  /**
   * Gets the field oldStatisticFilter.
   * @return the value of the field oldStatisticFilter; may be null.
   */
  public ch.ivy.addon.portalkit.statistics.StatisticFilter getOldStatisticFilter()
  {
    return oldStatisticFilter;
  }

  /**
   * Sets the field oldStatisticFilter.
   * @param _oldStatisticFilter the new value of the field oldStatisticFilter.
   */
  public void setOldStatisticFilter(ch.ivy.addon.portalkit.statistics.StatisticFilter _oldStatisticFilter)
  {
    oldStatisticFilter = _oldStatisticFilter;
  }

  private java.util.List<java.lang.String> customFields;

  /**
   * Gets the field customFields.
   * @return the value of the field customFields; may be null.
   */
  public java.util.List<java.lang.String> getCustomFields()
  {
    return customFields;
  }

  /**
   * Sets the field customFields.
   * @param _customFields the new value of the field customFields.
   */
  public void setCustomFields(java.util.List<java.lang.String> _customFields)
  {
    customFields = _customFields;
  }

  private java.util.List<ch.ivy.addon.portalkit.dto.DisplayName> chartNames;

  /**
   * Gets the field chartNames.
   * @return the value of the field chartNames; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.dto.DisplayName> getChartNames()
  {
    return chartNames;
  }

  /**
   * Sets the field chartNames.
   * @param _chartNames the new value of the field chartNames.
   */
  public void setChartNames(java.util.List<ch.ivy.addon.portalkit.dto.DisplayName> _chartNames)
  {
    chartNames = _chartNames;
  }

  private java.lang.Boolean isDefaultApplicationLanguage;

  /**
   * Gets the field isDefaultApplicationLanguage.
   * @return the value of the field isDefaultApplicationLanguage; may be null.
   */
  public java.lang.Boolean getIsDefaultApplicationLanguage()
  {
    return isDefaultApplicationLanguage;
  }

  /**
   * Sets the field isDefaultApplicationLanguage.
   * @param _isDefaultApplicationLanguage the new value of the field isDefaultApplicationLanguage.
   */
  public void setIsDefaultApplicationLanguage(java.lang.Boolean _isDefaultApplicationLanguage)
  {
    isDefaultApplicationLanguage = _isDefaultApplicationLanguage;
  }

  private java.lang.String language;

  /**
   * Gets the field language.
   * @return the value of the field language; may be null.
   */
  public java.lang.String getLanguage()
  {
    return language;
  }

  /**
   * Sets the field language.
   * @param _language the new value of the field language.
   */
  public void setLanguage(java.lang.String _language)
  {
    language = _language;
  }

}
