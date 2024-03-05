package com.nestor.curso.springboot.app.aop.springbootaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy  no es necesaria con las nuevas actualizaciones
@SpringBootApplication
public class SpringbootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

}
