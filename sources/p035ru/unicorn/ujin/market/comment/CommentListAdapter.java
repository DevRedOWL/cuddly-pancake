package p035ru.unicorn.ujin.market.comment;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
import p035ru.unicorn.ujin.util.DateUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/market/comment/CommentListAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "addItem", "", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.comment.CommentListAdapter */
/* compiled from: CommentListAdapter.kt */
public final class CommentListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Comment> data;

    public CommentListAdapter(List<Comment> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public final List<Comment> getData() {
        return this.data;
    }

    public final void setData(List<Comment> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_comment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…m_comment, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.data.get(i));
    }

    public final void setItems(List<Comment> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(Comment comment) {
        Intrinsics.checkNotNullParameter(comment, "item");
        this.data.add(comment);
        notifyItemInserted(getItemCount() - 1);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/market/comment/CommentListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/market/comment/CommentListAdapter;Landroid/view/View;)V", "bind", "", "comment", "Lru/unicorn/ujin/data/realm/marketplace/Comment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.comment.CommentListAdapter$ViewHolder */
    /* compiled from: CommentListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CommentListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CommentListAdapter commentListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = commentListAdapter;
        }

        public final void bind(Comment comment) {
            Intrinsics.checkNotNullParameter(comment, "comment");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvAuthor);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvAuthor");
            textView.setText(comment.getAuthorName());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvDescription);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvDescription");
            textView2.setText(comment.getMessage());
            String date = comment.getDate();
            if (date != null) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvDate);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvDate");
                textView3.setText(DateUtils.formatDateFromUnix(date));
            }
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            RatingBar ratingBar = (RatingBar) view4.findViewById(C5619R.C5622id.ratingBar);
            Intrinsics.checkNotNullExpressionValue(ratingBar, "itemView.ratingBar");
            Drawable progressDrawable = ratingBar.getProgressDrawable();
            if (progressDrawable != null) {
                LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(view5.getResources().getColor(R.color.ratingBarColor), PorterDuff.Mode.SRC_ATOP);
                Drawable drawable = layerDrawable.getDrawable(2);
                Intrinsics.checkNotNullExpressionValue(drawable, "starsLayer.getDrawable(2)");
                ColorFilter colorFilter = porterDuffColorFilter;
                drawable.setColorFilter(colorFilter);
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.checkNotNullExpressionValue(drawable2, "starsLayer.getDrawable(0)");
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                drawable2.setColorFilter(new PorterDuffColorFilter(view6.getResources().getColor(R.color.ratingBarColorDark), PorterDuff.Mode.SRC_ATOP));
                Drawable drawable3 = layerDrawable.getDrawable(1);
                Intrinsics.checkNotNullExpressionValue(drawable3, "starsLayer.getDrawable(1)");
                drawable3.setColorFilter(colorFilter);
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                RatingBar ratingBar2 = (RatingBar) view7.findViewById(C5619R.C5622id.ratingBar);
                Intrinsics.checkNotNullExpressionValue(ratingBar2, "itemView.ratingBar");
                String vote = comment.getVote();
                ratingBar2.setRating(vote != null ? Float.parseFloat(vote) : 0.0f);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
    }
}
