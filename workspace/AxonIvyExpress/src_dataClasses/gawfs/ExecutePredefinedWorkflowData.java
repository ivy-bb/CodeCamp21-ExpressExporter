package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class ExecutePredefinedWorkflowData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ExecutePredefinedWorkflowData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -931403992881601895L;

  private java.lang.Integer actualStepIndex;

  /**
   * Gets the field actualStepIndex.
   * @return the value of the field actualStepIndex; may be null.
   */
  public java.lang.Integer getActualStepIndex()
  {
    return actualStepIndex;
  }

  /**
   * Sets the field actualStepIndex.
   * @param _actualStepIndex the new value of the field actualStepIndex.
   */
  public void setActualStepIndex(java.lang.Integer _actualStepIndex)
  {
    actualStepIndex = _actualStepIndex;
  }

  private gawfs.ApprovalTaskResult approvalTaskResult;

  /**
   * Gets the field approvalTaskResult.
   * @return the value of the field approvalTaskResult; may be null.
   */
  public gawfs.ApprovalTaskResult getApprovalTaskResult()
  {
    return approvalTaskResult;
  }

  /**
   * Sets the field approvalTaskResult.
   * @param _approvalTaskResult the new value of the field approvalTaskResult.
   */
  public void setApprovalTaskResult(gawfs.ApprovalTaskResult _approvalTaskResult)
  {
    approvalTaskResult = _approvalTaskResult;
  }

  private ch.ivyteam.ivy.scripting.objects.List<gawfs.ApprovalTaskResult> approvalTaskResults;

  /**
   * Gets the field approvalTaskResults.
   * @return the value of the field approvalTaskResults; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<gawfs.ApprovalTaskResult> getApprovalTaskResults()
  {
    return approvalTaskResults;
  }

  /**
   * Sets the field approvalTaskResults.
   * @param _approvalTaskResults the new value of the field approvalTaskResults.
   */
  public void setApprovalTaskResults(ch.ivyteam.ivy.scripting.objects.List<gawfs.ApprovalTaskResult> _approvalTaskResults)
  {
    approvalTaskResults = _approvalTaskResults;
  }

  private transient java.lang.Number taskSplittingCounter;

  /**
   * Gets the field taskSplittingCounter.
   * @return the value of the field taskSplittingCounter; may be null.
   */
  public java.lang.Number getTaskSplittingCounter()
  {
    return taskSplittingCounter;
  }

  /**
   * Sets the field taskSplittingCounter.
   * @param _taskSplittingCounter the new value of the field taskSplittingCounter.
   */
  public void setTaskSplittingCounter(java.lang.Number _taskSplittingCounter)
  {
    taskSplittingCounter = _taskSplittingCounter;
  }

  private gawfs.TaskDef currentTask;

  /**
   * Gets the field currentTask.
   * @return the value of the field currentTask; may be null.
   */
  public gawfs.TaskDef getCurrentTask()
  {
    return currentTask;
  }

  /**
   * Sets the field currentTask.
   * @param _currentTask the new value of the field currentTask.
   */
  public void setCurrentTask(gawfs.TaskDef _currentTask)
  {
    currentTask = _currentTask;
  }

  private ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> definedTasks;

  /**
   * Gets the field definedTasks.
   * @return the value of the field definedTasks; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> getDefinedTasks()
  {
    return definedTasks;
  }

  /**
   * Sets the field definedTasks.
   * @param _definedTasks the new value of the field definedTasks.
   */
  public void setDefinedTasks(ch.ivyteam.ivy.scripting.objects.List<gawfs.TaskDef> _definedTasks)
  {
    definedTasks = _definedTasks;
  }

  private java.util.List<gawfs.TaskDef> finishedTasks;

  /**
   * Gets the field finishedTasks.
   * @return the value of the field finishedTasks; may be null.
   */
  public java.util.List<gawfs.TaskDef> getFinishedTasks()
  {
    return finishedTasks;
  }

  /**
   * Sets the field finishedTasks.
   * @param _finishedTasks the new value of the field finishedTasks.
   */
  public void setFinishedTasks(java.util.List<gawfs.TaskDef> _finishedTasks)
  {
    finishedTasks = _finishedTasks;
  }

  private java.lang.Boolean hasRejectedApprovalTask;

  /**
   * Gets the field hasRejectedApprovalTask.
   * @return the value of the field hasRejectedApprovalTask; may be null.
   */
  public java.lang.Boolean getHasRejectedApprovalTask()
  {
    return hasRejectedApprovalTask;
  }

  /**
   * Sets the field hasRejectedApprovalTask.
   * @param _hasRejectedApprovalTask the new value of the field hasRejectedApprovalTask.
   */
  public void setHasRejectedApprovalTask(java.lang.Boolean _hasRejectedApprovalTask)
  {
    hasRejectedApprovalTask = _hasRejectedApprovalTask;
  }

  private ch.ivy.addon.portalkit.dto.SecurityMemberDTO responsible;

  /**
   * Gets the field responsible.
   * @return the value of the field responsible; may be null.
   */
  public ch.ivy.addon.portalkit.dto.SecurityMemberDTO getResponsible()
  {
    return responsible;
  }

  /**
   * Sets the field responsible.
   * @param _responsible the new value of the field responsible.
   */
  public void setResponsible(ch.ivy.addon.portalkit.dto.SecurityMemberDTO _responsible)
  {
    responsible = _responsible;
  }

  private transient java.lang.Boolean shouldEndProcess;

  /**
   * Gets the field shouldEndProcess.
   * @return the value of the field shouldEndProcess; may be null.
   */
  public java.lang.Boolean getShouldEndProcess()
  {
    return shouldEndProcess;
  }

  /**
   * Sets the field shouldEndProcess.
   * @param _shouldEndProcess the new value of the field shouldEndProcess.
   */
  public void setShouldEndProcess(java.lang.Boolean _shouldEndProcess)
  {
    shouldEndProcess = _shouldEndProcess;
  }

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> steps;

  /**
   * Gets the field steps.
   * @return the value of the field steps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getSteps()
  {
    return steps;
  }

  /**
   * Sets the field steps.
   * @param _steps the new value of the field steps.
   */
  public void setSteps(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _steps)
  {
    steps = _steps;
  }

  private transient java.lang.Boolean useExpressEndPage;

  /**
   * Gets the field useExpressEndPage.
   * @return the value of the field useExpressEndPage; may be null.
   */
  public java.lang.Boolean getUseExpressEndPage()
  {
    return useExpressEndPage;
  }

  /**
   * Sets the field useExpressEndPage.
   * @param _useExpressEndPage the new value of the field useExpressEndPage.
   */
  public void setUseExpressEndPage(java.lang.Boolean _useExpressEndPage)
  {
    useExpressEndPage = _useExpressEndPage;
  }

  private gawfs.TaskDef userTaskForApproval;

  /**
   * Gets the field userTaskForApproval.
   * @return the value of the field userTaskForApproval; may be null.
   */
  public gawfs.TaskDef getUserTaskForApproval()
  {
    return userTaskForApproval;
  }

  /**
   * Sets the field userTaskForApproval.
   * @param _userTaskForApproval the new value of the field userTaskForApproval.
   */
  public void setUserTaskForApproval(gawfs.TaskDef _userTaskForApproval)
  {
    userTaskForApproval = _userTaskForApproval;
  }

  private transient java.lang.String workflowDescription;

  /**
   * Gets the field workflowDescription.
   * @return the value of the field workflowDescription; may be null.
   */
  public java.lang.String getWorkflowDescription()
  {
    return workflowDescription;
  }

  /**
   * Sets the field workflowDescription.
   * @param _workflowDescription the new value of the field workflowDescription.
   */
  public void setWorkflowDescription(java.lang.String _workflowDescription)
  {
    workflowDescription = _workflowDescription;
  }

  private transient java.lang.String workflowID;

  /**
   * Gets the field workflowID.
   * @return the value of the field workflowID; may be null.
   */
  public java.lang.String getWorkflowID()
  {
    return workflowID;
  }

  /**
   * Sets the field workflowID.
   * @param _workflowID the new value of the field workflowID.
   */
  public void setWorkflowID(java.lang.String _workflowID)
  {
    workflowID = _workflowID;
  }

  private java.lang.String workflowName;

  /**
   * Gets the field workflowName.
   * @return the value of the field workflowName; may be null.
   */
  public java.lang.String getWorkflowName()
  {
    return workflowName;
  }

  /**
   * Sets the field workflowName.
   * @param _workflowName the new value of the field workflowName.
   */
  public void setWorkflowName(java.lang.String _workflowName)
  {
    workflowName = _workflowName;
  }

  private ch.ivy.gawfs.enums.ProcessType workflowType;

  /**
   * Gets the field workflowType.
   * @return the value of the field workflowType; may be null.
   */
  public ch.ivy.gawfs.enums.ProcessType getWorkflowType()
  {
    return workflowType;
  }

  /**
   * Sets the field workflowType.
   * @param _workflowType the new value of the field workflowType.
   */
  public void setWorkflowType(ch.ivy.gawfs.enums.ProcessType _workflowType)
  {
    workflowType = _workflowType;
  }

  private java.lang.Boolean isAdhocProcess;

  /**
   * Gets the field isAdhocProcess.
   * @return the value of the field isAdhocProcess; may be null.
   */
  public java.lang.Boolean getIsAdhocProcess()
  {
    return isAdhocProcess;
  }

  /**
   * Sets the field isAdhocProcess.
   * @param _isAdhocProcess the new value of the field isAdhocProcess.
   */
  public void setIsAdhocProcess(java.lang.Boolean _isAdhocProcess)
  {
    isAdhocProcess = _isAdhocProcess;
  }

  private java.lang.Long originalTaskId;

  /**
   * Gets the field originalTaskId.
   * @return the value of the field originalTaskId; may be null.
   */
  public java.lang.Long getOriginalTaskId()
  {
    return originalTaskId;
  }

  /**
   * Sets the field originalTaskId.
   * @param _originalTaskId the new value of the field originalTaskId.
   */
  public void setOriginalTaskId(java.lang.Long _originalTaskId)
  {
    originalTaskId = _originalTaskId;
  }

  private java.lang.Boolean doesCreatorHaveTask;

  /**
   * Gets the field doesCreatorHaveTask.
   * @return the value of the field doesCreatorHaveTask; may be null.
   */
  public java.lang.Boolean getDoesCreatorHaveTask()
  {
    return doesCreatorHaveTask;
  }

  /**
   * Sets the field doesCreatorHaveTask.
   * @param _doesCreatorHaveTask the new value of the field doesCreatorHaveTask.
   */
  public void setDoesCreatorHaveTask(java.lang.Boolean _doesCreatorHaveTask)
  {
    doesCreatorHaveTask = _doesCreatorHaveTask;
  }

  private transient java.lang.Boolean hasActiveTasks;

  /**
   * Gets the field hasActiveTasks.
   * @return the value of the field hasActiveTasks; may be null.
   */
  public java.lang.Boolean getHasActiveTasks()
  {
    return hasActiveTasks;
  }

  /**
   * Sets the field hasActiveTasks.
   * @param _hasActiveTasks the new value of the field hasActiveTasks.
   */
  public void setHasActiveTasks(java.lang.Boolean _hasActiveTasks)
  {
    hasActiveTasks = _hasActiveTasks;
  }

}
