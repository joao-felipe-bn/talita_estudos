package com.talita;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
	
import com.talita.domain.Usuario;
import com.talita.repositories.UsuarioRepository;
import com.talita.util.GeradorMD5;
	
@SpringBootApplication
public class TalitaApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TalitaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		String senhaMd5 = GeradorMD5.converterStringEmMD5("senhaParaMd5");
		
		Usuario usuario = new Usuario(null, "joao.felipe", senhaMd5);
		usuarioRepository.save(usuario);
	}
	
	
}	
	
