package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage3Fragment$onViewCreated$1 */
/* compiled from: ProfileChooserStage3Fragment.kt */
final class ProfileChooserStage3Fragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ ProfileSelectionVM $vm;
    final /* synthetic */ ProfileChooserStage3Fragment this$0;

    ProfileChooserStage3Fragment$onViewCreated$1(ProfileChooserStage3Fragment profileChooserStage3Fragment, ProfileSelectionVM profileSelectionVM) {
        this.this$0 = profileChooserStage3Fragment;
        this.$vm = profileSelectionVM;
    }

    public final void onClick(View view) {
        boolean z = true;
        if (this.$vm.getSurname().length() > 0) {
            if (this.$vm.getName().length() > 0) {
                if (this.$vm.getPatronymic().length() > 0) {
                    if (this.$vm.getEmail().length() <= 0) {
                        z = false;
                    }
                    if (z) {
                        this.$vm.getProfileUpdateLiveData().observe(this.this$0.getViewLifecycleOwner(), new Observer<UpdateEvent>(this) {
                            final /* synthetic */ ProfileChooserStage3Fragment$onViewCreated$1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            public final void onChanged(UpdateEvent updateEvent) {
                                this.this$0.this$0.handleProfileUpdate(updateEvent);
                            }
                        });
                        this.$vm.editProfile();
                    }
                }
            }
        }
    }
}
