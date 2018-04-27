/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Salle {
    
    private String nom, adresse;
    private int capacite;

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    
}
