/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ezequiel
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null; //armazena qualquer tipo de objeto
    private String[] colunas = null;//vetor tipo string armazena colunas
    
    
    
  public ModeloTabela(ArrayList lin, String[] col){
      setLinhas(lin);
      setColunas(col);
  }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }
    //conta numero de colunas
    public int getColumnCount(){
        return colunas.length; //quantidade de colunas
        
    }
    //conta quantas linhas
    public int getRowCount(){
        return linhas.size(); //retorna linhas
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];        
}
    //monta a tabela adiciona linha a tabela recebe a quantidade de linha
    public Object getValueAt(int numLin, int numCol){
        Object[] linha =(Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}

