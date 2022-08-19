package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DeleteDocumentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeleteDocumentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4354045278355438600L;

  private transient ch.ivy.addon.portalkit.ivydata.bo.IvyDocument document;

  /**
   * Gets the field document.
   * @return the value of the field document; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyDocument getDocument()
  {
    return document;
  }

  /**
   * Sets the field document.
   * @param _document the new value of the field document.
   */
  public void setDocument(ch.ivy.addon.portalkit.ivydata.bo.IvyDocument _document)
  {
    document = _document;
  }

  private transient ch.ivyteam.ivy.workflow.ICase businessCase;

  /**
   * Gets the field businessCase.
   * @return the value of the field businessCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getBusinessCase()
  {
    return businessCase;
  }

  /**
   * Sets the field businessCase.
   * @param _businessCase the new value of the field businessCase.
   */
  public void setBusinessCase(ch.ivyteam.ivy.workflow.ICase _businessCase)
  {
    businessCase = _businessCase;
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
