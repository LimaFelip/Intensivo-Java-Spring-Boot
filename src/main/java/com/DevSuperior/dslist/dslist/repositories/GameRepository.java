package com.devsuperior.dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.dslist.entities.Game;;

// Nome da entidade do dominio Game
public interface GameRepository extends JpaRepository<Game, Long>{

}
