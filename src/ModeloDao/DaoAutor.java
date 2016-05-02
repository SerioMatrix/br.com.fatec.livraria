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
import java.util.Date.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.soap.Text;
import Frames.FormAutor;
import java.text.*;
import java.text.Format;
import java.lang.*;
import java.sql.Date;
public class DaoAutor {
   
    ConexaoBD conex =new ConexaoBD();
    BeansAutor autor = new BeansAutor();
  
    public void Salvar(BeansAutor autor){
      conex.conexao();
        //inserir
        try {
              PreparedStatement pst = conex.con.prepareStatement("insert into autor (nomeAutor,sobrenomeAutor, dataNascimento,"
                      + " dataFalecimento,localNascimento,localFalecimento,bibliografia)values(?,?,?,?,?,?,?)");
                    //pst objeto
                    //inserir      
                    pst.setString(1,autor.getNome());
                    pst.setString(2,autor.getSobrenome());
                   // pst.setDate(3, new java.sql.Date(autor.getDataNasc().getTime()));//instancia java sql date (dentro passa o getData)
                    //pst.setDate(4, new java.sql.Date(autor.getDataFale().getTime()));
                    pst.setDate(3, new java.sql.Date(autor.getDataNascimento().getTime()));
                    pst.setDate(4, new java.sql.Date(autor.getDataFalecimento().getTime()));         
                    pst.setString(5,autor.getLocnasc());
                    pst.setString(6,autor.getLocmort());
                    pst.setString(7,autor.getBibliografia());
                    pst.execute();

     } catch (SQLException ex) {
            Logger.getLogger(DaoAutor.class.getName()).log(Level.SEVERE, null, ex);
        }  
     conex.desconecta();
}

    public void Excluir(BeansAutor autor){
      conex.conexao();
        try {
              PreparedStatement pst = conex.con.prepareStatement("delete from autor where idAutor=?");
                    pst.setInt(1,autor.getId());
                    pst.execute();
                        JOptionPane.showMessageDialog(null,"Dados Excluido com sucesso");
      } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Erro ao excluir:\n"+ ex.getMessage());
        }
      conex.desconecta();
    }
   
    public void Editar(BeansAutor autor){
      conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("update Autor set nomeAutor=?, sobrenomeAutor=?, dataNascimento=?, dataFalecimento=?, localNascimento=?, localFalecimento=?, bibliografia=? where idAutor=?");
                    pst.setString(1,autor.getNome());
                    pst.setString(2,autor.getSobrenome());
                   // pst.setDate(3, new java.sql.Date(autor.getDataNasc().getTime()));//instancia java sql date (dentro passa o getData)
                    //pst.setDate(4, new java.sql.Date(autor.getDataFale().getTime()));
                    pst.setDate(3, new java.sql.Date(autor.getDataNascimento().getTime()));
                    pst.setDate(4, new java.sql.Date(autor.getDataFalecimento().getTime()));         
                    pst.setString(5,autor.getLocnasc());
                    pst.setString(6,autor.getLocmort());
                    pst.setString(7,autor.getBibliografia());
                    pst.setInt(8,autor.getId());
                    pst.execute();
                         JOptionPane.showMessageDialog(null,"Dados Alterados com sucesso");
        }catch(SQLException  ex){
            JOptionPane.showMessageDialog(null," Erro ao alterar:\n"+ ex);
        }
      conex.desconecta();
    }
    

    public BeansAutor buscaAutor(BeansAutor autor){
      conex.conexao();
      conex.ExecutaSql("select *from autor where nomeAutor like '%"+autor.getPesquisa()+"%'"); //string sql por onde faz a pesquisa
        try {
            conex.rs.first();
                    autor.setId(conex.rs.getInt("idAutor"));
                    autor.setNome(conex.rs.getString("nomeAutor"));
                    autor.setSobrenome(conex.rs.getString("sobrenomeAutor"));
                    autor.setDataNascimento(conex.rs.getDate("dataNascimento"));
                    autor.setDataFalecimento(conex.rs.getDate("dataFalecimento"));
                    autor.setLocmort(conex.rs.getString("localFalecimento"));
                    autor.setLocnasc(conex.rs.getString("localNascimento"));
                    autor.setBibliografia(conex.rs.getString("bibliografia"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Autor nao econtrado!");            
        }
        return autor;
    }
}
