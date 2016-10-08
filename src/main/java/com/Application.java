/**
 * spring cloud simple service
 * @author lzhoumail@126.com 
 */
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:dubbo.xml")  //.xml文件的引入方法
public class Application{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}