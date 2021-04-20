package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.angel.zoom.ZoomImageView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.squareup.picasso.Picasso;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.PreviewImageFragment */
public class PreviewImageFragment extends BaseFragment {
    private ZoomImageView zoomImageView;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_preview_image;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private PreviewImageFragment() {
    }

    static PreviewImageFragment start(String str, String str2, String str3) {
        PreviewImageFragment previewImageFragment = new PreviewImageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, str2);
        bundle.putString("url", str3);
        previewImageFragment.setArguments(bundle);
        return previewImageFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.zoomImageView = (ZoomImageView) inflate.findViewById(R.id.zoomImageView);
        Picasso.get().load(getArguments().getString("url")).into((ImageView) this.zoomImageView);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getArguments().getString("title"));
    }
}
