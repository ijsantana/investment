package com.idesarrollo.investment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
//public class InvestmentApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(InvestmentApplication.class, args);
//	}
//
//}

class InvestmentApplicationTests {

    void manejoDeListas() {
        List<Integer> list = new ArrayList<>();
        list.size();
        list.add(2);
        System.out.println(list.size());
        System.out.println(list);


    }







}