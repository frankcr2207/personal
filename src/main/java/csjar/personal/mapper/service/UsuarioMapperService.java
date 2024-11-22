package csjar.personal.mapper.service;

import csjar.personal.domain.Usuario;
import csjar.personal.dto.UsuarioDTO;

public interface UsuarioMapperService {

	UsuarioDTO toDTO(Usuario usuario);
	
}
