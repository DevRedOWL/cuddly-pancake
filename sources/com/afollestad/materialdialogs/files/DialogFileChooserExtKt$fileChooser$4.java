package com.afollestad.materialdialogs.files;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogFileChooserExt.kt */
final class DialogFileChooserExtKt$fileChooser$4 extends Lambda implements Function1<File, Boolean> {
    public static final DialogFileChooserExtKt$fileChooser$4 INSTANCE = new DialogFileChooserExtKt$fileChooser$4();

    DialogFileChooserExtKt$fileChooser$4() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((File) obj));
    }

    public final boolean invoke(File file) {
        Intrinsics.checkParameterIsNotNull(file, "it");
        return !file.isHidden() && file.canRead();
    }
}
