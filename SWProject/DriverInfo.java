package SWProject;

public class DriverInfo extends UserInfo implements IDriverInfo {
        private String licenseId, nationalId;

        public DriverInfo(DriverInfo obj){
            this.username = obj.username;
            this.password = obj.password;
            this.email = obj.email;
            this.mobileNumber = obj.mobileNumber;
            this.isSuspended = obj.isSuspended;
            this.licenseId = obj.licenseId;
            this.nationalId = obj.nationalId;
        }

        public void setLicenseId(String licenseId) {
            this.licenseId = licenseId;
        }

        public void setNationalId(String nationalId) {
            this.nationalId = nationalId;
        }

        public String getLicenseId() {
            return licenseId;
        }

        public String getNationalId() {
            return nationalId;
        }

        @Override
        public String toString() {
            return "[Driver info: username=" + username + "\temail=" + email + "\tmobile number=" + mobileNumber 
                + "\tisSuspended=" + isSuspended + "\tlicenseID=" + licenseId + "\tnationalID=" + nationalId + "]";
        }
    }


