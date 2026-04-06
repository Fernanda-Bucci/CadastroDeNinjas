package br.com.dev.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
