package us.hgmtrebing.epiphany.model.users;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="email_addresses")
public class EmailAddress {

    @Id @GeneratedValue
    @Column (name = "id")
    private BigDecimal id;
}
