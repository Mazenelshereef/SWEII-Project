package SWProject;

public class Registration implements IRegistration {
	private UserInfo userInfo;
    private boolean isAccepted;

    public Registration(UserInfo info){
        userInfo = new DriverInfo((DriverInfo)info);
        isAccepted = false;
    }

    @Override
    public String toString() {
        String output = "[Registration info: " + userInfo.toString() + "\tisAccepted=" + isAccepted + "]";
        return output;
    }

    @Override
    public void setUserInfo(UserInfo info) {
        userInfo = info;
    }

    @Override
    public UserInfo getUserInfo(){
        return userInfo;
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

