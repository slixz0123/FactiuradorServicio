package org.example.factiuradorservicio.repository;

import org.example.factiuradorservicio.classw.Factura;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {}
