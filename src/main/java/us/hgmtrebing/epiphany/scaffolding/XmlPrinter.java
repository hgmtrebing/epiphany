package us.hgmtrebing.epiphany.scaffolding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import us.hgmtrebing.epiphany.model.ContentMetadata;
import us.hgmtrebing.epiphany.model.Note;
import us.hgmtrebing.epiphany.model.content.InlineContent;
import us.hgmtrebing.epiphany.model.users.EmailAddress;
import us.hgmtrebing.epiphany.model.users.SimpleUser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.time.LocalDateTime;

@Component
public class XmlPrinter implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(XmlPrinter.class);

    public static void printEmailAddress() {
        try {
            JAXBContext context = JAXBContext.newInstance(EmailAddress.class);
            EmailAddress address = new EmailAddress("hgmtrebing@outlook.com");

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            m.marshal(address, System.out);
        } catch (Exception e) {
            log.warn("", e);
        }
    }

    public static void printContentMetadata() {
        try {
            JAXBContext context = JAXBContext.newInstance(Note.class);

            InlineContent content= new InlineContent();
            content.setContent("This is a test note.");

            SimpleUser user01 = new SimpleUser();
            user01.setLastName("Trebing");
            user01.setFirstName("Harry");
            user01.setMiddleNames("Geoffrey Martin");
            user01.setUsername("hgmtrebing");


            SimpleUser user02 = new SimpleUser();
            user02.setLastName("Trebing");
            user02.setFirstName("Anjanette");
            user02.setMiddleNames("Kathleen");
            user02.setUsername("aktrebing");

            ContentMetadata metadata = new ContentMetadata();
            metadata.setOwner(user01);
            metadata.setAuthor(user02);
            metadata.setCreateDate(LocalDateTime.of(2020, 10, 10, 13, 25, 00));
            metadata.setLastModifiedDate(LocalDateTime.now());

            Note note = new Note();
            note.setTitle("First Note");
            note.setMetadata(metadata);
            note.addNoteContent(content);

            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            m.marshal(note, System.out);

        } catch (JAXBException e) {
            log.warn("Exception encountered when trying to marshall object!", e);
        }
    }


    @Override
    public void run(String... args) throws Exception {
        // printContentMetadata();
        printEmailAddress();
    }
}

