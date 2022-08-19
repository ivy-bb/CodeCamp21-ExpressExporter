package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class UploadDocumentOverrideData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UploadDocumentOverrideData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1679667201430306552L;

  private transient ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus status;

  /**
   * Gets the field status.
   * @return the value of the field status; may be null.
   */
  public ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus getStatus()
  {
    return status;
  }

  /**
   * Sets the field status.
   * @param _status the new value of the field status.
   */
  public void setStatus(ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus _status)
  {
    status = _status;
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

  private transient org.primefaces.model.UploadedFile uploadedFile;

  /**
   * Gets the field uploadedFile.
   * @return the value of the field uploadedFile; may be null.
   */
  public org.primefaces.model.UploadedFile getUploadedFile()
  {
    return uploadedFile;
  }

  /**
   * Sets the field uploadedFile.
   * @param _uploadedFile the new value of the field uploadedFile.
   */
  public void setUploadedFile(org.primefaces.model.UploadedFile _uploadedFile)
  {
    uploadedFile = _uploadedFile;
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

  private transient ch.ivyteam.ivy.workflow.document.IDocument uploadedDocument;

  /**
   * Gets the field uploadedDocument.
   * @return the value of the field uploadedDocument; may be null.
   */
  public ch.ivyteam.ivy.workflow.document.IDocument getUploadedDocument()
  {
    return uploadedDocument;
  }

  /**
   * Sets the field uploadedDocument.
   * @param _uploadedDocument the new value of the field uploadedDocument.
   */
  public void setUploadedDocument(ch.ivyteam.ivy.workflow.document.IDocument _uploadedDocument)
  {
    uploadedDocument = _uploadedDocument;
  }

}
