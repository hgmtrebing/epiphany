package us.hgmtrebing.epiphany.model;

import us.hgmtrebing.epiphany.model.users.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name="notebook")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Notebook {

    private User owner;
    private String title;
    private Set<Note> notes;
}
