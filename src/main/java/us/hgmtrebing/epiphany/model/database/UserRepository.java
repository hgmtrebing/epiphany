package us.hgmtrebing.epiphany.model.database;

import org.springframework.data.repository.CrudRepository;
import us.hgmtrebing.epiphany.model.users.User;

import java.math.BigDecimal;


public interface UserRepository extends CrudRepository<User, BigDecimal> {

}
