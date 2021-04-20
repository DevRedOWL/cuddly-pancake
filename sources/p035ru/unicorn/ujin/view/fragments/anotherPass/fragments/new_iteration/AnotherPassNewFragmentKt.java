package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, mo51343d2 = {"format", "", "tv", "Landroid/widget/TextView;", "isRequired", "", "Lcom/google/android/material/textfield/TextInputLayout;", "app_kortrosRelease"}, mo51344k = 2, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.new_iteration.AnotherPassNewFragmentKt */
/* compiled from: AnotherPassNewFragment.kt */
public final class AnotherPassNewFragmentKt {
    @BindingAdapter({"text_required"})
    public static final void format(TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "tv");
        SpannableStringBuilder append = new SpannableStringBuilder(textView.getText()).append("*");
        append.setSpan(new ForegroundColorSpan(ContextCompat.getColor(textView.getContext(), R.color.brandMain)), textView.getText().length(), textView.getText().length() + 1, 33);
        if (z) {
            textView.setText(append);
        }
    }

    @BindingAdapter({"text_required"})
    public static final void format(TextInputLayout textInputLayout, boolean z) {
        Intrinsics.checkNotNullParameter(textInputLayout, "tv");
        if (z) {
            textInputLayout.setHint(TextUtils.concat(new CharSequence[]{textInputLayout.getHint(), Html.fromHtml(textInputLayout.getContext().getString(R.string.required_asterisk))}));
        }
    }
}
