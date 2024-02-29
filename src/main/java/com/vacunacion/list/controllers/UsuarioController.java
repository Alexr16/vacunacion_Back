package com.vacunacion.list.controllers;

import com.vacunacion.list.models.UserLoginRequest;
import com.vacunacion.list.models.UsuarioModel;
import com.vacunacion.list.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioModel getUserById(@PathVariable Long id){
        return usuarioService.getUserById(id);
    }

    @PostMapping("/create")
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

    @PostMapping("/login")
    public UsuarioModel getUserByUsernameAndPassword(
            @RequestBody UserLoginRequest userLoginRequest) {
        return usuarioService.getUserByUsernameAndPassword(userLoginRequest.getUsername(),
                userLoginRequest.getPassword());
    }

    @DeleteMapping("/{id}")
    public boolean eliminarUsuario(@PathVariable Long id){
        return usuarioService.eliminarUsuario(id);
    }

    @PatchMapping("/actualizar/{id}")
    public ResponseEntity<UsuarioModel> actualizarUsuario(@PathVariable Long id, @RequestBody UsuarioModel usuarioDetalles) {
        UsuarioModel actualizado = usuarioService.actualizarUsuario(id, usuarioDetalles);
        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(actualizado);
    }
}
