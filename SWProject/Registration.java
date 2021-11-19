package SWProject;

public class Registration implements IRegistration {
	private UserInfo userInfo;
    private boolean isAccepted;

    public Registration(UserInfo info){
        userInfo = new DriverInfo(/*info*/);
    }
    
    public UserInfo getUserInfo(){
        return userInfo;
    }
    @Override
    public String toString() {
        return "Registration info:";
    }

    @Override
    public void setUserInfo(UserInfo info) {
        userInfo = info;
    }

    @Override
    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
        
    }

    @Override
    public boolean isAccepted() {
        return isAccepted;
    }

}
