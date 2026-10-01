package com.manuel.primer_parcial.controller;


import com.manuel.primer_parcial.entity.Evento;
import com.manuel.primer_parcial.dto.EventoDTO;
import com.manuel.primer_parcial.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService){
        this.eventoService = eventoService;
    }

    @PostMapping("/crear")
    public Evento crear(@RequestBody Evento evento) {
        return eventoService.crearEvento(evento);
    }

    @GetMapping("/lista")
    public List<Evento> listar() {
        return eventoService.listarEventos();
    }

    @PutMapping("/editar/{id}")
    public Evento editar(@RequestBody EventoDTO evento, @PathVariable Long id) {
        return eventoService.editarEvento(evento, id);
    }

    @DeleteMapping("/eliminar/{id}")
    public Evento eliminar(@PathVariable Long id) {
        return eventoService.eliminarEvento(id);
    }
}
