package SWProject;

public interface IRegistrationRequest {
    public void setUserInfo(UserInfo info);
    public UserInfo getUserInfo();
    public void setAccepted(boolean isAccepted);
    public boolean isAccepted();
}
