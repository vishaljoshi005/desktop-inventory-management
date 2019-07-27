package inventoryManagement;
import java.awt.Container;
import java.sql.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;


public class Stockss extends JFrame {
	   JTable table;
	            Stockss(){	
	            	 setTitle("New Delivery");
	     			setVisible(true);
	     			setLocation(370,30);
	     			setSize(580,700);
	    			setLayout(null);
	    			Container c =getContentPane();
	     			try{
	    			Class.forName("com.mysql.jdbc.Driver");
	            	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","root");
	                Statement stmt = conn.createStatement();

	                ResultSet rs = stmt.executeQuery("select * from stock");
	                
	                ;
	                table.setModel(DbUtils.resultSetToTableModel(rs));
	                conn.close();

	     			}catch(Exception e){
	     				e.printStackTrace();
	     			}

	                // It creates and displays the table
	               
	                // Closes the Connection
	     			c.add(table);
	                JOptionPane.showMessageDialog(null, new JScrollPane(table));
 }
			
			 public static void main(String[] args)throws Exception {
			new Stockss();

	}
			 }


