package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListFragment$showRenters$1$1", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$RentEmployeeListAdapterListener;", "onOnCheckedChange", "", "employee", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "isChecked", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment$showRenters$$inlined$let$lambda$1 */
/* compiled from: RentEmployeeListFragment.kt */
public final class RentEmployeeListFragment$showRenters$$inlined$let$lambda$1 implements RentEmployeeListAdapter.RentEmployeeListAdapterListener {
    final /* synthetic */ Rent $first;
    final /* synthetic */ RentEmployeeListFragment this$0;

    RentEmployeeListFragment$showRenters$$inlined$let$lambda$1(Rent rent, RentEmployeeListFragment rentEmployeeListFragment) {
        this.$first = rent;
        this.this$0 = rentEmployeeListFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRenters();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOnCheckedChange(p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile r5, boolean r6) {
        /*
            r4 = this;
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r0 = r4.$first
            r1 = 0
            if (r0 == 0) goto L_0x0013
            io.realm.RealmList r0 = r0.getRenters()
            if (r0 == 0) goto L_0x0013
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters) r0
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r2 = new ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters
            r2.<init>()
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r3 = r0.getId()
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            r2.setId(r3)
            if (r0 == 0) goto L_0x002b
            java.lang.Integer r0 = r0.getRentId()
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r2.setRentId(r0)
            if (r5 == 0) goto L_0x003b
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r5 = r5.getUserdata()
            if (r5 == 0) goto L_0x003b
            java.lang.Integer r1 = r5.getId()
        L_0x003b:
            r2.setUserdataId(r1)
            r2.setAddRole(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListFragment r5 = r4.this$0
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaViewModel r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListFragment.access$getViewModell$p(r5)
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r2)
            r5.managePErmission(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListFragment$showRenters$$inlined$let$lambda$1.onOnCheckedChange(ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile, boolean):void");
    }
}
