package com.devsuperior.dslist.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.dslist.entities.GameList;;

// Nome da entidade do dominio Game
public interface GameListRepository extends JpaRepository<GameList, Long>{

}
