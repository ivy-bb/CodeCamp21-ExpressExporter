package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ChangePasswordData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ChangePasswordData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5043365940654622455L;

  private transient java.lang.String currentPassword;

  /**
   * Gets the field currentPassword.
   * @return the value of the field currentPassword; may be null.
   */
  public java.lang.String getCurrentPassword()
  {
    return currentPassword;
  }

  /**
   * Sets the field currentPassword.
   * @param _currentPassword the new value of the field currentPassword.
   */
  public void setCurrentPassword(java.lang.String _currentPassword)
  {
    currentPassword = _currentPassword;
  }

  private transient java.lang.Boolean isCurrentPasswordCorrect;

  /**
   * Gets the field isCurrentPasswordCorrect.
   * @return the value of the field isCurrentPasswordCorrect; may be null.
   */
  public java.lang.Boolean getIsCurrentPasswordCorrect()
  {
    return isCurrentPasswordCorrect;
  }

  /**
   * Sets the field isCurrentPasswordCorrect.
   * @param _isCurrentPasswordCorrect the new value of the field isCurrentPasswordCorrect.
   */
  public void setIsCurrentPasswordCorrect(java.lang.Boolean _isCurrentPasswordCorrect)
  {
    isCurrentPasswordCorrect = _isCurrentPasswordCorrect;
  }

  private transient java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private transient java.lang.String newPassword;

  /**
   * Gets the field newPassword.
   * @return the value of the field newPassword; may be null.
   */
  public java.lang.String getNewPassword()
  {
    return newPassword;
  }

  /**
   * Sets the field newPassword.
   * @param _newPassword the new value of the field newPassword.
   */
  public void setNewPassword(java.lang.String _newPassword)
  {
    newPassword = _newPassword;
  }

  private transient ch.ivy.addon.portalkit.enums.ChangePasswordStatus status;

  /**
   * Gets the field status.
   * @return the value of the field status; may be null.
   */
  public ch.ivy.addon.portalkit.enums.ChangePasswordStatus getStatus()
  {
    return status;
  }

  /**
   * Sets the field status.
   * @param _status the new value of the field status.
   */
  public void setStatus(ch.ivy.addon.portalkit.enums.ChangePasswordStatus _status)
  {
    status = _status;
  }

  private transient java.lang.Boolean result;

  /**
   * Gets the field result.
   * @return the value of the field result; may be null.
   */
  public java.lang.Boolean getResult()
  {
    return result;
  }

  /**
   * Sets the field result.
   * @param _result the new value of the field result.
   */
  public void setResult(java.lang.Boolean _result)
  {
    result = _result;
  }

}
