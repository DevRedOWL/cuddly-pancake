package p035ru.unicorn.ujin.data.realm.marketplace;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0016\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Field;", "Lio/realm/RealmObject;", "name", "", "label", "placeholder", "default", "type", "order", "required", "", "inputType", "content", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/SelectValue;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lio/realm/RealmList;)V", "getContent", "()Lio/realm/RealmList;", "setContent", "(Lio/realm/RealmList;)V", "getDefault", "()Ljava/lang/String;", "setDefault", "(Ljava/lang/String;)V", "getInputType", "setInputType", "getLabel", "setLabel", "getName", "setName", "getOrder", "setOrder", "getPlaceholder", "setPlaceholder", "getRequired", "()Ljava/lang/Boolean;", "setRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getType", "setType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Field */
/* compiled from: Field.kt */
public class Field extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface {
    @SerializedName("content")
    private RealmList<SelectValue> content;
    @SerializedName("default")

    /* renamed from: default  reason: not valid java name */
    private String f7021default;
    @SerializedName("input_type")
    private String inputType;
    @SerializedName("label")
    private String label;
    @SerializedName("name")
    private String name;
    @SerializedName("order")
    private String order;
    @SerializedName("placeholder")
    private String placeholder;
    @SerializedName("required")
    private Boolean required;
    @SerializedName("type")
    private String type;

    public Field() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (RealmList) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$content() {
        return this.content;
    }

    public String realmGet$default() {
        return this.f7021default;
    }

    public String realmGet$inputType() {
        return this.inputType;
    }

    public String realmGet$label() {
        return this.label;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$order() {
        return this.order;
    }

    public String realmGet$placeholder() {
        return this.placeholder;
    }

    public Boolean realmGet$required() {
        return this.required;
    }

    public String realmGet$type() {
        return this.type;
    }

    public void realmSet$content(RealmList realmList) {
        this.content = realmList;
    }

    public void realmSet$default(String str) {
        this.f7021default = str;
    }

    public void realmSet$inputType(String str) {
        this.inputType = str;
    }

    public void realmSet$label(String str) {
        this.label = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$order(String str) {
        this.order = str;
    }

    public void realmSet$placeholder(String str) {
        this.placeholder = str;
    }

    public void realmSet$required(Boolean bool) {
        this.required = bool;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Field(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, p046io.realm.RealmList r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r21
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000d
        L_0x000c:
            r2 = r12
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0016
        L_0x0015:
            r4 = r13
        L_0x0016:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001e
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0028
        L_0x0027:
            r6 = r15
        L_0x0028:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0030
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0032
        L_0x0030:
            r7 = r16
        L_0x0032:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003a
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x003c
        L_0x003a:
            r8 = r17
        L_0x003c:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0044
            r9 = r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x0046
        L_0x0044:
            r9 = r18
        L_0x0046:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004e
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0050
        L_0x004e:
            r10 = r19
        L_0x0050:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0058
            r1 = r3
            io.realm.RealmList r1 = (p046io.realm.RealmList) r1
            goto L_0x005a
        L_0x0058:
            r1 = r20
        L_0x005a:
            r12 = r11
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r10
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0077
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Field.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final String getLabel() {
        return realmGet$label();
    }

    public final void setLabel(String str) {
        realmSet$label(str);
    }

    public final String getPlaceholder() {
        return realmGet$placeholder();
    }

    public final void setPlaceholder(String str) {
        realmSet$placeholder(str);
    }

    public final String getDefault() {
        return realmGet$default();
    }

    public final void setDefault(String str) {
        realmSet$default(str);
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final String getOrder() {
        return realmGet$order();
    }

    public final void setOrder(String str) {
        realmSet$order(str);
    }

    public final Boolean getRequired() {
        return realmGet$required();
    }

    public final void setRequired(Boolean bool) {
        realmSet$required(bool);
    }

    public final String getInputType() {
        return realmGet$inputType();
    }

    public final void setInputType(String str) {
        realmSet$inputType(str);
    }

    public final RealmList<SelectValue> getContent() {
        return realmGet$content();
    }

    public final void setContent(RealmList<SelectValue> realmList) {
        realmSet$content(realmList);
    }

    public Field(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, RealmList<SelectValue> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$name(str);
        realmSet$label(str2);
        realmSet$placeholder(str3);
        realmSet$default(str4);
        realmSet$type(str5);
        realmSet$order(str6);
        realmSet$required(bool);
        realmSet$inputType(str7);
        realmSet$content(realmList);
    }
}
