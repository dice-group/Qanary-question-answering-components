package eu.wdaqua.qanary.falconNED;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import eu.wdaqua.qanary.component.QanaryComponent;

@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
@ComponentScan("eu.wdaqua.qanary.component")
public class Application {


	@Bean
	public QanaryComponent qanaryComponent() {
		return new FalconNED();
	}


	/**
	 * default main
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
