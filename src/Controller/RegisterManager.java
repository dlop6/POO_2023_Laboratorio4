package Controller;

import Model.BasicObjects.Premiun;

import java.io.IOException;

import Model.BasicObjects.Estandar;
import view.ProfileView.EstandarView;
import view.ProfileView.PremiunView;

public class RegisterManager {
    // LO puse en el UML pero si esta medio inutil
    public static boolean RegisterPremiun(Premiun user) throws IOException{
        try {
            PremiunView view = new PremiunView(user);
            view.View();
            return true;
        } catch (Exception e) {
        }
        return false;

    }

    public static boolean RegisterEstandar(Estandar user) throws IOException{
        try {
            EstandarView view = new EstandarView(user);
            view.View();
            return true;
        } catch (Exception e) {            
        }
        return false;

    }
}