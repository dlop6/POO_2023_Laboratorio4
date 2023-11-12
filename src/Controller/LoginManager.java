package Controller;

import Model.BasicObjects.Premiun;
import Model.BasicObjects.User;


import Model.BasicObjects.Estandar;
import view.ProfileView.EstandarView;
import view.ProfileView.PremiunView;

public class LoginManager {
    // LO puse en el UML pero si esta medio inutil
    public static boolean login(User user){
        if (user instanceof Premiun){
            try {
                PremiunView view = new PremiunView((Premiun) user);
                view.View();
                return true;
            } catch (Exception e) {
                System.err.println("Error al registrar usuario");
            }
        } else if (user instanceof Estandar){
            try {
                EstandarView view = new EstandarView((Estandar) user);
                view.View();
                return true;
            } catch (Exception e) {
                System.err.println("Error al registrar usuario");
            }
        }
        return false;
    }

    public static boolean ChangeUser(Estandar user){
        try {
            Premiun newUser = new Premiun(user.getName(), user.getPassword());
            PremiunView view = new PremiunView(newUser);
            view.View();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}