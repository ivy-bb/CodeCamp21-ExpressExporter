package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class TaskDef", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TaskDef extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3476449892888575276L;

  private java.util.List<java.lang.String> responsibles;

  /**
   * Gets the field responsibles.
   * @return the value of the field responsibles; may be null.
   */
  public java.util.List<java.lang.String> getResponsibles()
  {
    return responsibles;
  }

  /**
   * Sets the field responsibles.
   * @param _responsibles the new value of the field responsibles.
   */
  public void setResponsibles(java.util.List<java.lang.String> _responsibles)
  {
    responsibles = _responsibles;
  }

  private java.lang.String subject;

  /**
   * Gets the field subject.
   * @return the value of the field subject; may be null.
   */
  public java.lang.String getSubject()
  {
    return subject;
  }

  /**
   * Sets the field subject.
   * @param _subject the new value of the field subject.
   */
  public void setSubject(java.lang.String _subject)
  {
    subject = _subject;
  }

  private java.lang.Number prio;

  /**
   * Gets the field prio.
   * @return the value of the field prio; may be null.
   */
  public java.lang.Number getPrio()
  {
    return prio;
  }

  /**
   * Sets the field prio.
   * @param _prio the new value of the field prio.
   */
  public void setPrio(java.lang.Number _prio)
  {
    prio = _prio;
  }

  private java.lang.String description;

  /**
   * Gets the field description.
   * @return the value of the field description; may be null.
   */
  public java.lang.String getDescription()
  {
    return description;
  }

  /**
   * Sets the field description.
   * @param _description the new value of the field description.
   */
  public void setDescription(java.lang.String _description)
  {
    description = _description;
  }

  /**
   * Position of defined task in the express process
   */
  private java.lang.Integer position;

  /**
   * Gets the field position.
   * @return the value of the field position; may be null.
   */
  public java.lang.Integer getPosition()
  {
    return position;
  }

  /**
   * Sets the field position.
   * @param _position the new value of the field position.
   */
  public void setPosition(java.lang.Integer _position)
  {
    position = _position;
  }

  private java.lang.Number untilDays;

  /**
   * Gets the field untilDays.
   * @return the value of the field untilDays; may be null.
   */
  public java.lang.Number getUntilDays()
  {
    return untilDays;
  }

  /**
   * Sets the field untilDays.
   * @param _untilDays the new value of the field untilDays.
   */
  public void setUntilDays(java.lang.Number _untilDays)
  {
    untilDays = _untilDays;
  }

  private ch.ivy.gawfs.enums.TaskType taskType;

  /**
   * Gets the field taskType.
   * @return the value of the field taskType; may be null.
   */
  public ch.ivy.gawfs.enums.TaskType getTaskType()
  {
    return taskType;
  }

  /**
   * Sets the field taskType.
   * @param _taskType the new value of the field taskType.
   */
  public void setTaskType(ch.ivy.gawfs.enums.TaskType _taskType)
  {
    taskType = _taskType;
  }

  private java.lang.String responsibleDisplayName;

  /**
   * Gets the field responsibleDisplayName.
   * @return the value of the field responsibleDisplayName; may be null.
   */
  public java.lang.String getResponsibleDisplayName()
  {
    return responsibleDisplayName;
  }

  /**
   * Sets the field responsibleDisplayName.
   * @param _responsibleDisplayName the new value of the field responsibleDisplayName.
   */
  public void setResponsibleDisplayName(java.lang.String _responsibleDisplayName)
  {
    responsibleDisplayName = _responsibleDisplayName;
  }

  private ch.ivy.gawfs.DynaFormController dynaFormController;

  /**
   * Gets the field dynaFormController.
   * @return the value of the field dynaFormController; may be null.
   */
  public ch.ivy.gawfs.DynaFormController getDynaFormController()
  {
    return dynaFormController;
  }

  /**
   * Sets the field dynaFormController.
   * @param _dynaFormController the new value of the field dynaFormController.
   */
  public void setDynaFormController(ch.ivy.gawfs.DynaFormController _dynaFormController)
  {
    dynaFormController = _dynaFormController;
  }

  private ch.ivy.gawfs.DragAndDropController dragAndDropController;

  /**
   * Gets the field dragAndDropController.
   * @return the value of the field dragAndDropController; may be null.
   */
  public ch.ivy.gawfs.DragAndDropController getDragAndDropController()
  {
    return dragAndDropController;
  }

  /**
   * Sets the field dragAndDropController.
   * @param _dragAndDropController the new value of the field dragAndDropController.
   */
  public void setDragAndDropController(ch.ivy.gawfs.DragAndDropController _dragAndDropController)
  {
    dragAndDropController = _dragAndDropController;
  }

  /**
   * counter for split tasks purpose
   */
  private java.lang.Integer counter;

  /**
   * Gets the field counter.
   * @return the value of the field counter; may be null.
   */
  public java.lang.Integer getCounter()
  {
    return counter;
  }

  /**
   * Sets the field counter.
   * @param _counter the new value of the field counter.
   */
  public void setCounter(java.lang.Integer _counter)
  {
    counter = _counter;
  }

  /**
   * Email information for taskType=EMAIL
   */
  private ch.ivy.addon.portalkit.bo.ExpressUserEmail email;

  /**
   * Gets the field email.
   * @return the value of the field email; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressUserEmail getEmail()
  {
    return email;
  }

  /**
   * Sets the field email.
   * @param _email the new value of the field email.
   */
  public void setEmail(ch.ivy.addon.portalkit.bo.ExpressUserEmail _email)
  {
    email = _email;
  }

  private java.util.List<gawfs.ApprovalTaskResult> approvalResultList;

  /**
   * Gets the field approvalResultList.
   * @return the value of the field approvalResultList; may be null.
   */
  public java.util.List<gawfs.ApprovalTaskResult> getApprovalResultList()
  {
    return approvalResultList;
  }

  /**
   * Sets the field approvalResultList.
   * @param _approvalResultList the new value of the field approvalResultList.
   */
  public void setApprovalResultList(java.util.List<gawfs.ApprovalTaskResult> _approvalResultList)
  {
    approvalResultList = _approvalResultList;
  }

  private java.lang.String actualApplicantName;

  /**
   * Gets the field actualApplicantName.
   * @return the value of the field actualApplicantName; may be null.
   */
  public java.lang.String getActualApplicantName()
  {
    return actualApplicantName;
  }

  /**
   * Sets the field actualApplicantName.
   * @param _actualApplicantName the new value of the field actualApplicantName.
   */
  public void setActualApplicantName(java.lang.String _actualApplicantName)
  {
    actualApplicantName = _actualApplicantName;
  }

  private transient ch.ivyteam.ivy.security.IUser actualApplicant;

  /**
   * Gets the field actualApplicant.
   * @return the value of the field actualApplicant; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getActualApplicant()
  {
    return actualApplicant;
  }

  /**
   * Sets the field actualApplicant.
   * @param _actualApplicant the new value of the field actualApplicant.
   */
  public void setActualApplicant(ch.ivyteam.ivy.security.IUser _actualApplicant)
  {
    actualApplicant = _actualApplicant;
  }

}
