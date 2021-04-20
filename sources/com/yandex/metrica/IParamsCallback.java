package com.yandex.metrica;

import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C3306cx;
import java.util.Map;

public interface IParamsCallback {
    public static final String APP_METRICA_DEVICE_ID_HASH = "appmetrica_device_id_hash";
    public static final String YANDEX_MOBILE_METRICA_CLIDS = "yandex_mobile_metrica_clids";
    public static final String YANDEX_MOBILE_METRICA_DEVICE_ID = "yandex_mobile_metrica_device_id";
    public static final String YANDEX_MOBILE_METRICA_GET_AD_URL = "yandex_mobile_metrica_get_ad_url";
    public static final String YANDEX_MOBILE_METRICA_REPORT_AD_URL = "yandex_mobile_metrica_report_ad_url";
    public static final String YANDEX_MOBILE_METRICA_UUID = "yandex_mobile_metrica_uuid";

    public enum Reason {
        UNKNOWN,
        NETWORK,
        INVALID_RESPONSE,
        INCONSISTENT_CLIDS
    }

    void onReceive(Result result);

    void onRequestError(Reason reason, Result result);

    public static class Result {
        private final Map<String, String> clids;
        private final String deviceId;
        private final String deviceIdHash;
        private final String getUrl;
        private final String reportUrl;
        private final String uuid;

        public Result(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
            this.deviceId = str;
            this.uuid = str2;
            this.reportUrl = str3;
            this.getUrl = str4;
            this.deviceIdHash = str5;
            this.clids = map;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public String getUuid() {
            return this.uuid;
        }

        public String getReportUrl() {
            return this.reportUrl;
        }

        public String getGetUrl() {
            return this.getUrl;
        }

        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        public Map<String, String> getClids() {
            return this.clids;
        }

        public boolean hasDeviceId() {
            return !TextUtils.isEmpty(this.deviceId);
        }

        public boolean hasUuid() {
            return !TextUtils.isEmpty(this.uuid);
        }

        public boolean hasReportUrl() {
            return !TextUtils.isEmpty(this.reportUrl);
        }

        public boolean hasGetUrl() {
            return !TextUtils.isEmpty(this.getUrl);
        }

        public boolean hasDeviceIdHash() {
            return !TextUtils.isEmpty(this.deviceIdHash);
        }

        public boolean hasClids() {
            return !C3306cx.m2862a((Map) this.clids);
        }
    }
}
