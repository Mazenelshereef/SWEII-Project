package SWProject;

public interface IRegistration {
    public void setUserInfo(UserInfo info);
    public UserInfo getUserInfo();
    public void setAccepted(boolean isAccepted);
    public boolean isAccepted();
}
