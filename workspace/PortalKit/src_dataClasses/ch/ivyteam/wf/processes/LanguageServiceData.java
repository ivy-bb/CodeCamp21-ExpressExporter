package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class LanguageServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LanguageServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2561391122170680152L;

  private transient ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage language;

  /**
   * Gets the field language.
   * @return the value of the field language; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage getLanguage()
  {
    return language;
  }

  /**
   * Sets the field language.
   * @param _language the new value of the field language.
   */
  public void setLanguage(ch.ivy.addon.portalkit.ivydata.bo.IvyLanguage _language)
  {
    language = _language;
  }

}
