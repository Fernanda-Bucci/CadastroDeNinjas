package br.com.dev.CadastroDeNinjas.Ninjas.Controller.Service;


import br.com.dev.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //ManyToOne > um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")//chave estrangeira [Foreing Key]
    private MissoesModel missoes;

}