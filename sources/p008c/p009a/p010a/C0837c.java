package p008c.p009a.p010a;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Observer;
import com.drew.metadata.mov.QuickTimeAtomTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.mobileid.access.key.EncryptedKey;
import org.mobileid.access.key.Key;
import org.mobileid.access.key.KeyAction;
import org.mobileid.access.key.KeyFactory;
import org.mobileid.access.key.KeysObserver;
import org.mobileid.access.key.NetworkKey;
import org.mobileid.access.key.PersonalKey;
import org.mobileid.access.key_sort.NotSorted;
import org.mobileid.access.key_sort.Sort;
import p008c.p009a.p017d.p023e.C0953b;

/* renamed from: c.a.a.c */
public final class C0837c {

    /* renamed from: j */
    public static final ArrayList<KeysObserver> f760j = new ArrayList<>();

    /* renamed from: k */
    public static final C0838a f761k = new C0838a();

    /* renamed from: a */
    public final boolean f762a;

    /* renamed from: b */
    public final boolean f763b;

    /* renamed from: c */
    public final boolean f764c;

    /* renamed from: d */
    public final boolean f765d;

    /* renamed from: e */
    public final boolean f766e;

    /* renamed from: f */
    public final int f767f;

    /* renamed from: g */
    public final String f768g;

    /* renamed from: h */
    public final String f769h;

    /* renamed from: i */
    public final int f770i;

    /* renamed from: c.a.a.c$a */
    public static final class C0838a {

        /* renamed from: c.a.a.c$a$a */
        public static final class C0839a extends Lambda implements Function1<KeysObserver, Boolean> {

            /* renamed from: a */
            public final /* synthetic */ Observer f771a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0839a(Observer observer) {
                super(1);
                this.f771a = observer;
            }

            public Object invoke(Object obj) {
                KeysObserver keysObserver = (KeysObserver) obj;
                Intrinsics.checkNotNullParameter(keysObserver, "it");
                return Boolean.valueOf(Intrinsics.areEqual((Object) keysObserver.getObserver(), (Object) this.f771a));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ List m367a(C0838a aVar, Context context, Sort sort, int i) {
            return aVar.mo12908a(context, (Sort) (i & 2) != 0 ? new NotSorted() : null);
        }

        /* renamed from: a */
        public static /* synthetic */ void m368a(C0838a aVar, Context context, List list, int i) {
            List list2 = null;
            if ((i & 2) != 0) {
                list2 = m367a(aVar, context, (Sort) null, 2);
            }
            aVar.mo12915a(list2);
        }

        /* renamed from: a */
        public final SharedPreferences mo12906a(Context context) {
            return context.getSharedPreferences("Access", 0);
        }

        /* renamed from: a */
        public final Key mo12909a(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "keyId");
            return mo12910a(str, (List<? extends Key>) m367a(this, context, (Sort) null, 2));
        }

        /* renamed from: a */
        public final Key mo12910a(String str, List<? extends Key> list) {
            T t;
            Intrinsics.checkNotNullParameter(str, "keyId");
            Intrinsics.checkNotNullParameter(list, QuickTimeAtomTypes.ATOM_KEYS);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual((Object) ((Key) t).getId(), (Object) str)) {
                    break;
                }
            }
            return (Key) t;
        }

        /* renamed from: a */
        public final void mo12911a(Context context, String str, String str2) {
            SharedPreferences a = mo12906a(context);
            if (a.contains(str)) {
                a.edit().putString(str, str2).apply();
            }
        }

        /* renamed from: a */
        public final void mo12913a(Context context, Key key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            if (((HashMap) mo12919d(context)).isEmpty()) {
                key.setDefault(true);
            } else if (key.isDefault()) {
                mo12920e(context);
            }
            mo12906a(context).edit().putString(key.getId(), key.formSaveValue$aclib_api2_6826_release()).apply();
            m368a(this, context, (List) null, 2);
        }

        /* renamed from: b */
        public final C0953b.C0954a mo12916b(Context context) {
            Object obj;
            Object obj2;
            Object obj3;
            mo12906a(context);
            String str = null;
            List a = m367a(C0837c.f761k, context, (Sort) null, 2);
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Key) obj) instanceof PersonalKey) {
                    break;
                }
            }
            Key key = (Key) obj;
            Iterator it2 = a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((Key) obj2) instanceof NetworkKey) {
                    break;
                }
            }
            Key key2 = (Key) obj2;
            Iterator it3 = a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((Key) obj3) instanceof EncryptedKey) {
                    break;
                }
            }
            Key key3 = (Key) obj3;
            String mobileId$aclib_api2_6826_release = key != null ? key.getMobileId$aclib_api2_6826_release() : null;
            String mobileId$aclib_api2_6826_release2 = key2 != null ? key2.getMobileId$aclib_api2_6826_release() : null;
            if (key3 != null) {
                str = key3.getMobileId$aclib_api2_6826_release();
            }
            return new C0953b.C0954a(mobileId$aclib_api2_6826_release, mobileId$aclib_api2_6826_release2, str);
        }

        /* renamed from: b */
        public final boolean mo12917b(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "keyPrefix");
            List<Key> a = m367a(this, context, (Sort) null, 2);
            if (!(a instanceof Collection) || !a.isEmpty()) {
                for (Key isKeyPrefix$aclib_api2_6826_release : a) {
                    if (isKeyPrefix$aclib_api2_6826_release.isKeyPrefix$aclib_api2_6826_release(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: c */
        public final SharedPreferences mo12918c(Context context) {
            return context.getSharedPreferences("DETECTOR", 0);
        }

        /* renamed from: d */
        public final Map<String, Object> mo12919d(Context context) {
            SharedPreferences a = mo12906a(context);
            Intrinsics.checkNotNullExpressionValue(a, "context.access()");
            Map<String, ?> all = a.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "context.access().all");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : all.entrySet()) {
                if (!Intrinsics.areEqual((Object) (String) next.getKey(), (Object) "demandID")) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            return linkedHashMap;
        }

        /* renamed from: e */
        public final void mo12920e(Context context) {
            for (Key key : m367a(this, context, (Sort) null, 2)) {
                if (key.isDefault()) {
                    key.setDefault(false);
                    C0837c.f761k.mo12911a(context, key.getId(), key.formSaveValue$aclib_api2_6826_release());
                }
            }
        }

        /* renamed from: f */
        public final SharedPreferences mo12921f(Context context) {
            return context.getSharedPreferences("NOTIFICATION_KEY", 0);
        }

        /* renamed from: a */
        public final C0837c mo12907a(Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z2 = !m367a(this, context, (Sort) null, 2).isEmpty();
            SharedPreferences c = mo12918c(context);
            boolean z3 = c.getBoolean("SCREEN_ENABLE", false);
            boolean z4 = c.getBoolean("USE_NFC", false);
            boolean z5 = c.getBoolean("HANDS_FREE", false);
            int i = c.getInt("POWER_CORRECTION", 0);
            SharedPreferences f = mo12921f(context);
            String string = f.getString("NOTIFICATION_TEXT", (String) null);
            String string2 = f.getString("NOTIFICATION_ERROR_TEXT", (String) null);
            return new C0837c(z2, z3, z4, z5, z, i, string != null ? string : "", string2 != null ? string2 : "", f.getInt("NOTIFICATION_ICON", 0));
        }

        /* renamed from: a */
        public final List<Key> mo12908a(Context context, Sort sort) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sort, "sort");
            Map<String, Object> d = mo12919d(context);
            C0835a aVar = new C0835a(context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(d, "rawKeys");
            Intrinsics.checkNotNullParameter(aVar, "updateRawKeysInfo");
            KeyFactory keyFactory = new KeyFactory();
            if (!context.getSharedPreferences("MIGRATION_STORAGE_KEY", 0).getBoolean("MIGRATED_KEY", false)) {
                HashMap hashMap = (HashMap) d;
                if (!hashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(hashMap.size());
                    for (Map.Entry entry : ((LinkedHashMap) d).entrySet()) {
                        arrayList.add(keyFactory.getSimpleKeyByStorageId((String) entry.getKey(), String.valueOf(entry.getValue()), hashMap.size() == 1));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Key key = (Key) it.next();
                        aVar.invoke(key.getId(), key.formSaveValue$aclib_api2_6826_release());
                    }
                }
                context.getSharedPreferences("MIGRATION_STORAGE_KEY", 0).edit().putBoolean("MIGRATED_KEY", true).apply();
            }
            KeyFactory keyFactory2 = new KeyFactory();
            Map<String, Object> d2 = mo12919d(context);
            ArrayList arrayList2 = new ArrayList(((HashMap) d2).size());
            for (Map.Entry entry2 : ((LinkedHashMap) d2).entrySet()) {
                Object key2 = entry2.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "it.key");
                String str = (String) key2;
                Object value = entry2.getValue();
                if (value != null) {
                    arrayList2.add(keyFactory2.getKeyFromStorage(str, (String) value));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((Key) next).validate() == KeyAction.REMOVE) {
                    arrayList3.add(next);
                }
            }
            if (!(!arrayList3.isEmpty())) {
                return sort.sortKeys(arrayList2);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C0837c.f761k.mo12906a(context).edit().remove(((Key) it3.next()).getId()).apply();
            }
            return mo12908a(context, sort);
        }

        /* renamed from: a */
        public final void mo12915a(List list) {
            for (KeysObserver keysObserver : C0837c.f760j) {
                Job unused = BuildersKt__Builders_commonKt.launch$default(keysObserver.getScope(), (CoroutineContext) null, (CoroutineStart) null, new C0836b(keysObserver, (Continuation) null, list), 3, (Object) null);
            }
        }

        /* renamed from: a */
        public final void mo12912a(Context context, String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "keyId");
            mo12906a(context).edit().remove(str).apply();
            if (z) {
                mo12915a(m367a(this, context, (Sort) null, 2));
            }
        }

        /* renamed from: a */
        public final void mo12914a(Observer<List<Key>> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            CollectionsKt.removeAll(C0837c.f760j, new C0839a(observer));
        }
    }

    public C0837c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, String str, String str2, int i2) {
        this.f762a = z;
        this.f763b = z2;
        this.f764c = z3;
        this.f765d = z4;
        this.f766e = z5;
        this.f767f = i;
        this.f768g = str;
        this.f769h = str2;
        this.f770i = i2;
    }
}
