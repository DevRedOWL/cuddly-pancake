package p042cz.msebera.android.httpclient.auth;

import p042cz.msebera.android.httpclient.ProtocolException;

/* renamed from: cz.msebera.android.httpclient.auth.MalformedChallengeException */
public class MalformedChallengeException extends ProtocolException {
    private static final long serialVersionUID = 814586927989932284L;

    public MalformedChallengeException() {
    }

    public MalformedChallengeException(String str) {
        super(str);
    }

    public MalformedChallengeException(String str, Throwable th) {
        super(str, th);
    }
}
