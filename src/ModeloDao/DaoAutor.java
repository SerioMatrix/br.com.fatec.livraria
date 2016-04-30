/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;


/**
 *
 * @author Ezequiel
 */
import ModeloBeans.BeansAutor;
import ModeloConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class DaoAutor {
   
    ConexaoBD conex =new ConexaoBD();
    BeansAutor mod = new BeansAutor();
    
    public void Salvar(BeansAutor mod){
      /*conex.conexao();
      
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("insert into biblioteca values(?,?,?,?,?)");
       
        
        pst.setString(1,mod.getNome());
        pst.setString(2,mod.getSobrenome());
     
        pst.setString(5,mod.getLocnasc());
        pst.setString(5,mod.getLocmort());
        pst.execute();
         JOptionPane.showMessageDialog(null,"Dados nao inseridos corretamente");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Dados nao inseridos, ou inseridos incorretos"+ ex);
      
    }
    conex.desconecta();*/
}
    
    public void Excluir(BeansAutor mod){
      conex.conexao();
     
        try {
              PreparedStatement pst = conex.con.prepareStatement("delete from biblioteca where id_Autor=?");
        
      pst.setInt(1,mod.getId());
      pst.execute();
      JOptionPane.showMessageDialog(null,"Dados Excluido com sucesso");
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir:\n"+ ex.getMessage());
        }
     conex.desconecta();
    }
    
    public void Editar(BeansAutor mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("update Autor set nome=?, sobrenome=?, data_nascimento=?, data_morte=?, local_nascimento=?, local_morte=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSobrenome());
           
            pst.setString(5, mod.getLocnasc());
            pst.setString(6, mod.getLocmort());
            pst.execute();
               JOptionPane.showMessageDialog(null,"Dados Alterados com sucesso");
        }catch(SQLException  ex){
            
            JOptionPane.showMessageDialog(null," Erro ao alterar:\n"+ ex);
        }
        
    }
    
    public BeansAutor buscaAutor(BeansAutor mod){
          conex.conexao();
        conex.ExecutaSql("select *from autor where nomeAutor like '%"+mod.getPesquisa()+"%'"); //string sql por onde faz a pesquisa
        System.out.println("Entrou 1");
        try {
            conex.rs.first();
            System.out.println("Entrou 2");
           
          
           mod.setSobrenome(conex.rs.getString("sobrenomeAutor"));
          // mod.setDtnasc(conex.rs.getString("data_nasc"));
          mod.setDataNascimento(conex.rs.getDate("dataNascimento"));
          mod.setDataFalecimento(conex.rs.getDate("dataFalecimento"));
          // mod.setDtmort(conex.rs.getString("data_mort"));
          mod.setLocmort(conex.rs.getString("localFalecimento"));
         mod.setLocnasc(conex.rs.getString("localNascimento"));
         mod.setBibli(conex.rs.getString("Biblioteca"));
         
        // mod.setBibliografia(conex.rs.getText("asdasd"));
        
        // mod.setBibliografia(null);
         
           
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
        return mod;
        
    }
}
