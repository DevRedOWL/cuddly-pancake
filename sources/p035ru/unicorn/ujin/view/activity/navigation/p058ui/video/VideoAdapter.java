package p035ru.unicorn.ujin.view.activity.navigation.p058ui.video;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoAdapter */
public class VideoAdapter extends BaseAdapter<C5788Video, VideoHolder> {
    OnUrlClick onUrlClick;

    public C5788Video getItemById(String str) {
        return null;
    }

    public VideoAdapter(OnUrlClick onUrlClick2) {
        this.onUrlClick = onUrlClick2;
    }

    /* access modifiers changed from: protected */
    public VideoHolder getViewHolder(View view, int i, int i2) {
        return new VideoHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.item_video_preview, (ViewGroup) view, false));
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(final VideoHolder videoHolder, C5788Video video, int i, int i2) {
        Picasso.get().load(video.getPreview()).into(videoHolder.preview, new Callback() {
            public void onSuccess() {
                videoHolder.clNoPreview.setVisibility(8);
            }

            public void onError(Exception exc) {
                videoHolder.preview.setVisibility(8);
                videoHolder.clNoPreview.setVisibility(0);
            }
        });
        videoHolder.title.setText(video.getTitle());
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.video.VideoAdapter$VideoHolder */
    public class VideoHolder extends BaseHolder implements View.OnClickListener {
        @BindView(2131362237)
        LinearLayout clNoPreview;
        @BindView(2131363196)
        ImageView preview;
        @BindView(2131363684)
        TextView title;
        @BindView(2131363851)
        TextView tvNoPreview;

        public VideoHolder(View view) {
            super(view);
            this.preview = (ImageView) view.findViewById(R.id.preview);
            this.title = (TextView) view.findViewById(R.id.title);
            this.tvNoPreview = (TextView) view.findViewById(R.id.tvNoPreview);
            this.clNoPreview = (LinearLayout) view.findViewById(R.id.clNoPreview);
            view.setTag(this);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition != -1) {
                VideoAdapter.this.onUrlClick.onUrlClick((C5788Video) VideoAdapter.this.getItem(adapterPosition));
            }
        }
    }
}
