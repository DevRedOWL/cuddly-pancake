package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "kotlin.jvm.PlatformType", "file", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "apply", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM$createCompany$4$3"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$1 */
/* compiled from: PassCompanyVM.kt */
final class PassCompanyVM$createCompany$$inlined$let$lambda$1<T, R> implements Function<AttachablePreview, ObservableSource<? extends Resource<AttachFileData>>> {
    final /* synthetic */ PassCompanyVM this$0;

    PassCompanyVM$createCompany$$inlined$let$lambda$1(PassCompanyVM passCompanyVM) {
        this.this$0 = passCompanyVM;
    }

    public final ObservableSource<? extends Resource<AttachFileData>> apply(AttachablePreview attachablePreview) {
        Intrinsics.checkNotNullParameter(attachablePreview, UriUtil.LOCAL_FILE_SCHEME);
        return this.this$0.attachRep.upload(attachablePreview.imageUrl(), attachablePreview.type());
    }
}
