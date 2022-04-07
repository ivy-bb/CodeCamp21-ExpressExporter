package ch.ivy.addon.portalkit.component.CaseWidget;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseWidgetData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseWidgetData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8760884212051048981L;

  private java.lang.Long caseId;

  /**
   * Gets the field caseId.
   * @return the value of the field caseId; may be null.
   */
  public java.lang.Long getCaseId()
  {
    return caseId;
  }

  /**
   * Sets the field caseId.
   * @param _caseId the new value of the field caseId.
   */
  public void setCaseId(java.lang.Long _caseId)
  {
    caseId = _caseId;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.ICase> cases;

  /**
   * Gets the field cases.
   * @return the value of the field cases; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.ICase> getCases()
  {
    return cases;
  }

  /**
   * Sets the field cases.
   * @param _cases the new value of the field cases.
   */
  public void setCases(java.util.List<ch.ivyteam.ivy.workflow.ICase> _cases)
  {
    cases = _cases;
  }

  private java.lang.String filteringKeyword;

  /**
   * Gets the field filteringKeyword.
   * @return the value of the field filteringKeyword; may be null.
   */
  public java.lang.String getFilteringKeyword()
  {
    return filteringKeyword;
  }

  /**
   * Sets the field filteringKeyword.
   * @param _filteringKeyword the new value of the field filteringKeyword.
   */
  public void setFilteringKeyword(java.lang.String _filteringKeyword)
  {
    filteringKeyword = _filteringKeyword;
  }

  private ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel dataModel;

  /**
   * Gets the field dataModel.
   * @return the value of the field dataModel; may be null.
   */
  public ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel getDataModel()
  {
    return dataModel;
  }

  /**
   * Sets the field dataModel.
   * @param _dataModel the new value of the field dataModel.
   */
  public void setDataModel(ch.ivy.addon.portalkit.datamodel.CaseLazyDataModel _dataModel)
  {
    dataModel = _dataModel;
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

  private java.lang.String filterSetName;

  /**
   * Gets the field filterSetName.
   * @return the value of the field filterSetName; may be null.
   */
  public java.lang.String getFilterSetName()
  {
    return filterSetName;
  }

  /**
   * Sets the field filterSetName.
   * @param _filterSetName the new value of the field filterSetName.
   */
  public void setFilterSetName(java.lang.String _filterSetName)
  {
    filterSetName = _filterSetName;
  }

  private ch.ivy.addon.portalkit.enums.FilterType filterType;

  /**
   * Gets the field filterType.
   * @return the value of the field filterType; may be null.
   */
  public ch.ivy.addon.portalkit.enums.FilterType getFilterType()
  {
    return filterType;
  }

  /**
   * Sets the field filterType.
   * @param _filterType the new value of the field filterType.
   */
  public void setFilterType(ch.ivy.addon.portalkit.enums.FilterType _filterType)
  {
    filterType = _filterType;
  }

  private java.lang.Boolean isFilterExisted;

  /**
   * Gets the field isFilterExisted.
   * @return the value of the field isFilterExisted; may be null.
   */
  public java.lang.Boolean getIsFilterExisted()
  {
    return isFilterExisted;
  }

  /**
   * Sets the field isFilterExisted.
   * @param _isFilterExisted the new value of the field isFilterExisted.
   */
  public void setIsFilterExisted(java.lang.Boolean _isFilterExisted)
  {
    isFilterExisted = _isFilterExisted;
  }

  private java.lang.Long filterGroupId;

  /**
   * Gets the field filterGroupId.
   * @return the value of the field filterGroupId; may be null.
   */
  public java.lang.Long getFilterGroupId()
  {
    return filterGroupId;
  }

  /**
   * Sets the field filterGroupId.
   * @param _filterGroupId the new value of the field filterGroupId.
   */
  public void setFilterGroupId(java.lang.Long _filterGroupId)
  {
    filterGroupId = _filterGroupId;
  }

  private java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> publicFilters;

  /**
   * Gets the field publicFilters.
   * @return the value of the field publicFilters; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> getPublicFilters()
  {
    return publicFilters;
  }

  /**
   * Sets the field publicFilters.
   * @param _publicFilters the new value of the field publicFilters.
   */
  public void setPublicFilters(java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> _publicFilters)
  {
    publicFilters = _publicFilters;
  }

  private java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> privateFilters;

  /**
   * Gets the field privateFilters.
   * @return the value of the field privateFilters; may be null.
   */
  public java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> getPrivateFilters()
  {
    return privateFilters;
  }

  /**
   * Sets the field privateFilters.
   * @param _privateFilters the new value of the field privateFilters.
   */
  public void setPrivateFilters(java.util.List<ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData> _privateFilters)
  {
    privateFilters = _privateFilters;
  }

  private ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData filterDataToBeDeleted;

  /**
   * Gets the field filterDataToBeDeleted.
   * @return the value of the field filterDataToBeDeleted; may be null.
   */
  public ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData getFilterDataToBeDeleted()
  {
    return filterDataToBeDeleted;
  }

  /**
   * Sets the field filterDataToBeDeleted.
   * @param _filterDataToBeDeleted the new value of the field filterDataToBeDeleted.
   */
  public void setFilterDataToBeDeleted(ch.ivy.addon.portalkit.casefilter.impl.CaseFilterData _filterDataToBeDeleted)
  {
    filterDataToBeDeleted = _filterDataToBeDeleted;
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

  private ch.ivy.addon.portalkit.dto.GlobalCaseId globalCaseId;

  /**
   * Gets the field globalCaseId.
   * @return the value of the field globalCaseId; may be null.
   */
  public ch.ivy.addon.portalkit.dto.GlobalCaseId getGlobalCaseId()
  {
    return globalCaseId;
  }

  /**
   * Sets the field globalCaseId.
   * @param _globalCaseId the new value of the field globalCaseId.
   */
  public void setGlobalCaseId(ch.ivy.addon.portalkit.dto.GlobalCaseId _globalCaseId)
  {
    globalCaseId = _globalCaseId;
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
