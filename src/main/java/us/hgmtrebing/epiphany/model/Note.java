package us.hgmtrebing.epiphany.model;

import us.hgmtrebing.epiphany.model.content.IContent;
import us.hgmtrebing.epiphany.model.content.InlineContent;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="note")
@XmlAccessorType(value= XmlAccessType.FIELD)
@XmlSeeAlso({InlineContent.class})
public class Note {

    @XmlElement(name="note-metadata")
    private ContentMetadata metadata;

    @XmlElement(name="note-title")
    private String title;

    @XmlElements({
            @XmlElement(name="raw-text", type= InlineContent.class)
    })
    private List<IContent> noteContents = new ArrayList<>();

    public ContentMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ContentMetadata metadata) {
        this.metadata = metadata;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<IContent> getNoteContents() {
        return noteContents;
    }

    public void setNoteContents(List<IContent> noteContents) {
        this.noteContents = noteContents;
    }

    public void addNoteContent(IContent content) {
        this.noteContents.add(content);
    }
}
