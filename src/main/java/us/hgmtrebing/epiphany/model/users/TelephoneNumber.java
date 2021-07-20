package us.hgmtrebing.epiphany.model.users;

public class TelephoneNumber {

    private TelephoneNumberingSchema numberingSchema;
    private String telephoneNumber;

    public TelephoneNumber() {
        this.numberingSchema = TelephoneNumberingSchema.UNSPECIFIED;
        this.telephoneNumber = "";
    }


}
