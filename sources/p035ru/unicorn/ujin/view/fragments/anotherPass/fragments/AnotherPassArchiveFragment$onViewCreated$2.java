package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassArchiveFragment$onViewCreated$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassArchiveFragment$onViewCreated$2 */
/* compiled from: AnotherPassArchiveFragment.kt */
public final class AnotherPassArchiveFragment$onViewCreated$2 implements TextWatcher {
    final /* synthetic */ AnotherPassArchiveFragment this$0;

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    AnotherPassArchiveFragment$onViewCreated$2(AnotherPassArchiveFragment anotherPassArchiveFragment) {
        this.this$0 = anotherPassArchiveFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        this.this$0.searchString = charSequence.toString();
        if (charSequence.length() > 2) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
            Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
            progressBar.setVisibility(0);
            this.this$0.getPassViewModel().getArchivePassList(charSequence.toString());
            return;
        }
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvSearchHint);
        Intrinsics.checkNotNullExpressionValue(textView, "tvSearchHint");
        textView.setText(this.this$0.getString(R.string.another_pass_search_hint));
        TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.view2);
        Intrinsics.checkNotNullExpressionValue(textView2, "view2");
        textView2.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
        recyclerView.setVisibility(8);
    }
}
