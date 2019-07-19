package com.talita.service;
	
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talita.domain.Usuario;
import com.talita.repositories.UsuarioRepository;
	
@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario find(Integer usuarioId) {
		Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
		
		if(usuario == null) {
			try {
				throw new Exception("Usuario não encontrado");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return usuario.orElse(null);
	}
	
	
}	
	