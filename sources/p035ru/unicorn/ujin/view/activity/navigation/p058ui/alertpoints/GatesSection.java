package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.Pair;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesSection */
public class GatesSection extends MultiSection<Point, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<Pair<Integer, Point>> onClick = PublishProcessor.create();
    public PublishProcessor<String> showVideo = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_gates;
    }

    public PublishProcessor<Pair<Integer, Point>> getOnClick() {
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
            loadImage(camera.getPreview(), viewHolder.ivOpen);
        }
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
            int id = view.getId();
            if (id == R.id.close) {
                getOnClick().onNext(new Pair(point.getBeaconAction().getBeaconActionDescriptionOut().getId(), point));
            } else if (id != R.id.cv) {
                if (id == R.id.open) {
                    getOnClick().onNext(new Pair(point.getBeaconAction().getBeaconActionDescriptionIn().getId(), point));
                }
            } else if (point != null && point.getCamera() != null) {
                this.showVideo.onNext(point.getCamera().getVideourl());
            }
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesSection$ViewHolder */
    class ViewHolder extends RecyclerView.ViewHolder {
        Button close;
        ImageView ivOpen;
        CardView ivOpenParent;
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
        }
    }
}
