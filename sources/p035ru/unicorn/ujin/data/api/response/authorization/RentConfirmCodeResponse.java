package p035ru.unicorn.ujin.data.api.response.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.C4594xeaad0bd1;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeResponse;", "Lio/realm/RealmObject;", "command", "", "error", "", "message", "token", "fromdomain", "worktime", "data", "Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeData;)V", "getCommand", "()Ljava/lang/String;", "setCommand", "(Ljava/lang/String;)V", "getData", "()Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeData;", "setData", "(Lru/unicorn/ujin/data/api/response/authorization/RentConfirmCodeData;)V", "getError", "()Ljava/lang/Integer;", "setError", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFromdomain", "setFromdomain", "getMessage", "setMessage", "getToken", "setToken", "getWorktime", "setWorktime", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse */
/* compiled from: RentConfirmCodeResponse.kt */
public class RentConfirmCodeResponse extends RealmObject implements C4594xeaad0bd1 {
    private String command;
    private RentConfirmCodeData data;
    private Integer error;
    private String fromdomain;
    private String message;
    private String token;
    private String worktime;

    public RentConfirmCodeResponse() {
        this((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (RentConfirmCodeData) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$command() {
        return this.command;
    }

    public RentConfirmCodeData realmGet$data() {
        return this.data;
    }

    public Integer realmGet$error() {
        return this.error;
    }

    public String realmGet$fromdomain() {
        return this.fromdomain;
    }

    public String realmGet$message() {
        return this.message;
    }

    public String realmGet$token() {
        return this.token;
    }

    public String realmGet$worktime() {
        return this.worktime;
    }

    public void realmSet$command(String str) {
        this.command = str;
    }

    public void realmSet$data(RentConfirmCodeData rentConfirmCodeData) {
        this.data = rentConfirmCodeData;
    }

    public void realmSet$error(Integer num) {
        this.error = num;
    }

    public void realmSet$fromdomain(String str) {
        this.fromdomain = str;
    }

    public void realmSet$message(String str) {
        this.message = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$worktime(String str) {
        this.worktime = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RentConfirmCodeResponse(java.lang.String r6, java.lang.Integer r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0016
            java.lang.String r8 = ""
        L_0x0016:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001e
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x001e:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0026
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0026:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002e
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L_0x002e:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0036
            r12 = r0
            ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData r12 = (p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData) r12
        L_0x0036:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x004c
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCommand() {
        return realmGet$command();
    }

    public final void setCommand(String str) {
        realmSet$command(str);
    }

    public final Integer getError() {
        return realmGet$error();
    }

    public final void setError(Integer num) {
        realmSet$error(num);
    }

    public final String getMessage() {
        return realmGet$message();
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$message(str);
    }

    public final String getToken() {
        return realmGet$token();
    }

    public final void setToken(String str) {
        realmSet$token(str);
    }

    public final String getFromdomain() {
        return realmGet$fromdomain();
    }

    public final void setFromdomain(String str) {
        realmSet$fromdomain(str);
    }

    public final String getWorktime() {
        return realmGet$worktime();
    }

    public final void setWorktime(String str) {
        realmSet$worktime(str);
    }

    public final RentConfirmCodeData getData() {
        return realmGet$data();
    }

    public final void setData(RentConfirmCodeData rentConfirmCodeData) {
        realmSet$data(rentConfirmCodeData);
    }

    public RentConfirmCodeResponse(String str, Integer num, String str2, String str3, String str4, String str5, RentConfirmCodeData rentConfirmCodeData) {
        Intrinsics.checkNotNullParameter(str2, "message");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$command(str);
        realmSet$error(num);
        realmSet$message(str2);
        realmSet$token(str3);
        realmSet$fromdomain(str4);
        realmSet$worktime(str5);
        realmSet$data(rentConfirmCodeData);
    }
}
