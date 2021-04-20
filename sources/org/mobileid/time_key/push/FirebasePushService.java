package org.mobileid.time_key.push;

import android.content.ComponentCallbacks;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.qualifier.Qualifier;
import org.mobileid.time_key.push.worker.OnMessageDeletedWorker;
import p008c.p009a.p024e.p027c.p028c.C0976a;
import p008c.p009a.p024e.p027c.p028c.C0977b;
import p008c.p009a.p024e.p027c.p028c.C0978c;
import p008c.p009a.p024e.p027c.p028c.C0979d;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo51343d2 = {"Lorg/mobileid/time_key/push/FirebasePushService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "onDeletedMessages", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", "token", "onNewToken", "(Ljava/lang/String;)V", "Lorg/mobileid/time_key/push/action/PushActionFactory;", "pushActionFactory$delegate", "Lkotlin/Lazy;", "getPushActionFactory", "()Lorg/mobileid/time_key/push/action/PushActionFactory;", "pushActionFactory", "<init>", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class FirebasePushService extends FirebaseMessagingService {

    /* renamed from: a */
    public final Lazy f6397a = LazyKt.lazy(new C5501a(this, (Qualifier) null, (Function0) null));

    /* renamed from: org.mobileid.time_key.push.FirebasePushService$a */
    public static final class C5501a extends Lambda implements Function0<C0978c> {

        /* renamed from: a */
        public final /* synthetic */ ComponentCallbacks f6398a;

        /* renamed from: b */
        public final /* synthetic */ Qualifier f6399b = null;

        /* renamed from: c */
        public final /* synthetic */ Function0 f6400c = null;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5501a(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0) {
            super(0);
            this.f6398a = componentCallbacks;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [c.a.e.c.c.c, java.lang.Object] */
        public final C0978c invoke() {
            ComponentCallbacks componentCallbacks = this.f6398a;
            return ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope().get((KClass<?>) Reflection.getOrCreateKotlinClass(C0978c.class), this.f6399b, (Function0<DefinitionParameters>) this.f6400c);
        }
    }

    public void onDeletedMessages() {
        super.onDeletedMessages();
        WorkRequest build = new OneTimeWorkRequest.Builder(OnMessageDeletedWorker.class).build();
        Intrinsics.checkNotNullExpressionValue(build, "OneTimeWorkRequest.Build…\n                .build()");
        WorkManager.getInstance(getApplicationContext()).enqueue((WorkRequest) (OneTimeWorkRequest) build);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        C0977b bVar;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
        String str = data.get("code");
        if (str != null) {
            C0978c cVar = (C0978c) this.f6397a.getValue();
            if (cVar != null) {
                Intrinsics.checkNotNullParameter(str, "pushActionCode");
                int hashCode = str.hashCode();
                if (hashCode != -1996763020) {
                    if (hashCode == -1655974669 && str.equals("activate")) {
                        bVar = new C0976a(cVar.f1111a);
                    }
                    throw new IllegalStateException("Action is not supported: " + str);
                }
                if (str.equals("deactivate")) {
                    bVar = new C0979d(cVar.f1111a);
                }
                throw new IllegalStateException("Action is not supported: " + str);
                bVar.mo13037a(data);
                return;
            }
            throw null;
        }
    }

    public void onNewToken(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        super.onNewToken(str);
    }
}
