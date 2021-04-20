package com.google.android.play.core.internal;

import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.af */
public final class C2240af<StateT> {

    /* renamed from: a */
    protected final Set<StateUpdatedListener<StateT>> f1907a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo33805a(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f1907a.add(stateUpdatedListener);
    }

    /* renamed from: b */
    public final synchronized void mo33806b(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f1907a.remove(stateUpdatedListener);
    }

    /* renamed from: c */
    public final synchronized void mo33807c(StateT statet) {
        for (StateUpdatedListener<StateT> onStateUpdate : this.f1907a) {
            onStateUpdate.onStateUpdate(statet);
        }
    }
}
