/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

/**
 *
 * @author Ezequiel
 */
import java.sql.Date;
import javax.xml.soap.Text;
import sun.util.calendar.BaseCalendar;

public class BeansAutor {
     private int id;
     private String nome;
     private String sobrenome;
             Date dataNascimento;
             Date dataFalecimento;
     private String locnasc;
     private String locmort;
     private String pesquisa;
             Text bibliografia;

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
     
}
