package p035ru.unicorn.ujin.view.fragments.profile;

import android.widget.RadioGroup;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "group", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$combineCheckedChangeListener$1 */
/* compiled from: ApartmentListFragment.kt */
final class ApartmentListFragment$combineCheckedChangeListener$1 implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ ApartmentListFragment this$0;

    ApartmentListFragment$combineCheckedChangeListener$1(ApartmentListFragment apartmentListFragment) {
        this.this$0 = apartmentListFragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.RadioGroup r7, int r8) {
        /*
            r6 = this;
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            ru.unicorn.ujin.data.profile.ProfileViewModel r7 = r7.getProfileViewModel()
            io.realm.RealmList r7 = r7.getUserApartments()
            r0 = 1
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L_0x005f
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0015:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r7.next()
            r4 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r4 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.Integer r4 = r4.getId()
            if (r4 != 0) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            int r4 = r4.intValue()
            if (r4 != r8) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r4 == 0) goto L_0x0015
            goto L_0x003b
        L_0x003a:
            r3 = r2
        L_0x003b:
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r3
            if (r3 == 0) goto L_0x005f
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            r7.choosenApartment = r3
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.rgCommerceList
            android.view.View r7 = r7._$_findCachedViewById(r0)
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r7.clearCheck()
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.rgApartmentList
            android.view.View r7 = r7._$_findCachedViewById(r0)
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r7.check(r8)
            goto L_0x00b5
        L_0x005f:
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            ru.unicorn.ujin.data.profile.ProfileViewModel r7 = r7.getProfileViewModel()
            io.realm.RealmList r7 = r7.getCommerceApartments()
            if (r7 == 0) goto L_0x00b5
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0071:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0092
            java.lang.Object r3 = r7.next()
            r4 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r4 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r4
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = r4.getComplexId()
            if (r4 == 0) goto L_0x008e
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 != r8) goto L_0x008e
            r4 = 1
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            if (r4 == 0) goto L_0x0071
            r2 = r3
        L_0x0092:
            ru.unicorn.ujin.data.realm.profile.Apartment r2 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r2
            if (r2 == 0) goto L_0x00b5
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            r7.choosenApartment = r2
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.rgApartmentList
            android.view.View r7 = r7._$_findCachedViewById(r0)
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r7.clearCheck()
            ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment r7 = r6.this$0
            int r0 = p035ru.unicorn.C5619R.C5622id.rgCommerceList
            android.view.View r7 = r7._$_findCachedViewById(r0)
            android.widget.RadioGroup r7 = (android.widget.RadioGroup) r7
            r7.check(r8)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment$combineCheckedChangeListener$1.onCheckedChanged(android.widget.RadioGroup, int):void");
    }
}
