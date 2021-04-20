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
import p035ru.unicorn.ujin.data.realm.FlatButtons;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy */
public class ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy extends FlatButtons implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FlatButtonsColumnInfo columnInfo;
    private ProxyState<FlatButtons> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FlatButtons";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy$FlatButtonsColumnInfo */
    static final class FlatButtonsColumnInfo extends ColumnInfo {
        long acceptanceButtonTextIndex;
        long callButtonTextIndex;
        long maxColumnIndexValue;

        FlatButtonsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.callButtonTextIndex = addColumnDetails("callButtonText", "callButtonText", objectSchemaInfo);
            this.acceptanceButtonTextIndex = addColumnDetails("acceptanceButtonText", "acceptanceButtonText", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FlatButtonsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FlatButtonsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FlatButtonsColumnInfo flatButtonsColumnInfo = (FlatButtonsColumnInfo) columnInfo;
            FlatButtonsColumnInfo flatButtonsColumnInfo2 = (FlatButtonsColumnInfo) columnInfo2;
            flatButtonsColumnInfo2.callButtonTextIndex = flatButtonsColumnInfo.callButtonTextIndex;
            flatButtonsColumnInfo2.acceptanceButtonTextIndex = flatButtonsColumnInfo.acceptanceButtonTextIndex;
            flatButtonsColumnInfo2.maxColumnIndexValue = flatButtonsColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FlatButtonsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$callButtonText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.callButtonTextIndex);
    }

    public void realmSet$callButtonText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.callButtonTextIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'callButtonText' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.callButtonTextIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'callButtonText' to null.");
        }
    }

    public String realmGet$acceptanceButtonText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.acceptanceButtonTextIndex);
    }

    public void realmSet$acceptanceButtonText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.acceptanceButtonTextIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'acceptanceButtonText' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.acceptanceButtonTextIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'acceptanceButtonText' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("callButtonText", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("acceptanceButtonText", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FlatButtonsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FlatButtonsColumnInfo(osSchemaInfo);
    }

    public static FlatButtons createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        FlatButtons flatButtons = (FlatButtons) realm.createObjectInternal(FlatButtons.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
        if (jSONObject.has("callButtonText")) {
            if (jSONObject.isNull("callButtonText")) {
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$callButtonText((String) null);
            } else {
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$callButtonText(jSONObject.getString("callButtonText"));
            }
        }
        if (jSONObject.has("acceptanceButtonText")) {
            if (jSONObject.isNull("acceptanceButtonText")) {
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$acceptanceButtonText((String) null);
            } else {
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$acceptanceButtonText(jSONObject.getString("acceptanceButtonText"));
            }
        }
        return flatButtons;
    }

    public static FlatButtons createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FlatButtons flatButtons = new FlatButtons();
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("callButtonText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$callButtonText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$callButtonText((String) null);
                }
            } else if (!nextName.equals("acceptanceButtonText")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$acceptanceButtonText(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$acceptanceButtonText((String) null);
            }
        }
        jsonReader.endObject();
        return (FlatButtons) realm.copyToRealm(flatButtons, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy = new ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy;
    }

    public static FlatButtons copyOrUpdate(Realm realm, FlatButtonsColumnInfo flatButtonsColumnInfo, FlatButtons flatButtons, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (flatButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return flatButtons;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(flatButtons);
        if (realmObjectProxy2 != null) {
            return (FlatButtons) realmObjectProxy2;
        }
        return copy(realm, flatButtonsColumnInfo, flatButtons, z, map, set);
    }

    public static FlatButtons copy(Realm realm, FlatButtonsColumnInfo flatButtonsColumnInfo, FlatButtons flatButtons, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(flatButtons);
        if (realmObjectProxy != null) {
            return (FlatButtons) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FlatButtons.class), flatButtonsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(flatButtonsColumnInfo.callButtonTextIndex, ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$callButtonText());
        osObjectBuilder.addString(flatButtonsColumnInfo.acceptanceButtonTextIndex, ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$acceptanceButtonText());
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(flatButtons, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, FlatButtons flatButtons, Map<RealmModel, Long> map) {
        if (flatButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FlatButtons.class);
        long nativePtr = table.getNativePtr();
        FlatButtonsColumnInfo flatButtonsColumnInfo = (FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class);
        long createRow = OsObject.createRow(table);
        map.put(flatButtons, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
        String realmGet$callButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$callButtonText();
        if (realmGet$callButtonText != null) {
            Table.nativeSetString(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, realmGet$callButtonText, false);
        }
        String realmGet$acceptanceButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$acceptanceButtonText();
        if (realmGet$acceptanceButtonText != null) {
            Table.nativeSetString(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, realmGet$acceptanceButtonText, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FlatButtons.class);
        long nativePtr = table.getNativePtr();
        FlatButtonsColumnInfo flatButtonsColumnInfo = (FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class);
        while (it.hasNext()) {
            FlatButtons flatButtons = (FlatButtons) it.next();
            if (!map2.containsKey(flatButtons)) {
                if (flatButtons instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatButtons;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flatButtons, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(flatButtons, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
                String realmGet$callButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$callButtonText();
                if (realmGet$callButtonText != null) {
                    Table.nativeSetString(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, realmGet$callButtonText, false);
                }
                String realmGet$acceptanceButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$acceptanceButtonText();
                if (realmGet$acceptanceButtonText != null) {
                    Table.nativeSetString(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, realmGet$acceptanceButtonText, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FlatButtons flatButtons, Map<RealmModel, Long> map) {
        if (flatButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FlatButtons.class);
        long nativePtr = table.getNativePtr();
        FlatButtonsColumnInfo flatButtonsColumnInfo = (FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class);
        long createRow = OsObject.createRow(table);
        map.put(flatButtons, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
        String realmGet$callButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$callButtonText();
        if (realmGet$callButtonText != null) {
            Table.nativeSetString(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, realmGet$callButtonText, false);
        } else {
            Table.nativeSetNull(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, false);
        }
        String realmGet$acceptanceButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$acceptanceButtonText();
        if (realmGet$acceptanceButtonText != null) {
            Table.nativeSetString(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, realmGet$acceptanceButtonText, false);
        } else {
            Table.nativeSetNull(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FlatButtons.class);
        long nativePtr = table.getNativePtr();
        FlatButtonsColumnInfo flatButtonsColumnInfo = (FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class);
        while (it.hasNext()) {
            FlatButtons flatButtons = (FlatButtons) it.next();
            if (!map2.containsKey(flatButtons)) {
                if (flatButtons instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatButtons;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flatButtons, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(flatButtons, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons;
                String realmGet$callButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$callButtonText();
                if (realmGet$callButtonText != null) {
                    Table.nativeSetString(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, realmGet$callButtonText, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatButtonsColumnInfo.callButtonTextIndex, createRow, false);
                }
                String realmGet$acceptanceButtonText = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmGet$acceptanceButtonText();
                if (realmGet$acceptanceButtonText != null) {
                    Table.nativeSetString(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, realmGet$acceptanceButtonText, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatButtonsColumnInfo.acceptanceButtonTextIndex, createRow, false);
                }
            }
        }
    }

    public static FlatButtons createDetachedCopy(FlatButtons flatButtons, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FlatButtons flatButtons2;
        if (i > i2 || flatButtons == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(flatButtons);
        if (cacheData == null) {
            flatButtons2 = new FlatButtons();
            map.put(flatButtons, new RealmObjectProxy.CacheData(i, flatButtons2));
        } else if (i >= cacheData.minDepth) {
            return (FlatButtons) cacheData.object;
        } else {
            cacheData.minDepth = i;
            flatButtons2 = (FlatButtons) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface = flatButtons2;
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxyInterface ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface2 = flatButtons;
        ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$callButtonText(ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface2.realmGet$callButtonText());
        ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface.realmSet$acceptanceButtonText(ru_unicorn_ujin_data_realm_flatbuttonsrealmproxyinterface2.realmGet$acceptanceButtonText());
        return flatButtons2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "FlatButtons = proxy[" + "{callButtonText:" + realmGet$callButtonText() + "}" + "," + "{acceptanceButtonText:" + realmGet$acceptanceButtonText() + "}" + "]";
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
        ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy = (ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_flatbuttonsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
