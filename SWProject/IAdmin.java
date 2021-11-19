package SWProject;

public interface IAdmin {
    public  void setUsername(String username);
    public  String getUsername();
    public void setPassword(String password);
    public String getPassword();
    public void verifyDriverRegistration(IRegistration request);
    public void denyDriverRegistration(IRegistration request);
    public void suspendUser(IUser user);
    public void unsuspendUser(IUser user);
    public void listPendingRegistrations();
}
