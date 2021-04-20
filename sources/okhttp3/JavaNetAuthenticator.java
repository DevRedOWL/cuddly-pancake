package okhttp3;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, mo51343d2 = {"Lokhttp3/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "()V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "okhttp-urlconnection"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: JavaNetAuthenticator.kt */
public final class JavaNetAuthenticator implements Authenticator {
    public Request authenticate(Route route, Response response) throws IOException {
        Proxy proxy;
        PasswordAuthentication passwordAuthentication;
        Intrinsics.checkParameterIsNotNull(response, "response");
        List<Challenge> challenges = response.challenges();
        Request request = response.request();
        HttpUrl url = request.url();
        boolean z = response.code() == 407;
        if (route == null || (proxy = route.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge next : challenges) {
            if (StringsKt.equals("Basic", next.scheme(), true)) {
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        Intrinsics.checkExpressionValueIsNotNull(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, url), inetSocketAddress.getPort(), url.scheme(), next.realm(), next.scheme(), url.url(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String host = url.host();
                    Intrinsics.checkExpressionValueIsNotNull(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(host, connectToInetAddress(proxy, url), url.port(), url.scheme(), next.realm(), next.scheme(), url.url(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    Intrinsics.checkExpressionValueIsNotNull(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    Intrinsics.checkExpressionValueIsNotNull(password, "auth.password");
                    return request.newBuilder().header(str, Credentials.basic(userName, new String(password), next.charset())).build();
                }
            }
        }
        return null;
    }

    private final InetAddress connectToInetAddress(Proxy proxy, HttpUrl httpUrl) throws IOException {
        if (proxy.type() == Proxy.Type.DIRECT) {
            InetAddress byName = InetAddress.getByName(httpUrl.host());
            Intrinsics.checkExpressionValueIsNotNull(byName, "InetAddress.getByName(url.host)");
            return byName;
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            Intrinsics.checkExpressionValueIsNotNull(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }
}
