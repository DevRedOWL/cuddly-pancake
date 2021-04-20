package p035ru.unicorn.ujin.view.fragments.base.attach;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachDataIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "kotlin.jvm.PlatformType", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachDataIn;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachRepo$uploadFile$1 */
/* compiled from: AttachRepo.kt */
final class AttachRepo$uploadFile$1<T, R> implements Function<AttachDataIn, Resource<AttachFileData>> {
    public static final AttachRepo$uploadFile$1 INSTANCE = new AttachRepo$uploadFile$1();

    AttachRepo$uploadFile$1() {
    }

    public final Resource<AttachFileData> apply(AttachDataIn attachDataIn) {
        Intrinsics.checkNotNullParameter(attachDataIn, "data");
        return Resource.success(0, "", attachDataIn.getData());
    }
}
