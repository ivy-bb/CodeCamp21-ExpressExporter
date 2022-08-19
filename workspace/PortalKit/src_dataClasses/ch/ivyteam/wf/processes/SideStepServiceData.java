package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SideStepServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SideStepServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2718114154157373006L;

  private transient java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySideStep> sideSteps;

  /**
   * Gets the field sideSteps.
   * @return the value of the field sideSteps; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySideStep> getSideSteps()
  {
    return sideSteps;
  }

  /**
   * Sets the field sideSteps.
   * @param _sideSteps the new value of the field sideSteps.
   */
  public void setSideSteps(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvySideStep> _sideSteps)
  {
    sideSteps = _sideSteps;
  }

  private transient ch.ivy.addon.portalkit.ivydata.searchcriteria.SideStepSearchCriteria sideStepSearchCriteria;

  /**
   * Gets the field sideStepSearchCriteria.
   * @return the value of the field sideStepSearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.SideStepSearchCriteria getSideStepSearchCriteria()
  {
    return sideStepSearchCriteria;
  }

  /**
   * Sets the field sideStepSearchCriteria.
   * @param _sideStepSearchCriteria the new value of the field sideStepSearchCriteria.
   */
  public void setSideStepSearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.SideStepSearchCriteria _sideStepSearchCriteria)
  {
    sideStepSearchCriteria = _sideStepSearchCriteria;
  }

}
