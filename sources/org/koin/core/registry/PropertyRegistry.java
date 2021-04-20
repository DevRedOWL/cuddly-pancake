package org.koin.core.registry;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p049io.TextStreamsKt;
import kotlin.text.Charsets;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.ext.StringExtKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u001b\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0014J)\u0010\u0015\u001a\u00020\u0007\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u0002H\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lorg/koin/core/registry/PropertyRegistry;", "", "()V", "values", "", "", "close", "", "getProperty", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "loadEnvironmentProperties", "loadPropertiesFromFile", "fileName", "readDataFromFile", "Ljava/util/Properties;", "content", "saveProperties", "properties", "", "saveProperty", "value", "saveProperty$koin_core", "(Ljava/lang/String;Ljava/lang/Object;)V", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: PropertyRegistry.kt */
public final class PropertyRegistry {
    private final Map<String, Object> values = new ConcurrentHashMap();

    public final void saveProperties(Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(map, "properties");
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.debug("load " + map.size() + " properties");
        }
        this.values.putAll(map);
    }

    public final void saveProperties(Properties properties) {
        Intrinsics.checkParameterIsNotNull(properties, "properties");
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.debug("load " + properties.size() + " properties");
        }
        Map map = MapsKt.toMap(properties);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (StringExtKt.isInt(str2)) {
                    saveProperty$koin_core(str, Integer.valueOf(Integer.parseInt(str2)));
                } else if (StringExtKt.isFloat(str2)) {
                    saveProperty$koin_core(str, Float.valueOf(Float.parseFloat(str2)));
                } else {
                    saveProperty$koin_core(str, StringExtKt.quoted(str2));
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }

    public final <T> void saveProperty$koin_core(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(t, "value");
        this.values.put(str, t);
    }

    public final <T> T getProperty(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        T t = this.values.get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public final void loadPropertiesFromFile(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            Logger logger = KoinApplication.Companion.getLogger();
            logger.debug("load properties from " + str);
        }
        URL resource = Koin.class.getResource(str);
        if (resource != null) {
            str2 = new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (KoinApplication.Companion.getLogger().isAt(Level.INFO)) {
                Logger logger2 = KoinApplication.Companion.getLogger();
                logger2.info("loaded properties from file:'" + str + '\'');
            }
            saveProperties(readDataFromFile(str2));
            return;
        }
        throw new NoPropertyFileFoundException("No properties found for file '" + str + '\'');
    }

    private final Properties readDataFromFile(String str) {
        Properties properties = new Properties();
        Charset charset = Charsets.UTF_8;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            properties.load(new ByteArrayInputStream(bytes));
            return properties;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void loadEnvironmentProperties() {
        if (KoinApplication.Companion.getLogger().isAt(Level.DEBUG)) {
            KoinApplication.Companion.getLogger().debug("load properties from environment");
        }
        Properties properties = System.getProperties();
        Intrinsics.checkExpressionValueIsNotNull(properties, "sysProperties");
        saveProperties(properties);
        Map<String, String> map = System.getenv();
        Intrinsics.checkExpressionValueIsNotNull(map, "System.getenv()");
        Properties properties2 = new Properties();
        properties2.putAll(map);
        saveProperties(properties2);
    }

    public final void close() {
        this.values.clear();
    }
}
