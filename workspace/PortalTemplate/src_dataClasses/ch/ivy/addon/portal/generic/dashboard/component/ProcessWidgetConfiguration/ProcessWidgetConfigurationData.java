package ch.ivy.addon.portal.generic.dashboard.component.ProcessWidgetConfiguration;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ProcessWidgetConfigurationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessWidgetConfigurationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4971452825571566420L;

  private ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget taskWidget;

  /**
   * Gets the field taskWidget.
   * @return the value of the field taskWidget; may be null.
   */
  public ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget getTaskWidget()
  {
    return taskWidget;
  }

  /**
   * Sets the field taskWidget.
   * @param _taskWidget the new value of the field taskWidget.
   */
  public void setTaskWidget(ch.ivy.addon.portalkit.dto.dashboard.TaskDashboardWidget _taskWidget)
  {
    taskWidget = _taskWidget;
  }

  private java.lang.String widgetId;

  /**
   * Gets the field widgetId.
   * @return the value of the field widgetId; may be null.
   */
  public java.lang.String getWidgetId()
  {
    return widgetId;
  }

  /**
   * Sets the field widgetId.
   * @param _widgetId the new value of the field widgetId.
   */
  public void setWidgetId(java.lang.String _widgetId)
  {
    widgetId = _widgetId;
  }

}
