/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationtest1;
import java.util.*;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ImplService implements InterfaceService {
private BD db = new BD();
	private int ok;
	private ResultSet rs;
    @Override
    public int ajouter(Service s) {
        //INSERT INTO `service`(`code`, `libelle`) VALUES ([value-1],[value-2])
String sql = "INSERT INTO vote VALUES(NULL, ?)";
		ok = 0;
		try {
			db.initPrepar(sql);
                        db.getPstm().setString(1, s.getLibelle());

			ok = db.executeMaj();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;

    }

    @Override
    public int modifier(Service s) {
        //UPDATE `service` SET `code`=[value-1],`libelle`=[value-2] WHERE 1
        String sql = "UPDATE `service` SET `libelle`=? WHERE code`=?";
               // String sql = "INSERT INTO vote VALUES(NULL, ?)";

		ok = 0;
		try {
			db.initPrepar(sql);
                        db.getPstm().setString(1, s.getLibelle());
                        db.getPstm().setInt(2, s.getCode());
                        

			ok = db.executeMaj();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;


            
            }

    @Override
    public int supprimer(String lib) {
                      //DELETE FROM `service` WHERE 1
String sql = "UPDATE `service` WHERE libelle`=?";
               // String sql = "INSERT INTO vote VALUES(NULL, ?)";

		ok = 0;
		try {
			db.initPrepar(sql);
                        db.getPstm().setString(1,lib);
                        

			ok = db.executeMaj();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;

    }

    @Override
    public List<Service> list() {
List<Service> listService = new ArrayList<Service>();
		String sql = "SELECT * FROM service";
		try {
                    db.initPrepar(sql);
                    rs = db.executeSelect();
                    while(rs.next()) {
				Service serv = new Service();
				serv.setCode(rs.getInt(1));
				serv.setLibelle(rs.getString(2));
				
				listService.add(serv);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listService;
	}

    @Override
    public Service get(String lib) {
Service serv = new Service();
String sql = "SELECT * FROM service where libelle=?";
		try {
                    db.initPrepar(sql);
		    db.getPstm().setString(1, lib);
		    rs = db.executeSelect();
                    while(rs.next()) {
				serv.setCode(rs.getInt(1));
				serv.setLibelle(rs.getString(2));
				
                    }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
return serv; 


    }

    
    
    
    
    
    }

 








    
    

