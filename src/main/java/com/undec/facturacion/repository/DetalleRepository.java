package com.undec.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.undec.facturacion.model.Detalle;

public interface DetalleRepository extends JpaRepository<Detalle, Integer> {
}