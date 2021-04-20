package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import java.util.ArrayList;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.SimpleAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.FakeFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketListFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.notification.NotificationListFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavFragment */
public class SmartNavFragment extends BaseFragment {
    public static final String ARG_POSITION = "arg_position";
    public static final int CABINET = 7;
    public static final String CANCEL = "cancel";
    public static final int CHAT = 5;
    public static final String CORONA = "my_pass";
    public static final String DIALOGUE = "dialogue";
    public static final String DYNAMIC_FORM = "dynamicForm";
    public static final String GORSERV = "gorserv";
    public static final int HOTKEYS = 6;
    public static final String NEWS = "news";
    public static final String OSS = "oss";
    public static final String PARKING = "parking";
    public static final String PARKING_RENT = "parking_rent";
    public static final int PARTNER = 4;
    public static final String PROVIDER_SERVICE = "provider_service";
    public static final String QR_SCAN = "qr_code";
    public static final int SECURITY = 2;
    public static final int SMART = 1;
    public static final int START = 0;
    public static final String STOREROOM_RENT = "storeroom_rent";
    public static final String TASHIR = "tashir";
    public static final int USLUGI = 3;
    private Integer notificationsCount;
    @Nullable
    @BindView(2131363166)

    /* renamed from: pb */
    ProgressBar f6835pb;
    private ProfileTabViewModel profileTabViewModel;
    @BindView(2131363322)

    /* renamed from: rv */
    RecyclerView f6836rv;
    private Schema schema;
    SimpleAdapter simpleAdapter;
    SimpleViewModel simpleViewModel;
    int type = 0;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fr_smart_nav;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static SmartNavFragment start(int i) {
        SmartNavFragment smartNavFragment = new SmartNavFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_position", i);
        smartNavFragment.setArguments(bundle);
        return smartNavFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6836rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6835pb = (ProgressBar) inflate.findViewById(R.id.pb);
        return inflate;
    }

    private void showToolbarTitle() {
        getBaseActivity().showImageLogo();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        showToolbarTitle();
    }

    /* access modifiers changed from: protected */
    public void showImageToolbar() {
        showToolbarTitle();
    }

    /* access modifiers changed from: private */
    public void onGetSchema(Schemas schemas) {
        this.f6835pb.setVisibility(8);
        int i = getArguments().getInt("arg_position");
        if (i == 2) {
            this.simpleAdapter.setData(schemas.getGuard());
        } else if (i == 3) {
            this.simpleAdapter.setData(schemas.getServices());
        } else if (i == 6) {
            this.simpleAdapter.setData(schemas.getHotkeys());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeAction(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAction()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r1) {
                case -1349088399: goto L_0x0044;
                case -447181342: goto L_0x003a;
                case -233842216: goto L_0x0030;
                case 117588: goto L_0x0026;
                case 3045982: goto L_0x001c;
                case 96634189: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "empty"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 3
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 0
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "dialogue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 5
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "call_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "custom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 4
            goto L_0x004f
        L_0x004e:
            r0 = -1
        L_0x004f:
            if (r0 == 0) goto L_0x00ce
            if (r0 == r7) goto L_0x00c6
            if (r0 == r6) goto L_0x00be
            if (r0 == r5) goto L_0x00ae
            if (r0 == r4) goto L_0x0064
            if (r0 == r3) goto L_0x005d
            goto L_0x00d9
        L_0x005d:
            r8.schema = r9
            r8.showDynamicDialog()
            goto L_0x00d9
        L_0x0064:
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r0 = r8.simpleViewModel
            androidx.lifecycle.MutableLiveData r0 = r0.getCurrentSchema()
            r0.setValue(r9)
            java.lang.String r0 = r9.getActionValue()
            java.lang.String r1 = "rent_"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r9.getActionValue()
            java.lang.String r1 = "rent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            r8.doCustomWork(r9)
            goto L_0x00d9
        L_0x008a:
            ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys.getInstance()
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.m11of((androidx.fragment.app.Fragment) r8, (androidx.lifecycle.ViewModelProvider.Factory) r0)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel) r0
            r8.profileTabViewModel = r0
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = r8.profileTabViewModel
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r0.getRentInfoByName()
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.-$$Lambda$SmartNavFragment$UUZVDcfpO6AHiV8JdaREmVgR8a4 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.navigation.-$$Lambda$SmartNavFragment$UUZVDcfpO6AHiV8JdaREmVgR8a4
            r1.<init>()
            r0.observe(r8, r1)
            r8.doCustomRentWork(r9)
            goto L_0x00d9
        L_0x00ae:
            java.lang.String r0 = r9.getActionValue()
            java.lang.String r1 = r9.getDescription()
            ru.unicorn.ujin.view.activity.navigation.ui.empty.EmptyFragment r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty.EmptyFragment.start(r0, r1)
            r8.nextFragment(r0, r2)
            goto L_0x00d9
        L_0x00be:
            java.lang.String r0 = r9.getActionValue()
            r8.callMethod(r0)
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r0 = r9.getActionValue()
            r8.callTo(r0)
            goto L_0x00d9
        L_0x00ce:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.getBaseActivity()
            java.lang.String r1 = r9.getActionValue()
            r0.showUrl(r1)
        L_0x00d9:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r0 = r9.getSchemaCallback()
            if (r0 == 0) goto L_0x00f8
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r0 = r9.getSchemaCallback()
            java.lang.String r0 = r0.getUrl()
            boolean r0 = org.apache.commons.lang3.StringUtils.isNotEmpty(r0)
            if (r0 == 0) goto L_0x00f8
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r9 = r9.getSchemaCallback()
            java.lang.String r9 = r9.getUrl()
            r8.callMethodNoHandling(r9)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment.makeAction(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema):void");
    }

    /* access modifiers changed from: private */
    public void checkUpdate(Schema schema2) {
        if (availableByScheme(schema2)) {
            makeAction(schema2);
        } else {
            showNotAvailableDialog();
        }
    }

    private void showNotAvailableDialog() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((CharSequence) "Действие пока не доступно, следите за обновлениями приложения!").setPositiveButton((CharSequence) "Перейти в Play Market", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                SmartNavFragment.this.lambda$showNotAvailableDialog$0$SmartNavFragment(dialogInterface, i);
            }
        }).setNegativeButton((CharSequence) "Отмена", (DialogInterface.OnClickListener) $$Lambda$SmartNavFragment$QFz9akgpJGTxjIGVvfR4x9tpXsc.INSTANCE).show();
    }

    public /* synthetic */ void lambda$showNotAvailableDialog$0$SmartNavFragment(DialogInterface dialogInterface, int i) {
        String packageName = getBaseActivity().getPackageName();
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    private boolean availableByScheme(Schema schema2) {
        try {
            PackageInfo packageInfo = getBaseActivity().getPackageManager().getPackageInfo(getBaseActivity().getPackageName(), 0);
            if (schema2.getMinVersion() == null) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 28 && schema2.getMinVersion().getAndroid().longValue() <= packageInfo.getLongVersionCode()) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (schema2.getMinVersion().getAndroid().longValue() <= ((long) packageInfo.versionCode)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public void snowChoosenTypeFragment(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter((BaseFragment) this, rentType);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeAction(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons r6, android.content.DialogInterface r7) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            int r1 = r0.hashCode()
            r2 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002e
            r2 = -447181342(0xffffffffe5588de2, float:-6.3915527E22)
            if (r1 == r2) goto L_0x0024
            r2 = 3045982(0x2e7a5e, float:4.26833E-39)
            if (r1 == r2) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r1 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "call_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "cancel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 2
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            if (r0 == r4) goto L_0x0044
            if (r0 == r3) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            r7.dismiss()
            goto L_0x0053
        L_0x0044:
            java.lang.String r6 = r6.getActionValue()
            r5.callMethod(r6)
            goto L_0x0053
        L_0x004c:
            java.lang.String r6 = r6.getActionValue()
            r5.callTo(r6)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment.makeAction(ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons, android.content.DialogInterface):void");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
        this.simpleViewModel.getSchema();
        this.simpleViewModel.getSchemasMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                SmartNavFragment.this.onGetSchema((Schemas) obj);
            }
        });
        getBaseActivity().profileViewModel.loadSplashscreen();
    }

    private void callMethod(String str) {
        this.simpleViewModel.sendDynamicRequest(str);
        this.simpleViewModel.getSendDynamiceRequest().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                SmartNavFragment.this.handleAction((Resource) obj);
            }
        });
    }

    private void callMethodNoHandling(String str) {
        this.simpleViewModel.sendDynamicRequest(str);
        this.simpleViewModel.getSendDynamiceRequest().removeObservers(this);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initAdapter();
    }

    private void initAdapter() {
        this.simpleAdapter = new SimpleAdapter();
        this.simpleAdapter.simpleClicks().subscribe(new Consumer() {
            public final void accept(Object obj) {
                SmartNavFragment.this.checkUpdate((Schema) obj);
            }
        });
        int i = getArguments().getInt("arg_position");
        if (i == 2 || i == 3) {
            this.simpleAdapter.setType(0);
            this.f6836rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        } else if (i == 6) {
            this.simpleAdapter.setType(2);
            this.f6836rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        }
        this.f6836rv.setAdapter(this.simpleAdapter);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doCustomWork(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getActionValue()
            int r1 = r0.hashCode()
            r2 = 14
            r3 = 1
            r4 = 5
            r5 = 0
            switch(r1) {
                case -1878592593: goto L_0x0116;
                case -1792347296: goto L_0x010b;
                case -1753754088: goto L_0x0100;
                case -1474995297: goto L_0x00f5;
                case -1322977561: goto L_0x00ea;
                case -880874965: goto L_0x00df;
                case -793201736: goto L_0x00d4;
                case -324146763: goto L_0x00c9;
                case -259085917: goto L_0x00bf;
                case 97672: goto L_0x00b3;
                case 110351: goto L_0x00a8;
                case 3046160: goto L_0x009d;
                case 3304406: goto L_0x0092;
                case 3377875: goto L_0x0086;
                case 98127112: goto L_0x007a;
                case 112202875: goto L_0x006f;
                case 210242464: goto L_0x0064;
                case 563217739: goto L_0x0058;
                case 957830652: goto L_0x004c;
                case 1142272250: goto L_0x0040;
                case 1317991015: goto L_0x0035;
                case 1329092700: goto L_0x0029;
                case 1508948676: goto L_0x001d;
                case 1837962808: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0121
        L_0x0012:
            java.lang.String r1 = "domofon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 5
            goto L_0x0122
        L_0x001d:
            java.lang.String r1 = "my_pass"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 18
            goto L_0x0122
        L_0x0029:
            java.lang.String r1 = "storeroom_rent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 21
            goto L_0x0122
        L_0x0035:
            java.lang.String r1 = "provider_service"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 0
            goto L_0x0122
        L_0x0040:
            java.lang.String r1 = "domofon2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 13
            goto L_0x0122
        L_0x004c:
            java.lang.String r1 = "counter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 8
            goto L_0x0122
        L_0x0058:
            java.lang.String r1 = "qr_code"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 23
            goto L_0x0122
        L_0x0064:
            java.lang.String r1 = "gorserv"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 3
            goto L_0x0122
        L_0x006f:
            java.lang.String r1 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 4
            goto L_0x0122
        L_0x007a:
            java.lang.String r1 = "gates"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 12
            goto L_0x0122
        L_0x0086:
            java.lang.String r1 = "news"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 16
            goto L_0x0122
        L_0x0092:
            java.lang.String r1 = "kvit"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 7
            goto L_0x0122
        L_0x009d:
            java.lang.String r1 = "card"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 6
            goto L_0x0122
        L_0x00a8:
            java.lang.String r1 = "oss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 1
            goto L_0x0122
        L_0x00b3:
            java.lang.String r1 = "bms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 9
            goto L_0x0122
        L_0x00bf:
            java.lang.String r1 = "dynamicForm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 2
            goto L_0x0122
        L_0x00c9:
            java.lang.String r1 = "domru_product"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 17
            goto L_0x0122
        L_0x00d4:
            java.lang.String r1 = "parking"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 15
            goto L_0x0122
        L_0x00df:
            java.lang.String r1 = "tashir"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 14
            goto L_0x0122
        L_0x00ea:
            java.lang.String r1 = "tickets"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 10
            goto L_0x0122
        L_0x00f5:
            java.lang.String r1 = "appointment"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 19
            goto L_0x0122
        L_0x0100:
            java.lang.String r1 = "guest_pass"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 22
            goto L_0x0122
        L_0x010b:
            java.lang.String r1 = "parking_rent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 20
            goto L_0x0122
        L_0x0116:
            java.lang.String r1 = "create_ticket"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0121
            r0 = 11
            goto L_0x0122
        L_0x0121:
            r0 = -1
        L_0x0122:
            java.lang.String r1 = "fragmentDynamic"
            switch(r0) {
                case 0: goto L_0x028c;
                case 1: goto L_0x027e;
                case 2: goto L_0x0274;
                case 3: goto L_0x026a;
                case 4: goto L_0x0262;
                case 5: goto L_0x0256;
                case 6: goto L_0x024e;
                case 7: goto L_0x0246;
                case 8: goto L_0x023d;
                case 9: goto L_0x0213;
                case 10: goto L_0x0207;
                case 11: goto L_0x01f7;
                case 12: goto L_0x01d4;
                case 13: goto L_0x01ca;
                case 14: goto L_0x01c0;
                case 15: goto L_0x01b6;
                case 16: goto L_0x01ac;
                case 17: goto L_0x018d;
                case 18: goto L_0x016f;
                case 19: goto L_0x0163;
                case 20: goto L_0x0154;
                case 21: goto L_0x0148;
                case 22: goto L_0x013c;
                case 23: goto L_0x0129;
                default: goto L_0x0127;
            }
        L_0x0127:
            goto L_0x02a5
        L_0x0129:
            java.lang.String r0 = r7.getDescription()
            java.lang.String r7 = r7.getUrl()
            ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment r7 = p035ru.unicorn.ujin.view.fragments.qrReader.QrReaderFragment.newInstance(r0, r7)
            java.lang.String r0 = "qrReader"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x013c:
            ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassListFragment r7 = new ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassListFragment
            r7.<init>()
            java.lang.String r0 = "fragmentAnotherPassList"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x0148:
            ru.unicorn.ujin.view.fragments.profile.RentObjectFragment r7 = new ru.unicorn.ujin.view.fragments.profile.RentObjectFragment
            r7.<init>()
            java.lang.String r0 = "fragmentRentObject"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x0154:
            java.lang.String r7 = r7.getTitle()
            ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment r7 = p035ru.unicorn.ujin.view.fragments.parking.fragments.ParkingMySlotsFragment.newInstance(r5, r7)
            java.lang.String r0 = "fragmentParkingRent"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x0163:
            ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment r7 = new ru.unicorn.ujin.view.fragments.makearecord.RecordsViewPagerFragment
            r7.<init>()
            java.lang.String r0 = "all_records_tag"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x016f:
            ru.unicorn.ujin.view.activity.BaseActivity r7 = r6.getBaseActivity()
            ru.unicorn.ujin.enums.Flavor r7 = r7.flavor
            ru.unicorn.ujin.enums.Flavor r0 = p035ru.unicorn.ujin.enums.Flavor.OSNOVA
            if (r7 != r0) goto L_0x0183
            ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment r7 = new ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x0183:
            ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x018d:
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r7 = r6.simpleViewModel
            androidx.lifecycle.MutableLiveData r7 = r7.getCurrentSchema()
            java.lang.Object r7 = r7.getValue()
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r7 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema) r7
            if (r7 == 0) goto L_0x02a5
            java.lang.String r0 = r7.getDomRuId()
            java.lang.String r7 = r7.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListFragment r7 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceListFragment.start(r0, r7)
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01ac:
            ru.unicorn.ujin.view.fragments.news.NewsListFragment r7 = new ru.unicorn.ujin.view.fragments.news.NewsListFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01b6:
            ru.unicorn.ujin.view.fragments.rozmarin.ParkingFragment r7 = new ru.unicorn.ujin.view.fragments.rozmarin.ParkingFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01c0:
            ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment r7 = new ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01ca:
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01d4:
            ru.unicorn.ujin.enums.Flavor r0 = p035ru.unicorn.ujin.enums.Flavor.current()
            boolean r0 = r0.isWithVideoPreview()
            if (r0 == 0) goto L_0x01e8
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01e8:
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$Companion r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesFragment.Companion
            java.lang.String r7 = r7.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment r7 = r0.start(r7)
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x01f7:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ApplicationListFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ApplicationListFragment
            r7.<init>()
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.BaseHelpDeskFragment r7 = r7.start(r3)
            java.lang.String r0 = p035ru.unicorn.ujin.view.fragments.FR_TAGS.TAG_TICKETS
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x0207:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment
            r7.<init>()
            java.lang.String r0 = p035ru.unicorn.ujin.view.fragments.FR_TAGS.TAG_TICKETS
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x0213:
            ru.unicorn.ujin.view.activity.BaseActivity r7 = r6.getBaseActivity()
            ru.unicorn.ujin.enums.Flavor r7 = r7.flavor
            java.lang.String r7 = r7.getAppName()
            ru.unicorn.ujin.enums.Flavor r0 = p035ru.unicorn.ujin.enums.Flavor.ORDYNKA
            java.lang.String r0 = r0.getAppName()
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0234
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r7 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment r7 = p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment.newInstance(r2, r7)
            r6.nextFragment(r7, r5, r1)
            goto L_0x02a5
        L_0x0234:
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x023d:
            ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment r7 = new ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment
            r7.<init>()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x0246:
            ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment r7 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketsFragment.start()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x024e:
            ru.unicorn.ujin.view.activity.navigation.ui.card.CardListFragment r7 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardListFragment.start()
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x0256:
            java.lang.String r7 = r7.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonFragment r7 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon.DomofonFragment.start(r7)
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x0262:
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoPreviewFragment r7 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoPreviewFragment.start(r5)
            r6.nextFragment(r7, r5)
            goto L_0x02a5
        L_0x026a:
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r7 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment r7 = p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment.newInstance(r4, r7)
            r6.nextFragment(r7, r5, r1)
            goto L_0x02a5
        L_0x0274:
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r7 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK
            ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment r7 = p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment.newInstance(r4, r7)
            r6.nextFragment(r7, r5, r1)
            goto L_0x02a5
        L_0x027e:
            java.lang.String r7 = r7.getTitle()
            ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment r7 = p035ru.unicorn.ujin.view.fragments.oss.fragments.OssListFragment.newInstance(r7)
            java.lang.String r0 = "fragmentOssList"
            r6.nextFragment(r7, r5, r0)
            goto L_0x02a5
        L_0x028c:
            java.lang.String r0 = r7.getTitle()
            java.lang.String r1 = r7.getProvider()
            java.lang.String r2 = r7.getProductState()
            java.lang.Integer r7 = r7.getServiceId()
            ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment r7 = p035ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment.newInstance(r0, r1, r2, r7)
            java.lang.String r0 = "fragmentProviderService"
            r6.nextFragment(r7, r5, r0)
        L_0x02a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment.doCustomWork(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema):void");
    }

    private void doCustomRentWork(Schema schema2) {
        String title = schema2.getTitle();
        String actionValue = schema2.getActionValue();
        if (!getString(R.string.title_news).equals(title)) {
            if (schema2.getActionValue().equals(SchemaRouter.TEAM)) {
                nextFragment(new MyRentaCompanyFragment(), false);
            } else if (getString(R.string.title_arenda).equals(title)) {
                nextFragment(MyRentaFragment.start(1), false);
            } else if (actionValue.toLowerCase().contains("rent_tickets")) {
                nextFragment(TicketListFragment.start("property_type", schema2.getSectionId(), schema2.getSectionTitle(), schema2.getTitle()), false);
            } else if (actionValue.toLowerCase().contains("rent_event_services")) {
                nextFragment(new FakeFragment(), false);
            } else if (actionValue.toLowerCase().contains("rent_")) {
                this.profileTabViewModel.getTypeByName(actionValue.toLowerCase().replace("rent_", ""));
            } else if (actionValue.equals("rent")) {
                nextFragment(MyRentaFragment.start(1), false);
            }
        }
    }

    private void showDynamicDialog() {
        Schema schema2 = this.schema;
        if (schema2 != null && schema2.getAction().equals("dialogue") && this.schema.getDialogButtons() != null && !this.schema.getDialogButtons().isEmpty()) {
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), this.schema.getAlertMessage());
            for (int i = 0; i < this.schema.getDialogButtons().size(); i++) {
                DialogButtons dialogButtons = this.schema.getDialogButtons().get(i);
                if (dialogButtons.getActionValue() != null) {
                    createDialogBuilder.setPositiveButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SmartNavFragment.this.lambda$showDynamicDialog$2$SmartNavFragment(this.f$1, dialogInterface, i);
                        }
                    });
                } else if (dialogButtons.getAction().equals("cancel")) {
                    createDialogBuilder.setNegativeButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SmartNavFragment.this.lambda$showDynamicDialog$3$SmartNavFragment(this.f$1, dialogInterface, i);
                        }
                    });
                } else {
                    createDialogBuilder.setNeutralButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SmartNavFragment.this.lambda$showDynamicDialog$4$SmartNavFragment(this.f$1, dialogInterface, i);
                        }
                    });
                }
            }
            createDialogBuilder.create().show();
        }
    }

    public /* synthetic */ void lambda$showDynamicDialog$2$SmartNavFragment(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    public /* synthetic */ void lambda$showDynamicDialog$3$SmartNavFragment(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    public /* synthetic */ void lambda$showDynamicDialog$4$SmartNavFragment(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    private void callTo(String str) {
        getActivity().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavFragment$1 */
    static /* synthetic */ class C58991 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment.C58991.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void handleAction(Resource<Void> resource) {
        if (resource != null) {
            int i = C58991.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6835pb.setVisibility(0);
            } else if (i == 2) {
                this.f6835pb.setVisibility(8);
                DialogHelper.showDialogWithTimeout(getActivity(), resource.getMessage().isEmpty() ? getString(R.string.smartNavDynamicRequestSent) : resource.getMessage());
            } else if (i == 3) {
                this.f6835pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void showNotifications(Resource<NotificationListResponse> resource) {
        int i;
        if (resource != null && (i = C58991.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()]) != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.notificationsCount = 0;
                    showBellIcon();
                }
            } else if (resource.getData() == null || resource.getData().getNotifications() == null || resource.getData().getNotifications().isEmpty()) {
                this.notificationsCount = 0;
                showBellIcon();
            } else {
                this.notificationsCount = Integer.valueOf(resource.getData().getNotifications().size());
                showBellIcon();
            }
        }
    }

    private void showBellIcon() {
        if (this.notificationsCount != null) {
            ArrayList arrayList = new ArrayList();
            ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getContext()).inflate(R.layout.toolbar_bell_notifications, getBaseActivity().llButtonsRight, false);
            TextView textView = (TextView) constraintLayout.getViewById(R.id.tvCount);
            if (this.notificationsCount.intValue() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.notificationsCount.toString());
            }
            constraintLayout.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    SmartNavFragment.this.lambda$showBellIcon$5$SmartNavFragment(view);
                }
            });
            arrayList.add(constraintLayout);
            getBaseActivity().setToolbarRight(arrayList);
        }
    }

    public /* synthetic */ void lambda$showBellIcon$5$SmartNavFragment(View view) {
        nextFragment(new NotificationListFragment(), false);
    }
}
