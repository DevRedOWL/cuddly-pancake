package p042cz.msebera.android.httpclient.impl.client.cache;

import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Formatter;
import java.util.Locale;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.BasicIdGenerator */
class BasicIdGenerator {
    private long count;
    private final String hostname;
    private final SecureRandom rnd;

    public BasicIdGenerator() {
        String str;
        try {
            str = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused) {
            str = AndroidInfoHelpers.DEVICE_LOCALHOST;
        }
        this.hostname = str;
        try {
            this.rnd = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            throw new Error(e);
        }
    }

    public synchronized void generate(StringBuilder sb) {
        this.count++;
        int nextInt = this.rnd.nextInt();
        sb.append(System.currentTimeMillis());
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%1$016x-%2$08x", new Object[]{Long.valueOf(this.count), Integer.valueOf(nextInt)});
        formatter.close();
        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        sb.append(this.hostname);
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        generate(sb);
        return sb.toString();
    }
}
