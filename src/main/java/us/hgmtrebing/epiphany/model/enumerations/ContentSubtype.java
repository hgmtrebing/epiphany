package us.hgmtrebing.epiphany.model.enumerations;

public enum ContentSubtype {
    RAW_TEXT (ContentType.TEXT),
    HTML (ContentType.TEXT),
    XML (ContentType.TEXT)
    ;

    private ContentType parentType;

    ContentSubtype (ContentType parentType) {
        this.parentType = parentType;
    }

    public ContentType getParentType() {
        return this.parentType;
    }
}
