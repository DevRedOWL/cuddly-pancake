package org.mobileid;

import android.content.Context;
import android.net.Uri;
import android.nfc.NfcManager;
import android.os.Bundle;
import android.util.Base64;
import androidx.lifecycle.Observer;
import com.drew.metadata.mov.QuickTimeAtomTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.koin.core.Koin;
import org.koin.core.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.mobileid.access.key.EncryptedKey;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyFactory;
import org.mobileid.access.key.KeysObserver;
import org.mobileid.access.key.NetworkKey;
import org.mobileid.access.key.PersonalKey;
import org.mobileid.access.key.TimeKey;
import org.mobileid.access.key_sort.NotSorted;
import org.mobileid.access.key_sort.Sort;
import org.mobileid.requester.background_requester.RequesterForegroundService;
import org.mobileid.time_key.util.TimeKeyParams;
import p008c.p009a.p010a.C0837c;
import p008c.p009a.p010a.p011d.C0840a;
import p008c.p009a.p010a.p012e.C0843a;
import p008c.p009a.p010a.p012e.C0844b;
import p008c.p009a.p010a.p012e.C0845c;
import p008c.p009a.p010a.p013f.C0846a;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p017d.p019b.C0933e;
import p008c.p009a.p017d.p020c.C0943g;
import p008c.p009a.p017d.p021d.C0946a;
import p008c.p009a.p017d.p023e.C0953b;
import p008c.p009a.p024e.p025a.C0959a;
import p008c.p009a.p024e.p025a.C0960b;
import p008c.p009a.p024e.p027c.C0972a;
import p008c.p009a.p031f.C0985a;
import p008c.p009a.p031f.C0986b;
import p008c.p009a.p031f.C0988c;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Å\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t*\u0001&\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0001\u0001\u0001\u0001\u0001B\n\b\u0002¢\u0006\u0005\b\u0001\u0010\\J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u0010+J\u001d\u0010/\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J)\u00103\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180 012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J'\u0010:\u001a\u0004\u0018\u0001052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00042\u0006\u00106\u001a\u000205¢\u0006\u0004\b:\u0010;J'\u0010=\u001a\u0002052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b=\u0010>J'\u0010?\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180 01¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bC\u0010\rJ!\u0010D\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bD\u0010EJ7\u0010J\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u00042\b\b\u0001\u0010I\u001a\u00020#¢\u0006\u0004\bJ\u0010KJ7\u0010M\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\b\b\u0001\u0010I\u001a\u00020#¢\u0006\u0004\bM\u0010KJ\u001d\u0010N\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020)¢\u0006\u0004\bN\u0010OJ;\u0010T\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010P\u001a\u00020)2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00070Q2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bT\u0010UJJ\u0010Y\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u00042!\u0010S\u001a\u001d\u0012\u0013\u0012\u00110R¢\u0006\f\bW\u0012\b\b<\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020\u00070Q2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b]\u0010^J\u001d\u0010`\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010_\u001a\u00020#¢\u0006\u0004\b`\u0010aJ\u001d\u0010c\u001a\u00020)2\b\b\u0002\u0010b\u001a\u00020)H@ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ%\u0010e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00182\u0006\u0010b\u001a\u00020)¢\u0006\u0004\be\u0010fR\u001d\u0010l\u001a\u00020g8B@\u0002X\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR$\u0010n\u001a\u0004\u0018\u00010m8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010t\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010^R\u001d\u0010}\u001a\u00020y8B@\u0002X\u0002¢\u0006\f\n\u0004\bz\u0010i\u001a\u0004\b{\u0010|R \u0010\u0001\u001a\u00020~8B@\u0002X\u0002¢\u0006\u000e\n\u0004\b\u0010i\u001a\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00030\u00018B@\u0002X\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010i\u001a\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00030\u00018B@\u0002X\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010i\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\n0\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, mo51343d2 = {"Lorg/mobileid/Api;", "Lorg/koin/core/KoinComponent;", "Landroid/content/Context;", "context", "", "keyPrefix", "key", "", "addKeyAndApplyToServices", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/mobileid/Api$RequestAccessListener;", "listener", "addRequesterListener", "(Landroid/content/Context;Lorg/mobileid/Api$RequestAccessListener;)V", "mobileQr", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lorg/mobileid/Api$MobileQRCheckResult;", "checkMobileQR", "(Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)Lorg/mobileid/Api$MobileQRCheckResult;", "Lorg/mobileid/time_key/util/TimeKeyParams;", "timeKeyParams", "enableIfNotTimeKeys", "(Landroid/content/Context;Lorg/mobileid/time_key/util/TimeKeyParams;Lkotlinx/coroutines/CoroutineScope;)V", "Lorg/mobileid/access/key/Key;", "getDefaultKey", "(Landroid/content/Context;)Lorg/mobileid/access/key/Key;", "keyId", "getKey", "(Landroid/content/Context;Ljava/lang/String;)Lorg/mobileid/access/key/Key;", "Lorg/mobileid/access/key_sort/Sort;", "sort", "", "getKeys", "(Landroid/content/Context;Lorg/mobileid/access/key_sort/Sort;)Ljava/util/List;", "", "getPowerCorrection", "(Landroid/content/Context;)I", "org/mobileid/Api$getRequesterListenersAdapter$1", "getRequesterListenersAdapter", "(Landroid/content/Context;)Lorg/mobileid/Api$getRequesterListenersAdapter$1;", "", "isRequestAccessByScreenOnEnabled", "(Landroid/content/Context;)Z", "isRequestAccessHandsFreeEnabled", "isRequestAccessViaNFCAvailable", "isRequestAccessViaNFCEnabled", "keyExists", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroidx/lifecycle/Observer;", "observer", "observeKeyChanges", "(Landroidx/lifecycle/Observer;Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/net/Uri;", "uri", "parseAcceptUrl", "(Landroid/content/Context;Landroid/net/Uri;)Z", "authority", "parseInvitationUrl", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;", "name", "prepareDemandUrl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "removeKey", "(Landroid/content/Context;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;)V", "removeKeyChangesObserver", "(Landroidx/lifecycle/Observer;)V", "removeRequesterListener", "requestAccess", "(Landroid/content/Context;Ljava/lang/String;)V", "enabled", "notificationText", "errorNotificationText", "notificationIcon", "requestAccessByScreenOn", "(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;I)V", "notificationErrorText", "requestAccessHandsFree", "requestAccessViaNFC", "(Landroid/content/Context;Z)V", "vibrate", "Lkotlin/Function1;", "Lorg/mobileid/Api$RequestKeyResult;", "onResult", "requestKeyViaBluetoothAsync", "(Landroid/content/Context;ZLkotlin/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "mobileQR", "Lkotlin/ParameterName;", "state", "requestKeyViaInternetAsync", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "resetAllAlarms", "()V", "setKeyForRequest", "(Ljava/lang/String;)V", "powerCorrection", "setPowerCorrection", "(Landroid/content/Context;I)V", "notify", "syncKeys", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateKey", "(Landroid/content/Context;Lorg/mobileid/access/key/Key;Z)V", "Lorg/mobileid/requester/bluetooth_access_requster/BluetoothRequester;", "bluetoothRequester$delegate", "Lkotlin/Lazy;", "getBluetoothRequester", "()Lorg/mobileid/requester/bluetooth_access_requster/BluetoothRequester;", "bluetoothRequester", "Lorg/mobileid/Api$Firebase;", "firebase", "Lorg/mobileid/Api$Firebase;", "getFirebase", "()Lorg/mobileid/Api$Firebase;", "setFirebase", "(Lorg/mobileid/Api$Firebase;)V", "keyIdForRequest", "Ljava/lang/String;", "getKeyIdForRequest$aclib_api2_6826_release", "()Ljava/lang/String;", "setKeyIdForRequest$aclib_api2_6826_release", "Lorg/mobileid/access/key_remover/KeyRemover;", "keyRemover$delegate", "getKeyRemover", "()Lorg/mobileid/access/key_remover/KeyRemover;", "keyRemover", "Lorg/mobileid/access/key_sync/KeySync;", "keySync$delegate", "getKeySync", "()Lorg/mobileid/access/key_sync/KeySync;", "keySync", "Lorg/mobileid/time_key/key_watcher/KeyWatcher;", "keyWatcher$delegate", "getKeyWatcher", "()Lorg/mobileid/time_key/key_watcher/KeyWatcher;", "keyWatcher", "Lorg/mobileid/time_key/push/PushManager;", "pushManager$delegate", "getPushManager", "()Lorg/mobileid/time_key/push/PushManager;", "pushManager", "", "requestListeners", "Ljava/util/List;", "<init>", "Firebase", "MobileQRCheckResult", "RequestAccessListener", "RequestAccessResult", "RequestKeyResult", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Api implements KoinComponent {
    public static final Api INSTANCE;
    public static final Lazy bluetoothRequester$delegate;
    public static Firebase firebase;
    public static String keyIdForRequest;
    public static final Lazy keyRemover$delegate;
    public static final Lazy keySync$delegate;
    public static final Lazy keyWatcher$delegate;
    public static final Lazy pushManager$delegate;
    public static List<RequestAccessListener> requestListeners = new ArrayList();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\b\u0018\u0000 &:\u0001&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0002\u001a\u00020\u0001HÂ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#¨\u0006'"}, mo51343d2 = {"Lorg/mobileid/Api$Firebase;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "component1", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "copy", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)Lorg/mobileid/Api$Firebase;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Bundle;", "bundle", "", "logAndClearCurrentEventIfDefined", "(Landroid/os/Bundle;)V", "logBluetoothScan", "", "eventId", "logEvent", "(Ljava/lang/String;Landroid/os/Bundle;)V", "logRequestNfcUsed", "logRequestNfcUsedSuccess", "logRequestOnScreenOnSuccess", "toString", "()Ljava/lang/String;", "currentEvent", "Ljava/lang/String;", "getCurrentEvent", "setCurrentEvent", "(Ljava/lang/String;)V", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Firebase {
        public static final String BLUETOOTH_SCAN = "mobile_id_bluetooth_scan";
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final String REQUEST_NFC_USED = "mobile_id_request_nfc_used";
        public static final String REQUEST_NFC_USED_SUCCESS = "mobile_id_request_nfc_used_success";
        public static final String REQUEST_ON_SCREEN_ON = "mobile_id_request_on_screen_on";
        public static final String REQUEST_ON_SCREEN_ON_SUCCESS = "mobile_id_request_on_screen_on_success";
        public String currentEvent;
        public final FirebaseAnalytics firebaseAnalytics;

        @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0004\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00018\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\n"}, mo51343d2 = {"Lorg/mobileid/Api$Firebase$Companion;", "", "BLUETOOTH_SCAN", "Ljava/lang/String;", "REQUEST_NFC_USED", "REQUEST_NFC_USED_SUCCESS", "REQUEST_ON_SCREEN_ON", "REQUEST_ON_SCREEN_ON_SUCCESS", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Firebase(FirebaseAnalytics firebaseAnalytics2) {
            Intrinsics.checkNotNullParameter(firebaseAnalytics2, "firebaseAnalytics");
            this.firebaseAnalytics = firebaseAnalytics2;
        }

        private final FirebaseAnalytics component1() {
            return this.firebaseAnalytics;
        }

        public static /* synthetic */ Firebase copy$default(Firebase firebase, FirebaseAnalytics firebaseAnalytics2, int i, Object obj) {
            if ((i & 1) != 0) {
                firebaseAnalytics2 = firebase.firebaseAnalytics;
            }
            return firebase.copy(firebaseAnalytics2);
        }

        public final Firebase copy(FirebaseAnalytics firebaseAnalytics2) {
            Intrinsics.checkNotNullParameter(firebaseAnalytics2, "firebaseAnalytics");
            return new Firebase(firebaseAnalytics2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Firebase) && Intrinsics.areEqual((Object) this.firebaseAnalytics, (Object) ((Firebase) obj).firebaseAnalytics);
            }
            return true;
        }

        public final String getCurrentEvent() {
            return this.currentEvent;
        }

        public int hashCode() {
            FirebaseAnalytics firebaseAnalytics2 = this.firebaseAnalytics;
            if (firebaseAnalytics2 != null) {
                return firebaseAnalytics2.hashCode();
            }
            return 0;
        }

        public final void logAndClearCurrentEventIfDefined(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.currentEvent;
            if (str != null) {
                logEvent(str, bundle);
                this.currentEvent = null;
            }
        }

        public final void logBluetoothScan(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.firebaseAnalytics.logEvent(BLUETOOTH_SCAN, bundle);
        }

        public final void logEvent(String str, Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "eventId");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.firebaseAnalytics.logEvent(str, bundle);
        }

        public final void logRequestNfcUsed(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.firebaseAnalytics.logEvent(REQUEST_NFC_USED, bundle);
        }

        public final void logRequestNfcUsedSuccess(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.firebaseAnalytics.logEvent(REQUEST_NFC_USED_SUCCESS, bundle);
        }

        public final void logRequestOnScreenOnSuccess(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.firebaseAnalytics.logEvent(REQUEST_ON_SCREEN_ON_SUCCESS, bundle);
        }

        public final void setCurrentEvent(String str) {
            this.currentEvent = str;
        }

        public String toString() {
            return "Firebase(firebaseAnalytics=" + this.firebaseAnalytics + ")";
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"Lorg/mobileid/Api$MobileQRCheckResult;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "VALID", "ALREADY_EXISTS", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public enum MobileQRCheckResult {
        UNKNOWN,
        VALID,
        ALREADY_EXISTS
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo51343d2 = {"Lorg/mobileid/Api$RequestAccessListener;", "Lkotlin/Any;", "Lorg/mobileid/Api$RequestAccessResult;", "result", "", "(Lorg/mobileid/Api$RequestAccessResult;)V", "started", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public interface RequestAccessListener {
        void result(RequestAccessResult requestAccessResult);

        void started();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo51343d2 = {"Lorg/mobileid/Api$RequestAccessResult;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "UNIDENTIFIED", "EMPTY", "ACCEPTED", "GRANTED", "DENIED", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public enum RequestAccessResult {
        UNKNOWN,
        UNIDENTIFIED,
        EMPTY,
        ACCEPTED,
        GRANTED,
        DENIED;
        
        public static final Companion Companion = null;

        @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo51343d2 = {"Lorg/mobileid/Api$RequestAccessResult$Companion;", "Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;", "result", "Lorg/mobileid/Api$RequestAccessResult;", "valueOf", "(Lorg/mobileid/requester/bluetooth_access_requster/AccessPoint$Access;)Lorg/mobileid/Api$RequestAccessResult;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
        public static final class Companion {

            @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {}, mo51343d2 = {}, mo51344k = 3, mo51345mv = {1, 4, 0}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                static {
                    int[] iArr = new int[C0911a.C0912a.values().length];
                    $EnumSwitchMapping$0 = iArr;
                    iArr[1] = 1;
                    int[] iArr2 = $EnumSwitchMapping$0;
                    iArr2[2] = 2;
                    iArr2[3] = 3;
                    iArr2[4] = 4;
                    iArr2[5] = 5;
                }
            }

            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RequestAccessResult valueOf(C0911a.C0912a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "result");
                int ordinal = aVar.ordinal();
                return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? RequestAccessResult.UNKNOWN : RequestAccessResult.DENIED : RequestAccessResult.GRANTED : RequestAccessResult.ACCEPTED : RequestAccessResult.EMPTY : RequestAccessResult.UNIDENTIFIED;
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo51343d2 = {"Lorg/mobileid/Api$RequestKeyResult;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "REJECTED", "ALREADY_EXIST", "NO_KEY_LEFT", "NO_MASTERCARD", "UNKNOWN", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public enum RequestKeyResult {
        SUCCESS,
        REJECTED,
        ALREADY_EXIST,
        NO_KEY_LEFT,
        NO_MASTERCARD,
        UNKNOWN
    }

    static {
        Api api = new Api();
        INSTANCE = api;
        bluetoothRequester$delegate = LazyKt.lazy(new Api$$special$$inlined$inject$1(api.getKoin().getRootScope(), (Qualifier) null, (Function0) null));
        pushManager$delegate = LazyKt.lazy(new Api$$special$$inlined$inject$2(api.getKoin().getRootScope(), (Qualifier) null, (Function0) null));
        keyRemover$delegate = LazyKt.lazy(new Api$$special$$inlined$inject$3(api.getKoin().getRootScope(), (Qualifier) null, (Function0) null));
        keyWatcher$delegate = LazyKt.lazy(new Api$$special$$inlined$inject$4(api.getKoin().getRootScope(), (Qualifier) null, (Function0) null));
        keySync$delegate = LazyKt.lazy(new Api$$special$$inlined$inject$5(api.getKoin().getRootScope(), (Qualifier) null, (Function0) null));
    }

    /* access modifiers changed from: private */
    public final void addKeyAndApplyToServices(Context context, String str, String str2) {
        C0837c.f761k.mo12913a(context, (Key) new KeyFactory().getSimpleKeyByPrefix(str, str2));
        C0943g.f995b.mo13009a(context, C0837c.f761k.mo12907a(context, false), getRequesterListenersAdapter(context));
        RequesterForegroundService.f6379d.mo60097a(context);
    }

    public static /* synthetic */ MobileQRCheckResult checkMobileQR$default(Api api, String str, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        return api.checkMobileQR(str, coroutineScope);
    }

    public static /* synthetic */ void enableIfNotTimeKeys$default(Api api, Context context, TimeKeyParams timeKeyParams, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        api.enableIfNotTimeKeys(context, timeKeyParams, coroutineScope);
    }

    /* access modifiers changed from: private */
    public final C0933e getBluetoothRequester() {
        return (C0933e) bluetoothRequester$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final C0840a getKeyRemover() {
        return (C0840a) keyRemover$delegate.getValue();
    }

    private final C0846a getKeySync() {
        return (C0846a) keySync$delegate.getValue();
    }

    private final C0959a getKeyWatcher() {
        return (C0959a) keyWatcher$delegate.getValue();
    }

    public static /* synthetic */ List getKeys$default(Api api, Context context, Sort sort, int i, Object obj) {
        if ((i & 2) != 0) {
            sort = new NotSorted();
        }
        return api.getKeys(context, sort);
    }

    /* access modifiers changed from: private */
    public final C0972a getPushManager() {
        return (C0972a) pushManager$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Api$getRequesterListenersAdapter$1 getRequesterListenersAdapter(Context context) {
        return new Api$getRequesterListenersAdapter$1(context);
    }

    public static /* synthetic */ void removeKey$default(Api api, Context context, String str, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 4) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        api.removeKey(context, str, coroutineScope);
    }

    public static /* synthetic */ void requestAccess$default(Api api, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        api.requestAccess(context, str);
    }

    public static /* synthetic */ void requestKeyViaBluetoothAsync$default(Api api, Context context, boolean z, Function1 function1, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        api.requestKeyViaBluetoothAsync(context, z, function1, coroutineScope);
    }

    public static /* synthetic */ void requestKeyViaInternetAsync$default(Api api, Context context, String str, Function1 function1, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        api.requestKeyViaInternetAsync(context, str, function1, coroutineScope);
    }

    public static /* synthetic */ Object syncKeys$default(Api api, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return api.syncKeys(z, continuation);
    }

    public final void addRequesterListener(Context context, RequestAccessListener requestAccessListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestAccessListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RequesterForegroundService.f6379d.mo60097a(context);
        C0943g.f995b.mo13009a(context, C0837c.f761k.mo12907a(context, false), getRequesterListenersAdapter(context));
        if (!requestListeners.contains(requestAccessListener)) {
            requestListeners.add(requestAccessListener);
        }
    }

    public final MobileQRCheckResult checkMobileQR(String str, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "mobileQr");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        return ((C0946a) LazyKt.lazy(new Api$checkMobileQR$$inlined$inject$1(getKoin().getRootScope(), (Qualifier) null, new Api$checkMobileQR$qrRequester$2(coroutineScope))).getValue()).mo13013a(str);
    }

    public final void enableIfNotTimeKeys(Context context, TimeKeyParams timeKeyParams, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeKeyParams, "timeKeyParams");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new Api$enableIfNotTimeKeys$1(timeKeyParams, context, (Continuation) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.mobileid.access.key.Key} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: org.mobileid.access.key.Key} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: org.mobileid.access.key.Key} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.mobileid.access.key.Key} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.mobileid.access.key.Key getDefaultKey(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            c.a.a.c$a r1 = p008c.p009a.p010a.C0837c.f761k
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            r2 = 2
            java.util.List r4 = p008c.p009a.p010a.C0837c.C0838a.m367a((p008c.p009a.p010a.C0837c.C0838a) r1, (android.content.Context) r4, (org.mobileid.access.key_sort.Sort) r0, (int) r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r4.next()
            r2 = r1
            org.mobileid.access.key.Key r2 = (org.mobileid.access.key.Key) r2
            boolean r2 = r2.isDefault()
            if (r2 == 0) goto L_0x0014
            r0 = r1
        L_0x0028:
            org.mobileid.access.key.Key r0 = (org.mobileid.access.key.Key) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mobileid.Api.getDefaultKey(android.content.Context):org.mobileid.access.key.Key");
    }

    public final Firebase getFirebase() {
        return firebase;
    }

    public final Key getKey(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        return C0837c.f761k.mo12909a(context, str);
    }

    public final String getKeyIdForRequest$aclib_api2_6826_release() {
        return keyIdForRequest;
    }

    public final List<Key> getKeys(Context context, Sort sort) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sort, "sort");
        return C0837c.f761k.mo12908a(context, sort);
    }

    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final int getPowerCorrection(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C0837c.f761k.mo12907a(context, false).f767f;
    }

    public final boolean isRequestAccessByScreenOnEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C0837c.f761k.mo12907a(context, false).f763b;
    }

    public final boolean isRequestAccessHandsFreeEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C0837c.f761k.mo12907a(context, false).f765d;
    }

    public final boolean isRequestAccessViaNFCAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("nfc");
        if (systemService != null) {
            return ((NfcManager) systemService).getDefaultAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.nfc.NfcManager");
    }

    public final boolean isRequestAccessViaNFCEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C0837c.f761k.mo12907a(context, false).f764c;
    }

    public final boolean keyExists(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        return aVar.mo12909a(context, str) != null;
    }

    public final void observeKeyChanges(Observer<List<Key>> observer, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        KeysObserver keysObserver = new KeysObserver(observer, coroutineScope);
        if (!C0837c.f760j.contains(keysObserver)) {
            C0837c.f760j.add(keysObserver);
        }
    }

    public final boolean parseAcceptUrl(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(uri2, AlbumLoader.COLUMN_URI);
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(uri2, AlbumLoader.COLUMN_URI);
        String string = aVar.mo12906a(context2).getString("demandID", (String) null);
        if (string != null) {
            Intrinsics.checkNotNullExpressionValue(string, "context.access().getStri…ID, null) ?: return false");
            C0953b.C0954a a = C0953b.m543a(aVar.mo12916b(context2), uri2, string);
            if (a != null) {
                Intrinsics.checkNotNullExpressionValue(a, "RequestAccessLink.restor…          ?: return false");
                String str = a.f1020a;
                if (str != null) {
                    C0837c.f761k.mo12913a(context2, (Key) new PersonalKey((String) null, str, (String) null, 0, false, 29, (DefaultConstructorMarker) null));
                }
                String str2 = a.f1021b;
                if (str2 != null) {
                    C0837c.f761k.mo12913a(context2, (Key) new NetworkKey((String) null, str2, (String) null, 0, false, 29, (DefaultConstructorMarker) null));
                }
                String str3 = a.f1022c;
                if (str3 != null) {
                    C0837c.f761k.mo12913a(context2, (Key) new EncryptedKey((String) null, str3, (String) null, 0, false, 29, (DefaultConstructorMarker) null));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: org.mobileid.access.key.Key} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: org.mobileid.access.key.PersonalKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: org.mobileid.access.key.PersonalKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: org.mobileid.access.key.PersonalKey} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri parseInvitationUrl(android.content.Context r17, java.lang.String r18, android.net.Uri r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r4 = "authority"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r5 = "uri"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            c.a.a.c$a r6 = p008c.p009a.p010a.C0837c.f761k
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            c.a.d.e.b r2 = p008c.p009a.p017d.p023e.C0953b.m544a((android.net.Uri) r19)
            r3 = 0
            if (r2 == 0) goto L_0x0117
            java.util.UUID r4 = r2.f1018a
            if (r4 == 0) goto L_0x0117
            java.util.UUID r2 = r2.f1019b
            c.a.a.c$a r4 = p008c.p009a.p010a.C0837c.f761k
            r5 = 2
            java.util.List r5 = p008c.p009a.p010a.C0837c.C0838a.m367a((p008c.p009a.p010a.C0837c.C0838a) r4, (android.content.Context) r0, (org.mobileid.access.key_sort.Sort) r3, (int) r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0039:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004b
            java.lang.Object r6 = r5.next()
            r7 = r6
            org.mobileid.access.key.Key r7 = (org.mobileid.access.key.Key) r7
            boolean r7 = r7 instanceof org.mobileid.access.key.PersonalKey
            if (r7 == 0) goto L_0x0039
            goto L_0x004c
        L_0x004b:
            r6 = r3
        L_0x004c:
            org.mobileid.access.key.Key r6 = (org.mobileid.access.key.Key) r6
            if (r6 == 0) goto L_0x0054
            java.lang.String r3 = r6.getMobileId$aclib_api2_6826_release()
        L_0x0054:
            r5 = 0
            if (r3 == 0) goto L_0x0060
            int r3 = r3.length()
            if (r3 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r3 = 0
            goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            r7 = 16
            if (r3 == 0) goto L_0x00ab
            org.mobileid.access.key.PersonalKey r3 = new org.mobileid.access.key.PersonalKey
            r9 = 0
            java.util.concurrent.ThreadLocalRandom r6 = java.util.concurrent.ThreadLocalRandom.current()
            r10 = 1
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r6.nextLong(r10, r12)
            java.lang.String r6 = java.lang.Long.toHexString(r10)
            int r8 = r6.length()
            if (r8 >= r7) goto L_0x009a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r10 = r6.length()
            java.lang.String r11 = "ffffffffffffffff"
            java.lang.String r10 = r11.substring(r10)
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L_0x009a:
            r10 = r6
            java.lang.String r6 = "Hex.toString(ThreadLocal…LUE), \"ffffffffffffffff\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 29
            r15 = 0
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00ac
        L_0x00ab:
            r3 = r6
        L_0x00ac:
            if (r3 == 0) goto L_0x00b6
            r4.mo12913a((android.content.Context) r0, (org.mobileid.access.key.Key) r3)
            java.lang.String r0 = r3.getMobileId$aclib_api2_6826_release()
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r0 = ""
        L_0x00b8:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = "http"
            android.net.Uri$Builder r3 = r3.scheme(r4)
            android.net.Uri$Builder r1 = r3.authority(r1)
            java.lang.String r3 = "access"
            android.net.Uri$Builder r1 = r1.appendPath(r3)
            java.lang.String r3 = "approve"
            android.net.Uri$Builder r1 = r1.appendPath(r3)
            int r3 = r0.length()
            if (r3 > r7) goto L_0x010f
            r3 = 25
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r3.put(r5)
            r4 = 8
            byte[] r6 = new byte[r4]
            byte[] r0 = p008c.p009a.p031f.C0988c.m584a((java.lang.String) r0)
            int r7 = r0.length
            int r7 = 8 - r7
            java.lang.System.arraycopy(r0, r5, r6, r7, r4)
            r3.put(r6)
            byte[] r0 = p008c.p009a.p017d.p023e.C0953b.m546a((java.util.UUID) r2)
            r3.put(r0)
            byte[] r0 = r3.array()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            java.lang.String r2 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)
            android.net.Uri r3 = r0.build()
            goto L_0x0117
        L_0x010f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Access Id cannot be more than 16 hex digits"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mobileid.Api.parseInvitationUrl(android.content.Context, java.lang.String, android.net.Uri):android.net.Uri");
    }

    public final Uri prepareDemandUrl(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "authority");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "authority");
        String encodeToString = Base64.encodeToString(C0953b.m545a(), 0);
        aVar.mo12906a(context).edit().putString("demandID", encodeToString).apply();
        C0953b.C0954a b = aVar.mo12916b(context);
        Uri.Builder appendPath = new Uri.Builder().scheme("http").authority(str).appendPath("access").appendPath("demand");
        C0986b.C0987a aVar2 = C0953b.f1017c;
        byte[] bArr = new byte[60];
        bArr[0] = 0;
        byte[] decode = Base64.decode(encodeToString, 0);
        System.arraycopy(decode, 0, bArr, 2, Math.min(32, decode.length));
        String str3 = b.f1020a;
        byte[] a = str3 != null ? C0988c.m584a(str3) : new byte[0];
        System.arraycopy(a, 0, bArr, 34, Math.min(8, a.length));
        String str4 = b.f1021b;
        byte[] a2 = str4 != null ? C0988c.m584a(str4) : new byte[0];
        System.arraycopy(a2, 0, bArr, 42, Math.min(9, a2.length));
        String str5 = b.f1022c;
        byte[] a3 = str5 != null ? C0988c.m584a(str5) : new byte[0];
        System.arraycopy(a3, 0, bArr, 51, Math.min(9, a3.length));
        bArr[1] = C0985a.Dallas.mo13041a(bArr, 2, 59);
        Uri build = appendPath.appendQueryParameter("id", Base64.encodeToString(C0986b.m581b(aVar2, bArr), 8)).appendQueryParameter("name", str2).build();
        Intrinsics.checkNotNullExpressionValue(build, "RequestAccessLink.buildD…NetworkEncrypted(), name)");
        return build;
    }

    public final void removeKey(Context context, String str, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        if (Intrinsics.areEqual((Object) keyIdForRequest, (Object) str)) {
            keyIdForRequest = null;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new Api$removeKey$1(str, context, (Continuation) null), 2, (Object) null);
    }

    public final void removeKeyChangesObserver(Observer<List<Key>> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        C0837c.f761k.mo12914a(observer);
    }

    public final void removeRequesterListener(Context context, RequestAccessListener requestAccessListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestAccessListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        requestListeners.remove(requestAccessListener);
    }

    public final void requestAccess(Context context, String str) {
        C0844b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            str = "UNDEFINED_KEY";
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "keyId");
        int hashCode = str.hashCode();
        if (hashCode != -1343771984) {
            if (hashCode == 1717287713 && str.equals("DEFAULT_KEY")) {
                bVar = new C0843a(context);
                C0929d.C0931b.m517a(context, C0837c.f761k.mo12907a(context, true), getRequesterListenersAdapter(context), bVar);
            }
        } else if (str.equals("UNDEFINED_KEY")) {
            bVar = new C0844b(context);
            C0929d.C0931b.m517a(context, C0837c.f761k.mo12907a(context, true), getRequesterListenersAdapter(context), bVar);
        }
        bVar = new C0845c(context, str);
        C0929d.C0931b.m517a(context, C0837c.f761k.mo12907a(context, true), getRequesterListenersAdapter(context), bVar);
    }

    public final void requestAccessByScreenOn(Context context, boolean z, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "notificationText");
        Intrinsics.checkNotNullParameter(str2, "errorNotificationText");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar.mo12918c(context).edit().putBoolean("SCREEN_ENABLE", z).apply();
        C0837c.C0838a aVar2 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "value");
        aVar2.mo12921f(context).edit().putString("NOTIFICATION_TEXT", str).apply();
        C0837c.C0838a aVar3 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "value");
        aVar3.mo12921f(context).edit().putString("NOTIFICATION_ERROR_TEXT", str2).apply();
        C0837c.C0838a aVar4 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar4.mo12921f(context).edit().putInt("NOTIFICATION_ICON", i).apply();
        RequesterForegroundService.f6379d.mo60097a(context);
    }

    public final void requestAccessHandsFree(Context context, boolean z, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "notificationText");
        Intrinsics.checkNotNullParameter(str2, "notificationErrorText");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar.mo12918c(context).edit().putBoolean("HANDS_FREE", z).apply();
        C0837c.C0838a aVar2 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "value");
        aVar2.mo12921f(context).edit().putString("NOTIFICATION_TEXT", str).apply();
        C0837c.C0838a aVar3 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str2, "value");
        aVar3.mo12921f(context).edit().putString("NOTIFICATION_ERROR_TEXT", str2).apply();
        C0837c.C0838a aVar4 = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar4.mo12921f(context).edit().putInt("NOTIFICATION_ICON", i).apply();
        RequesterForegroundService.f6379d.mo60097a(context);
    }

    public final void requestAccessViaNFC(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar.mo12918c(context).edit().putBoolean("USE_NFC", z).apply();
        C0943g.f995b.mo13009a(context, C0837c.f761k.mo12907a(context, false), getRequesterListenersAdapter(context));
    }

    public final void requestKeyViaBluetoothAsync(Context context, boolean z, Function1<? super RequestKeyResult, Unit> function1, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(function1, "onResult");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Api$requestKeyViaBluetoothAsync$1(z, function1, context, (Continuation) null), 3, (Object) null);
    }

    public final void requestKeyViaInternetAsync(Context context, String str, Function1<? super RequestKeyResult, Unit> function1, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "mobileQR");
        Intrinsics.checkNotNullParameter(function1, "onResult");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        CoroutineScope coroutineScope2 = coroutineScope;
        Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getIO(), (CoroutineStart) null, new Api$requestKeyViaInternetAsync$1(LazyKt.lazy(new Api$requestKeyViaInternetAsync$$inlined$inject$1(getKoin().getRootScope(), (Qualifier) null, new Api$requestKeyViaInternetAsync$qrRequester$2(coroutineScope))), (KProperty) null, str, function1, context, (Continuation) null), 2, (Object) null);
    }

    public final void resetAllAlarms() {
        C0959a keyWatcher = getKeyWatcher();
        if (keyWatcher != null) {
            List a = C0837c.C0838a.m367a(C0837c.f761k, keyWatcher.f1027b, (Sort) null, 2);
            ArrayList<TimeKey> arrayList = new ArrayList<>();
            for (Object next : a) {
                if (next instanceof TimeKey) {
                    arrayList.add(next);
                }
            }
            if (keyWatcher != null) {
                Intrinsics.checkNotNullParameter(arrayList, QuickTimeAtomTypes.ATOM_KEYS);
                for (TimeKey timeKey : arrayList) {
                    C0960b bVar = keyWatcher.f1026a;
                    String id = timeKey.getId();
                    if (bVar != null) {
                        Intrinsics.checkNotNullParameter(id, "keyId");
                        Pair pair = new Pair(Integer.valueOf(bVar.f1029a.getSharedPreferences("KEY_START_STORAGE", 0).getInt(id, -1)), Integer.valueOf(bVar.f1029a.getSharedPreferences("KEY_END_STORAGE", 0).getInt(id, -1)));
                        int intValue = ((Number) pair.component1()).intValue();
                        int intValue2 = ((Number) pair.component2()).intValue();
                        if (!(intValue == -1 || intValue2 == -1)) {
                            keyWatcher.mo13021a(timeKey, new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2)));
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void setFirebase(Firebase firebase2) {
        firebase = firebase2;
    }

    public final void setKeyForRequest(String str) {
        keyIdForRequest = str;
    }

    public final void setKeyIdForRequest$aclib_api2_6826_release(String str) {
        keyIdForRequest = str;
    }

    public final void setPowerCorrection(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        aVar.mo12918c(context).edit().putInt("POWER_CORRECTION", i).apply();
        RequesterForegroundService.f6379d.mo60097a(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object syncKeys(boolean r5, kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof org.mobileid.Api$syncKeys$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            org.mobileid.Api$syncKeys$1 r0 = (org.mobileid.Api$syncKeys$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            org.mobileid.Api$syncKeys$1 r0 = new org.mobileid.Api$syncKeys$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            org.mobileid.Api r5 = (org.mobileid.Api) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ Exception -> 0x004e }
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r6)
            c.a.a.f.a r6 = r4.getKeySync()     // Catch:{ Exception -> 0x004e }
            r0.L$0 = r4     // Catch:{ Exception -> 0x004e }
            r0.Z$0 = r5     // Catch:{ Exception -> 0x004e }
            r0.label = r3     // Catch:{ Exception -> 0x004e }
            java.lang.Object r5 = r6.mo12927a(r5, r0)     // Catch:{ Exception -> 0x004e }
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        L_0x004e:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mobileid.Api.syncKeys(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateKey(Context context, Key key, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        C0837c.C0838a aVar = C0837c.f761k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.isDefault()) {
            aVar.mo12920e(context);
        }
        aVar.mo12911a(context, key.getId(), key.formSaveValue$aclib_api2_6826_release());
        if (z) {
            C0837c.C0838a.m368a(aVar, context, (List) null, 2);
        }
    }
}
