package applicationtest1;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Service {
    private int code ;
    private String libelle ;

    public Service() {
    }

    public Service(int code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public int getCode() {
        return code;
    }

    public Service(String libelle) {
        this.libelle = libelle;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
