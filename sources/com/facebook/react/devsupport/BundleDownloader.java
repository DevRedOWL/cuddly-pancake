package com.facebook.react.devsupport;

import android.support.p001v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.p004os.EnvironmentCompat;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDeltaClient;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleDownloader {
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private BundleDeltaClient mBundleDeltaClient;
    private final OkHttpClient mClient;
    /* access modifiers changed from: private */
    public Call mDownloadBundleFromURLCall;

    public static class BundleInfo {
        /* access modifiers changed from: private */
        public String mDeltaClientName;
        /* access modifiers changed from: private */
        public int mFilesChangedCount;
        /* access modifiers changed from: private */
        public String mUrl;

        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mDeltaClientName = jSONObject.getString("deltaClient");
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException e) {
                Log.e(BundleDownloader.TAG, "Invalid bundle info: ", e);
                return null;
            }
        }

        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deltaClient", this.mDeltaClientName);
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.e(BundleDownloader.TAG, "Can't serialize bundle info: ", e);
                return null;
            }
        }

        public String getDeltaClient() {
            return this.mDeltaClientName;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : EnvironmentCompat.MEDIA_UNKNOWN;
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, BundleDeltaClient.ClientType clientType) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, clientType, new Request.Builder());
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, BundleDeltaClient.ClientType clientType, Request.Builder builder) {
        this.mDownloadBundleFromURLCall = (Call) Assertions.assertNotNull(this.mClient.newCall(builder.url(formatBundleUrl(str, clientType)).build()));
        final DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
        final File file2 = file;
        final BundleInfo bundleInfo2 = bundleInfo;
        final BundleDeltaClient.ClientType clientType2 = clientType;
        this.mDownloadBundleFromURLCall.enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    Call unused = BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                Call unused2 = BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String httpUrl = call.request().url().toString();
                DevBundleDownloadListener devBundleDownloadListener = devBundleDownloadListener2;
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric(httpUrl, "Could not connect to development server.", "URL: " + httpUrl, iOException));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
                if (r11 != null) goto L_0x007d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                r11.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
                r11 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
                r10.addSuppressed(r11);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r10, okhttp3.Response r11) throws java.io.IOException {
                /*
                    r9 = this;
                    com.facebook.react.devsupport.BundleDownloader r10 = com.facebook.react.devsupport.BundleDownloader.this
                    okhttp3.Call r10 = r10.mDownloadBundleFromURLCall
                    r0 = 0
                    if (r10 == 0) goto L_0x0086
                    com.facebook.react.devsupport.BundleDownloader r10 = com.facebook.react.devsupport.BundleDownloader.this
                    okhttp3.Call r10 = r10.mDownloadBundleFromURLCall
                    boolean r10 = r10.isCanceled()
                    if (r10 == 0) goto L_0x0016
                    goto L_0x0086
                L_0x0016:
                    com.facebook.react.devsupport.BundleDownloader r10 = com.facebook.react.devsupport.BundleDownloader.this
                    okhttp3.Call unused = r10.mDownloadBundleFromURLCall = r0
                    okhttp3.Request r10 = r11.request()
                    okhttp3.HttpUrl r10 = r10.url()
                    java.lang.String r1 = r10.toString()
                    java.lang.String r10 = "content-type"
                    java.lang.String r10 = r11.header(r10)
                    java.lang.String r0 = "multipart/mixed;.*boundary=\"([^\"]+)\""
                    java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                    java.util.regex.Matcher r10 = r0.matcher(r10)
                    boolean r0 = r10.find()     // Catch:{ all -> 0x0078 }
                    if (r0 == 0) goto L_0x0051
                    com.facebook.react.devsupport.BundleDownloader r0 = com.facebook.react.devsupport.BundleDownloader.this     // Catch:{ all -> 0x0078 }
                    r2 = 1
                    java.lang.String r3 = r10.group(r2)     // Catch:{ all -> 0x0078 }
                    java.io.File r4 = r3     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.BundleDownloader$BundleInfo r5 = r4     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.BundleDeltaClient$ClientType r6 = r5     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.interfaces.DevBundleDownloadListener r7 = r2     // Catch:{ all -> 0x0078 }
                    r2 = r11
                    r0.processMultipartResponse(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0078 }
                    goto L_0x0072
                L_0x0051:
                    com.facebook.react.devsupport.BundleDownloader r0 = com.facebook.react.devsupport.BundleDownloader.this     // Catch:{ all -> 0x0078 }
                    int r2 = r11.code()     // Catch:{ all -> 0x0078 }
                    okhttp3.Headers r3 = r11.headers()     // Catch:{ all -> 0x0078 }
                    okhttp3.ResponseBody r10 = r11.body()     // Catch:{ all -> 0x0078 }
                    okio.BufferedSource r10 = r10.source()     // Catch:{ all -> 0x0078 }
                    okio.BufferedSource r4 = okio.Okio.buffer((okio.Source) r10)     // Catch:{ all -> 0x0078 }
                    java.io.File r5 = r3     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.BundleDownloader$BundleInfo r6 = r4     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.BundleDeltaClient$ClientType r7 = r5     // Catch:{ all -> 0x0078 }
                    com.facebook.react.devsupport.interfaces.DevBundleDownloadListener r8 = r2     // Catch:{ all -> 0x0078 }
                    r0.processBundleResult(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0078 }
                L_0x0072:
                    if (r11 == 0) goto L_0x0077
                    r11.close()
                L_0x0077:
                    return
                L_0x0078:
                    r10 = move-exception
                    throw r10     // Catch:{ all -> 0x007a }
                L_0x007a:
                    r0 = move-exception
                    if (r11 == 0) goto L_0x0085
                    r11.close()     // Catch:{ all -> 0x0081 }
                    goto L_0x0085
                L_0x0081:
                    r11 = move-exception
                    r10.addSuppressed(r11)
                L_0x0085:
                    throw r0
                L_0x0086:
                    com.facebook.react.devsupport.BundleDownloader r10 = com.facebook.react.devsupport.BundleDownloader.this
                    okhttp3.Call unused = r10.mDownloadBundleFromURLCall = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.C14331.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.mBundleDeltaClient;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String formatBundleUrl(java.lang.String r2, com.facebook.react.devsupport.BundleDeltaClient.ClientType r3) {
        /*
            r1 = this;
            boolean r0 = com.facebook.react.devsupport.BundleDeltaClient.isDeltaUrl(r2)
            if (r0 == 0) goto L_0x0016
            com.facebook.react.devsupport.BundleDeltaClient r0 = r1.mBundleDeltaClient
            if (r0 == 0) goto L_0x0016
            boolean r3 = r0.canHandle(r3)
            if (r3 == 0) goto L_0x0016
            com.facebook.react.devsupport.BundleDeltaClient r3 = r1.mBundleDeltaClient
            java.lang.String r2 = r3.extendUrlForDelta(r2)
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.formatBundleUrl(java.lang.String, com.facebook.react.devsupport.BundleDeltaClient$ClientType):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void processMultipartResponse(String str, Response response, String str2, File file, BundleInfo bundleInfo, BundleDeltaClient.ClientType clientType, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        String str3 = str2;
        final Response response2 = response;
        final String str4 = str;
        final File file2 = file;
        final BundleInfo bundleInfo2 = bundleInfo;
        final BundleDeltaClient.ClientType clientType2 = clientType;
        final DevBundleDownloadListener devBundleDownloadListener2 = devBundleDownloadListener;
        if (!new MultipartStreamReader(response.body().source(), str2).readAllParts(new MultipartStreamReader.ChunkListener() {
            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z) throws IOException {
                if (z) {
                    int code = response2.code();
                    if (map.containsKey("X-Http-Status")) {
                        code = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str4, code, Headers.m6801of(map), buffer, file2, bundleInfo2, clientType2, devBundleDownloadListener2);
                } else if (map.containsKey("Content-Type") && map.get("Content-Type").equals("application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                        Integer num = null;
                        String string = jSONObject.has(NotificationCompat.CATEGORY_STATUS) ? jSONObject.getString(NotificationCompat.CATEGORY_STATUS) : null;
                        Integer valueOf = jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null;
                        if (jSONObject.has("total")) {
                            num = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener2.onProgress(string, valueOf, num);
                    } catch (JSONException e) {
                        FLog.m622e(ReactConstants.TAG, "Error parsing progress JSON. " + e.toString());
                    }
                }
            }

            public void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener2.onProgress("Downloading JavaScript bundle", Integer.valueOf((int) (j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)), Integer.valueOf((int) (j2 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)));
                }
            }
        })) {
            devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.facebook.react.bridge.NativeDeltaClient} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processBundleResult(java.lang.String r2, int r3, okhttp3.Headers r4, okio.BufferedSource r5, java.io.File r6, com.facebook.react.devsupport.BundleDownloader.BundleInfo r7, com.facebook.react.devsupport.BundleDeltaClient.ClientType r8, com.facebook.react.devsupport.interfaces.DevBundleDownloadListener r9) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x0044
            java.lang.String r4 = r5.readUtf8()
            com.facebook.react.common.DebugServerException r5 = com.facebook.react.common.DebugServerException.parse(r2, r4)
            if (r5 == 0) goto L_0x0012
            r9.onFailure(r5)
            goto L_0x0043
        L_0x0012:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "The development server returned response error code: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = "\n\n"
            r5.append(r3)
            java.lang.String r6 = "URL: "
            r5.append(r6)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = "Body:\n"
            r5.append(r2)
            r5.append(r4)
            com.facebook.react.common.DebugServerException r2 = new com.facebook.react.common.DebugServerException
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            r9.onFailure(r2)
        L_0x0043:
            return
        L_0x0044:
            if (r7 == 0) goto L_0x0049
            populateBundleInfo(r2, r4, r8, r7)
        L_0x0049:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r6.getPath()
            r7.append(r0)
            java.lang.String r0 = ".tmp"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r3.<init>(r7)
            boolean r2 = com.facebook.react.devsupport.BundleDeltaClient.isDeltaUrl(r2)
            r7 = 0
            if (r2 == 0) goto L_0x0083
            com.facebook.react.devsupport.BundleDeltaClient r2 = r1.getBundleDeltaClient(r8)
            com.facebook.infer.annotation.Assertions.assertNotNull(r2)
            android.util.Pair r2 = r2.processDelta(r4, r5, r3)
            java.lang.Object r4 = r2.first
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r2 = r2.second
            r7 = r2
            com.facebook.react.bridge.NativeDeltaClient r7 = (com.facebook.react.bridge.NativeDeltaClient) r7
            goto L_0x0089
        L_0x0083:
            r1.mBundleDeltaClient = r7
            boolean r4 = storePlainJSInFile(r5, r3)
        L_0x0089:
            if (r4 == 0) goto L_0x00b1
            boolean r2 = r3.renameTo(r6)
            if (r2 == 0) goto L_0x0092
            goto L_0x00b1
        L_0x0092:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Couldn't rename "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " to "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x00b1:
            r9.onSuccess(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.processBundleResult(java.lang.String, int, okhttp3.Headers, okio.BufferedSource, java.io.File, com.facebook.react.devsupport.BundleDownloader$BundleInfo, com.facebook.react.devsupport.BundleDeltaClient$ClientType, com.facebook.react.devsupport.interfaces.DevBundleDownloadListener):void");
    }

    private BundleDeltaClient getBundleDeltaClient(BundleDeltaClient.ClientType clientType) {
        BundleDeltaClient bundleDeltaClient = this.mBundleDeltaClient;
        if (bundleDeltaClient == null || !bundleDeltaClient.canHandle(clientType)) {
            this.mBundleDeltaClient = BundleDeltaClient.create(clientType);
        }
        return this.mBundleDeltaClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean storePlainJSInFile(okio.BufferedSource r0, java.io.File r1) throws java.io.IOException {
        /*
            okio.Sink r1 = okio.Okio.sink((java.io.File) r1)     // Catch:{ all -> 0x0010 }
            r0.readAll(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.storePlainJSInFile(okio.BufferedSource, java.io.File):boolean");
    }

    private static void populateBundleInfo(String str, Headers headers, BundleDeltaClient.ClientType clientType, BundleInfo bundleInfo) {
        String str2;
        if (clientType == BundleDeltaClient.ClientType.NONE) {
            str2 = null;
        } else {
            str2 = clientType.name();
        }
        String unused = bundleInfo.mDeltaClientName = str2;
        String unused2 = bundleInfo.mUrl = str;
        String str3 = headers.get("X-Metro-Files-Changed-Count");
        if (str3 != null) {
            try {
                int unused3 = bundleInfo.mFilesChangedCount = Integer.parseInt(str3);
            } catch (NumberFormatException unused4) {
                int unused5 = bundleInfo.mFilesChangedCount = -2;
            }
        }
    }
}
