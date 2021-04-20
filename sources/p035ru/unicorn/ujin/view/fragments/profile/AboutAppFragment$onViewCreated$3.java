package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.AboutAppFragment$onViewCreated$3 */
/* compiled from: AboutAppFragment.kt */
final class AboutAppFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ AboutAppFragment this$0;

    AboutAppFragment$onViewCreated$3(AboutAppFragment aboutAppFragment) {
        this.this$0 = aboutAppFragment;
    }

    public final void onClick(View view) {
        AboutAppFragment aboutAppFragment = this.this$0;
        aboutAppFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aboutAppFragment.getString(R.string.additionalTutorialLink))));
    }
}
