package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.IntercomVal;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment;
import p035ru.unicorn.ujin.view.customViews.MjpegView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonFragment */
public class DomofonFragment extends BaseFragment implements MjpegView.OnStartStream {
    private static String KEY_TITLE = "title";
    private AppBarLayout appBarLayout;
    Button btnOpenDoor;
    private Button btnRepeat;
    /* access modifiers changed from: private */
    public IntercomVal currentData;
    private LinearLayout error;
    private String openUrl = null;

    /* renamed from: pb */
    ProgressBar f6764pb;
    private SimpleViewModel simpleViewModel;
    private MjpegView surfaceView;
    private TabLayout tabLayout;
    private String title;
    private TextView tvError;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_domofon;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setTextTitle(this.title);
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public static DomofonFragment start(String str) {
        DomofonFragment domofonFragment = new DomofonFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TITLE, str);
        domofonFragment.setArguments(bundle);
        return domofonFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        this.title = getArguments().getString(KEY_TITLE);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.btnOpenDoor = (Button) inflate.findViewById(R.id.btn_open_door);
        this.btnOpenDoor.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DomofonFragment.this.lambda$onCreateView$0$DomofonFragment(view);
            }
        });
        this.surfaceView = (MjpegView) inflate.findViewById(R.id.video);
        this.error = (LinearLayout) inflate.findViewById(R.id.ll_error);
        this.f6764pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        this.tvError = (TextView) inflate.findViewById(R.id.tvError);
        this.btnRepeat = (Button) inflate.findViewById(R.id.repeat);
        this.appBarLayout = (AppBarLayout) inflate.findViewById(R.id.appbar);
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$DomofonFragment(View view) {
        openDoor();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initMjpeg();
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m10of((Fragment) this).get(SimpleViewModel.class);
        this.simpleViewModel.getTabPosition().setValue(0);
        this.simpleViewModel.getDomofonVideo();
        this.surfaceView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DomofonFragment.this.lambda$onViewCreated$1$DomofonFragment(view);
            }
        });
        this.error.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DomofonFragment.this.lambda$onViewCreated$2$DomofonFragment(view);
            }
        });
        this.tvError.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DomofonFragment.this.lambda$onViewCreated$3$DomofonFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$1$DomofonFragment(View view) {
        showFullVideo();
    }

    public /* synthetic */ void lambda$onViewCreated$2$DomofonFragment(View view) {
        showFullVideo();
    }

    public /* synthetic */ void lambda$onViewCreated$3$DomofonFragment(View view) {
        showFullVideo();
    }

    private void showFullVideo() {
        if (this.currentData != null) {
            boolean z = true;
            if (!this.currentData.getArchiveAvailable().booleanValue() || this.currentData.getIdCamera() != null) {
                z = false;
            }
            nextFragment(VideoFragment.start(true, Boolean.valueOf(z), this.currentData.getName(), this.currentData.getIdCamera(), this.currentData.getOpenUrl(), this.currentData.getMjpegNew(), this.currentData.isButtonNeedHide(), ""), false);
        }
    }

    private void initMjpeg() {
        this.surfaceView.setMode(1);
        this.surfaceView.setAdjustHeight(true);
        this.surfaceView.setOnStartStream(this);
    }

    private void openDoor() {
        Log.d("TAG", "XXX BTN");
        if (getBaseActivity().profileViewModel.getUser().getDemo() == 1) {
            showMessage((int) R.string.demo_functionality_not_available);
        } else if (this.openUrl != null) {
            Log.d("TAG", "XXX BTN " + this.openUrl);
            this.simpleViewModel.sendDynamicRequest(this.openUrl.split("api/")[1]);
            this.simpleViewModel.getSendDynamiceRequest().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    DomofonFragment.this.onOpenDoorHandler((Resource) obj);
                }
            });
        }
    }

    public void onResume() {
        super.onResume();
        this.simpleViewModel.getIntercomSingleLiveEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomofonFragment.this.showVideo((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonFragment$2 */
    static /* synthetic */ class C58152 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon.DomofonFragment.C58152.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showVideo(Resource<Intercom> resource) {
        if (resource != null) {
            int i = C58152.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6764pb.setVisibility(0);
            } else if (i == 2) {
                this.f6764pb.setVisibility(8);
                if (resource.getData() == null || resource.getData().getIntercom() == null || resource.getData().getIntercom().isEmpty()) {
                    showError(getResources().getString(R.string.noDomophonesMessage), false);
                    this.appBarLayout.setVisibility(8);
                    return;
                }
                this.appBarLayout.setVisibility(0);
                initTabs(resource.getData().getIntercom());
            } else if (i == 3) {
                this.f6764pb.setVisibility(8);
                showMessage((int) R.string.internalError);
            }
        }
    }

    private void initTabs(final List<IntercomVal> list) {
        this.tabLayout.removeAllTabs();
        for (IntercomVal name : list) {
            TabLayout tabLayout2 = this.tabLayout;
            tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) name.getName()));
        }
        if (this.simpleViewModel.getTabPosition().getValue() != null) {
            this.currentData = list.get(this.simpleViewModel.getTabPosition().getValue().intValue());
        }
        showVideo(this.simpleViewModel.getTabPosition().getValue().intValue(), list);
        showButton(this.simpleViewModel.getTabPosition().getValue().intValue(), list);
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                IntercomVal unused = DomofonFragment.this.currentData = (IntercomVal) list.get(position);
                DomofonFragment.this.showVideo(position, list);
                DomofonFragment.this.showButton(position, list);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showButton(int i, List<IntercomVal> list) {
        String buttonCaption = list.get(i).getButtonCaption();
        if (buttonCaption == null || buttonCaption.isEmpty()) {
            this.btnOpenDoor.setText(getResources().getString(R.string.label_open));
        } else {
            this.btnOpenDoor.setText(buttonCaption);
        }
    }

    /* access modifiers changed from: private */
    public void showVideo(int i, List<IntercomVal> list) {
        this.btnOpenDoor.setVisibility(0);
        this.surfaceView.setVisibility(0);
        this.error.setVisibility(4);
        this.f6764pb.setVisibility(0);
        this.surfaceView.stopStream();
        this.surfaceView.setBitmap((Bitmap) null);
        this.openUrl = list.get(i).getOpenUrl();
        this.surfaceView.setUrl(list.get(i).getMjpegNew());
        this.surfaceView.startStream();
    }

    /* access modifiers changed from: private */
    public void onOpenDoorHandler(Resource<Void> resource) {
        if (resource != null) {
            int i = C58152.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6764pb.setVisibility(0);
            } else if (i == 2) {
                this.f6764pb.setVisibility(8);
            } else if (i == 3) {
                this.f6764pb.setVisibility(8);
                DialogHelper.showDialogWithTimeout(getActivity(), resource.getMessage());
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.simpleViewModel.getTabPosition().setValue(Integer.valueOf(this.tabLayout.getSelectedTabPosition()));
        if (this.surfaceView.getVisibility() == 0) {
            this.surfaceView.stopStream();
        }
    }

    public void onStreamStarted(boolean z) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable(z) {
                private final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DomofonFragment.this.lambda$onStreamStarted$4$DomofonFragment(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onStreamStarted$4$DomofonFragment(boolean z) {
        int i = 4;
        this.f6764pb.setVisibility(z ? 0 : 4);
        MjpegView mjpegView = this.surfaceView;
        if (!z) {
            i = 0;
        }
        mjpegView.setVisibility(i);
        this.btnOpenDoor.setVisibility(0);
    }

    public void onStreamNotStarting() {
        this.surfaceView.stopStream();
        showError((String) null, true);
    }

    private void showError(String str, Boolean bool) {
        this.appBarLayout.setVisibility(0);
        this.btnOpenDoor.setVisibility(0);
        this.surfaceView.setVisibility(4);
        if (StringUtils.isNotEmpty(str)) {
            this.tvError.setText(str);
        }
        this.error.setVisibility(0);
        if (bool.booleanValue()) {
            this.btnRepeat.setVisibility(0);
            this.btnRepeat.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    DomofonFragment.this.lambda$showError$5$DomofonFragment(view);
                }
            });
            return;
        }
        this.btnRepeat.setVisibility(8);
    }

    public /* synthetic */ void lambda$showError$5$DomofonFragment(View view) {
        this.f6764pb.setVisibility(0);
        this.error.setVisibility(4);
        this.surfaceView.startStream();
    }
}
