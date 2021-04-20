package p035ru.unicorn.ujin.market.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/OrderActionType;", "", "title", "", "(Ljava/lang/String;II)V", "getTitle", "()I", "EMAIL", "CALL", "GO_WEB", "EMAIL_FORM", "CALLBACK", "ORDER", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.enums.OrderActionType */
/* compiled from: OrderActionType.kt */
public enum OrderActionType {
    EMAIL(R.string.sendOrder),
    CALL(R.string.callCompany),
    GO_WEB(R.string.goWebSite),
    EMAIL_FORM(R.string.fillEmailForm),
    CALLBACK(R.string.orderCallback),
    ORDER(R.string.createOrder);
    
    public static final Companion Companion = null;
    private final int title;

    private OrderActionType(int i) {
        this.title = i;
    }

    public final int getTitle() {
        return this.title;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/enums/OrderActionType$Companion;", "", "()V", "getTitle", "", "name", "", "getType", "Lru/unicorn/ujin/market/enums/OrderActionType;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.enums.OrderActionType$Companion */
    /* compiled from: OrderActionType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTitle(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return OrderActionType.valueOf(upperCase).getTitle();
        }

        public final OrderActionType getType(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return OrderActionType.valueOf(upperCase);
        }
    }
}
