package ch.ivy.addon.portal.generic.TaskNoteHistory;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskNoteHistoryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskNoteHistoryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4471110053109603006L;

  private java.lang.String exportedFileName;

  /**
   * Gets the field exportedFileName.
   * @return the value of the field exportedFileName; may be null.
   */
  public java.lang.String getExportedFileName()
  {
    return exportedFileName;
  }

  /**
   * Sets the field exportedFileName.
   * @param _exportedFileName the new value of the field exportedFileName.
   */
  public void setExportedFileName(java.lang.String _exportedFileName)
  {
    exportedFileName = _exportedFileName;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.INote> filteredNotes;

  /**
   * Gets the field filteredNotes.
   * @return the value of the field filteredNotes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.INote> getFilteredNotes()
  {
    return filteredNotes;
  }

  /**
   * Sets the field filteredNotes.
   * @param _filteredNotes the new value of the field filteredNotes.
   */
  public void setFilteredNotes(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.INote> _filteredNotes)
  {
    filteredNotes = _filteredNotes;
  }

  private java.util.List<ch.ivyteam.ivy.workflow.INote> notes;

  /**
   * Gets the field notes.
   * @return the value of the field notes; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.workflow.INote> getNotes()
  {
    return notes;
  }

  /**
   * Sets the field notes.
   * @param _notes the new value of the field notes.
   */
  public void setNotes(java.util.List<ch.ivyteam.ivy.workflow.INote> _notes)
  {
    notes = _notes;
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

}
