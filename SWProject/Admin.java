package SWProject;

public class Admin implements IAdmin {
        String username, password;

        Admin(String username , String password) {
            this.username = username;
            this.password = password;
        }

        @Override
        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public  String getUsername() {
            return username;
        }

        @Override
        public String getPassword() {
            return password;
        }
        
        //returns false if there are no requests, true otherwise.
        @Override
        public boolean listPendingRegistrations(){
            if (SystemData.getInstance().displayAllRegistrations())
                return true;
            System.out.println("You have no pending requests.");
            return false;  
        }

        @Override
        public void verifyDriverRegistration(IRegistrationRequest request){
            DriverAuthenticator.getInstance().recieveRequestResponce(request, true);
        }

        @Override
        public void denyDriverRegistration(IRegistrationRequest request){
            DriverAuthenticator.getInstance().recieveRequestResponce(request, false);        }

        @Override
        public void suspendUser(ISuspendableUser user){
            user.setSuspended(true);
        }
        
        @Override
        public void unsuspendUser(ISuspendableUser user){
            user.setSuspended(false);
        }
}
