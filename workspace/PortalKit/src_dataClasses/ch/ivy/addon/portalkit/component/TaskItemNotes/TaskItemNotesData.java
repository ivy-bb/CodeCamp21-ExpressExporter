package ch.ivy.addon.portalkit.component.TaskItemNotes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskItemNotesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskItemNotesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7078709631339160313L;

  private java.lang.Boolean excludeSystemNotes;

  /**
   * Gets the field excludeSystemNotes.
   * @return the value of the field excludeSystemNotes; may be null.
   */
  public java.lang.Boolean getExcludeSystemNotes()
  {
    return excludeSystemNotes;
  }

  /**
   * Sets the field excludeSystemNotes.
   * @param _excludeSystemNotes the new value of the field excludeSystemNotes.
   */
  public void setExcludeSystemNotes(java.lang.Boolean _excludeSystemNotes)
  {
    excludeSystemNotes = _excludeSystemNotes;
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

}
