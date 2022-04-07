package ch.ivy.addon.portal.generic.dashboard.component.CustomWidgetConfiguration;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CustomWidgetConfigurationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CustomWidgetConfigurationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8474854379281116107L;

  private ch.ivy.addon.portalkit.dto.UserDTO user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivy.addon.portalkit.dto.UserDTO _user)
  {
    user = _user;
  }

}
