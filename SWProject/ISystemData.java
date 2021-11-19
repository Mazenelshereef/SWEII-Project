package SWProject;

import java.util.ArrayList;

public interface ISystemData {
   public ArrayList<IRegistration> getRequests();
   void addDriver(IDriver _driver);
   void removeDriver(IDriver _driver);
}
