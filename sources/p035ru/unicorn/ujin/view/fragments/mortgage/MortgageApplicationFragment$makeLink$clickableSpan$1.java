package p035ru.unicorn.ujin.view.fragments.mortgage;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/mortgage/MortgageApplicationFragment$makeLink$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "view", "Landroid/view/View;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.mortgage.MortgageApplicationFragment$makeLink$clickableSpan$1 */
/* compiled from: MortgageApplicationFragment.kt */
public final class MortgageApplicationFragment$makeLink$clickableSpan$1 extends ClickableSpan {
    final /* synthetic */ String $url;

    MortgageApplicationFragment$makeLink$clickableSpan$1(String str) {
        this.$url = str;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intent putExtra = new Intent(view.getContext(), WebViewActivity.class).putExtra("url", this.$url);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(view.context, Web…WebViewActivity.URL, url)");
        view.getContext().startActivity(putExtra);
    }
}
