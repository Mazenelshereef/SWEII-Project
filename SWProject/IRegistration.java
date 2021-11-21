package SWProject;

public interface IRegistration {
    public void setUserInfo(DriverInfo info);
    public DriverInfo getUserInfo();
    public void setAccepted(boolean isAccepted);
    public boolean isAccepted();
}
