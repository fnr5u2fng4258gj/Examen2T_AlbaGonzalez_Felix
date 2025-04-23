package ExamenSegundoTrimestreEntorno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class INTEGRACION_FélixAlbaGonzález {

	@Test
	void pruebaDeIntegracion() {
		Instituto instituto=new Instituto(3);
		instituto.agregarDepartamento("DepartamentoDeMarketing",5000);
		instituto.agregarDepartamento("DepartamentoDeInformatica", 2000);
		instituto.agregarDepartamento("DepartamentoDeDerecho", 4000);
		assertEquals(true,instituto.realizarPedido("DepartamentoDeMarketing",1000));
		assertEquals(false,instituto.realizarPedido("DepartamentoDeInformática",3000));
		assertEquals(true,instituto.realizarPedido("DepartamentoDeDerecho", 1500));
	}
}
