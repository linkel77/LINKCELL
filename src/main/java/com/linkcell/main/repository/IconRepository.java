package com.linkcell.main.repository;

import com.linkcell.main.entity.Icon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IconRepository extends JpaRepository<Icon, Long> {

    Optional<Icon> findByMediumUrl(String medium);
}
