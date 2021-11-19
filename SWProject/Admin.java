package SWProject;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class Admin {
        ISystemData sys;
        String username, password;
        Admin(String username , String password) {
            this.username = username;
            this.password = password;
        }

        public  String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
        void listPendingRegistrations(){
            for(int i=0; i<= sys.getRequests().size(); i++){
                System.out.println(i+1 +":"+ sys.getRequests().get(i));
            }

        }
        void verifyDriverRegistration(IRegistration request){
            sys.addDriver(request.getDriver());
        }
        void denyDriverRegistration(IRegistration request){
            sys.removeDriver(request.getDriver());
        }
        void suspendUser(UserInfo user){
            user.setSuspended(true);
        }
        void unsuspendUser(UserInfo user){
            user.setSuspended(false);
        }

}
