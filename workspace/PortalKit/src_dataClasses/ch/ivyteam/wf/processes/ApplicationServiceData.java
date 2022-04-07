package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ApplicationServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ApplicationServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4939898497912594181L;

  private transient java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyApplication> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyApplication> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyApplication> _applications)
  {
    applications = _applications;
  }

  private transient java.util.List<java.lang.String> names;

  /**
   * Gets the field names.
   * @return the value of the field names; may be null.
   */
  public java.util.List<java.lang.String> getNames()
  {
    return names;
  }

  /**
   * Sets the field names.
   * @param _names the new value of the field names.
   */
  public void setNames(java.util.List<java.lang.String> _names)
  {
    names = _names;
  }

}
