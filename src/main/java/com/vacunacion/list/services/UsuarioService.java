package com.vacunacion.list.services;

import com.vacunacion.list.models.UserLoginRequest;
import com.vacunacion.list.models.UsuarioModel;
import com.vacunacion.list.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel getUserByUsernameAndPassword(String username, String password) {
        UsuarioModel user = usuarioRepository.findByUsernameAndPassword(username, password);

        if (user != null ) {
            return user;
        } else {
            return null;
        }
    }
    public UsuarioModel  guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public boolean eliminarUsuario(Long id) {
        if (!usuarioRepository.existsById(id)) {
            return false;
        }
        usuarioRepository.deleteById(id);
        return true;
    }

    public UsuarioModel getUserById(Long id) {
        UsuarioModel usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return null;
        }
        return usuario;
    }

    public UsuarioModel actualizarUsuario(Long id, UsuarioModel usuarioDetalles) {
        UsuarioModel usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) {
            return null;
        }
        usuario.setNombres(usuarioDetalles.getNombres());
        usuario.setEmail(usuarioDetalles.getEmail());
        usuario.setAddress(usuarioDetalles.getEmail());
        usuario.setCedula(usuarioDetalles.getCedula());
        usuario.setBirthdate(usuarioDetalles.getBirthdate());
        usuario.setDoseNumber(usuarioDetalles.getDoseNumber());
        usuario.setIsVaccinated(usuarioDetalles.getIsVaccinated());
        usuario.setPassword(usuarioDetalles.getPassword());
        usuario.setPhone(usuarioDetalles.getPhone());
        usuario.setUsername(usuarioDetalles.getUsername());
        usuario.setVaccinated(usuarioDetalles.getVaccinated());
        usuario.setVaccineType(usuarioDetalles.getVaccineType());
        usuario.setLastnames(usuarioDetalles.getLastnames());
        usuario.setVaccineDate(usuarioDetalles.getVaccineDate());

        return usuarioRepository.save(usuario);
    }
}
