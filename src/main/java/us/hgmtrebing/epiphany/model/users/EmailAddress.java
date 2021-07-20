package us.hgmtrebing.epiphany.model.users;


import javax.xml.bind.annotation.*;
import java.util.Objects;
import java.util.regex.Pattern;

@XmlRootElement(name="email-address")
@XmlAccessorType(value = XmlAccessType.PROPERTY)
public class EmailAddress {

    public static final String NO_EMAIL_ADDRESS = "N/A";
    public static final Pattern EMAIL_REGEX = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");

    private String emailAddress;

    public EmailAddress() {
        this.emailAddress = NO_EMAIL_ADDRESS;
    }

    public EmailAddress (String emailAddress) {
        this.setEmailAddress(emailAddress);
    }

    @XmlElement(name="email-address")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (validateEmailAddress(emailAddress)) {
            this.emailAddress = emailAddress;
        } else {
            this.emailAddress = NO_EMAIL_ADDRESS;
        }
    }

    public String getLocalPart() {
        if (this.isValidEmailAddress()) {
            return this.emailAddress.split("@")[0];
        }
        return null;
    }

    public String getDomain() {
        if (this.isValidEmailAddress()) {
            return this.emailAddress.split("@")[1];
        }
        return null;
    }

    public boolean isValidEmailAddress() {
        return validateEmailAddress(this.emailAddress);
    }

    public boolean validateEmailAddress(String potentialAddress) {
        return EMAIL_REGEX.matcher(potentialAddress).matches();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress that = (EmailAddress) o;
        return getEmailAddress().equals(that.getEmailAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmailAddress());
    }


}
