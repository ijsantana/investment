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

}
