package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.Observer;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TextSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment$onViewCreated$6 */
/* compiled from: ProfileChooserStage2Fragment.kt */
final class ProfileChooserStage2Fragment$onViewCreated$6<T> implements Observer<List<? extends BusinessCenterDTO>> {
    final /* synthetic */ ProfileChooserStage2Fragment this$0;

    ProfileChooserStage2Fragment$onViewCreated$6(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        this.this$0 = profileChooserStage2Fragment;
    }

    public final void onChanged(List<? extends BusinessCenterDTO> list) {
        Collection collection = list;
        boolean z = false;
        this.this$0.getChooseBusinessSection().show(!(collection == null || collection.isEmpty()));
        TextSection access$getTextSection$p = this.this$0.getTextSection();
        if (collection == null || collection.isEmpty()) {
            z = true;
        }
        access$getTextSection$p.show(z);
        this.this$0.getTextSection().setTextAlligment(4);
        this.this$0.getTextSection().setData(new SomeString(this.this$0.getString(R.string.label_no_business_center_found)));
        this.this$0.getBusinessCenterSection().setData(list);
    }
}
