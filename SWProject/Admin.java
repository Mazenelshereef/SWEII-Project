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
            for(int i=0; i < SystemData.getInstance().getRegistrations().size(); i++){
                System.out.println((i+1) +":"+ SystemData.getInstance().getRegistrations().get(i));
            }
            if (SystemData.getInstance().getRegistrations().size() == 0)
            {
                System.out.println("You have no pending requests.");
                return false;
            }
            return true;   
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
