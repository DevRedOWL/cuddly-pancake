package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.FileUtil;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lorg/reactivestreams/Publisher;", "Lru/unicorn/ujin/data/realm/Resource;", "", "kotlin.jvm.PlatformType", "it", "Lru/unicorn/ujin/ble/data/BleKeyData;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$sendFaceData$1 */
/* compiled from: PassRepo.kt */
final class PassRepo$sendFaceData$1<T, R> implements Function<BleKeyData, Publisher<? extends Resource<Unit>>> {
    final /* synthetic */ Bitmap $picture;
    final /* synthetic */ PassRepo this$0;

    PassRepo$sendFaceData$1(PassRepo passRepo, Bitmap bitmap) {
        this.this$0 = passRepo;
        this.$picture = bitmap;
    }

    public final Publisher<? extends Resource<Unit>> apply(BleKeyData bleKeyData) {
        Intrinsics.checkNotNullParameter(bleKeyData, "it");
        Pro100Api access$getApi$p = this.this$0.getApi();
        String token = this.this$0.getToken();
        String type = PASS_TYPE.FACE.getType();
        String valueOf = String.valueOf(bleKeyData.getSerialNumber());
        String encodeTobase64 = FileUtil.encodeTobase64(this.$picture);
        Intrinsics.checkNotNullExpressionValue(encodeTobase64, "FileUtil.encodeTobase64(picture)");
        return access$getApi$p.sendFaceData(token, type, valueOf, encodeTobase64);
    }
}
