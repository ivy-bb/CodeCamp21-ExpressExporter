package ch.ivy.gawfs.workflowCreation.WorkflowDefinition;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class WorkflowDefinitionData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WorkflowDefinitionData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8060674274383544058L;

  private gawfs.Data data;

  /**
   * Gets the field data.
   * @return the value of the field data; may be null.
   */
  public gawfs.Data getData()
  {
    return data;
  }

  /**
   * Sets the field data.
   * @param _data the new value of the field data.
   */
  public void setData(gawfs.Data _data)
  {
    data = _data;
  }

  private gawfs.TaskDef taskDefinition;

  /**
   * Gets the field taskDefinition.
   * @return the value of the field taskDefinition; may be null.
   */
  public gawfs.TaskDef getTaskDefinition()
  {
    return taskDefinition;
  }

  /**
   * Sets the field taskDefinition.
   * @param _taskDefinition the new value of the field taskDefinition.
   */
  public void setTaskDefinition(gawfs.TaskDef _taskDefinition)
  {
    taskDefinition = _taskDefinition;
  }

  private java.lang.String autoCompleteQuery;

  /**
   * Gets the field autoCompleteQuery.
   * @return the value of the field autoCompleteQuery; may be null.
   */
  public java.lang.String getAutoCompleteQuery()
  {
    return autoCompleteQuery;
  }

  /**
   * Sets the field autoCompleteQuery.
   * @param _autoCompleteQuery the new value of the field autoCompleteQuery.
   */
  public void setAutoCompleteQuery(java.lang.String _autoCompleteQuery)
  {
    autoCompleteQuery = _autoCompleteQuery;
  }

  private java.util.List<ch.ivyteam.ivy.security.ISecurityMember> selectedAssigneeList;

  /**
   * Gets the field selectedAssigneeList.
   * @return the value of the field selectedAssigneeList; may be null.
   */
  public java.util.List<ch.ivyteam.ivy.security.ISecurityMember> getSelectedAssigneeList()
  {
    return selectedAssigneeList;
  }

  /**
   * Sets the field selectedAssigneeList.
   * @param _selectedAssigneeList the new value of the field selectedAssigneeList.
   */
  public void setSelectedAssigneeList(java.util.List<ch.ivyteam.ivy.security.ISecurityMember> _selectedAssigneeList)
  {
    selectedAssigneeList = _selectedAssigneeList;
  }

  private java.lang.Boolean isAssignToUser;

  /**
   * Gets the field isAssignToUser.
   * @return the value of the field isAssignToUser; may be null.
   */
  public java.lang.Boolean getIsAssignToUser()
  {
    return isAssignToUser;
  }

  /**
   * Sets the field isAssignToUser.
   * @param _isAssignToUser the new value of the field isAssignToUser.
   */
  public void setIsAssignToUser(java.lang.Boolean _isAssignToUser)
  {
    isAssignToUser = _isAssignToUser;
  }

  private ch.ivy.addon.portalkit.dto.UserDTO selectedUser;

  /**
   * Gets the field selectedUser.
   * @return the value of the field selectedUser; may be null.
   */
  public ch.ivy.addon.portalkit.dto.UserDTO getSelectedUser()
  {
    return selectedUser;
  }

  /**
   * Sets the field selectedUser.
   * @param _selectedUser the new value of the field selectedUser.
   */
  public void setSelectedUser(ch.ivy.addon.portalkit.dto.UserDTO _selectedUser)
  {
    selectedUser = _selectedUser;
  }

  private ch.ivy.addon.portalkit.dto.RoleDTO selectedRole;

  /**
   * Gets the field selectedRole.
   * @return the value of the field selectedRole; may be null.
   */
  public ch.ivy.addon.portalkit.dto.RoleDTO getSelectedRole()
  {
    return selectedRole;
  }

  /**
   * Sets the field selectedRole.
   * @param _selectedRole the new value of the field selectedRole.
   */
  public void setSelectedRole(ch.ivy.addon.portalkit.dto.RoleDTO _selectedRole)
  {
    selectedRole = _selectedRole;
  }

  private java.lang.Boolean isValidAssignee;

  /**
   * Gets the field isValidAssignee.
   * @return the value of the field isValidAssignee; may be null.
   */
  public java.lang.Boolean getIsValidAssignee()
  {
    return isValidAssignee;
  }

  /**
   * Sets the field isValidAssignee.
   * @param _isValidAssignee the new value of the field isValidAssignee.
   */
  public void setIsValidAssignee(java.lang.Boolean _isValidAssignee)
  {
    isValidAssignee = _isValidAssignee;
  }

  private java.lang.String selectedResponsibleFieldId;

  /**
   * Gets the field selectedResponsibleFieldId.
   * @return the value of the field selectedResponsibleFieldId; may be null.
   */
  public java.lang.String getSelectedResponsibleFieldId()
  {
    return selectedResponsibleFieldId;
  }

  /**
   * Sets the field selectedResponsibleFieldId.
   * @param _selectedResponsibleFieldId the new value of the field selectedResponsibleFieldId.
   */
  public void setSelectedResponsibleFieldId(java.lang.String _selectedResponsibleFieldId)
  {
    selectedResponsibleFieldId = _selectedResponsibleFieldId;
  }

  private ch.ivy.gawfs.DragAndDropController defaultDragAndDropController;

  /**
   * Gets the field defaultDragAndDropController.
   * @return the value of the field defaultDragAndDropController; may be null.
   */
  public ch.ivy.gawfs.DragAndDropController getDefaultDragAndDropController()
  {
    return defaultDragAndDropController;
  }

  /**
   * Sets the field defaultDragAndDropController.
   * @param _defaultDragAndDropController the new value of the field defaultDragAndDropController.
   */
  public void setDefaultDragAndDropController(ch.ivy.gawfs.DragAndDropController _defaultDragAndDropController)
  {
    defaultDragAndDropController = _defaultDragAndDropController;
  }

  private java.lang.Boolean resetData;

  /**
   * Gets the field resetData.
   * @return the value of the field resetData; may be null.
   */
  public java.lang.Boolean getResetData()
  {
    return resetData;
  }

  /**
   * Sets the field resetData.
   * @param _resetData the new value of the field resetData.
   */
  public void setResetData(java.lang.Boolean _resetData)
  {
    resetData = _resetData;
  }

  private java.lang.Boolean isValidated;

  /**
   * Gets the field isValidated.
   * @return the value of the field isValidated; may be null.
   */
  public java.lang.Boolean getIsValidated()
  {
    return isValidated;
  }

  /**
   * Sets the field isValidated.
   * @param _isValidated the new value of the field isValidated.
   */
  public void setIsValidated(java.lang.Boolean _isValidated)
  {
    isValidated = _isValidated;
  }

  private java.lang.String originalProcessName;

  /**
   * Gets the field originalProcessName.
   * @return the value of the field originalProcessName; may be null.
   */
  public java.lang.String getOriginalProcessName()
  {
    return originalProcessName;
  }

  /**
   * Sets the field originalProcessName.
   * @param _originalProcessName the new value of the field originalProcessName.
   */
  public void setOriginalProcessName(java.lang.String _originalProcessName)
  {
    originalProcessName = _originalProcessName;
  }

  private java.lang.Boolean isRepeatable;

  /**
   * Gets the field isRepeatable.
   * @return the value of the field isRepeatable; may be null.
   */
  public java.lang.Boolean getIsRepeatable()
  {
    return isRepeatable;
  }

  /**
   * Sets the field isRepeatable.
   * @param _isRepeatable the new value of the field isRepeatable.
   */
  public void setIsRepeatable(java.lang.Boolean _isRepeatable)
  {
    isRepeatable = _isRepeatable;
  }

  private java.lang.Boolean isDisplayProcessOwner;

  /**
   * Gets the field isDisplayProcessOwner.
   * @return the value of the field isDisplayProcessOwner; may be null.
   */
  public java.lang.Boolean getIsDisplayProcessOwner()
  {
    return isDisplayProcessOwner;
  }

  /**
   * Sets the field isDisplayProcessOwner.
   * @param _isDisplayProcessOwner the new value of the field isDisplayProcessOwner.
   */
  public void setIsDisplayProcessOwner(java.lang.Boolean _isDisplayProcessOwner)
  {
    isDisplayProcessOwner = _isDisplayProcessOwner;
  }

  private java.lang.Boolean isSelectProcessOwnerResponsibles;

  /**
   * Gets the field isSelectProcessOwnerResponsibles.
   * @return the value of the field isSelectProcessOwnerResponsibles; may be null.
   */
  public java.lang.Boolean getIsSelectProcessOwnerResponsibles()
  {
    return isSelectProcessOwnerResponsibles;
  }

  /**
   * Sets the field isSelectProcessOwnerResponsibles.
   * @param _isSelectProcessOwnerResponsibles the new value of the field isSelectProcessOwnerResponsibles.
   */
  public void setIsSelectProcessOwnerResponsibles(java.lang.Boolean _isSelectProcessOwnerResponsibles)
  {
    isSelectProcessOwnerResponsibles = _isSelectProcessOwnerResponsibles;
  }

  private org.primefaces.model.UploadedFile importExpressFile;

  /**
   * Gets the field importExpressFile.
   * @return the value of the field importExpressFile; may be null.
   */
  public org.primefaces.model.UploadedFile getImportExpressFile()
  {
    return importExpressFile;
  }

  /**
   * Sets the field importExpressFile.
   * @param _importExpressFile the new value of the field importExpressFile.
   */
  public void setImportExpressFile(org.primefaces.model.UploadedFile _importExpressFile)
  {
    importExpressFile = _importExpressFile;
  }

  private org.primefaces.model.StreamedContent exportExpressFile;

  /**
   * Gets the field exportExpressFile.
   * @return the value of the field exportExpressFile; may be null.
   */
  public org.primefaces.model.StreamedContent getExportExpressFile()
  {
    return exportExpressFile;
  }

  /**
   * Sets the field exportExpressFile.
   * @param _exportExpressFile the new value of the field exportExpressFile.
   */
  public void setExportExpressFile(org.primefaces.model.StreamedContent _exportExpressFile)
  {
    exportExpressFile = _exportExpressFile;
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

}
