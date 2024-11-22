package csjar.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import csjar.personal.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByDni(String dni);

}
