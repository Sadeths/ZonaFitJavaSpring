package st.zona_fit;



import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import st.zona_fit.modelo.Cliente;
import st.zona_fit.servicio.IClienteServicio;

//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		//Levantar la fabrica de spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicacion finalizada!");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp(){
		var salir = false;
		var consola = new Scanner(System.in);
		while(!salir){
			var opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(consola, opcion);
			logger.info(nl);
		}

	}

	private int mostrarMenu(Scanner consola){
		logger.info("""
			\n*** Aplicacion Zona Fit (GYM) ***
			1. Listar Clientes
			2. Buscar Clientes
			3. Agregar Clientes
			4. Modificar Clientes
			5. Eliminar Clientes
			6. Salir 
			Elige una opcion:\s""");
			return Integer.parseInt(consola.nextLine());
			
	}

	private boolean ejecutarOpciones(Scanner consola, int opcion){
		var salir = false;
		switch(opcion){
			case 1 ->{//1. Listar clientes
				logger.info(nl + "--- Listado de Clientes ---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 -> {//2. Buscar cliente por ID
				logger.info(nl + "--- Buscar Cliente por ID ---" + nl);
				logger.info("ID cliente a buscar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					logger.info("Cliente encontrado: " + cliente + nl);
				}else {
					logger.info("Cliente No encontrado: " + cliente + nl);
				}
				
			}
			case 3 -> {//3. Agregar cliente
				logger.info(nl + "--- Agregar Cliente ---" + nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				var apellido = consola.nextLine();
				logger.info("Membresia: ");
				var membresia = Integer.parseInt(consola.nextLine());
				var cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				clienteServicio.guardarCliente(cliente);
				logger.info("Cliente agregado: " + cliente + nl);
			}
			case 4 -> {//4. Modificar cliente
				logger.info(nl + "---Modificar Cliente ---" + nl);
				logger.info("ID cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					logger.info("Nombre: ");
					var nombre = consola.nextLine();
					logger.info("Apellido: ");
					var apellido = consola.nextLine();
					logger.info("Membresia: ");
					var membresia = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente modificado: " + cliente + nl);
				}else {
					logger.info("CLiente NO encontrado: " + cliente + nl);
				}
				
			}
			case 5 -> {//5. Eliminar cliente
				logger.info("--- Eliminar Cliente ---" + nl);
				logger.info("ID Cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);
				if(cliente != null){
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado: " + cliente + nl);
				}else {
					logger.info("Cliente NO encontrado: " + cliente + nl);
				}
			}
			case 6 -> {
				logger.info("Hasta pronto!" + nl + nl);
				salir = true;
			}

			default -> logger.info("Opcion NO reconocida: " + opcion + nl);
		}
		return salir;
	}

}
