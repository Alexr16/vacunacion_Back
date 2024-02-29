package com.vacunacion.list.repositories;

import com.vacunacion.list.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    UsuarioModel findByUsernameAndPassword(String username, String password);
}
