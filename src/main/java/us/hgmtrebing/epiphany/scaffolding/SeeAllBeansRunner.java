package us.hgmtrebing.epiphany.scaffolding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Removing the 'Component' Annotation prevents Spring from running this class;
// https://spring.io/guides/gs/spring-boot/
// @Component
public class SeeAllBeansRunner implements CommandLineRunner {

    private final ApplicationContext context;

    // See https://blog.marcnuri.com/field-injection-is-not-recommended for Autowired Tips
    @Autowired
    public SeeAllBeansRunner(ApplicationContext context) {
        this.context = context;
    }

    private static final Logger log = LoggerFactory.getLogger(SeeAllBeansRunner.class);

    @Override
    public void run(String... args) throws Exception {

        log.info("Printing out all beans available to the application.");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String bean : beanNames) {
            log.info("Bean: " + bean);
        }
    }

    /*
    @Bean
    public static SeeAllBeansRunner getSeeAllBeansRunner() {
        return new SeeAllBeansRunner();
    }
     */
}
