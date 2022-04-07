package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class NewTaskMailContentData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NewTaskMailContentData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2482043651699701476L;

  private transient ch.ivyteam.ivy.workflow.ITask task;

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

  private transient ch.ivyteam.ivy.security.IUser user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivyteam.ivy.security.IUser _user)
  {
    user = _user;
  }

}
