package org.altbeacon.beacon.distance;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.altbeacon.beacon.distance.ModelSpecificDistanceUpdater;
import org.altbeacon.beacon.logging.LogManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

public class ModelSpecificDistanceCalculator implements DistanceCalculator {
    private static final String CONFIG_FILE = "model-distance-calculations.json";
    private static final String TAG = "ModelSpecificDistanceCalculator";
    private Context mContext;
    private AndroidModel mDefaultModel;
    /* access modifiers changed from: private */
    public DistanceCalculator mDistanceCalculator;
    private final ReentrantLock mLock;
    private AndroidModel mModel;
    Map<AndroidModel, DistanceCalculator> mModelMap;
    /* access modifiers changed from: private */
    public String mRemoteUpdateUrlString;
    /* access modifiers changed from: private */
    public AndroidModel mRequestedModel;

    public ModelSpecificDistanceCalculator(Context context, String str) {
        this(context, str, AndroidModel.forThisDevice());
    }

    public ModelSpecificDistanceCalculator(Context context, String str, AndroidModel androidModel) {
        this.mRemoteUpdateUrlString = null;
        this.mLock = new ReentrantLock();
        this.mRequestedModel = androidModel;
        this.mRemoteUpdateUrlString = str;
        this.mContext = context;
        loadModelMap();
        this.mDistanceCalculator = findCalculatorForModelWithLock(androidModel);
    }

    public AndroidModel getModel() {
        return this.mModel;
    }

    public AndroidModel getRequestedModel() {
        return this.mRequestedModel;
    }

    public double calculateDistance(int i, double d) {
        DistanceCalculator distanceCalculator = this.mDistanceCalculator;
        if (distanceCalculator != null) {
            return distanceCalculator.calculateDistance(i, d);
        }
        LogManager.m6842w(TAG, "distance calculator has not been set", new Object[0]);
        return -1.0d;
    }

    /* access modifiers changed from: package-private */
    public DistanceCalculator findCalculatorForModelWithLock(AndroidModel androidModel) {
        this.mLock.lock();
        try {
            return findCalculatorForModel(androidModel);
        } finally {
            this.mLock.unlock();
        }
    }

    private DistanceCalculator findCalculatorForModel(AndroidModel androidModel) {
        LogManager.m6834d(TAG, "Finding best distance calculator for %s, %s, %s, %s", androidModel.getVersion(), androidModel.getBuildNumber(), androidModel.getModel(), androidModel.getManufacturer());
        Map<AndroidModel, DistanceCalculator> map = this.mModelMap;
        AndroidModel androidModel2 = null;
        if (map == null) {
            LogManager.m6834d(TAG, "Cannot get distance calculator because modelMap was never initialized", new Object[0]);
            return null;
        }
        int i = 0;
        for (AndroidModel next : map.keySet()) {
            if (next.matchScore(androidModel) > i) {
                i = next.matchScore(androidModel);
                androidModel2 = next;
            }
        }
        if (androidModel2 != null) {
            LogManager.m6834d(TAG, "found a match with score %s", Integer.valueOf(i));
            LogManager.m6834d(TAG, "Finding best distance calculator for %s, %s, %s, %s", androidModel2.getVersion(), androidModel2.getBuildNumber(), androidModel2.getModel(), androidModel2.getManufacturer());
            this.mModel = androidModel2;
        } else {
            this.mModel = this.mDefaultModel;
            LogManager.m6842w(TAG, "Cannot find match for this device.  Using default", new Object[0]);
        }
        return this.mModelMap.get(this.mModel);
    }

    private void loadModelMap() {
        boolean z;
        if (this.mRemoteUpdateUrlString != null) {
            z = loadModelMapFromFile();
            if (!z) {
                requestModelMapFromWeb();
            }
        } else {
            z = false;
        }
        if (!z) {
            loadDefaultModelMap();
        }
        this.mDistanceCalculator = findCalculatorForModelWithLock(this.mRequestedModel);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        org.altbeacon.beacon.logging.LogManager.m6837e(r1, TAG, "Cannot update distance models from online database at %s with JSON: %s", r9.mRemoteUpdateUrlString, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075 A[SYNTHETIC, Splitter:B:36:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[SYNTHETIC, Splitter:B:40:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082 A[SYNTHETIC, Splitter:B:45:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0089 A[SYNTHETIC, Splitter:B:49:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC, Splitter:B:56:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097 A[SYNTHETIC, Splitter:B:60:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean loadModelMapFromFile() {
        /*
            r9 = this;
            java.lang.String r0 = "ModelSpecificDistanceCalculator"
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r9.mContext
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "model-distance-calculations.json"
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068, all -> 0x0065 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068, all -> 0x0065 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0063, IOException -> 0x0061 }
        L_0x0026:
            java.lang.String r3 = r7.readLine()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            if (r3 == 0) goto L_0x0035
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            goto L_0x0026
        L_0x0035:
            r7.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r6.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0043 }
            r9.buildModelMapWithLock(r1)     // Catch:{ JSONException -> 0x0043 }
            return r4
        L_0x0043:
            r1 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r9.mRemoteUpdateUrlString
            r3[r5] = r6
            java.lang.String r2 = r2.toString()
            r3[r4] = r2
            java.lang.String r2 = "Cannot update distance models from online database at %s with JSON: %s"
            org.altbeacon.beacon.logging.LogManager.m6837e(r1, r0, r2, r3)
            return r5
        L_0x0057:
            r0 = move-exception
            r3 = r7
            goto L_0x0080
        L_0x005a:
            r2 = move-exception
            r3 = r7
            goto L_0x006a
        L_0x005d:
            r3 = r7
            goto L_0x008e
        L_0x005f:
            r0 = move-exception
            goto L_0x0080
        L_0x0061:
            r2 = move-exception
            goto L_0x006a
        L_0x0063:
            goto L_0x008e
        L_0x0065:
            r0 = move-exception
            r6 = r3
            goto L_0x0080
        L_0x0068:
            r2 = move-exception
            r6 = r3
        L_0x006a:
            java.lang.String r7 = "Cannot open distance model file %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005f }
            r4[r5] = r1     // Catch:{ all -> 0x005f }
            org.altbeacon.beacon.logging.LogManager.m6837e(r2, r0, r7, r4)     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x007a
            r3.close()     // Catch:{ Exception -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r6 == 0) goto L_0x007f
            r6.close()     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            return r5
        L_0x0080:
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch:{ Exception -> 0x0086 }
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            if (r6 == 0) goto L_0x008c
            r6.close()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            throw r0
        L_0x008d:
            r6 = r3
        L_0x008e:
            if (r3 == 0) goto L_0x0095
            r3.close()     // Catch:{ Exception -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r6 == 0) goto L_0x009a
            r6.close()     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.loadModelMapFromFile():boolean");
    }

    /* access modifiers changed from: private */
    public boolean saveJson(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.mContext.openFileOutput(CONFIG_FILE, 0);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused) {
                }
            }
            LogManager.m6838i(TAG, "Successfully saved new distance model file", new Object[0]);
            return true;
        } catch (Exception e) {
            LogManager.m6843w(e, TAG, "Cannot write updated distance model to local storage", new Object[0]);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    private void requestModelMapFromWeb() {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            LogManager.m6842w(TAG, "App has no android.permission.INTERNET permission.  Cannot check for distance model updates", new Object[0]);
        } else {
            new ModelSpecificDistanceUpdater(this.mContext, this.mRemoteUpdateUrlString, new ModelSpecificDistanceUpdater.CompletionHandler() {
                public void onComplete(String str, Exception exc, int i) {
                    if (exc != null) {
                        LogManager.m6842w(ModelSpecificDistanceCalculator.TAG, "Cannot updated distance models from online database at %s", exc, ModelSpecificDistanceCalculator.this.mRemoteUpdateUrlString);
                    } else if (i != 200) {
                        LogManager.m6842w(ModelSpecificDistanceCalculator.TAG, "Cannot updated distance models from online database at %s due to HTTP status code %s", ModelSpecificDistanceCalculator.this.mRemoteUpdateUrlString, Integer.valueOf(i));
                    } else {
                        LogManager.m6834d(ModelSpecificDistanceCalculator.TAG, "Successfully downloaded distance models from online database", new Object[0]);
                        try {
                            ModelSpecificDistanceCalculator.this.buildModelMapWithLock(str);
                            if (ModelSpecificDistanceCalculator.this.saveJson(str)) {
                                boolean unused = ModelSpecificDistanceCalculator.this.loadModelMapFromFile();
                                DistanceCalculator unused2 = ModelSpecificDistanceCalculator.this.mDistanceCalculator = ModelSpecificDistanceCalculator.this.findCalculatorForModelWithLock(ModelSpecificDistanceCalculator.this.mRequestedModel);
                                LogManager.m6838i(ModelSpecificDistanceCalculator.TAG, "Successfully updated distance model with latest from online database", new Object[0]);
                            }
                        } catch (JSONException e) {
                            LogManager.m6843w(e, ModelSpecificDistanceCalculator.TAG, "Cannot parse json from downloaded distance model", new Object[0]);
                        }
                    }
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void buildModelMapWithLock(String str) throws JSONException {
        this.mLock.lock();
        try {
            buildModelMap(str);
        } finally {
            this.mLock.unlock();
        }
    }

    private void buildModelMap(String str) throws JSONException {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z = jSONObject.has("default") ? jSONObject.getBoolean("default") : false;
            Double valueOf = Double.valueOf(jSONObject.getDouble("coefficient1"));
            Double valueOf2 = Double.valueOf(jSONObject.getDouble("coefficient2"));
            Double valueOf3 = Double.valueOf(jSONObject.getDouble("coefficient3"));
            String string = jSONObject.getString(ClientCookie.VERSION_ATTR);
            String string2 = jSONObject.getString("build_number");
            String string3 = jSONObject.getString("model");
            String string4 = jSONObject.getString("manufacturer");
            double doubleValue = valueOf.doubleValue();
            double doubleValue2 = valueOf2.doubleValue();
            double doubleValue3 = valueOf3.doubleValue();
            CurveFittedDistanceCalculator curveFittedDistanceCalculator = r13;
            CurveFittedDistanceCalculator curveFittedDistanceCalculator2 = new CurveFittedDistanceCalculator(doubleValue, doubleValue2, doubleValue3);
            AndroidModel androidModel = new AndroidModel(string, string2, string3, string4);
            hashMap.put(androidModel, curveFittedDistanceCalculator);
            if (z) {
                this.mDefaultModel = androidModel;
            }
        }
        this.mModelMap = hashMap;
    }

    private void loadDefaultModelMap() {
        try {
            buildModelMap(stringFromFilePath(CONFIG_FILE));
        } catch (Exception e) {
            this.mModelMap = new HashMap();
            LogManager.m6837e(e, TAG, "Cannot build model distance calculations", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String stringFromFilePath(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.Class<org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator> r3 = org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r4.<init>()     // Catch:{ all -> 0x008a }
            r4.append(r0)     // Catch:{ all -> 0x008a }
            r4.append(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008a }
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ all -> 0x008a }
            if (r3 != 0) goto L_0x003e
            java.lang.Class r4 = r6.getClass()     // Catch:{ all -> 0x003b }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            r5.append(r0)     // Catch:{ all -> 0x003b }
            r5.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x003b }
            java.io.InputStream r0 = r4.getResourceAsStream(r0)     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r7 = move-exception
            r0 = r3
            goto L_0x008c
        L_0x003e:
            r0 = r3
        L_0x003f:
            if (r0 == 0) goto L_0x0073
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0071 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0071 }
            r7.<init>(r3)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = r7.readLine()     // Catch:{ all -> 0x006d }
        L_0x0051:
            if (r2 == 0) goto L_0x0060
            r1.append(r2)     // Catch:{ all -> 0x006d }
            r2 = 10
            r1.append(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r7.readLine()     // Catch:{ all -> 0x006d }
            goto L_0x0051
        L_0x0060:
            r7.close()
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            java.lang.String r7 = r1.toString()
            return r7
        L_0x006d:
            r1 = move-exception
            r2 = r7
            r7 = r1
            goto L_0x008c
        L_0x0071:
            r7 = move-exception
            goto L_0x008c
        L_0x0073:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r3.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "Cannot load resource at "
            r3.append(r4)     // Catch:{ all -> 0x0071 }
            r3.append(r7)     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0071 }
            r1.<init>(r7)     // Catch:{ all -> 0x0071 }
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x008a:
            r7 = move-exception
            r0 = r2
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.stringFromFilePath(java.lang.String):java.lang.String");
    }
}
