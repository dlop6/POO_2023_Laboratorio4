package Model.BasicObjects;


import java.util.ArrayList;

import Model.BasicObjects.IBasicObjects.ItemsManager;
import Model.BasicObjects.IBasicObjects.BorrowingManager;

public class Estandar extends User implements ItemsManager, BorrowingManager{
    private boolean Hour12Later; // Si es falso sera 24 horas y si es verdadero sera 12 horas
    private String Sucursal;

    public Estandar(String name, String password){
        super(name, password);
    }

    // Getters
    public boolean getHour12Later(){
        return this.Hour12Later;
    }
    public String getSucursal(){
        return this.Sucursal;
    }

    // Setters
    public void setHour12Later(boolean Hour12Later){
        this.Hour12Later = Hour12Later;
    }
    public void setSucursal(String Sucursal){
        this.Sucursal = Sucursal;
    }


    // Methods

    @Override
    public boolean AddBook(Book book) {
        if (this.getBibliList().get("Books").size() <= 3){
            if(this.getBibliList().containsKey("Books")){
                this.getBibliList().get("Books").add(book);
                return true;
            }else{
                ArrayList<Bibli> list = new ArrayList<Bibli>();
                list.add(book);
                this.getBibliList().put("Books", list);
                return true;
            }
        }
        return false;
    }

    @Override
    public String ShowList(){
        String list = "";
        for(String key : this.getBibliList().keySet()){
            list += key + "\n";
            for (Bibli bibli : this.getBibliList().get(key)){
                list += bibli.getTitle() + "\n";
            }
        }
        return list;
    }

}