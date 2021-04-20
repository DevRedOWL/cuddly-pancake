package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.google.android.material.tabs.TabLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.MjpegVideoActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.HuliView;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment;
import p035ru.unicorn.ujin.view.customViews.MjpegView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoFragment */
public class VideoFragment extends BaseFragment implements OnUrlClick, MjpegView.OnStartStream, HuliView.OnChangeDataListener {
    private static final int ARCHIVE = 1;
    private static final String ARG_ARCHIVE = "arg_archive";
    private static final String ARG_ID = "arg_id";
    private static final String ARG_MJPEG = "arg_mjpeg";
    private static final String ARG_MODE = "arg_mode";
    private static final String ARG_NAME = "arg_name";
    private static final String ARG_NEW_URL_FOR_ARCHIVE_REQUEST = "ARG_NEW_URL_FOR_ARCHIVE_REQUEST";
    private static final String ARG_OPEN_DOOR_VISIBILITY = "ARG_OPEN_DOOR_VISIBILITY";
    private static final String ARG_OPEN_URL = "arg_open_url";
    private static final int ONLINE = 0;
    /* access modifiers changed from: private */
    public Button btnExpand;
    /* access modifiers changed from: private */
    public String cameraID = "";
    /* access modifiers changed from: private */
    public ConstraintLayout clArchive;
    private int datePosition = -1;
    private List<Long> dates;
    /* access modifiers changed from: private */
    public LinearLayout error;
    private boolean hasArchive;
    /* access modifiers changed from: private */
    public HSV hsv;
    private Timer hsvTimer;
    boolean isButtonNeedHide;
    /* access modifiers changed from: private */

    /* renamed from: iv */
    public HuliView f6891iv;
    private ImageView left;
    String newUrlForArchiveRequest;
    /* access modifiers changed from: private */
    public Button open;
    String openUrl;
    /* access modifiers changed from: private */

    /* renamed from: pb */
    public ProgressBar f6892pb;
    /* access modifiers changed from: private */
    public ImageView play;
    private ImageView right;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
    private MjpegView surfaceView;
    private TabLayout tabLayout;
    private Timer timer;

    /* renamed from: tv */
    private TextView f6893tv;
    String urlRealTime = null;
    /* access modifiers changed from: private */
    public VideoViewModel videoViewModel;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_video;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static VideoFragment start(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, boolean z, String str5) {
        VideoFragment videoFragment = new VideoFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg_mode", bool.booleanValue());
        bundle.putBoolean(ARG_ARCHIVE, bool2.booleanValue());
        bundle.putString(ARG_NAME, str);
        bundle.putString("arg_id", str2);
        bundle.putString(ARG_OPEN_URL, str3);
        bundle.putString(ARG_MJPEG, str4);
        bundle.putBoolean(ARG_OPEN_DOOR_VISIBILITY, z);
        bundle.putString(ARG_NEW_URL_FOR_ARCHIVE_REQUEST, str5);
        videoFragment.setArguments(bundle);
        return videoFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.tabLayout = (TabLayout) inflate.findViewById(R.id.tab);
        this.surfaceView = (MjpegView) inflate.findViewById(R.id.video);
        this.f6892pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.hsv = (HSV) inflate.findViewById(R.id.hsv);
        this.f6893tv = (TextView) inflate.findViewById(R.id.tv);
        this.clArchive = (ConstraintLayout) inflate.findViewById(R.id.cl_archive);
        this.error = (LinearLayout) inflate.findViewById(R.id.ll_error);
        this.open = (Button) inflate.findViewById(R.id.open);
        this.open.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoFragment.this.lambda$onCreateView$0$VideoFragment(view);
            }
        });
        this.play = (ImageView) inflate.findViewById(R.id.play);
        this.right = (ImageView) inflate.findViewById(R.id.right);
        this.left = (ImageView) inflate.findViewById(R.id.left);
        this.right.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoFragment.this.lambda$onCreateView$1$VideoFragment(view);
            }
        });
        this.left.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoFragment.this.lambda$onCreateView$2$VideoFragment(view);
            }
        });
        this.btnExpand = (Button) inflate.findViewById(R.id.btnExpand);
        this.btnExpand.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoFragment.this.lambda$onCreateView$3$VideoFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$VideoFragment(View view) {
        openDoor();
    }

    public /* synthetic */ void lambda$onCreateView$1$VideoFragment(View view) {
        day(-1);
    }

    public /* synthetic */ void lambda$onCreateView$2$VideoFragment(View view) {
        day(1);
    }

    public /* synthetic */ void lambda$onCreateView$3$VideoFragment(View view) {
        expandView();
    }

    private void expandView() {
        getBaseActivity().startActivity(MjpegVideoActivity.start(getBaseActivity(), this.urlRealTime, getArguments().getString(ARG_NAME), VideoDataSaver.VideoDataType.FROM_VIDEO_PREVIEW));
    }

    private void day(int i) {
        Integer value = this.videoViewModel.getActivePosition().getValue();
        if (value != null) {
            this.videoViewModel.getActivePosition().setValue(Integer.valueOf(value.intValue() + i));
        }
    }

    private void openDoor() {
        String string = getArguments().getString(ARG_OPEN_URL);
        if (string != null) {
            this.videoViewModel.sendDynamicRequest(string.split("api/")[1]);
            this.videoViewModel.getSendDynamiceRequest().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    VideoFragment.this.onOpenDoorHandler((Resource) obj);
                }
            });
        }
    }

    private void add() {
        if (this.f6891iv == null) {
            this.f6891iv = new HuliView(getActivity());
            this.f6891iv.setOnChangeDataListener(this);
        }
        if (this.datePosition == -1) {
            this.datePosition = this.dates.size() - 1;
            this.videoViewModel.getActivePosition().setValue(0);
        }
        if (this.hsv.getChildCount() <= 0) {
            this.hsv.addView(this.f6891iv);
            this.hsv.postDelayed(new Runnable() {
                public final void run() {
                    VideoFragment.this.lambda$add$4$VideoFragment();
                }
            }, 100);
        }
    }

    public /* synthetic */ void lambda$add$4$VideoFragment() {
        this.hsv.fullScroll(66);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x005e, code lost:
        r3 = r1.openUrl;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r2, @javax.annotation.Nullable android.os.Bundle r3) {
        /*
            r1 = this;
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.m10of((androidx.fragment.app.Fragment) r1)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoViewModel.class
            androidx.lifecycle.ViewModel r2 = r2.get(r3)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoViewModel) r2
            r1.videoViewModel = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "arg_open_url"
            java.lang.String r2 = r2.getString(r3)
            r1.openUrl = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "arg_id"
            java.lang.String r2 = r2.getString(r3)
            r1.cameraID = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "arg_archive"
            boolean r2 = r2.getBoolean(r3)
            r1.hasArchive = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "arg_mjpeg"
            java.lang.String r2 = r2.getString(r3)
            r1.urlRealTime = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "ARG_OPEN_DOOR_VISIBILITY"
            boolean r2 = r2.getBoolean(r3)
            r1.isButtonNeedHide = r2
            android.os.Bundle r2 = r1.getArguments()
            java.lang.String r3 = "ARG_NEW_URL_FOR_ARCHIVE_REQUEST"
            java.lang.String r2 = r2.getString(r3)
            r1.newUrlForArchiveRequest = r2
            android.widget.Button r2 = r1.open
            boolean r3 = r1.isButtonNeedHide
            r0 = 8
            if (r3 != 0) goto L_0x006a
            java.lang.String r3 = r1.openUrl
            if (r3 == 0) goto L_0x006a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x006a
            r3 = 0
            goto L_0x006c
        L_0x006a:
            r3 = 8
        L_0x006c:
            r2.setVisibility(r3)
            boolean r2 = r1.hasArchive
            if (r2 == 0) goto L_0x008c
            r1.initTab()
            com.google.android.material.tabs.TabLayout r2 = r1.tabLayout
            android.os.Bundle r3 = r1.getArguments()
            java.lang.String r0 = "arg_mode"
            boolean r3 = r3.getBoolean(r0)
            r3 = r3 ^ 1
            com.google.android.material.tabs.TabLayout$Tab r2 = r2.getTabAt(r3)
            r2.select()
            goto L_0x0094
        L_0x008c:
            com.google.android.material.tabs.TabLayout r2 = r1.tabLayout
            r2.setVisibility(r0)
            r1.initOnlineView()
        L_0x0094:
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = r1.videoViewModel
            androidx.lifecycle.MutableLiveData r2 = r2.getDatesMutableLiveData()
            androidx.lifecycle.LifecycleOwner r3 = r1.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$vRMyZiAitjOWN2msID_QNXLkrNc r0 = new ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$vRMyZiAitjOWN2msID_QNXLkrNc
            r0.<init>()
            r2.observe(r3, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = r1.videoViewModel
            androidx.lifecycle.MutableLiveData r2 = r2.getUrlMutableLiveData()
            androidx.lifecycle.LifecycleOwner r3 = r1.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$VGeqv7pnt9zyGJUeafYgSJxHQlk r0 = new ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$VGeqv7pnt9zyGJUeafYgSJxHQlk
            r0.<init>()
            r2.observe(r3, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = r1.videoViewModel
            androidx.lifecycle.MutableLiveData r2 = r2.getShowUrl()
            androidx.lifecycle.LifecycleOwner r3 = r1.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$qFuGBdDGbwx1YQj11Eh3D_w7qQc r0 = new ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$qFuGBdDGbwx1YQj11Eh3D_w7qQc
            r0.<init>()
            r2.observe(r3, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = r1.videoViewModel
            androidx.lifecycle.MutableLiveData r2 = r2.getEventsMutableLiveData()
            androidx.lifecycle.LifecycleOwner r3 = r1.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$xtXHO7PzqpDXipc0vzh_6W7fHvE r0 = new ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$xtXHO7PzqpDXipc0vzh_6W7fHvE
            r0.<init>()
            r2.observe(r3, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r2 = r1.videoViewModel
            androidx.lifecycle.MutableLiveData r2 = r2.getActivePosition()
            androidx.lifecycle.LifecycleOwner r3 = r1.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$gPGeVVwlHV0q4ArePzh4XQNb0tE r0 = new ru.unicorn.ujin.view.activity.navigation.ui.video.-$$Lambda$VideoFragment$gPGeVVwlHV0q4ArePzh4XQNb0tE
            r0.<init>()
            r2.observe(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public void showDate(Integer num) {
        stopVideo();
        this.error.setVisibility(4);
        this.f6892pb.setVisibility(4);
        this.play.setVisibility(0);
        Long l = this.dates.get(num.intValue());
        this.videoViewModel.getArchiveDateEvents(this.cameraID, String.valueOf(l), this.newUrlForArchiveRequest);
        this.f6891iv.setCurrentDate(l);
        this.f6893tv.setText(this.simpleDateFormat.format(new Date(l.longValue() * 1000)));
        if (this.dates.size() - 1 == num.intValue()) {
            this.left.setVisibility(4);
        } else if (num.intValue() == 0) {
            this.right.setVisibility(4);
        } else {
            this.left.setVisibility(0);
            this.right.setVisibility(0);
        }
    }

    private void initTab() {
        TabLayout tabLayout2 = this.tabLayout;
        tabLayout2.addTab(tabLayout2.newTab().setText((CharSequence) getString(R.string.label_online)));
        TabLayout tabLayout3 = this.tabLayout;
        tabLayout3.addTab(tabLayout3.newTab().setText((CharSequence) getString(R.string.label_record_archive)));
        this.tabLayout.getTabAt(0).select();
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TabLayout.OnTabSelectedListener() {
            public void onTabReselected(TabLayout.Tab tab) {
            }

            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                int i = 0;
                VideoFragment.this.clArchive.setVisibility(position == 0 ? 4 : 0);
                VideoFragment.this.open.setVisibility((VideoFragment.this.isButtonNeedHide || position != 0 || VideoFragment.this.openUrl == null || VideoFragment.this.openUrl.isEmpty()) ? 8 : 0);
                Button access$200 = VideoFragment.this.btnExpand;
                if (position != 0) {
                    i = 4;
                }
                access$200.setVisibility(i);
                VideoFragment.this.error.setVisibility(4);
                VideoFragment.this.stopVideo();
                if (position == 0) {
                    VideoFragment.this.play.setVisibility(4);
                    VideoFragment.this.videoViewModel.getShowUrl().setValue(VideoFragment.this.urlRealTime);
                } else if (position == 1) {
                    VideoFragment.this.videoViewModel.getAvailableVideoDate(VideoFragment.this.cameraID, VideoFragment.this.newUrlForArchiveRequest);
                    VideoFragment.this.hsv.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                        public final void onScrollChanged() {
                            VideoFragment.C59501.this.lambda$onTabSelected$0$VideoFragment$1();
                        }
                    });
                }
            }

            public /* synthetic */ void lambda$onTabSelected$0$VideoFragment$1() {
                if (!VideoFragment.this.f6891iv.getVideoIsStreaming() && VideoFragment.this.f6891iv.getMsCurrentDelta() == 0) {
                    VideoFragment.this.f6892pb.setVisibility(4);
                    VideoFragment.this.error.setVisibility(4);
                    VideoFragment.this.play.setVisibility(0);
                    int scrollX = VideoFragment.this.hsv.getScrollX();
                    if (VideoFragment.this.f6891iv != null) {
                        VideoFragment.this.f6891iv.setScroolX((long) scrollX);
                    }
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r3.openUrl;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initOnlineView() {
        /*
            r3 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.clArchive
            r1 = 4
            r0.setVisibility(r1)
            android.widget.Button r0 = r3.open
            boolean r2 = r3.isButtonNeedHide
            if (r2 != 0) goto L_0x0018
            java.lang.String r2 = r3.openUrl
            if (r2 == 0) goto L_0x0018
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0018
            r2 = 0
            goto L_0x001a
        L_0x0018:
            r2 = 8
        L_0x001a:
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r3.error
            r0.setVisibility(r1)
            r3.stopVideo()
            android.widget.ImageView r0 = r3.play
            r0.setVisibility(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoViewModel r0 = r3.videoViewModel
            androidx.lifecycle.MutableLiveData r0 = r0.getShowUrl()
            java.lang.String r1 = r3.urlRealTime
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment.initOnlineView():void");
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoFragment$4 */
    static /* synthetic */ class C59534 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment.C59534.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onGetDates(Resource<VideoDates> resource) {
        if (resource != null) {
            int i = C59534.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6892pb.setVisibility(0);
            } else if (i == 2) {
                this.f6892pb.setVisibility(8);
                this.dates = resource.getData().getDates();
                add();
                this.videoViewModel.getArchiveDateEvents(this.cameraID, String.valueOf(this.dates.get(0)), this.newUrlForArchiveRequest);
                this.f6891iv.setDates(resource.getData());
            } else if (i == 3) {
                this.f6892pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void onUrlClick(C5788Video video) {
        this.videoViewModel.getVideoPreview().removeObservers(this);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setTextTitle(getArguments().getString(ARG_NAME));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public void onPause() {
        super.onPause();
        stopVideo();
        this.play.setVisibility(0);
    }

    public void onResume() {
        super.onResume();
        if ((this.tabLayout.getTabCount() > 0 && this.tabLayout.getTabAt(0).isSelected()) || !this.hasArchive) {
            this.play.setVisibility(4);
            startVideo(getArguments().getString(ARG_MJPEG));
        }
    }

    /* access modifiers changed from: private */
    public void stopVideo() {
        MjpegView mjpegView = this.surfaceView;
        if (mjpegView != null && mjpegView.getVisibility() == 0) {
            this.surfaceView.stopStream();
            this.surfaceView.setOnStartStream((MjpegView.OnStartStream) null);
        }
        Timer timer2 = this.timer;
        if (timer2 != null && this.f6891iv != null) {
            timer2.cancel();
            this.timer = null;
            this.hsvTimer.cancel();
            this.hsvTimer = null;
            this.f6891iv.setVideoIsStreaming(false);
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
                    VideoFragment.this.lambda$onStreamStarted$5$VideoFragment(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onStreamStarted$5$VideoFragment(boolean z) {
        HuliView huliView = this.f6891iv;
        if (huliView != null && this.timer == null) {
            huliView.setVideoIsStreaming(true);
            this.timer = new Timer();
            this.timer.schedule(new TimerTask() {
                public void run() {
                    VideoFragment.this.getBaseActivity().runOnUiThread(new Runnable() {
                        public final void run() {
                            VideoFragment.C59512.this.lambda$run$0$VideoFragment$2();
                        }
                    });
                }

                public /* synthetic */ void lambda$run$0$VideoFragment$2() {
                    VideoFragment.this.f6891iv.setMsCurrentDelta(VideoFragment.this.f6891iv.getMsCurrentDelta() + 1000);
                    VideoFragment.this.f6891iv.invalidate();
                }
            }, 0, 1000);
            long j = ((long) this.f6891iv.msInPixel) * 1000;
            this.hsvTimer = new Timer();
            this.hsvTimer.schedule(new TimerTask() {
                public void run() {
                    VideoFragment.this.getBaseActivity().runOnUiThread(new Runnable() {
                        public final void run() {
                            VideoFragment.C59523.this.lambda$run$1$VideoFragment$3();
                        }
                    });
                }

                public /* synthetic */ void lambda$null$0$VideoFragment$3() {
                    VideoFragment.this.hsv.smoothScrollTo(((int) VideoFragment.this.f6891iv.getDeltaScroolX()) + 1, VideoFragment.this.f6891iv.getScrollY());
                }

                public /* synthetic */ void lambda$run$1$VideoFragment$3() {
                    VideoFragment.this.hsv.post(new Runnable() {
                        public final void run() {
                            VideoFragment.C59523.this.lambda$null$0$VideoFragment$3();
                        }
                    });
                    VideoFragment.this.f6891iv.setDeltaScroolX(VideoFragment.this.f6891iv.getDeltaScroolX() + 1);
                }
            }, 0, j);
        }
        int i = 0;
        this.f6892pb.setVisibility(z ? 0 : 4);
        MjpegView mjpegView = this.surfaceView;
        if (z) {
            i = 4;
        }
        mjpegView.setVisibility(i);
    }

    public void onStreamNotStarting() {
        this.surfaceView.stopStream();
        showError();
        Timer timer2 = this.timer;
        if (timer2 != null && this.f6891iv != null) {
            timer2.cancel();
            this.timer = null;
            this.hsvTimer.cancel();
            this.hsvTimer = null;
            this.f6891iv.setVideoIsStreaming(false);
        }
    }

    /* access modifiers changed from: private */
    public void startVideo(Resource<VideoUrl> resource) {
        if (resource != null) {
            int i = C59534.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6892pb.setVisibility(0);
            } else if (i == 2) {
                Log.d("TAG", "XXX URL L " + resource.getData().getUrl());
                this.f6892pb.setVisibility(8);
                this.videoViewModel.getShowUrl().setValue(resource.getData().getUrl());
            } else if (i == 3) {
                showMessage(resource.getMessage());
                showView(true);
                this.f6892pb.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public void startVideo(String str) {
        if (!str.startsWith("https://")) {
            str = "https://" + str;
        }
        this.f6892pb.setVisibility(0);
        this.surfaceView.setMode(1);
        this.surfaceView.setAdjustHeight(true);
        this.surfaceView.setUrl(str);
        this.surfaceView.startStream();
        this.surfaceView.setOnStartStream(this);
    }

    private void showError() {
        this.surfaceView.setVisibility(4);
        this.play.setVisibility(4);
        this.error.setVisibility(0);
        this.error.findViewById(R.id.repeat).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoFragment.this.lambda$showError$6$VideoFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$showError$6$VideoFragment(View view) {
        this.f6892pb.setVisibility(0);
        this.error.setVisibility(4);
        this.surfaceView.startStream();
    }

    /* access modifiers changed from: private */
    public void onOpenDoorHandler(Resource<Void> resource) {
        if (resource != null) {
            int i = C59534.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                showPrograss(true);
            } else if (i == 2) {
                showPrograss(false);
            } else if (i == 3) {
                showPrograss(false);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void onChangeDate(long j) {
        this.f6892pb.setVisibility(4);
        this.error.setVisibility(4);
        this.surfaceView.setVisibility(0);
        this.play.setVisibility(0);
        stopVideo();
        showPlay(j);
    }

    private void showPlay(long j) {
        this.play.setOnClickListener(new View.OnClickListener(j) {
            private final /* synthetic */ long f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                VideoFragment.this.lambda$showPlay$7$VideoFragment(this.f$1, view);
            }
        });
    }

    public /* synthetic */ void lambda$showPlay$7$VideoFragment(long j, View view) {
        getUrl(j);
    }

    private void getUrl(long j) {
        this.play.setVisibility(4);
        this.f6892pb.setVisibility(0);
        this.videoViewModel.getArchiveStreamUrl(this.cameraID, String.valueOf(j), this.newUrlForArchiveRequest);
    }

    /* access modifiers changed from: package-private */
    public void showView(boolean z) {
        int i = 0;
        this.error.setVisibility(z ? 0 : 4);
        ImageView imageView = this.play;
        if (z) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public void showPrograss(boolean z) {
        this.f6892pb.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: private */
    public void onGetEvents(Resource<VideoEventsList> resource) {
        int i;
        if (resource != null && (i = C59534.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()]) != 1 && i == 2) {
            this.f6891iv.setEvents(resource.getData().getDates());
        }
    }
}
