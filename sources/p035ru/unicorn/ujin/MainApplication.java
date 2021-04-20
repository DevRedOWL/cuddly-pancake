package p035ru.unicorn.ujin;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDex;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.soloader.SoLoader;
import com.google.firebase.FirebaseApp;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.push.YandexMetricaPush;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.repository.RealmRepository;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.metrics.MetricsApiKeys;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p046io.realm.Realm;
import p046io.realm.RealmConfiguration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: ru.unicorn.ujin.MainApplication */
public class MainApplication extends Application implements LifecycleObserver, ReactApplication {
    private static String appName;
    public static Context mContext;
    public ReactSmartFlatFragment reactFragment;
    private RealmRepository realmRepository;
    private RealmViewModel realmViewModel;
    private Retrofit retrofit;
    public SharedPreferences sharedPreferences;

    public static Context getContext() {
        return mContext;
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static String getAppName() {
        if (appName == null) {
            appName = Flavor.getByFlavor("kortros").getAppName();
        }
        return appName;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        this.sharedPreferences = getSharedPreferences(getPackageName(), 0);
        mContext = getApplicationContext();
        SoLoader.init((Context) this, false);
        FirebaseApp.initializeApp(this);
        if (StringUtils.isNotEmpty(getYandexMetricsApiKey())) {
            YandexMetrica.activate(getApplicationContext(), YandexMetricaConfig.newConfigBuilder(getYandexMetricsApiKey()).build());
            YandexMetrica.enableActivityAutoTracking(this);
            YandexMetricaPush.init(getApplicationContext());
        }
        Realm.init(getApplicationContext());
        RealmConfiguration build = new RealmConfiguration.Builder().name("name").schemaVersion(11).deleteRealmIfMigrationNeeded().build();
        Realm.removeDefaultConfiguration();
        Realm.setDefaultConfiguration(build);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        this.retrofit = new Retrofit.Builder().baseUrl("https://api-product.mysmartflat.ru/api/").addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build();
        this.realmRepository = new RealmRepository((Pro100Api) this.retrofit.create(Pro100Api.class));
        this.realmViewModel = new RealmViewModel(this.realmRepository, getApplicationContext());
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        KoinData.INSTANCE.init(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onAppBackgrounded() {
        Log.d("Lifecycle", "Backgrounded");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onAppForegrounded() {
        Log.d("Lifecycle", "Foregrounded");
    }

    private String getYandexMetricsApiKey() {
        return MetricsApiKeys.valueOf("kortros").getYandexMetricsApiKey();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    public RealmViewModel getRealmViewModel() {
        return this.realmViewModel;
    }

    public ReactNativeHost getReactNativeHost() {
        ReactSmartFlatFragment reactSmartFlatFragment = this.reactFragment;
        if (reactSmartFlatFragment != null) {
            return reactSmartFlatFragment.getMReactNativeHost();
        }
        return null;
    }
}
