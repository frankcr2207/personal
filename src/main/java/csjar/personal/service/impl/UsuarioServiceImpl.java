package csjar.personal.service.impl;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import csjar.personal.domain.Usuario;
import csjar.personal.dto.UsuarioDTO;
import csjar.personal.mapper.service.UsuarioMapperService;
import csjar.personal.repository.UsuarioRepository;
import csjar.personal.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository usuarioRepository;
	private UsuarioMapperService usuarioMapperService;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository, UsuarioMapperService usuarioMapperService) {
		super();
		this.usuarioRepository = usuarioRepository;
		this.usuarioMapperService = usuarioMapperService;
	}

	@Override
	public UsuarioDTO getUsuario(String dni) {
		Usuario usuario = this.usuarioRepository.findByDni(dni);
		if(Objects.isNull(usuario))
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró registro con el DNI ".concat(dni));
		return this.usuarioMapperService.toDTO(usuario);
	}

}
