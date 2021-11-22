package SWProject;

public class DriverInfo extends UserInfo {
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

        public DriverInfo(String username, String password, String email, String mobileNumber, String licenseId, String nationalId){
            this.username = username;
            this.password = password;
            this.email = email;
            this.mobileNumber = mobileNumber;
            this.isSuspended = false;
            this.licenseId = licenseId;
            this.nationalId = nationalId;
        }

        //to make email optional
        public DriverInfo(String username, String password, String mobileNumber, String licenseId, String nationalId){
            this.username = username;
            this.password = password;
            this.email = "*not determined*";
            this.mobileNumber = mobileNumber;
            this.isSuspended = false;
            this.licenseId = licenseId;
            this.nationalId = nationalId;
        }

        public DriverInfo(){
            this.email = "*not determined*";
            this.isSuspended = false;
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
            return "Driver info [username=" + username + ", email=" + email + ", mobile number=" + mobileNumber 
                + ", isSuspended=" + isSuspended + ", licenseID=" + licenseId + ", nationalID=" + nationalId + "]";
        }
    }


