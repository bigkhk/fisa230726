/* main() 메소드가 있는 package 와 하위 sub package에 한해서만 별도의 등록없이
 * 스프링 빈으로 인식
 * com.fisa.demo 
 * com.fisa.demo.*
 * 
 * com.fisa
 * com.fisa.* 
 * 
 */
package com.fisa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//연관없는 package 내부에 존재하는 스프링 빈 package 등록 
//@ComponentScan({})

@SpringBootApplication
public class Step02GBookGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step02GBookGradleApplication.class, args);
	}

}
