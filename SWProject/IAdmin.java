package SWProject;

public interface IAdmin {
    public  String setUsername();
    public  String getUsername();
    public String setPassword();
    public String getPassword();
    void verifyDriverRegistration(IRegistration request);
    IRegistration listPendingRegistrations();
    void denyDriverRegistration(IRegistration request);
    void suspendUser(UserInfo user);
    void unsuspendUser(UserInfo user);
}
