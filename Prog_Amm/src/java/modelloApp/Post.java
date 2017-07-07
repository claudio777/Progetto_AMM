/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelloApp;

/**
 *
 * @author Albe
 */
public class Post {
    private int id=0;
    private int postId;
    private String user;
    private String text;
    private String urlImage;
    private String link;
    
    public Post(String user,String text, String urlImage, String Link){
        id+=1;
        this.postId=id;
        this.user=user;
        this.text=text;
        this.urlImage=urlImage;
        this.link=link;
    }
    
    public int getId(){
        return postId;
    }
        
    public String getUser(){
        return this.user;
    }
    
    public String getText(){
        return this.text;
    }
    
    public String getUrlImage(){
        return this.urlImage;
    }
    
    public String getLink(){
        return this.link;
    }
    
    public void setUser(String user){
        this.user=user;
    }
    
    public void setText(String text){
       this.text=text;
    }
    
    public void setUrlImage(String urlImage){
        this.urlImage=urlImage;
    }
    
    public void setLink(String link){
       this.link=link;
    }
}

