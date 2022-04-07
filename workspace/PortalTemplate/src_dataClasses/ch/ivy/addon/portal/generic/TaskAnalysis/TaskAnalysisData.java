package ch.ivy.addon.portal.generic.TaskAnalysis;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskAnalysisData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskAnalysisData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6184274683516511798L;

  private ch.ivy.addon.portal.generic.view.TaskAnalysisView taskView;

  /**
   * Gets the field taskView.
   * @return the value of the field taskView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.TaskAnalysisView getTaskView()
  {
    return taskView;
  }

  /**
   * Sets the field taskView.
   * @param _taskView the new value of the field taskView.
   */
  public void setTaskView(ch.ivy.addon.portal.generic.view.TaskAnalysisView _taskView)
  {
    taskView = _taskView;
  }

}
