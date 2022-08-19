package ch.ivy.addon.portalkit.component.document.DocumentTable;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DocumentTableData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DocumentTableData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3715133921009392787L;

  private java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyDocument> documents;

  /**
   * Gets the field documents.
   * @return the value of the field documents; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyDocument> getDocuments()
  {
    return documents;
  }

  /**
   * Sets the field documents.
   * @param _documents the new value of the field documents.
   */
  public void setDocuments(java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyDocument> _documents)
  {
    documents = _documents;
  }

  private org.primefaces.event.FileUploadEvent event;

  /**
   * Gets the field event.
   * @return the value of the field event; may be null.
   */
  public org.primefaces.event.FileUploadEvent getEvent()
  {
    return event;
  }

  /**
   * Sets the field event.
   * @param _event the new value of the field event.
   */
  public void setEvent(org.primefaces.event.FileUploadEvent _event)
  {
    event = _event;
  }

  private java.lang.Integer fileLimit;

  /**
   * Gets the field fileLimit.
   * @return the value of the field fileLimit; may be null.
   */
  public java.lang.Integer getFileLimit()
  {
    return fileLimit;
  }

  /**
   * Sets the field fileLimit.
   * @param _fileLimit the new value of the field fileLimit.
   */
  public void setFileLimit(java.lang.Integer _fileLimit)
  {
    fileLimit = _fileLimit;
  }

  private ch.ivyteam.ivy.workflow.ICase ivyCase;

  /**
   * Gets the field ivyCase.
   * @return the value of the field ivyCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getIvyCase()
  {
    return ivyCase;
  }

  /**
   * Sets the field ivyCase.
   * @param _ivyCase the new value of the field ivyCase.
   */
  public void setIvyCase(ch.ivyteam.ivy.workflow.ICase _ivyCase)
  {
    ivyCase = _ivyCase;
  }

  private java.lang.String message;

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

  private java.lang.String messageComponentId;

  /**
   * Gets the field messageComponentId.
   * @return the value of the field messageComponentId; may be null.
   */
  public java.lang.String getMessageComponentId()
  {
    return messageComponentId;
  }

  /**
   * Sets the field messageComponentId.
   * @param _messageComponentId the new value of the field messageComponentId.
   */
  public void setMessageComponentId(java.lang.String _messageComponentId)
  {
    messageComponentId = _messageComponentId;
  }

  private ch.ivy.addon.portalkit.ivydata.bo.IvyDocument selectedDocument;

  /**
   * Gets the field selectedDocument.
   * @return the value of the field selectedDocument; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyDocument getSelectedDocument()
  {
    return selectedDocument;
  }

  /**
   * Sets the field selectedDocument.
   * @param _selectedDocument the new value of the field selectedDocument.
   */
  public void setSelectedDocument(ch.ivy.addon.portalkit.ivydata.bo.IvyDocument _selectedDocument)
  {
    selectedDocument = _selectedDocument;
  }

  private org.primefaces.model.StreamedContent streamedContent;

  /**
   * Gets the field streamedContent.
   * @return the value of the field streamedContent; may be null.
   */
  public org.primefaces.model.StreamedContent getStreamedContent()
  {
    return streamedContent;
  }

  /**
   * Sets the field streamedContent.
   * @param _streamedContent the new value of the field streamedContent.
   */
  public void setStreamedContent(org.primefaces.model.StreamedContent _streamedContent)
  {
    streamedContent = _streamedContent;
  }

  private java.lang.Boolean typeColumnRendered;

  /**
   * Gets the field typeColumnRendered.
   * @return the value of the field typeColumnRendered; may be null.
   */
  public java.lang.Boolean getTypeColumnRendered()
  {
    return typeColumnRendered;
  }

  /**
   * Sets the field typeColumnRendered.
   * @param _typeColumnRendered the new value of the field typeColumnRendered.
   */
  public void setTypeColumnRendered(java.lang.Boolean _typeColumnRendered)
  {
    typeColumnRendered = _typeColumnRendered;
  }

  private ch.ivy.addon.portalkit.enums.DocumentType typeSelection;

  /**
   * Gets the field typeSelection.
   * @return the value of the field typeSelection; may be null.
   */
  public ch.ivy.addon.portalkit.enums.DocumentType getTypeSelection()
  {
    return typeSelection;
  }

  /**
   * Sets the field typeSelection.
   * @param _typeSelection the new value of the field typeSelection.
   */
  public void setTypeSelection(ch.ivy.addon.portalkit.enums.DocumentType _typeSelection)
  {
    typeSelection = _typeSelection;
  }

  private ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus uploadDocumentCheckStatus;

  /**
   * Gets the field uploadDocumentCheckStatus.
   * @return the value of the field uploadDocumentCheckStatus; may be null.
   */
  public ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus getUploadDocumentCheckStatus()
  {
    return uploadDocumentCheckStatus;
  }

  /**
   * Sets the field uploadDocumentCheckStatus.
   * @param _uploadDocumentCheckStatus the new value of the field uploadDocumentCheckStatus.
   */
  public void setUploadDocumentCheckStatus(ch.ivy.addon.portalkit.enums.UploadDocumentCheckStatus _uploadDocumentCheckStatus)
  {
    uploadDocumentCheckStatus = _uploadDocumentCheckStatus;
  }

  private ch.ivyteam.ivy.workflow.document.IDocument uploadedDocument;

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
