package p035ru.unicorn.ujin.util;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import java.io.InputStream;

/* renamed from: ru.unicorn.ujin.util.CustomGlideModule */
public class CustomGlideModule extends AppGlideModule {
    public void registerComponents(Context context, Glide glide, Registry registry) {
        registry.append(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(UnsafeOkHttpClient.getUnsafeOkHttpClient()));
    }
}
