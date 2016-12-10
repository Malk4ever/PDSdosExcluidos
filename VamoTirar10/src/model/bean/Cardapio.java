package model.bean;

import java.util.Date;

/**
 *
 * @author Leon
 */
public class Cardapio {
    private Date dia;
    private String proteina;
    private  String refeicao;

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }
    
    
}
