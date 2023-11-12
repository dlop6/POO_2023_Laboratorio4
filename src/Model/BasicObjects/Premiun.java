package Model.BasicObjects;


import java.util.ArrayList;

import Model.BasicObjects.IBasicObjects.ItemsManager;
import Model.BasicObjects.IBasicObjects.BorrowingManager;

public class Premiun extends User implements ItemsManager, BorrowingManager{
    private String HoraDeEntrega; // (00:00)
    private String Domicilio; 
    private boolean Cupon = false;

    public Premiun(String name, String password){
        super(name, password);
    }

    // Getters
    public String getHoraDeEntrega(){
        return this.HoraDeEntrega;
    }
    public String getDomicilio(){
        return this.Domicilio;
    }
    public boolean getCupon(){
        return this.Cupon;
    }

    // Setters
    public void setHoraDeEntrega(String HoraDeEntrega){
        this.HoraDeEntrega = HoraDeEntrega;
    }
    public void setDomicilio(String Domicilio){
        this.Domicilio = Domicilio;
    }

    // Methods
    public void ApplyCupon(){
        this.Cupon = true;
    }

    @Override
    public boolean AddBook(Book book) {
        if (this.getBibliList().get("Books").size() <= 5){

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