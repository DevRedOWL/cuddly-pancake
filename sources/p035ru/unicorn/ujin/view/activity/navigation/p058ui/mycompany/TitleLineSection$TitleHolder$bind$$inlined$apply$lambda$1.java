package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.TitleLineSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/mycompany/TitleLineSection$TitleHolder$bind$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.TitleLineSection$TitleHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: TitleLineSection.kt */
final class TitleLineSection$TitleHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TitleLineSection.TitleHolder this$0;

    TitleLineSection$TitleHolder$bind$$inlined$apply$lambda$1(TitleLineSection.TitleHolder titleHolder) {
        this.this$0 = titleHolder;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getItemClick().onNext(this.this$0.this$0.getData());
    }
}
