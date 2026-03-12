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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    //ManyToOne > um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id")//chave estrangeira [Foreing Key]
    private MissoesModel missoes;

}