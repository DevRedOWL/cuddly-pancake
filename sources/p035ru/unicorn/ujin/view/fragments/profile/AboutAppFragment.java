package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.BaseTitleFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/AboutAppFragment;", "Lru/unicorn/ujin/view/fragments/BaseTitleFragment;", "()V", "getLayoutRes", "", "metricsScreenName", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.AboutAppFragment */
/* compiled from: AboutAppFragment.kt */
public final class AboutAppFragment extends BaseTitleFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;

    @JvmStatic
    public static final AboutAppFragment newInstance(String str) {
        return Companion.newInstance(str);
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
        return R.layout.fragment_profile_about_app;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "О приложении";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/AboutAppFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/profile/AboutAppFragment;", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.AboutAppFragment$Companion */
    /* compiled from: AboutAppFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AboutAppFragment newInstance(String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            AboutAppFragment aboutAppFragment = new AboutAppFragment();
            aboutAppFragment.setTitle(str);
            return aboutAppFragment;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0087, code lost:
        if (r1 != null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            super.onViewCreated(r5, r6)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvVersion
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "tvVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = "Версия приложения: 2.4.1 (572)"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvUserId
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "tvUserId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ID пользователя: "
            r6.append(r0)
            ru.unicorn.ujin.data.profile.ProfileViewModel r0 = r4.getProfileViewModel()
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            long r0 = r0.getId()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            ru.unicorn.ujin.data.profile.ProfileViewModel r5 = r4.getProfileViewModel()
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = r5.getCurrentApartment()
            if (r5 == 0) goto L_0x005a
            java.lang.Integer r5 = r5.getId()
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            r6 = 0
            r0 = 8
            if (r5 == 0) goto L_0x008a
            r1 = r5
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            int r1 = p035ru.unicorn.C5619R.C5622id.tvApartmentId
            android.view.View r1 = r4._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ID квартиры: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.setText(r5)
            r1.setVisibility(r6)
            if (r1 == 0) goto L_0x008a
            goto L_0x009f
        L_0x008a:
            r5 = r4
            ru.unicorn.ujin.view.fragments.profile.AboutAppFragment r5 = (p035ru.unicorn.ujin.view.fragments.profile.AboutAppFragment) r5
            int r1 = p035ru.unicorn.C5619R.C5622id.tvApartmentId
            android.view.View r5 = r5._$_findCachedViewById(r1)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r1 = "tvApartmentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r5.setVisibility(r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L_0x009f:
            ru.unicorn.ujin.data.profile.ProfileViewModel r5 = r4.getProfileViewModel()
            ru.unicorn.ujin.data.realm.profile.Apartment r5 = r5.getCurrentApartment()
            if (r5 == 0) goto L_0x00b0
            java.lang.String r5 = r5.getComplexId()
            if (r5 == 0) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x00b5:
            r1 = 338(0x152, float:4.74E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            java.lang.String r1 = "tvTutorial"
            if (r5 == 0) goto L_0x010c
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTutorial
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r5.setVisibility(r6)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTutorial
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r6 = 2131886163(0x7f120053, float:1.9406897E38)
            java.lang.String r6 = r4.getString(r6)
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTutorial
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 15
            android.text.util.Linkify.addLinks(r5, r6)
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTutorial
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            ru.unicorn.ujin.view.fragments.profile.AboutAppFragment$onViewCreated$3 r6 = new ru.unicorn.ujin.view.fragments.profile.AboutAppFragment$onViewCreated$3
            r6.<init>(r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            goto L_0x011a
        L_0x010c:
            int r5 = p035ru.unicorn.C5619R.C5622id.tvTutorial
            android.view.View r5 = r4._$_findCachedViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r5.setVisibility(r0)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.profile.AboutAppFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
