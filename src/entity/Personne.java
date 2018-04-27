
package entity;

public class Personne {
    
    private int id, code;
    private String nom, sexe;

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
    
}
