package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.ButtonSettings;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.FormFormat;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.FakeFragment */
public class FakeFragment extends BaseSectionFragment<SimpleViewModel> {
    Button button;
    private FakeSection fakeSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_fake_form;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "Услуга по организации мероприятия";
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.button = (Button) view.findViewById(R.id.button);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.fakeSection == null) {
            this.fakeSection = new FakeSection();
        }
        this.sectionedAdapter.addSection(this.fakeSection);
    }

    public SimpleViewModel getViewModell() {
        return (SimpleViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
    }

    public void onViewCreated(SimpleViewModel simpleViewModel) {
        simpleViewModel.getFormaSettings();
        simpleViewModel.getFormFormatData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                FakeFragment.this.showForm((Resource) obj);
            }
        });
        simpleViewModel.getSendDynamiceRequest().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                FakeFragment.this.showResult((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.FakeFragment$1 */
    static /* synthetic */ class C59301 {
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
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.FakeFragment.C59301.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showResult(Resource<Void> resource) {
        int i = C59301.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
        if (i == 1 || i == 2) {
            this.f6913pb.setVisibility(4);
            DialogHelper.showDialog((Context) getActivity(), "Спасибо, ваша заявка принята. Ожидайте звонка.");
        } else if (i == 3) {
            this.f6913pb.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void showForm(Resource<FormFormat> resource) {
        int i = C59301.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
        if (i == 1) {
            this.f6913pb.setVisibility(4);
            FormFormat data = resource.getData();
            ButtonSettings buttonSettings = data.getButtonSettings();
            this.button.setText(buttonSettings.getName());
            this.button.setOnClickListener(new View.OnClickListener(buttonSettings) {
                private final /* synthetic */ ButtonSettings f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    FakeFragment.this.lambda$showForm$0$FakeFragment(this.f$1, view);
                }
            });
            this.fakeSection.setData(new SomeString(data.getBody()));
        } else if (i == 2) {
            this.f6913pb.setVisibility(4);
        } else if (i == 3) {
            this.f6913pb.setVisibility(0);
        }
    }

    public /* synthetic */ void lambda$showForm$0$FakeFragment(ButtonSettings buttonSettings, View view) {
        getViewModell().sendDynamicRequest(buttonSettings.getActionValue().split("api/")[1]);
    }
}
