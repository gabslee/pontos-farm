package ponto.farm.api.usuario;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.channels.FileChannel;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
