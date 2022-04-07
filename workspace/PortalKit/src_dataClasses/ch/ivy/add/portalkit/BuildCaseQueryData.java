package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class BuildCaseQueryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class BuildCaseQueryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1642809679819778936L;

  private transient ch.ivyteam.ivy.workflow.query.CaseQuery caseQuery;

  /**
   * Gets the field caseQuery.
   * @return the value of the field caseQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.CaseQuery getCaseQuery()
  {
    return caseQuery;
  }

  /**
   * Sets the field caseQuery.
   * @param _caseQuery the new value of the field caseQuery.
   */
  public void setCaseQuery(ch.ivyteam.ivy.workflow.query.CaseQuery _caseQuery)
  {
    caseQuery = _caseQuery;
  }

}
