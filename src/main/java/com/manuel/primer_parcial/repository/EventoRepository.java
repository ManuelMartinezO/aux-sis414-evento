package com.manuel.primer_parcial.repository;

import com.manuel.primer_parcial.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
