package SWProject;

public interface IRegistration {
    public void setDriver(IDriver driver);
    public void setLicenseId(String licenseId);
    public void setNationalId(String nationalId);
    public String getNationalId();
    public String getLicenseId();
    public IDriver getDriver();

    public void setUserInfo(UserInfo info);
    public UserInfo getUserInfo();
    public void setAccepted(boolean isAccepted);
    public boolean isAccepted();
}
