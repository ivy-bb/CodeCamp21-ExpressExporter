package portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ExportTaskToExcelData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ExportTaskToExcelData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3680304633404122566L;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> collectedTasksForExporting;

  /**
   * Gets the field collectedTasksForExporting.
   * @return the value of the field collectedTasksForExporting; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> getCollectedTasksForExporting()
  {
    return collectedTasksForExporting;
  }

  /**
   * Sets the field collectedTasksForExporting.
   * @param _collectedTasksForExporting the new value of the field collectedTasksForExporting.
   */
  public void setCollectedTasksForExporting(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.ITask> _collectedTasksForExporting)
  {
    collectedTasksForExporting = _collectedTasksForExporting;
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
