package com.undec.facturacion.controller;

import com.undec.facturacion.dto.FacturaDTO;
import com.undec.facturacion.dto.Response;
import com.undec.facturacion.model.Producto;
import com.undec.facturacion.service.FacturaService;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class FacturaController {


    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public ResponseEntity<Response> list() throws Exception {
        Response response = facturaService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping()
    public ResponseEntity<Response> create(@Valid @RequestBody FacturaDTO facturaDTO) throws Exception {

        Response response = facturaService.save(facturaDTO);
        return ResponseEntity.ok().body(response);
    }
}
