package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.QrCode;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/QrCode;", "kotlin.jvm.PlatformType", "it", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$loadQrCode$localQr$3 */
/* compiled from: PassRepo.kt */
final class PassRepo$loadQrCode$localQr$3<T, R> implements Function<QrCode, Resource<QrCode>> {
    public static final PassRepo$loadQrCode$localQr$3 INSTANCE = new PassRepo$loadQrCode$localQr$3();

    PassRepo$loadQrCode$localQr$3() {
    }

    public final Resource<QrCode> apply(QrCode qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "it");
        return Resource.success(0, "", qrCode);
    }
}
