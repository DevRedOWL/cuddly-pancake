package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.DownLoadSection */
public class DownLoadSection extends MultiSection<ServiceFile, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<ServiceFile> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_download_file;
    }

    public PublishProcessor<ServiceFile> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ServiceFile serviceFile, int i, List<Object> list) {
        viewHolder.fileName.setText(serviceFile.getFileName());
        if (serviceFile.getFileName().contains(".jpg") || serviceFile.getFileName().contains(".png")) {
            viewHolder.filePreview.setVisibility(0);
            viewHolder.padding.setVisibility(0);
            ((RequestBuilder) ((RequestBuilder) Glide.with(viewHolder.fileName.getContext()).load(serviceFile.getFileUrl()).placeholder((int) R.drawable.ic_svg_timelapse)).error((int) R.drawable.ic_svg_attention)).into(viewHolder.filePreview);
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int adapterPositionForViewHolder;
        if ((view.getTag() instanceof ViewHolder) && (adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) view.getTag())) != -1) {
            this.onClick.onNext((ServiceFile) getData(adapterPositionForViewHolder));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.DownLoadSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView download;
        TextView fileName;
        ImageView filePreview;
        TextView line;
        TextView padding;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.padding = (TextView) view.findViewById(R.id.padding);
            this.fileName = (TextView) view.findViewById(R.id.file_name);
            this.filePreview = (ImageView) view.findViewById(R.id.file);
            this.download = (ImageView) view.findViewById(R.id.download);
            this.download.setOnClickListener(onClickListener);
            this.download.setTag(this);
        }
    }
}
