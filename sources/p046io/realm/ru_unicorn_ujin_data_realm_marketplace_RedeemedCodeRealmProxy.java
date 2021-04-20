package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate;
import p046io.realm.BaseRealm;
import p046io.realm.C4620xe7ed888c;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy extends RedeemedCode implements RealmObjectProxy, C4622xd65fbd1b {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RedeemedCodeColumnInfo columnInfo;
    private ProxyState<RedeemedCode> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RedeemedCode";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy$RedeemedCodeColumnInfo */
    static final class RedeemedCodeColumnInfo extends ColumnInfo {
        long expiredAtIndex;
        long idIndex;
        long maxColumnIndexValue;
        long textIndex;

        RedeemedCodeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.expiredAtIndex = addColumnDetails("expiredAt", "expiredAt", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RedeemedCodeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RedeemedCodeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RedeemedCodeColumnInfo redeemedCodeColumnInfo = (RedeemedCodeColumnInfo) columnInfo;
            RedeemedCodeColumnInfo redeemedCodeColumnInfo2 = (RedeemedCodeColumnInfo) columnInfo2;
            redeemedCodeColumnInfo2.idIndex = redeemedCodeColumnInfo.idIndex;
            redeemedCodeColumnInfo2.textIndex = redeemedCodeColumnInfo.textIndex;
            redeemedCodeColumnInfo2.expiredAtIndex = redeemedCodeColumnInfo.expiredAtIndex;
            redeemedCodeColumnInfo2.maxColumnIndexValue = redeemedCodeColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RedeemedCodeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textIndex);
    }

    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RedeemedCodeDate realmGet$expiredAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.expiredAtIndex)) {
            return null;
        }
        return (RedeemedCodeDate) this.proxyState.getRealm$realm().get(RedeemedCodeDate.class, this.proxyState.getRow$realm().getLink(this.columnInfo.expiredAtIndex), false, Collections.emptyList());
    }

    public void realmSet$expiredAt(RedeemedCodeDate redeemedCodeDate) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (redeemedCodeDate == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.expiredAtIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCodeDate);
            this.proxyState.getRow$realm().setLink(this.columnInfo.expiredAtIndex, ((RealmObjectProxy) redeemedCodeDate).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("expiredAt")) {
            if (redeemedCodeDate != null && !RealmObject.isManaged(redeemedCodeDate)) {
                redeemedCodeDate = (RedeemedCodeDate) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(redeemedCodeDate, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (redeemedCodeDate == null) {
                row$realm.nullifyLink(this.columnInfo.expiredAtIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCodeDate);
            row$realm.getTable().setLink(this.columnInfo.expiredAtIndex, row$realm.getIndex(), ((RealmObjectProxy) redeemedCodeDate).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("expiredAt", RealmFieldType.OBJECT, C4620xe7ed888c.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RedeemedCodeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RedeemedCodeColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r1 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r3 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy$RedeemedCodeColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r12)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            long r4 = r15.getLong(r12)
            long r2 = r1.findFirstLong(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r2 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r11
        L_0x006c:
            java.lang.String r2 = "expiredAt"
            if (r1 != 0) goto L_0x00a7
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r12)
            if (r1 == 0) goto L_0x009f
            boolean r1 = r15.isNull(r12)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r1 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy) r1
            goto L_0x00a7
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r1 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            int r3 = r15.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy) r1
            goto L_0x00a7
        L_0x009f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxyInterface r3 = (p046io.realm.C4622xd65fbd1b) r3
            java.lang.String r4 = "text"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00c3
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00bc
            r3.realmSet$text(r11)
            goto L_0x00c3
        L_0x00bc:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$text(r4)
        L_0x00c3:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00de
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00d3
            r3.realmSet$expiredAt(r11)
            goto L_0x00de
        L_0x00d3:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCodeDate r0 = p046io.realm.C4620xe7ed888c.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$expiredAt(r0)
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.RedeemedCode");
    }

    public static RedeemedCode createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RedeemedCode redeemedCode = new RedeemedCode();
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$text((String) null);
                }
            } else if (!nextName.equals("expiredAt")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$expiredAt((RedeemedCodeDate) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$expiredAt(C4620xe7ed888c.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RedeemedCode) realm.copyToRealm(redeemedCode, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy = new ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = (p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.RedeemedCode> r2 = p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxyInterface r5 = (p046io.realm.C4622xd65fbd1b) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy$RedeemedCodeColumnInfo, ru.unicorn.ujin.data.realm.marketplace.RedeemedCode, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.RedeemedCode");
    }

    public static RedeemedCode copy(Realm realm, RedeemedCodeColumnInfo redeemedCodeColumnInfo, RedeemedCode redeemedCode, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(redeemedCode);
        if (realmObjectProxy != null) {
            return (RedeemedCode) realmObjectProxy;
        }
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RedeemedCode.class), redeemedCodeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(redeemedCodeColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(redeemedCodeColumnInfo.textIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$text());
        ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(redeemedCode, newProxyInstance);
        RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$expiredAt();
        if (realmGet$expiredAt == null) {
            newProxyInstance.realmSet$expiredAt((RedeemedCodeDate) null);
        } else {
            RedeemedCodeDate redeemedCodeDate = (RedeemedCodeDate) map.get(realmGet$expiredAt);
            if (redeemedCodeDate != null) {
                newProxyInstance.realmSet$expiredAt(redeemedCodeDate);
            } else {
                newProxyInstance.realmSet$expiredAt(C4620xe7ed888c.copyOrUpdate(realm, (C4620xe7ed888c.RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class), realmGet$expiredAt, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RedeemedCode redeemedCode, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RedeemedCode redeemedCode2 = redeemedCode;
        Map<RealmModel, Long> map2 = map;
        if (redeemedCode2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCode2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RedeemedCode.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeColumnInfo redeemedCodeColumnInfo = (RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class);
        long j3 = redeemedCodeColumnInfo.idIndex;
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(redeemedCode2, Long.valueOf(j2));
        String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, redeemedCodeColumnInfo.textIndex, j2, realmGet$text, false);
        }
        RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$expiredAt();
        if (realmGet$expiredAt != null) {
            Long l = map2.get(realmGet$expiredAt);
            if (l == null) {
                l = Long.valueOf(C4620xe7ed888c.insert(realm2, realmGet$expiredAt, map2));
            }
            Table.nativeSetLink(nativePtr, redeemedCodeColumnInfo.expiredAtIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RedeemedCode.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeColumnInfo redeemedCodeColumnInfo = (RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class);
        long j2 = redeemedCodeColumnInfo.idIndex;
        while (it.hasNext()) {
            RedeemedCode redeemedCode = (RedeemedCode) it.next();
            if (!map2.containsKey(redeemedCode)) {
                if (redeemedCode instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCode;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(redeemedCode, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(redeemedCode, Long.valueOf(j3));
                String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, redeemedCodeColumnInfo.textIndex, j3, realmGet$text, false);
                }
                RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$expiredAt();
                if (realmGet$expiredAt != null) {
                    Long l = map2.get(realmGet$expiredAt);
                    if (l == null) {
                        l = Long.valueOf(C4620xe7ed888c.insert(realm2, realmGet$expiredAt, map2));
                    }
                    table.setLink(redeemedCodeColumnInfo.expiredAtIndex, j3, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RedeemedCode redeemedCode, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        RedeemedCode redeemedCode2 = redeemedCode;
        Map<RealmModel, Long> map2 = map;
        if (redeemedCode2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCode2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RedeemedCode.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeColumnInfo redeemedCodeColumnInfo = (RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class);
        long j2 = redeemedCodeColumnInfo.idIndex;
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode2;
        if (ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id()) : j;
        map2.put(redeemedCode2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, redeemedCodeColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, redeemedCodeColumnInfo.textIndex, createRowWithPrimaryKey, false);
        }
        RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$expiredAt();
        if (realmGet$expiredAt != null) {
            Long l = map2.get(realmGet$expiredAt);
            if (l == null) {
                l = Long.valueOf(C4620xe7ed888c.insertOrUpdate(realm2, realmGet$expiredAt, map2));
            }
            Table.nativeSetLink(nativePtr, redeemedCodeColumnInfo.expiredAtIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, redeemedCodeColumnInfo.expiredAtIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RedeemedCode.class);
        long nativePtr = table.getNativePtr();
        RedeemedCodeColumnInfo redeemedCodeColumnInfo = (RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class);
        long j3 = redeemedCodeColumnInfo.idIndex;
        while (it.hasNext()) {
            RedeemedCode redeemedCode = (RedeemedCode) it.next();
            if (!map2.containsKey(redeemedCode)) {
                if (redeemedCode instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemedCode;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(redeemedCode, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode;
                if (ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(redeemedCode, Long.valueOf(j4));
                String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, redeemedCodeColumnInfo.textIndex, j4, realmGet$text, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, redeemedCodeColumnInfo.textIndex, j4, false);
                }
                RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmGet$expiredAt();
                if (realmGet$expiredAt != null) {
                    Long l = map2.get(realmGet$expiredAt);
                    if (l == null) {
                        l = Long.valueOf(C4620xe7ed888c.insertOrUpdate(realm2, realmGet$expiredAt, map2));
                    }
                    Table.nativeSetLink(nativePtr, redeemedCodeColumnInfo.expiredAtIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, redeemedCodeColumnInfo.expiredAtIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static RedeemedCode createDetachedCopy(RedeemedCode redeemedCode, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RedeemedCode redeemedCode2;
        if (i > i2 || redeemedCode == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(redeemedCode);
        if (cacheData == null) {
            redeemedCode2 = new RedeemedCode();
            map.put(redeemedCode, new RealmObjectProxy.CacheData(i, redeemedCode2));
        } else if (i >= cacheData.minDepth) {
            return (RedeemedCode) cacheData.object;
        } else {
            cacheData.minDepth = i;
            redeemedCode2 = (RedeemedCode) cacheData.object;
        }
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode2;
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2 = redeemedCode;
        ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$text(ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$text());
        ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface.realmSet$expiredAt(C4620xe7ed888c.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$expiredAt(), i + 1, i2, map));
        return redeemedCode2;
    }

    static RedeemedCode update(Realm realm, RedeemedCodeColumnInfo redeemedCodeColumnInfo, RedeemedCode redeemedCode, RedeemedCode redeemedCode2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface = redeemedCode;
        C4622xd65fbd1b ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2 = redeemedCode2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RedeemedCode.class), redeemedCodeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(redeemedCodeColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(redeemedCodeColumnInfo.textIndex, ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$text());
        RedeemedCodeDate realmGet$expiredAt = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxyinterface2.realmGet$expiredAt();
        if (realmGet$expiredAt == null) {
            osObjectBuilder.addNull(redeemedCodeColumnInfo.expiredAtIndex);
        } else {
            RedeemedCodeDate redeemedCodeDate = (RedeemedCodeDate) map.get(realmGet$expiredAt);
            if (redeemedCodeDate != null) {
                osObjectBuilder.addObject(redeemedCodeColumnInfo.expiredAtIndex, redeemedCodeDate);
            } else {
                osObjectBuilder.addObject(redeemedCodeColumnInfo.expiredAtIndex, C4620xe7ed888c.copyOrUpdate(realm, (C4620xe7ed888c.RedeemedCodeDateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCodeDate.class), realmGet$expiredAt, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return redeemedCode;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RedeemedCode = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(realmGet$text() != null ? realmGet$text() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{expiredAt:");
        if (realmGet$expiredAt() != null) {
            str = C4620xe7ed888c.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy = (ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_redeemedcoderealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
