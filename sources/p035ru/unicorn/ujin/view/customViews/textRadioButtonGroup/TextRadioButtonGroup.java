package p035ru.unicorn.ujin.view.customViews.textRadioButtonGroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/textRadioButtonGroup/TextRadioButtonGroup;", "Landroid/widget/RadioGroup;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "buttonList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/customViews/textRadioButtonGroup/TextRadioButton;", "Lkotlin/collections/ArrayList;", "getButtonList", "()Ljava/util/ArrayList;", "selectedButton", "getSelectedButton", "()Lru/unicorn/ujin/view/customViews/textRadioButtonGroup/TextRadioButton;", "setSelectedButton", "(Lru/unicorn/ujin/view/customViews/textRadioButtonGroup/TextRadioButton;)V", "addView", "", "child", "Landroid/view/View;", "setButtonSelected", "textRadioButton", "unselectAllButtons", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.textRadioButtonGroup.TextRadioButtonGroup */
/* compiled from: TextRadioButtonGroup.kt */
public final class TextRadioButtonGroup extends RadioGroup {
    private HashMap _$_findViewCache;
    private final ArrayList<TextRadioButton> buttonList = new ArrayList<>();
    public TextRadioButton selectedButton;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextRadioButtonGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ArrayList<TextRadioButton> getButtonList() {
        return this.buttonList;
    }

    public final TextRadioButton getSelectedButton() {
        TextRadioButton textRadioButton = this.selectedButton;
        if (textRadioButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedButton");
        }
        return textRadioButton;
    }

    public final void setSelectedButton(TextRadioButton textRadioButton) {
        Intrinsics.checkNotNullParameter(textRadioButton, "<set-?>");
        this.selectedButton = textRadioButton;
    }

    public void addView(View view) {
        if (view instanceof TextRadioButton) {
            this.buttonList.add(view);
            view.setOnClickListener(new TextRadioButtonGroup$addView$1(this));
        }
        super.addView(view);
    }

    /* access modifiers changed from: private */
    public final void setButtonSelected(TextRadioButton textRadioButton) {
        textRadioButton.setSelected(true);
        this.selectedButton = textRadioButton;
    }

    /* access modifiers changed from: private */
    public final void unselectAllButtons() {
        Iterator<TextRadioButton> it = this.buttonList.iterator();
        while (it.hasNext()) {
            TextRadioButton next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, ButtonField.JsonFields.fieldName);
            next.setSelected(false);
        }
    }
}
