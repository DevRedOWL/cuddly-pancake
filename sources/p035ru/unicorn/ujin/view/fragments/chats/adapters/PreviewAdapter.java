package p035ru.unicorn.ujin.view.fragments.chats.adapters;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.fragments.chats.Attachment;
import p035ru.unicorn.ujin.view.fragments.chats.AttachmentType;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\tH\u0016J\u001c\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/PreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/chats/adapters/PreviewAdapter$ViewHolder;", "filePathList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/chats/Attachment;", "Lkotlin/collections/ArrayList;", "deleteClickListener", "Lkotlin/Function1;", "", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getDeleteClickListener", "()Lkotlin/jvm/functions/Function1;", "getFilePathList", "()Ljava/util/ArrayList;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.PreviewAdapter */
/* compiled from: PreviewAdapter.kt */
public final class PreviewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<Integer, Unit> deleteClickListener;
    private final ArrayList<Attachment> filePathList;

    public final ArrayList<Attachment> getFilePathList() {
        return this.filePathList;
    }

    public final Function1<Integer, Unit> getDeleteClickListener() {
        return this.deleteClickListener;
    }

    public PreviewAdapter(ArrayList<Attachment> arrayList, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "filePathList");
        Intrinsics.checkNotNullParameter(function1, "deleteClickListener");
        this.filePathList = arrayList;
        this.deleteClickListener = function1;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_attach_preview, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…h_preview, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.filePathList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/PreviewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/chats/adapters/PreviewAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.PreviewAdapter$ViewHolder */
    /* compiled from: PreviewAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ PreviewAdapter this$0;

        @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
        /* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.PreviewAdapter$ViewHolder$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[AttachmentType.values().length];

            static {
                $EnumSwitchMapping$0[AttachmentType.PHOTO.ordinal()] = 1;
                $EnumSwitchMapping$0[AttachmentType.VIDEO.ordinal()] = 2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PreviewAdapter previewAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = previewAdapter;
        }

        public final void bind(int i) {
            Bitmap bitmap;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.ivPreview);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getFilePathList().get(i).getType().ordinal()];
            boolean z = true;
            if (i2 == 1) {
                bitmap = AppUtils.getPhotoThumbnail(this.this$0.getFilePathList().get(i).getPath());
            } else if (i2 == 2) {
                bitmap = AppUtils.getVideoThumbnail(this.this$0.getFilePathList().get(i).getPath());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageBitmap(bitmap);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ProgressBar progressBar = (ProgressBar) view2.findViewById(C5619R.C5622id.pbAttach);
            Intrinsics.checkNotNullExpressionValue(progressBar, "itemView.pbAttach");
            int i3 = 0;
            progressBar.setVisibility(this.this$0.getFilePathList().get(i).getId().length() == 0 ? 0 : 8);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            AppCompatImageView appCompatImageView = (AppCompatImageView) view3.findViewById(C5619R.C5622id.ivCheck);
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "itemView.ivCheck");
            if (this.this$0.getFilePathList().get(i).getId().length() <= 0) {
                z = false;
            }
            if (!z) {
                i3 = 8;
            }
            appCompatImageView.setVisibility(i3);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((AppCompatImageView) view4.findViewById(C5619R.C5622id.ivDeleteAttach)).setOnClickListener(new PreviewAdapter$ViewHolder$bind$1(this, i));
        }
    }
}
