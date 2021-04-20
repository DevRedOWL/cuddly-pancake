package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.android.JsonUtils;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy */
public class ru_unicorn_ujin_data_realm_MortrageRealmProxy extends Mortrage implements RealmObjectProxy, ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private MortrageColumnInfo columnInfo;
    private ProxyState<Mortrage> proxyState;
    private RealmList<String> textRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Mortrage";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy$MortrageColumnInfo */
    static final class MortrageColumnInfo extends ColumnInfo {
        long imgLogoBytesIndex;
        long logoIndex;
        long maxColumnIndexValue;
        long textIndex;
        long titleIndex;

        MortrageColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.logoIndex = addColumnDetails("logo", "logo", objectSchemaInfo);
            this.imgLogoBytesIndex = addColumnDetails("imgLogoBytes", "imgLogoBytes", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MortrageColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new MortrageColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            MortrageColumnInfo mortrageColumnInfo = (MortrageColumnInfo) columnInfo;
            MortrageColumnInfo mortrageColumnInfo2 = (MortrageColumnInfo) columnInfo2;
            mortrageColumnInfo2.titleIndex = mortrageColumnInfo.titleIndex;
            mortrageColumnInfo2.logoIndex = mortrageColumnInfo.logoIndex;
            mortrageColumnInfo2.imgLogoBytesIndex = mortrageColumnInfo.imgLogoBytesIndex;
            mortrageColumnInfo2.textIndex = mortrageColumnInfo.textIndex;
            mortrageColumnInfo2.maxColumnIndexValue = mortrageColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_MortrageRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (MortrageColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$logo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.logoIndex);
    }

    public void realmSet$logo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.logoIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.logoIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.logoIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.logoIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public byte[] realmGet$imgLogoBytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBinaryByteArray(this.columnInfo.imgLogoBytesIndex);
    }

    public void realmSet$imgLogoBytes(byte[] bArr) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bArr == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgLogoBytesIndex);
            } else {
                this.proxyState.getRow$realm().setBinaryByteArray(this.columnInfo.imgLogoBytesIndex, bArr);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bArr == null) {
                row$realm.getTable().setNull(this.columnInfo.imgLogoBytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBinaryByteArray(this.columnInfo.imgLogoBytesIndex, row$realm.getIndex(), bArr, true);
            }
        }
    }

    public RealmList<String> realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.textRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.textRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.textIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.textRealmList;
    }

    public void realmSet$text(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("text"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.textIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("logo", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgLogoBytes", RealmFieldType.BINARY, false, false, false);
        builder.addPersistedValueListProperty("text", RealmFieldType.STRING_LIST, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MortrageColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new MortrageColumnInfo(osSchemaInfo);
    }

    public static Mortrage createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("text")) {
            arrayList.add("text");
        }
        Mortrage mortrage = (Mortrage) realm.createObjectInternal(Mortrage.class, true, arrayList);
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("logo")) {
            if (jSONObject.isNull("logo")) {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$logo((String) null);
            } else {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$logo(jSONObject.getString("logo"));
            }
        }
        if (jSONObject.has("imgLogoBytes")) {
            if (jSONObject.isNull("imgLogoBytes")) {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$imgLogoBytes((byte[]) null);
            } else {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$imgLogoBytes(JsonUtils.stringToBytes(jSONObject.getString("imgLogoBytes")));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text(), jSONObject, "text");
        return mortrage;
    }

    public static Mortrage createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Mortrage mortrage = new Mortrage();
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("logo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$logo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$logo((String) null);
                }
            } else if (nextName.equals("imgLogoBytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$imgLogoBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$imgLogoBytes((byte[]) null);
                }
            } else if (nextName.equals("text")) {
                ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$text(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return (Mortrage) realm.copyToRealm(mortrage, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_MortrageRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_MortrageRealmProxy ru_unicorn_ujin_data_realm_mortragerealmproxy = new ru_unicorn_ujin_data_realm_MortrageRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_mortragerealmproxy;
    }

    public static Mortrage copyOrUpdate(Realm realm, MortrageColumnInfo mortrageColumnInfo, Mortrage mortrage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (mortrage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) mortrage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return mortrage;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(mortrage);
        if (realmObjectProxy2 != null) {
            return (Mortrage) realmObjectProxy2;
        }
        return copy(realm, mortrageColumnInfo, mortrage, z, map, set);
    }

    public static Mortrage copy(Realm realm, MortrageColumnInfo mortrageColumnInfo, Mortrage mortrage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(mortrage);
        if (realmObjectProxy != null) {
            return (Mortrage) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Mortrage.class), mortrageColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(mortrageColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(mortrageColumnInfo.logoIndex, ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$logo());
        osObjectBuilder.addByteArray(mortrageColumnInfo.imgLogoBytesIndex, ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$imgLogoBytes());
        osObjectBuilder.addStringList(mortrageColumnInfo.textIndex, ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text());
        ru_unicorn_ujin_data_realm_MortrageRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(mortrage, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Mortrage mortrage, Map<RealmModel, Long> map) {
        if (mortrage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) mortrage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Mortrage.class);
        long nativePtr = table.getNativePtr();
        MortrageColumnInfo mortrageColumnInfo = (MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class);
        long createRow = OsObject.createRow(table);
        map.put(mortrage, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
        String realmGet$title = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, mortrageColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$logo = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Table.nativeSetString(nativePtr, mortrageColumnInfo.logoIndex, createRow, realmGet$logo, false);
        }
        byte[] realmGet$imgLogoBytes = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$imgLogoBytes();
        if (realmGet$imgLogoBytes != null) {
            Table.nativeSetByteArray(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, realmGet$imgLogoBytes, false);
        }
        RealmList<String> realmGet$text = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), mortrageColumnInfo.textIndex);
            Iterator<String> it = realmGet$text.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Mortrage.class);
        long nativePtr = table.getNativePtr();
        MortrageColumnInfo mortrageColumnInfo = (MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class);
        while (it.hasNext()) {
            Mortrage mortrage = (Mortrage) it.next();
            if (!map2.containsKey(mortrage)) {
                if (mortrage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) mortrage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(mortrage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(mortrage, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
                String realmGet$title = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, mortrageColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$logo = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Table.nativeSetString(nativePtr, mortrageColumnInfo.logoIndex, createRow, realmGet$logo, false);
                }
                byte[] realmGet$imgLogoBytes = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$imgLogoBytes();
                if (realmGet$imgLogoBytes != null) {
                    Table.nativeSetByteArray(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, realmGet$imgLogoBytes, false);
                }
                RealmList<String> realmGet$text = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), mortrageColumnInfo.textIndex);
                    Iterator<String> it2 = realmGet$text.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Mortrage mortrage, Map<RealmModel, Long> map) {
        if (mortrage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) mortrage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Mortrage.class);
        long nativePtr = table.getNativePtr();
        MortrageColumnInfo mortrageColumnInfo = (MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class);
        long createRow = OsObject.createRow(table);
        map.put(mortrage, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
        String realmGet$title = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, mortrageColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, mortrageColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$logo = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Table.nativeSetString(nativePtr, mortrageColumnInfo.logoIndex, createRow, realmGet$logo, false);
        } else {
            Table.nativeSetNull(nativePtr, mortrageColumnInfo.logoIndex, createRow, false);
        }
        byte[] realmGet$imgLogoBytes = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$imgLogoBytes();
        if (realmGet$imgLogoBytes != null) {
            Table.nativeSetByteArray(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, realmGet$imgLogoBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(createRow), mortrageColumnInfo.textIndex);
        osList.removeAll();
        RealmList<String> realmGet$text = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Iterator<String> it = realmGet$text.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Mortrage.class);
        long nativePtr = table.getNativePtr();
        MortrageColumnInfo mortrageColumnInfo = (MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class);
        while (it.hasNext()) {
            Mortrage mortrage = (Mortrage) it.next();
            if (!map2.containsKey(mortrage)) {
                if (mortrage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) mortrage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(mortrage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(mortrage, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage;
                String realmGet$title = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, mortrageColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, mortrageColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$logo = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Table.nativeSetString(nativePtr, mortrageColumnInfo.logoIndex, createRow, realmGet$logo, false);
                } else {
                    Table.nativeSetNull(nativePtr, mortrageColumnInfo.logoIndex, createRow, false);
                }
                byte[] realmGet$imgLogoBytes = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$imgLogoBytes();
                if (realmGet$imgLogoBytes != null) {
                    Table.nativeSetByteArray(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, realmGet$imgLogoBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, mortrageColumnInfo.imgLogoBytesIndex, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), mortrageColumnInfo.textIndex);
                osList.removeAll();
                RealmList<String> realmGet$text = ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Iterator<String> it2 = realmGet$text.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
            }
        }
    }

    public static Mortrage createDetachedCopy(Mortrage mortrage, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Mortrage mortrage2;
        if (i > i2 || mortrage == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(mortrage);
        if (cacheData == null) {
            mortrage2 = new Mortrage();
            map.put(mortrage, new RealmObjectProxy.CacheData(i, mortrage2));
        } else if (i >= cacheData.minDepth) {
            return (Mortrage) cacheData.object;
        } else {
            cacheData.minDepth = i;
            mortrage2 = (Mortrage) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface = mortrage2;
        ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface ru_unicorn_ujin_data_realm_mortragerealmproxyinterface2 = mortrage;
        ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_mortragerealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$logo(ru_unicorn_ujin_data_realm_mortragerealmproxyinterface2.realmGet$logo());
        ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$imgLogoBytes(ru_unicorn_ujin_data_realm_mortragerealmproxyinterface2.realmGet$imgLogoBytes());
        ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmSet$text(new RealmList());
        ru_unicorn_ujin_data_realm_mortragerealmproxyinterface.realmGet$text().addAll(ru_unicorn_ujin_data_realm_mortragerealmproxyinterface2.realmGet$text());
        return mortrage2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
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
            java.lang.String r1 = "Mortrage = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{title:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$title()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$title()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{logo:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$logo()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r5.realmGet$logo()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{imgLogoBytes:"
            r0.append(r4)
            byte[] r4 = r5.realmGet$imgLogoBytes()
            if (r4 == 0) goto L_0x005d
            byte[] r2 = r5.realmGet$imgLogoBytes()
        L_0x005d:
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "{text:"
            r0.append(r2)
            java.lang.String r2 = "RealmList<String>["
            r0.append(r2)
            io.realm.RealmList r2 = r5.realmGet$text()
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_MortrageRealmProxy ru_unicorn_ujin_data_realm_mortragerealmproxy = (ru_unicorn_ujin_data_realm_MortrageRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_mortragerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_mortragerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_mortragerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
