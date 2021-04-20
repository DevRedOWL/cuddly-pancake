package com.afollestad.materialdialogs.files;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.callbacks.DialogCallbackExtKt;
import com.afollestad.materialdialogs.files.util.FilesUtilExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012<\u0010\u0012\u001a8\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013j\u0002`\u0018¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020\u0011H\u0016J\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002J\u000e\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0011J\b\u0010-\u001a\u00020\u0011H\u0002J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0018\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0011H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u0006H\u0002J\f\u00106\u001a\u00020\u0011*\u00020\u0006H\u0002R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000RD\u0010\u0012\u001a8\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0013j\u0002`\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0002`\u000eX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u00067"}, mo51343d2 = {"Lcom/afollestad/materialdialogs/files/FileChooserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/afollestad/materialdialogs/files/FileChooserViewHolder;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "initialFolder", "Ljava/io/File;", "waitForPositiveButton", "", "emptyView", "Landroid/widget/TextView;", "onlyFolders", "filter", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/files/FileFilter;", "allowFolderCreation", "folderCreationLabel", "", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "file", "", "Lcom/afollestad/materialdialogs/files/FileCallback;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/io/File;ZLandroid/widget/TextView;ZLkotlin/jvm/functions/Function1;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "contents", "", "currentFolder", "Ljava/lang/Integer;", "isLightTheme", "listingJob", "Lkotlinx/coroutines/Job;", "selectedFile", "getSelectedFile", "()Ljava/io/File;", "setSelectedFile", "(Ljava/io/File;)V", "actualIndex", "position", "getItemCount", "getSelectedIndex", "goUpIndex", "itemClicked", "index", "newFolderIndex", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "switchDirectory", "directory", "iconRes", "files"}, mo51344k = 1, mo51345mv = {1, 1, 16})
/* compiled from: FileChooserAdapter.kt */
public final class FileChooserAdapter extends RecyclerView.Adapter<FileChooserViewHolder> {
    private final boolean allowFolderCreation;
    private final Function2<MaterialDialog, File, Unit> callback;
    /* access modifiers changed from: private */
    public List<? extends File> contents;
    /* access modifiers changed from: private */
    public File currentFolder;
    /* access modifiers changed from: private */
    public final MaterialDialog dialog;
    /* access modifiers changed from: private */
    public final TextView emptyView;
    /* access modifiers changed from: private */
    public final Function1<File, Boolean> filter;
    private final Integer folderCreationLabel;
    private final boolean isLightTheme = MDUtil.isColorDark$default(MDUtil.INSTANCE, MDUtil.resolveColor$default(MDUtil.INSTANCE, this.dialog.getWindowContext(), (Integer) null, 16842806, (Function0) null, 10, (Object) null), Utils.DOUBLE_EPSILON, 1, (Object) null);
    /* access modifiers changed from: private */
    public Job listingJob;
    /* access modifiers changed from: private */
    public final boolean onlyFolders;
    private File selectedFile;
    private final boolean waitForPositiveButton;

    public FileChooserAdapter(MaterialDialog materialDialog, File file, boolean z, TextView textView, boolean z2, Function1<? super File, Boolean> function1, boolean z3, Integer num, Function2<? super MaterialDialog, ? super File, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "dialog");
        Intrinsics.checkParameterIsNotNull(file, "initialFolder");
        Intrinsics.checkParameterIsNotNull(textView, "emptyView");
        this.dialog = materialDialog;
        this.waitForPositiveButton = z;
        this.emptyView = textView;
        this.onlyFolders = z2;
        this.filter = function1;
        this.allowFolderCreation = z3;
        this.folderCreationLabel = num;
        this.callback = function2;
        this.currentFolder = file;
        DialogCallbackExtKt.onDismiss(this.dialog, new Function1<MaterialDialog, Unit>(this) {
            final /* synthetic */ FileChooserAdapter this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MaterialDialog) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(MaterialDialog materialDialog) {
                Intrinsics.checkParameterIsNotNull(materialDialog, "it");
                Job access$getListingJob$p = this.this$0.listingJob;
                if (access$getListingJob$p != null) {
                    Job.DefaultImpls.cancel$default(access$getListingJob$p, (CancellationException) null, 1, (Object) null);
                }
            }
        });
        switchDirectory(file);
    }

    public final File getSelectedFile() {
        return this.selectedFile;
    }

    public final void setSelectedFile(File file) {
        this.selectedFile = file;
    }

    public final void itemClicked(int i) {
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        File betterParent = FilesUtilExtKt.betterParent(file, context, this.allowFolderCreation, this.filter);
        if (betterParent != null && i == goUpIndex()) {
            switchDirectory(betterParent);
        } else if (!this.currentFolder.canWrite() || !this.allowFolderCreation || i != newFolderIndex()) {
            int actualIndex = actualIndex(i);
            List<? extends File> list = this.contents;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            Context context2 = this.dialog.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "dialog.context");
            File jumpOverEmulated = FilesUtilExtKt.jumpOverEmulated((File) list.get(actualIndex), context2);
            if (jumpOverEmulated.isDirectory()) {
                switchDirectory(jumpOverEmulated);
                return;
            }
            int selectedIndex = getSelectedIndex();
            this.selectedFile = jumpOverEmulated;
            if (this.waitForPositiveButton && DialogActionExtKt.hasActionButtons(this.dialog)) {
                DialogActionExtKt.setActionButtonEnabled(this.dialog, WhichButton.POSITIVE, true);
                notifyItemChanged(i);
                notifyItemChanged(selectedIndex);
                return;
            }
            Function2<MaterialDialog, File, Unit> function2 = this.callback;
            if (function2 != null) {
                Unit invoke = function2.invoke(this.dialog, jumpOverEmulated);
            }
            this.dialog.dismiss();
        } else {
            DialogFileChooserExtKt.showNewFolderCreator(this.dialog, this.currentFolder, this.folderCreationLabel, new FileChooserAdapter$itemClicked$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void switchDirectory(File file) {
        Job job = this.listingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.listingJob = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), (CoroutineStart) null, new FileChooserAdapter$switchDirectory$1(this, file, (Continuation) null), 2, (Object) null);
    }

    public int getItemCount() {
        List<? extends File> list = this.contents;
        int size = list != null ? list.size() : 0;
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        if (FilesUtilExtKt.hasParent(file, context, this.allowFolderCreation, this.filter)) {
            size++;
        }
        return (!this.allowFolderCreation || !this.currentFolder.canWrite()) ? size : size + 1;
    }

    public FileChooserViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1051R.layout.md_file_chooser_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        inflate.setBackground(DialogListExtKt.getItemSelector(this.dialog));
        FileChooserViewHolder fileChooserViewHolder = new FileChooserViewHolder(inflate, this);
        MDUtil.maybeSetTextColor$default(MDUtil.INSTANCE, fileChooserViewHolder.getNameView(), this.dialog.getWindowContext(), Integer.valueOf(C1051R.attr.md_color_content), (Integer) null, 4, (Object) null);
        return fileChooserViewHolder;
    }

    public void onBindViewHolder(FileChooserViewHolder fileChooserViewHolder, int i) {
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(fileChooserViewHolder, "holder");
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        File betterParent = FilesUtilExtKt.betterParent(file, context, this.allowFolderCreation, this.filter);
        if (betterParent != null && i == goUpIndex()) {
            ImageView iconView = fileChooserViewHolder.getIconView();
            if (this.isLightTheme) {
                i3 = C1051R.C1053drawable.icon_return_dark;
            } else {
                i3 = C1051R.C1053drawable.icon_return_light;
            }
            iconView.setImageResource(i3);
            fileChooserViewHolder.getNameView().setText(betterParent.getName());
            View view = fileChooserViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.setActivated(false);
        } else if (!this.allowFolderCreation || !this.currentFolder.canWrite() || i != newFolderIndex()) {
            int actualIndex = actualIndex(i);
            List<? extends File> list = this.contents;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            File file2 = (File) list.get(actualIndex);
            fileChooserViewHolder.getIconView().setImageResource(iconRes(file2));
            fileChooserViewHolder.getNameView().setText(file2.getName());
            View view2 = fileChooserViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            File file3 = this.selectedFile;
            String absolutePath = file3 != null ? file3.getAbsolutePath() : null;
            boolean absolutePath2 = file2.getAbsolutePath();
            if (absolutePath2 == null) {
                absolutePath2 = false;
            }
            view2.setActivated(Intrinsics.areEqual((Object) absolutePath, absolutePath2));
        } else {
            ImageView iconView2 = fileChooserViewHolder.getIconView();
            if (this.isLightTheme) {
                i2 = C1051R.C1053drawable.icon_new_folder_dark;
            } else {
                i2 = C1051R.C1053drawable.icon_new_folder_light;
            }
            iconView2.setImageResource(i2);
            TextView nameView = fileChooserViewHolder.getNameView();
            Context windowContext = this.dialog.getWindowContext();
            Integer num = this.folderCreationLabel;
            nameView.setText(windowContext.getString(num != null ? num.intValue() : C1051R.string.files_new_folder));
            View view3 = fileChooserViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
            view3.setActivated(false);
        }
    }

    private final int goUpIndex() {
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        return FilesUtilExtKt.hasParent(file, context, this.allowFolderCreation, this.filter) ? 0 : -1;
    }

    private final int newFolderIndex() {
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        return FilesUtilExtKt.hasParent(file, context, this.allowFolderCreation, this.filter) ? 1 : 0;
    }

    private final int actualIndex(int i) {
        File file = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        if (FilesUtilExtKt.hasParent(file, context, this.allowFolderCreation, this.filter)) {
            i--;
        }
        return (!this.currentFolder.canWrite() || !this.allowFolderCreation) ? i : i - 1;
    }

    private final int iconRes(File file) {
        if (this.isLightTheme) {
            if (file.isDirectory()) {
                return C1051R.C1053drawable.icon_folder_dark;
            }
            return C1051R.C1053drawable.icon_file_dark;
        } else if (file.isDirectory()) {
            return C1051R.C1053drawable.icon_folder_light;
        } else {
            return C1051R.C1053drawable.icon_file_light;
        }
    }

    private final int getSelectedIndex() {
        int i;
        if (this.selectedFile == null) {
            return -1;
        }
        List<? extends File> list = this.contents;
        if (list != null && list.isEmpty()) {
            return -1;
        }
        List<? extends File> list2 = this.contents;
        if (list2 != null) {
            i = 0;
            Iterator<? extends File> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String absolutePath = ((File) it.next()).getAbsolutePath();
                File file = this.selectedFile;
                if (Intrinsics.areEqual((Object) absolutePath, (Object) file != null ? file.getAbsolutePath() : null)) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        if (i <= -1) {
            return i;
        }
        File file2 = this.currentFolder;
        Context context = this.dialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        return FilesUtilExtKt.hasParent(file2, context, this.allowFolderCreation, this.filter) ? i + 1 : i;
    }
}
