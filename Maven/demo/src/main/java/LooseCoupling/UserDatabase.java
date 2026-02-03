//A - mysql database/ postgresql database/ oracle database
//B - Web service

public class UserDatabase implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User details from database";
    }
}
