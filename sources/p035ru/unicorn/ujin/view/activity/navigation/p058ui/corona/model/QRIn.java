package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/QRIn;", "", "qr", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/QRUrl;", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/QRUrl;)V", "getQr", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/QRUrl;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.QRIn */
/* compiled from: QRIn.kt */
public final class QRIn {

    /* renamed from: qr */
    private final QRUrl f6758qr;

    public static /* synthetic */ QRIn copy$default(QRIn qRIn, QRUrl qRUrl, int i, Object obj) {
        if ((i & 1) != 0) {
            qRUrl = qRIn.f6758qr;
        }
        return qRIn.copy(qRUrl);
    }

    public final QRUrl component1() {
        return this.f6758qr;
    }

    public final QRIn copy(QRUrl qRUrl) {
        Intrinsics.checkNotNullParameter(qRUrl, "qr");
        return new QRIn(qRUrl);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof QRIn) && Intrinsics.areEqual((Object) this.f6758qr, (Object) ((QRIn) obj).f6758qr);
        }
        return true;
    }

    public int hashCode() {
        QRUrl qRUrl = this.f6758qr;
        if (qRUrl != null) {
            return qRUrl.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "QRIn(qr=" + this.f6758qr + ")";
    }

    public QRIn(QRUrl qRUrl) {
        Intrinsics.checkNotNullParameter(qRUrl, "qr");
        this.f6758qr = qRUrl;
    }

    public final QRUrl getQr() {
        return this.f6758qr;
    }
}
