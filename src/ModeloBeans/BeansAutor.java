/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;






import java.util.Date;

/**
 *
 * @author Ezequiel
 */
public class BeansAutor {
     private int id;
     private String nome;
     private String sobrenome;
    // private String dtnasc;
    // private String dtmort;
     private String locnasc;
     private String locmort;
     private String pesquisa;
    private Date dataNascimento;
    private Date dataFalecimento;

     private String bibliografia;
    
     
    public BeansAutor() {
    }
        

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the dtnasc
     */
  

    /**
     * @return the locnasc
     */
    public String getLocnasc() {
        return locnasc;
    }

    /**
     * @param locnasc the locnasc to set
     */
    public void setLocnasc(String locnasc) {
        this.locnasc = locnasc;
    }

    /**
     * @return the locmort
     */
    public String getLocmort() {
        return locmort;
    }

    /**
     * @param locmort the locmort to set
     */
    public void setLocmort(String locmort) {
        this.locmort = locmort;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dataNasc
   
     * @return the text
     */
    
    /**
     * @return the bibliografia
     */
    public String getBibliografia() {
        return bibliografia;
    }

    /**
     * @param bibliografia the bibliografia to set
     */
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the dataFalecimento
     */
    public Date getDataFalecimento() {
        return dataFalecimento;
    }

    /**
     * @param dataFalecimento the dataFalecimento to set
     */
    public void setDataFalecimento(Date dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }
     
}
