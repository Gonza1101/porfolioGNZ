package ar.edu.unq.grupo3.theCanchita.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unq.grupo3.theCanchita.model.Usuario;
	
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String>{
	
	Optional<Usuario> findByEmail(String email);
	
	@EntityGraph(value = "UsuarioWithRoles")
	public Usuario findWithRolesByEmail(String email);
	
	@EntityGraph(value = "UsuarioWithRoles")
	Optional<Usuario> findWithRolesById(String id);

}
