package p042cz.msebera.android.httpclient.message;

import java.io.Serializable;
import p042cz.msebera.android.httpclient.ProtocolVersion;
import p042cz.msebera.android.httpclient.RequestLine;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

/* renamed from: cz.msebera.android.httpclient.message.BasicRequestLine */
public class BasicRequestLine implements RequestLine, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        this.method = (String) Args.notNull(str, "Method");
        this.uri = (String) Args.notNull(str2, "URI");
        this.protoversion = (ProtocolVersion) Args.notNull(protocolVersion, "Version");
    }

    public String getMethod() {
        return this.method;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    public String getUri() {
        return this.uri;
    }

    public String toString() {
        return BasicLineFormatter.INSTANCE.formatRequestLine((CharArrayBuffer) null, (RequestLine) this).toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
