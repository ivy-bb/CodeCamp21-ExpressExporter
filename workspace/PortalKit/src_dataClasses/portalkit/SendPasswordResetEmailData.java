package portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class SendPasswordResetEmailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SendPasswordResetEmailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2799841053706453907L;

  private transient java.lang.String email;

  /**
   * Gets the field email.
   * @return the value of the field email; may be null.
   */
  public java.lang.String getEmail()
  {
    return email;
  }

  /**
   * Sets the field email.
   * @param _email the new value of the field email.
   */
  public void setEmail(java.lang.String _email)
  {
    email = _email;
  }

  private transient ch.ivyteam.ivy.security.IUser user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivyteam.ivy.security.IUser _user)
  {
    user = _user;
  }

  private transient java.lang.String emailContent;

  /**
   * Gets the field emailContent.
   * @return the value of the field emailContent; may be null.
   */
  public java.lang.String getEmailContent()
  {
    return emailContent;
  }

  /**
   * Sets the field emailContent.
   * @param _emailContent the new value of the field emailContent.
   */
  public void setEmailContent(java.lang.String _emailContent)
  {
    emailContent = _emailContent;
  }

  private transient java.lang.Boolean isValid;

  /**
   * Gets the field isValid.
   * @return the value of the field isValid; may be null.
   */
  public java.lang.Boolean getIsValid()
  {
    return isValid;
  }

  /**
   * Sets the field isValid.
   * @param _isValid the new value of the field isValid.
   */
  public void setIsValid(java.lang.Boolean _isValid)
  {
    isValid = _isValid;
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

}
