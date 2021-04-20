package org.mobileid.factory;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.koin.core.module.Module;
import p008c.p009a.p016c.C0908n;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0003:\u0001\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, mo51343d2 = {"Lorg/mobileid/factory/Modules;", "<init>", "()V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Modules {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final List<Module> mobileIdAppModules = CollectionsKt.listOf(C0908n.f898a);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lorg/mobileid/factory/Modules$Companion;", "", "Lorg/koin/core/module/Module;", "mobileIdAppModules", "Ljava/util/List;", "getMobileIdAppModules", "()Ljava/util/List;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Module> getMobileIdAppModules() {
            return Modules.mobileIdAppModules;
        }
    }
}
