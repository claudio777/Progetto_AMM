/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelloApp;
import java.util.ArrayList;

/**
 *
 * @author Albe
 */
public class Utenti {
    private int id=0;
    private int userId;
    private String name;
    private String surname;
    private String urlPropic;
    private String password;
    private String descrizione;
    private String compleanno;
    
    private ArrayList<Post> posts;
    private ArrayList<Utenti> friends;
    private ArrayList<Gruppi> gruppi;

    public Utenti(String name, String surname, String urlPropic, String Password, 
                  String descrizione, String compleanno){
        id+=1;
        this.userId=id;
        this.name=name;
        this.surname=surname;
        this.urlPropic=urlPropic;
        this.password=password;
        this.descrizione=descrizione;
        this.compleanno=compleanno;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public void setSurname(String surname){
        this.surname=surname;
    }
    
    public String getUrlPropic(){
        return this.urlPropic;
    }
    
    public void setUrlPropic(String urlPropic){
        this.urlPropic=urlPropic;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    public String getDescrizione(){
        return this.descrizione;
    }
    
    public void setDescrizione(String name){
        this.name=name;
    }
    
    public String getCompleanno(){
        return this.compleanno;
    }
    
    public void setCompleanno(String compleanno){
        this.compleanno=compleanno;
    }
    
    public ArrayList<Post> getPosts(){
        return this.posts;
    }
    
    public void addPost(Post post){
        this.posts.add(post);
    }
    
    public ArrayList<Gruppi> getGruppi(){
        return this.gruppi;
    }
    
    public void addGruppi(Gruppi gruppo){
        this.gruppi.add(gruppo);
    }
    
    public ArrayList<Utenti> getFriends(){
        return this.friends;
    }
    
    public void addFriends(Utenti friend){
        this.friends.add(friend);
    }
}


