package com.afollestad.materialdialogs.files;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "Ljava/io/File;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo51344k = 3, mo51345mv = {1, 1, 16})
@DebugMetadata(mo52052c = "com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1", mo52053f = "FileChooserAdapter.kt", mo52054i = {}, mo52055l = {}, mo52056m = "invokeSuspend", mo52057n = {}, mo52058s = {})
/* compiled from: FileChooserAdapter.kt */
final class FileChooserAdapter$switchDirectory$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends File>>, Object> {
    int label;

    /* renamed from: p$ */
    private CoroutineScope f1143p$;
    final /* synthetic */ FileChooserAdapter$switchDirectory$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FileChooserAdapter$switchDirectory$1$result$1(FileChooserAdapter$switchDirectory$1 fileChooserAdapter$switchDirectory$1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fileChooserAdapter$switchDirectory$1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkParameterIsNotNull(continuation, "completion");
        FileChooserAdapter$switchDirectory$1$result$1 fileChooserAdapter$switchDirectory$1$result$1 = new FileChooserAdapter$switchDirectory$1$result$1(this.this$0, continuation);
        fileChooserAdapter$switchDirectory$1$result$1.f1143p$ = (CoroutineScope) obj;
        return fileChooserAdapter$switchDirectory$1$result$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FileChooserAdapter$switchDirectory$1$result$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r7 = (java.lang.Boolean) r7.invoke(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0067 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            if (r0 != 0) goto L_0x00ce
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.CoroutineScope r9 = r8.f1143p$
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1 r9 = r8.this$0
            java.io.File r9 = r9.$directory
            java.io.File[] r9 = r9.listFiles()
            r0 = 0
            if (r9 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            java.io.File[] r9 = new java.io.File[r0]
        L_0x001a:
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1 r1 = r8.this$0
            com.afollestad.materialdialogs.files.FileChooserAdapter r1 = r1.this$0
            boolean r1 = r1.onlyFolders
            java.lang.String r2 = "it"
            r3 = 1
            if (r1 == 0) goto L_0x007a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            int r4 = r9.length
            r5 = 0
        L_0x0030:
            if (r5 >= r4) goto L_0x006a
            r6 = r9[r5]
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r2)
            boolean r7 = r6.isDirectory()
            if (r7 == 0) goto L_0x0059
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1 r7 = r8.this$0
            com.afollestad.materialdialogs.files.FileChooserAdapter r7 = r7.this$0
            kotlin.jvm.functions.Function1 r7 = r7.filter
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x0054
            boolean r7 = r7.booleanValue()
            goto L_0x0055
        L_0x0054:
            r7 = 1
        L_0x0055:
            if (r7 == 0) goto L_0x0059
            r7 = 1
            goto L_0x005a
        L_0x0059:
            r7 = 0
        L_0x005a:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0067
            r1.add(r6)
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0030
        L_0x006a:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1$invokeSuspend$$inlined$sortedBy$1 r9 = new com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1$invokeSuspend$$inlined$sortedBy$1
            r9.<init>()
            java.util.Comparator r9 = (java.util.Comparator) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r1, r9)
            goto L_0x00cd
        L_0x007a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            int r4 = r9.length
            r5 = 0
        L_0x0083:
            if (r5 >= r4) goto L_0x00b2
            r6 = r9[r5]
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1 r7 = r8.this$0
            com.afollestad.materialdialogs.files.FileChooserAdapter r7 = r7.this$0
            kotlin.jvm.functions.Function1 r7 = r7.filter
            if (r7 == 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r2)
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x00a1
            boolean r7 = r7.booleanValue()
            goto L_0x00a2
        L_0x00a1:
            r7 = 1
        L_0x00a2:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00af
            r1.add(r6)
        L_0x00af:
            int r5 = r5 + 1
            goto L_0x0083
        L_0x00b2:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r9 = 2
            kotlin.jvm.functions.Function1[] r9 = new kotlin.jvm.functions.Function1[r9]
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1$4 r2 = com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1.C10494.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r9[r0] = r2
            com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1$5 r0 = com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1.C10505.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r9[r3] = r0
            java.util.Comparator r9 = kotlin.comparisons.ComparisonsKt.compareBy((kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[]) r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r1, r9)
        L_0x00cd:
            return r9
        L_0x00ce:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.files.FileChooserAdapter$switchDirectory$1$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
