package p035ru.unicorn.ujin.view.fragments.makearecord;

import androidx.lifecycle.Observer;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "files", "Ljava/util/HashSet;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "Lkotlin/collections/HashSet;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordFourthStage$onViewCreated$1 */
/* compiled from: RecordFourthStage.kt */
final class RecordFourthStage$onViewCreated$1<T> implements Observer<HashSet<AttachablePreview>> {
    final /* synthetic */ RecordFourthStage this$0;

    RecordFourthStage$onViewCreated$1(RecordFourthStage recordFourthStage) {
        this.this$0 = recordFourthStage;
    }

    public final void onChanged(HashSet<AttachablePreview> hashSet) {
        RecordFourthStage recordFourthStage = this.this$0;
        Intrinsics.checkNotNullExpressionValue(hashSet, "files");
        recordFourthStage.showAttaches(hashSet);
    }
}
