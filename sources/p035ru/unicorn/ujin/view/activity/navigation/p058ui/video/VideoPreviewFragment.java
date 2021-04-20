package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.MjpegVideoActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.IFullScreenData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.customViews.MjpegView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoPreviewFragment */
public class VideoPreviewFragment extends BaseFragment implements OnUrlClick, MjpegView.OnStartStream {
    private static final String KEY_MODE = "KEY_MODE";
    public static final int MODE_PREVIEW = 0;
    public static final int MODE_VIEW = 1;
    public static final int MODE_VIEW_LISTABLE = 2;
    public static final String TITLE = "title";
    public static final String TYPE = "title";
    public static final String URL = "url";
    private VideoAdapter adapter;
    private Button btnRepeat;
    int currentUrlListPosition = -1;
    private LinearLayout error;
    private LinearLayout left;
    @Nullable
    private List<IFullScreenData> listOfUrl = null;

    /* renamed from: pb */
    private ProgressBar f6894pb;
    private LinearLayout right;

    /* renamed from: rv */
    private RecyclerView f6895rv;
    private MjpegView surfaceView;

    /* renamed from: sv */
    private ScrollView f6896sv;
    private TextView tvError;
    private VideoViewModel videoViewModel;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_video_preview;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static VideoPreviewFragment start(int i) {
        VideoPreviewFragment videoPreviewFragment = new VideoPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_MODE, i);
        videoPreviewFragment.setArguments(bundle);
        return videoPreviewFragment;
    }

    public static VideoPreviewFragment start(int i, String str, String str2, String str3) {
        VideoPreviewFragment videoPreviewFragment = new VideoPreviewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_MODE, i);
        bundle.putString("url", str);
        bundle.putString("title", str2);
        bundle.putString("title", str3);
        videoPreviewFragment.setArguments(bundle);
        return videoPreviewFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6895rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.surfaceView = (MjpegView) inflate.findViewById(R.id.surfaceView);
        this.error = (LinearLayout) inflate.findViewById(R.id.ll_error);
        this.f6894pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.tvError = (TextView) inflate.findViewById(R.id.tvError);
        this.btnRepeat = (Button) inflate.findViewById(R.id.repeat);
        this.f6896sv = (ScrollView) inflate.findViewById(R.id.sv);
        this.left = (LinearLayout) inflate.findViewById(R.id.left);
        this.right = (LinearLayout) inflate.findViewById(R.id.right);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        VideoDataSaver.VideoDataType typeByValue;
        initAdapter();
        this.videoViewModel = (VideoViewModel) ViewModelProviders.m10of((Fragment) this).get(VideoViewModel.class);
        if (getArguments().getInt(KEY_MODE) == 2 && (typeByValue = VideoDataSaver.Companion.getTypeByValue(getArguments().getString("title"))) != null) {
            this.listOfUrl = new VideoDataSaver(getBaseActivity()).loadListOfVideo(typeByValue);
            this.left.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    VideoPreviewFragment.this.lambda$onViewCreated$0$VideoPreviewFragment(view);
                }
            });
            this.right.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    VideoPreviewFragment.this.lambda$onViewCreated$1$VideoPreviewFragment(view);
                }
            });
        }
        if (getArguments().getInt(KEY_MODE) == 0) {
            this.videoViewModel.getVideoPreview().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    VideoPreviewFragment.this.showPreview((Resource) obj);
                }
            });
            this.videoViewModel.getTitle().setValue(getString(R.string.toolbar_label_video_preview));
        } else {
            String string = getArguments().getString("url");
            this.videoViewModel.getTitle().setValue(getArguments().getString("title"));
            this.f6895rv.setVisibility(4);
            this.f6894pb.setVisibility(0);
            this.surfaceView.setVisibility(0);
            startVideo(string);
        }
        this.surfaceView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoPreviewFragment.this.lambda$onViewCreated$2$VideoPreviewFragment(view);
            }
        });
        this.f6896sv.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoPreviewFragment.this.lambda$onViewCreated$3$VideoPreviewFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$0$VideoPreviewFragment(View view) {
        this.surfaceView.stopStream();
        onStreamStarted(true);
        onLeftClick();
    }

    public /* synthetic */ void lambda$onViewCreated$1$VideoPreviewFragment(View view) {
        this.surfaceView.stopStream();
        onStreamStarted(true);
        onRightClick();
    }

    public /* synthetic */ void lambda$onViewCreated$2$VideoPreviewFragment(View view) {
        hideFullScreen();
    }

    public /* synthetic */ void lambda$onViewCreated$3$VideoPreviewFragment(View view) {
        hideFullScreen();
    }

    private void startVideo(String str) {
        if (getArguments().getInt(KEY_MODE) == 2) {
            initListableView(str);
            showListableView();
        }
        this.surfaceView.setMode(3);
        this.surfaceView.setAdjustHeight(true);
        this.surfaceView.setUrl(str);
        this.surfaceView.startStream();
        this.surfaceView.setOnStartStream(this);
    }

    private void initListableView(String str) {
        this.currentUrlListPosition = findPositionOfCurrentUrl(str);
        boolean z = true;
        boolean z2 = this.currentUrlListPosition == 0;
        if (this.currentUrlListPosition != this.listOfUrl.size() - 1) {
            z = false;
        }
        if (!z2 && !z) {
            this.left.setVisibility(0);
            this.right.setVisibility(0);
        }
        if (z2) {
            this.left.setVisibility(4);
            this.right.setVisibility(0);
        }
        if (z) {
            this.left.setVisibility(0);
            this.right.setVisibility(4);
        }
    }

    private int findPositionOfCurrentUrl(String str) {
        List<IFullScreenData> list = this.listOfUrl;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.listOfUrl.size(); i++) {
            if (this.listOfUrl.get(i).getVideoUrl().toLowerCase().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoPreviewFragment$1 */
    static /* synthetic */ class C59541 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoPreviewFragment.C59541.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showPreview(Resource<List<C5788Video>> resource) {
        if (resource != null) {
            int i = C59541.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6894pb.setVisibility(0);
            } else if (i == 2) {
                this.f6894pb.setVisibility(8);
                if (resource.getData() == null || resource.getData().isEmpty()) {
                    showError(getString(R.string.empty_video_list));
                    return;
                }
                new VideoDataSaver(getBaseActivity()).saveListOfVideo(resource.getData(), VideoDataSaver.VideoDataType.FROM_VIDEO_PREVIEW);
                this.adapter.setData(resource.getData());
            } else if (i == 3) {
                this.f6894pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                backFragment();
            }
        }
    }

    private void initAdapter() {
        this.adapter = new VideoAdapter(this);
        this.f6895rv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        this.f6895rv.setAdapter(this.adapter);
    }

    public void onUrlClick(C5788Video video) {
        this.videoViewModel.getVideoPreview().removeObservers(this);
        boolean z = true;
        if (!video.isHasArchive() || video.getId() == null || video.getId().isEmpty()) {
            z = false;
        }
        nextFragment(VideoFragment.start(true, Boolean.valueOf(z), video.getTitle(), video.getId(), (String) null, video.getVideourlpeg(), false, video.getNewArchiveUrl()), false);
    }

    private void onRightClick() {
        startVideo(this.listOfUrl.get(this.currentUrlListPosition + 1).getVideoUrl());
    }

    private void onLeftClick() {
        startVideo(this.listOfUrl.get(this.currentUrlListPosition - 1).getVideoUrl());
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(this.videoViewModel.getTitle().getValue());
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }

    public void onPause() {
        super.onPause();
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
                    VideoPreviewFragment.this.lambda$onStreamStarted$4$VideoPreviewFragment(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onStreamStarted$4$VideoPreviewFragment(boolean z) {
        int i = 0;
        this.f6894pb.setVisibility(z ? 0 : 4);
        MjpegView mjpegView = this.surfaceView;
        if (z) {
            i = 4;
        }
        mjpegView.setVisibility(i);
    }

    public void onStreamNotStarting() {
        this.surfaceView.stopStream();
        showError();
    }

    private void showError() {
        hideFullScreen();
        this.surfaceView.setVisibility(4);
        this.error.setVisibility(0);
        this.error.findViewById(R.id.repeat).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                VideoPreviewFragment.this.lambda$showError$5$VideoPreviewFragment(view);
            }
        });
    }

    public /* synthetic */ void lambda$showError$5$VideoPreviewFragment(View view) {
        this.f6894pb.setVisibility(0);
        this.error.setVisibility(4);
        this.surfaceView.startStream();
    }

    private void showError(String str) {
        this.tvError.setVisibility(0);
        if (StringUtils.isNotEmpty(str)) {
            this.tvError.setText(str);
        }
    }

    private void hideFullScreen() {
        if (getBaseActivity() instanceof MjpegVideoActivity) {
            ((MjpegVideoActivity) getBaseActivity()).onVideoClick();
            showListableView();
        }
    }

    private void showListableView() {
        int i;
        List<IFullScreenData> list = this.listOfUrl;
        if (list != null && !list.isEmpty() && (i = this.currentUrlListPosition) > -1) {
            initListableView(this.listOfUrl.get(i).getVideoUrl());
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    VideoPreviewFragment.this.lambda$showListableView$6$VideoPreviewFragment();
                }
            }, 2000);
        }
    }

    public /* synthetic */ void lambda$showListableView$6$VideoPreviewFragment() {
        this.left.setVisibility(4);
        this.right.setVisibility(4);
    }
}
