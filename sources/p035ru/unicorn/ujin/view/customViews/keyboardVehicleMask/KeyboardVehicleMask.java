package p035ru.unicorn.ujin.view.customViews.keyboardVehicleMask;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0007R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/keyboardVehicleMask/KeyboardVehicleMask;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "enableLetters", "", "isEnabled", "", "enableNumbers", "onInputChanged", "length", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.keyboardVehicleMask.KeyboardVehicleMask */
/* compiled from: KeyboardVehicleMask.kt */
public final class KeyboardVehicleMask extends LinearLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String INPUT_VEHICLE_MASK = "[A000AA000]";
    private HashMap _$_findViewCache;
    public EditText editText;

    public KeyboardVehicleMask(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public KeyboardVehicleMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KeyboardVehicleMask(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardVehicleMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout.inflate(context, R.layout.keyboard_vehicle, this);
        for (int i2 = 0; i2 <= 4; i2++) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row1)).getChildAt(i2).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ KeyboardVehicleMask this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    if (view instanceof Button) {
                        EditText editText = this.this$0.getEditText();
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.this$0.getEditText().getText());
                        sb.append(((Button) view).getText());
                        editText.setText(sb.toString());
                        this.this$0.getEditText().setSelection(this.this$0.getEditText().getText().length());
                    }
                }
            });
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.row1);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "row1");
        ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row1)).getChildAt(linearLayout.getChildCount() - 1).setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ KeyboardVehicleMask this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                Editable text = this.this$0.getEditText().getText();
                Intrinsics.checkNotNullExpressionValue(text, "editText.text");
                if (text.length() > 0) {
                    this.this$0.getEditText().setText(String.valueOf(this.this$0.getEditText().getText().subSequence(0, this.this$0.getEditText().getText().length() - 1)));
                    this.this$0.getEditText().setSelection(this.this$0.getEditText().getText().length());
                }
            }
        });
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.row2);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "row2");
        int childCount = linearLayout2.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row2)).getChildAt(i3).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ KeyboardVehicleMask this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    if (view instanceof Button) {
                        EditText editText = this.this$0.getEditText();
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.this$0.getEditText().getText());
                        sb.append(((Button) view).getText());
                        editText.setText(sb.toString());
                        this.this$0.getEditText().setSelection(this.this$0.getEditText().getText().length());
                    }
                }
            });
        }
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.row3);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "row3");
        int childCount2 = linearLayout3.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row3)).getChildAt(i4).setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ KeyboardVehicleMask this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    if (view instanceof Button) {
                        EditText editText = this.this$0.getEditText();
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.this$0.getEditText().getText());
                        sb.append(((Button) view).getText());
                        editText.setText(sb.toString());
                        this.this$0.getEditText().setSelection(this.this$0.getEditText().getText().length());
                    }
                }
            });
        }
    }

    public final void onInputChanged(int i) {
        if (i != 0) {
            if (i == 9) {
                enableLetters(false);
                enableNumbers(false);
                return;
            } else if (!(i == 4 || i == 5)) {
                enableLetters(false);
                enableNumbers(true);
                return;
            }
        }
        enableLetters(true);
        enableNumbers(false);
    }

    private final void enableLetters(boolean z) {
        for (int i = 6; i <= 8; i++) {
            View childAt = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row2)).getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "row2.getChildAt(i)");
            childAt.setEnabled(z);
        }
        for (int i2 = 0; i2 <= 8; i2++) {
            View childAt2 = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row3)).getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt2, "row3.getChildAt(i)");
            childAt2.setEnabled(z);
        }
    }

    private final void enableNumbers(boolean z) {
        for (int i = 0; i <= 4; i++) {
            View childAt = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row1)).getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "row1.getChildAt(i)");
            childAt.setEnabled(z);
        }
        for (int i2 = 0; i2 <= 4; i2++) {
            View childAt2 = ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.row2)).getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt2, "row2.getChildAt(i)");
            childAt2.setEnabled(z);
        }
    }

    public final EditText getEditText() {
        EditText editText2 = this.editText;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText");
        }
        return editText2;
    }

    public final void setEditText(EditText editText2) {
        Intrinsics.checkNotNullParameter(editText2, "<set-?>");
        this.editText = editText2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/keyboardVehicleMask/KeyboardVehicleMask$Companion;", "", "()V", "INPUT_VEHICLE_MASK", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.keyboardVehicleMask.KeyboardVehicleMask$Companion */
    /* compiled from: KeyboardVehicleMask.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
