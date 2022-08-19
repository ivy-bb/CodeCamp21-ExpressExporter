package ch.ivy.addon.portal.component.ProcessInformation;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ProcessInformationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessInformationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4080661536803353072L;

  private java.util.List<ch.ivy.addon.portalkit.bo.ProcessStep> processSteps;

  /**
   * Gets the field processSteps.
   * @return the value of the field processSteps; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.bo.ProcessStep> getProcessSteps()
  {
    return processSteps;
  }

  /**
   * Sets the field processSteps.
   * @param _processSteps the new value of the field processSteps.
   */
  public void setProcessSteps(java.util.List<ch.ivy.addon.portalkit.bo.ProcessStep> _processSteps)
  {
    processSteps = _processSteps;
  }

  private java.lang.String processId;

  /**
   * Gets the field processId.
   * @return the value of the field processId; may be null.
   */
  public java.lang.String getProcessId()
  {
    return processId;
  }

  /**
   * Sets the field processId.
   * @param _processId the new value of the field processId.
   */
  public void setProcessId(java.lang.String _processId)
  {
    processId = _processId;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> userProcesses;

  /**
   * Gets the field userProcesses.
   * @return the value of the field userProcesses; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> getUserProcesses()
  {
    return userProcesses;
  }

  /**
   * Sets the field userProcesses.
   * @param _userProcesses the new value of the field userProcesses.
   */
  public void setUserProcesses(java.util.List<ch.ivyteam.ivy.workflow.start.IWebStartable> _userProcesses)
  {
    userProcesses = _userProcesses;
  }

  private ch.ivy.addon.portalkit.configuration.UserProcess selectedProcess;

  /**
   * Gets the field selectedProcess.
   * @return the value of the field selectedProcess; may be null.
   */
  public ch.ivy.addon.portalkit.configuration.UserProcess getSelectedProcess()
  {
    return selectedProcess;
  }

  /**
   * Sets the field selectedProcess.
   * @param _selectedProcess the new value of the field selectedProcess.
   */
  public void setSelectedProcess(ch.ivy.addon.portalkit.configuration.UserProcess _selectedProcess)
  {
    selectedProcess = _selectedProcess;
  }

}
