package us.hgmtrebing.epiphany.model.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public interface IContent <T>{
    public abstract T getContent();
    public abstract void setContent(T newContent);
}
