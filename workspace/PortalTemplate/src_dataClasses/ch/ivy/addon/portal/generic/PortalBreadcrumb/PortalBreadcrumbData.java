package ch.ivy.addon.portal.generic.PortalBreadcrumb;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class PortalBreadcrumbData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalBreadcrumbData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3312825138300555230L;

  private ch.ivyteam.ivy.workflow.ITask workingTask;

  /**
   * Gets the field workingTask.
   * @return the value of the field workingTask; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getWorkingTask()
  {
    return workingTask;
  }

  /**
   * Sets the field workingTask.
   * @param _workingTask the new value of the field workingTask.
   */
  public void setWorkingTask(ch.ivyteam.ivy.workflow.ITask _workingTask)
  {
    workingTask = _workingTask;
  }

  private java.lang.String linkToNavigateWhenLeaveTask;

  /**
   * Gets the field linkToNavigateWhenLeaveTask.
   * @return the value of the field linkToNavigateWhenLeaveTask; may be null.
   */
  public java.lang.String getLinkToNavigateWhenLeaveTask()
  {
    return linkToNavigateWhenLeaveTask;
  }

  /**
   * Sets the field linkToNavigateWhenLeaveTask.
   * @param _linkToNavigateWhenLeaveTask the new value of the field linkToNavigateWhenLeaveTask.
   */
  public void setLinkToNavigateWhenLeaveTask(java.lang.String _linkToNavigateWhenLeaveTask)
  {
    linkToNavigateWhenLeaveTask = _linkToNavigateWhenLeaveTask;
  }

  private java.lang.Boolean isWorkingOnATask;

  /**
   * Gets the field isWorkingOnATask.
   * @return the value of the field isWorkingOnATask; may be null.
   */
  public java.lang.Boolean getIsWorkingOnATask()
  {
    return isWorkingOnATask;
  }

  /**
   * Sets the field isWorkingOnATask.
   * @param _isWorkingOnATask the new value of the field isWorkingOnATask.
   */
  public void setIsWorkingOnATask(java.lang.Boolean _isWorkingOnATask)
  {
    isWorkingOnATask = _isWorkingOnATask;
  }

}
