package ExamenSegundoTrimestreEntorno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CAJA_BLANCA_FélixAlbaGonzález {
	
	//Pruebas de caja blanca de sentencias
	//Verificamos que el código se ejecute al menos una vez

	@Test
	void pruebaSentenciaProcesarPedido() {
		Departamento departamento=new Departamento("DepartamentoDeinformatica",10000);
		assertEquals(true,departamento.procesarPedido(5000));
	}
	
	
	@Test
	void pruebaSentenciaRealizarPedido() {
		Instituto instituto=new Instituto(6);
		instituto.agregarDepartamento("DepartamentoDeMúsica",5000);
		assertEquals(false,instituto.realizarPedido("DepartamentoDeInformática",3000));
	}
	
	
	//Pruebas de caja blanca de cobertura de decisiones
	//Verificamos que cada rama de un if o switch ha sido utilizada
	
	@Test
	void pruebaDecisionesProcesarPedido() {
		Departamento departamento=new Departamento("DepartamentoDeInformática",1000);
		Departamento departamento1=new Departamento("DepartamentoDeMarketing",1000);
		assertEquals(false,departamento.procesarPedido(2000));//Donde el presupuesto es mayor al mondo
		assertEquals(true,departamento1.procesarPedido(500));//Donde el mondo es mayor o igual al presupuesto
	}
	
	@Test
	void pruebaDecisionesRealizarPedido() {
		Instituto instituto=new Instituto(6);
		instituto.agregarDepartamento("DepartamentoDeMúsica",5000);
		assertEquals(true,instituto.realizarPedido("DepartamentoDeMúsica",1000));//Donde el departamento ha sido añadido al instituto
		assertEquals(false,instituto.realizarPedido("DepartamentoDeInformática",3000));//Donde el departamento no ha sido introducido en el instituto
	}
	
	//Prueba de caja blanca de corbertura de caminos independientes
	//Verificamos que prueba todos los caminos logicamente posibles
	@Test
	void pruebaCaminosIndependientesProcesarPedido() {
		Departamento departamento=new Departamento("DepartamentoDeInformática",1000);
		Departamento departamento1=new Departamento("DepartamentoDeMarketing",1000);
		assertEquals(false,departamento.procesarPedido(2000));//Donde el presupuesto es mayor al mondo
		assertEquals(true,departamento1.procesarPedido(500));//Donde el mondo es mayor o igual al presupuesto
	}
	
	@Test
	void pruebaCaminosIndependientesRealizarPedido() {
		Instituto instituto=new Instituto(6);
		instituto.agregarDepartamento("DepartamentoDeMúsica",5000);
		assertEquals(true,instituto.realizarPedido("DepartamentoDeMúsica",1000));//Donde el departamento ha sido añadido al instituto
		assertEquals(false,instituto.realizarPedido("DepartamentoDeInformática",3000));//Donde el departamento no ha sido introducido en el instituto
	}
}
