package p035ru.unicorn.ujin.view.fragments.development;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.dialogs.SelectorDialog;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$onViewCreated$1 */
/* compiled from: DeveloperBuildingStagesFragment.kt */
final class DeveloperBuildingStagesFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ DeveloperBuildingStagesFragment this$0;

    DeveloperBuildingStagesFragment$onViewCreated$1(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        this.this$0 = developerBuildingStagesFragment;
    }

    public final void onClick(View view) {
        String str;
        SelectorDialog selectorDialog = new SelectorDialog();
        selectorDialog.setClickListener(new View.OnClickListener(this) {
            final /* synthetic */ DeveloperBuildingStagesFragment$onViewCreated$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                if (view != null) {
                    TextView textView = (TextView) view;
                    TextView textView2 = (TextView) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.tvComplex);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvComplex");
                    textView2.setText(textView.getText());
                    this.this$0.this$0.getDevelopmentViewModel().setComplex(textView.getTag().toString());
                    this.this$0.this$0.getDevelopmentViewModel().getDevelopmentData(this.this$0.this$0.getBaseActivity().demoFlatId);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.this$0.getDevelopmentViewModel().getComplexListAsStringArray());
        Unit unit = Unit.INSTANCE;
        selectorDialog.setData(arrayList);
        selectorDialog.setTags(this.this$0.getDevelopmentViewModel().getTags());
        if (this.this$0.getBaseActivity().profileViewModel.getUser().getUserLoggenIn() && this.this$0.getBaseActivity().profileViewModel.getUser().getDemo() != 1) {
            BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
            Apartment currentApartment = access$getBaseActivity.getCurrentApartment();
            if (currentApartment == null || (str = currentApartment.getComplexId()) == null) {
                str = "-1";
            }
            selectorDialog.setHomeTag(str);
        }
        BaseActivity access$getBaseActivity2 = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity2, "baseActivity");
        selectorDialog.show(access$getBaseActivity2.getSupportFragmentManager(), "dialog");
    }
}
