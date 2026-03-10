package br.com.dev.CadastroDeNinjas.Missoes;

import br.com.dev.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;


    //OneToMany > uma missão poderá ter vários ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nomeMissao, String dificuldade, List<NinjaModel> ninjas) {
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.ninjas = ninjas;
    }

    public Long getId() {
        return id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinjas() {
        return ninjas;
    }

}



