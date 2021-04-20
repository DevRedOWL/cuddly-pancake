package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4605x38353795;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001'BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010&\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0000H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartOffer;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "title", "price", "quantity", "", "oldPrice", "summary", "image", "Lru/unicorn/ujin/data/realm/FileData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileData;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getImage", "()Lru/unicorn/ujin/data/realm/FileData;", "setImage", "(Lru/unicorn/ujin/data/realm/FileData;)V", "getOldPrice", "setOldPrice", "getPrice", "setPrice", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSummary", "setSummary", "getTitle", "setTitle", "areContentsTheSame", "", "other", "areItemsTheSame", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartOffer */
/* compiled from: CartOffer.kt */
public class CartOffer extends RealmObject implements Diffable<CartOffer>, C4605x38353795 {
    @PrimaryKey

    /* renamed from: id */
    private String f6673id;
    private FileData image;
    @SerializedName("old_price")
    private String oldPrice;
    private String price;
    private Integer quantity;
    private String summary;
    private String title;

    public CartOffer() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (FileData) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$id() {
        return this.f6673id;
    }

    public FileData realmGet$image() {
        return this.image;
    }

    public String realmGet$oldPrice() {
        return this.oldPrice;
    }

    public String realmGet$price() {
        return this.price;
    }

    public Integer realmGet$quantity() {
        return this.quantity;
    }

    public String realmGet$summary() {
        return this.summary;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$id(String str) {
        this.f6673id = str;
    }

    public void realmSet$image(FileData fileData) {
        this.image = fileData;
    }

    public void realmSet$oldPrice(String str) {
        this.oldPrice = str;
    }

    public void realmSet$price(String str) {
        this.price = str;
    }

    public void realmSet$quantity(Integer num) {
        this.quantity = num;
    }

    public void realmSet$summary(String str) {
        this.summary = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CartOffer(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, p035ru.unicorn.ujin.data.realm.FileData r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
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
            java.lang.String r7 = (java.lang.String) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.Integer r9 = (java.lang.Integer) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
        L_0x002f:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            r12 = r0
            ru.unicorn.ujin.data.realm.FileData r12 = (p035ru.unicorn.ujin.data.realm.FileData) r12
        L_0x0037:
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
            if (r6 == 0) goto L_0x004d
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.FileData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getPrice() {
        return realmGet$price();
    }

    public final void setPrice(String str) {
        realmSet$price(str);
    }

    public final Integer getQuantity() {
        return realmGet$quantity();
    }

    public final void setQuantity(Integer num) {
        realmSet$quantity(num);
    }

    public final String getOldPrice() {
        return realmGet$oldPrice();
    }

    public final void setOldPrice(String str) {
        realmSet$oldPrice(str);
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final void setSummary(String str) {
        realmSet$summary(str);
    }

    public final FileData getImage() {
        return realmGet$image();
    }

    public final void setImage(FileData fileData) {
        realmSet$image(fileData);
    }

    public CartOffer(String str, String str2, String str3, Integer num, String str4, String str5, FileData fileData) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$price(str3);
        realmSet$quantity(num);
        realmSet$oldPrice(str4);
        realmSet$summary(str5);
        realmSet$image(fileData);
    }

    public boolean areItemsTheSame(CartOffer cartOffer) {
        return Intrinsics.areEqual((Object) realmGet$id(), (Object) cartOffer != null ? cartOffer.realmGet$id() : null);
    }

    public boolean areContentsTheSame(CartOffer cartOffer) {
        return Intrinsics.areEqual((Object) realmGet$quantity(), (Object) cartOffer != null ? cartOffer.realmGet$quantity() : null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CartOffer$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.CartOffer$Fields */
    /* compiled from: CartOffer.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6674id = "id";

        private Fields() {
        }
    }
}
