package com.afollestad.materialdialogs.files;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo51343d2 = {"Lcom/afollestad/materialdialogs/files/FileChooserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "adapter", "Lcom/afollestad/materialdialogs/files/FileChooserAdapter;", "(Landroid/view/View;Lcom/afollestad/materialdialogs/files/FileChooserAdapter;)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "onClick", "", "view", "files"}, mo51344k = 1, mo51345mv = {1, 1, 16})
/* compiled from: FileChooserAdapter.kt */
public final class FileChooserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private final FileChooserAdapter adapter;
    private final ImageView iconView;
    private final TextView nameView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileChooserViewHolder(View view, FileChooserAdapter fileChooserAdapter) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(fileChooserAdapter, "adapter");
        this.adapter = fileChooserAdapter;
        view.setOnClickListener(this);
        View findViewById = view.findViewById(C1051R.C1054id.icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.icon)");
        this.iconView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1051R.C1054id.name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.name)");
        this.nameView = (TextView) findViewById2;
    }

    public final ImageView getIconView() {
        return this.iconView;
    }

    public final TextView getNameView() {
        return this.nameView;
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.adapter.itemClicked(getAdapterPosition());
    }
}
