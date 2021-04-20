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
import p035ru.unicorn.ujin.data.realm.Bank;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy */
public class ru_unicorn_ujin_data_realm_BankRealmProxy extends Bank implements RealmObjectProxy, ru_unicorn_ujin_data_realm_BankRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BankColumnInfo columnInfo;
    private ProxyState<Bank> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Bank";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy$BankColumnInfo */
    static final class BankColumnInfo extends ColumnInfo {
        long accentColorIndex;
        long agreementUrlIndex;
        long idIndex;
        long logoIndex;
        long maxColumnIndexValue;
        long titleIndex;

        BankColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.accentColorIndex = addColumnDetails("accentColor", "accentColor", objectSchemaInfo);
            this.agreementUrlIndex = addColumnDetails("agreementUrl", "agreementUrl", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.logoIndex = addColumnDetails("logo", "logo", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BankColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BankColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BankColumnInfo bankColumnInfo = (BankColumnInfo) columnInfo;
            BankColumnInfo bankColumnInfo2 = (BankColumnInfo) columnInfo2;
            bankColumnInfo2.accentColorIndex = bankColumnInfo.accentColorIndex;
            bankColumnInfo2.agreementUrlIndex = bankColumnInfo.agreementUrlIndex;
            bankColumnInfo2.idIndex = bankColumnInfo.idIndex;
            bankColumnInfo2.titleIndex = bankColumnInfo.titleIndex;
            bankColumnInfo2.logoIndex = bankColumnInfo.logoIndex;
            bankColumnInfo2.maxColumnIndexValue = bankColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_BankRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BankColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$accentColor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accentColorIndex);
    }

    public void realmSet$accentColor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accentColorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accentColorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accentColorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accentColorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$agreementUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.agreementUrlIndex);
    }

    public void realmSet$agreementUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.agreementUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.agreementUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.agreementUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.agreementUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("accentColor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("agreementUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("logo", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BankColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BankColumnInfo(osSchemaInfo);
    }

    public static Bank createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Bank bank = (Bank) realm.createObjectInternal(Bank.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
        if (jSONObject.has("accentColor")) {
            if (jSONObject.isNull("accentColor")) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$accentColor((String) null);
            } else {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$accentColor(jSONObject.getString("accentColor"));
            }
        }
        if (jSONObject.has("agreementUrl")) {
            if (jSONObject.isNull("agreementUrl")) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$agreementUrl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$agreementUrl(jSONObject.getString("agreementUrl"));
            }
        }
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("logo")) {
            if (jSONObject.isNull("logo")) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$logo((String) null);
            } else {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$logo(jSONObject.getString("logo"));
            }
        }
        return bank;
    }

    public static Bank createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Bank bank = new Bank();
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("accentColor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$accentColor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$accentColor((String) null);
                }
            } else if (nextName.equals("agreementUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$agreementUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$agreementUrl((String) null);
                }
            } else if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("logo")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$logo(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$logo((String) null);
            }
        }
        jsonReader.endObject();
        return (Bank) realm.copyToRealm(bank, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_BankRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_BankRealmProxy ru_unicorn_ujin_data_realm_bankrealmproxy = new ru_unicorn_ujin_data_realm_BankRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_bankrealmproxy;
    }

    public static Bank copyOrUpdate(Realm realm, BankColumnInfo bankColumnInfo, Bank bank, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (bank instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bank;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return bank;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(bank);
        if (realmObjectProxy2 != null) {
            return (Bank) realmObjectProxy2;
        }
        return copy(realm, bankColumnInfo, bank, z, map, set);
    }

    public static Bank copy(Realm realm, BankColumnInfo bankColumnInfo, Bank bank, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bank);
        if (realmObjectProxy != null) {
            return (Bank) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Bank.class), bankColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(bankColumnInfo.accentColorIndex, ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$accentColor());
        osObjectBuilder.addString(bankColumnInfo.agreementUrlIndex, ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$agreementUrl());
        osObjectBuilder.addString(bankColumnInfo.idIndex, ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(bankColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(bankColumnInfo.logoIndex, ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$logo());
        ru_unicorn_ujin_data_realm_BankRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bank, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Bank bank, Map<RealmModel, Long> map) {
        if (bank instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bank;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Bank.class);
        long nativePtr = table.getNativePtr();
        BankColumnInfo bankColumnInfo = (BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class);
        long createRow = OsObject.createRow(table);
        map.put(bank, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.accentColorIndex, createRow, realmGet$accentColor, false);
        }
        String realmGet$agreementUrl = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$agreementUrl();
        if (realmGet$agreementUrl != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, realmGet$agreementUrl, false);
        }
        String realmGet$id = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$logo = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.logoIndex, createRow, realmGet$logo, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Bank.class);
        long nativePtr = table.getNativePtr();
        BankColumnInfo bankColumnInfo = (BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class);
        while (it.hasNext()) {
            Bank bank = (Bank) it.next();
            if (!map2.containsKey(bank)) {
                if (bank instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bank;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bank, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(bank, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.accentColorIndex, createRow, realmGet$accentColor, false);
                }
                String realmGet$agreementUrl = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$agreementUrl();
                if (realmGet$agreementUrl != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, realmGet$agreementUrl, false);
                }
                String realmGet$id = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$logo = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.logoIndex, createRow, realmGet$logo, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Bank bank, Map<RealmModel, Long> map) {
        if (bank instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bank;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Bank.class);
        long nativePtr = table.getNativePtr();
        BankColumnInfo bankColumnInfo = (BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class);
        long createRow = OsObject.createRow(table);
        map.put(bank, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.accentColorIndex, createRow, realmGet$accentColor, false);
        } else {
            Table.nativeSetNull(nativePtr, bankColumnInfo.accentColorIndex, createRow, false);
        }
        String realmGet$agreementUrl = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$agreementUrl();
        if (realmGet$agreementUrl != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, realmGet$agreementUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, false);
        }
        String realmGet$id = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, bankColumnInfo.idIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, bankColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$logo = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Table.nativeSetString(nativePtr, bankColumnInfo.logoIndex, createRow, realmGet$logo, false);
        } else {
            Table.nativeSetNull(nativePtr, bankColumnInfo.logoIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Bank.class);
        long nativePtr = table.getNativePtr();
        BankColumnInfo bankColumnInfo = (BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class);
        while (it.hasNext()) {
            Bank bank = (Bank) it.next();
            if (!map2.containsKey(bank)) {
                if (bank instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bank;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bank, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(bank, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank;
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.accentColorIndex, createRow, realmGet$accentColor, false);
                } else {
                    Table.nativeSetNull(nativePtr, bankColumnInfo.accentColorIndex, createRow, false);
                }
                String realmGet$agreementUrl = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$agreementUrl();
                if (realmGet$agreementUrl != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, realmGet$agreementUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, bankColumnInfo.agreementUrlIndex, createRow, false);
                }
                String realmGet$id = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, bankColumnInfo.idIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, bankColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$logo = ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Table.nativeSetString(nativePtr, bankColumnInfo.logoIndex, createRow, realmGet$logo, false);
                } else {
                    Table.nativeSetNull(nativePtr, bankColumnInfo.logoIndex, createRow, false);
                }
            }
        }
    }

    public static Bank createDetachedCopy(Bank bank, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Bank bank2;
        if (i > i2 || bank == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(bank);
        if (cacheData == null) {
            bank2 = new Bank();
            map.put(bank, new RealmObjectProxy.CacheData(i, bank2));
        } else if (i >= cacheData.minDepth) {
            return (Bank) cacheData.object;
        } else {
            cacheData.minDepth = i;
            bank2 = (Bank) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface = bank2;
        ru_unicorn_ujin_data_realm_BankRealmProxyInterface ru_unicorn_ujin_data_realm_bankrealmproxyinterface2 = bank;
        ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$accentColor(ru_unicorn_ujin_data_realm_bankrealmproxyinterface2.realmGet$accentColor());
        ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$agreementUrl(ru_unicorn_ujin_data_realm_bankrealmproxyinterface2.realmGet$agreementUrl());
        ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_bankrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_bankrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_bankrealmproxyinterface.realmSet$logo(ru_unicorn_ujin_data_realm_bankrealmproxyinterface2.realmGet$logo());
        return bank2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Bank = proxy[");
        sb.append("{accentColor:");
        String str = "null";
        sb.append(realmGet$accentColor() != null ? realmGet$accentColor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{agreementUrl:");
        sb.append(realmGet$agreementUrl() != null ? realmGet$agreementUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{logo:");
        if (realmGet$logo() != null) {
            str = realmGet$logo();
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
        ru_unicorn_ujin_data_realm_BankRealmProxy ru_unicorn_ujin_data_realm_bankrealmproxy = (ru_unicorn_ujin_data_realm_BankRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_bankrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_bankrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_bankrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
