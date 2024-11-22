package csjar.personal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import csjar.personal.dto.UsuarioDTO;
import csjar.personal.service.UsuarioService;

@RestController
@RequestMapping("/personal")
public class PersonalController {

	private UsuarioService usuarioService;
	
	public PersonalController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/{dni}")
	public ResponseEntity<UsuarioDTO> buscarUsuario(@PathVariable String dni) {
		return new ResponseEntity<>(usuarioService.getUsuario(dni), HttpStatus.OK);
	}
	
}
