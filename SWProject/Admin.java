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
        
        @Override
        public void listPendingRegistrations(){
            for(int i=0; i < SystemData.getInstance().getRegistrations().size(); i++){
                System.out.println((i+1) +":"+ SystemData.getInstance().getRegistrations().get(i));
            }
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
