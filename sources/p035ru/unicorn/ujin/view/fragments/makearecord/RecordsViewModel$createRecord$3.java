package p035ru.unicorn.ujin.view.fragments.makearecord;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "kotlin.jvm.PlatformType", "file", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$3 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$3<T, R> implements Function<AttachablePreview, ObservableSource<? extends Resource<AttachFileData>>> {
    final /* synthetic */ RecordsViewModel this$0;

    RecordsViewModel$createRecord$3(RecordsViewModel recordsViewModel) {
        this.this$0 = recordsViewModel;
    }

    public final ObservableSource<? extends Resource<AttachFileData>> apply(AttachablePreview attachablePreview) {
        Intrinsics.checkNotNullParameter(attachablePreview, UriUtil.LOCAL_FILE_SCHEME);
        return this.this$0.attachRep.uploadFile(attachablePreview.imageUrl(), attachablePreview.fileName());
    }
}
