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
public interface InterfaceEmploye {
    
   public int ajouter(Employe e);
   public int modifier(Employe e);
   public int supprimer(int id);
   public List<Employe> list();
   public Service get(int id);
   
    
    
}
