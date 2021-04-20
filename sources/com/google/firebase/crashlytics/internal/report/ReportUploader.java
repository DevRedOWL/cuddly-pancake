package com.google.firebase.crashlytics.internal.report;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import com.google.firebase.crashlytics.internal.common.DataTransportState;
import com.google.firebase.crashlytics.internal.report.model.Report;
import com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportUploader {
    /* access modifiers changed from: private */
    public static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final CreateReportSpiCall createReportCall;
    private final DataTransportState dataTransportState;
    private final String googleAppId;
    /* access modifiers changed from: private */
    public final HandlingExceptionCheck handlingExceptionCheck;
    private final String organizationId;
    private final ReportManager reportManager;
    /* access modifiers changed from: private */
    public Thread uploadThread;

    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    public interface Provider {
        ReportUploader createReportUploader(AppSettingsData appSettingsData);
    }

    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getNativeReportFiles();
    }

    public ReportUploader(String str, String str2, DataTransportState dataTransportState2, ReportManager reportManager2, CreateReportSpiCall createReportSpiCall, HandlingExceptionCheck handlingExceptionCheck2) {
        if (createReportSpiCall != null) {
            this.createReportCall = createReportSpiCall;
            this.organizationId = str;
            this.googleAppId = str2;
            this.dataTransportState = dataTransportState2;
            this.reportManager = reportManager2;
            this.handlingExceptionCheck = handlingExceptionCheck2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    public synchronized void uploadReportsAsync(List<Report> list, boolean z, float f) {
        if (this.uploadThread != null) {
            Logger.getLogger().mo34251d("Report upload has already been started.");
            return;
        }
        this.uploadThread = new Thread(new Worker(list, z, f), "Crashlytics Report Uploader");
        this.uploadThread.start();
    }

    /* access modifiers changed from: package-private */
    public boolean isUploading() {
        return this.uploadThread != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean uploadReport(com.google.firebase.crashlytics.internal.report.model.Report r7, boolean r8) {
        /*
            r6 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.report.model.CreateReportRequest r1 = new com.google.firebase.crashlytics.internal.report.model.CreateReportRequest     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r6.organizationId     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r6.googleAppId     // Catch:{ Exception -> 0x0067 }
            r1.<init>(r2, r3, r7)     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r2 = r6.dataTransportState     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = com.google.firebase.crashlytics.internal.common.DataTransportState.ALL     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "Report configured to be sent via DataTransport."
            r5 = 1
            if (r2 != r3) goto L_0x001b
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0067 }
            r8.mo34251d(r4)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0030
        L_0x001b:
            com.google.firebase.crashlytics.internal.common.DataTransportState r2 = r6.dataTransportState     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.internal.common.DataTransportState r3 = com.google.firebase.crashlytics.internal.common.DataTransportState.JAVA_ONLY     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            com.google.firebase.crashlytics.internal.report.model.Report$Type r2 = r7.getType()     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.internal.report.model.Report$Type r3 = com.google.firebase.crashlytics.internal.report.model.Report.Type.JAVA     // Catch:{ Exception -> 0x0067 }
            if (r2 != r3) goto L_0x0032
            com.google.firebase.crashlytics.internal.Logger r8 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0067 }
            r8.mo34251d(r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0030:
            r8 = 1
            goto L_0x005e
        L_0x0032:
            com.google.firebase.crashlytics.internal.report.network.CreateReportSpiCall r2 = r6.createReportCall     // Catch:{ Exception -> 0x0067 }
            boolean r8 = r2.invoke(r1, r8)     // Catch:{ Exception -> 0x0067 }
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ Exception -> 0x0067 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
            r2.<init>()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = "Crashlytics Reports Endpoint upload "
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            if (r8 == 0) goto L_0x004b
            java.lang.String r3 = "complete: "
            goto L_0x004d
        L_0x004b:
            java.lang.String r3 = "FAILED: "
        L_0x004d:
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r7.getIdentifier()     // Catch:{ Exception -> 0x0067 }
            r2.append(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0067 }
            r1.mo34255i(r2)     // Catch:{ Exception -> 0x0067 }
        L_0x005e:
            if (r8 == 0) goto L_0x0080
            com.google.firebase.crashlytics.internal.report.ReportManager r8 = r6.reportManager     // Catch:{ Exception -> 0x0067 }
            r8.deleteReport(r7)     // Catch:{ Exception -> 0x0067 }
            r0 = 1
            goto L_0x0080
        L_0x0067:
            r8 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error occurred sending report "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.mo34254e(r7, r8)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.report.ReportUploader.uploadReport(com.google.firebase.crashlytics.internal.report.model.Report, boolean):boolean");
    }

    private class Worker extends BackgroundPriorityRunnable {
        private final boolean dataCollectionToken;
        private final float delay;
        private final List<Report> reports;

        Worker(List<Report> list, boolean z, float f) {
            this.reports = list;
            this.dataCollectionToken = z;
            this.delay = f;
        }

        public void onRun() {
            try {
                attemptUploadWithRetry(this.reports, this.dataCollectionToken);
            } catch (Exception e) {
                Logger.getLogger().mo34254e("An unexpected error occurred while attempting to upload crash reports.", e);
            }
            Thread unused = ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry(List<Report> list, boolean z) {
            Logger logger = Logger.getLogger();
            logger.mo34251d("Starting report processing in " + this.delay + " second(s)...");
            float f = this.delay;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (!ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                int i = 0;
                while (list.size() > 0 && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                    Logger logger2 = Logger.getLogger();
                    logger2.mo34251d("Attempting to send " + list.size() + " report(s)");
                    ArrayList arrayList = new ArrayList();
                    for (Report next : list) {
                        if (!ReportUploader.this.uploadReport(next, z)) {
                            arrayList.add(next);
                        }
                    }
                    if (arrayList.size() > 0) {
                        int i2 = i + 1;
                        long j = (long) ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                        Logger logger3 = Logger.getLogger();
                        logger3.mo34251d("Report submission: scheduling delayed retry in " + j + " seconds");
                        try {
                            Thread.sleep(j * 1000);
                            i = i2;
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    list = arrayList;
                }
            }
        }
    }
}
