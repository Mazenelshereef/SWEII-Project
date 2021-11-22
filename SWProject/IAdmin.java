package SWProject;

public interface IAdmin extends IUser{
    public  void setUsername(String username);
    public  String getUsername();
    public void setPassword(String password);
    public String getPassword();
    public void verifyDriverRegistration(IRegistration request);
    public void denyDriverRegistration(IRegistration request);
    public void suspendUser(ISuspendableUser user);
    public void unsuspendUser(ISuspendableUser user);
    public void listPendingRegistrations();
}
