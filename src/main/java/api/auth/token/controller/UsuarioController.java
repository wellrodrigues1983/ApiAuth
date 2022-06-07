package api.auth.token.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.auth.token.model.Usuario;
import api.auth.token.repository.UsuarioRepository;

/**
 * @author Wellington Rodrigues
 *
 */
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Usuario> usuarioPorId(@PathVariable (value = "id") Long id){
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
		return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<Usuario>> todosUsuarios(){
		
		List<Usuario> list = usuarioRepository.findAll();
		
		return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
		
	}
	
	@PostMapping(value = "/criar", produces = "application/json")
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
		
		Usuario usuariosalvar = usuarioRepository.save(usuario);
		
		return new ResponseEntity<Usuario>(usuariosalvar, HttpStatus.OK);
		
	}
	
	@PutMapping(value = "/atualizar", produces = "application/json")
	public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
		
		Usuario usuariosalvar = usuarioRepository.save(usuario);
		
		return new ResponseEntity<Usuario>(usuariosalvar, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping(value = "/delete/{id}", produces = "application/text")
	public String  deletarUsuario(@PathVariable ("id") Long id){
		
		usuarioRepository.deleteById(id);
		
		return "Ok";
		
	}

}
