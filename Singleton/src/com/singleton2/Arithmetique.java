package com.singleton2;

public class Arithmetique {
    private static Arithmetique instance = null;
// D'autres attributs, classiques et non "static".
private int x;
private int y;
private String nom="maths";

    private Arithmetique(){
        super();
    }
     private Arithmetique  (int x, int y){
        this.x=x;
        this.y=y;
    }
     private Arithmetique  (String nom){
        this.nom=nom;
    }
    
    public static Arithmetique  getInstance(){
        
        if(instance==null){

            instance = new Arithmetique  ();
        }
       

            return instance;
        
    }

    public static Arithmetique  getInstance(int x, int y){
        
        if(instance==null){

            instance = new Arithmetique  (x,y);
        }
       

            return instance;
        
    }
       public static Arithmetique  getInstance(String nom){
        
        if(instance==null){

            instance = new Arithmetique  (nom);
        }
       

            return instance;
        
    }

// D'autres méthodes classiques et non "static".
    public int somme(int x, int y)
    {
        return x+y;
    }

    public float moyenne(int x, int y)
    {

    return somme(x, y)/2;
    }


    public void affiche()
    {

    System.out.println(" \t Je suis une instance mesvaleurs sont : x = " + this.x + " et y = " +
    this.y+"\t\tNAME="+this.nom);

    }


    @Override
    public Object clone() throws
    CloneNotSupportedException {

    throw new CloneNotSupportedException();
    }

}
