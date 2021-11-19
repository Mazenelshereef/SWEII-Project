package SWProject;

public class Registration implements IRegistration {
    IDriver driver;
    String licenseId;
    String nationalId;

    public void setDriver(IDriver driver) {
        this.driver = driver;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public IDriver getDriver() {
        return driver;
    }
}

