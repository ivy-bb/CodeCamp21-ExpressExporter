package ch.ivy.addon.portalkit.component.TaskItemDocuments;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemDocumentsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemDocumentsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2689068921722008690L;

  private ch.ivy.addon.portalkit.ivydata.bo.IvyDocument document;

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

  private javax.activation.DataHandler documentContent;

  /**
   * Gets the field documentContent.
   * @return the value of the field documentContent; may be null.
   */
  public javax.activation.DataHandler getDocumentContent()
  {
    return documentContent;
  }

  /**
   * Sets the field documentContent.
   * @param _documentContent the new value of the field documentContent.
   */
  public void setDocumentContent(javax.activation.DataHandler _documentContent)
  {
    documentContent = _documentContent;
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

  private java.lang.Long documentId;

  /**
   * Gets the field documentId.
   * @return the value of the field documentId; may be null.
   */
  public java.lang.Long getDocumentId()
  {
    return documentId;
  }

  /**
   * Sets the field documentId.
   * @param _documentId the new value of the field documentId.
   */
  public void setDocumentId(java.lang.Long _documentId)
  {
    documentId = _documentId;
  }

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

  private org.primefaces.event.FileUploadEvent documentUploadEvent;

  /**
   * Gets the field documentUploadEvent.
   * @return the value of the field documentUploadEvent; may be null.
   */
  public org.primefaces.event.FileUploadEvent getDocumentUploadEvent()
  {
    return documentUploadEvent;
  }

  /**
   * Sets the field documentUploadEvent.
   * @param _documentUploadEvent the new value of the field documentUploadEvent.
   */
  public void setDocumentUploadEvent(org.primefaces.event.FileUploadEvent _documentUploadEvent)
  {
    documentUploadEvent = _documentUploadEvent;
  }

  private java.lang.Boolean isHideUploadDocumentForDoneCase;

  /**
   * Gets the field isHideUploadDocumentForDoneCase.
   * @return the value of the field isHideUploadDocumentForDoneCase; may be null.
   */
  public java.lang.Boolean getIsHideUploadDocumentForDoneCase()
  {
    return isHideUploadDocumentForDoneCase;
  }

  /**
   * Sets the field isHideUploadDocumentForDoneCase.
   * @param _isHideUploadDocumentForDoneCase the new value of the field isHideUploadDocumentForDoneCase.
   */
  public void setIsHideUploadDocumentForDoneCase(java.lang.Boolean _isHideUploadDocumentForDoneCase)
  {
    isHideUploadDocumentForDoneCase = _isHideUploadDocumentForDoneCase;
  }

  private java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private ch.ivyteam.ivy.workflow.ITask task;

  /**
   * Gets the field task.
   * @return the value of the field task; may be null.
   */
  public ch.ivyteam.ivy.workflow.ITask getTask()
  {
    return task;
  }

  /**
   * Sets the field task.
   * @param _task the new value of the field task.
   */
  public void setTask(ch.ivyteam.ivy.workflow.ITask _task)
  {
    task = _task;
  }

  private java.lang.String uploadDocumentCheckMessage;

  /**
   * Gets the field uploadDocumentCheckMessage.
   * @return the value of the field uploadDocumentCheckMessage; may be null.
   */
  public java.lang.String getUploadDocumentCheckMessage()
  {
    return uploadDocumentCheckMessage;
  }

  /**
   * Sets the field uploadDocumentCheckMessage.
   * @param _uploadDocumentCheckMessage the new value of the field uploadDocumentCheckMessage.
   */
  public void setUploadDocumentCheckMessage(java.lang.String _uploadDocumentCheckMessage)
  {
    uploadDocumentCheckMessage = _uploadDocumentCheckMessage;
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

  private ch.ivyteam.ivy.workflow.ICase businessCase;

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

  private java.lang.String deleteDocumentMessage;

  /**
   * Gets the field deleteDocumentMessage.
   * @return the value of the field deleteDocumentMessage; may be null.
   */
  public java.lang.String getDeleteDocumentMessage()
  {
    return deleteDocumentMessage;
  }

  /**
   * Sets the field deleteDocumentMessage.
   * @param _deleteDocumentMessage the new value of the field deleteDocumentMessage.
   */
  public void setDeleteDocumentMessage(java.lang.String _deleteDocumentMessage)
  {
    deleteDocumentMessage = _deleteDocumentMessage;
  }

}
