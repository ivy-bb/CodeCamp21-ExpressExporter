package ch.ivy.addon.portalkit.component.CaseItemRelatedCases;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseItemRelatedCasesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseItemRelatedCasesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7025076712874483267L;

  private ch.ivyteam.ivy.workflow.ICase iCase;

  /**
   * Gets the field iCase.
   * @return the value of the field iCase; may be null.
   */
  public ch.ivyteam.ivy.workflow.ICase getICase()
  {
    return iCase;
  }

  /**
   * Sets the field iCase.
   * @param _iCase the new value of the field iCase.
   */
  public void setICase(ch.ivyteam.ivy.workflow.ICase _iCase)
  {
    iCase = _iCase;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ICase> relatedCases;

  /**
   * Gets the field relatedCases.
   * @return the value of the field relatedCases; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ICase> getRelatedCases()
  {
    return relatedCases;
  }

  /**
   * Sets the field relatedCases.
   * @param _relatedCases the new value of the field relatedCases.
   */
  public void setRelatedCases(java.util.List<ch.ivyteam.ivy.workflow.ICase> _relatedCases)
  {
    relatedCases = _relatedCases;
  }

  private java.lang.Boolean isTaskFinished;

  /**
   * Gets the field isTaskFinished.
   * @return the value of the field isTaskFinished; may be null.
   */
  public java.lang.Boolean getIsTaskFinished()
  {
    return isTaskFinished;
  }

  /**
   * Sets the field isTaskFinished.
   * @param _isTaskFinished the new value of the field isTaskFinished.
   */
  public void setIsTaskFinished(java.lang.Boolean _isTaskFinished)
  {
    isTaskFinished = _isTaskFinished;
  }

  private java.lang.Boolean isWorkingOnTask;

  /**
   * Gets the field isWorkingOnTask.
   * @return the value of the field isWorkingOnTask; may be null.
   */
  public java.lang.Boolean getIsWorkingOnTask()
  {
    return isWorkingOnTask;
  }

  /**
   * Sets the field isWorkingOnTask.
   * @param _isWorkingOnTask the new value of the field isWorkingOnTask.
   */
  public void setIsWorkingOnTask(java.lang.Boolean _isWorkingOnTask)
  {
    isWorkingOnTask = _isWorkingOnTask;
  }

  private java.lang.Boolean inFrame;

  /**
   * Gets the field inFrame.
   * @return the value of the field inFrame; may be null.
   */
  public java.lang.Boolean getInFrame()
  {
    return inFrame;
  }

  /**
   * Sets the field inFrame.
   * @param _inFrame the new value of the field inFrame.
   */
  public void setInFrame(java.lang.Boolean _inFrame)
  {
    inFrame = _inFrame;
  }

  private ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria caseSearchCriteria;

  /**
   * Gets the field caseSearchCriteria.
   * @return the value of the field caseSearchCriteria; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria getCaseSearchCriteria()
  {
    return caseSearchCriteria;
  }

  /**
   * Sets the field caseSearchCriteria.
   * @param _caseSearchCriteria the new value of the field caseSearchCriteria.
   */
  public void setCaseSearchCriteria(ch.ivy.addon.portalkit.ivydata.searchcriteria.CaseSearchCriteria _caseSearchCriteria)
  {
    caseSearchCriteria = _caseSearchCriteria;
  }

  private java.lang.Integer startIndex;

  /**
   * Gets the field startIndex.
   * @return the value of the field startIndex; may be null.
   */
  public java.lang.Integer getStartIndex()
  {
    return startIndex;
  }

  /**
   * Sets the field startIndex.
   * @param _startIndex the new value of the field startIndex.
   */
  public void setStartIndex(java.lang.Integer _startIndex)
  {
    startIndex = _startIndex;
  }

  private java.lang.Integer count;

  /**
   * Gets the field count.
   * @return the value of the field count; may be null.
   */
  public java.lang.Integer getCount()
  {
    return count;
  }

  /**
   * Sets the field count.
   * @param _count the new value of the field count.
   */
  public void setCount(java.lang.Integer _count)
  {
    count = _count;
  }

  private java.lang.Long totalCases;

  /**
   * Gets the field totalCases.
   * @return the value of the field totalCases; may be null.
   */
  public java.lang.Long getTotalCases()
  {
    return totalCases;
  }

  /**
   * Sets the field totalCases.
   * @param _totalCases the new value of the field totalCases.
   */
  public void setTotalCases(java.lang.Long _totalCases)
  {
    totalCases = _totalCases;
  }

  private ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel caseLazyDataModel;

  /**
   * Gets the field caseLazyDataModel.
   * @return the value of the field caseLazyDataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel getCaseLazyDataModel()
  {
    return caseLazyDataModel;
  }

  /**
   * Sets the field caseLazyDataModel.
   * @param _caseLazyDataModel the new value of the field caseLazyDataModel.
   */
  public void setCaseLazyDataModel(ch.ivy.addon.portalkit.datamodel.internal.RelatedCaseLazyDataModel _caseLazyDataModel)
  {
    caseLazyDataModel = _caseLazyDataModel;
  }

  private org.primefaces.model.StreamedContent exportedFile;

  /**
   * Gets the field exportedFile.
   * @return the value of the field exportedFile; may be null.
   */
  public org.primefaces.model.StreamedContent getExportedFile()
  {
    return exportedFile;
  }

  /**
   * Sets the field exportedFile.
   * @param _exportedFile the new value of the field exportedFile.
   */
  public void setExportedFile(org.primefaces.model.StreamedContent _exportedFile)
  {
    exportedFile = _exportedFile;
  }

  private java.util.List<java.lang.String> columnsVisibility;

  /**
   * Gets the field columnsVisibility.
   * @return the value of the field columnsVisibility; may be null.
   */
  public java.util.List<java.lang.String> getColumnsVisibility()
  {
    return columnsVisibility;
  }

  /**
   * Sets the field columnsVisibility.
   * @param _columnsVisibility the new value of the field columnsVisibility.
   */
  public void setColumnsVisibility(java.util.List<java.lang.String> _columnsVisibility)
  {
    columnsVisibility = _columnsVisibility;
  }

  private java.lang.Integer loopCounter;

  /**
   * Gets the field loopCounter.
   * @return the value of the field loopCounter; may be null.
   */
  public java.lang.Integer getLoopCounter()
  {
    return loopCounter;
  }

  /**
   * Sets the field loopCounter.
   * @param _loopCounter the new value of the field loopCounter.
   */
  public void setLoopCounter(java.lang.Integer _loopCounter)
  {
    loopCounter = _loopCounter;
  }

  private java.lang.Integer maxResultNumberPerQuery;

  /**
   * Gets the field maxResultNumberPerQuery.
   * @return the value of the field maxResultNumberPerQuery; may be null.
   */
  public java.lang.Integer getMaxResultNumberPerQuery()
  {
    return maxResultNumberPerQuery;
  }

  /**
   * Sets the field maxResultNumberPerQuery.
   * @param _maxResultNumberPerQuery the new value of the field maxResultNumberPerQuery.
   */
  public void setMaxResultNumberPerQuery(java.lang.Integer _maxResultNumberPerQuery)
  {
    maxResultNumberPerQuery = _maxResultNumberPerQuery;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ICase> collectedCasesForExporting;

  /**
   * Gets the field collectedCasesForExporting.
   * @return the value of the field collectedCasesForExporting; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ICase> getCollectedCasesForExporting()
  {
    return collectedCasesForExporting;
  }

  /**
   * Sets the field collectedCasesForExporting.
   * @param _collectedCasesForExporting the new value of the field collectedCasesForExporting.
   */
  public void setCollectedCasesForExporting(java.util.List<ch.ivyteam.ivy.workflow.ICase> _collectedCasesForExporting)
  {
    collectedCasesForExporting = _collectedCasesForExporting;
  }

}
