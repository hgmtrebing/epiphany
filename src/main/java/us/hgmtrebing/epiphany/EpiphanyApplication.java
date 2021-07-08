package us.hgmtrebing.epiphany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class EpiphanyApplication {
	private static Logger log = LoggerFactory.getLogger(EpiphanyApplication.class);

	public static void main(String[] args) {
		log.info("Preparing to start Epiphany Application.");
		SpringApplication.run(EpiphanyApplication.class, args);
		log.info("Epiphany Application initialized.");
	}

    /**
     * Sample Method from 'https://spring.io/guides/gs/spring-boot/' that prints out all of the
	 * Beans currently available to the Application. Still not entirely clear on how it functions.
	 *
     * @param context
     * @return
     */
    /*
	@Bean
	public CommandLineRunner getCommandLineRunner(ApplicationContext context) {
		return args -> {
			log.info("Printing out all beans available to the application.");

			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String bean : beanNames) {
				log.info("Bean: " + bean);
			}
		};
	}
     */

}
