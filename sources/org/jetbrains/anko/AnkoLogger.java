package org.jetbrains.anko;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo51343d2 = {"Lorg/jetbrains/anko/AnkoLogger;", "", "loggerTag", "", "getLoggerTag", "()Ljava/lang/String;", "commons_release"}, mo51344k = 1, mo51345mv = {1, 1, 5})
/* compiled from: Logging.kt */
public interface AnkoLogger {
    String getLoggerTag();

    @Metadata(mo51341bv = {1, 0, 1}, mo51344k = 3, mo51345mv = {1, 1, 5})
    /* compiled from: Logging.kt */
    public static final class DefaultImpls {
        public static String getLoggerTag(AnkoLogger ankoLogger) {
            return Logging.getTag(ankoLogger.getClass());
        }
    }
}
