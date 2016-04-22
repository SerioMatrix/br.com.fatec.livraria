/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import ModeloBeans.BeansAutor;
import ModeloConexao.ConexaoBD;
import ModeloDao.DaoAutor;
import java.awt.Color;

/**
 *
 * @author Ezequiel
 */
public class FormAutor extends javax.swing.JFrame {
    
    
    BeansAutor mod = new BeansAutor();
    ConexaoBD conex = new ConexaoBD();
    DaoAutor control = new DaoAutor();

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
        txt_datanasc = new javax.swing.JFormattedTextField();
        txt_localnas = new javax.swing.JTextField();
        txt_datamort = new javax.swing.JFormattedTextField();
        txt_localmort = new javax.swing.JTextField();
        txt_id_autor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        btn_salvar_autor.setBounds(60, 340, 90, 30);

        btn_cancelar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_cancelar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_cancelar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_autor.setText("Cancelar");
        getContentPane().add(btn_cancelar_autor);
        btn_cancelar_autor.setBounds(160, 340, 90, 30);

        btn_editar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_editar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_editar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar_autor.setText("Editar");
        getContentPane().add(btn_editar_autor);
        btn_editar_autor.setBounds(380, 340, 90, 30);

        btn_pesquisar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_pesquisar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_pesquisar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesquisar_autor.setText("Pesquisar");
        getContentPane().add(btn_pesquisar_autor);
        btn_pesquisar_autor.setBounds(190, 130, 100, 30);

        btn_excluir_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_excluir_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_excluir_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir_autor.setText("Excluir");
        getContentPane().add(btn_excluir_autor);
        btn_excluir_autor.setBounds(270, 340, 90, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 190, 80, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobrenome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 180, 120, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Local falecimento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 260, 140, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Local Nascimento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 230, 140, 20);

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
        txt_sobrenome_autor.setBounds(390, 180, 153, 30);

        txt_datanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(txt_datanasc);
        txt_datanasc.setBounds(170, 220, 87, 30);
        getContentPane().add(txt_localnas);
        txt_localnas.setBounds(390, 220, 151, 30);

        txt_datamort.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(txt_datamort);
        txt_datamort.setBounds(170, 260, 85, 30);
        getContentPane().add(txt_localmort);
        txt_localmort.setBounds(390, 260, 150, 30);
        getContentPane().add(txt_id_autor);
        txt_id_autor.setBounds(120, 130, 55, 30);
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

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 130, 50, 30);

        setSize(new java.awt.Dimension(631, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvar_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_autorActionPerformed
        mod.setId(Integer.parseInt(txt_id_autor.getText()));
        mod.setNome(txt_nome_autor.getText());
        mod.setSobrenome(txt_sobrenome_autor.getText());
        mod.setDtnasc(txt_datanasc.getText());
        mod.setDtmort(txt_datamort.getText());
        mod.setLocnasc(txt_localnas.getText());
        mod.setLocmort(txt_localmort.getText());
        control.Salvar(mod);       
        
    }//GEN-LAST:event_btn_salvar_autorActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txt_datamort;
    private javax.swing.JFormattedTextField txt_datanasc;
    private javax.swing.JTextField txt_id_autor;
    private javax.swing.JTextField txt_localmort;
    private javax.swing.JTextField txt_localnas;
    private javax.swing.JTextField txt_nome_autor;
    private javax.swing.JTextField txt_sobrenome_autor;
    // End of variables declaration//GEN-END:variables
}