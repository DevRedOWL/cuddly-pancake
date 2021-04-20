package org.mobileid.time_key.key_watcher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.Koin;
import org.koin.core.KoinComponent;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p008c.p009a.p024e.p026b.C0962a;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo51343d2 = {"Lorg/mobileid/time_key/key_watcher/KeyWatcherBroadcastReceiver;", "Lorg/koin/core/KoinComponent;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Intent;", "intent", "", "onKeyEnd", "(Landroid/content/Intent;)V", "onKeyStart", "()V", "Landroid/content/Context;", "context", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager$delegate", "Lkotlin/Lazy;", "getTimeKeyManager", "()Lorg/mobileid/time_key/manager/TimeKeyManager;", "timeKeyManager", "<init>", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class KeyWatcherBroadcastReceiver extends BroadcastReceiver implements KoinComponent {

    /* renamed from: a */
    public final Lazy f6393a = LazyKt.lazy(new C5500a(getKoin().getRootScope(), (Qualifier) null, (Function0) null));

    /* renamed from: org.mobileid.time_key.key_watcher.KeyWatcherBroadcastReceiver$a */
    public static final class C5500a extends Lambda implements Function0<C0962a> {

        /* renamed from: a */
        public final /* synthetic */ Scope f6394a;

        /* renamed from: b */
        public final /* synthetic */ Qualifier f6395b = null;

        /* renamed from: c */
        public final /* synthetic */ Function0 f6396c = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5500a(Scope scope, Qualifier qualifier, Function0 function0) {
            super(0);
            this.f6394a = scope;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, c.a.e.b.a] */
        public final C0962a invoke() {
            return this.f6394a.get((KClass<?>) Reflection.getOrCreateKotlinClass(C0962a.class), this.f6395b, (Function0<DefinitionParameters>) this.f6396c);
        }
    }

    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        String string;
        Bundle extras2;
        String string2;
        if (context != null && intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("ACTION")) != null) {
            Intrinsics.checkNotNullExpressionValue(string, "intent?.extras?.getString(ACTION) ?: return");
            int hashCode = string.hashCode();
            if (hashCode != -1728086629) {
                if (hashCode != -1727678298) {
                    if (hashCode == 1980572282) {
                        string.equals("CANCEL");
                    }
                } else if (string.equals("DATE_TILL") && (extras2 = intent.getExtras()) != null && (string2 = extras2.getString("TIME_KEY_ID")) != null) {
                    Intrinsics.checkNotNullExpressionValue(string2, "intent.extras?.getString(TIME_KEY_ID) ?: return");
                    ((C0962a) this.f6393a.getValue()).mo13027a(string2);
                }
            } else if (string.equals("DATE_FROM")) {
                ((C0962a) this.f6393a.getValue()).mo13026a();
            }
        }
    }
}
