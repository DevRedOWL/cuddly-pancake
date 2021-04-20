package com.afollestad.materialdialogs.files;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.files.util.ContextExtKt;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a«\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0002`\t2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2>\b\u0002\u0010\u000f\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0005*\u00020\u0001H\u0007¨\u0006\u0019"}, mo51343d2 = {"folderChooser", "Lcom/afollestad/materialdialogs/MaterialDialog;", "context", "Landroid/content/Context;", "initialDirectory", "Ljava/io/File;", "filter", "Lkotlin/Function1;", "", "Lcom/afollestad/materialdialogs/files/FileFilter;", "waitForPositiveButton", "emptyTextRes", "", "allowFolderCreation", "folderCreationLabel", "selection", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dialog", "file", "", "Lcom/afollestad/materialdialogs/files/FileCallback;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function1;ZIZLjava/lang/Integer;Lkotlin/jvm/functions/Function2;)Lcom/afollestad/materialdialogs/MaterialDialog;", "selectedFolder", "files"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: DialogFolderChooserExt.kt */
public final class DialogFolderChooserExtKt {
    public static final File selectedFolder(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$selectedFolder");
        View findViewById = DialogCustomViewExtKt.getCustomView(materialDialog).findViewById(C1051R.C1054id.list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "getCustomView().findViewById(R.id.list)");
        RecyclerView.Adapter adapter = ((DialogRecyclerView) findViewById).getAdapter();
        if (!(adapter instanceof FileChooserAdapter)) {
            adapter = null;
        }
        FileChooserAdapter fileChooserAdapter = (FileChooserAdapter) adapter;
        if (fileChooserAdapter != null) {
            return fileChooserAdapter.getSelectedFile();
        }
        return null;
    }

    public static /* synthetic */ MaterialDialog folderChooser$default(MaterialDialog materialDialog, Context context, File file, Function1 function1, boolean z, int i, boolean z2, Integer num, Function2 function2, int i2, Object obj) {
        int i3 = i2;
        return folderChooser(materialDialog, context, (i3 & 2) != 0 ? ContextExtKt.getExternalFilesDir(context) : file, (i3 & 4) != 0 ? null : function1, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? C1051R.string.files_default_empty_text : i, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : function2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.afollestad.materialdialogs.MaterialDialog folderChooser(com.afollestad.materialdialogs.MaterialDialog r15, android.content.Context r16, java.io.File r17, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r18, boolean r19, int r20, boolean r21, java.lang.Integer r22, kotlin.jvm.functions.Function2<? super com.afollestad.materialdialogs.MaterialDialog, ? super java.io.File, kotlin.Unit> r23) {
        /*
            r10 = r15
            r11 = r23
            java.lang.String r0 = "$this$folderChooser"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            java.lang.String r0 = "context"
            r1 = r16
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            if (r21 == 0) goto L_0x002c
            boolean r0 = com.afollestad.materialdialogs.files.util.FilesUtilExtKt.hasWriteStoragePermission(r15)
            if (r0 == 0) goto L_0x001e
            if (r18 != 0) goto L_0x003a
            com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$2 r0 = com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$2.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L_0x0038
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must have the WRITE_EXTERNAL_STORAGE permission first."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x002c:
            boolean r0 = com.afollestad.materialdialogs.files.util.FilesUtilExtKt.hasReadStoragePermission(r15)
            if (r0 == 0) goto L_0x00ea
            if (r18 != 0) goto L_0x003a
            com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$4 r0 = com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$4.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
        L_0x0038:
            r9 = r0
            goto L_0x003c
        L_0x003a:
            r9 = r18
        L_0x003c:
            r12 = 0
            if (r17 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x00dc
            int r0 = com.afollestad.materialdialogs.files.C1051R.layout.md_file_chooser_base
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 54
            r8 = 0
            r0 = r15
            com.afollestad.materialdialogs.customview.DialogCustomViewExtKt.customView$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.afollestad.materialdialogs.WhichButton r0 = com.afollestad.materialdialogs.WhichButton.POSITIVE
            com.afollestad.materialdialogs.actions.DialogActionExtKt.setActionButtonEnabled(r15, r0, r12)
            android.view.View r0 = com.afollestad.materialdialogs.customview.DialogCustomViewExtKt.getCustomView(r15)
            int r1 = com.afollestad.materialdialogs.files.C1051R.C1054id.list
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "customView.findViewById(R.id.list)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r12 = r1
            com.afollestad.materialdialogs.internal.list.DialogRecyclerView r12 = (com.afollestad.materialdialogs.internal.list.DialogRecyclerView) r12
            int r1 = com.afollestad.materialdialogs.files.C1051R.C1054id.empty_text
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "customView.findViewById(R.id.empty_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = r20
            r13.setText(r0)
            com.afollestad.materialdialogs.utils.MDUtil r2 = com.afollestad.materialdialogs.utils.MDUtil.INSTANCE
            android.content.Context r4 = r15.getWindowContext()
            int r0 = com.afollestad.materialdialogs.files.C1051R.attr.md_color_content
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r7 = 4
            r3 = r13
            com.afollestad.materialdialogs.utils.MDUtil.maybeSetTextColor$default(r2, r3, r4, r5, r6, r7, r8)
            r12.attach(r15)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r15.getWindowContext()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r0
            r12.setLayoutManager(r0)
            com.afollestad.materialdialogs.files.FileChooserAdapter r14 = new com.afollestad.materialdialogs.files.FileChooserAdapter
            r5 = 1
            r0 = r14
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r13
            r6 = r9
            r7 = r21
            r8 = r22
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r14
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r12.setAdapter(r0)
            if (r19 == 0) goto L_0x00db
            if (r11 == 0) goto L_0x00db
            r0 = 0
            r1 = 0
            com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$6 r2 = new com.afollestad.materialdialogs.files.DialogFolderChooserExtKt$folderChooser$6
            r2.<init>(r15, r14, r11)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 3
            r4 = 0
            r16 = r15
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            com.afollestad.materialdialogs.MaterialDialog.positiveButton$default(r16, r17, r18, r19, r20, r21)
        L_0x00db:
            return r10
        L_0x00dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The initial directory is null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must have the READ_EXTERNAL_STORAGE permission first."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.files.DialogFolderChooserExtKt.folderChooser(com.afollestad.materialdialogs.MaterialDialog, android.content.Context, java.io.File, kotlin.jvm.functions.Function1, boolean, int, boolean, java.lang.Integer, kotlin.jvm.functions.Function2):com.afollestad.materialdialogs.MaterialDialog");
    }
}
