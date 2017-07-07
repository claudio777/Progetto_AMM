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
public class Gruppi {
    private int id=0;
    private int gruppoId;
    private String gruppoName;    
    private ArrayList<Utenti> membri;
    private Utenti creatore;
    
    public Gruppi(String name,Utenti creatore){
        id+=1;
        this.gruppoId=id;
        this.creatore=creatore;
        this.membri.add(creatore);
    }
    
    public int getId(){
        return gruppoId;
    }
        
    public String getGruppoName(){
        return this.gruppoName;
    }
    
    public void setGruppoName(String gruppoName){
        this.gruppoName=gruppoName;
    }
    
    public ArrayList<Utenti> getMembri(){
        return this.membri;
    }
    
    public void addMembri(Utenti newIscritto){
        this.membri.add(newIscritto);  
    }
    
}
