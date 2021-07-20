package us.hgmtrebing.epiphany.xml;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;

public class LocalDateTimeXmlAdapter extends XmlAdapter<String, LocalDateTime> {

    public LocalDateTime unmarshal(String dt) throws Exception {
        return LocalDateTime.parse(dt);
    }

    public String marshal(LocalDateTime dt) throws Exception {
        return dt.toString();
    }
}
