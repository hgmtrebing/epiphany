package us.hgmtrebing.epiphany.model.users;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@XmlRootElement
public class User {

    @XmlElement(name = "basic-user-info")
    private SimpleUser simpleUser;

    @XmlElement(name = "bio")
    private String bio;

    @XmlElement(name="create-time")
    private LocalDateTime createTime;

    @XmlElement(name="last-update-time")
    private LocalDateTime lastUpdateTime;

    @XmlElement(name="last-login-time")
    private LocalDateTime lastLoginTime;

    @XmlElement(name="birth-date")
    private LocalDate birthDate;

    @XmlElement(name="primary-email-address")
    private EmailAddress primaryEmailAddress;

    @XmlElement(name="secondary-email-address")
    private EmailAddress secondaryEmailAddress;

    @XmlElement(name="primary-telephone")
    private TelephoneNumber primaryTelephoneNumber;

    @XmlElement(name="secondary-telphone")
    private TelephoneNumber secondaryTelephoneNumber;

    @XmlElement(name="home-address")
    private PhysicalLocation homeAddress;
}
