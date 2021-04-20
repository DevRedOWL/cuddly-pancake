package p035ru.unicorn.ujin.market.model;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0016¢\u0006\u0002\u0010\nR\"\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/market/model/MarketViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "viewModelList", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "create", "T", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModelFactory */
/* compiled from: MarketViewModelFactory.kt */
public final class MarketViewModelFactory implements ViewModelProvider.Factory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static MarketViewModelFactory instance;
    private final Map<Class<? extends ViewModel>, ViewModel> viewModelList;

    private MarketViewModelFactory() {
        this.viewModelList = new HashMap();
    }

    public /* synthetic */ MarketViewModelFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        if (this.viewModelList.containsKey(cls)) {
            T t = this.viewModelList.get(cls);
            if (t != null) {
                return (ViewModel) t;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        T marketViewModel = new MarketViewModel();
        this.viewModelList.put(cls, marketViewModel);
        return (ViewModel) marketViewModel;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/market/model/MarketViewModelFactory$Companion;", "", "()V", "instance", "Lru/unicorn/ujin/market/model/MarketViewModelFactory;", "getInstance", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.model.MarketViewModelFactory$Companion */
    /* compiled from: MarketViewModelFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarketViewModelFactory getInstance() {
            if (MarketViewModelFactory.instance == null) {
                MarketViewModelFactory.instance = new MarketViewModelFactory((DefaultConstructorMarker) null);
            }
            return MarketViewModelFactory.instance;
        }
    }
}
