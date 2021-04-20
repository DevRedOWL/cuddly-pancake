package p035ru.unicorn.ujin.view.fragments;

import android.view.View;
import com.loopj.android.http.AsyncHttpClient;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.DemoHubFragment$onViewCreated$3 */
/* compiled from: DemoHubFragment.kt */
final class DemoHubFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ DemoHubFragment this$0;

    DemoHubFragment$onViewCreated$3(DemoHubFragment demoHubFragment) {
        this.this$0 = demoHubFragment;
    }

    public final void onClick(View view) {
        new AsyncHttpClient(true, 80, 443).post(this.this$0.getDemoLoginUrl(), this.this$0.getDemo3ResponseHandler());
    }
}
