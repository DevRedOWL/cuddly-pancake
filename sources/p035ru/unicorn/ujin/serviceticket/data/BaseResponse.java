package p035ru.unicorn.ujin.serviceticket.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B+\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/BaseResponse;", "T", "", "data", "message", "", "error", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "Error", "Loading", "Success", "Lru/unicorn/ujin/serviceticket/data/BaseResponse$Success;", "Lru/unicorn/ujin/serviceticket/data/BaseResponse$Loading;", "Lru/unicorn/ujin/serviceticket/data/BaseResponse$Error;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.serviceticket.data.BaseResponse */
/* compiled from: BaseResponse.kt */
public abstract class BaseResponse<T> {
    private final T data;
    private final Integer error;
    private final String message;

    private BaseResponse(T t, String str, Integer num) {
        this.data = t;
        this.message = str;
        this.error = num;
    }

    public final T getData() {
        return this.data;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ BaseResponse(Object obj, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? 0 : num);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getError() {
        return this.error;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/BaseResponse$Success;", "T", "Lru/unicorn/ujin/serviceticket/data/BaseResponse;", "data", "(Ljava/lang/Object;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.serviceticket.data.BaseResponse$Success */
    /* compiled from: BaseResponse.kt */
    public static final class Success<T> extends BaseResponse<T> {
        public Success(T t) {
            super(t, (String) null, (Integer) null, 6, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/BaseResponse$Loading;", "T", "Lru/unicorn/ujin/serviceticket/data/BaseResponse;", "data", "refreshing", "", "(Ljava/lang/Object;Z)V", "getRefreshing", "()Z", "setRefreshing", "(Z)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.serviceticket.data.BaseResponse$Loading */
    /* compiled from: BaseResponse.kt */
    public static final class Loading<T> extends BaseResponse<T> {
        private boolean refreshing;

        public Loading() {
            this((Object) null, false, 3, (DefaultConstructorMarker) null);
        }

        public Loading(T t, boolean z) {
            super(t, (String) null, (Integer) null, 6, (DefaultConstructorMarker) null);
            this.refreshing = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Loading(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? false : z);
        }

        public final boolean getRefreshing() {
            return this.refreshing;
        }

        public final void setRefreshing(boolean z) {
            this.refreshing = z;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/serviceticket/data/BaseResponse$Error;", "T", "Lru/unicorn/ujin/serviceticket/data/BaseResponse;", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.serviceticket.data.BaseResponse$Error */
    /* compiled from: BaseResponse.kt */
    public static final class Error<T> extends BaseResponse<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(T t, String str) {
            super(t, str, (Integer) null, 4, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : obj, str);
        }
    }
}
