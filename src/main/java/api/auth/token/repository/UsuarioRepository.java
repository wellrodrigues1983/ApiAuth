package api.auth.token.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.auth.token.model.Usuario;

/**
 * @author Wellington Rodrigues
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
