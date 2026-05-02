package st.zona_fit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import st.zona_fit.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
