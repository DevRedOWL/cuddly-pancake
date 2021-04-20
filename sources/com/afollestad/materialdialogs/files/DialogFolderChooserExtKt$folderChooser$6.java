package com.afollestad.materialdialogs.files;

import com.afollestad.materialdialogs.MaterialDialog;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogFolderChooserExt.kt */
final class DialogFolderChooserExtKt$folderChooser$6 extends Lambda implements Function1<MaterialDialog, Unit> {
    final /* synthetic */ FileChooserAdapter $adapter;
    final /* synthetic */ Function2 $selection;
    final /* synthetic */ MaterialDialog $this_folderChooser;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogFolderChooserExtKt$folderChooser$6(MaterialDialog materialDialog, FileChooserAdapter fileChooserAdapter, Function2 function2) {
        super(1);
        this.$this_folderChooser = materialDialog;
        this.$adapter = fileChooserAdapter;
        this.$selection = function2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MaterialDialog) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "it");
        File selectedFile = this.$adapter.getSelectedFile();
        if (selectedFile != null) {
            this.$selection.invoke(this.$this_folderChooser, selectedFile);
        }
    }
}
