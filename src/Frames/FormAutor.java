/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.PreparedStatement;
import ModeloBeans.BeansAutor;
import ModeloBeans.ModeloTabela;
import ModeloConexao.ConexaoBD;
import ModeloDao.DaoAutor;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.text.*;
import java.awt.event.*;
import java.io.File;
import java.util.Calendar;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date.*;


/**
 *
 * @author Ezequiel
 */
public class FormAutor extends javax.swing.JFrame {
    
    
    BeansAutor autor = new BeansAutor();
    ConexaoBD conex = new ConexaoBD();
    DaoAutor control = new DaoAutor();
   
        Connection con = conex.conexao();
        int cont=0;
            
    //Connection con = conex.conexao();
    /**
     * Creates new form InterfaceAutor
     */
    public FormAutor() {
        
        initComponents();
        //preencherTabelaAutor("select *from autor order by nomeAutor");
        bloqueiaCampos();
       

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

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome_autor = new javax.swing.JTextField();
        date_fale = new com.toedter.calendar.JDateChooser();
        txt_id = new javax.swing.JTextField();
        txt_localmort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        date_Nasc = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_localnas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_bibliografia = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txt_pesquisa = new javax.swing.JTextField();
        btn_pesquisar_autor = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn__salvar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_autor = new javax.swing.JTable();
        txt_sobrenome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(164, 199, 242));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(191, 1528, 0, 0);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Cadastro de Autores");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(2102, 22, 258, 22);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(247, 147, 29));
        jLabel11.setText("Cadastro de Autores");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 20, 270, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 51, 76));
        jLabel5.setText("Data Nascimento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 120, 140, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 51, 76));
        jLabel6.setText("Data Falecimento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 150, 130, 20);
        jPanel1.add(txt_nome_autor);
        txt_nome_autor.setBounds(130, 60, 240, 35);

        date_fale.setDateFormatString("yyyy/MM/dd");
        date_fale.setName("JDateChooser2"); // NOI18N
        jPanel1.add(date_fale);
        date_fale.setBounds(210, 150, 160, 35);
        jPanel1.add(txt_id);
        txt_id.setBounds(130, 20, 80, 35);
        jPanel1.add(txt_localmort);
        txt_localmort.setBounds(540, 150, 170, 35);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 51, 76));
        jLabel2.setText("Sobrenome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 60, 120, 30);

        date_Nasc.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(date_Nasc);
        date_Nasc.setBounds(210, 110, 160, 35);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 51, 76));
        jLabel3.setText("Bibliografia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 430, 140, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 51, 76));
        jLabel4.setText("Local Nascimento");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 110, 140, 20);
        jPanel1.add(txt_localnas);
        txt_localnas.setBounds(540, 110, 170, 35);

        txt_bibliografia.setColumns(20);
        txt_bibliografia.setRows(5);
        jScrollPane1.setViewportView(txt_bibliografia);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 450, 680, 200);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 51, 76));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 80, 20);
        jPanel1.add(txt_pesquisa);
        txt_pesquisa.setBounds(70, 210, 430, 35);

        btn_pesquisar_autor.setBackground(new java.awt.Color(247, 147, 29));
        btn_pesquisar_autor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_pesquisar_autor.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesquisar_autor.setText("Pesquisar");
        btn_pesquisar_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisar_autorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesquisar_autor);
        btn_pesquisar_autor.setBounds(530, 210, 100, 35);

        btn_editar.setBackground(new java.awt.Color(247, 147, 29));
        btn_editar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editar);
        btn_editar.setBounds(600, 660, 90, 35);

        btn_novo.setBackground(new java.awt.Color(247, 147, 29));
        btn_novo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_novo);
        btn_novo.setBounds(70, 660, 90, 35);

        btn__salvar.setBackground(new java.awt.Color(247, 147, 29));
        btn__salvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn__salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn__salvar.setText("Salvar");
        btn__salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn__salvarActionPerformed(evt);
            }
        });
        jPanel1.add(btn__salvar);
        btn__salvar.setBounds(210, 660, 90, 35);

        btn_excluir.setBackground(new java.awt.Color(247, 147, 29));
        btn_excluir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_excluir);
        btn_excluir.setBounds(480, 660, 90, 35);

        btn_cancelar.setBackground(new java.awt.Color(247, 147, 29));
        btn_cancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(350, 660, 90, 35);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 51, 76));
        jLabel7.setText("Local falecimento");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 160, 140, 20);

        tabela_autor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela_autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_autorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela_autor);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(70, 260, 680, 170);
        jPanel1.add(txt_sobrenome);
        txt_sobrenome.setBounds(500, 60, 210, 35);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 51, 76));
        jLabel10.setText("Nome");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 60, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 60, 810, 720);

        setSize(new java.awt.Dimension(911, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn__salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn__salvarActionPerformed
        if(cont==1){
            
        
            autor.setNome(txt_nome_autor.getText());
            autor.setSobrenome(txt_sobrenome.getText());
            autor.setLocmort(txt_localmort.getText());
            autor.setLocnasc(txt_localnas.getText());
            autor.setBibliografia(txt_bibliografia.getText());
            autor.setDataNascimento(date_Nasc.getDate());
            autor.setDataFalecimento(date_fale.getDate());

            //Salvar
            control.Salvar(autor);
            preencherTabelaAutor("Select *from autor order by nomeAutor");

              // pst.setString(3,((JTextField)date_Nasc.getDateEditor().getUiComponent()).getText());
               //pst.setString(4,((JTextField)date_fale.getDateEditor().getUiComponent()).getText());

            limpaCampos();
            bloqueiaCampos();
        }else{
            if(cont ==2){
            JOptionPane.showMessageDialog(null,"ENTROIUUU");
            autor.setId(Integer.parseInt(txt_id.getText()));
            autor.setNome(txt_nome_autor.getText());
            autor.setSobrenome(txt_sobrenome.getText());
            autor.setLocmort(txt_localmort.getText());
            autor.setLocnasc(txt_localnas.getText());
            autor.setBibliografia(txt_bibliografia.getText());
            autor.setDataNascimento(date_Nasc.getDate());
            autor.setDataFalecimento(date_fale.getDate());
            control.Editar(autor);
             preencherTabelaAutor("select *from autor order by nomeAutor");
            limpaCampos();
            bloqueiaCampos();
            }
        }
    
        
    }//GEN-LAST:event_btn__salvarActionPerformed

    private void btn_pesquisar_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisar_autorActionPerformed
        if(txt_pesquisa.getText().equals("")){
            preencherTabelaAutor("select *from autor order by nomeAutor");
        }else{

            autor.setPesquisa(txt_pesquisa.getText());
            BeansAutor model = control.buscaAutor(autor);
            //chama metodo e envia o modelo chamando por paramentro o que usuario digitou
            //faz pesquisa rece e fica salvo dentro de model o txt_nome vai ser setado dentro dele uma string que foi encontrado no banco
            txt_nome_autor.setText(model.getNome());
            txt_sobrenome.setText(model.getSobrenome());
            date_Nasc.setDate(model.getDataNascimento());
            date_fale.setDate(model.getDataFalecimento());
            txt_localmort.setText(model.getLocmort());
            txt_localnas.setText(model.getLocnasc());    
            txt_bibliografia.setText(model.getBibliografia());
            preencherTabelaAutor("select *from autor where nomeAutor like '%"+autor.getPesquisa()+"%'");
        } 
        
    }//GEN-LAST:event_btn_pesquisar_autorActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
            cont = 1;//se cont 1 significa que é novo registro 
            txt_bibliografia.setEnabled(true);
            txt_nome_autor.setEnabled(true);
            txt_localnas.setEnabled(true);
            txt_sobrenome.setEnabled(true);
            txt_localmort.setEnabled(true) ;
            date_Nasc.setEnabled(true);
            date_fale.setEnabled(true);
            btn__salvar.setEnabled(true);
            btn_cancelar.setEnabled(true);
       
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
            cont =2; //que o registra sera editado
            mostraCampos();
            btn_excluir.setEnabled(false);
            btn_editar.setEnabled(false);
            btn__salvar.setEnabled(true);
            btn_cancelar.setEnabled(true);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
            bloqueiaCampos();
            limpaCampos();

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tabela_autorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_autorMouseClicked
        //String nome_autor=""+tabela_autor.getValueAt(tabela_autor.getSelectedRow(),1 );
        String id=""+tabela_autor.getValueAt(tabela_autor.getSelectedRow(),0);
        conex.conexao();
        conex.ExecutaSql("select *from autor where idAutor='"+id+"'");
           try {
                //filtra primeiro resultado
                conex.rs.first();
                //povoa textfield
                //converte para string
                txt_id.setText(conex.rs.getString("idAutor"));
                txt_nome_autor.setText(conex.rs.getString("nomeAutor"));
                txt_sobrenome.setText(conex.rs.getString("sobrenomeAutor"));
                date_Nasc.setDate(conex.rs.getDate("dataNascimento"));
                date_fale.setDate(conex.rs.getDate("dataFalecimento"));
                txt_localmort.setText(conex.rs.getString("localFalecimento"));
                txt_localnas.setText(conex.rs.getString("localNascimento"));
                txt_bibliografia.setText(conex.rs.getString("bibliografia"));
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao selecionar dados"+ex.getMessage());
           }
        
        conex.desconecta();
        btn_editar.setEnabled(true);
        btn_excluir.setEnabled(true);
     
    }//GEN-LAST:event_tabela_autorMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int resp =0; //declara variavel
        resp=JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir:?");// resp recebe confirma dailog
        if(resp==JOptionPane.YES_OPTION){ //se resp yes seta dados na tela
            autor.setId(Integer.parseInt(txt_id.getText())); //recepe e seta
            control.Excluir(autor);// passa por parameto passando o metodo excluir
            preencherTabelaAutor("select *from autor order by nomeAutor");
            limpaCampos();
            bloqueiaCampos();
    }
    }//GEN-LAST:event_btn_excluirActionPerformed

    
    public void preencherTabelaAutor(String Sql){

       ArrayList dados = new ArrayList();
       String [] Colunas = new String[]{"ID","Nome","Sobrenome","Nascimento","Falecimento","Local de Nascimento","Local de Falecimento"};
       conex.conexao();
       conex.ExecutaSql(Sql);;
           try {
                conex.rs.first(); //SETA PRIMEIRO REGISTRO        
          do{//em cada coluna ele percorre ate o fim
                //adiciona dados
                dados.add(new Object[]{conex.rs.getInt("idAutor"),conex.rs.getString("nomeAutor"),conex.rs.getString("sobrenomeAutor"),
                conex.rs.getDate("dataNascimento"),conex.rs.getDate("dataFalecimento"),
                conex.rs.getString("localNascimento"),conex.rs.getString("localFalecimento")});
       }while(conex.rs.next());//enquanto houver dados ele ira percorrer
      }catch(SQLException ex){
          //JOptionPane.showMessageDialog(null,"Erro ao preencher tabela" +ex);
      }
      
           ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        //instancia modelo que criado em bens e passa a quantidade de linhas e colunas
           tabela_autor.setModel(modelo);
        
                   
            //id
           tabela_autor.getColumnModel().getColumn(0).setPreferredWidth(40);
           //                        primeiro registro tamanho da tabela 23
           tabela_autor.getColumnModel().getColumn(0).setResizable(false);
                   //                 não pode mexer no tamanho redmencionar
            //nome
           tabela_autor.getColumnModel().getColumn(1).setPreferredWidth(120);
           //                        primeiro registro tamanho da tabela 23
           tabela_autor.getColumnModel().getColumn(1).setResizable(false);
                   //                 não pode mexer no tamanho redmencionar
           //sobrenome
            tabela_autor.getColumnModel().getColumn(2).setPreferredWidth(120);
           tabela_autor.getColumnModel().getColumn(2).setResizable(false);          
           //data Nascimento
           tabela_autor.getColumnModel().getColumn(3).setPreferredWidth(80);
           tabela_autor.getColumnModel().getColumn(3).setResizable(false);
           //data morte
           tabela_autor.getColumnModel().getColumn(4).setPreferredWidth(80);
           tabela_autor.getColumnModel().getColumn(4).setResizable(false);
           //local de nascimento
           tabela_autor.getColumnModel().getColumn(5).setPreferredWidth(109);
           tabela_autor.getColumnModel().getColumn(5).setResizable(false);
           //local de morte
           tabela_autor.getColumnModel().getColumn(6).setPreferredWidth(109);
           tabela_autor.getColumnModel().getColumn(6).setResizable(false);
        
           tabela_autor.getTableHeader().setReorderingAllowed(false);//nao poderar ordenar cabecario
            tabela_autor.setAutoResizeMode(tabela_autor.AUTO_RESIZE_OFF);//não pode redmensionar a tabela
           tabela_autor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selecionar apenas um dados por vez
           conex.desconecta();
   
    }
    /**
     * @param args the command line arguments
     */
    
    public void mostraCampos(){
        txt_bibliografia.setEnabled(true);
        txt_nome_autor.setEnabled(true);
        txt_localnas.setEnabled(true);
        txt_localmort.setEnabled(true) ;
        date_Nasc.setEnabled(true);
        date_fale.setEnabled(true);
        txt_sobrenome.setEnabled(true);
    }
    public void bloqueiaCampos(){
        txt_sobrenome.setEnabled(false);
        txt_id.setEnabled(false);
        txt_bibliografia.setEnabled(false);
        txt_nome_autor.setEnabled(false);
        txt_localnas.setEnabled(false);
        txt_localmort.setEnabled(false) ;
        date_Nasc.setEnabled(false);
        date_fale.setEnabled(false);
        btn_excluir.setEnabled(false);
        btn__salvar.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_cancelar.setEnabled(false);
       
       
    }
    public void limpaCampos(){
        txt_sobrenome.setText("");
        txt_bibliografia.setText("");
        txt_nome_autor.setText("");
        txt_localnas.setText("");
        txt_localmort.setText("");
        date_Nasc.setDate(null);
        date_fale.setDate(null);
    }
    
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
    private javax.swing.JButton btn__salvar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_pesquisar_autor;
    private com.toedter.calendar.JDateChooser date_Nasc;
    private com.toedter.calendar.JDateChooser date_fale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela_autor;
    private javax.swing.JTextArea txt_bibliografia;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_localmort;
    private javax.swing.JTextField txt_localnas;
    private javax.swing.JTextField txt_nome_autor;
    private javax.swing.JTextField txt_pesquisa;
    private javax.swing.JTextField txt_sobrenome;
    // End of variables declaration//GEN-END:variables
}
