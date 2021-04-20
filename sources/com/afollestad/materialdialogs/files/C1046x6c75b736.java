package com.afollestad.materialdialogs.files;

import com.afollestad.materialdialogs.MaterialDialog;
import java.io.File;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/afollestad/materialdialogs/MaterialDialog;", "input", "", "invoke", "com/afollestad/materialdialogs/files/DialogFileChooserExtKt$showNewFolderCreator$dialog$1$1"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* renamed from: com.afollestad.materialdialogs.files.DialogFileChooserExtKt$showNewFolderCreator$$inlined$show$lambda$1 */
/* compiled from: DialogFileChooserExt.kt */
final class C1046x6c75b736 extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {
    final /* synthetic */ Integer $folderCreationLabel$inlined;
    final /* synthetic */ Function0 $onCreation$inlined;
    final /* synthetic */ File $parent$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1046x6c75b736(Integer num, File file, Function0 function0) {
        super(2);
        this.$folderCreationLabel$inlined = num;
        this.$parent$inlined = file;
        this.$onCreation$inlined = function0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((MaterialDialog) obj, (CharSequence) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(MaterialDialog materialDialog, CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "<anonymous parameter 0>");
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        File file = this.$parent$inlined;
        String obj = charSequence.toString();
        if (obj != null) {
            new File(file, StringsKt.trim((CharSequence) obj).toString()).mkdir();
            this.$onCreation$inlined.invoke();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
