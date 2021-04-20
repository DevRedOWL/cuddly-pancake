package p035ru.unicorn.ujin.data.realm;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0017\u0018\u0019\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ResourceV2;", "T", "", "data", "status", "Lru/unicorn/ujin/data/realm/ResourceV2$Status;", "(Ljava/lang/Object;Lru/unicorn/ujin/data/realm/ResourceV2$Status;)V", "service", "Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;", "(Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;Lru/unicorn/ujin/data/realm/ResourceV2$Status;)V", "(Lru/unicorn/ujin/data/realm/ResourceV2$Status;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getService", "()Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;", "setService", "(Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;)V", "getStatus", "()Lru/unicorn/ujin/data/realm/ResourceV2$Status;", "setStatus", "Companion", "ResourceV2Service", "ResponseV2Error", "Status", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ResourceV2 */
/* compiled from: ResourceV2.kt */
public final class ResourceV2<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private T data;
    private ResourceV2Service service;
    private Status status;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ResourceV2$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ResourceV2$Status */
    /* compiled from: ResourceV2.kt */
    public enum Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    public final ResourceV2Service getService() {
        return this.service;
    }

    public final void setService(ResourceV2Service resourceV2Service) {
        this.service = resourceV2Service;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;", "", "error", "Lru/unicorn/ujin/data/realm/ResourceV2$ResponseV2Error;", "(Lru/unicorn/ujin/data/realm/ResourceV2$ResponseV2Error;)V", "getError", "()Lru/unicorn/ujin/data/realm/ResourceV2$ResponseV2Error;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ResourceV2$ResourceV2Service */
    /* compiled from: ResourceV2.kt */
    public static final class ResourceV2Service {
        private final ResponseV2Error error;

        public static /* synthetic */ ResourceV2Service copy$default(ResourceV2Service resourceV2Service, ResponseV2Error responseV2Error, int i, Object obj) {
            if ((i & 1) != 0) {
                responseV2Error = resourceV2Service.error;
            }
            return resourceV2Service.copy(responseV2Error);
        }

        public final ResponseV2Error component1() {
            return this.error;
        }

        public final ResourceV2Service copy(ResponseV2Error responseV2Error) {
            Intrinsics.checkNotNullParameter(responseV2Error, "error");
            return new ResourceV2Service(responseV2Error);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ResourceV2Service) && Intrinsics.areEqual((Object) this.error, (Object) ((ResourceV2Service) obj).error);
            }
            return true;
        }

        public int hashCode() {
            ResponseV2Error responseV2Error = this.error;
            if (responseV2Error != null) {
                return responseV2Error.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "ResourceV2Service(error=" + this.error + ")";
        }

        public ResourceV2Service(ResponseV2Error responseV2Error) {
            Intrinsics.checkNotNullParameter(responseV2Error, "error");
            this.error = responseV2Error;
        }

        public final ResponseV2Error getError() {
            return this.error;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ResourceV2$ResponseV2Error;", "", "code", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ResourceV2$ResponseV2Error */
    /* compiled from: ResourceV2.kt */
    public static final class ResponseV2Error {
        private final String code;
        private final String message;

        public static /* synthetic */ ResponseV2Error copy$default(ResponseV2Error responseV2Error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = responseV2Error.code;
            }
            if ((i & 2) != 0) {
                str2 = responseV2Error.message;
            }
            return responseV2Error.copy(str, str2);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final ResponseV2Error copy(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "code");
            Intrinsics.checkNotNullParameter(str2, "message");
            return new ResponseV2Error(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseV2Error)) {
                return false;
            }
            ResponseV2Error responseV2Error = (ResponseV2Error) obj;
            return Intrinsics.areEqual((Object) this.code, (Object) responseV2Error.code) && Intrinsics.areEqual((Object) this.message, (Object) responseV2Error.message);
        }

        public int hashCode() {
            String str = this.code;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.message;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "ResponseV2Error(code=" + this.code + ", message=" + this.message + ")";
        }

        public ResponseV2Error(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "code");
            Intrinsics.checkNotNullParameter(str2, "message");
            this.code = str;
            this.message = str2;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    public final T getData() {
        return this.data;
    }

    public final void setData(T t) {
        this.data = t;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final void setStatus(Status status2) {
        Intrinsics.checkNotNullParameter(status2, "<set-?>");
        this.status = status2;
    }

    public ResourceV2(T t, Status status2) {
        Intrinsics.checkNotNullParameter(status2, NotificationCompat.CATEGORY_STATUS);
        this.data = t;
        this.status = status2;
    }

    public ResourceV2(ResourceV2Service resourceV2Service, Status status2) {
        Intrinsics.checkNotNullParameter(status2, NotificationCompat.CATEGORY_STATUS);
        this.service = resourceV2Service;
        this.status = status2;
    }

    public ResourceV2(Status status2) {
        Intrinsics.checkNotNullParameter(status2, NotificationCompat.CATEGORY_STATUS);
        this.status = status2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J)\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u0002H\u0005¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ResourceV2$Companion;", "", "()V", "error", "Lru/unicorn/ujin/data/realm/ResourceV2;", "T", "service", "Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;", "loading", "success", "data", "(Lru/unicorn/ujin/data/realm/ResourceV2$ResourceV2Service;Ljava/lang/Object;)Lru/unicorn/ujin/data/realm/ResourceV2;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.ResourceV2$Companion */
    /* compiled from: ResourceV2.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> ResourceV2<T> success(ResourceV2Service resourceV2Service, T t) {
            if ((resourceV2Service != null ? resourceV2Service.getError() : null) == null) {
                return new ResourceV2<>(t, Status.SUCCESS);
            }
            return new ResourceV2<>(resourceV2Service, Status.ERROR);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r7.getError();
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T> p035ru.unicorn.ujin.data.realm.ResourceV2<T> error(p035ru.unicorn.ujin.data.realm.ResourceV2.ResourceV2Service r7) {
            /*
                r6 = this;
                r0 = 0
                if (r7 == 0) goto L_0x000e
                ru.unicorn.ujin.data.realm.ResourceV2$ResponseV2Error r1 = r7.getError()
                if (r1 == 0) goto L_0x000e
                java.lang.String r1 = r1.getMessage()
                goto L_0x000f
            L_0x000e:
                r1 = r0
            L_0x000f:
                r2 = 2
                r3 = 0
                if (r1 == 0) goto L_0x002d
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                java.lang.String r5 = "Unable to resolve host"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r5 != 0) goto L_0x002a
                java.lang.String r5 = "ssl"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r4 == 0) goto L_0x002d
            L_0x002a:
                java.lang.String r1 = "Ошибка подключения."
                goto L_0x0050
            L_0x002d:
                if (r1 == 0) goto L_0x003f
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                java.lang.String r5 = "Not known method apartment"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r4 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r4 == 0) goto L_0x003f
                java.lang.String r1 = "Ошибка выполнения запроса."
                goto L_0x0050
            L_0x003f:
                if (r1 == 0) goto L_0x0050
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                java.lang.String r5 = "ust"
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (boolean) r3, (int) r2, (java.lang.Object) r0)
                if (r0 == 0) goto L_0x0050
                java.lang.String r1 = "Ошибка"
            L_0x0050:
                ru.unicorn.ujin.data.realm.ResourceV2 r0 = new ru.unicorn.ujin.data.realm.ResourceV2
                ru.unicorn.ujin.data.realm.ResourceV2$ResourceV2Service r2 = new ru.unicorn.ujin.data.realm.ResourceV2$ResourceV2Service
                ru.unicorn.ujin.data.realm.ResourceV2$ResponseV2Error r3 = new ru.unicorn.ujin.data.realm.ResourceV2$ResponseV2Error
                java.lang.String r4 = ""
                if (r7 == 0) goto L_0x0067
                ru.unicorn.ujin.data.realm.ResourceV2$ResponseV2Error r7 = r7.getError()
                if (r7 == 0) goto L_0x0067
                java.lang.String r7 = r7.getCode()
                if (r7 == 0) goto L_0x0067
                goto L_0x0068
            L_0x0067:
                r7 = r4
            L_0x0068:
                if (r1 == 0) goto L_0x006b
                goto L_0x006c
            L_0x006b:
                r1 = r4
            L_0x006c:
                r3.<init>(r7, r1)
                r2.<init>(r3)
                ru.unicorn.ujin.data.realm.ResourceV2$Status r7 = p035ru.unicorn.ujin.data.realm.ResourceV2.Status.ERROR
                r0.<init>((p035ru.unicorn.ujin.data.realm.ResourceV2.ResourceV2Service) r2, (p035ru.unicorn.ujin.data.realm.ResourceV2.Status) r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.ResourceV2.Companion.error(ru.unicorn.ujin.data.realm.ResourceV2$ResourceV2Service):ru.unicorn.ujin.data.realm.ResourceV2");
        }

        public final <T> ResourceV2<T> loading() {
            return new ResourceV2<>(Status.LOADING);
        }
    }
}
