package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import java.net.Socket;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.io.SocketOutputBuffer */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        init(socket.getOutputStream(), i < 1024 ? 1024 : i, httpParams);
    }
}
