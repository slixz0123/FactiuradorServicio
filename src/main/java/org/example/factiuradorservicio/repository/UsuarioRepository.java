package org.example.factiuradorservicio.repository;
import org.example.factiuradorservicio.classw.Producto;
import org.example.factiuradorservicio.classw.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {}
