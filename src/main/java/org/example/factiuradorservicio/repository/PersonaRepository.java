package org.example.factiuradorservicio.repository;


import org.example.factiuradorservicio.classw.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<org.example.factiuradorservicio.classw.Persona, Integer> {}
