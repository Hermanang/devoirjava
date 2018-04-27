/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationtest1;

import java.sql.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class BD {
   private Connection cnx;
	private ResultSet rs;
	private PreparedStatement pstm;
	private int ok;
	
	private void getConnexion() {
		String url = "jdbc:mysql://localhost:3306/bdservice";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void initPrepar(String sql) {
		try {
			getConnexion();
			pstm = cnx.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int executeMaj() {
		ok = 0;
		try {
			ok = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	public ResultSet executeSelect() {
		try {
			rs = pstm.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public PreparedStatement getPstm() {
		return this.pstm;
	} 
}
