package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.processing.Generated(comments="This is the java file of the ivy data class AbsenceServiceData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class AbsenceServiceData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7711729919704431235L;

  private transient ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence absence;

  /**
   * Gets the field absence.
   * @return the value of the field absence; may be null.
   */
  public ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence getAbsence()
  {
    return absence;
  }

  /**
   * Sets the field absence.
   * @param _absence the new value of the field absence.
   */
  public void setAbsence(ch.ivy.addon.portalkit.ivydata.bo.IvyAbsence _absence)
  {
    absence = _absence;
  }

  private transient java.util.Set<Object> absences;

  /**
   * Gets the field absences.
   * @return the value of the field absences; may be null.
   */
  public java.util.Set<Object> getAbsences()
  {
    return absences;
  }

  /**
   * Sets the field absences.
   * @param _absences the new value of the field absences.
   */
  public void setAbsences(java.util.Set<Object> _absences)
  {
    absences = _absences;
  }

  private transient java.util.Map absencesByUser;

  /**
   * Gets the field absencesByUser.
   * @return the value of the field absencesByUser; may be null.
   */
  public java.util.Map getAbsencesByUser()
  {
    return absencesByUser;
  }

  /**
   * Sets the field absencesByUser.
   * @param _absencesByUser the new value of the field absencesByUser.
   */
  public void setAbsencesByUser(java.util.Map _absencesByUser)
  {
    absencesByUser = _absencesByUser;
  }

  private transient java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
  }

}
