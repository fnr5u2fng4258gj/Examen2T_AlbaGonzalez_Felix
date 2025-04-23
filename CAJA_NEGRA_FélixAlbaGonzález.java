package ExamenSegundoTrimestreEntorno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CAJA_NEGRA_FélixAlbaGonzález {
	
	//Pruebas de caja negra de limites
	//
	
	@Test
	void pruebaLimiteProcesarPedido() {
		Departamento departamento=new Departamento("DepartamentoDeinformatica",10000);
		assertEquals(true,departamento.procesarPedido(9999.9));
		assertEquals(false,departamento.procesarPedido(10000.1));
	}
	
	@Test
	void pruebaLimiteRealizarPedido() {
		Instituto instituto=new Instituto(6);
		instituto.agregarDepartamento("DepartamentoDeMúsica",5000);
		assertEquals(true,instituto.realizarPedido("DepartamentoDeMúsica",4999.9));
		assertEquals(false,instituto.realizarPedido("DepartamentoDeInformática",5000.1));
	}
	
	
}
