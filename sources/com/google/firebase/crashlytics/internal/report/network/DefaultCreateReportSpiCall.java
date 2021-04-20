package com.google.firebase.crashlytics.internal.report.network;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.google.firebase.crashlytics.internal.common.ResponseParser;
import com.google.firebase.crashlytics.internal.network.HttpMethod;
import com.google.firebase.crashlytics.internal.network.HttpRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.report.model.CreateReportRequest;
import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DefaultCreateReportSpiCall extends AbstractSpiCall implements CreateReportSpiCall {
    static final String FILE_CONTENT_TYPE = "application/octet-stream";
    static final String FILE_PARAM = "report[file]";
    static final String IDENTIFIER_PARAM = "report[identifier]";
    static final String MULTI_FILE_PARAM = "report[file";
    private final String version;

    public DefaultCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, String str3) {
        this(str, str2, httpRequestFactory, HttpMethod.POST, str3);
    }

    DefaultCreateReportSpiCall(String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod, String str3) {
        super(str, str2, httpRequestFactory, httpMethod);
        this.version = str3;
    }

    public boolean invoke(CreateReportRequest createReportRequest, boolean z) {
        if (z) {
            HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
            Logger logger = Logger.getLogger();
            logger.mo34251d("Sending report to: " + getUrl());
            try {
                HttpResponse execute = applyMultipartDataTo.execute();
                int code = execute.code();
                Logger logger2 = Logger.getLogger();
                logger2.mo34251d("Create report request ID: " + execute.header(AbstractSpiCall.HEADER_REQUEST_ID));
                Logger logger3 = Logger.getLogger();
                logger3.mo34251d("Result was: " + code);
                return ResponseParser.parse(code) == 0;
            } catch (IOException e) {
                Logger.getLogger().mo34254e("Create report HTTP request failed.", e);
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        HttpRequest header = httpRequest.header(AbstractSpiCall.HEADER_GOOGLE_APP_ID, createReportRequest.googleAppId).header(AbstractSpiCall.HEADER_CLIENT_TYPE, AbstractSpiCall.ANDROID_CLIENT_TYPE).header(AbstractSpiCall.HEADER_CLIENT_VERSION, this.version);
        for (Map.Entry<String, String> header2 : createReportRequest.report.getCustomHeaders().entrySet()) {
            header = header.header(header2);
        }
        return header;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        HttpRequest part = httpRequest.part(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            Logger.getLogger().mo34251d("Adding single file " + report.getFileName() + " to report " + report.getIdentifier());
            return part.part(FILE_PARAM, report.getFileName(), "application/octet-stream", report.getFile());
        }
        int i = 0;
        for (File file : report.getFiles()) {
            Logger.getLogger().mo34251d("Adding file " + file.getName() + " to report " + report.getIdentifier());
            StringBuilder sb = new StringBuilder();
            sb.append(MULTI_FILE_PARAM);
            sb.append(i);
            sb.append("]");
            part = part.part(sb.toString(), file.getName(), "application/octet-stream", file);
            i++;
        }
        return part;
    }
}
