package SWProject;

public class DriverInfo extends UserInfo {
        public String licenseId, nationalId;
        DriverInfo(String _licenseId,String _nationalId){
            this.licenseId = _licenseId;
            this.nationalId = _nationalId;
        }

        public String getLicenseId() {
            return licenseId;
        }

        public String getNationalId() {
            return nationalId;
        }
    }


