package com.afollestad.date.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.date.C1027R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo51343d2 = {"Lcom/afollestad/date/adapters/MonthItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "com.afollestad.date-picker"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: MonthItemAdapter.kt */
public final class MonthItemViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthItemViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C1027R.C1030id.textView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.textView)");
        this.textView = (TextView) findViewById;
    }

    public final TextView getTextView() {
        return this.textView;
    }
}
