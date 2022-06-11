package com.Magnetic.TimeLineBackend.Controllers;

import com.Magnetic.TimeLineBackend.Models.Recuerdo;
import com.Magnetic.TimeLineBackend.Services.Exceptions.NotFoundException;
import com.Magnetic.TimeLineBackend.Services.RecuerdoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RecuerdoController {
    @Autowired
    private RecuerdoService recuerdoService;
    @GetMapping("/recuerdos")
    public ResponseEntity<List<Recuerdo>> getRecuerdos() throws NotFoundException {
        return ResponseEntity.ok().body(recuerdoService.getRecuerdos());
    }

    @PostMapping("/recuerdos/update")
    public ResponseEntity<Recuerdo> updateRecuerdos(@RequestBody Recuerdo recuerdo) throws NotFoundException {
        return ResponseEntity.ok().body(recuerdoService.updateRecuerdo(recuerdo));
    }

}



