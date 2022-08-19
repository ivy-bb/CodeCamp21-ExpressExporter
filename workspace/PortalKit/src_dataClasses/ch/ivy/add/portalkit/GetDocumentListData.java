package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class GetDocumentListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class GetDocumentListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2662371678747798883L;

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

  private transient java.util.List<ch.ivy.addon.portalkit.ivydata.bo.IvyDocument> documents;

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

}
