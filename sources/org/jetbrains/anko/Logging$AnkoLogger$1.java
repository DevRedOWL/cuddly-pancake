package org.jetbrains.anko;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 1}, mo51342d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"org/jetbrains/anko/Logging$AnkoLogger$1", "Lorg/jetbrains/anko/AnkoLogger;", "(Ljava/lang/Class;)V", "loggerTag", "", "getLoggerTag", "()Ljava/lang/String;", "commons_release"}, mo51344k = 1, mo51345mv = {1, 1, 5})
/* compiled from: Logging.kt */
public final class Logging$AnkoLogger$1 implements AnkoLogger {
    final /* synthetic */ Class $clazz;
    private final String loggerTag;

    Logging$AnkoLogger$1(Class cls) {
        this.$clazz = cls;
        this.loggerTag = Logging.getTag(cls);
    }

    public String getLoggerTag() {
        return this.loggerTag;
    }
}
