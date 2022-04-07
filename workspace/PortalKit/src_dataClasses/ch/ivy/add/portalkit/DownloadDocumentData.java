package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class DownloadDocumentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DownloadDocumentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4664609162001205229L;

  private transient org.primefaces.model.StreamedContent streamedContent;

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

}
