package org.altbeacon.beacon.distance;

public class DistanceConfigFetcher {
    private static final String TAG = "DistanceConfigFetcher";
    protected Exception mException;
    protected String mResponse;
    private int mResponseCode = -1;
    private String mUrlString;
    private String mUserAgentString;

    public DistanceConfigFetcher(String str, String str2) {
        this.mUrlString = str;
        this.mUserAgentString = str2;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getResponseString() {
        return this.mResponse;
    }

    public Exception getException() {
        return this.mException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3 A[EDGE_INSN: B:48:0x00b3->B:37:0x00b3 ?: BREAK  
    EDGE_INSN: B:49:0x00b3->B:37:0x00b3 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x000e A[LOOP:0: B:1:0x000e->B:47:0x000e, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request() {
        /*
            r11 = this;
            r0 = 0
            r11.mResponse = r0
            java.lang.String r1 = r11.mUrlString
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = r0
            r5 = r1
            r1 = 0
        L_0x000e:
            r6 = 1
            java.lang.String r7 = "DistanceConfigFetcher"
            if (r1 == 0) goto L_0x002b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r8 = r11.mUrlString
            r5[r3] = r8
            java.lang.String r8 = "Location"
            java.lang.String r9 = r4.getHeaderField(r8)
            r5[r6] = r9
            java.lang.String r9 = "Following redirect from %s to %s"
            org.altbeacon.beacon.logging.LogManager.m6834d(r7, r9, r5)
            java.lang.String r5 = r4.getHeaderField(r8)
        L_0x002b:
            int r1 = r1 + 1
            r8 = -1
            r11.mResponseCode = r8
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0036 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0045
        L_0x0036:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = r11.mUrlString
            r9[r3] = r10
            java.lang.String r10 = "Can't construct URL from: %s"
            org.altbeacon.beacon.logging.LogManager.m6836e(r7, r10, r9)
            r11.mException = r8
            r8 = r0
        L_0x0045:
            if (r8 != 0) goto L_0x004f
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r8 = "URL is null.  Cannot make request"
            org.altbeacon.beacon.logging.LogManager.m6834d(r7, r8, r6)
            goto L_0x00a1
        L_0x004f:
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SecurityException -> 0x0094, FileNotFoundException -> 0x0087, IOException -> 0x007a }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SecurityException -> 0x0094, FileNotFoundException -> 0x0087, IOException -> 0x007a }
            java.lang.String r4 = "User-Agent"
            java.lang.String r9 = r11.mUserAgentString     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r8.addRequestProperty(r4, r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            int r4 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r11.mResponseCode = r4     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.String r4 = "response code is %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            int r9 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            r6[r3] = r9     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            org.altbeacon.beacon.logging.LogManager.m6834d(r7, r4, r6)     // Catch:{ SecurityException -> 0x0078, FileNotFoundException -> 0x0076, IOException -> 0x0074 }
            goto L_0x00a0
        L_0x0074:
            r4 = move-exception
            goto L_0x007d
        L_0x0076:
            r4 = move-exception
            goto L_0x008a
        L_0x0078:
            r4 = move-exception
            goto L_0x0097
        L_0x007a:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x007d:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach server"
            org.altbeacon.beacon.logging.LogManager.m6843w(r4, r7, r9, r6)
            r11.mException = r4
            goto L_0x00a0
        L_0x0087:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x008a:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "No data exists at \"+urlString"
            org.altbeacon.beacon.logging.LogManager.m6843w(r4, r7, r9, r6)
            r11.mException = r4
            goto L_0x00a0
        L_0x0094:
            r6 = move-exception
            r8 = r4
            r4 = r6
        L_0x0097:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach sever.  Have you added android.permission.INTERNET to your manifest?"
            org.altbeacon.beacon.logging.LogManager.m6843w(r4, r7, r9, r6)
            r11.mException = r4
        L_0x00a0:
            r4 = r8
        L_0x00a1:
            r6 = 10
            if (r1 >= r6) goto L_0x00b3
            int r6 = r11.mResponseCode
            r8 = 302(0x12e, float:4.23E-43)
            if (r6 == r8) goto L_0x000e
            r8 = 301(0x12d, float:4.22E-43)
            if (r6 == r8) goto L_0x000e
            r8 = 303(0x12f, float:4.25E-43)
            if (r6 == r8) goto L_0x000e
        L_0x00b3:
            java.lang.Exception r0 = r11.mException
            if (r0 != 0) goto L_0x00e3
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d9 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d9 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Exception -> 0x00d9 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d9 }
        L_0x00c5:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x00cf
            r2.append(r1)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00c5
        L_0x00cf:
            r0.close()     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00d9 }
            r11.mResponse = r0     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00e3
        L_0x00d9:
            r0 = move-exception
            r11.mException = r0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "error reading beacon data"
            org.altbeacon.beacon.logging.LogManager.m6843w(r0, r7, r2, r1)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.distance.DistanceConfigFetcher.request():void");
    }
}
