package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class BuildTaskQueryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class BuildTaskQueryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3699446069333068872L;

  private transient ch.ivyteam.ivy.workflow.query.TaskQuery taskQuery;

  /**
   * Gets the field taskQuery.
   * @return the value of the field taskQuery; may be null.
   */
  public ch.ivyteam.ivy.workflow.query.TaskQuery getTaskQuery()
  {
    return taskQuery;
  }

  /**
   * Sets the field taskQuery.
   * @param _taskQuery the new value of the field taskQuery.
   */
  public void setTaskQuery(ch.ivyteam.ivy.workflow.query.TaskQuery _taskQuery)
  {
    taskQuery = _taskQuery;
  }

  private transient java.lang.Boolean isQueryForHomePage;

  /**
   * Gets the field isQueryForHomePage.
   * @return the value of the field isQueryForHomePage; may be null.
   */
  public java.lang.Boolean getIsQueryForHomePage()
  {
    return isQueryForHomePage;
  }

  /**
   * Sets the field isQueryForHomePage.
   * @param _isQueryForHomePage the new value of the field isQueryForHomePage.
   */
  public void setIsQueryForHomePage(java.lang.Boolean _isQueryForHomePage)
  {
    isQueryForHomePage = _isQueryForHomePage;
  }

}
