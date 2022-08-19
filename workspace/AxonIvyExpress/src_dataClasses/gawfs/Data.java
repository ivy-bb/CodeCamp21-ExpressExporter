package gawfs;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class Data", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Data extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8479823790458865542L;

  /**
   * Process Steps for ProcessChain
   */
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

  /**
   * List of Tasks for execution
   */
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

  /**
   * Name of the Process also later CaseName
   */
  private java.lang.String processName;

  /**
   * Gets the field processName.
   * @return the value of the field processName; may be null.
   */
  public java.lang.String getProcessName()
  {
    return processName;
  }

  /**
   * Sets the field processName.
   * @param _processName the new value of the field processName.
   */
  public void setProcessName(java.lang.String _processName)
  {
    processName = _processName;
  }

  /**
   * Description of the Process later CaseDescription
   */
  private java.lang.String processDescription;

  /**
   * Gets the field processDescription.
   * @return the value of the field processDescription; may be null.
   */
  public java.lang.String getProcessDescription()
  {
    return processDescription;
  }

  /**
   * Sets the field processDescription.
   * @param _processDescription the new value of the field processDescription.
   */
  public void setProcessDescription(java.lang.String _processDescription)
  {
    processDescription = _processDescription;
  }

  /**
   * Process type
   */
  private ch.ivy.gawfs.enums.ProcessType processType;

  /**
   * Gets the field processType.
   * @return the value of the field processType; may be null.
   */
  public ch.ivy.gawfs.enums.ProcessType getProcessType()
  {
    return processType;
  }

  /**
   * Sets the field processType.
   * @param _processType the new value of the field processType.
   */
  public void setProcessType(ch.ivy.gawfs.enums.ProcessType _processType)
  {
    processType = _processType;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> wfusers;

  /**
   * Gets the field wfusers.
   * @return the value of the field wfusers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getWfusers()
  {
    return wfusers;
  }

  /**
   * Sets the field wfusers.
   * @param _wfusers the new value of the field wfusers.
   */
  public void setWfusers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _wfusers)
  {
    wfusers = _wfusers;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpressTaskDefinition taskRepository;

  /**
   * Gets the field taskRepository.
   * @return the value of the field taskRepository; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressTaskDefinition getTaskRepository()
  {
    return taskRepository;
  }

  /**
   * Sets the field taskRepository.
   * @param _taskRepository the new value of the field taskRepository.
   */
  public void setTaskRepository(ch.ivy.addon.portalkit.bo.ExpressTaskDefinition _taskRepository)
  {
    taskRepository = _taskRepository;
  }

  private transient ch.ivy.addon.portalkit.bo.ExpressFormElement formelementRepository;

  /**
   * Gets the field formelementRepository.
   * @return the value of the field formelementRepository; may be null.
   */
  public ch.ivy.addon.portalkit.bo.ExpressFormElement getFormelementRepository()
  {
    return formelementRepository;
  }

  /**
   * Sets the field formelementRepository.
   * @param _formelementRepository the new value of the field formelementRepository.
   */
  public void setFormelementRepository(ch.ivy.addon.portalkit.bo.ExpressFormElement _formelementRepository)
  {
    formelementRepository = _formelementRepository;
  }

  private transient java.lang.Boolean backFlag;

  /**
   * Gets the field backFlag.
   * @return the value of the field backFlag; may be null.
   */
  public java.lang.Boolean getBackFlag()
  {
    return backFlag;
  }

  /**
   * Sets the field backFlag.
   * @param _backFlag the new value of the field backFlag.
   */
  public void setBackFlag(java.lang.Boolean _backFlag)
  {
    backFlag = _backFlag;
  }

  private transient java.lang.String processID;

  /**
   * Gets the field processID.
   * @return the value of the field processID; may be null.
   */
  public java.lang.String getProcessID()
  {
    return processID;
  }

  /**
   * Sets the field processID.
   * @param _processID the new value of the field processID.
   */
  public void setProcessID(java.lang.String _processID)
  {
    processID = _processID;
  }

  /**
   * Task ID for Endpage
   */
  private transient java.lang.Number taskId;

  /**
   * Gets the field taskId.
   * @return the value of the field taskId; may be null.
   */
  public java.lang.Number getTaskId()
  {
    return taskId;
  }

  /**
   * Sets the field taskId.
   * @param _taskId the new value of the field taskId.
   */
  public void setTaskId(java.lang.Number _taskId)
  {
    taskId = _taskId;
  }

  private transient java.lang.Boolean discard;

  /**
   * Gets the field discard.
   * @return the value of the field discard; may be null.
   */
  public java.lang.Boolean getDiscard()
  {
    return discard;
  }

  /**
   * Sets the field discard.
   * @param _discard the new value of the field discard.
   */
  public void setDiscard(java.lang.Boolean _discard)
  {
    discard = _discard;
  }

  private java.lang.Boolean isUseDefaultUI;

  /**
   * Gets the field isUseDefaultUI.
   * @return the value of the field isUseDefaultUI; may be null.
   */
  public java.lang.Boolean getIsUseDefaultUI()
  {
    return isUseDefaultUI;
  }

  /**
   * Sets the field isUseDefaultUI.
   * @param _isUseDefaultUI the new value of the field isUseDefaultUI.
   */
  public void setIsUseDefaultUI(java.lang.Boolean _isUseDefaultUI)
  {
    isUseDefaultUI = _isUseDefaultUI;
  }

  /**
   * Folder to store file of this process
   */
  private java.lang.String processFolder;

  /**
   * Gets the field processFolder.
   * @return the value of the field processFolder; may be null.
   */
  public java.lang.String getProcessFolder()
  {
    return processFolder;
  }

  /**
   * Sets the field processFolder.
   * @param _processFolder the new value of the field processFolder.
   */
  public void setProcessFolder(java.lang.String _processFolder)
  {
    processFolder = _processFolder;
  }

  /**
   * Flag to marked whether process is ready to execute or not
   */
  private java.lang.Boolean readyToExecute;

  /**
   * Gets the field readyToExecute.
   * @return the value of the field readyToExecute; may be null.
   */
  public java.lang.Boolean getReadyToExecute()
  {
    return readyToExecute;
  }

  /**
   * Sets the field readyToExecute.
   * @param _readyToExecute the new value of the field readyToExecute.
   */
  public void setReadyToExecute(java.lang.Boolean _readyToExecute)
  {
    readyToExecute = _readyToExecute;
  }

  private java.lang.Boolean editFlag;

  /**
   * Gets the field editFlag.
   * @return the value of the field editFlag; may be null.
   */
  public java.lang.Boolean getEditFlag()
  {
    return editFlag;
  }

  /**
   * Sets the field editFlag.
   * @param _editFlag the new value of the field editFlag.
   */
  public void setEditFlag(java.lang.Boolean _editFlag)
  {
    editFlag = _editFlag;
  }

  private java.lang.Boolean savedFlag;

  /**
   * Gets the field savedFlag.
   * @return the value of the field savedFlag; may be null.
   */
  public java.lang.Boolean getSavedFlag()
  {
    return savedFlag;
  }

  /**
   * Sets the field savedFlag.
   * @param _savedFlag the new value of the field savedFlag.
   */
  public void setSavedFlag(java.lang.Boolean _savedFlag)
  {
    savedFlag = _savedFlag;
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

  /**
   * This field store original task id which is trigger express adhoc WF
   */
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

  /**
   * This field store which user/role is co owener of express process, beside process creator
   */
  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> processCoOwners;

  /**
   * Gets the field processCoOwners.
   * @return the value of the field processCoOwners; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getProcessCoOwners()
  {
    return processCoOwners;
  }

  /**
   * Sets the field processCoOwners.
   * @param _processCoOwners the new value of the field processCoOwners.
   */
  public void setProcessCoOwners(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _processCoOwners)
  {
    processCoOwners = _processCoOwners;
  }

  private java.lang.String processCoOwnersDisplayName;

  /**
   * Gets the field processCoOwnersDisplayName.
   * @return the value of the field processCoOwnersDisplayName; may be null.
   */
  public java.lang.String getProcessCoOwnersDisplayName()
  {
    return processCoOwnersDisplayName;
  }

  /**
   * Sets the field processCoOwnersDisplayName.
   * @param _processCoOwnersDisplayName the new value of the field processCoOwnersDisplayName.
   */
  public void setProcessCoOwnersDisplayName(java.lang.String _processCoOwnersDisplayName)
  {
    processCoOwnersDisplayName = _processCoOwnersDisplayName;
  }

  private java.lang.String processIcon;

  /**
   * Gets the field processIcon.
   * @return the value of the field processIcon; may be null.
   */
  public java.lang.String getProcessIcon()
  {
    return processIcon;
  }

  /**
   * Sets the field processIcon.
   * @param _processIcon the new value of the field processIcon.
   */
  public void setProcessIcon(java.lang.String _processIcon)
  {
    processIcon = _processIcon;
  }

}
