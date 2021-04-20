package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy */
public class ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy extends SipPreviewParams implements RealmObjectProxy, ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SipPreviewParamsColumnInfo columnInfo;
    private ProxyState<SipPreviewParams> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SipPreviewParams";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy$SipPreviewParamsColumnInfo */
    static final class SipPreviewParamsColumnInfo extends ColumnInfo {
        long fpsIndex;
        long maxColumnIndexValue;
        long mjpegUrlIndex;
        long urlIndex;

        SipPreviewParamsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.fpsIndex = addColumnDetails(SipParametrs.FPS, SipParametrs.FPS, objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.mjpegUrlIndex = addColumnDetails("mjpegUrl", "mjpegUrl", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SipPreviewParamsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SipPreviewParamsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo = (SipPreviewParamsColumnInfo) columnInfo;
            SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo2 = (SipPreviewParamsColumnInfo) columnInfo2;
            sipPreviewParamsColumnInfo2.fpsIndex = sipPreviewParamsColumnInfo.fpsIndex;
            sipPreviewParamsColumnInfo2.urlIndex = sipPreviewParamsColumnInfo.urlIndex;
            sipPreviewParamsColumnInfo2.mjpegUrlIndex = sipPreviewParamsColumnInfo.mjpegUrlIndex;
            sipPreviewParamsColumnInfo2.maxColumnIndexValue = sipPreviewParamsColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SipPreviewParamsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$fps() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.fpsIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.fpsIndex));
    }

    public void realmSet$fps(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fpsIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.fpsIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.fpsIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.fpsIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlIndex);
    }

    public void realmSet$url(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$mjpegUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.mjpegUrlIndex);
    }

    public void realmSet$mjpegUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mjpegUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.mjpegUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.mjpegUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.mjpegUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(SipParametrs.FPS, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("mjpegUrl", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SipPreviewParamsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SipPreviewParamsColumnInfo(osSchemaInfo);
    }

    public static SipPreviewParams createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SipPreviewParams sipPreviewParams = (SipPreviewParams) realm.createObjectInternal(SipPreviewParams.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams;
        if (jSONObject.has(SipParametrs.FPS)) {
            if (jSONObject.isNull(SipParametrs.FPS)) {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$fps((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$fps(Integer.valueOf(jSONObject.getInt(SipParametrs.FPS)));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("mjpegUrl")) {
            if (jSONObject.isNull("mjpegUrl")) {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$mjpegUrl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$mjpegUrl(jSONObject.getString("mjpegUrl"));
            }
        }
        return sipPreviewParams;
    }

    public static SipPreviewParams createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SipPreviewParams sipPreviewParams = new SipPreviewParams();
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(SipParametrs.FPS)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$fps(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$fps((Integer) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$url((String) null);
                }
            } else if (!nextName.equals("mjpegUrl")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$mjpegUrl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$mjpegUrl((String) null);
            }
        }
        jsonReader.endObject();
        return (SipPreviewParams) realm.copyToRealm(sipPreviewParams, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy = new ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy;
    }

    public static SipPreviewParams copyOrUpdate(Realm realm, SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo, SipPreviewParams sipPreviewParams, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (sipPreviewParams instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipPreviewParams;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return sipPreviewParams;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(sipPreviewParams);
        if (realmObjectProxy2 != null) {
            return (SipPreviewParams) realmObjectProxy2;
        }
        return copy(realm, sipPreviewParamsColumnInfo, sipPreviewParams, z, map, set);
    }

    public static SipPreviewParams copy(Realm realm, SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo, SipPreviewParams sipPreviewParams, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(sipPreviewParams);
        if (realmObjectProxy != null) {
            return (SipPreviewParams) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SipPreviewParams.class), sipPreviewParamsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(sipPreviewParamsColumnInfo.fpsIndex, ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$fps());
        osObjectBuilder.addString(sipPreviewParamsColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$url());
        osObjectBuilder.addString(sipPreviewParamsColumnInfo.mjpegUrlIndex, ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$mjpegUrl());
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(sipPreviewParams, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SipPreviewParams sipPreviewParams, Map<RealmModel, Long> map) {
        SipPreviewParams sipPreviewParams2 = sipPreviewParams;
        if (sipPreviewParams2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipPreviewParams2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SipPreviewParams.class);
        long nativePtr = table.getNativePtr();
        SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo = (SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class);
        long createRow = OsObject.createRow(table);
        map.put(sipPreviewParams2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams2;
        Integer realmGet$fps = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$fps();
        if (realmGet$fps != null) {
            Table.nativeSetLong(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, realmGet$fps.longValue(), false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        String realmGet$mjpegUrl = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$mjpegUrl();
        if (realmGet$mjpegUrl != null) {
            Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, realmGet$mjpegUrl, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SipPreviewParams.class);
        long nativePtr = table.getNativePtr();
        SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo = (SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class);
        while (it.hasNext()) {
            SipPreviewParams sipPreviewParams = (SipPreviewParams) it.next();
            if (!map2.containsKey(sipPreviewParams)) {
                if (sipPreviewParams instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipPreviewParams;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipPreviewParams, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sipPreviewParams, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams;
                Integer realmGet$fps = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$fps();
                if (realmGet$fps != null) {
                    Table.nativeSetLong(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, realmGet$fps.longValue(), false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
                String realmGet$mjpegUrl = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$mjpegUrl();
                if (realmGet$mjpegUrl != null) {
                    Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, realmGet$mjpegUrl, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SipPreviewParams sipPreviewParams, Map<RealmModel, Long> map) {
        SipPreviewParams sipPreviewParams2 = sipPreviewParams;
        if (sipPreviewParams2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipPreviewParams2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SipPreviewParams.class);
        long nativePtr = table.getNativePtr();
        SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo = (SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class);
        long createRow = OsObject.createRow(table);
        map.put(sipPreviewParams2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams2;
        Integer realmGet$fps = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$fps();
        if (realmGet$fps != null) {
            Table.nativeSetLong(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, realmGet$fps.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, false);
        }
        String realmGet$mjpegUrl = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$mjpegUrl();
        if (realmGet$mjpegUrl != null) {
            Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, realmGet$mjpegUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SipPreviewParams.class);
        long nativePtr = table.getNativePtr();
        SipPreviewParamsColumnInfo sipPreviewParamsColumnInfo = (SipPreviewParamsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipPreviewParams.class);
        while (it.hasNext()) {
            SipPreviewParams sipPreviewParams = (SipPreviewParams) it.next();
            if (!map2.containsKey(sipPreviewParams)) {
                if (sipPreviewParams instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipPreviewParams;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipPreviewParams, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sipPreviewParams, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams;
                Integer realmGet$fps = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$fps();
                if (realmGet$fps != null) {
                    Table.nativeSetLong(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, realmGet$fps.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.fpsIndex, createRow, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.urlIndex, createRow, false);
                }
                String realmGet$mjpegUrl = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmGet$mjpegUrl();
                if (realmGet$mjpegUrl != null) {
                    Table.nativeSetString(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, realmGet$mjpegUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipPreviewParamsColumnInfo.mjpegUrlIndex, createRow, false);
                }
            }
        }
    }

    public static SipPreviewParams createDetachedCopy(SipPreviewParams sipPreviewParams, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SipPreviewParams sipPreviewParams2;
        if (i > i2 || sipPreviewParams == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(sipPreviewParams);
        if (cacheData == null) {
            sipPreviewParams2 = new SipPreviewParams();
            map.put(sipPreviewParams, new RealmObjectProxy.CacheData(i, sipPreviewParams2));
        } else if (i >= cacheData.minDepth) {
            return (SipPreviewParams) cacheData.object;
        } else {
            cacheData.minDepth = i;
            sipPreviewParams2 = (SipPreviewParams) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface = sipPreviewParams2;
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxyInterface ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface2 = sipPreviewParams;
        ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$fps(ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface2.realmGet$fps());
        ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface.realmSet$mjpegUrl(ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxyinterface2.realmGet$mjpegUrl());
        return sipPreviewParams2;
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy = (ru_unicorn_ujin_data_realm_SipPreviewParamsRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_sippreviewparamsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
