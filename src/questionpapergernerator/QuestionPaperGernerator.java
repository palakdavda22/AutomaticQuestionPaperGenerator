/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionpapergernerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class QuestionPaperGernerator {

    /**
     * @param args the command line arguments
     */
    
    public static Connection connectDB(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questionpaper","root","");
            JOptionPane.showMessageDialog(null,"Connection Succcessful","Connection", JOptionPane.INFORMATION_MESSAGE);
            return con;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Connection UnSuccessful"+ e.getMessage(),"Connection", JOptionPane.INFORMATION_MESSAGE);
            return null;

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Connection UnSuccessful   hi"+ e.getMessage(),"Connection", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
