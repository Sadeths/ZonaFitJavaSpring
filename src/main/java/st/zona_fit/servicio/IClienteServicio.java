package st.zona_fit.servicio;

import java.util.List;

import st.zona_fit.modelo.Cliente;

public interface IClienteServicio {

   public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}