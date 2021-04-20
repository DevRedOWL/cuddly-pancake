package com.afollestad.materialdialogs.files.util;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.afollestad.materialdialogs.MaterialDialog;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0002`\bH\u0000\u001a\u001c\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a6\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\u0002`\bH\u0000\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0015"}, mo51343d2 = {"betterParent", "Ljava/io/File;", "context", "Landroid/content/Context;", "writeable", "", "filter", "Lkotlin/Function1;", "Lcom/afollestad/materialdialogs/files/FileFilter;", "friendlyName", "", "kotlin.jvm.PlatformType", "hasParent", "hasPermission", "permission", "hasReadStoragePermission", "Lcom/afollestad/materialdialogs/MaterialDialog;", "hasWriteStoragePermission", "isExternalStorage", "isRoot", "jumpOverEmulated", "files"}, mo51344k = 2, mo51345mv = {1, 1, 16})
/* compiled from: FilesUtilExt.kt */
public final class FilesUtilExtKt {
    public static final boolean hasParent(File file, Context context, boolean z, Function1<? super File, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(file, "$this$hasParent");
        Intrinsics.checkParameterIsNotNull(context, "context");
        return betterParent(file, context, z, function1) != null;
    }

    public static final boolean isExternalStorage(File file, Context context) {
        Intrinsics.checkParameterIsNotNull(file, "$this$isExternalStorage");
        Intrinsics.checkParameterIsNotNull(context, "context");
        String absolutePath = file.getAbsolutePath();
        File externalFilesDir = ContextExtKt.getExternalFilesDir(context);
        return Intrinsics.areEqual((Object) absolutePath, (Object) externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
    }

    public static final boolean isRoot(File file) {
        Intrinsics.checkParameterIsNotNull(file, "$this$isRoot");
        return Intrinsics.areEqual((Object) file.getAbsolutePath(), (Object) "/");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r5 = r5.getParentFile();
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File betterParent(java.io.File r5, android.content.Context r6, boolean r7, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> r8) {
        /*
            java.lang.String r0 = "$this$betterParent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            boolean r0 = isExternalStorage(r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.io.File r5 = com.afollestad.materialdialogs.files.util.ContextExtKt.getExternalFilesDir(r6)
            if (r5 == 0) goto L_0x0022
            java.io.File r5 = r5.getParentFile()
            if (r5 == 0) goto L_0x0022
            java.io.File r5 = r5.getParentFile()
            goto L_0x0028
        L_0x0022:
            r5 = r1
            goto L_0x0028
        L_0x0024:
            java.io.File r5 = r5.getParentFile()
        L_0x0028:
            if (r5 == 0) goto L_0x0078
            if (r7 == 0) goto L_0x0032
            boolean r6 = r5.canWrite()
            if (r6 == 0) goto L_0x0038
        L_0x0032:
            boolean r6 = r5.canRead()
            if (r6 != 0) goto L_0x0039
        L_0x0038:
            return r1
        L_0x0039:
            java.io.File[] r6 = r5.listFiles()
            if (r6 == 0) goto L_0x006c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            int r0 = r6.length
            r2 = 0
        L_0x0048:
            if (r2 >= r0) goto L_0x0069
            r3 = r6[r2]
            if (r8 == 0) goto L_0x0060
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.Object r4 = r8.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0060
            boolean r4 = r4.booleanValue()
            goto L_0x0061
        L_0x0060:
            r4 = 1
        L_0x0061:
            if (r4 == 0) goto L_0x0066
            r7.add(r3)
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0069:
            java.util.List r7 = (java.util.List) r7
            goto L_0x0070
        L_0x006c:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0070:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0077
            return r1
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.files.util.FilesUtilExtKt.betterParent(java.io.File, android.content.Context, boolean, kotlin.jvm.functions.Function1):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r3.getParentFile();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File jumpOverEmulated(java.io.File r2, android.content.Context r3) {
        /*
            java.lang.String r0 = "$this$jumpOverEmulated"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.io.File r3 = com.afollestad.materialdialogs.files.util.ContextExtKt.getExternalFilesDir(r3)
            if (r3 == 0) goto L_0x0025
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.String r0 = r0.getAbsolutePath()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0025
            return r3
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.files.util.FilesUtilExtKt.jumpOverEmulated(java.io.File, android.content.Context):java.io.File");
    }

    public static final String friendlyName(File file, Context context) {
        Intrinsics.checkParameterIsNotNull(file, "$this$friendlyName");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (isExternalStorage(file, context)) {
            return "External Storage";
        }
        if (isRoot(file)) {
            return "Root";
        }
        return file.getName();
    }

    public static final boolean hasPermission(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "$this$hasPermission");
        Intrinsics.checkParameterIsNotNull(str, "permission");
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    public static final boolean hasReadStoragePermission(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$hasReadStoragePermission");
        return hasPermission(materialDialog.getWindowContext(), "android.permission.READ_EXTERNAL_STORAGE");
    }

    public static final boolean hasWriteStoragePermission(MaterialDialog materialDialog) {
        Intrinsics.checkParameterIsNotNull(materialDialog, "$this$hasWriteStoragePermission");
        return hasPermission(materialDialog.getWindowContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
