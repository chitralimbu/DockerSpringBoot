package com.chitra.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chitra.domain.Person;

@Configuration
@ComponentScan
public class MyComponent {
	
	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("Chitra");
		person.setAge(22);
		return person;
	}
}
