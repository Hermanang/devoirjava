
package exec;
import controller.Db_controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec {
    public static void main(String[] args) throws SQLException {
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisir le nom de la salle : ");
        String salle = clavier.nextLine();
        
        recherche(salle);
        // menu();
        
        
        
        //
        //plusMariage();
        
        
    }
    
    public static void menu(){
        Scanner saisi = new Scanner(System.in);
        int ok = 0, choix;
        
        do{
            System.out.println("1 ....");
            System.out.println("2 ....");
            System.out.println("3- Quitter");

            System.out.println("Choisir une option: ");
            choix = saisi.nextInt();
            
            switch(choix){
                case 1: 
                    break;
                case 2: 
                    break;
                case 3: 
                    ok = 1;
                    break;
                default: 
                    break;
            }
        }while(ok != 1);
    }
    
    public static List<Integer> tous_les_invites(int homme, int femme) throws SQLException{
        String sql = "SELECT ref_invite FROM mariage where ref_personne_1 ="+homme+" AND ref_personne_2="+femme;
        Db_controller db = new Db_controller();
        List<Integer> invite = new ArrayList<Integer>();
        ResultSet res = db.executeRequeteRslt(sql);
        
        if(res.next()){
            invite.add(res.getInt("ref_invite"));
            while(res.next()){
                invite.add(res.getInt("ref_invite"));
            }
        }
        return invite;
    }
    
    public static void recherche(String salle) throws SQLException{
        List<Integer> invite = new ArrayList<Integer>();
        String sql = "SELECT * FROM mariage group by ref_personne_1 having ref_salle = '"+salle+"' ";
        Db_controller db = new Db_controller();
        ResultSet res = db.executeRequeteRslt(sql);//tous_les_invites(4,4);
        
        System.out.println();
        if(res.next()){
            //list_comm.add(new Sujet(res.getInt("sujet_id"), res.getString("sujet_libelle")));
            System.out.println("Mariees : "+res.getInt("ref_personne_1")+" et "+res.getInt("ref_personne_2"));
            System.out.println("Salle : "+res.getString("ref_salle"));
            System.out.println("Date : "+res.getDate("date"));
            invite = tous_les_invites(res.getInt("ref_personne_1"),res.getInt("ref_personne_2"));
            System.out.println("Les invitees : ");
            for(int invit : invite){
                System.out.println(invit);
            }
            System.out.println("---------------------------------------------------------------------");
            while(res.next()){
                System.out.println("Mariees : "+res.getInt("ref_personne_1")+" et "+res.getInt("ref_personne_2"));
                System.out.println("Salle : "+res.getString("ref_salle"));
                System.out.println("Date : "+res.getDate("date"));
                invite = tous_les_invites(res.getInt("ref_personne_1"),res.getInt("ref_personne_2"));
                System.out.println("Les invitees : ");
                for(int invit : invite){
                    System.out.println(invit);
                }
                
                invite.clear();
                System.out.println("---------------------------------------------------------------------");
            }
        }else System.out.println("Salle inconnue");
        
    }
    
    public static void plusMariage() throws SQLException{
        String sql= "select * from mariage group by ref_personne_1 having count(ref_invite) > 2";
       
        Db_controller db = new Db_controller();
        ResultSet res = db.executeRequeteRslt(sql);//tous_les_invites(4,4);
        
        System.out.println();
        if(res.next()){
            //list_comm.add(new Sujet(res.getInt("sujet_id"), res.getString("sujet_libelle")));
            System.out.println(+res.getInt("ref_invite"));
            
            
            System.out.println("---------------------------------------------------------------------");
            while(res.next()){
                System.out.println(+res.getInt("ref_invite"));
                System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}