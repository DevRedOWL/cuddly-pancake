package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyList;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getCompanyListForProfile$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getCompanyListForProfile$1<T> implements Consumer<Resource<CompanyList>> {
    final /* synthetic */ String $token;
    final /* synthetic */ User $user;
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$getCompanyListForProfile$1(ProfileRemoteRepository profileRemoteRepository, User user, String str) {
        this.this$0 = profileRemoteRepository;
        this.$user = user;
        this.$token = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList> r9) {
        /*
            r8 = this;
            ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository r0 = r8.this$0
            ru.unicorn.ujin.data.realm.profile.User r1 = r8.$user
            r2 = 1
            if (r1 == 0) goto L_0x0081
            io.realm.RealmList r1 = r1.getCommerceList()
            if (r1 == 0) goto L_0x0081
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r1.next()
            r5 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r5
            java.lang.String r6 = "commerce"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r5 = r5.getUserToken()
            java.lang.String r6 = r8.$token
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0033:
            r3 = r4
        L_0x0034:
            ru.unicorn.ujin.data.realm.profile.Apartment r3 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r3
            if (r3 == 0) goto L_0x0081
            java.lang.String r1 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            java.lang.Object r9 = r9.getData()
            java.lang.String r1 = "response.data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyList r9 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList) r9
            java.util.List r9 = r9.getRentCompany()
            r1 = 0
            if (r9 == 0) goto L_0x0077
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0055:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r9.next()
            r6 = r5
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r6
            if (r6 == 0) goto L_0x0071
            io.realm.RealmList r6 = r6.getEmployeePermissions()
            if (r6 == 0) goto L_0x0071
            java.lang.String r7 = "issue-a-pass-guest"
            boolean r6 = r6.contains(r7)
            goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            if (r6 == 0) goto L_0x0055
            r4 = r5
        L_0x0075:
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r4
        L_0x0077:
            if (r4 == 0) goto L_0x007a
            r1 = 1
        L_0x007a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r3.setCommerceThingsAvailable(r9)
        L_0x0081:
            io.reactivex.subjects.PublishSubject r9 = r0.getLoginSubject()
            ru.unicorn.ujin.data.profile.event.LoginEvent r0 = new ru.unicorn.ujin.data.profile.event.LoginEvent
            ru.unicorn.ujin.data.realm.profile.User r1 = r8.$user
            java.lang.String r3 = ""
            r0.<init>(r2, r3, r1)
            r9.onNext(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getCompanyListForProfile$1.accept(ru.unicorn.ujin.data.realm.Resource):void");
    }
}
