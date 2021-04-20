package com.afollestad.materialdialogs.files;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.files.util.ContextExtKt;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a«\u0001\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0002`\f2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2>\b\u0002\u0010\u0012\u001a8\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013j\u0002`\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\b*\u00020\u0004H\u0007\u001a3\u0010\u001b\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eH\u0000¢\u0006\u0002\u0010\u001f*n\u0010 \"4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001324\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013*&\u0010!\"\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¨\u0006\""}, mo51343d2 = {"blockReservedCharacters", "", "Landroid/widget/EditText;", "fileChooser", "Lcom/afollestad/materialdialogs/MaterialDialog;", "context", "Landroid/content/Context;", "initialDirectory", "Ljava/io/File;", "filter", "Lkotlin/Function1;", "", "Lcom/afollestad/materialdialogs/files/FileFilter;", "waitForPositiveButton", "emptyTextRes", "", "allowFolderCreation", "folderCreationLabel", "selection", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "dialog", "file", "Lcom/afollestad/materialdialogs/files/FileCallback;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function1;ZIZLjava/lang/Integer;Lkotlin/jvm/functions/Function2;)Lcom/afollestad/materialdialogs/MaterialDialog;", "selectedFile", "showNewFolderCreator", "parent", "onCreation", "Lkotlin/Function0;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/io/File;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "FileCallback", "FileFilter", "files"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: DialogFileChooserExt.kt */
public final class DialogFileChooserExtKt {
    public static final File selectedFile(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$selectedFile");
        View findViewById = DialogCustomViewExtKt.getCustomView(materialDialog).findViewById(C1051R.C1054id.list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "customView.findViewById(R.id.list)");
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

    public static /* synthetic */ MaterialDialog fileChooser$default(MaterialDialog materialDialog, Context context, File file, Function1 function1, boolean z, int i, boolean z2, Integer num, Function2 function2, int i2, Object obj) {
        int i3 = i2;
        return fileChooser(materialDialog, context, (i3 & 2) != 0 ? ContextExtKt.getExternalFilesDir(context) : file, (i3 & 4) != 0 ? null : function1, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? C1051R.string.files_default_empty_text : i, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : function2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.afollestad.materialdialogs.MaterialDialog fileChooser(com.afollestad.materialdialogs.MaterialDialog r16, android.content.Context r17, java.io.File r18, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r19, boolean r20, int r21, boolean r22, java.lang.Integer r23, kotlin.jvm.functions.Function2<? super com.afollestad.materialdialogs.MaterialDialog, ? super java.io.File, kotlin.Unit> r24) {
        /*
            r10 = r16
            r11 = r24
            java.lang.String r0 = "$this$fileChooser"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "context"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            if (r22 == 0) goto L_0x002d
            boolean r0 = com.afollestad.materialdialogs.files.util.FilesUtilExtKt.hasWriteStoragePermission(r16)
            if (r0 == 0) goto L_0x001f
            if (r19 != 0) goto L_0x003b
            com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$2 r0 = com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$2.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L_0x0039
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must have the WRITE_EXTERNAL_STORAGE permission first."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x002d:
            boolean r0 = com.afollestad.materialdialogs.files.util.FilesUtilExtKt.hasReadStoragePermission(r16)
            if (r0 == 0) goto L_0x00f2
            if (r19 != 0) goto L_0x003b
            com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$4 r0 = com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$4.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
        L_0x0039:
            r9 = r0
            goto L_0x003d
        L_0x003b:
            r9 = r19
        L_0x003d:
            r12 = 0
            if (r18 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x00e4
            int r0 = com.afollestad.materialdialogs.files.C1051R.layout.md_file_chooser_base
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 54
            r8 = 0
            r0 = r16
            com.afollestad.materialdialogs.customview.DialogCustomViewExtKt.customView$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.afollestad.materialdialogs.WhichButton r0 = com.afollestad.materialdialogs.WhichButton.POSITIVE
            com.afollestad.materialdialogs.actions.DialogActionExtKt.setActionButtonEnabled(r10, r0, r12)
            android.view.View r0 = com.afollestad.materialdialogs.customview.DialogCustomViewExtKt.getCustomView(r16)
            int r1 = com.afollestad.materialdialogs.files.C1051R.C1054id.list
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "customView.findViewById(R.id.list)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r13 = r1
            com.afollestad.materialdialogs.internal.list.DialogRecyclerView r13 = (com.afollestad.materialdialogs.internal.list.DialogRecyclerView) r13
            int r1 = com.afollestad.materialdialogs.files.C1051R.C1054id.empty_text
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "customView.findViewById(R.id.empty_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            r0 = r21
            r14.setText(r0)
            com.afollestad.materialdialogs.utils.MDUtil r2 = com.afollestad.materialdialogs.utils.MDUtil.INSTANCE
            android.content.Context r4 = r16.getWindowContext()
            int r0 = com.afollestad.materialdialogs.files.C1051R.attr.md_color_content
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r7 = 4
            r3 = r14
            com.afollestad.materialdialogs.utils.MDUtil.maybeSetTextColor$default(r2, r3, r4, r5, r6, r7, r8)
            r13.attach(r10)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r16.getWindowContext()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r0
            r13.setLayoutManager(r0)
            com.afollestad.materialdialogs.files.FileChooserAdapter r15 = new com.afollestad.materialdialogs.files.FileChooserAdapter
            r5 = 0
            r0 = r15
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r9
            r7 = r22
            r8 = r23
            r9 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r15
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r13.setAdapter(r0)
            if (r20 == 0) goto L_0x00e3
            if (r11 == 0) goto L_0x00e3
            com.afollestad.materialdialogs.WhichButton r0 = com.afollestad.materialdialogs.WhichButton.POSITIVE
            com.afollestad.materialdialogs.actions.DialogActionExtKt.setActionButtonEnabled(r10, r0, r12)
            r0 = 0
            r1 = 0
            com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$6 r2 = new com.afollestad.materialdialogs.files.DialogFileChooserExtKt$fileChooser$6
            r2.<init>(r10, r15, r11)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = 3
            r4 = 0
            r17 = r16
            r18 = r0
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r4
            com.afollestad.materialdialogs.MaterialDialog.positiveButton$default(r17, r18, r19, r20, r21, r22)
        L_0x00e3:
            return r10
        L_0x00e4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The initial directory is null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00f2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must have the READ_EXTERNAL_STORAGE permission first."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.files.DialogFileChooserExtKt.fileChooser(com.afollestad.materialdialogs.MaterialDialog, android.content.Context, java.io.File, kotlin.jvm.functions.Function1, boolean, int, boolean, java.lang.Integer, kotlin.jvm.functions.Function2):com.afollestad.materialdialogs.MaterialDialog");
    }

    public static final void showNewFolderCreator(MaterialDialog materialDialog, File file, Integer num, Function0<Unit> function0) {
        Integer num2;
        File file2 = file;
        Integer num3 = num;
        Function0<Unit> function02 = function0;
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$showNewFolderCreator");
        Intrinsics.checkParameterIsNotNull(file2, CategoryItem.Fields.parent);
        Intrinsics.checkParameterIsNotNull(function02, "onCreation");
        MaterialDialog materialDialog2 = new MaterialDialog(materialDialog.getWindowContext(), (DialogBehavior) null, 2, (DefaultConstructorMarker) null);
        if (num3 != null) {
            num2 = num3;
        } else {
            num2 = Integer.valueOf(C1051R.string.files_new_folder);
        }
        MaterialDialog.title$default(materialDialog2, num2, (String) null, 2, (Object) null);
        DialogInputExtKt.input$default(materialDialog2, (String) null, Integer.valueOf(C1051R.string.files_new_folder_hint), (CharSequence) null, (Integer) null, 0, (Integer) null, false, false, new C1046x6c75b736(num3, file2, function02), 253, (Object) null);
        materialDialog2.show();
        blockReservedCharacters(DialogInputExtKt.getInputField(materialDialog2));
    }

    private static final void blockReservedCharacters(EditText editText) {
        editText.setFilters((InputFilter[]) ArraysKt.plus((T[]) editText.getFilters(), DialogFileChooserExtKt$blockReservedCharacters$1.INSTANCE));
    }
}
