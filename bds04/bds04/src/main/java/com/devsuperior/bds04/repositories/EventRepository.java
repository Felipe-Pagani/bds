package com.devsuperior.bds04.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds04.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{

}
