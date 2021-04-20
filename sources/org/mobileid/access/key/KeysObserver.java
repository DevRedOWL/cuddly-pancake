package org.mobileid.access.key;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\b\u0018\u0000B#\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u0005R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001e"}, mo51343d2 = {"Lorg/mobileid/access/key/KeysObserver;", "Landroidx/lifecycle/Observer;", "", "Lorg/mobileid/access/key/Key;", "component1", "()Landroidx/lifecycle/Observer;", "Lkotlinx/coroutines/CoroutineScope;", "component2", "()Lkotlinx/coroutines/CoroutineScope;", "observer", "scope", "copy", "(Landroidx/lifecycle/Observer;Lkotlinx/coroutines/CoroutineScope;)Lorg/mobileid/access/key/KeysObserver;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/lifecycle/Observer;", "getObserver", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "<init>", "(Landroidx/lifecycle/Observer;Lkotlinx/coroutines/CoroutineScope;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class KeysObserver {
    public final Observer<List<Key>> observer;
    public final CoroutineScope scope;

    public KeysObserver(Observer<List<Key>> observer2, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(observer2, "observer");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        this.observer = observer2;
        this.scope = coroutineScope;
    }

    public static /* synthetic */ KeysObserver copy$default(KeysObserver keysObserver, Observer<List<Key>> observer2, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 1) != 0) {
            observer2 = keysObserver.observer;
        }
        if ((i & 2) != 0) {
            coroutineScope = keysObserver.scope;
        }
        return keysObserver.copy(observer2, coroutineScope);
    }

    public final Observer<List<Key>> component1() {
        return this.observer;
    }

    public final CoroutineScope component2() {
        return this.scope;
    }

    public final KeysObserver copy(Observer<List<Key>> observer2, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(observer2, "observer");
        Intrinsics.checkNotNullParameter(coroutineScope, "scope");
        return new KeysObserver(observer2, coroutineScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeysObserver)) {
            return false;
        }
        KeysObserver keysObserver = (KeysObserver) obj;
        return Intrinsics.areEqual((Object) this.observer, (Object) keysObserver.observer) && Intrinsics.areEqual((Object) this.scope, (Object) keysObserver.scope);
    }

    public final Observer<List<Key>> getObserver() {
        return this.observer;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public int hashCode() {
        Observer<List<Key>> observer2 = this.observer;
        int i = 0;
        int hashCode = (observer2 != null ? observer2.hashCode() : 0) * 31;
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope != null) {
            i = coroutineScope.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "KeysObserver(observer=" + this.observer + ", scope=" + this.scope + ")";
    }
}
