package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/BankLoanTitleHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.BankLoanTitleHolder */
/* compiled from: BankLoanTitleHolder.kt */
public final class BankLoanTitleHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BankLoanTitleHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        BankLoanTitleField bankLoanTitleField = (BankLoanTitleField) field;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
        textView.setText(bankLoanTitleField.getTitle());
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvDescription);
        Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvDescription");
        textView2.setText(bankLoanTitleField.getDescription());
        View view3 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvText);
        Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvText");
        textView3.setText(bankLoanTitleField.getText());
        View view4 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        ((TextView) view4.findViewById(C5619R.C5622id.tvText)).setTextColor(Color.parseColor(bankLoanTitleField.getTextColor()));
        View view5 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
        GlideRequest load = GlideApp.with((View) (AppCompatImageView) view5.findViewById(C5619R.C5622id.ivLogo)).load(bankLoanTitleField.getLogoUrl());
        View view6 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view6, "itemView");
        load.into((ImageView) (AppCompatImageView) view6.findViewById(C5619R.C5622id.ivLogo));
    }
}
