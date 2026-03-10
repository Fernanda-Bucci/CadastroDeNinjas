package br.com.dev.CadastroDeNinjas.Missoes;

import br.com.dev.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table (name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;


    //OneToMany > uma missão poderá ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}