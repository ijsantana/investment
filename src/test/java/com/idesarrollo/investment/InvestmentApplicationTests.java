package com.idesarrollo.investment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

//@SpringBootTest
class InvestmentApplicationTests {

	//MANEJO DE LISTAS
	//JUNIT (TEST UNITARIOS)
	//SPRINGBOOT TESTING
	//MOCK o MOCKITO

	@Test
	void manejoDeListas() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);

		if(!list.isEmpty()){
			System.out.println(" TIENE DATOS");
		}

		Integer nro = list.get(0);
		Integer posicion = list.indexOf(4);

		System.out.println(list.size());
		System.out.println(list);
	}

	@Test
	void manejoDeTryCatch(){

		String nombre = null;
		//Integer largo1 = nombre.length();
		try {
			//throw new RuntimeException("VOY A TIRAR UN ERROR");
			//Integer largo = nombre.length();
		} catch(NullPointerException e){
			System.out.println("TIRO UN NULLPOINTEREXCEPTION: " + e.getMessage());
		} catch(Exception e){
			System.out.println("TIRO OTRA EXCEPCION DESCONOCIDA: " + e.getMessage());
		} finally {
			//OPCIONAL
			//ALGO QUE QUIERO QUE HAGA SIEMPRE, TIRE O NO TIRE ERROR
			System.out.println("TERMINO EL CODIGO");
		}
	}

}
