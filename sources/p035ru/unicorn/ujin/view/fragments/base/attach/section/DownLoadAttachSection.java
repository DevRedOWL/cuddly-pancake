package p035ru.unicorn.ujin.view.fragments.base.attach.section;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.util.UriUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0005J4\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0014J\u0014\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016R5\u0010\u0006\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/data/realm/FileData;", "Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "onClick", "Lio/reactivex/processors/PublishProcessor;", "kotlin.jvm.PlatformType", "getOnClick", "()Lio/reactivex/processors/PublishProcessor;", "bindViewHolder", "", "viewHolder", "data", "position", "", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.DownLoadAttachSection */
/* compiled from: DownLoadAttachSection.kt */
public final class DownLoadAttachSection extends MultiSection<FileData, ViewHolder> implements View.OnClickListener {
    private final PublishProcessor<FileData> onClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_download_file;
    }

    public final PublishProcessor<FileData> getOnClick() {
        return this.onClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, FileData fileData, int i, List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(list, "payloads");
        if (fileData != null) {
            viewHolder.bind(fileData);
        }
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        if (view.getTag() instanceof ViewHolder) {
            Object tag = view.getTag();
            if (tag != null) {
                int adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) tag);
                if (adapterPositionForViewHolder != -1) {
                    this.onClick.onNext((FileData) getData(adapterPositionForViewHolder));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.base.attach.section.DownLoadAttachSection.ViewHolder");
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "file", "Lru/unicorn/ujin/data/realm/FileData;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.base.attach.section.DownLoadAttachSection$ViewHolder */
    /* compiled from: DownLoadAttachSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ DownLoadAttachSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(DownLoadAttachSection downLoadAttachSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = downLoadAttachSection;
            ((ImageView) view.findViewById(C5619R.C5622id.download)).setOnClickListener(onClickListener);
            ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.download);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.download");
            imageView.setTag(this);
        }

        public final void bind(FileData fileData) {
            Intrinsics.checkNotNullParameter(fileData, UriUtil.LOCAL_FILE_SCHEME);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.file_name);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.file_name");
            textView.setText(fileData.getName());
            String mimeType = fileData.getMimeType();
            if (mimeType != null && StringsKt.contains$default((CharSequence) mimeType, (CharSequence) "image", false, 2, (Object) null)) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                ImageView imageView = (ImageView) view2.findViewById(C5619R.C5622id.file);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.file");
                imageView.setVisibility(0);
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.padding);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.padding");
                textView2.setVisibility(0);
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ImageView imageView2 = (ImageView) view4.findViewById(C5619R.C5622id.file);
                Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.file");
                GlideRequest error = GlideApp.with(imageView2.getContext()).load(fileData.getUrl()).placeholder((int) R.drawable.ic_svg_timelapse).error((int) R.drawable.ic_svg_attention);
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                error.into((ImageView) view5.findViewById(C5619R.C5622id.file));
            }
        }
    }
}
