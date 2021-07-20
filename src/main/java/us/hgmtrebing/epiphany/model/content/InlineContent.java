package us.hgmtrebing.epiphany.model.content;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="inline-text")
@XmlAccessorType(value= XmlAccessType.FIELD)
public class InlineContent implements IContent<String> {

    @XmlElement(name="text")
    private String text;

    @Override
    public String getContent() {
        return text;
    }

    @Override
    public void setContent(String text) {
        this.text = text;
    }
}
