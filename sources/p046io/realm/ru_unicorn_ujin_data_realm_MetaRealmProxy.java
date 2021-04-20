package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Meta;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy */
public class ru_unicorn_ujin_data_realm_MetaRealmProxy extends Meta implements RealmObjectProxy, ru_unicorn_ujin_data_realm_MetaRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private MetaColumnInfo columnInfo;
    private ProxyState<Meta> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Meta";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy$MetaColumnInfo */
    static final class MetaColumnInfo extends ColumnInfo {
        long currentPageIndex;
        long fromIndex;
        long lastPageIndex;
        long maxColumnIndexValue;
        long pathIndex;
        long perPageIndex;
        long toIndex;
        long totalIndex;

        MetaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.currentPageIndex = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.fromIndex = addColumnDetails(Constants.MessagePayloadKeys.FROM, Constants.MessagePayloadKeys.FROM, objectSchemaInfo);
            this.lastPageIndex = addColumnDetails("lastPage", "lastPage", objectSchemaInfo);
            this.pathIndex = addColumnDetails(ClientCookie.PATH_ATTR, ClientCookie.PATH_ATTR, objectSchemaInfo);
            this.perPageIndex = addColumnDetails("perPage", "perPage", objectSchemaInfo);
            this.toIndex = addColumnDetails("to", "to", objectSchemaInfo);
            this.totalIndex = addColumnDetails("total", "total", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MetaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new MetaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            MetaColumnInfo metaColumnInfo = (MetaColumnInfo) columnInfo;
            MetaColumnInfo metaColumnInfo2 = (MetaColumnInfo) columnInfo2;
            metaColumnInfo2.currentPageIndex = metaColumnInfo.currentPageIndex;
            metaColumnInfo2.fromIndex = metaColumnInfo.fromIndex;
            metaColumnInfo2.lastPageIndex = metaColumnInfo.lastPageIndex;
            metaColumnInfo2.pathIndex = metaColumnInfo.pathIndex;
            metaColumnInfo2.perPageIndex = metaColumnInfo.perPageIndex;
            metaColumnInfo2.toIndex = metaColumnInfo.toIndex;
            metaColumnInfo2.totalIndex = metaColumnInfo.totalIndex;
            metaColumnInfo2.maxColumnIndexValue = metaColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_MetaRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (MetaColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.currentPageIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.currentPageIndex));
    }

    public void realmSet$currentPage(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currentPageIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.currentPageIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.currentPageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.currentPageIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$from() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.fromIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.fromIndex));
    }

    public void realmSet$from(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fromIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.fromIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.fromIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.fromIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$lastPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.lastPageIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.lastPageIndex));
    }

    public void realmSet$lastPage(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastPageIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.lastPageIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.lastPageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.lastPageIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$path() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.pathIndex);
    }

    public void realmSet$path(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.pathIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.pathIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.pathIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.pathIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$perPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.perPageIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.perPageIndex));
    }

    public void realmSet$perPage(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.perPageIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.perPageIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.perPageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.perPageIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$to() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.toIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.toIndex));
    }

    public void realmSet$to(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.toIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.toIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.toIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.toIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$total() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.totalIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.totalIndex));
    }

    public void realmSet$total(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.totalIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.totalIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.totalIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("currentPage", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty(Constants.MessagePayloadKeys.FROM, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("lastPage", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty(ClientCookie.PATH_ATTR, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("perPage", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("to", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("total", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MetaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new MetaColumnInfo(osSchemaInfo);
    }

    public static Meta createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Meta meta = (Meta) realm.createObjectInternal(Meta.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta;
        if (jSONObject.has("currentPage")) {
            if (jSONObject.isNull("currentPage")) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$currentPage((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$currentPage(Integer.valueOf(jSONObject.getInt("currentPage")));
            }
        }
        if (jSONObject.has(Constants.MessagePayloadKeys.FROM)) {
            if (jSONObject.isNull(Constants.MessagePayloadKeys.FROM)) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$from((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$from(Integer.valueOf(jSONObject.getInt(Constants.MessagePayloadKeys.FROM)));
            }
        }
        if (jSONObject.has("lastPage")) {
            if (jSONObject.isNull("lastPage")) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$lastPage((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$lastPage(Integer.valueOf(jSONObject.getInt("lastPage")));
            }
        }
        if (jSONObject.has(ClientCookie.PATH_ATTR)) {
            if (jSONObject.isNull(ClientCookie.PATH_ATTR)) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$path((String) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$path(jSONObject.getString(ClientCookie.PATH_ATTR));
            }
        }
        if (jSONObject.has("perPage")) {
            if (jSONObject.isNull("perPage")) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$perPage((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$perPage(Integer.valueOf(jSONObject.getInt("perPage")));
            }
        }
        if (jSONObject.has("to")) {
            if (jSONObject.isNull("to")) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$to((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$to(Integer.valueOf(jSONObject.getInt("to")));
            }
        }
        if (jSONObject.has("total")) {
            if (jSONObject.isNull("total")) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$total((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$total(Integer.valueOf(jSONObject.getInt("total")));
            }
        }
        return meta;
    }

    public static Meta createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Meta meta = new Meta();
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("currentPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$currentPage(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$currentPage((Integer) null);
                }
            } else if (nextName.equals(Constants.MessagePayloadKeys.FROM)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$from(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$from((Integer) null);
                }
            } else if (nextName.equals("lastPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$lastPage(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$lastPage((Integer) null);
                }
            } else if (nextName.equals(ClientCookie.PATH_ATTR)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$path(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$path((String) null);
                }
            } else if (nextName.equals("perPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$perPage(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$perPage((Integer) null);
                }
            } else if (nextName.equals("to")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$to(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$to((Integer) null);
                }
            } else if (!nextName.equals("total")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$total(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$total((Integer) null);
            }
        }
        jsonReader.endObject();
        return (Meta) realm.copyToRealm(meta, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_MetaRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_MetaRealmProxy ru_unicorn_ujin_data_realm_metarealmproxy = new ru_unicorn_ujin_data_realm_MetaRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_metarealmproxy;
    }

    public static Meta copyOrUpdate(Realm realm, MetaColumnInfo metaColumnInfo, Meta meta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (meta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) meta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return meta;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(meta);
        if (realmObjectProxy2 != null) {
            return (Meta) realmObjectProxy2;
        }
        return copy(realm, metaColumnInfo, meta, z, map, set);
    }

    public static Meta copy(Realm realm, MetaColumnInfo metaColumnInfo, Meta meta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(meta);
        if (realmObjectProxy != null) {
            return (Meta) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Meta.class), metaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(metaColumnInfo.currentPageIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(metaColumnInfo.fromIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$from());
        osObjectBuilder.addInteger(metaColumnInfo.lastPageIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$lastPage());
        osObjectBuilder.addString(metaColumnInfo.pathIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$path());
        osObjectBuilder.addInteger(metaColumnInfo.perPageIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$perPage());
        osObjectBuilder.addInteger(metaColumnInfo.toIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$to());
        osObjectBuilder.addInteger(metaColumnInfo.totalIndex, ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$total());
        ru_unicorn_ujin_data_realm_MetaRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(meta, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Meta meta, Map<RealmModel, Long> map) {
        Meta meta2 = meta;
        if (meta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) meta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Meta.class);
        long nativePtr = table.getNativePtr();
        MetaColumnInfo metaColumnInfo = (MetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class);
        long createRow = OsObject.createRow(table);
        map.put(meta2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta2;
        Integer realmGet$currentPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.currentPageIndex, createRow, realmGet$currentPage.longValue(), false);
        }
        Integer realmGet$from = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.fromIndex, createRow, realmGet$from.longValue(), false);
        }
        Integer realmGet$lastPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$lastPage();
        if (realmGet$lastPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.lastPageIndex, createRow, realmGet$lastPage.longValue(), false);
        }
        String realmGet$path = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$path();
        if (realmGet$path != null) {
            Table.nativeSetString(nativePtr, metaColumnInfo.pathIndex, createRow, realmGet$path, false);
        }
        Integer realmGet$perPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$perPage();
        if (realmGet$perPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.perPageIndex, createRow, realmGet$perPage.longValue(), false);
        }
        Integer realmGet$to = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.toIndex, createRow, realmGet$to.longValue(), false);
        }
        Integer realmGet$total = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$total();
        if (realmGet$total != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.totalIndex, createRow, realmGet$total.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Meta.class);
        long nativePtr = table.getNativePtr();
        MetaColumnInfo metaColumnInfo = (MetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class);
        while (it.hasNext()) {
            Meta meta = (Meta) it.next();
            if (!map2.containsKey(meta)) {
                if (meta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) meta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(meta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(meta, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta;
                Integer realmGet$currentPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.currentPageIndex, createRow, realmGet$currentPage.longValue(), false);
                }
                Integer realmGet$from = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$from();
                if (realmGet$from != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.fromIndex, createRow, realmGet$from.longValue(), false);
                }
                Integer realmGet$lastPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$lastPage();
                if (realmGet$lastPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.lastPageIndex, createRow, realmGet$lastPage.longValue(), false);
                }
                String realmGet$path = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$path();
                if (realmGet$path != null) {
                    Table.nativeSetString(nativePtr, metaColumnInfo.pathIndex, createRow, realmGet$path, false);
                }
                Integer realmGet$perPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$perPage();
                if (realmGet$perPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.perPageIndex, createRow, realmGet$perPage.longValue(), false);
                }
                Integer realmGet$to = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$to();
                if (realmGet$to != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.toIndex, createRow, realmGet$to.longValue(), false);
                }
                Integer realmGet$total = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$total();
                if (realmGet$total != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.totalIndex, createRow, realmGet$total.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Meta meta, Map<RealmModel, Long> map) {
        Meta meta2 = meta;
        if (meta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) meta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Meta.class);
        long nativePtr = table.getNativePtr();
        MetaColumnInfo metaColumnInfo = (MetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class);
        long createRow = OsObject.createRow(table);
        map.put(meta2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta2;
        Integer realmGet$currentPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.currentPageIndex, createRow, realmGet$currentPage.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.currentPageIndex, createRow, false);
        }
        Integer realmGet$from = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.fromIndex, createRow, realmGet$from.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.fromIndex, createRow, false);
        }
        Integer realmGet$lastPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$lastPage();
        if (realmGet$lastPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.lastPageIndex, createRow, realmGet$lastPage.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.lastPageIndex, createRow, false);
        }
        String realmGet$path = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$path();
        if (realmGet$path != null) {
            Table.nativeSetString(nativePtr, metaColumnInfo.pathIndex, createRow, realmGet$path, false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.pathIndex, createRow, false);
        }
        Integer realmGet$perPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$perPage();
        if (realmGet$perPage != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.perPageIndex, createRow, realmGet$perPage.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.perPageIndex, createRow, false);
        }
        Integer realmGet$to = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.toIndex, createRow, realmGet$to.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.toIndex, createRow, false);
        }
        Integer realmGet$total = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$total();
        if (realmGet$total != null) {
            Table.nativeSetLong(nativePtr, metaColumnInfo.totalIndex, createRow, realmGet$total.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, metaColumnInfo.totalIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Meta.class);
        long nativePtr = table.getNativePtr();
        MetaColumnInfo metaColumnInfo = (MetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Meta.class);
        while (it.hasNext()) {
            Meta meta = (Meta) it.next();
            if (!map2.containsKey(meta)) {
                if (meta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) meta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(meta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(meta, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta;
                Integer realmGet$currentPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.currentPageIndex, createRow, realmGet$currentPage.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.currentPageIndex, createRow, false);
                }
                Integer realmGet$from = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$from();
                if (realmGet$from != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.fromIndex, createRow, realmGet$from.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.fromIndex, createRow, false);
                }
                Integer realmGet$lastPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$lastPage();
                if (realmGet$lastPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.lastPageIndex, createRow, realmGet$lastPage.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.lastPageIndex, createRow, false);
                }
                String realmGet$path = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$path();
                if (realmGet$path != null) {
                    Table.nativeSetString(nativePtr, metaColumnInfo.pathIndex, createRow, realmGet$path, false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.pathIndex, createRow, false);
                }
                Integer realmGet$perPage = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$perPage();
                if (realmGet$perPage != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.perPageIndex, createRow, realmGet$perPage.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.perPageIndex, createRow, false);
                }
                Integer realmGet$to = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$to();
                if (realmGet$to != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.toIndex, createRow, realmGet$to.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.toIndex, createRow, false);
                }
                Integer realmGet$total = ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmGet$total();
                if (realmGet$total != null) {
                    Table.nativeSetLong(nativePtr, metaColumnInfo.totalIndex, createRow, realmGet$total.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, metaColumnInfo.totalIndex, createRow, false);
                }
            }
        }
    }

    public static Meta createDetachedCopy(Meta meta, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Meta meta2;
        if (i > i2 || meta == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(meta);
        if (cacheData == null) {
            meta2 = new Meta();
            map.put(meta, new RealmObjectProxy.CacheData(i, meta2));
        } else if (i >= cacheData.minDepth) {
            return (Meta) cacheData.object;
        } else {
            cacheData.minDepth = i;
            meta2 = (Meta) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface = meta2;
        ru_unicorn_ujin_data_realm_MetaRealmProxyInterface ru_unicorn_ujin_data_realm_metarealmproxyinterface2 = meta;
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$currentPage(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$currentPage());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$from(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$from());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$lastPage(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$lastPage());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$path(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$path());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$perPage(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$perPage());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$to(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$to());
        ru_unicorn_ujin_data_realm_metarealmproxyinterface.realmSet$total(ru_unicorn_ujin_data_realm_metarealmproxyinterface2.realmGet$total());
        return meta2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Meta = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{currentPage:"
            r0.append(r1)
            java.lang.Integer r1 = r5.realmGet$currentPage()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r1 = r5.realmGet$currentPage()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{from:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$from()
            if (r4 == 0) goto L_0x0043
            java.lang.Integer r4 = r5.realmGet$from()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{lastPage:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$lastPage()
            if (r4 == 0) goto L_0x005e
            java.lang.Integer r4 = r5.realmGet$lastPage()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{path:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$path()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$path()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{perPage:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$perPage()
            if (r4 == 0) goto L_0x0094
            java.lang.Integer r4 = r5.realmGet$perPage()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{to:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$to()
            if (r4 == 0) goto L_0x00af
            java.lang.Integer r4 = r5.realmGet$to()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{total:"
            r0.append(r3)
            java.lang.Integer r3 = r5.realmGet$total()
            if (r3 == 0) goto L_0x00c9
            java.lang.Integer r2 = r5.realmGet$total()
        L_0x00c9:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_MetaRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_MetaRealmProxy ru_unicorn_ujin_data_realm_metarealmproxy = (ru_unicorn_ujin_data_realm_MetaRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_metarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_metarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_metarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
