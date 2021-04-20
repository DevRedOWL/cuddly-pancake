package p035ru.unicorn.ujin.data.profile.repository;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.repository.BaseLocalRepository;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.shortcut.AppShortcutManager;
import p035ru.unicorn.ujin.util.LinphoneHelper;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.BottomNavigationIds;
import p046io.realm.Realm;
import p046io.realm.RealmList;
import p046io.realm.RealmModel;
import p046io.realm.RealmQuery;
import p046io.realm.RealmResults;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0002FGB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\fJ\u0014\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u0016J\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014J\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020%J\u0012\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010'\u001a\u0004\u0018\u00010\fJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u0004\u0018\u00010+J\u0016\u0010,\u001a\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010-0-\u0018\u00010\u0016J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u0004J\u0006\u00101\u001a\u00020\fJ\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u000e\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\fJ\u0006\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\fJ\u000e\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\fJ\u000e\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020/J\u000e\u0010>\u001a\u00020\n2\u0006\u00106\u001a\u00020\fJ\u000e\u0010?\u001a\u00020\n2\u0006\u0010=\u001a\u00020%J\u0014\u0010@\u001a\u00020\n2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0013J\u000e\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u000203J\u000e\u0010E\u001a\u00020\n2\u0006\u00106\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006H"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "()V", "demoStage", "", "getDemoStage", "()I", "setDemoStage", "(I)V", "applyFlat", "", "flatUserToken", "", "stage", "clearProfileForLogout", "context", "Landroid/content/Context;", "deleteSip", "getApartmentList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "getBottomNavigationSchema", "", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "getBuilding", "Lru/unicorn/ujin/data/realm/Building;", "id", "getCityList", "Lru/unicorn/ujin/data/realm/ProviderCity;", "kotlin.jvm.PlatformType", "getCommerceList", "getCurrentApartment", "getCurrentFlatAddress", "getCurrentFlatUid", "getCurrentFlatid", "getDefaultBottomNavigationTab", "getDemoUser", "Lru/unicorn/ujin/data/realm/profile/DemoUser;", "getSchema", "value", "getSchemas", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "getSplashscreen", "Lru/unicorn/ujin/data/realm/Splashscreen;", "getUnreadNotificationList", "Lru/unicorn/ujin/data/realm/notification/Notification;", "getUser", "Lru/unicorn/ujin/data/realm/profile/User;", "getUserStage", "getUserToken", "isDemo", "", "isUserLoggedIn", "registerGhostUser", "token", "removeUserProfile", "saveAidToProfile", "aid", "saveFirebaseToProfile", "tokenFCM", "saveUserProfile", "user", "setDemoToken", "setDemoUser", "setSubAccounts", "subAccountList", "Lru/unicorn/ujin/data/api/response/SubAccount;", "setUserLoggedIn", "loggedIn", "subscribeUser", "Companion", "HOLDER", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository */
/* compiled from: ProfileLocalRepository.kt */
public final class ProfileLocalRepository extends BaseLocalRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy instance$delegate = LazyKt.lazy(ProfileLocalRepository$Companion$instance$2.INSTANCE);
    private int demoStage;

    private ProfileLocalRepository() {
    }

    public /* synthetic */ ProfileLocalRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository$HOLDER;", "", "()V", "INSTANCE", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getINSTANCE", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$HOLDER */
    /* compiled from: ProfileLocalRepository.kt */
    private static final class HOLDER {
        public static final HOLDER INSTANCE = new HOLDER();

        /* renamed from: INSTANCE  reason: collision with other field name */
        private static final ProfileLocalRepository f7020INSTANCE = new ProfileLocalRepository((DefaultConstructorMarker) null);

        private HOLDER() {
        }

        public final ProfileLocalRepository getINSTANCE() {
            return f7020INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository$Companion;", "", "()V", "instance", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getInstance", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "instance$delegate", "Lkotlin/Lazy;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion */
    /* compiled from: ProfileLocalRepository.kt */
    public static final class Companion {
        public final ProfileLocalRepository getInstance() {
            Lazy access$getInstance$cp = ProfileLocalRepository.instance$delegate;
            Companion companion = ProfileLocalRepository.Companion;
            return (ProfileLocalRepository) access$getInstance$cp.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getDemoStage() {
        return this.demoStage;
    }

    public final void setDemoStage(int i) {
        this.demoStage = i;
    }

    public final User getUser() {
        Realm defaultInstance = Realm.getDefaultInstance();
        User user = (User) defaultInstance.where(User.class).findFirst();
        if (user == null) {
            return new User(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null);
        }
        User user2 = (User) defaultInstance.copyFromRealm(user);
        Intrinsics.checkNotNullExpressionValue(user2, "copyUser");
        return user2;
    }

    public final DemoUser getDemoUser() {
        Realm defaultInstance = Realm.getDefaultInstance();
        DemoUser demoUser = (DemoUser) defaultInstance.where(DemoUser.class).findFirst();
        if (demoUser == null) {
            return new DemoUser(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 33554431, (DefaultConstructorMarker) null);
        }
        DemoUser demoUser2 = (DemoUser) defaultInstance.copyFromRealm(demoUser);
        Intrinsics.checkNotNullExpressionValue(demoUser2, "copyUser");
        return demoUser2;
    }

    public final void setDemoUser(DemoUser demoUser) {
        Intrinsics.checkNotNullParameter(demoUser, "user");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$setDemoUser$1(demoUser));
    }

    public final String getUserToken() {
        if (this.demoStage != 0) {
            CharSequence token = getDemoUser().getToken();
            if (!(token == null || StringsKt.isBlank(token))) {
                return getDemoUser().getToken();
            }
        }
        return getUser().getToken();
    }

    public final int getUserStage() {
        if (this.demoStage != 0) {
            CharSequence token = getDemoUser().getToken();
            if (!(token == null || StringsKt.isBlank(token))) {
                return getDemoUser().getStage();
            }
        }
        return getUser().getStage();
    }

    public final boolean isDemo() {
        return this.demoStage != 0 || getUser().getId() == 80;
    }

    public final RealmList<Apartment> getApartmentList() {
        if (this.demoStage != 0) {
            CharSequence token = getDemoUser().getToken();
            if (!(token == null || StringsKt.isBlank(token))) {
                return getDemoUser().getApartmentList();
            }
        }
        return getUser().getApartmentList();
    }

    public final RealmList<Apartment> getCommerceList() {
        if (this.demoStage != 0) {
            CharSequence token = getDemoUser().getToken();
            if (!(token == null || StringsKt.isBlank(token))) {
                return null;
            }
        }
        return getUser().getCommerceList();
    }

    public final boolean isUserLoggedIn() {
        if (this.demoStage != 0) {
            CharSequence token = getDemoUser().getToken();
            if (!(token == null || StringsKt.isBlank(token))) {
                return getDemoUser().getUserLoggenIn();
            }
        }
        return getUser().getUserLoggenIn();
    }

    public final void setUserLoggedIn(boolean z) {
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$setUserLoggedIn$1(z));
    }

    public final void saveUserProfile(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$saveUserProfile$1(user));
        subscribeUser(user.getToken());
    }

    public final void subscribeUser(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        LinphoneHelper.pushToken(MainApplication.getContext(), str, true);
    }

    public final void removeUserProfile() {
        Realm.getDefaultInstance().executeTransaction(ProfileLocalRepository$removeUserProfile$1.INSTANCE);
    }

    public final void clearProfileForLogout(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        new AppShortcutManager(context).deleteAllShortCut();
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$clearProfileForLogout$1(context));
        ViewmodelFactorys.getInstance().clear();
    }

    public final void deleteSip() {
        Realm.getDefaultInstance().executeTransaction(ProfileLocalRepository$deleteSip$1.INSTANCE);
    }

    public final void saveFirebaseToProfile(String str) {
        Intrinsics.checkNotNullParameter(str, "tokenFCM");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$saveFirebaseToProfile$1(str));
    }

    public final void saveAidToProfile(String str) {
        Intrinsics.checkNotNullParameter(str, "aid");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$saveAidToProfile$1(str));
    }

    public final void applyFlat(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "flatUserToken");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$applyFlat$1(str, i));
        subscribeUser(str);
    }

    public final void setDemoToken(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$setDemoToken$1(str));
    }

    public final List<ProviderCity> getCityList() {
        RealmResults<E> findAll = getRealm().where(ProviderCity.class).findAll();
        if (findAll != null) {
            return findAll;
        }
        return CollectionsKt.emptyList();
    }

    public final void setSubAccounts(RealmList<SubAccount> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "subAccountList");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$setSubAccounts$1(realmList));
    }

    public final void registerGhostUser(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        Realm.getDefaultInstance().executeTransaction(new ProfileLocalRepository$registerGhostUser$1(str));
    }

    public final String getCurrentFlatUid() {
        String userToken = getUserToken();
        List<Apartment> combineList = getUser().combineList();
        String str = "";
        if (combineList != null) {
            for (Apartment next : combineList) {
                if (Intrinsics.areEqual((Object) next.getUserToken(), (Object) userToken)) {
                    str = next.getUid();
                    Intrinsics.checkNotNullExpressionValue(str, "apartment.uid");
                }
            }
        }
        return str;
    }

    public final String getCurrentFlatid() {
        String str = "1";
        if (getUser().getDemo() != 1 && !isDemo()) {
            String userToken = getUserToken();
            List<Apartment> combineList = getUser().combineList();
            if (combineList != null) {
                for (Apartment next : combineList) {
                    if (Intrinsics.areEqual((Object) next.getUserToken(), (Object) userToken)) {
                        Integer id = next.getId();
                        str = String.valueOf(id != null ? id.intValue() : 0);
                    }
                }
            }
        }
        return str;
    }

    public final String getCurrentFlatAddress() {
        String userToken = getUserToken();
        List<Apartment> combineList = getUser().combineList();
        String str = "";
        if (combineList != null) {
            for (Apartment next : combineList) {
                if (Intrinsics.areEqual((Object) next.getUserToken(), (Object) userToken)) {
                    str = next.getTitle();
                    Intrinsics.checkNotNullExpressionValue(str, "apartment.title");
                }
            }
        }
        return str;
    }

    public final Schemas getSchemas() {
        Schemas schemas = (Schemas) Realm.getDefaultInstance().where(Schemas.class).findFirst();
        if (schemas == null) {
            return new Schemas(0, (RealmList) null, (RealmList) null, (RealmList) null, (RealmList) null, (RealmList) null, 63, (DefaultConstructorMarker) null);
        }
        RealmModel copyFromRealm = Realm.getDefaultInstance().copyFromRealm(schemas);
        Intrinsics.checkNotNullExpressionValue(copyFromRealm, "Realm.getDefaultInstance().copyFromRealm(schema)");
        return (Schemas) copyFromRealm;
    }

    public final Schema getSchema(String str) {
        RealmList<Schema> meta;
        Schemas schemas = (Schemas) Realm.getDefaultInstance().where(Schemas.class).findFirst();
        if (schemas == null || (meta = schemas.getMeta()) == null) {
            return null;
        }
        Iterator<Schema> it = meta.iterator();
        while (it.hasNext()) {
            Schema next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "schema");
            if (Intrinsics.areEqual((Object) next.getTitle(), (Object) str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = r0.getMeta();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> getBottomNavigationSchema() {
        /*
            r2 = this;
            io.realm.Realm r0 = p046io.realm.Realm.getDefaultInstance()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.RealmQuery r0 = r0.where(r1)
            java.lang.Object r0 = r0.findFirst()
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r0 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas) r0
            if (r0 == 0) goto L_0x001b
            io.realm.RealmList r0 = r0.getMeta()
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = (java.util.List) r0
            goto L_0x001f
        L_0x001b:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.getBottomNavigationSchema():java.util.List");
    }

    public final String getDefaultBottomNavigationTab() {
        String str;
        Object obj;
        List<Schema> bottomNavigationSchema = getBottomNavigationSchema();
        String stage3DefaultScreen = getUser().isCurrentCommerce() ? ReactConst.SECURITYTAB : Flavor.Companion.current().getStage3DefaultScreen();
        if (!Flavor.Companion.current().getHasDynamicBottomNavigationViewSupport()) {
            return stage3DefaultScreen;
        }
        boolean z = true;
        if (!(!bottomNavigationSchema.isEmpty())) {
            return stage3DefaultScreen;
        }
        Iterator it = bottomNavigationSchema.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((Schema) obj).getIsActive(), (Object) true)) {
                break;
            }
        }
        Schema schema = (Schema) obj;
        if (schema == null) {
            return stage3DefaultScreen;
        }
        BottomNavigationIds.Companion companion = BottomNavigationIds.Companion;
        String actionValue = schema.getActionValue();
        Intrinsics.checkNotNullExpressionValue(actionValue, "it.actionValue");
        BottomNavigationIds byStringId = companion.getByStringId(actionValue);
        if (byStringId != null) {
            str = byStringId.getTabName();
        }
        CharSequence charSequence = str;
        if (charSequence != null && !StringsKt.isBlank(charSequence)) {
            z = false;
        }
        return !z ? str : stage3DefaultScreen;
    }

    public final Splashscreen getSplashscreen() {
        return (Splashscreen) Realm.getDefaultInstance().where(Splashscreen.class).findFirst();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ru.unicorn.ujin.data.realm.profile.Apartment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p035ru.unicorn.ujin.data.realm.profile.Apartment getCurrentApartment() {
        /*
            r6 = this;
            ru.unicorn.ujin.data.realm.profile.User r0 = r6.getUser()
            io.realm.RealmList r0 = r0.getApartmentList()
            java.lang.String r1 = "it"
            r2 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r0.next()
            r4 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r4 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.String r4 = r4.getUserToken()
            java.lang.String r5 = r6.getUserToken()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0013
            goto L_0x0033
        L_0x0032:
            r3 = r2
        L_0x0033:
            r0 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r0 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r0
            if (r0 == 0) goto L_0x003a
            r2 = r0
            goto L_0x006b
        L_0x003a:
            ru.unicorn.ujin.data.realm.profile.User r0 = r6.getUser()
            io.realm.RealmList r0 = r0.getCommerceList()
            if (r0 == 0) goto L_0x006b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r0.next()
            r4 = r3
            ru.unicorn.ujin.data.realm.profile.Apartment r4 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            java.lang.String r4 = r4.getUserToken()
            java.lang.String r5 = r6.getUserToken()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x004a
            r2 = r3
        L_0x0069:
            ru.unicorn.ujin.data.realm.profile.Apartment r2 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r2
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.getCurrentApartment():ru.unicorn.ujin.data.realm.profile.Apartment");
    }

    public final Building getBuilding(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return (Building) Realm.getDefaultInstance().where(Building.class).equalTo("id", str).findFirst();
    }

    public final List<Notification> getUnreadNotificationList() {
        RealmResults<E> findAll;
        RealmQuery<E> where = Realm.getDefaultInstance().where(Notification.class);
        if (where == null || (findAll = where.findAll()) == null) {
            return null;
        }
        Collection arrayList = new ArrayList();
        for (Object next : findAll) {
            CharSequence readAt = ((Notification) next).getReadAt();
            if (readAt == null || StringsKt.isBlank(readAt)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
