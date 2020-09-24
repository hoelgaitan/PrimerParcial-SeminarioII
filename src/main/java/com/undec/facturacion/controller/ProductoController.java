package com.undec.facturacion.controller;

import com.undec.facturacion.dto.Response;
import com.undec.facturacion.model.Producto;
import com.undec.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public ResponseEntity<Response> list() throws Exception {
        Response response = productoService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping()
    public ResponseEntity<Response> create(@Valid @RequestBody Producto producto){
    Response response = productoService.save(producto);
        return ResponseEntity.ok().body(response);
    }
}
