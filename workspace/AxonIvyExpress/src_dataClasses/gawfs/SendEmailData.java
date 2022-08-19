package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SendEmailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SendEmailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -693088777421743934L;

  private transient ch.ivyteam.ivy.components.config.EmailConfiguration emailConfig;

  /**
   * Gets the field emailConfig.
   * @return the value of the field emailConfig; may be null.
   */
  public ch.ivyteam.ivy.components.config.EmailConfiguration getEmailConfig()
  {
    return emailConfig;
  }

  /**
   * Sets the field emailConfig.
   * @param _emailConfig the new value of the field emailConfig.
   */
  public void setEmailConfig(ch.ivyteam.ivy.components.config.EmailConfiguration _emailConfig)
  {
    emailConfig = _emailConfig;
  }

  private transient java.util.List<ch.ivyteam.ivy.scripting.objects.File> attachmentFiles;

  /**
   * Gets the field attachmentFiles.
   * @return the value of the field attachmentFiles; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.scripting.objects.File> getAttachmentFiles()
  {
    return attachmentFiles;
  }

  /**
   * Sets the field attachmentFiles.
   * @param _attachmentFiles the new value of the field attachmentFiles.
   */
  public void setAttachmentFiles(java.util.List<ch.ivyteam.ivy.scripting.objects.File> _attachmentFiles)
  {
    attachmentFiles = _attachmentFiles;
  }

}
