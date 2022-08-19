package ch.ivy.addon.portalkit.component.CaseItemHistory;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class CaseItemHistoryData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaseItemHistoryData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3117295318093750935L;

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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> histories;

  /**
   * Gets the field histories.
   * @return the value of the field histories; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> getHistories()
  {
    return histories;
  }

  /**
   * Sets the field histories.
   * @param _histories the new value of the field histories.
   */
  public void setHistories(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.bo.History> _histories)
  {
    histories = _histories;
  }

  private java.lang.String noteContent;

  /**
   * Gets the field noteContent.
   * @return the value of the field noteContent; may be null.
   */
  public java.lang.String getNoteContent()
  {
    return noteContent;
  }

  /**
   * Sets the field noteContent.
   * @param _noteContent the new value of the field noteContent.
   */
  public void setNoteContent(java.lang.String _noteContent)
  {
    noteContent = _noteContent;
  }

  private ch.ivyteam.ivy.workflow.INote note;

  /**
   * Gets the field note.
   * @return the value of the field note; may be null.
   */
  public ch.ivyteam.ivy.workflow.INote getNote()
  {
    return note;
  }

  /**
   * Sets the field note.
   * @param _note the new value of the field note.
   */
  public void setNote(ch.ivyteam.ivy.workflow.INote _note)
  {
    note = _note;
  }

  private java.lang.Long taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Long getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Long _taskId)
  {
    taskId = _taskId;
  }

  private java.lang.String fullNote;

  /**
   * Gets the field fullNote.
   * @return the value of the field fullNote; may be null.
   */
  public java.lang.String getFullNote()
  {
    return fullNote;
  }

  /**
   * Sets the field fullNote.
   * @param _fullNote the new value of the field fullNote.
   */
  public void setFullNote(java.lang.String _fullNote)
  {
    fullNote = _fullNote;
  }

  private java.lang.Boolean showSystemNotes;

  /**
   * Gets the field showSystemNotes.
   * @return the value of the field showSystemNotes; may be null.
   */
  public java.lang.Boolean getShowSystemNotes()
  {
    return showSystemNotes;
  }

  /**
   * Sets the field showSystemNotes.
   * @param _showSystemNotes the new value of the field showSystemNotes.
   */
  public void setShowSystemNotes(java.lang.Boolean _showSystemNotes)
  {
    showSystemNotes = _showSystemNotes;
  }

  private java.lang.Boolean showSystemTasks;

  /**
   * Gets the field showSystemTasks.
   * @return the value of the field showSystemTasks; may be null.
   */
  public java.lang.Boolean getShowSystemTasks()
  {
    return showSystemTasks;
  }

  /**
   * Sets the field showSystemTasks.
   * @param _showSystemTasks the new value of the field showSystemTasks.
   */
  public void setShowSystemTasks(java.lang.Boolean _showSystemTasks)
  {
    showSystemTasks = _showSystemTasks;
  }

  private java.lang.Boolean showSystemNotesChkbox;

  /**
   * Gets the field showSystemNotesChkbox.
   * @return the value of the field showSystemNotesChkbox; may be null.
   */
  public java.lang.Boolean getShowSystemNotesChkbox()
  {
    return showSystemNotesChkbox;
  }

  /**
   * Sets the field showSystemNotesChkbox.
   * @param _showSystemNotesChkbox the new value of the field showSystemNotesChkbox.
   */
  public void setShowSystemNotesChkbox(java.lang.Boolean _showSystemNotesChkbox)
  {
    showSystemNotesChkbox = _showSystemNotesChkbox;
  }

  private java.lang.Boolean showSystemTasksChkbox;

  /**
   * Gets the field showSystemTasksChkbox.
   * @return the value of the field showSystemTasksChkbox; may be null.
   */
  public java.lang.Boolean getShowSystemTasksChkbox()
  {
    return showSystemTasksChkbox;
  }

  /**
   * Sets the field showSystemTasksChkbox.
   * @param _showSystemTasksChkbox the new value of the field showSystemTasksChkbox.
   */
  public void setShowSystemTasksChkbox(java.lang.Boolean _showSystemTasksChkbox)
  {
    showSystemTasksChkbox = _showSystemTasksChkbox;
  }

}
