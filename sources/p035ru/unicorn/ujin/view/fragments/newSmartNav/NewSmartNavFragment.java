package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.CoronaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon.DomofonFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.DomofonPrikamyaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty.EmptyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ApplicationListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1.AppViewPagerFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.CounterListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.FakeFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketsFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoPreviewFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.FR_TAGS;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment;
import p035ru.unicorn.ujin.view.fragments.news.NewsListFragment;
import p035ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment;
import p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment;
import p035ru.unicorn.ujin.view.fragments.rozmarin.ParkingFragment;
import p035ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001ZB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0004H\u0002J\u0010\u00105\u001a\u0002032\u0006\u00104\u001a\u00020\u0004H\u0002J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0004H\u0002J\u0010\u00108\u001a\u0002032\u0006\u00100\u001a\u000201H\u0002J\u0010\u00109\u001a\u0002032\u0006\u0010:\u001a\u000201H\u0002J\u0010\u0010;\u001a\u0002032\u0006\u0010<\u001a\u000201H\u0002J\u0018\u0010=\u001a\u0002032\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?H\u0002J\b\u0010A\u001a\u000203H\u0002J\u0018\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010B\u001a\u0002032\u0006\u00100\u001a\u000201H\u0002J\b\u0010G\u001a\u00020\u0004H\u0014J&\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u0002032\u0006\u0010>\u001a\u00020QH\u0002J\u001a\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020I2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002032\u0006\u00100\u001a\u000201H\u0002J\b\u0010X\u001a\u000203H\u0002J\b\u0010Y\u001a\u000203H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020#X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020)8FX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+¨\u0006["}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/newSmartNav/NewSmartNavFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "CANCEL", "", "getCANCEL", "()Ljava/lang/String;", "CORONA", "getCORONA", "DIALOGUE", "getDIALOGUE", "DYNAMIC_FORM", "getDYNAMIC_FORM", "GORSERV", "getGORSERV", "NEWS", "getNEWS", "OSS", "getOSS", "PARKING", "getPARKING", "PROVIDER_SERVICE", "getPROVIDER_SERVICE", "TASHIR", "getTASHIR", "adapter1", "Lru/unicorn/ujin/view/fragments/newSmartNav/NewSmartAdapter;", "getAdapter1", "()Lru/unicorn/ujin/view/fragments/newSmartNav/NewSmartAdapter;", "setAdapter1", "(Lru/unicorn/ujin/view/fragments/newSmartNav/NewSmartAdapter;)V", "adapter2", "getAdapter2", "setAdapter2", "profileTabViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/ProfileTabViewModel;", "getProfileTabViewModel", "()Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/ProfileTabViewModel;", "setProfileTabViewModel", "(Lru/unicorn/ujin/view/activity/navigation/ui/profiletaba/ProfileTabViewModel;)V", "simpleViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "getSimpleViewModel", "()Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "simpleViewModel$delegate", "Lkotlin/Lazy;", "availableByScheme", "", "schema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "callMethod", "", "actionValue", "callMethodNoHandling", "callTo", "number", "checkUpdate", "doCustomRentWork", "data", "doCustomWork", "customSchema", "handleAction", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "initAdapter", "makeAction", "dialogButtons", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/DialogButtons;", "dialog", "Landroid/content/DialogInterface;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGetSchema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schemas;", "onViewCreated", "view", "showChoosenTypeFragment", "rentInfo", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentType;", "showDynamicDialog", "showNotAvailableDialog", "showToolbar", "PeekingLinearLayoutManager", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment */
/* compiled from: NewSmartNavFragment.kt */
public final class NewSmartNavFragment extends BaseFragment {
    private final String CANCEL = "cancel";
    private final String CORONA = "my_pass";
    private final String DIALOGUE = "dialogue";
    private final String DYNAMIC_FORM = SmartNavFragment.DYNAMIC_FORM;
    private final String GORSERV = SmartNavFragment.GORSERV;
    private final String NEWS = "news";
    private final String OSS = SmartNavFragment.OSS;
    private final String PARKING = "parking";
    private final String PROVIDER_SERVICE = SmartNavFragment.PROVIDER_SERVICE;
    private final String TASHIR = "tashir";
    private HashMap _$_findViewCache;
    public NewSmartAdapter adapter1;
    public NewSmartAdapter adapter2;
    public ProfileTabViewModel profileTabViewModel;
    private final Lazy simpleViewModel$delegate = LazyKt.lazy(new NewSmartNavFragment$simpleViewModel$2(this));

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
        }
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

    public final SimpleViewModel getSimpleViewModel() {
        return (SimpleViewModel) this.simpleViewModel$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Новый навигационный фрагмент";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ProfileTabViewModel getProfileTabViewModel() {
        ProfileTabViewModel profileTabViewModel2 = this.profileTabViewModel;
        if (profileTabViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileTabViewModel");
        }
        return profileTabViewModel2;
    }

    public final void setProfileTabViewModel(ProfileTabViewModel profileTabViewModel2) {
        Intrinsics.checkNotNullParameter(profileTabViewModel2, "<set-?>");
        this.profileTabViewModel = profileTabViewModel2;
    }

    public final String getCANCEL() {
        return this.CANCEL;
    }

    public final String getDIALOGUE() {
        return this.DIALOGUE;
    }

    public final String getTASHIR() {
        return this.TASHIR;
    }

    public final String getPARKING() {
        return this.PARKING;
    }

    public final String getDYNAMIC_FORM() {
        return this.DYNAMIC_FORM;
    }

    public final String getOSS() {
        return this.OSS;
    }

    public final String getPROVIDER_SERVICE() {
        return this.PROVIDER_SERVICE;
    }

    public final String getNEWS() {
        return this.NEWS;
    }

    public final String getCORONA() {
        return this.CORONA;
    }

    public final String getGORSERV() {
        return this.GORSERV;
    }

    public final NewSmartAdapter getAdapter1() {
        NewSmartAdapter newSmartAdapter = this.adapter1;
        if (newSmartAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter1");
        }
        return newSmartAdapter;
    }

    public final void setAdapter1(NewSmartAdapter newSmartAdapter) {
        Intrinsics.checkNotNullParameter(newSmartAdapter, "<set-?>");
        this.adapter1 = newSmartAdapter;
    }

    public final NewSmartAdapter getAdapter2() {
        NewSmartAdapter newSmartAdapter = this.adapter2;
        if (newSmartAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter2");
        }
        return newSmartAdapter;
    }

    public final void setAdapter2(NewSmartAdapter newSmartAdapter) {
        Intrinsics.checkNotNullParameter(newSmartAdapter, "<set-?>");
        this.adapter2 = newSmartAdapter;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().showImageLogo();
        if (Intrinsics.areEqual((Object) getBaseActivity().flavor.getAppName(), (Object) Flavor.PAN.getAppName())) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.NONE);
        } else {
            getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_new_smart_navigaion, viewGroup, false);
    }

    private final void callMethod(String str) {
        getSimpleViewModel().sendDynamicRequest(str);
        getSimpleViewModel().getSendDynamiceRequest().observe(getViewLifecycleOwner(), new NewSmartNavFragment$callMethod$1(this));
    }

    private final void callMethodNoHandling(String str) {
        getSimpleViewModel().sendDynamicRequest(str);
        getSimpleViewModel().getSendDynamiceRequest().removeObservers(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getSimpleViewModel().getSchemasMutableLiveData().observe(getViewLifecycleOwner(), new NewSmartNavFragment$onViewCreated$1(this));
        getSimpleViewModel().getSchema();
        initAdapter();
    }

    private final void initAdapter() {
        ((LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav)).removeAllViews();
        NewSmartAdapter newSmartAdapter = new NewSmartAdapter();
        newSmartAdapter.simpleClicks().subscribe(new NewSmartNavFragment$initAdapter$$inlined$apply$lambda$1(this));
        Unit unit = Unit.INSTANCE;
        this.adapter1 = newSmartAdapter;
        NewSmartAdapter newSmartAdapter2 = new NewSmartAdapter();
        newSmartAdapter2.simpleClicks().subscribe(new NewSmartNavFragment$initAdapter$$inlined$apply$lambda$2(this));
        Unit unit2 = Unit.INSTANCE;
        this.adapter2 = newSmartAdapter2;
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_smart_card_title, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText("Новости");
            Unit unit3 = Unit.INSTANCE;
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_rv_smartnav, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
            if (inflate2 != null) {
                RecyclerView recyclerView = (RecyclerView) inflate2;
                PeekingLinearLayoutManager peekingLinearLayoutManager = new PeekingLinearLayoutManager(recyclerView.getContext(), 0, false);
                peekingLinearLayoutManager.setRatio(0.75f);
                Unit unit4 = Unit.INSTANCE;
                recyclerView.setLayoutManager(peekingLinearLayoutManager);
                ArrayList arrayList = new ArrayList();
                ImageData imageData = new ImageData();
                imageData.setSource("https://cdnimg.rg.ru/img/content/178/22/40/kotik_d_850.jpg");
                Unit unit5 = Unit.INSTANCE;
                News news = r9;
                News news2 = new News("", "Новость от УК", "Тут текст новости от УК", "16.06.2020", imageData, (RealmList<ImageData>) null);
                arrayList.add(news);
                ImageData imageData2 = new ImageData();
                imageData2.setSource("https://avatars.mds.yandex.net/get-zen_doc/1680084/pub_5d3599116f5f6f00add74a04_5d3599dece44a000b9d37220/scale_1200");
                Unit unit6 = Unit.INSTANCE;
                arrayList.add(new News("", "Опасность котиков", "Ученые выяснили, что котики опасны своей няшностью, будьте внимательны", "16.06.2020", imageData2, (RealmList<ImageData>) null));
                Unit unit7 = Unit.INSTANCE;
                recyclerView.setAdapter(new SmartNewsAdapter(arrayList, NewSmartNavFragment$initAdapter$4$3.INSTANCE));
                Unit unit8 = Unit.INSTANCE;
                linearLayout2.addView(recyclerView);
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
                View inflate3 = LayoutInflater.from(getContext()).inflate(R.layout.item_smart_card_title, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
                if (inflate3 != null) {
                    TextView textView2 = (TextView) inflate3;
                    textView2.setText("Охрана");
                    Unit unit9 = Unit.INSTANCE;
                    linearLayout3.addView(textView2);
                    LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
                    View inflate4 = LayoutInflater.from(getContext()).inflate(R.layout.item_rv_smartnav, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
                    if (inflate4 != null) {
                        RecyclerView recyclerView2 = (RecyclerView) inflate4;
                        recyclerView2.setLayoutManager(new PeekingLinearLayoutManager(recyclerView2.getContext(), 0, false));
                        NewSmartAdapter newSmartAdapter3 = this.adapter1;
                        if (newSmartAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter1");
                        }
                        recyclerView2.setAdapter(newSmartAdapter3);
                        Unit unit10 = Unit.INSTANCE;
                        linearLayout4.addView(recyclerView2);
                        LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
                        View inflate5 = LayoutInflater.from(getContext()).inflate(R.layout.item_smart_card_title, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
                        if (inflate5 != null) {
                            TextView textView3 = (TextView) inflate5;
                            textView3.setText("Услуги");
                            Unit unit11 = Unit.INSTANCE;
                            linearLayout5.addView(textView3);
                            LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav);
                            View inflate6 = LayoutInflater.from(getContext()).inflate(R.layout.item_rv_smartnav, (LinearLayout) _$_findCachedViewById(C5619R.C5622id.llSmartNav), false);
                            if (inflate6 != null) {
                                RecyclerView recyclerView3 = (RecyclerView) inflate6;
                                recyclerView3.setLayoutManager(new PeekingLinearLayoutManager(recyclerView3.getContext(), 0, false));
                                NewSmartAdapter newSmartAdapter4 = this.adapter2;
                                if (newSmartAdapter4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adapter2");
                                }
                                recyclerView3.setAdapter(newSmartAdapter4);
                                Unit unit12 = Unit.INSTANCE;
                                linearLayout6.addView(recyclerView3);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    public final void checkUpdate(Schema schema) {
        if (availableByScheme(schema)) {
            makeAction(schema);
        } else {
            showNotAvailableDialog();
        }
    }

    private final void makeAction(Schema schema) {
        String action = schema.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1349088399:
                    if (action.equals("custom")) {
                        MutableLiveData<Schema> currentSchema = getSimpleViewModel().getCurrentSchema();
                        Intrinsics.checkNotNullExpressionValue(currentSchema, "simpleViewModel.currentSchema");
                        currentSchema.setValue(schema);
                        String actionValue = schema.getActionValue();
                        Intrinsics.checkNotNullExpressionValue(actionValue, "schema.actionValue");
                        if (!StringsKt.contains$default((CharSequence) actionValue, (CharSequence) "rent_", false, 2, (Object) null)) {
                            doCustomWork(schema);
                            break;
                        } else {
                            ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileTabViewModel.class);
                            Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…TabViewModel::class.java]");
                            this.profileTabViewModel = (ProfileTabViewModel) viewModel;
                            ProfileTabViewModel profileTabViewModel2 = this.profileTabViewModel;
                            if (profileTabViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("profileTabViewModel");
                            }
                            profileTabViewModel2.getRentInfoByName().observe(getViewLifecycleOwner(), new NewSmartNavFragment$makeAction$1(this));
                            doCustomRentWork(schema);
                            break;
                        }
                    }
                    break;
                case -447181342:
                    if (action.equals(Schema.CALL_METHOD)) {
                        String actionValue2 = schema.getActionValue();
                        Intrinsics.checkNotNullExpressionValue(actionValue2, "schema.actionValue");
                        callMethod(actionValue2);
                        break;
                    }
                    break;
                case -233842216:
                    if (action.equals("dialogue")) {
                        showDynamicDialog(schema);
                        break;
                    }
                    break;
                case 117588:
                    if (action.equals(Schema.WEB)) {
                        getBaseActivity().showUrl(schema.getActionValue());
                        break;
                    }
                    break;
                case 3045982:
                    if (action.equals("call")) {
                        String actionValue3 = schema.getActionValue();
                        Intrinsics.checkNotNullExpressionValue(actionValue3, "schema.actionValue");
                        callTo(actionValue3);
                        break;
                    }
                    break;
                case 96634189:
                    if (action.equals(Schema.EMPTY)) {
                        nextFragment(EmptyFragment.start(schema.getActionValue(), schema.getDescription()), false);
                        break;
                    }
                    break;
            }
        }
        if (schema.getSchemaCallback() != null) {
            SchemaCallback schemaCallback = schema.getSchemaCallback();
            Intrinsics.checkNotNullExpressionValue(schemaCallback, "schema.schemaCallback");
            if (StringUtils.isNotEmpty(schemaCallback.getUrl())) {
                SchemaCallback schemaCallback2 = schema.getSchemaCallback();
                Intrinsics.checkNotNullExpressionValue(schemaCallback2, "schema.schemaCallback");
                String url = schemaCallback2.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "schema.schemaCallback.url");
                callMethodNoHandling(url);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showChoosenTypeFragment(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter((BaseFragment) this, rentType);
    }

    private final void doCustomRentWork(Schema schema) {
        String title = schema.getTitle();
        String actionValue = schema.getActionValue();
        if (Intrinsics.areEqual((Object) getString(R.string.title_news), (Object) title)) {
            return;
        }
        if (Intrinsics.areEqual((Object) schema.getActionValue(), (Object) SchemaRouter.TEAM)) {
            nextFragment(new MyRentaCompanyFragment(), false);
        } else if (Intrinsics.areEqual((Object) getString(R.string.title_arenda), (Object) title)) {
            nextFragment(MyRentaFragment.start(1), false);
        } else {
            Intrinsics.checkNotNullExpressionValue(actionValue, "slug");
            if (actionValue != null) {
                String lowerCase = actionValue.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "rent_tickets", false, 2, (Object) null)) {
                    nextFragment(TicketListFragment.start("property_type", schema.getSectionId(), schema.getSectionTitle(), schema.getTitle()), false);
                    return;
                }
                String lowerCase2 = actionValue.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "rent_event_services", false, 2, (Object) null)) {
                    nextFragment(new FakeFragment(), false);
                    return;
                }
                String lowerCase3 = actionValue.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "rent_", false, 2, (Object) null)) {
                    String lowerCase4 = actionValue.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase()");
                    String replace$default = StringsKt.replace$default(lowerCase4, "rent_", "", false, 4, (Object) null);
                    ProfileTabViewModel profileTabViewModel2 = this.profileTabViewModel;
                    if (profileTabViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("profileTabViewModel");
                    }
                    profileTabViewModel2.getTypeByName(replace$default);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final void doCustomWork(Schema schema) {
        String str;
        String actionValue = schema.getActionValue();
        if (Intrinsics.areEqual((Object) actionValue, (Object) this.PROVIDER_SERVICE)) {
            ProviderServiceFragment.Companion companion = ProviderServiceFragment.Companion;
            String title = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "customSchema.title");
            String provider = schema.getProvider();
            Intrinsics.checkNotNullExpressionValue(provider, "customSchema.provider");
            String productState = schema.getProductState();
            Intrinsics.checkNotNullExpressionValue(productState, "customSchema.productState");
            nextFragment(companion.newInstance(title, provider, productState, schema.getServiceId()), false, BaseActivity.FRAGMENT_PROVIDER_SERVICE);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.OSS)) {
            OssListFragment.Companion companion2 = OssListFragment.Companion;
            String title2 = schema.getTitle();
            Intrinsics.checkNotNullExpressionValue(title2, "customSchema.title");
            nextFragment(companion2.newInstance(title2), false, BaseActivity.FRAGMENT_OSS_LIST);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.DYNAMIC_FORM)) {
            nextFragment(DynamicFragment.Companion.newInstance(5, ToolbarButtons.BACK), false, BaseActivity.FRAGMENT_DYNAMIC);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.GORSERV)) {
            nextFragment(DynamicFragment.Companion.newInstance(5, ToolbarButtons.BACK), false, BaseActivity.FRAGMENT_DYNAMIC);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "video")) {
            nextFragment(VideoPreviewFragment.start(0), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) SimpleData.DOMOFON)) {
            nextFragment(DomofonFragment.start(schema.getTitle()), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) SimpleData.CARD)) {
            nextFragment(CardListFragment.start(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "kvit")) {
            nextFragment(TicketsFragment.start(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "counter")) {
            nextFragment(new CounterListFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "bms")) {
            nextFragment(new BMSFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "tickets")) {
            if (Intrinsics.areEqual((Object) "kortros", (Object) Flavors.MORIONDIGITAL)) {
                nextFragment(TicketListFragment.start("property_service", schema.getSectionId(), schema.getSectionTitle(), schema.getTitle()), false);
            } else {
                nextFragment(new AppViewPagerFragment(), false, FR_TAGS.TAG_TICKETS);
            }
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "create_ticket")) {
            try {
                nextFragment(new ApplicationListFragment().start(1), false, FR_TAGS.TAG_TICKETS);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "gates")) {
            MutableLiveData<Schema> currentSchema = getSimpleViewModel().getCurrentSchema();
            Intrinsics.checkNotNullExpressionValue(currentSchema, "simpleViewModel.currentSchema");
            Schema value = currentSchema.getValue();
            GatesFragment.Companion companion3 = GatesFragment.Companion;
            if (value == null || (str = value.getTitle()) == null) {
                str = "";
            }
            nextFragment(companion3.start(str), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "domofon2")) {
            nextFragment(new DomofonPrikamyaFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.TASHIR)) {
            nextFragment(new TashirFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.PARKING)) {
            nextFragment(new ParkingFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.NEWS)) {
            nextFragment(new NewsListFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "domru_product")) {
            MutableLiveData<Schema> currentSchema2 = getSimpleViewModel().getCurrentSchema();
            Intrinsics.checkNotNullExpressionValue(currentSchema2, "simpleViewModel.currentSchema");
            Schema value2 = currentSchema2.getValue();
            if (value2 != null) {
                nextFragment(DomServiceListFragment.start(value2.getDomRuId(), value2.getTitle()), false);
            }
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) this.CORONA)) {
            nextFragment(new CoronaFragment(), false);
        } else if (Intrinsics.areEqual((Object) actionValue, (Object) "appointment")) {
            nextFragment(new RecordsViewPagerFragment(), false, Constants.ALL_RECORDS_TAG);
        }
    }

    private final void showDynamicDialog(Schema schema) {
        DialogButtons dialogButtons;
        if (schema != null && Intrinsics.areEqual((Object) schema.getAction(), (Object) this.DIALOGUE) && schema.getDialogButtons() != null && !schema.getDialogButtons().isEmpty()) {
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), schema.getAlertMessage());
            RealmList<DialogButtons> dialogButtons2 = schema.getDialogButtons();
            Intrinsics.checkNotNullExpressionValue(dialogButtons2, "schema.dialogButtons");
            int size = dialogButtons2.size();
            for (int i = 0; i < size; i++) {
                RealmList<DialogButtons> dialogButtons3 = schema.getDialogButtons();
                if (!(dialogButtons3 == null || (dialogButtons = dialogButtons3.get(i)) == null)) {
                    Intrinsics.checkNotNullExpressionValue(dialogButtons, "dialogButtons");
                    if (dialogButtons.getActionValue() != null) {
                        createDialogBuilder.setPositiveButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$1(dialogButtons, this, createDialogBuilder));
                    } else if (Intrinsics.areEqual((Object) dialogButtons.getAction(), (Object) this.CANCEL)) {
                        createDialogBuilder.setNegativeButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$2(dialogButtons, this, createDialogBuilder));
                    } else {
                        createDialogBuilder.setNeutralButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new NewSmartNavFragment$showDynamicDialog$$inlined$let$lambda$3(dialogButtons, this, createDialogBuilder));
                    }
                }
            }
            createDialogBuilder.create().show();
        }
    }

    /* access modifiers changed from: private */
    public final void makeAction(DialogButtons dialogButtons, DialogInterface dialogInterface) {
        String action = dialogButtons.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1367724422) {
                if (hashCode != -447181342) {
                    if (hashCode == 3045982 && action.equals("call")) {
                        String actionValue = dialogButtons.getActionValue();
                        Intrinsics.checkNotNullExpressionValue(actionValue, "dialogButtons.actionValue");
                        callTo(actionValue);
                    }
                } else if (action.equals(Schema.CALL_METHOD)) {
                    String actionValue2 = dialogButtons.getActionValue();
                    Intrinsics.checkNotNullExpressionValue(actionValue2, "dialogButtons.actionValue");
                    callMethod(actionValue2);
                }
            } else if (action.equals("cancel")) {
                dialogInterface.dismiss();
            }
        }
    }

    private final void callTo(String str) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* access modifiers changed from: private */
    public final void handleAction(Resource<Void> resource) {
        Resource.Status status;
        NewSmartNavFragment newSmartNavFragment = this;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) newSmartNavFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) newSmartNavFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pbLoading");
                progressBar2.setVisibility(8);
                DialogHelper.showDialog((Context) newSmartNavFragment.getActivity(), resource.getMessage());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) newSmartNavFragment._$_findCachedViewById(C5619R.C5622id.pbLoading);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pbLoading");
                progressBar3.setVisibility(8);
                DialogHelper.showDialog((Context) newSmartNavFragment.getActivity(), resource.getMessage());
            }
        }
    }

    private final void showNotAvailableDialog() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) "Действие пока не доступно, следите за обновлениями приложения!").setPositiveButton((CharSequence) "Перейти в Play Market", (DialogInterface.OnClickListener) new NewSmartNavFragment$showNotAvailableDialog$1(this)).setNegativeButton((CharSequence) "Отмена", (DialogInterface.OnClickListener) NewSmartNavFragment$showNotAvailableDialog$2.INSTANCE).show();
    }

    private final boolean availableByScheme(Schema schema) {
        try {
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            PackageManager packageManager = baseActivity.getPackageManager();
            BaseActivity baseActivity2 = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            PackageInfo packageInfo = packageManager.getPackageInfo(baseActivity2.getPackageName(), 0);
            if (schema.getMinVersion() == null) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                MinVersion minVersion = schema.getMinVersion();
                Intrinsics.checkNotNullExpressionValue(minVersion, "schema.minVersion");
                long longValue = minVersion.getAndroid().longValue();
                Intrinsics.checkNotNullExpressionValue(packageInfo, "pInfo");
                if (longValue <= packageInfo.getLongVersionCode()) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT < 28) {
                MinVersion minVersion2 = schema.getMinVersion();
                Intrinsics.checkNotNullExpressionValue(minVersion2, "schema.minVersion");
                if (minVersion2.getAndroid().longValue() <= ((long) packageInfo.versionCode)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final void onGetSchema(Schemas schemas) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.pbLoading);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbLoading");
        progressBar.setVisibility(8);
        NewSmartAdapter newSmartAdapter = this.adapter1;
        if (newSmartAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter1");
        }
        newSmartAdapter.setData(schemas.getGuard());
        NewSmartAdapter newSmartAdapter2 = this.adapter2;
        if (newSmartAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter2");
        }
        newSmartAdapter2.setData(schemas.getServices());
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0002R\u0014\u0010\u000e\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/newSmartNav/NewSmartNavFragment$PeekingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "horizontalSpace", "getHorizontalSpace", "()I", "ratio", "", "getRatio", "()F", "setRatio", "(F)V", "verticalSpace", "getVerticalSpace", "generateDefaultLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "generateLayoutParams", "c", "lp", "Landroid/view/ViewGroup$LayoutParams;", "scaledLayoutParams", "layoutParams", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$PeekingLinearLayoutManager */
    /* compiled from: NewSmartNavFragment.kt */
    public static final class PeekingLinearLayoutManager extends LinearLayoutManager {
        private float ratio;

        public PeekingLinearLayoutManager(Context context) {
            this(context, 0, false, 6, (DefaultConstructorMarker) null);
        }

        public PeekingLinearLayoutManager(Context context, int i) {
            this(context, i, false, 4, (DefaultConstructorMarker) null);
        }

        public PeekingLinearLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
            this.ratio = 0.42f;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PeekingLinearLayoutManager(Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PeekingLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attributeSet, "attrs");
            this.ratio = 0.42f;
        }

        public RecyclerView.LayoutParams generateDefaultLayoutParams() {
            RecyclerView.LayoutParams generateDefaultLayoutParams = super.generateDefaultLayoutParams();
            Intrinsics.checkNotNullExpressionValue(generateDefaultLayoutParams, "super.generateDefaultLayoutParams()");
            return scaledLayoutParams(generateDefaultLayoutParams);
        }

        public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            RecyclerView.LayoutParams generateLayoutParams = super.generateLayoutParams(layoutParams);
            Intrinsics.checkNotNullExpressionValue(generateLayoutParams, "super.generateLayoutParams(lp)");
            return scaledLayoutParams(generateLayoutParams);
        }

        public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            RecyclerView.LayoutParams generateLayoutParams = super.generateLayoutParams(context, attributeSet);
            Intrinsics.checkNotNullExpressionValue(generateLayoutParams, "super.generateLayoutParams(c, attrs)");
            return scaledLayoutParams(generateLayoutParams);
        }

        private final RecyclerView.LayoutParams scaledLayoutParams(RecyclerView.LayoutParams layoutParams) {
            int orientation = getOrientation();
            if (orientation == 0) {
                layoutParams.width = (int) (((float) getHorizontalSpace()) * this.ratio);
            } else if (orientation == 1) {
                layoutParams.height = (int) (((float) getVerticalSpace()) * this.ratio);
            }
            return layoutParams;
        }

        private final int getHorizontalSpace() {
            return (getWidth() - getPaddingStart()) - getPaddingEnd();
        }

        private final int getVerticalSpace() {
            return (getHeight() - getPaddingTop()) - getPaddingBottom();
        }

        public final float getRatio() {
            return this.ratio;
        }

        public final void setRatio(float f) {
            this.ratio = f;
        }
    }
}
