package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.facebook.common.util.UriUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.TextDrawable;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;
import p035ru.unicorn.ujin.view.fragments.FlatFragment;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassListFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatListFragment;
import p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment;
import p035ru.unicorn.ujin.view.fragments.profile.AboutAppFragment;
import p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment;
import p035ru.unicorn.ujin.view.fragments.profile.PrivacyFragment;
import p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountListFragment;
import p035ru.unicorn.ujin.view.fragments.profile.vehicle.MyVehicleListFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\u001a\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\nH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006#"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "imageUrl", "", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "getLayoutRes", "", "handleCustomAction", "", "schema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "handleProfileButtonClick", "initProfileValues", "loadSchema", "loadUserAvatar", "userAvatar", "fromFile", "", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onProfileUpdated", "onResume", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment */
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment extends BaseTitleFragment {
    /* access modifiers changed from: private */
    public static final String ABOUT = "about";
    /* access modifiers changed from: private */
    public static final String ACTION_CUSTOM = "custom";
    /* access modifiers changed from: private */
    public static final String APARTMENT_LIST = "apartmentList";
    /* access modifiers changed from: private */
    public static final String CHATS = "chats";
    /* access modifiers changed from: private */
    public static final String CURRENT_APARTMENT = "currentApartment";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String FROM_PUSH = "fromPush";
    /* access modifiers changed from: private */
    public static final String MY_AUTO = "myAuto";
    /* access modifiers changed from: private */
    public static final String MY_COMPANY = "myCompany";
    /* access modifiers changed from: private */
    public static final String MY_PASS = "myPassPerson";
    /* access modifiers changed from: private */
    public static final String MY_RENT_OBJECT_LIST = "myRentObjectList";
    /* access modifiers changed from: private */
    public static final String MY_SLOTS = "mySlots";
    /* access modifiers changed from: private */
    public static final String PASS = "myPass";
    /* access modifiers changed from: private */
    public static final String PRIVACY = "privacy";
    /* access modifiers changed from: private */
    public static final String RENT_OBJECT_LIST = "rentObjectList";
    /* access modifiers changed from: private */
    public static final String SUBACCOUNT_LIST = "subAccountList";
    /* access modifiers changed from: private */
    public static final String WHAT_TO_OPEN = "whatToOpen";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String imageUrl = "";
    /* access modifiers changed from: private */
    public User user;

    public static final String getWHAT_TO_OPEN() {
        Companion companion = Companion;
        return WHAT_TO_OPEN;
    }

    @JvmStatic
    public static final Fragment newInstance(String str) {
        return Companion.newInstance(str);
    }

    @JvmStatic
    public static final Fragment newInstance(String str, boolean z) {
        return Companion.newInstance(str, z);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayoutRes() {
        return R.layout.fragment_profile;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Профиль";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ User access$getUser$p(ProfileFragment profileFragment) {
        User user2 = profileFragment.user;
        if (user2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        return user2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u001c\u0010#\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0006¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileFragment$Companion;", "", "()V", "ABOUT", "", "getABOUT", "()Ljava/lang/String;", "ACTION_CUSTOM", "getACTION_CUSTOM", "APARTMENT_LIST", "getAPARTMENT_LIST", "CHATS", "getCHATS", "CURRENT_APARTMENT", "getCURRENT_APARTMENT", "FROM_PUSH", "getFROM_PUSH", "MY_AUTO", "getMY_AUTO", "MY_COMPANY", "getMY_COMPANY", "MY_PASS", "getMY_PASS", "MY_RENT_OBJECT_LIST", "getMY_RENT_OBJECT_LIST", "MY_SLOTS", "getMY_SLOTS", "PASS", "getPASS", "PRIVACY", "getPRIVACY", "RENT_OBJECT_LIST", "getRENT_OBJECT_LIST", "SUBACCOUNT_LIST", "getSUBACCOUNT_LIST", "WHAT_TO_OPEN", "getWHAT_TO_OPEN$annotations", "getWHAT_TO_OPEN", "newInstance", "Landroidx/fragment/app/Fragment;", "whatToOpen", "fromPush", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$Companion */
    /* compiled from: ProfileFragment.kt */
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getWHAT_TO_OPEN$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Fragment newInstance(String str) {
            return newInstance(str, false);
        }

        @JvmStatic
        public final Fragment newInstance(String str, boolean z) {
            ProfileFragment profileFragment = new ProfileFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ProfileFragment.Companion.getWHAT_TO_OPEN(), str);
            bundle.putBoolean(ProfileFragment.Companion.getFROM_PUSH(), z);
            Unit unit = Unit.INSTANCE;
            profileFragment.setArguments(bundle);
            return profileFragment;
        }

        public final String getWHAT_TO_OPEN() {
            return ProfileFragment.WHAT_TO_OPEN;
        }

        public final String getFROM_PUSH() {
            return ProfileFragment.FROM_PUSH;
        }

        public final String getCURRENT_APARTMENT() {
            return ProfileFragment.CURRENT_APARTMENT;
        }

        public final String getACTION_CUSTOM() {
            return ProfileFragment.ACTION_CUSTOM;
        }

        public final String getAPARTMENT_LIST() {
            return ProfileFragment.APARTMENT_LIST;
        }

        public final String getCHATS() {
            return ProfileFragment.CHATS;
        }

        public final String getPASS() {
            return ProfileFragment.PASS;
        }

        public final String getSUBACCOUNT_LIST() {
            return ProfileFragment.SUBACCOUNT_LIST;
        }

        public final String getPRIVACY() {
            return ProfileFragment.PRIVACY;
        }

        public final String getABOUT() {
            return ProfileFragment.ABOUT;
        }

        public final String getMY_COMPANY() {
            return ProfileFragment.MY_COMPANY;
        }

        public final String getRENT_OBJECT_LIST() {
            return ProfileFragment.RENT_OBJECT_LIST;
        }

        public final String getMY_RENT_OBJECT_LIST() {
            return ProfileFragment.MY_RENT_OBJECT_LIST;
        }

        public final String getMY_PASS() {
            return ProfileFragment.MY_PASS;
        }

        public final String getMY_SLOTS() {
            return ProfileFragment.MY_SLOTS;
        }

        public final String getMY_AUTO() {
            return ProfileFragment.MY_AUTO;
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.my_profile));
        if (getBaseActivity().flavor == Flavor.PAN) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.NONE);
            return;
        }
        getBaseActivity().hideBottomNavigation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        getProfileViewModel().getLoginMutableLiveData().observe(getViewLifecycleOwner(), new ProfileFragment$onCreateView$1(this));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (!getProfileViewModel().isDemo()) {
            this.user = getProfileViewModel().getUser();
            initProfileValues();
        } else {
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivArrow);
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivArrow");
            appCompatImageView.setVisibility(4);
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
            textView.setText(getResources().getString(R.string.profileDemoUser));
        }
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.tvLogout);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "tvLogout");
        dynamicBackgroundButton.setText(getResources().getString(R.string.profileLogout));
        _$_findCachedViewById(C5619R.C5622id.lPersonCard).setOnClickListener(new ProfileFragment$onViewCreated$1(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.tvLogout)).setOnClickListener(new ProfileFragment$onViewCreated$2(this));
    }

    public void onResume() {
        Bundle arguments;
        super.onResume();
        if (!getProfileViewModel().isDemo()) {
            getProfileViewModel().requestUser();
            loadSchema();
        }
        Bundle arguments2 = getArguments();
        Integer num = null;
        String string = arguments2 != null ? arguments2.getString(WHAT_TO_OPEN) : null;
        CharSequence charSequence = string;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            if (Intrinsics.areEqual((Object) string, (Object) CURRENT_APARTMENT)) {
                BaseActivity baseActivity = getBaseActivity();
                Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
                Apartment currentApartment = baseActivity.getCurrentApartment();
                if (currentApartment != null) {
                    num = currentApartment.getAcceptingEnabled();
                }
                if ((num != null && num.intValue() == 1) || ((arguments = getArguments()) != null && arguments.getBoolean(FROM_PUSH))) {
                    Schema schema = new Schema();
                    schema.setAction(ACTION_CUSTOM);
                    schema.setActionValue(CURRENT_APARTMENT);
                    Unit unit = Unit.INSTANCE;
                    handleCustomAction(schema);
                }
            } else if (Intrinsics.areEqual((Object) string, (Object) APARTMENT_LIST)) {
                Schema schema2 = new Schema();
                schema2.setTitle("Выбор объекта недвижимости");
                schema2.setAction(ACTION_CUSTOM);
                schema2.setActionValue(APARTMENT_LIST);
                Unit unit2 = Unit.INSTANCE;
                handleCustomAction(schema2);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.remove(WHAT_TO_OPEN);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.remove(FROM_PUSH);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onProfileUpdated() {
        this.user = getProfileViewModel().getUser();
        initProfileValues();
    }

    private final void initProfileValues() {
        Object obj;
        String str;
        String str2;
        if (!getProfileViewModel().isDemo() && this.user != null) {
            User user2 = this.user;
            if (user2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String fullName = user2.getFullName();
            if (StringsKt.isBlank(fullName)) {
                User user3 = this.user;
                if (user3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                if (StringsKt.isBlank(user3.getSurname())) {
                    fullName = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    User user4 = this.user;
                    if (user4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                    }
                    sb.append(user4.getSurname());
                    sb.append(" ");
                    User user5 = this.user;
                    if (user5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                    }
                    if (StringsKt.isBlank(user5.getName())) {
                        str = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        User user6 = this.user;
                        if (user6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("user");
                        }
                        sb2.append(user6.getName());
                        sb2.append(" ");
                        User user7 = this.user;
                        if (user7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("user");
                        }
                        if (StringsKt.isBlank(user7.getPatronymic())) {
                            str2 = "";
                        } else {
                            User user8 = this.user;
                            if (user8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("user");
                            }
                            str2 = user8.getPatronymic();
                        }
                        sb2.append(str2);
                        str = sb2.toString();
                    }
                    sb.append(str);
                    fullName = sb.toString();
                }
            }
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
            textView.setText(fullName);
            User user9 = this.user;
            if (user9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            Collection combineList = user9.combineList();
            if (!(combineList == null || combineList.isEmpty())) {
                TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvSubtitle);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvSubtitle");
                textView2.setText("");
                User user10 = this.user;
                if (user10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                List<Apartment> combineList2 = user10.combineList();
                if (combineList2 != null) {
                    Iterator it = combineList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String userToken = ((Apartment) obj).getUserToken();
                        User user11 = this.user;
                        if (user11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("user");
                        }
                        if (Intrinsics.areEqual((Object) userToken, (Object) user11.getToken())) {
                            break;
                        }
                    }
                    Apartment apartment = (Apartment) obj;
                    if (apartment != null) {
                        TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvSubtitle);
                        Intrinsics.checkNotNullExpressionValue(textView3, "tvSubtitle");
                        textView3.setText(apartment.getTitle());
                        ApartmentRequest apartmentRequest = apartment.getApartmentRequest();
                        CharSequence status = apartmentRequest != null ? apartmentRequest.getStatus() : null;
                        if (!(status == null || StringsKt.isBlank(status))) {
                            TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvStatus);
                            Intrinsics.checkNotNullExpressionValue(textView4, "tvStatus");
                            textView4.setText(apartment.getApartmentRequest().getStatus());
                            TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvStatus);
                            Intrinsics.checkNotNullExpressionValue(textView5, "tvStatus");
                            textView5.setVisibility(0);
                        } else {
                            TextView textView6 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvStatus);
                            Intrinsics.checkNotNullExpressionValue(textView6, "tvStatus");
                            textView6.setVisibility(8);
                        }
                    }
                }
            }
            String str3 = getProfileViewModel().getUserAvatarPath().get();
            if (str3 == null) {
                str3 = "";
            }
            Intrinsics.checkNotNullExpressionValue(str3, "profileViewModel.userAvatarPath.get() ?: \"\"");
            if (!StringsKt.isBlank(str3)) {
                loadUserAvatar(str3, true);
                getProfileViewModel().getUserAvatarPath().set(null);
            } else {
                User user12 = this.user;
                if (user12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                if (!StringsKt.contains$default((CharSequence) user12.getAvatar(), (CharSequence) UriUtil.HTTPS_SCHEME, false, 2, (Object) null)) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivImage);
                    Context context = getContext();
                    User user13 = this.user;
                    if (user13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                    }
                    appCompatImageView.setImageDrawable(new TextDrawable(context, user13.getFullName()));
                } else {
                    String str4 = this.imageUrl;
                    User user14 = this.user;
                    if (user14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("user");
                    }
                    if (!Intrinsics.areEqual((Object) str4, (Object) user14.getAvatar())) {
                        User user15 = this.user;
                        if (user15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("user");
                        }
                        loadUserAvatar$default(this, user15.getAvatar(), false, 2, (Object) null);
                        User user16 = this.user;
                        if (user16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("user");
                        }
                        this.imageUrl = user16.getAvatar();
                    }
                }
            }
            loadSchema();
        }
    }

    static /* synthetic */ void loadUserAvatar$default(ProfileFragment profileFragment, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        profileFragment.loadUserAvatar(str, z);
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void loadUserAvatar(java.lang.String r2, boolean r3) {
        /*
            r1 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.ivImage
            android.view.View r0 = r1._$_findCachedViewById(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            ru.unicorn.ujin.util.GlideRequests r0 = p035ru.unicorn.ujin.util.GlideApp.with((android.view.View) r0)
            if (r3 == 0) goto L_0x0014
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r2 = r3
        L_0x0014:
            ru.unicorn.ujin.util.GlideRequest r2 = r0.load((java.lang.Object) r2)
            com.bumptech.glide.request.RequestOptions r3 = com.bumptech.glide.request.RequestOptions.circleCropTransform()
            com.bumptech.glide.request.BaseRequestOptions r3 = (com.bumptech.glide.request.BaseRequestOptions) r3
            ru.unicorn.ujin.util.GlideRequest r2 = r2.apply((com.bumptech.glide.request.BaseRequestOptions) r3)
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadUserAvatar$1 r3 = new ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadUserAvatar$1
            r3.<init>(r1)
            com.bumptech.glide.request.RequestListener r3 = (com.bumptech.glide.request.RequestListener) r3
            ru.unicorn.ujin.util.GlideRequest r2 = r2.listener((com.bumptech.glide.request.RequestListener) r3)
            int r3 = p035ru.unicorn.C5619R.C5622id.ivImage
            android.view.View r3 = r1._$_findCachedViewById(r3)
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r2.into((android.widget.ImageView) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.loadUserAvatar(java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (((p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r5).getAppStage() == p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.COMPLEX_CONSTRUCTION) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void loadSchema() {
        /*
            r12 = this;
            int r0 = p035ru.unicorn.C5619R.C5622id.rvProfile
            android.view.View r0 = r12._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r0.getContext()
            r3 = 0
            r4 = 1
            r1.<init>(r2, r4, r3)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r1
            r0.setLayoutManager(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "kortros"
            java.lang.String r5 = "pan"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            java.lang.String r6 = "null cannot be cast to non-null type ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity"
            if (r5 == 0) goto L_0x0070
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r12.getBaseActivity()
            if (r5 == 0) goto L_0x006a
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r5 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r5
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r5 = r5.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r7 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            if (r5 == r7) goto L_0x0050
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r12.getBaseActivity()
            if (r5 == 0) goto L_0x004a
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r5 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r5
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r5 = r5.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r7 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.COMPLEX_CONSTRUCTION
            if (r5 != r7) goto L_0x0070
            goto L_0x0050
        L_0x004a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0050:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r7 = "Чаты"
            r5.setTitle(r7)
            java.lang.String r7 = ACTION_CUSTOM
            r5.setAction(r7)
            java.lang.String r7 = CHATS
            r5.setActionValue(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r1.add(r5)
            goto L_0x0070
        L_0x006a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0070:
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r12.getBaseActivity()
            if (r5 == 0) goto L_0x02d3
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity r5 = (p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity) r5
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r5 = r5.getAppStage()
            ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage r6 = p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage.SMARTFLAT
            java.lang.String r7 = "morionDigital"
            java.lang.String r8 = "user"
            if (r5 != r6) goto L_0x00d5
            java.lang.String r5 = "smartdomru"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00d5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00d5
            ru.unicorn.ujin.data.realm.profile.User r5 = r12.user
            if (r5 != 0) goto L_0x009b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x009b:
            boolean r5 = r5.isCurrentCommerce()
            if (r5 != 0) goto L_0x00d5
            ru.unicorn.ujin.data.realm.profile.User r5 = r12.user
            if (r5 != 0) goto L_0x00a8
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x00a8:
            io.realm.RealmList r5 = r5.getApartmentList()
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00b9
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r5 = 0
            goto L_0x00ba
        L_0x00b9:
            r5 = 1
        L_0x00ba:
            if (r5 != 0) goto L_0x00d5
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Мой объект недвижимости"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = CURRENT_APARTMENT
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
        L_0x00d5:
            ru.unicorn.ujin.data.profile.ProfileViewModel r5 = r12.getProfileViewModel()
            io.realm.RealmList r5 = r5.getUserApartments()
            if (r5 == 0) goto L_0x00e4
            int r5 = r5.size()
            goto L_0x00e5
        L_0x00e4:
            r5 = 0
        L_0x00e5:
            if (r5 > r4) goto L_0x00fb
            ru.unicorn.ujin.enums.Flavor$Companion r5 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r5 = r5.current()
            boolean r5 = r5.isStage1Enabled()
            if (r5 != 0) goto L_0x00fb
            java.lang.String r5 = "ujin"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x0114
        L_0x00fb:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Выбор объекта недвижимости"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = APARTMENT_LIST
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
        L_0x0114:
            ru.unicorn.ujin.data.realm.profile.User r5 = r12.user
            if (r5 != 0) goto L_0x011b
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x011b:
            java.util.List r5 = r5.combineList()
            r6 = 0
            if (r5 == 0) goto L_0x0150
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0128:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x014b
            java.lang.Object r9 = r5.next()
            r10 = r9
            ru.unicorn.ujin.data.realm.profile.Apartment r10 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r10
            java.lang.String r10 = r10.getUserToken()
            ru.unicorn.ujin.data.realm.profile.User r11 = r12.user
            if (r11 != 0) goto L_0x0140
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0140:
            java.lang.String r11 = r11.getToken()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x0128
            goto L_0x014c
        L_0x014b:
            r9 = r6
        L_0x014c:
            r5 = r9
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r5
            goto L_0x0151
        L_0x0150:
            r5 = r6
        L_0x0151:
            ru.unicorn.ujin.data.realm.profile.User r9 = r12.user
            if (r9 != 0) goto L_0x0158
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0158:
            java.util.List r9 = r9.combineList()
            if (r9 == 0) goto L_0x0163
            int r9 = r9.size()
            goto L_0x0164
        L_0x0163:
            r9 = 0
        L_0x0164:
            if (r9 <= 0) goto L_0x01a8
            if (r5 == 0) goto L_0x016c
            java.lang.Boolean r6 = r5.getRentAvailable()
        L_0x016c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x01a8
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Объекты аренды"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = RENT_OBJECT_LIST
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Мои арендованные объекты"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = MY_RENT_OBJECT_LIST
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
        L_0x01a8:
            ru.unicorn.ujin.data.profile.ProfileViewModel r5 = r12.getProfileViewModel()
            io.realm.RealmList r5 = r5.getUserApartments()
            if (r5 == 0) goto L_0x01b7
            int r5 = r5.size()
            goto L_0x01b8
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            if (r5 <= r4) goto L_0x01d3
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Моя парковка"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = MY_SLOTS
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
        L_0x01d3:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Мои автомобили"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = MY_AUTO
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
            ru.unicorn.ujin.data.realm.profile.User r5 = r12.user
            if (r5 != 0) goto L_0x01f3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x01f3:
            boolean r5 = r5.isCurrentCommerce()
            if (r5 != 0) goto L_0x0219
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0219
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Субаккаунты и настройка прав"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = SUBACCOUNT_LIST
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r1.add(r5)
        L_0x0219:
            ru.unicorn.ujin.data.realm.profile.User r5 = r12.user
            if (r5 != 0) goto L_0x0220
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x0220:
            boolean r5 = r5.isCurrentCommerce()
            if (r5 != 0) goto L_0x022c
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r2 == 0) goto L_0x0245
        L_0x022c:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r2 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r2.<init>()
            java.lang.String r5 = "Мой пропуск"
            r2.setTitle(r5)
            java.lang.String r5 = ACTION_CUSTOM
            r2.setAction(r5)
            java.lang.String r5 = MY_PASS
            r2.setActionValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r1.add(r2)
        L_0x0245:
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            if (r2 != 0) goto L_0x024c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
        L_0x024c:
            boolean r2 = r2.isCurrentCommerce()
            if (r2 == 0) goto L_0x026b
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r2 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r2.<init>()
            java.lang.String r5 = "Моя компания"
            r2.setTitle(r5)
            java.lang.String r5 = ACTION_CUSTOM
            r2.setAction(r5)
            java.lang.String r5 = MY_COMPANY
            r2.setActionValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r1.add(r2)
        L_0x026b:
            r2 = 2
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema[] r2 = new p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema[r2]
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r5.<init>()
            java.lang.String r6 = "Приватность и безопасность"
            r5.setTitle(r6)
            java.lang.String r6 = ACTION_CUSTOM
            r5.setAction(r6)
            java.lang.String r6 = PRIVACY
            r5.setActionValue(r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r2[r3] = r5
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r3 = new ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema
            r3.<init>()
            java.lang.String r5 = "О приложении"
            r3.setTitle(r5)
            java.lang.String r5 = ACTION_CUSTOM
            r3.setAction(r5)
            java.lang.String r5 = ABOUT
            r3.setActionValue(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r2[r4] = r3
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.arrayListOf(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            ru.unicorn.ujin.view.fragments.profile.ProfileAdapter r2 = new ru.unicorn.ujin.view.fragments.profile.ProfileAdapter
            ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadSchema$$inlined$apply$lambda$1 r3 = new ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadSchema$$inlined$apply$lambda$1
            r3.<init>(r12)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r2.<init>(r1, r3)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = (androidx.recyclerview.widget.RecyclerView.Adapter) r2
            r0.setAdapter(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r0 = p035ru.unicorn.C5619R.C5622id.rvProfile
            android.view.View r0 = r12._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r1 = "rvProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x02d2
            r0.notifyDataSetChanged()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02d2:
            return
        L_0x02d3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment.loadSchema():void");
    }

    /* access modifiers changed from: private */
    public final void handleProfileButtonClick(Schema schema) {
        this.imageUrl = null;
        if (getProfileViewModel().isDemo()) {
            new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) "Деморежим").setMessage((CharSequence) "Функционал недоступен в деморежиме.").setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) ProfileFragment$handleProfileButtonClick$1.INSTANCE).show();
        } else if (Intrinsics.areEqual((Object) schema.getAction(), (Object) ACTION_CUSTOM)) {
            handleCustomAction(schema);
        }
    }

    private final void handleCustomAction(Schema schema) {
        List list;
        String actionValue = schema.getActionValue();
        if (Intrinsics.areEqual((Object) actionValue, (Object) APARTMENT_LIST)) {
            ApartmentListFragment.Companion companion = ApartmentListFragment.Companion;
            String title = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "schema.title");
            nextFragment(companion.newInstance(title, Mode.FROM_PROFILE), false, BaseActivity.FRAGMENT_APARTMENT_LIST);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) SUBACCOUNT_LIST)) {
            SubAccountListFragment.Companion companion2 = SubAccountListFragment.Companion;
            String title2 = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title2, "schema.title");
            nextFragment(companion2.newInstance(title2), false, BaseActivity.FRAGMENT_SUB_ACCOUNT_LIST);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) CURRENT_APARTMENT)) {
            List<Apartment> combineApartments = getProfileViewModel().getCombineApartments();
            if (combineApartments != null) {
                Collection arrayList = new ArrayList();
                for (Object next : combineApartments) {
                    if (Intrinsics.areEqual((Object) ((Apartment) next).getUserToken(), (Object) getProfileViewModel().getUserToken())) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            Collection collection = list;
            if (!(collection == null || collection.isEmpty())) {
                nextFragment(FlatFragment.newInstance(((Apartment) list.get(0)).getUid(), true, true, (Boolean) false), false, BaseActivity.FRAGMENT_FLAT);
            } else {
                showErrorMessage("Ошибка загрузки квартиры");
            }
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) PRIVACY)) {
            PrivacyFragment.Companion companion3 = PrivacyFragment.Companion;
            String title3 = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title3, "schema.title");
            nextFragment(companion3.newInstance(title3), false, BaseActivity.FRAGMENT_PRIVACY);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) CHATS)) {
            nextFragment(ChatListFragment.Companion.newInstance(), false, BaseActivity.FRAGMENT_CHATS);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) RENT_OBJECT_LIST)) {
            nextFragment(new RentObjectFragment(), false, BaseActivity.FRAGMENT_RENT_OBJECT);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) MY_RENT_OBJECT_LIST)) {
            nextFragment(RentObjectListFragment.Companion.newInstance(), false, BaseActivity.FRAGMENT_RENT_OBJECT_LIST);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) ABOUT)) {
            AboutAppFragment.Companion companion4 = AboutAppFragment.Companion;
            String title4 = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title4, "schema.title");
            nextFragment(companion4.newInstance(title4), false, BaseActivity.FRAGMENT_ABOUT_APP);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) MY_COMPANY)) {
            nextFragment(new MyRentaCompanyFragment(), false, BaseActivity.FRAGMENT_MY_COMPANY);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) MY_PASS)) {
            nextFragment(new ProfileMyPassFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) PASS)) {
            nextFragment(new AnotherPassListFragment(), false, BaseActivity.FRAGMENT_ANOTHER_PASS_LIST);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) MY_SLOTS)) {
            nextFragment(ParkingMySlotsFragment.Companion.newInstance(0, "Парковка"), false, BaseActivity.FRAGMENT_PARKING_RENT);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) MY_AUTO)) {
            nextFragment(MyVehicleListFragment.Companion.newInstance(), false, BaseActivity.FRAGMENT_MY_VEHICLE_LIST);
        }
    }
}
