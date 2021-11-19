package SWProject;

public abstract class UserInfo {

        protected String username, mobileNumber, email, password;
        protected boolean isSuspended;

        public void setEmail(String email) {
            this.email = email;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setSuspended(boolean suspended) {
            this.isSuspended = suspended;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public String getPassword() {
            return password;
        }

        public String getUsername() {
            return username;
        }

        public boolean getSuspended() {
            return isSuspended;
        }
    }

