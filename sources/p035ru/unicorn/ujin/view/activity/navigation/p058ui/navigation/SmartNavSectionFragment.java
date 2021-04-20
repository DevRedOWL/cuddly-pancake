package p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavSectionFragment */
public class SmartNavSectionFragment extends BaseSectionFragment<SimpleViewModel> {
    public static final String ARG_POSITION = "arg_position";
    public static final int CABINET = 7;
    public static final int CHAT = 5;
    public static final int HOTKEYS = 6;
    public static final int PARTNER = 4;
    public static final int SECURITY = 2;
    public static final int USLUGI = 3;
    private SmartNavSection smartNavSection;

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return null;
    }

    public void onViewCreated(SimpleViewModel simpleViewModel) {
    }

    public static SmartNavSectionFragment start(int i) {
        SmartNavSectionFragment smartNavSectionFragment = new SmartNavSectionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_position", i);
        smartNavSectionFragment.setArguments(bundle);
        return smartNavSectionFragment;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getViewModell().getSchemasMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                SmartNavSectionFragment.this.onGetSchema((Schemas) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onGetSchema(Schemas schemas) {
        this.f6913pb.setVisibility(8);
        int i = getArguments().getInt("arg_position");
        if (i == 2) {
            this.smartNavSection.setData(schemas.getGuard());
        } else if (i == 3) {
            this.smartNavSection.setData(schemas.getServices());
        } else if (i == 6) {
            this.smartNavSection.setData(schemas.getHotkeys());
        } else if (i == 7) {
            this.smartNavSection.setData(schemas.getCabinet());
        }
    }

    private void callMethod(String str) {
        getViewModell().sendDynamicRequest(str);
        getViewModell().getSendDynamiceRequest().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                SmartNavSectionFragment.this.handleAction((Resource) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6800rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6800rv.setAdapter(this.sectionedAdapter);
        initSections();
        int i = getArguments().getInt("arg_position");
        if (i == 2 || i == 3) {
            this.smartNavSection.setType(0);
            this.f6800rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        } else if (i == 6) {
            this.smartNavSection.setType(2);
            this.f6800rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        }
        this.f6800rv.setAdapter(this.sectionedAdapter);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.smartNavSection == null) {
            this.smartNavSection = new SmartNavSection();
        }
        this.sectionedAdapter.addSection(this.smartNavSection);
    }

    public SimpleViewModel getViewModell() {
        return (SimpleViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.navigation.SmartNavSectionFragment$1 */
    static /* synthetic */ class C59001 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavSectionFragment.C59001.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void handleAction(Resource<Void> resource) {
        if (resource != null) {
            int i = C59001.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2 || i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }
}
