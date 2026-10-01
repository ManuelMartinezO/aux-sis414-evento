package com.manuel.primer_parcial.service;

import com.manuel.primer_parcial.dto.EventoDTO;
import com.manuel.primer_parcial.entity.Evento;
import com.manuel.primer_parcial.repository.EventoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public Evento crearEvento(Evento evento){
        Evento nuevoEvento = new Evento();
        nuevoEvento.setNombre(evento.getNombre());
        nuevoEvento.setFecha(evento.getFecha());
        nuevoEvento.setUbicacion(evento.getUbicacion());
        nuevoEvento.setOrganizador(evento.getOrganizador());
        nuevoEvento.setCapacidad(evento.getCapacidad());
        eventoRepository.save(nuevoEvento);
        return nuevoEvento;
    }

    public List<Evento> listarEventos() {
        List<Evento> eventos = new ArrayList<>();
        eventos = eventoRepository.findAll();
        return eventos;
    }

    public Evento editarEvento(EventoDTO evento, Long id) {
        Evento modificado = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento no encontrado con id: " + id));
        modificado.setNombre(evento.getNombre());
        modificado.setFecha(evento.getFecha());
        modificado.setUbicacion(evento.getUbicacion());
        eventoRepository.save(modificado);
        return modificado;
    }

    public Evento eliminarEvento(Long id) {
        Evento eliminado = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento no encontrado con id: " + id));
        eventoRepository.delete(eliminado);
        return eliminado;
    }
}
