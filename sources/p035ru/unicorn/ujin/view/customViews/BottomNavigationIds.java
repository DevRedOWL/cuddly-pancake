package p035ru.unicorn.ujin.view.customViews;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ReactConst;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/BottomNavigationIds;", "", "stringId", "", "intId", "", "tabName", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getIntId", "()I", "getStringId", "()Ljava/lang/String;", "getTabName", "SMARTHOME", "GUARD", "SERVICE", "MARKET", "CHAT", "HOTKEYS", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.BottomNavigationIds */
/* compiled from: BottomNavigationIds.kt */
public enum BottomNavigationIds {
    SMARTHOME("smarthome", R.id.navigation_smartflat, r6),
    GUARD("guard", R.id.navigation_security, ReactConst.SECURITYTAB),
    SERVICE(ReactConst.SERVICETAB, R.id.navigation_service, r8),
    MARKET(ReactConst.MARKET, R.id.navigation_market, ReactConst.MARKET),
    CHAT("chats", R.id.navigation_chats_id, ReactConst.CHAT),
    HOTKEYS("hotkeys", 0, "");
    
    public static final Companion Companion = null;
    private final int intId;
    private final String stringId;
    private final String tabName;

    @JvmStatic
    public static final BottomNavigationIds getByStringId(String str) {
        return Companion.getByStringId(str);
    }

    private BottomNavigationIds(String str, int i, String str2) {
        this.stringId = str;
        this.intId = i;
        this.tabName = str2;
    }

    public final int getIntId() {
        return this.intId;
    }

    public final String getStringId() {
        return this.stringId;
    }

    public final String getTabName() {
        return this.tabName;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/BottomNavigationIds$Companion;", "", "()V", "getByStringId", "Lru/unicorn/ujin/view/customViews/BottomNavigationIds;", "stringId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.BottomNavigationIds$Companion */
    /* compiled from: BottomNavigationIds.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final BottomNavigationIds getByStringId(String str) {
            Intrinsics.checkNotNullParameter(str, "stringId");
            for (BottomNavigationIds bottomNavigationIds : BottomNavigationIds.values()) {
                if (Intrinsics.areEqual((Object) bottomNavigationIds.getStringId(), (Object) str)) {
                    return bottomNavigationIds;
                }
            }
            return null;
        }
    }
}
