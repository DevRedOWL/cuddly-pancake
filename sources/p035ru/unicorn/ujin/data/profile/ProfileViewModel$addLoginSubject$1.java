package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.profile.event.LoginEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/profile/event/LoginEvent;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$addLoginSubject$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$addLoginSubject$1<T> implements Consumer<LoginEvent> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$addLoginSubject$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (r5 != null) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(p035ru.unicorn.ujin.data.profile.event.LoginEvent r13) {
        /*
            r12 = this;
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r12.this$0
            ru.unicorn.ujin.viewModel.SingleLiveEvent r1 = r0.getShowProgressLiveData()
            r2 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r3)
            boolean r1 = r13.getSuccess()
            if (r1 == 0) goto L_0x01b1
            ru.unicorn.ujin.data.realm.profile.User r1 = r13.getUser()
            if (r1 == 0) goto L_0x01b1
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r4 = r0.getLocalRepository()
            java.util.List r5 = r1.combineList()
            r6 = 0
            if (r5 == 0) goto L_0x0054
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x004f
            java.lang.Object r7 = r5.next()
            r8 = r7
            ru.unicorn.ujin.data.realm.profile.Apartment r8 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r8
            java.lang.Integer r8 = r8.getId()
            ru.unicorn.ujin.data.realm.profile.Apartment r9 = r0.getCurrentApartment()
            if (r9 == 0) goto L_0x0047
            java.lang.Integer r9 = r9.getId()
            goto L_0x0048
        L_0x0047:
            r9 = r6
        L_0x0048:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x002b
            goto L_0x0050
        L_0x004f:
            r7 = r6
        L_0x0050:
            r5 = r7
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r5
            goto L_0x0055
        L_0x0054:
            r5 = r6
        L_0x0055:
            java.util.List r7 = r1.combineList()
            r8 = 1
            if (r7 == 0) goto L_0x0080
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0062:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007b
            java.lang.Object r9 = r7.next()
            r10 = r9
            ru.unicorn.ujin.data.realm.profile.Apartment r10 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r10
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r10 = r10.getApartmentRequest()
            if (r10 != 0) goto L_0x0077
            r10 = 1
            goto L_0x0078
        L_0x0077:
            r10 = 0
        L_0x0078:
            if (r10 == 0) goto L_0x0062
            goto L_0x007c
        L_0x007b:
            r9 = r6
        L_0x007c:
            r7 = r9
            ru.unicorn.ujin.data.realm.profile.Apartment r7 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r7
            goto L_0x0081
        L_0x0080:
            r7 = r6
        L_0x0081:
            ru.unicorn.ujin.data.realm.profile.Apartment r9 = r0.getCurrentApartment()
            if (r9 == 0) goto L_0x0092
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r9 = r9.getApartmentRequest()
            if (r9 == 0) goto L_0x0092
            java.lang.String r9 = r9.getStatus()
            goto L_0x0093
        L_0x0092:
            r9 = r6
        L_0x0093:
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts r10 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.Consts.INSTANCE
            java.lang.String r10 = r10.getON_UK()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x00bd
            if (r5 == 0) goto L_0x00af
            java.lang.String r5 = r5.getUserToken()
            if (r5 == 0) goto L_0x00a8
            goto L_0x00ac
        L_0x00a8:
            java.lang.String r5 = r0.getUserToken()
        L_0x00ac:
            if (r5 == 0) goto L_0x00af
            goto L_0x00c1
        L_0x00af:
            if (r7 == 0) goto L_0x00b8
            java.lang.String r5 = r7.getUserToken()
            if (r5 == 0) goto L_0x00b8
            goto L_0x00c1
        L_0x00b8:
            java.lang.String r5 = r0.getUserToken()
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r5 = r1.getToken()
        L_0x00c1:
            r1.setToken(r5)
            r1.setUserLoggenIn(r8)
            java.util.List r5 = r1.combineList()
            if (r5 == 0) goto L_0x00d2
            int r5 = r5.size()
            goto L_0x00d3
        L_0x00d2:
            r5 = 0
        L_0x00d3:
            if (r5 <= 0) goto L_0x0128
            java.util.List r5 = r1.combineList()
            if (r5 == 0) goto L_0x0128
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x00e8:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0107
            java.lang.Object r9 = r5.next()
            r10 = r9
            ru.unicorn.ujin.data.realm.profile.Apartment r10 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r10
            java.lang.String r10 = r10.getUserToken()
            java.lang.String r11 = r1.getToken()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00e8
            r7.add(r9)
            goto L_0x00e8
        L_0x0107:
            java.util.List r7 = (java.util.List) r7
            r5 = r7
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r8
            if (r5 == 0) goto L_0x0128
            java.lang.Object r5 = r7.get(r2)
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r5
            java.lang.Integer r5 = r5.getStage()
            if (r5 == 0) goto L_0x0124
            int r5 = r5.intValue()
            goto L_0x0125
        L_0x0124:
            r5 = 3
        L_0x0125:
            r1.setStage(r5)
        L_0x0128:
            io.realm.RealmList r5 = r1.getApartmentList()
            if (r5 == 0) goto L_0x018c
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r9)
            r7.<init>(r9)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x0141:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x018a
            java.lang.Object r9 = r5.next()
            ru.unicorn.ujin.data.realm.profile.Apartment r9 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r9
            java.lang.String r10 = "apartment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r10 = r9.getApartmentRequest()
            if (r10 == 0) goto L_0x0185
            java.lang.String r10 = r10.getStatus()
            if (r10 == 0) goto L_0x0185
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts r11 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.Consts.INSTANCE
            java.lang.String r11 = r11.getREJECTED()
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r11 != 0) goto L_0x017f
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest$Consts r11 = p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest.Consts.INSTANCE
            java.lang.String r11 = r11.getON_UK()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x0177
            goto L_0x017f
        L_0x0177:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r9.setShowBottomNavigation(r10)
            goto L_0x0182
        L_0x017f:
            r9.setShowBottomNavigation(r3)
        L_0x0182:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            goto L_0x0186
        L_0x0185:
            r9 = r6
        L_0x0186:
            r7.add(r9)
            goto L_0x0141
        L_0x018a:
            java.util.List r7 = (java.util.List) r7
        L_0x018c:
            long r5 = r1.getId()
            r9 = 80
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0197
            r2 = 1
        L_0x0197:
            r1.setDemo(r2)
            long r2 = r1.getId()
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01a7
            java.lang.String r2 = r1.getToken()
            goto L_0x01a9
        L_0x01a7:
            java.lang.String r2 = ""
        L_0x01a9:
            r1.setDemoToken(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r4.saveUserProfile(r1)
        L_0x01b1:
            ru.unicorn.ujin.viewModel.SingleLiveEvent r1 = r0.getLoginMutableLiveData()
            ru.unicorn.ujin.viewModel.events.UpdateEvent r2 = new ru.unicorn.ujin.viewModel.events.UpdateEvent
            boolean r3 = r13.getSuccess()
            java.lang.String r13 = r13.getMessage()
            r2.<init>(r3, r13)
            r1.setValue(r2)
            io.reactivex.disposables.CompositeDisposable r13 = r0.compositeDisposable
            r13.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.profile.ProfileViewModel$addLoginSubject$1.accept(ru.unicorn.ujin.data.profile.event.LoginEvent):void");
    }
}
