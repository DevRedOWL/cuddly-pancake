package p042cz.msebera.android.httpclient.impl.entity;

import java.io.IOException;
import java.io.OutputStream;
import p042cz.msebera.android.httpclient.HttpEntity;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpMessage;
import p042cz.msebera.android.httpclient.entity.ContentLengthStrategy;
import p042cz.msebera.android.httpclient.impl.p043io.ChunkedOutputStream;
import p042cz.msebera.android.httpclient.impl.p043io.ContentLengthOutputStream;
import p042cz.msebera.android.httpclient.impl.p043io.IdentityOutputStream;
import p042cz.msebera.android.httpclient.p044io.SessionOutputBuffer;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.entity.EntitySerializer */
public class EntitySerializer {
    private final ContentLengthStrategy lenStrategy;

    public EntitySerializer(ContentLengthStrategy contentLengthStrategy) {
        this.lenStrategy = (ContentLengthStrategy) Args.notNull(contentLengthStrategy, "Content length strategy");
    }

    /* access modifiers changed from: protected */
    public OutputStream doSerialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage) throws HttpException, IOException {
        long determineLength = this.lenStrategy.determineLength(httpMessage);
        if (determineLength == -2) {
            return new ChunkedOutputStream(sessionOutputBuffer);
        }
        if (determineLength == -1) {
            return new IdentityOutputStream(sessionOutputBuffer);
        }
        return new ContentLengthOutputStream(sessionOutputBuffer, determineLength);
    }

    public void serialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage, HttpEntity httpEntity) throws HttpException, IOException {
        Args.notNull(sessionOutputBuffer, "Session output buffer");
        Args.notNull(httpMessage, "HTTP message");
        Args.notNull(httpEntity, "HTTP entity");
        OutputStream doSerialize = doSerialize(sessionOutputBuffer, httpMessage);
        httpEntity.writeTo(doSerialize);
        doSerialize.close();
    }
}
