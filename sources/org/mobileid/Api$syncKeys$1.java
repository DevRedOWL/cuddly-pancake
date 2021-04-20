package org.mobileid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H@"}, mo51343d2 = {"syncKeys", "", "notify", "", "continuation", "Lkotlin/coroutines/Continuation;"}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
@DebugMetadata(mo52052c = "org.mobileid.Api", mo52053f = "Api.kt", mo52054i = {0, 0}, mo52055l = {80}, mo52056m = "syncKeys", mo52057n = {"this", "notify"}, mo52058s = {"L$0", "Z$0"})
public final class Api$syncKeys$1 extends ContinuationImpl {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Api this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Api$syncKeys$1(Api api, Continuation continuation) {
        super(continuation);
        this.this$0 = api;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.syncKeys(false, this);
    }
}
