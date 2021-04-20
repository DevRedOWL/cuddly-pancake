package p035ru.unicorn.ujin.view.fragments.oss.fragments;

import android.content.DialogInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.fragments.OssQuestionFragment$handleVote$1 */
/* compiled from: OssQuestionFragment.kt */
final class OssQuestionFragment$handleVote$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ OssQuestionFragment this$0;

    OssQuestionFragment$handleVote$1(OssQuestionFragment ossQuestionFragment) {
        this.this$0 = ossQuestionFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OssQuestionFragment ossQuestionFragment = this.this$0;
        dialogInterface.dismiss();
        ossQuestionFragment.nextFragment(OssQuestionFragment.Companion.newInstance(ossQuestionFragment.getTitle(), ossQuestionFragment.getOss(), (OssData) null, -1, new ArrayList(), true), false, BaseActivity.FRAGMENT_OSS_QUESTION);
    }
}
