package org.example.factiuradorservicio.repository;


import org.example.factiuradorservicio.classw.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Integer> {
}