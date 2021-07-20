package us.hgmtrebing.epiphany.model.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="physical-location")
@XmlAccessorType(value= XmlAccessType.PROPERTY)
public class PhysicalLocation {
    private String addressLine01;
    private String addressLine02;
    private String city;
    private String state;
    private String zipcode;

    public String getAddressLine01() {
        return addressLine01;
    }

    public void setAddressLine01(String addressLine01) {
        this.addressLine01 = addressLine01;
    }

    public String getAddressLine02() {
        return addressLine02;
    }

    public void setAddressLine02(String addressLine02) {
        this.addressLine02 = addressLine02;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
