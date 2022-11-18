package ponto.farm.api.empresa;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
