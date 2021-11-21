package SWProject;

public class Registration implements IRegistration {
	private DriverInfo userInfo;
    private boolean isAccepted;

    public Registration(DriverInfo info){
        userInfo = new DriverInfo(info);
        isAccepted = false;
    }

    @Override
    public String toString() {
        String output = "[Registration info: " + userInfo.toString() + "\tisAccepted=" + isAccepted + "]";
        return output;
    }

    @Override
    public void setUserInfo(DriverInfo info) {
        userInfo = info;
    }

    @Override
    public DriverInfo getUserInfo(){
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

