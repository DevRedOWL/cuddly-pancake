package p035ru.unicorn.ujin.view.fragments.development;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.developerPage.DeveloperButtonAction;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageData;
import p035ru.unicorn.ujin.data.developerPage.DeveloperSchemaButton;
import p035ru.unicorn.ujin.view.activity.VideoPlayerActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/development/DeveloperFragment$showData$1$2$1$6", "ru/unicorn/ujin/view/fragments/development/DeveloperFragment$$special$$inlined$apply$lambda$2", "ru/unicorn/ujin/view/fragments/development/DeveloperFragment$$special$$inlined$let$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment$showData$$inlined$let$lambda$2 */
/* compiled from: DeveloperFragment.kt */
final class DeveloperFragment$showData$$inlined$let$lambda$2 implements View.OnClickListener {
    final /* synthetic */ DeveloperPageData $data$inlined;
    final /* synthetic */ DeveloperSchemaButton $developerButton$inlined;
    final /* synthetic */ View $this_apply;
    final /* synthetic */ DeveloperFragment this$0;

    DeveloperFragment$showData$$inlined$let$lambda$2(View view, DeveloperSchemaButton developerSchemaButton, DeveloperFragment developerFragment, DeveloperPageData developerPageData) {
        this.$this_apply = view;
        this.$developerButton$inlined = developerSchemaButton;
        this.this$0 = developerFragment;
        this.$data$inlined = developerPageData;
    }

    public final void onClick(View view) {
        DeveloperSchemaButton developerSchemaButton = this.$developerButton$inlined;
        Intrinsics.checkNotNullExpressionValue(developerSchemaButton, "developerButton");
        DeveloperButtonAction action = developerSchemaButton.getAction();
        if (action != null && action.getUrl() != null) {
            Context context = this.$this_apply.getContext();
            DeveloperSchemaButton developerSchemaButton2 = this.$developerButton$inlined;
            Intrinsics.checkNotNullExpressionValue(developerSchemaButton2, "developerButton");
            DeveloperButtonAction action2 = developerSchemaButton2.getAction();
            Intrinsics.checkNotNullExpressionValue(action2, "developerButton.action");
            VideoPlayerActivity.start(context, action2.getUrl());
        }
    }
}
