package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class EmailSettingServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EmailSettingServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 695625909358902816L;

  private transient ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting ivyEmailSetting;

  /**
   * Gets the field ivyEmailSetting.
   * @return the value of the field ivyEmailSetting; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting getIvyEmailSetting()
  {
    return ivyEmailSetting;
  }

  /**
   * Sets the field ivyEmailSetting.
   * @param _ivyEmailSetting the new value of the field ivyEmailSetting.
   */
  public void setIvyEmailSetting(ch.ivy.addon.portalkit.ivydata.bo.IvyEmailSetting _ivyEmailSetting)
  {
    ivyEmailSetting = _ivyEmailSetting;
  }

}
