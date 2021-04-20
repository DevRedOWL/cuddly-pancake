package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import java.util.Collections;
import java.util.Set;
import p032ch.qoqa.glide.svg.SvgLibraryGlideModule;
import p035ru.unicorn.ujin.util.CustomGlideModule;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final CustomGlideModule appGlideModule = new CustomGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: ru.unicorn.ujin.util.CustomGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: ch.qoqa.glide.svg.SvgLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    public void applyOptions(Context context, GlideBuilder glideBuilder) {
        this.appGlideModule.applyOptions(context, glideBuilder);
    }

    public void registerComponents(Context context, Glide glide, Registry registry) {
        new SvgLibraryGlideModule().registerComponents(context, glide, registry);
        new OkHttpLibraryGlideModule().registerComponents(context, glide, registry);
        this.appGlideModule.registerComponents(context, glide, registry);
    }

    public boolean isManifestParsingEnabled() {
        return this.appGlideModule.isManifestParsingEnabled();
    }

    public Set<Class<?>> getExcludedModuleClasses() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: package-private */
    public GeneratedRequestManagerFactory getRequestManagerFactory() {
        return new GeneratedRequestManagerFactory();
    }
}
