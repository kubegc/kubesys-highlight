/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package io.github.kubesys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author wuheng@otcaix.iscas.ac.cn
 * @author xuyuanjia2017@otcaix.iscas.ac.cn
 * @since 2019.11.16
 * 
 *        <p>
 *        The {@code ApplicationServer} class is used for starting web
 *        applications. Please configure
 * 
 *        <li><code>src/main/resources/application.yml<code>
 *        <li><code>src/main/resources/log4j.properties<code>
 * 
 */

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "io.github.kubesys.services" })
public class ApplicationServer  {

	/**
	 * program entry point
	 * 
	 * @param args default is null
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer.class, args);
	}

}
