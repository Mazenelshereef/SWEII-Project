package SWProject;

public class DriverInfo extends UserInfo {
        private String licenseId, nationalId;
        
        public DriverInfo(String _licenseId, String _nationalId){
            this.licenseId = _licenseId;
            this.nationalId = _nationalId;
        }

        public DriverInfo(UserInfo obj){
            //copy data
        }

        public String getLicenseId() {
            return licenseId;
        }

        public String getNationalId() {
            return nationalId;
        }
    }


