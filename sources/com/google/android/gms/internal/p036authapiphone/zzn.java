package com.google.android.gms.internal.p036authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.3.0 */
public final class zzn extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeAutofillClient {
    private static final Api.ClientKey<zzv> zza = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<zzv, Api.ApiOptions.NoOptions> zzb = new zzr();
    private static final Api<Api.ApiOptions.NoOptions> zzc = new Api<>("SmsCodeAutofill.API", zzb, zza);

    public zzn(Context context) {
        super(context, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public zzn(Activity activity) {
        super(activity, zzc, null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(zzaa.zza).run(new zzm(this)).build());
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(TaskApiCall.builder().setFeatures(zzaa.zza).run(new zzp(this)).build());
    }

    public final Task<Boolean> hasOngoingSmsRequest(String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(TaskApiCall.builder().setFeatures(zzaa.zza).run(new zzo(this, str)).build());
    }
}
