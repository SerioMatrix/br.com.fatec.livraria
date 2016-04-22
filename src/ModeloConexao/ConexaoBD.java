/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloConexao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Ezequiel
 */
public class ConexaoBD {
    
   public Connection con;
   public Statement stm;
   public ResultSet rs;
   
   
        public Connection conexao(){ 
       try {
           Class.forName("com.mysql.jdbc.Driver");    
           con = DriverManager.getConnection("caminho","usuario","senha");
             System.out.println("conexao sucesso");
             } catch (Exception e) {
          System.out.println("Erro"+e);
       }
            return con;
        }
        
        public void ExecutaSql(String sql){
             try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao executar sql:\n"+ ex.getMessage());
             
        }
            
        }
        public void desconecta(){
       try {
           con.close();
       } catch (SQLException ex) {
           Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
        
        Statement creatStatemente(){
       throw new UnsupportedOperationException("Nao suportado");
   } 
   
}
