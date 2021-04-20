package p035ru.unicorn.ujin.data.repository;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p035ru.unicorn.ujin.data.api.TestPro100Api;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.profile.User;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository;", "", "()V", "api", "Lru/unicorn/ujin/data/api/TestPro100Api;", "getApi", "()Lru/unicorn/ujin/data/api/TestPro100Api;", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "serverUrl", "", "token", "getToken", "()Ljava/lang/String;", "token$delegate", "Lkotlin/Lazy;", "getUser", "Lru/unicorn/ujin/data/realm/profile/User;", "showNetworkError", "", "Companion", "Holder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.BaseTestRemoteRepository */
/* compiled from: BaseTestRemoteRepository.kt */
public class BaseTestRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy instance$delegate = LazyKt.lazy(BaseTestRemoteRepository$Companion$instance$2.INSTANCE);
    private final TestPro100Api api;
    /* access modifiers changed from: private */
    public final ProfileLocalRepository profileLocalRepository;
    private final String serverUrl = "https://my.api.mockaroo.com/";
    private final Lazy token$delegate;

    public final String getToken() {
        return (String) this.token$delegate.getValue();
    }

    public final void showNetworkError() {
    }

    public BaseTestRemoteRepository() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        Object create = new Retrofit.Builder().baseUrl(this.serverUrl).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build().create(TestPro100Api.class);
        Intrinsics.checkNotNullExpressionValue(create, "retrofit.create(TestPro100Api::class.java)");
        this.api = (TestPro100Api) create;
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
        this.token$delegate = LazyKt.lazy(new BaseTestRemoteRepository$token$2(this));
    }

    /* access modifiers changed from: protected */
    public final TestPro100Api getApi() {
        return this.api;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository$Holder;", "", "()V", "INSTANCE", "Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository;", "getINSTANCE", "()Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseTestRemoteRepository$Holder */
    /* compiled from: BaseTestRemoteRepository.kt */
    private static final class Holder {
        public static final Holder INSTANCE = new Holder();

        /* renamed from: INSTANCE  reason: collision with other field name */
        private static final BaseTestRemoteRepository f7025INSTANCE = new BaseTestRemoteRepository();

        private Holder() {
        }

        public final BaseTestRemoteRepository getINSTANCE() {
            return f7025INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository$Companion;", "", "()V", "instance", "Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository;", "getInstance", "()Lru/unicorn/ujin/data/repository/BaseTestRemoteRepository;", "instance$delegate", "Lkotlin/Lazy;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseTestRemoteRepository$Companion */
    /* compiled from: BaseTestRemoteRepository.kt */
    public static final class Companion {
        public final BaseTestRemoteRepository getInstance() {
            Lazy access$getInstance$cp = BaseTestRemoteRepository.instance$delegate;
            Companion companion = BaseTestRemoteRepository.Companion;
            return (BaseTestRemoteRepository) access$getInstance$cp.getValue();
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
