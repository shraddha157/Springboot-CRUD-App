package com.tcs.Case.Study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Entry point of application (@EnableAutoConfiguration + ComponentScan + @Configuration)
@SpringBootApplication
public class CaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseStudyApplication.class, args);
		//System.out.print("hello world"); 
	}

}
