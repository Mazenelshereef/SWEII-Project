package SWProject;

public class AdminAuthenticator implements ILoginAuthenticator {

    private static AdminAuthenticator instance;

    private AdminAuthenticator(){}

    public static AdminAuthenticator getInstance(){
        if (instance == null)
            instance = new AdminAuthenticator();
        return instance;
    }

    @Override
    public IUser login(String username, String password) {
        if (SystemData.getInstance().getAdmin().getUsername().equals(username) && SystemData.getInstance().getAdmin().getPassword().equals(password))
            return SystemData.getInstance().getAdmin();
        return null;
    }
    
}
