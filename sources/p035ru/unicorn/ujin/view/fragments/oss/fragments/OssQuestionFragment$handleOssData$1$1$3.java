package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "<anonymous parameter 1>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleOssData$1$1$3 */
/* compiled from: OssQuestionFragment.kt */
final class OssQuestionFragment$handleOssData$1$1$3 extends Lambda implements Function2<SingleLiveEvent<Resource<Object>>, String, Unit> {
    public static final OssQuestionFragment$handleOssData$1$1$3 INSTANCE = new OssQuestionFragment$handleOssData$1$1$3();

    OssQuestionFragment$handleOssData$1$1$3() {
        super(2);
    }

    public final void invoke(SingleLiveEvent<Resource<Object>> singleLiveEvent, String str) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((SingleLiveEvent<Resource<Object>>) (SingleLiveEvent) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
