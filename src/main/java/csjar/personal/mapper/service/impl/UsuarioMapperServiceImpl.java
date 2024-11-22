package csjar.personal.mapper.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import csjar.personal.domain.Usuario;
import csjar.personal.dto.UsuarioDTO;
import csjar.personal.mapper.service.UsuarioMapperService;

@Service
public class UsuarioMapperServiceImpl implements UsuarioMapperService{

	private static final ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public UsuarioDTO toDTO(Usuario usuario) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(usuario, UsuarioDTO.class);
	}

}
