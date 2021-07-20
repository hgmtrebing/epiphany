package us.hgmtrebing.epiphany.model.users;

import java.util.regex.Pattern;

public enum TelephoneNumberingSchema {
    UNSPECIFIED ("N/A", "Unspecified", "*", "*", "*"),
    UNITED_STATES("USA", "United States", "^[0-9]{9}$", "^\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$\n", "")
    ;

    private String abbreviation;
    private String friendlyName;
    private Pattern strictFormat;
    private Pattern laxFormat;
    private Pattern preferredFormat;

    TelephoneNumberingSchema(String abbreviation,
                             String friendlyName,
                             String strictFormat,
                             String laxFormat,
                             String preferredFormat) {

        this.abbreviation = abbreviation;
        this.friendlyName = friendlyName;
        this.strictFormat = Pattern.compile(strictFormat);
        this.laxFormat = Pattern.compile(laxFormat);
        this.preferredFormat = Pattern.compile(preferredFormat);
    }

}
