package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassDetailFragment$onViewCreated$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2 */
/* compiled from: AnotherPassDetailFragment.kt */
final class AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2 implements View.OnClickListener {
    final /* synthetic */ DynamicBackgroundButton $this_apply;
    final /* synthetic */ AnotherPassDetailFragment this$0;

    AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2(DynamicBackgroundButton dynamicBackgroundButton, AnotherPassDetailFragment anotherPassDetailFragment) {
        this.$this_apply = dynamicBackgroundButton;
        this.this$0 = anotherPassDetailFragment;
    }

    public final void onClick(View view) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(0);
        this.$this_apply.setEnabled(false);
        this.this$0.getPassViewModel().getGetAnotherPassMutableLiveData().observe(this.this$0.getViewLifecycleOwner(), new Observer<Resource<AnotherPassResponse>>(this) {
            final /* synthetic */ AnotherPassDetailFragment$onViewCreated$$inlined$apply$lambda$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void onChanged(Resource<AnotherPassResponse> resource) {
                AnotherPassDetailFragment anotherPassDetailFragment = this.this$0.this$0;
                Intrinsics.checkNotNullExpressionValue(resource, "event");
                anotherPassDetailFragment.handlePassGet(resource);
            }
        });
        this.this$0.getPassViewModel().getAnotherPass(AnotherPassDetailFragment.access$getPasse$p(this.this$0).getId());
    }
}
