package br.com.dev.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso!";
    }

    @PutMapping ("/alterar")
    public String alterarMissao() {
        return "Missão Alterada com sucesso!";
    }

    @GetMapping ("/listar")
    public String listarMissao() {
        return "Missoes listadas com sucesso!";
    }

    @DeleteMapping ("deletar")
    public String deletarMissao(){
        return "Missão Deletada com Sucesso.";
    }


}
