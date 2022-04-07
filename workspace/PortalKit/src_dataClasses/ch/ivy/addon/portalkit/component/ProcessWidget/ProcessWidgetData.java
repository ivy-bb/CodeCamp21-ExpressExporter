package ch.ivy.addon.portalkit.component.ProcessWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ProcessWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2969848156977183081L;

  private java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> processes;

  /**
   * Gets the field processes.
   * @return the value of the field processes; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> getProcesses()
  {
    return processes;
  }

  /**
   * Sets the field processes.
   * @param _processes the new value of the field processes.
   */
  public void setProcesses(java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> _processes)
  {
    processes = _processes;
  }

  private java.util.List<ch.ivy.addon.portalkit.bo.ExpressProcess> expressProcesses;

  /**
   * Gets the field expressProcesses.
   * @return the value of the field expressProcesses; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.ExpressProcess> getExpressProcesses()
  {
    return expressProcesses;
  }

  /**
   * Sets the field expressProcesses.
   * @param _expressProcesses the new value of the field expressProcesses.
   */
  public void setExpressProcesses(java.util.List<ch.ivy.addon.portalkit.bo.ExpressProcess> _expressProcesses)
  {
    expressProcesses = _expressProcesses;
  }

  private java.lang.Boolean showInformationLink;

  /**
   * Gets the field showInformationLink.
   * @return the value of the field showInformationLink; may be null.
   */
  public java.lang.Boolean getShowInformationLink()
  {
    return showInformationLink;
  }

  /**
   * Sets the field showInformationLink.
   * @param _showInformationLink the new value of the field showInformationLink.
   */
  public void setShowInformationLink(java.lang.Boolean _showInformationLink)
  {
    showInformationLink = _showInformationLink;
  }

}
