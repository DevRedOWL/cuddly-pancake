package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.AttachFileSection */
public class AttachFileSection extends SingleSection<List<SomeString>, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<String> onClick = PublishProcessor.create();
    private PublishProcessor<String> onClickAddFile = PublishProcessor.create();
    private PublishProcessor<SomeString> onCloseFile = PublishProcessor.create();
    private ViewHolder viewHolder;

    public int getLayoutId() {
        return R.layout.attach_file_section;
    }

    public PublishProcessor<String> getOnClick() {
        return this.onClick;
    }

    public PublishProcessor<String> getOnClickAddFile() {
        return this.onClickAddFile;
    }

    public PublishProcessor<SomeString> getOnCloseFile() {
        return this.onCloseFile;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder2, List<SomeString> list, List<Object> list2) {
        Bitmap extractThumbnail;
        Context context = viewHolder2.f6776ll.getContext();
        if (viewHolder2.f6776ll.getChildCount() > 0) {
            viewHolder2.f6776ll.removeAllViews();
        }
        for (int i = 0; i < list.size(); i++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_file, viewHolder2.f6776ll, false);
            if ((list.get(i).getSomeString().contains(".jpg") || list.get(i).getSomeString().contains(".png")) && (extractThumbnail = ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(list.get(i).getSomeString()), AppUtils.dpToPx(inflate.getContext(), 38), AppUtils.dpToPx(inflate.getContext(), 38))) != null) {
                ImageView imageView = (ImageView) inflate.findViewById(R.id.file);
                imageView.setImageBitmap(extractThumbnail);
                imageView.setVisibility(0);
                ((TextView) inflate.findViewById(R.id.padding)).setVisibility(0);
            }
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.close);
            imageView2.setOnClickListener(this);
            imageView2.setTag(R.string.setup_key, Integer.valueOf(i));
            TextView textView = (TextView) inflate.findViewById(R.id.line);
            if (i == list.size() - 1) {
                textView.setVisibility(0);
            }
            ((TextView) inflate.findViewById(R.id.file_name)).setText(list.get(i).getSomeString().substring(list.get(i).getSomeString().lastIndexOf("/") + 1));
            viewHolder2.f6776ll.addView(inflate);
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        int intValue;
        int id = view.getId();
        if (id == R.id.btn_add_file) {
            getOnClickAddFile().onNext("");
        } else if (id != R.id.btn_create_ticket) {
            if (id == R.id.close && (intValue = ((Integer) view.getTag(R.string.setup_key)).intValue()) > -1) {
                getOnCloseFile().onNext((SomeString) ((List) getData()).get(intValue));
            }
        } else if (view.getTag() instanceof ViewHolder) {
            this.viewHolder = (ViewHolder) view.getTag();
            if (getLayoutPositionForViewHolder(this.viewHolder) != -1) {
                getOnClick().onNext("");
            }
        }
    }

    private boolean isEmpty(EditText editText) {
        return editText.getText().toString().trim().length() <= 0;
    }

    /* access modifiers changed from: package-private */
    public void setButtonCreateEnabled(boolean z) {
        ViewHolder viewHolder2 = this.viewHolder;
        if (viewHolder2 != null) {
            viewHolder2.btnCreate.setEnabled(z);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.AttachFileSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView add;
        DynamicBackgroundButton btnCreate;

        /* renamed from: ll */
        LinearLayout f6776ll;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.f6776ll = (LinearLayout) view.findViewById(R.id.linear_files);
            this.btnCreate = (DynamicBackgroundButton) view.findViewById(R.id.btn_create_ticket);
            this.add = (TextView) view.findViewById(R.id.btn_add_file);
            this.btnCreate.setTag(this);
            this.btnCreate.setOnClickListener(onClickListener);
            this.add.setTag(this);
            this.add.setOnClickListener(onClickListener);
        }
    }
}
