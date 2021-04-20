package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.customViews.MjpegView;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesWithVideoSection */
public class GatesWithVideoSection extends MultiSection<Point, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Integer> onClick = PublishProcessor.create();
    public boolean showPreview = false;
    public PublishProcessor<String> showVideo = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_gates_with_video;
    }

    public PublishProcessor<Integer> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Point point, int i, List<Object> list) {
        viewHolder.title.setVisibility(Flavor.current().isWithVideoPreview() ? 4 : 0);
        viewHolder.title.setText(point.getName());
        if (point.getBeaconAction() != null) {
            BeaconAction beaconAction = point.getBeaconAction();
            if (beaconAction.getBeaconActionDescriptionIn() == null || beaconAction.getBeaconActionDescriptionIn().getTitle().equals("")) {
                viewHolder.open.setVisibility(8);
            } else {
                viewHolder.open.setText(beaconAction.getBeaconActionDescriptionIn().getTitle());
            }
            if (beaconAction.getBeaconActionDescriptionOut() == null || beaconAction.getBeaconActionDescriptionOut().getTitle().equals("")) {
                viewHolder.close.setVisibility(8);
            } else {
                viewHolder.close.setText(beaconAction.getBeaconActionDescriptionOut().getTitle());
            }
            Camera camera = point.getCamera();
            if (camera == null || camera.getPreview().isEmpty()) {
                viewHolder.ivOpenParent.setVisibility(8);
                return;
            }
            viewHolder.ivOpenParent.setVisibility(0);
            startPreview(camera.getVideourl(), viewHolder.mjpegView, this.showPreview);
        }
    }

    private void startPreview(String str, MjpegView mjpegView, boolean z) {
        if (z) {
            mjpegView.setMode(1);
            mjpegView.setAdjustHeight(true);
            mjpegView.setUrl(str);
            mjpegView.startStream();
            return;
        }
        mjpegView.stopStream();
        mjpegView.setBitmap((Bitmap) null);
    }

    private void loadImage(String str, ImageView imageView) {
        Picasso.get().load(str).into(imageView);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            Point point = (Point) getData(getAdapterPositionForViewHolder(viewHolder));
            switch (view.getId()) {
                case R.id.close:
                    getOnClick().onNext(point.getBeaconAction().getBeaconActionDescriptionOut().getId());
                    return;
                case R.id.cv:
                case R.id.mjpegView:
                    if (point != null && point.getCamera() != null) {
                        this.showVideo.onNext(point.getCamera().getVideourl());
                        return;
                    }
                    return;
                case R.id.open:
                    getOnClick().onNext(point.getBeaconAction().getBeaconActionDescriptionIn().getId());
                    return;
                default:
                    return;
            }
        }
    }

    public void update(boolean z) {
        this.showPreview = z;
        onChanged(0, 1, (Object) null);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesWithVideoSection$ViewHolder */
    class ViewHolder extends RecyclerView.ViewHolder {
        Button close;
        ImageView ivOpen;
        CardView ivOpenParent;
        MjpegView mjpegView;
        Button open;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.open = (Button) view.findViewById(R.id.open);
            this.open.setOnClickListener(onClickListener);
            this.close = (Button) view.findViewById(R.id.close);
            this.close.setOnClickListener(onClickListener);
            this.ivOpen = (ImageView) view.findViewById(R.id.iv);
            this.ivOpenParent = (CardView) view.findViewById(R.id.cv);
            this.ivOpenParent.setOnClickListener(onClickListener);
            this.ivOpenParent.setTag(this);
            this.open.setTag(this);
            this.close.setTag(this);
            this.mjpegView = (MjpegView) view.findViewById(R.id.mjpegView);
            this.mjpegView.setOnClickListener(onClickListener);
            this.mjpegView.setTag(this);
        }
    }
}
