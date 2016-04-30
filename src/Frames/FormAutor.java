/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.PreparedStatement;
import ModeloBeans.BeansAutor;
import ModeloConexao.ConexaoBD;
import ModeloDao.DaoAutor;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.text.*;
import java.awt.event.*;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ezequiel
 */
public class FormAutor extends javax.swing.JFrame {
    
    
    BeansAutor mod = new BeansAutor();
    ConexaoBD conex = new ConexaoBD();
    DaoAutor control = new DaoAutor();
    Connection con = conex.conexao();

    /**
     * Creates new form InterfaceAutor
     */
    public FormAutor() {
        
        initComponents();
       

getContentPane().setBackground(new Color(00,18,30));
//164,199,242
//00,18,30


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salvar_autor = new javax.swing.JButton();
        btn_cancelar_autor = new javax.swing.JButton();
        btn_editar_autor = new javax.swing.JButton();
        btn_pesquisar_autor = new javax.swing.JButton();
        btn_excluir_autor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome_autor = new javax.swing.JTextField();
        txt_sobrenome_autor = new javax.swing.JTextField();
        txt_localnas = new javax.swing.JTextField();
        txt_localmort = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_bibliografia = new javax.swing.JTextArea();
        dataNascimento = new com.toedter.calendar.JDateChooser();
        dataFalecimento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(164, 199, 242));
        getContentPane().setLayout(null);

        btn_salvar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_salvar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_salvar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar_autor.setText("Salvar");
        btn_salvar_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_autorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar_autor);
        btn_salvar_autor.setBounds(60, 530, 90, 30);

        btn_cancelar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_cancelar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_cancelar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_autor.setText("Cancelar");
        getContentPane().add(btn_cancelar_autor);
        btn_cancelar_autor.setBounds(160, 530, 90, 30);

        btn_editar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_editar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_editar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar_autor.setText("Editar");
        getContentPane().add(btn_editar_autor);
        btn_editar_autor.setBounds(380, 530, 90, 30);

        btn_pesquisar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_pesquisar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_pesquisar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesquisar_autor.setText("Pesquisar");
        btn_pesquisar_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisar_autorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisar_autor);
        btn_pesquisar_autor.setBounds(480, 530, 100, 30);

        btn_excluir_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_excluir_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_excluir_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir_autor.setText("Excluir");
        getContentPane().add(btn_excluir_autor);
        btn_excluir_autor.setBounds(270, 530, 90, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 190, 80, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 180, 120, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Local falecimento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 260, 140, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Local Nascimento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 230, 140, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data Nascimento");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 230, 140, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Falecimento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 270, 130, 20);
        getContentPane().add(txt_nome_autor);
        txt_nome_autor.setBounds(110, 180, 147, 30);
        getContentPane().add(txt_sobrenome_autor);
        txt_sobrenome_autor.setBounds(500, 180, 153, 30);
        getContentPane().add(txt_localnas);
        txt_localnas.setBounds(500, 220, 151, 30);
        getContentPane().add(txt_localmort);
        txt_localmort.setBounds(500, 260, 150, 30);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(191, 1528, 0, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Cadastro de Autores");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(2102, 22, 258, 22);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(247, 147, 29));
        jLabel11.setText("Cadastro de Autores");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 60, 220, 23);

        txt_bibliografia.setColumns(20);
        txt_bibliografia.setRows(5);
        jScrollPane1.setViewportView(txt_bibliografia);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 390, 470, 96);

        dataNascimento.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(dataNascimento);
        dataNascimento.setBounds(170, 220, 160, 30);

        dataFalecimento.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(dataFalecimento);
        dataFalecimento.setBounds(170, 270, 160, 30);

        setSize(new java.awt.Dimension(746, 645));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvar_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_autorActionPerformed
         conex.conexao();
         
        try {
            PreparedStatement pst = con.prepareStatement("insert into autor (nomeAutor,sobrenomeAutor, dataNascimento, dataFalecimento,localNascimento,localFalecimento,bibliografia)values(?,?,?,?,?,?,?)");
            JOptionPane.showMessageDialog(null,"Dados inseridos corretamente");  
            pst.setString(1,txt_nome_autor.getText());
           pst.setString(2, txt_sobrenome_autor.getText());         
           pst.setString(3,((JTextField)dataNascimento.getDateEditor().getUiComponent()).getText());
           pst.setString(4,((JTextField)dataFalecimento.getDateEditor().getUiComponent()).getText());
           pst.setString(5, txt_localnas.getText());
           pst.setString(6,txt_localmort.getText());
           pst.setString(7, txt_bibliografia.getText());
            pst.execute();
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Dados nao inseridos, ou inseridos incorretos"+ ex);
        }
           
       
        
        /*
        mod.setNome(txt_nome_autor.getText());
        mod.setSobrenome(txt_sobrenome_autor.getText());
        mod.setLocnasc(txt_localnas.getText());
        mod.setLocmort(txt_localmort.getText());
        control.Salvar(mod);       
      */  
    }//GEN-LAST:event_btn_salvar_autorActionPerformed

    private void btn_pesquisar_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisar_autorActionPerformed
      mod.setPesquisa(txt_nome_autor.getText());//set dentro de pesquia oque usuario difitou
     BeansAutor model = control.buscaAutor(mod);
     //chama metodo e envia o modelo chamando por paramentro o que usuario digitou
     //faz pesquisa rece e fica salvo dentro de model o txt_nome vai ser setado dentro dele uma string que foi encontrado no banco
     txt_sobrenome_autor.setText(model.getSobrenome());
    
     
    // txt_datanasc.setText(model.getDtnasc());
     //txt_datamort.setText(model.getDtmort());
     dataNascimento.setDate(model.getDataNascimento());
     dataFalecimento.setDate(model.getDataFalecimento());
     txt_localmort.setText(model.getLocmort());
     txt_localnas.setText(model.getLocnasc());
     txt_bibliografia.setText(mod.getBibli());
     
     //txt_bibliografia.setText(toString())model.getBibliografia()));
        
    }//GEN-LAST:event_btn_pesquisar_autorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_autor;
    private javax.swing.JButton btn_editar_autor;
    private javax.swing.JButton btn_excluir_autor;
    private javax.swing.JButton btn_pesquisar_autor;
    private javax.swing.JButton btn_salvar_autor;
    private com.toedter.calendar.JDateChooser dataFalecimento;
    private com.toedter.calendar.JDateChooser dataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_bibliografia;
    private javax.swing.JTextField txt_localmort;
    private javax.swing.JTextField txt_localnas;
    private javax.swing.JTextField txt_nome_autor;
    private javax.swing.JTextField txt_sobrenome_autor;
    // End of variables declaration//GEN-END:variables
}
