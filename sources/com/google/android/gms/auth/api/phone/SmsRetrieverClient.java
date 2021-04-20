package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p036authapiphone.zzv;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.3.0 */
public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {
    private static final Api.ClientKey<zzv> zza = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<zzv, Api.ApiOptions.NoOptions> zzb = new zza();
    private static final Api<Api.ApiOptions.NoOptions> zzc = new Api<>("SmsRetriever.API", zzb, zza);

    public SmsRetrieverClient(Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);

    public SmsRetrieverClient(Activity activity) {
        super(activity, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
