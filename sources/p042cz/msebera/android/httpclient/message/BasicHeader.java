package p042cz.msebera.android.httpclient.message;

import java.io.Serializable;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HeaderElement;
import p042cz.msebera.android.httpclient.ParseException;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.message.BasicHeader */
public class BasicHeader implements Header, Cloneable, Serializable {
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        this.name = (String) Args.notNull(str, "Name");
        this.value = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return BasicLineFormatter.INSTANCE.formatHeader((CharArrayBuffer) null, (Header) this).toString();
    }

    public HeaderElement[] getElements() throws ParseException {
        String str = this.value;
        return str != null ? BasicHeaderValueParser.parseElements(str, (HeaderValueParser) null) : new HeaderElement[0];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
