package ch.ivy.addon.portalkit.component.CompactProcessWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CompactProcessWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CompactProcessWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5397444477569939250L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.UserProcess> userProcesses;

  /**
   * Gets the field userProcesses.
   * @return the value of the field userProcesses; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.UserProcess> getUserProcesses()
  {
    return userProcesses;
  }

  /**
   * Sets the field userProcesses.
   * @param _userProcesses the new value of the field userProcesses.
   */
  public void setUserProcesses(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.configuration.UserProcess> _userProcesses)
  {
    userProcesses = _userProcesses;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> displayNames;

  /**
   * Gets the field displayNames.
   * @return the value of the field displayNames; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> getDisplayNames()
  {
    return displayNames;
  }

  /**
   * Sets the field displayNames.
   * @param _displayNames the new value of the field displayNames.
   */
  public void setDisplayNames(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.dto.DisplayName> _displayNames)
  {
    displayNames = _displayNames;
  }

  private java.lang.Boolean canAddLanguages;

  /**
   * Gets the field canAddLanguages.
   * @return the value of the field canAddLanguages; may be null.
   */
  public java.lang.Boolean getCanAddLanguages()
  {
    return canAddLanguages;
  }

  /**
   * Sets the field canAddLanguages.
   * @param _canAddLanguages the new value of the field canAddLanguages.
   */
  public void setCanAddLanguages(java.lang.Boolean _canAddLanguages)
  {
    canAddLanguages = _canAddLanguages;
  }

}
