
public class LooseCoupling {
    public static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabase();
        UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());
    
        dataProvider = new WebServicesDataProvider();
        userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());
    }

}
