package portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ExportCaseToExcelData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ExportCaseToExcelData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3165837168762912359L;

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> columnsVisibility;

  /**
   * Gets the field columnsVisibility.
   * @return the value of the field columnsVisibility; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getColumnsVisibility()
  {
    return columnsVisibility;
  }

  /**
   * Sets the field columnsVisibility.
   * @param _columnsVisibility the new value of the field columnsVisibility.
   */
  public void setColumnsVisibility(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _columnsVisibility)
  {
    columnsVisibility = _columnsVisibility;
  }

  private transient java.util.List<ch.ivyteam.ivy.workflow.ICase> collectedCasesForExporting;

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

  private transient org.primefaces.model.StreamedContent exportedFile;

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

}
