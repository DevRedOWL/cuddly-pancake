package org.jetbrains.anko;

import kotlin.Metadata;
import kotlin._Assertions;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"org/jetbrains/anko/Logging$AnkoLogger$2", "Lorg/jetbrains/anko/AnkoLogger;", "(Ljava/lang/String;)V", "loggerTag", "", "getLoggerTag", "()Ljava/lang/String;", "commons_release"}, mo51344k = 1, mo51345mv = {1, 1, 5})
/* compiled from: Logging.kt */
public final class Logging$AnkoLogger$2 implements AnkoLogger {
    final /* synthetic */ String $tag;
    private final String loggerTag;

    Logging$AnkoLogger$2(String str) {
        this.$tag = str;
        boolean z = str.length() <= 23;
        if (!_Assertions.ENABLED || z) {
            this.loggerTag = str;
            return;
        }
        throw new AssertionError("The maximum tag length is 23, got " + this.$tag);
    }

    public String getLoggerTag() {
        return this.loggerTag;
    }
}
