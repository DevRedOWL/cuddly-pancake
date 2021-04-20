package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "onChanged", "(Lkotlin/Unit;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$2 */
/* compiled from: ProfileChooserFragment.kt */
final class ProfileChooserFragment$onViewCreated$2<T> implements Observer<Unit> {
    final /* synthetic */ ProfileChooserFragment this$0;

    ProfileChooserFragment$onViewCreated$2(ProfileChooserFragment profileChooserFragment) {
        this.this$0 = profileChooserFragment;
    }

    public final void onChanged(Unit unit) {
        if (Flavor.Companion.current().getHasDynamicBottomNavigationViewSupport()) {
            this.this$0.getBaseActivity().simpleViewModel.getSingleSchema(false);
            SimpleViewModel simpleViewModel = this.this$0.getBaseActivity().simpleViewModel;
            Intrinsics.checkNotNullExpressionValue(simpleViewModel, "baseActivity.simpleViewModel");
            simpleViewModel.getSchemasSingleEvent().observe(this.this$0.getViewLifecycleOwner(), new Observer<Schemas>(this) {
                final /* synthetic */ ProfileChooserFragment$onViewCreated$2 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(Schemas schemas) {
                    Intrinsics.checkNotNullParameter(schemas, "resource");
                    this.this$0.this$0.onGetSchema(schemas);
                }
            });
            return;
        }
        ProgressBar progressBar = this.this$0.f6913pb;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        this.this$0.getBaseActivity().setRegistrationFinished();
        this.this$0.getBaseActivity().startStageThree(ReactConst.SMARTFLAT, false);
    }
}
