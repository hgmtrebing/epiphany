package us.hgmtrebing.epiphany.model;

import us.hgmtrebing.epiphany.model.users.SimpleUser;
import us.hgmtrebing.epiphany.xml.LocalDateTimeXmlAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@XmlRootElement(name="content-metatdata")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ContentMetadata {

    @XmlElement(name="owner")
    private SimpleUser owner = new SimpleUser();

    @XmlElement(name="author")
    private SimpleUser author = new SimpleUser();

    @XmlElement(name="create-date")
    @XmlJavaTypeAdapter(value = LocalDateTimeXmlAdapter.class)
    private LocalDateTime createDate = LocalDateTime.now();

    @XmlElement(name="last-modified-date")
    @XmlJavaTypeAdapter(value = LocalDateTimeXmlAdapter.class)
    private LocalDateTime lastModifiedDate = LocalDateTime.now();

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public SimpleUser getAuthor() {
        return author;
    }

    public void setAuthor(SimpleUser author) {
        this.author = author;
    }
}
