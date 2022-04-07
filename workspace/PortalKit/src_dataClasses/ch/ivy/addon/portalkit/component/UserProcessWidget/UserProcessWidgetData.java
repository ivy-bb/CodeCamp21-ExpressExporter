package ch.ivy.addon.portalkit.component.UserProcessWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UserProcessWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserProcessWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4317262981465402414L;

  private java.util.List<ch.ivy.addon.portalkit.configuration.UserProcess> userProcesses;

  /**
   * Gets the field userProcesses.
   * @return the value of the field userProcesses; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.configuration.UserProcess> getUserProcesses()
  {
    return userProcesses;
  }

  /**
   * Sets the field userProcesses.
   * @param _userProcesses the new value of the field userProcesses.
   */
  public void setUserProcesses(java.util.List<ch.ivy.addon.portalkit.configuration.UserProcess> _userProcesses)
  {
    userProcesses = _userProcesses;
  }

}
