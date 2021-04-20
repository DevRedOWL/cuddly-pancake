package p035ru.unicorn.ujin.view.fragments;

import java.util.Comparator;
import p035ru.unicorn.ujin.data.realm.Flat;

/* renamed from: ru.unicorn.ujin.view.fragments.-$$Lambda$FlatListFragment$_Bh1s6pUqS-mVkKT7TVVp476wAM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FlatListFragment$_Bh1s6pUqSmVkKT7TVVp476wAM implements Comparator {
    public static final /* synthetic */ $$Lambda$FlatListFragment$_Bh1s6pUqSmVkKT7TVVp476wAM INSTANCE = new $$Lambda$FlatListFragment$_Bh1s6pUqSmVkKT7TVVp476wAM();

    private /* synthetic */ $$Lambda$FlatListFragment$_Bh1s6pUqSmVkKT7TVVp476wAM() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Flat) obj).getPrice().compareTo(((Flat) obj2).getPrice());
    }
}
