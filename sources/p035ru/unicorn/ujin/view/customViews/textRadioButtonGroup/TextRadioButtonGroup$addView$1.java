package p035ru.unicorn.ujin.view.customViews.textRadioButtonGroup;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButtonGroup$addView$1 */
/* compiled from: TextRadioButtonGroup.kt */
final class TextRadioButtonGroup$addView$1 implements View.OnClickListener {
    final /* synthetic */ TextRadioButtonGroup this$0;

    TextRadioButtonGroup$addView$1(TextRadioButtonGroup textRadioButtonGroup) {
        this.this$0 = textRadioButtonGroup;
    }

    public final void onClick(View view) {
        this.this$0.unselectAllButtons();
        TextRadioButtonGroup textRadioButtonGroup = this.this$0;
        if (view != null) {
            textRadioButtonGroup.setButtonSelected((TextRadioButton) view);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButton");
    }
}
