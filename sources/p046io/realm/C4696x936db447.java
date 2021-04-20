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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceIndicatorRealmProxy */
public class C4696x936db447 extends DomServiceIndicator implements RealmObjectProxy, C4697xf082b8b2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DomServiceIndicatorColumnInfo columnInfo;
    private ProxyState<DomServiceIndicator> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceIndicatorRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DomServiceIndicator";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceIndicatorRealmProxy$DomServiceIndicatorColumnInfo */
    static final class DomServiceIndicatorColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;
        long unitIndex;
        long valueIndex;

        DomServiceIndicatorColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.unitIndex = addColumnDetails("unit", "unit", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DomServiceIndicatorColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DomServiceIndicatorColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo = (DomServiceIndicatorColumnInfo) columnInfo;
            DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo2 = (DomServiceIndicatorColumnInfo) columnInfo2;
            domServiceIndicatorColumnInfo2.titleIndex = domServiceIndicatorColumnInfo.titleIndex;
            domServiceIndicatorColumnInfo2.valueIndex = domServiceIndicatorColumnInfo.valueIndex;
            domServiceIndicatorColumnInfo2.unitIndex = domServiceIndicatorColumnInfo.unitIndex;
            domServiceIndicatorColumnInfo2.maxColumnIndexValue = domServiceIndicatorColumnInfo.maxColumnIndexValue;
        }
    }

    C4696x936db447() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DomServiceIndicatorColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.valueIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.valueIndex));
    }

    public void realmSet$value(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.valueIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.valueIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$unit() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.unitIndex);
    }

    public void realmSet$unit(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.unitIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.unitIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.unitIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.unitIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("unit", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DomServiceIndicatorColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DomServiceIndicatorColumnInfo(osSchemaInfo);
    }

    public static DomServiceIndicator createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        DomServiceIndicator domServiceIndicator = (DomServiceIndicator) realm.createObjectInternal(DomServiceIndicator.class, true, Collections.emptyList());
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$value((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$value(Integer.valueOf(jSONObject.getInt("value")));
            }
        }
        if (jSONObject.has("unit")) {
            if (jSONObject.isNull("unit")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$unit((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$unit(jSONObject.getString("unit"));
            }
        }
        return domServiceIndicator;
    }

    public static DomServiceIndicator createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DomServiceIndicator domServiceIndicator = new DomServiceIndicator();
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$value(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$value((Integer) null);
                }
            } else if (!nextName.equals("unit")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$unit(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$unit((String) null);
            }
        }
        jsonReader.endObject();
        return (DomServiceIndicator) realm.copyToRealm(domServiceIndicator, new ImportFlag[0]);
    }

    private static C4696x936db447 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class), false, Collections.emptyList());
        C4696x936db447 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy = new C4696x936db447();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy;
    }

    public static DomServiceIndicator copyOrUpdate(Realm realm, DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo, DomServiceIndicator domServiceIndicator, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (domServiceIndicator instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceIndicator;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return domServiceIndicator;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(domServiceIndicator);
        if (realmObjectProxy2 != null) {
            return (DomServiceIndicator) realmObjectProxy2;
        }
        return copy(realm, domServiceIndicatorColumnInfo, domServiceIndicator, z, map, set);
    }

    public static DomServiceIndicator copy(Realm realm, DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo, DomServiceIndicator domServiceIndicator, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(domServiceIndicator);
        if (realmObjectProxy != null) {
            return (DomServiceIndicator) realmObjectProxy;
        }
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DomServiceIndicator.class), domServiceIndicatorColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(domServiceIndicatorColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$title());
        osObjectBuilder.addInteger(domServiceIndicatorColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(domServiceIndicatorColumnInfo.unitIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$unit());
        C4696x936db447 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(domServiceIndicator, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, DomServiceIndicator domServiceIndicator, Map<RealmModel, Long> map) {
        DomServiceIndicator domServiceIndicator2 = domServiceIndicator;
        if (domServiceIndicator2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceIndicator2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServiceIndicator.class);
        long nativePtr = table.getNativePtr();
        DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo = (DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class);
        long createRow = OsObject.createRow(table);
        map.put(domServiceIndicator2, Long.valueOf(createRow));
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator2;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        Integer realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetLong(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, realmGet$value.longValue(), false);
        }
        String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, realmGet$unit, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DomServiceIndicator.class);
        long nativePtr = table.getNativePtr();
        DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo = (DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class);
        while (it.hasNext()) {
            DomServiceIndicator domServiceIndicator = (DomServiceIndicator) it.next();
            if (!map2.containsKey(domServiceIndicator)) {
                if (domServiceIndicator instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceIndicator;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceIndicator, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceIndicator, Long.valueOf(createRow));
                C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                Integer realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetLong(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, realmGet$value.longValue(), false);
                }
                String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, realmGet$unit, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DomServiceIndicator domServiceIndicator, Map<RealmModel, Long> map) {
        DomServiceIndicator domServiceIndicator2 = domServiceIndicator;
        if (domServiceIndicator2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceIndicator2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServiceIndicator.class);
        long nativePtr = table.getNativePtr();
        DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo = (DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class);
        long createRow = OsObject.createRow(table);
        map.put(domServiceIndicator2, Long.valueOf(createRow));
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator2;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, false);
        }
        Integer realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetLong(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, realmGet$value.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, realmGet$unit, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DomServiceIndicator.class);
        long nativePtr = table.getNativePtr();
        DomServiceIndicatorColumnInfo domServiceIndicatorColumnInfo = (DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class);
        while (it.hasNext()) {
            DomServiceIndicator domServiceIndicator = (DomServiceIndicator) it.next();
            if (!map2.containsKey(domServiceIndicator)) {
                if (domServiceIndicator instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceIndicator;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceIndicator, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceIndicator, Long.valueOf(createRow));
                C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.titleIndex, createRow, false);
                }
                Integer realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetLong(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, realmGet$value.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, realmGet$unit, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceIndicatorColumnInfo.unitIndex, createRow, false);
                }
            }
        }
    }

    public static DomServiceIndicator createDetachedCopy(DomServiceIndicator domServiceIndicator, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DomServiceIndicator domServiceIndicator2;
        if (i > i2 || domServiceIndicator == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(domServiceIndicator);
        if (cacheData == null) {
            domServiceIndicator2 = new DomServiceIndicator();
            map.put(domServiceIndicator, new RealmObjectProxy.CacheData(i, domServiceIndicator2));
        } else if (i >= cacheData.minDepth) {
            return (DomServiceIndicator) cacheData.object;
        } else {
            cacheData.minDepth = i;
            domServiceIndicator2 = (DomServiceIndicator) cacheData.object;
        }
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface = domServiceIndicator2;
        C4697xf082b8b2 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface2 = domServiceIndicator;
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface.realmSet$unit(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxyinterface2.realmGet$unit());
        return domServiceIndicator2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DomServiceIndicator = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{unit:");
        if (realmGet$unit() != null) {
            str = realmGet$unit();
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
        C4696x936db447 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy = (C4696x936db447) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceindicatorrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
