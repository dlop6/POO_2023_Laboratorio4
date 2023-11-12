package Model.BasicObjects;

import java.util.ArrayList;
import java.util.Hashtable;




public class User {

    private Hashtable<String, ArrayList<Bibli>> BibliList;
    public int DeAquiACuantosDias;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.BibliList = new Hashtable<String, ArrayList<Bibli>>();
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public Hashtable<String, ArrayList<Bibli>> getBibliList() {
        return this.BibliList;
    }

    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

    // General Methods

    public void EmptyList(){
        this.BibliList = new Hashtable<String, ArrayList<Bibli>>();
    }

    public void AddMagazine(Magazine Revista){
        if(this.BibliList.containsKey("Revistas")){
            this.BibliList.get("Revistas").add(Revista);
        }else{
            ArrayList<Bibli> list = new ArrayList<Bibli>();
            list.add(Revista);
            this.BibliList.put("Revistas", list);
        }
    }



}