package p035ru.unicorn.ujin.view.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/SmsConfirmationFragment$onViewCreated$11", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.SmsConfirmationFragment$onViewCreated$11 */
/* compiled from: SmsConfirmationFragment.kt */
public final class SmsConfirmationFragment$onViewCreated$11 implements TextWatcher {
    final /* synthetic */ SmsConfirmationFragment this$0;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    SmsConfirmationFragment$onViewCreated$11(SmsConfirmationFragment smsConfirmationFragment) {
        this.this$0 = smsConfirmationFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnConfirm);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnConfirm");
        int i4 = 0;
        dynamicBackgroundButton.setEnabled((charSequence != null ? charSequence.length() : 0) >= 4);
        Character ch = null;
        if ((charSequence != null ? charSequence.length() : 0) >= 1) {
            TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv1);
            Intrinsics.checkNotNullExpressionValue(textView, "tv1");
            textView.setText(String.valueOf(charSequence != null ? Character.valueOf(charSequence.charAt(0)) : null));
        } else {
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv1);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv1");
            textView2.setText("");
        }
        if ((charSequence != null ? charSequence.length() : 0) >= 2) {
            TextView textView3 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv2);
            Intrinsics.checkNotNullExpressionValue(textView3, "tv2");
            textView3.setText(String.valueOf(charSequence != null ? Character.valueOf(charSequence.charAt(1)) : null));
        } else {
            TextView textView4 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv2);
            Intrinsics.checkNotNullExpressionValue(textView4, "tv2");
            textView4.setText("");
        }
        if ((charSequence != null ? charSequence.length() : 0) >= 3) {
            TextView textView5 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv3);
            Intrinsics.checkNotNullExpressionValue(textView5, "tv3");
            textView5.setText(String.valueOf(charSequence != null ? Character.valueOf(charSequence.charAt(2)) : null));
        } else {
            TextView textView6 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv3);
            Intrinsics.checkNotNullExpressionValue(textView6, "tv3");
            textView6.setText("");
        }
        if ((charSequence != null ? charSequence.length() : 0) >= 4) {
            TextView textView7 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv4);
            Intrinsics.checkNotNullExpressionValue(textView7, "tv4");
            if (charSequence != null) {
                ch = Character.valueOf(charSequence.charAt(3));
            }
            textView7.setText(String.valueOf(ch));
        } else {
            TextView textView8 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tv4);
            Intrinsics.checkNotNullExpressionValue(textView8, "tv4");
            textView8.setText("");
        }
        if ((charSequence != null ? charSequence.length() : 0) > 4) {
            EditText editText = (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin);
            String valueOf = String.valueOf(charSequence);
            if (valueOf != null) {
                String substring = valueOf.substring(0, 4);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                editText.setText(substring);
                ((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin)).setSelection(4);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        if (charSequence != null) {
            i4 = charSequence.length();
        }
        if (i4 == 4) {
            SmsConfirmationFragment smsConfirmationFragment = this.this$0;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            smsConfirmationFragment.setCode(str);
        }
    }
}
