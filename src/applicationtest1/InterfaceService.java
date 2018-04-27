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
public interface InterfaceService {
    
   public int ajouter(Service s);
   public int modifier(Service s);
   public int supprimer(String lib);
   public List<Service> list();
   public Service get(String lib);
    
}
