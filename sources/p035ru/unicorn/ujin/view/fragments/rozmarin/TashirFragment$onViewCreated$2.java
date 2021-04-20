package p035ru.unicorn.ujin.view.fragments.rozmarin;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment$onViewCreated$2 */
/* compiled from: TashirFragment.kt */
final class TashirFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ TashirFragment this$0;

    TashirFragment$onViewCreated$2(TashirFragment tashirFragment) {
        this.this$0 = tashirFragment;
    }

    public final void onClick(View view) {
        TashirFragment tashirFragment = this.this$0;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(this.this$0.getString(R.string.tashirCall)));
        Unit unit = Unit.INSTANCE;
        tashirFragment.startActivity(intent);
    }
}
