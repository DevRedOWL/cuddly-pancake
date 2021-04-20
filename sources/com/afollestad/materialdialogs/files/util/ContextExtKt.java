package com.afollestad.materialdialogs.files.util;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, mo51343d2 = {"getExternalFilesDir", "Ljava/io/File;", "Landroid/content/Context;", "files"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: ContextExt.kt */
public final class ContextExtKt {
    public static final File getExternalFilesDir(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$getExternalFilesDir");
        return context.getExternalFilesDir((String) null);
    }
}
