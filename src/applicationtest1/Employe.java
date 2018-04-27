/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationtest1;
import java.util.*;

/**
 *
 * @author HP
 */
public class Employe {
    
private int id ;
private String nom;
private String sexe;
private int anciennete;
private double salaire;
private Service s;
    public Employe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Service getS() {
        return s;
    }

    public void setS(Service s) {
        this.s = s;
    }

    public Employe(String nom, String sexe, int anciennete, double salaire, Service s) {
        this.nom = nom;
        this.sexe = sexe;
        this.anciennete = anciennete;
        this.salaire = salaire;
        this.s = s;
    }

    
}

