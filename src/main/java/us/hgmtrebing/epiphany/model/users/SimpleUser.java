package us.hgmtrebing.epiphany.model.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SimpleUser {

    @XmlElement(name="username")
    private String username = "";

    @XmlElement(name="first-name")
    private String firstName = "";

    @XmlElement(name = "last-name")
    private String lastName = "";

    @XmlElement(name = "middle-names")
    private String middleNames = "";

    public SimpleUser () {

    }

    public SimpleUser (String firstName, String middleNames, String lastName, String username) {
        if (firstName == null) {
            firstName = "";
        }

        if (middleNames == null) {
            middleNames = "";
        }

        if (lastName == null) {
            lastName = "";
        }

        if (username == null) {
            username = "";
        }


        this.firstName = firstName;
        this.middleNames = middleNames;
        this.lastName = lastName;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        if (username == null) {
            username = "";
        }

        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        if (firstName == null) {
            firstName = "";
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        if (lastName == null) {
            lastName = "";
        }

        this.lastName = lastName;
    }

    public String getMiddleNames() {
        return middleNames;
    }

    public void setMiddleNames(String middleNames) {

        if (middleNames == null) {
            middleNames = "";
        }

        this.middleNames = middleNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleUser that = (SimpleUser) o;
        return getUsername().equals(that.getUsername()) && getFirstName().equals(that.getFirstName()) && getLastName().equals(that.getLastName()) && getMiddleNames().equals(that.getMiddleNames());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getFirstName(), getLastName(), getMiddleNames());
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleNames='" + middleNames + '\'' +
                '}';
    }
}
