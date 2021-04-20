package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.ObjectRentInfo;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/mycompany/ChooseObjectListFragment$showToolbar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1 */
/* compiled from: ChooseObjectListFragment.kt */
final class ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TextView $this_apply;
    final /* synthetic */ ChooseObjectListFragment this$0;

    ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1(TextView textView, ChooseObjectListFragment chooseObjectListFragment) {
        this.$this_apply = textView;
        this.this$0 = chooseObjectListFragment;
    }

    public final void onClick(View view) {
        ObjectRentInfo objectRentInfo;
        ObjectRentInfo objectRentInfo2;
        CompanyObject access$getSelectedObject$p = this.this$0.selectedObject;
        if (access$getSelectedObject$p != null) {
            String str = null;
            if (Intrinsics.areEqual((Object) access$getSelectedObject$p.getId(), (Object) "0")) {
                CompanyObject access$getLastObject$p = this.this$0.lastObject;
                if (access$getLastObject$p != null) {
                    MyRentaCompanyViewModel access$getViewModell$p = ChooseObjectListFragment.access$getViewModell$p(this.this$0);
                    List<ObjectRentInfo> rents = access$getLastObject$p.getRents();
                    if (!(rents == null || (objectRentInfo2 = rents.get(0)) == null)) {
                        str = objectRentInfo2.getId();
                    }
                    access$getViewModell$p.deletePlace(String.valueOf(str));
                    ChooseObjectListFragment.access$getViewModell$p(this.this$0).getIsSuccessDeletePlace().observe(this.this$0.getViewLifecycleOwner(), new Observer<Resource<EmployerListSingle>>(this) {
                        final /* synthetic */ ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onChanged(Resource<EmployerListSingle> resource) {
                            this.this$0.this$0.onDeletePlaceResult(resource);
                        }
                    });
                } else {
                    TextView textView = this.$this_apply;
                    this.this$0.getBaseActivity().onBackPressed();
                }
            } else {
                MyRentaCompanyViewModel access$getViewModell$p2 = ChooseObjectListFragment.access$getViewModell$p(this.this$0);
                List<ObjectRentInfo> rents2 = access$getSelectedObject$p.getRents();
                if (!(rents2 == null || (objectRentInfo = rents2.get(0)) == null)) {
                    str = objectRentInfo.getId();
                }
                access$getViewModell$p2.setEmployeePlace(str);
                ChooseObjectListFragment.access$getViewModell$p(this.this$0).getSetPlacePlace().observe(this.this$0.getViewLifecycleOwner(), new Observer<Resource<SimpleResponse>>(this) {
                    final /* synthetic */ ChooseObjectListFragment$showToolbar$$inlined$apply$lambda$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onChanged(Resource<SimpleResponse> resource) {
                        this.this$0.this$0.onSetPlaceResult(resource);
                    }
                });
            }
            ChooseObjectListFragment.access$getViewModell$p(this.this$0).afterChangingEmployeeProperty = true;
            return;
        }
        TextView textView2 = this.$this_apply;
        this.this$0.showMessage((int) R.string.label_choose_object);
    }
}
