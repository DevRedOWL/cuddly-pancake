package p035ru.unicorn.ujin.data.repository;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.profile.User;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8DX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108DX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseMarketRemoteRepository;", "", "()V", "api", "Lru/unicorn/ujin/data/api/Pro100Api;", "getApi", "()Lru/unicorn/ujin/data/api/Pro100Api;", "appName", "", "getAppName", "()Ljava/lang/String;", "appName$delegate", "Lkotlin/Lazy;", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "resourceProvider", "Lru/unicorn/ujin/data/repository/ResourceProvider;", "getResourceProvider", "()Lru/unicorn/ujin/data/repository/ResourceProvider;", "resourceProvider$delegate", "serverUrl", "getToken", "getUser", "Lru/unicorn/ujin/data/realm/profile/User;", "showNetworkError", "", "Companion", "Holder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.BaseMarketRemoteRepository */
/* compiled from: BaseMarketRemoteRepository.kt */
public class BaseMarketRemoteRepository {
    public static final String API_TOKEN = "api-token";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy instance$delegate = LazyKt.lazy(BaseMarketRemoteRepository$Companion$instance$2.INSTANCE);
    private final Pro100Api api;
    private final Lazy appName$delegate = LazyKt.lazy(BaseMarketRemoteRepository$appName$2.INSTANCE);
    private final ProfileLocalRepository profileLocalRepository;
    private final Lazy resourceProvider$delegate = LazyKt.lazy(BaseMarketRemoteRepository$resourceProvider$2.INSTANCE);
    private final String serverUrl = "https://api-dev.mysmartflat.ru/api/";

    /* access modifiers changed from: protected */
    public final String getAppName() {
        return (String) this.appName$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public final ResourceProvider getResourceProvider() {
        return (ResourceProvider) this.resourceProvider$delegate.getValue();
    }

    public final String getToken() {
        return "ust-18-acd4dbc10fbfd65a25eda61b46fc7820";
    }

    public final void showNetworkError() {
    }

    public BaseMarketRemoteRepository() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        Object create = new Retrofit.Builder().baseUrl(this.serverUrl).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build().create(Pro100Api.class);
        Intrinsics.checkNotNullExpressionValue(create, "retrofit.create(Pro100Api::class.java)");
        this.api = (Pro100Api) create;
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    }

    /* access modifiers changed from: protected */
    public final Pro100Api getApi() {
        return this.api;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseMarketRemoteRepository$Holder;", "", "()V", "INSTANCE", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "getINSTANCE", "()Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseMarketRemoteRepository$Holder */
    /* compiled from: BaseMarketRemoteRepository.kt */
    private static final class Holder {
        public static final Holder INSTANCE = new Holder();

        /* renamed from: INSTANCE  reason: collision with other field name */
        private static final BaseRemoteRepository f7023INSTANCE = new BaseRemoteRepository();

        private Holder() {
        }

        public final BaseRemoteRepository getINSTANCE() {
            return f7023INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseMarketRemoteRepository$Companion;", "", "()V", "API_TOKEN", "", "instance", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "getInstance", "()Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "instance$delegate", "Lkotlin/Lazy;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseMarketRemoteRepository$Companion */
    /* compiled from: BaseMarketRemoteRepository.kt */
    public static final class Companion {
        public final BaseRemoteRepository getInstance() {
            Lazy access$getInstance$cp = BaseMarketRemoteRepository.instance$delegate;
            Companion companion = BaseMarketRemoteRepository.Companion;
            return (BaseRemoteRepository) access$getInstance$cp.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final User getUser() {
        return this.profileLocalRepository.getUser();
    }
}
