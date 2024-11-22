package csjar.personal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="usuarios")
@Entity
@Data
public class Usuario {

	@Id
	@Column(name="n_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="s_dni")
	private String dni;
	
	@Column(name="s_nombres")
	private String nombres;
	
	@Column(name="s_apellidos")
	private String apellidos;
	
	@Column(name="s_correo")
	private String correo;
	
}
