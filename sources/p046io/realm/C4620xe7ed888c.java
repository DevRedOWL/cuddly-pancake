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
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeDateRealmProxy */
public class C4620xe7ed888c extends RedeemedCodeDate implements RealmObjectProxy, C4621xe45ce20d {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RedeemedCodeDateColumnInfo columnInfo;
    private ProxyState<RedeemedCodeDate> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeDateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RedeemedCodeDate";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeDateRealmProxy$RedeemedCodeDateColumnInfo */
    static final class RedeemedCodeDateColumnInfo extends ColumnInfo {
        long dateIndex;
        long maxColumnIndexValue;
        long timezoneIndex;
        long timezoneTypeIndex;

        RedeemedCodeDateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.timezoneTypeIndex = addColumnDetails("timezoneType", "timezoneType", objectSchemaInfo);
            this.timezoneIndex = addColumnDetails("timezone", "timezone", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RedeemedCodeDateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RedeemedCodeDateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo = (RedeemedCodeDateColumnInfo) columnInfo;
            RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo2 = (RedeemedCodeDateColumnInfo) columnInfo2;
            redeemedCodeDateColumnInfo2.dateIndex = redeemedCodeDateColumnInfo.dateIndex;
            redeemedCodeDateColumnInfo2.timezoneTypeIndex = redeemedCodeDateColumnInfo.timezoneTypeIndex;
            redeemedCodeDateColumnInfo2.timezoneIndex = redeemedCodeDateColumnInfo.timezoneIndex;
            redeemedCodeDateColumnInfo2.maxColumnIndexValue = redeemedCodeDateColumnInfo.maxColumnIndexValue;
        }
    }

    C4620xe7ed888c() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RedeemedCodeDateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$date() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateIndex);
    }

    public void realmSet$date(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$timezoneType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timezoneTypeIndex);
    }

    public void realmSet$timezoneType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timezoneTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timezoneTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timezoneTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timezoneTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$timezone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timezoneIndex);
    }

    public void realmSet$timezone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timezoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timezoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timezoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timezoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("date", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("timezoneType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("timezone", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RedeemedCodeDateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RedeemedCodeDateColumnInfo(osSchemaInfo);
    }

    public static RedeemedCodeDate createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RedeemedCodeDate redeemedCodeDate = (RedeemedCodeDate) realm.createObjectInternal(RedeemedCodeDate.class, true, Collections.emptyList());
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
        if (jSONObject.has("date")) {
            if (jSONObject.isNull("date")) {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$date((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$date(jSONObject.getString("date"));
            }
        }
        if (jSONObject.has("timezoneType")) {
            if (jSONObject.isNull("timezoneType")) {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezoneType((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezoneType(jSONObject.getString("timezoneType"));
            }
        }
        if (jSONObject.has("timezone")) {
            if (jSONObject.isNull("timezone")) {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezone((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezone(jSONObject.getString("timezone"));
            }
        }
        return redeemedCodeDate;
    }

    public static RedeemedCodeDate createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RedeemedCodeDate redeemedCodeDate = new RedeemedCodeDate();
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("date")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$date(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$date((String) null);
                }
            } else if (nextName.equals("timezoneType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezoneType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezoneType((String) null);
                }
            } else if (!nextName.equals("timezone")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezone(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezone((String) null);
            }
        }
        jsonReader.endObject();
        return (RedeemedCodeDate) realm.copyToRealm(redeemedCodeDate, new ImportFlag[0]);
    }

    private static C4620xe7ed888c newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class), false, Collections.emptyList());
        C4620xe7ed888c ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy = new C4620xe7ed888c();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy;
    }

    public static RedeemedCodeDate copyOrUpdate(Realm realm, RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo, RedeemedCodeDate redeemedCodeDate, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (redeemedCodeDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCodeDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return redeemedCodeDate;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(redeemedCodeDate);
        if (realmObjectProxy2 != null) {
            return (RedeemedCodeDate) realmObjectProxy2;
        }
        return copy(realm, redeemedCodeDateColumnInfo, redeemedCodeDate, z, map, set);
    }

    public static RedeemedCodeDate copy(Realm realm, RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo, RedeemedCodeDate redeemedCodeDate, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(redeemedCodeDate);
        if (realmObjectProxy != null) {
            return (RedeemedCodeDate) realmObjectProxy;
        }
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RedeemedCodeDate.class), redeemedCodeDateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(redeemedCodeDateColumnInfo.dateIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$date());
        osObjectBuilder.addString(redeemedCodeDateColumnInfo.timezoneTypeIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezoneType());
        osObjectBuilder.addString(redeemedCodeDateColumnInfo.timezoneIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezone());
        C4620xe7ed888c newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(redeemedCodeDate, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RedeemedCodeDate redeemedCodeDate, Map<RealmModel, Long> map) {
        if (redeemedCodeDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCodeDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RedeemedCodeDate.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo = (RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class);
        long createRow = OsObject.createRow(table);
        map.put(redeemedCodeDate, Long.valueOf(createRow));
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
        String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, realmGet$date, false);
        }
        String realmGet$timezoneType = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezoneType();
        if (realmGet$timezoneType != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, realmGet$timezoneType, false);
        }
        String realmGet$timezone = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, realmGet$timezone, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RedeemedCodeDate.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo = (RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class);
        while (it.hasNext()) {
            RedeemedCodeDate redeemedCodeDate = (RedeemedCodeDate) it.next();
            if (!map2.containsKey(redeemedCodeDate)) {
                if (redeemedCodeDate instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCodeDate;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(redeemedCodeDate, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(redeemedCodeDate, Long.valueOf(createRow));
                C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
                String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, realmGet$date, false);
                }
                String realmGet$timezoneType = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezoneType();
                if (realmGet$timezoneType != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, realmGet$timezoneType, false);
                }
                String realmGet$timezone = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezone();
                if (realmGet$timezone != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, realmGet$timezone, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RedeemedCodeDate redeemedCodeDate, Map<RealmModel, Long> map) {
        if (redeemedCodeDate instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCodeDate;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RedeemedCodeDate.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo = (RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class);
        long createRow = OsObject.createRow(table);
        map.put(redeemedCodeDate, Long.valueOf(createRow));
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
        String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, realmGet$date, false);
        } else {
            Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, false);
        }
        String realmGet$timezoneType = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezoneType();
        if (realmGet$timezoneType != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, realmGet$timezoneType, false);
        } else {
            Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, false);
        }
        String realmGet$timezone = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, realmGet$timezone, false);
        } else {
            Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RedeemedCodeDate.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeDateColumnInfo redeemedCodeDateColumnInfo = (RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class);
        while (it.hasNext()) {
            RedeemedCodeDate redeemedCodeDate = (RedeemedCodeDate) it.next();
            if (!map2.containsKey(redeemedCodeDate)) {
                if (redeemedCodeDate instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCodeDate;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(redeemedCodeDate, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(redeemedCodeDate, Long.valueOf(createRow));
                C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate;
                String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, realmGet$date, false);
                } else {
                    Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.dateIndex, createRow, false);
                }
                String realmGet$timezoneType = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezoneType();
                if (realmGet$timezoneType != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, realmGet$timezoneType, false);
                } else {
                    Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.timezoneTypeIndex, createRow, false);
                }
                String realmGet$timezone = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmGet$timezone();
                if (realmGet$timezone != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, realmGet$timezone, false);
                } else {
                    Table.nativeSetNull(nativePtr, redeemedCodeDateColumnInfo.timezoneIndex, createRow, false);
                }
            }
        }
    }

    public static RedeemedCodeDate createDetachedCopy(RedeemedCodeDate redeemedCodeDate, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RedeemedCodeDate redeemedCodeDate2;
        if (i > i2 || redeemedCodeDate == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(redeemedCodeDate);
        if (cacheData == null) {
            redeemedCodeDate2 = new RedeemedCodeDate();
            map.put(redeemedCodeDate, new RealmObjectProxy.CacheData(i, redeemedCodeDate2));
        } else if (i >= cacheData.minDepth) {
            return (RedeemedCodeDate) cacheData.object;
        } else {
            cacheData.minDepth = i;
            redeemedCodeDate2 = (RedeemedCodeDate) cacheData.object;
        }
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface = redeemedCodeDate2;
        C4621xe45ce20d ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface2 = redeemedCodeDate;
        ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$date(ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface2.realmGet$date());
        ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezoneType(ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface2.realmGet$timezoneType());
        ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface.realmSet$timezone(ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxyinterface2.realmGet$timezone());
        return redeemedCodeDate2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RedeemedCodeDate = proxy[");
        sb.append("{date:");
        String str = "null";
        sb.append(realmGet$date() != null ? realmGet$date() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{timezoneType:");
        sb.append(realmGet$timezoneType() != null ? realmGet$timezoneType() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{timezone:");
        if (realmGet$timezone() != null) {
            str = realmGet$timezone();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
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
        C4620xe7ed888c ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy = (C4620xe7ed888c) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_redeemedcodedaterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
