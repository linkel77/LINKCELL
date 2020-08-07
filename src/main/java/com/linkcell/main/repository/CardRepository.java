package com.linkcell.main.repository;

import com.linkcell.main.entity.Card;
import com.linkcell.main.entity.Icon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Representacion DAO (Data Acces Object). Aqui se crean métodos o querys que amplian la funcionalidad de JPA.
@Repository
public interface CardRepository extends JpaRepository<Card,Long> {

    Optional<Card> findByGameCardId(Long gameCardId);

}
