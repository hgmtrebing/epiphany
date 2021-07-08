package us.hgmtrebing.epiphany.scaffolding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import us.hgmtrebing.epiphany.model.database.UserRepository;
import us.hgmtrebing.epiphany.model.users.User;

import java.time.LocalDate;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);
    private final UserRepository userRepository;

    @Autowired
    public DatabaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run (String... args) {
        User u = new User();
        u.setFirstName("Harry");
        u.setLastName("Trebing");
        u.setMiddleNames("Geoffrey Martin");
        u.setBirthDate(LocalDate.of(1989, 10, 10));
        this.userRepository.save(u);
        log.info("New User saved!");
    }
}
