package p042cz.msebera.android.httpclient.impl.conn;

import java.io.IOException;
import p042cz.msebera.android.httpclient.Consts;
import p042cz.msebera.android.httpclient.p044io.EofSensor;
import p042cz.msebera.android.httpclient.p044io.HttpTransportMetrics;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;
import p042cz.msebera.android.httpclient.util.CharArrayBuffer;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.conn.LoggingSessionInputBuffer */
public class LoggingSessionInputBuffer implements SessionInputBuffer, EofSensor {
    private final String charset;
    private final EofSensor eofSensor;

    /* renamed from: in */
    private final SessionInputBuffer f5699in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2, String str) {
        this.f5699in = sessionInputBuffer;
        this.eofSensor = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.wire = wire2;
        this.charset = str == null ? Consts.ASCII.name() : str;
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this(sessionInputBuffer, wire2, (String) null);
    }

    public boolean isDataAvailable(int i) throws IOException {
        return this.f5699in.isDataAvailable(i);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f5699in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }

    public int read() throws IOException {
        int read = this.f5699in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.f5699in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }

    public String readLine() throws IOException {
        String readLine = this.f5699in.readLine();
        if (this.wire.enabled() && readLine != null) {
            this.wire.input((readLine + "\r\n").getBytes(this.charset));
        }
        return readLine;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int readLine = this.f5699in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            String str = new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine);
            this.wire.input((str + "\r\n").getBytes(this.charset));
        }
        return readLine;
    }

    public HttpTransportMetrics getMetrics() {
        return this.f5699in.getMetrics();
    }

    public boolean isEof() {
        EofSensor eofSensor2 = this.eofSensor;
        if (eofSensor2 != null) {
            return eofSensor2.isEof();
        }
        return false;
    }
}
