package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX;
import p035ru.unicorn.ujin.serviceticket.data.TicketDataInX;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy */
public class ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy extends AllTicketDataInX implements RealmObjectProxy, C4635x52f550c9 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AllTicketDataInXColumnInfo columnInfo;
    private ProxyState<AllTicketDataInX> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AllTicketDataInX";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy$AllTicketDataInXColumnInfo */
    static final class AllTicketDataInXColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long ticketIndex;

        AllTicketDataInXColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.ticketIndex = addColumnDetails("ticket", "ticket", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AllTicketDataInXColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AllTicketDataInXColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AllTicketDataInXColumnInfo allTicketDataInXColumnInfo = (AllTicketDataInXColumnInfo) columnInfo;
            AllTicketDataInXColumnInfo allTicketDataInXColumnInfo2 = (AllTicketDataInXColumnInfo) columnInfo2;
            allTicketDataInXColumnInfo2.ticketIndex = allTicketDataInXColumnInfo.ticketIndex;
            allTicketDataInXColumnInfo2.idIndex = allTicketDataInXColumnInfo.idIndex;
            allTicketDataInXColumnInfo2.maxColumnIndexValue = allTicketDataInXColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AllTicketDataInXColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public TicketDataInX realmGet$ticket() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketIndex)) {
            return null;
        }
        return (TicketDataInX) this.proxyState.getRealm$realm().get(TicketDataInX.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketIndex), false, Collections.emptyList());
    }

    public void realmSet$ticket(TicketDataInX ticketDataInX) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketDataInX == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketDataInX);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketIndex, ((RealmObjectProxy) ticketDataInX).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticket")) {
            if (ticketDataInX != null && !RealmObject.isManaged(ticketDataInX)) {
                ticketDataInX = (TicketDataInX) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketDataInX, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketDataInX == null) {
                row$realm.nullifyLink(this.columnInfo.ticketIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketDataInX);
            row$realm.getTable().setLink(this.columnInfo.ticketIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketDataInX).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("ticket", RealmFieldType.OBJECT, ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AllTicketDataInXColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AllTicketDataInXColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
        /*
            r0 = r15
            r7 = r16
            r8 = r17
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x0069
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r1 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r3 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy$AllTicketDataInXColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.AllTicketDataInXColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r7.isNull(r12)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            long r13 = r7.getLong(r12)
            long r2 = r1.findFirstLong(r2, r13)
            goto L_0x0036
        L_0x0035:
            r2 = r5
        L_0x0036:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0064 }
            io.realm.RealmSchema r1 = r15.getSchema()     // Catch:{ all -> 0x0064 }
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r2 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy r1 = new io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            r13.clear()
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x0069:
            r1 = r11
        L_0x006a:
            java.lang.String r2 = "ticket"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r12)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r12)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r1 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r1 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            int r3 = r7.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxyInterface r3 = (p046io.realm.C4635x52f550c9) r3
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x00c3
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x00b8
            r3.realmSet$ticket(r11)
            goto L_0x00c3
        L_0x00b8:
            org.json.JSONObject r2 = r7.getJSONObject(r2)
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r0 = p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createOrUpdateUsingJsonObject(r15, r2, r8)
            r3.realmSet$ticket(r0)
        L_0x00c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.serviceticket.data.AllTicketDataInX");
    }

    public static AllTicketDataInX createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        AllTicketDataInX allTicketDataInX = new AllTicketDataInX();
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("ticket")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmSet$ticket((TicketDataInX) null);
                } else {
                    ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmSet$ticket(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("id")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                z = true;
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        jsonReader.endObject();
        if (z) {
            return (AllTicketDataInX) realm.copyToRealm(allTicketDataInX, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class), false, Collections.emptyList());
        ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy = new ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.AllTicketDataInXColumnInfo r9, p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r1 = (p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.AllTicketDataInX> r2 = p035ru.unicorn.ujin.serviceticket.data.AllTicketDataInX.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxyInterface r5 = (p046io.realm.C4635x52f550c9) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy r1 = new io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.serviceticket.data.AllTicketDataInX r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy$AllTicketDataInXColumnInfo, ru.unicorn.ujin.serviceticket.data.AllTicketDataInX, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.serviceticket.data.AllTicketDataInX");
    }

    public static AllTicketDataInX copy(Realm realm, AllTicketDataInXColumnInfo allTicketDataInXColumnInfo, AllTicketDataInX allTicketDataInX, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(allTicketDataInX);
        if (realmObjectProxy != null) {
            return (AllTicketDataInX) realmObjectProxy;
        }
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AllTicketDataInX.class), allTicketDataInXColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(allTicketDataInXColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()));
        ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(allTicketDataInX, newProxyInstance);
        TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket == null) {
            newProxyInstance.realmSet$ticket((TicketDataInX) null);
        } else {
            TicketDataInX ticketDataInX = (TicketDataInX) map.get(realmGet$ticket);
            if (ticketDataInX != null) {
                newProxyInstance.realmSet$ticket(ticketDataInX);
            } else {
                newProxyInstance.realmSet$ticket(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class), realmGet$ticket, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, AllTicketDataInX allTicketDataInX, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        AllTicketDataInX allTicketDataInX2 = allTicketDataInX;
        Map<RealmModel, Long> map2 = map;
        if (allTicketDataInX2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) allTicketDataInX2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(AllTicketDataInX.class);
        long nativePtr = table.getNativePtr();
        AllTicketDataInXColumnInfo allTicketDataInXColumnInfo = (AllTicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class);
        long j3 = allTicketDataInXColumnInfo.idIndex;
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(allTicketDataInX2, Long.valueOf(j2));
        TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket != null) {
            Long l = map2.get(realmGet$ticket);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insert(realm2, realmGet$ticket, map2));
            }
            Table.nativeSetLink(nativePtr, allTicketDataInXColumnInfo.ticketIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(AllTicketDataInX.class);
        long nativePtr = table.getNativePtr();
        AllTicketDataInXColumnInfo allTicketDataInXColumnInfo = (AllTicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class);
        long j2 = allTicketDataInXColumnInfo.idIndex;
        while (it.hasNext()) {
            AllTicketDataInX allTicketDataInX = (AllTicketDataInX) it.next();
            if (!map2.containsKey(allTicketDataInX)) {
                if (allTicketDataInX instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) allTicketDataInX;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(allTicketDataInX, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(allTicketDataInX, Long.valueOf(j3));
                TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$ticket();
                if (realmGet$ticket != null) {
                    Long l = map2.get(realmGet$ticket);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insert(realm2, realmGet$ticket, map2));
                    }
                    table.setLink(allTicketDataInXColumnInfo.ticketIndex, j3, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, AllTicketDataInX allTicketDataInX, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        AllTicketDataInX allTicketDataInX2 = allTicketDataInX;
        Map<RealmModel, Long> map2 = map;
        if (allTicketDataInX2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) allTicketDataInX2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(AllTicketDataInX.class);
        long nativePtr = table.getNativePtr();
        AllTicketDataInXColumnInfo allTicketDataInXColumnInfo = (AllTicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class);
        long j = allTicketDataInXColumnInfo.idIndex;
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(allTicketDataInX2, Long.valueOf(createRowWithPrimaryKey));
        TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket != null) {
            Long l = map2.get(realmGet$ticket);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insertOrUpdate(realm2, realmGet$ticket, map2));
            }
            Table.nativeSetLink(nativePtr, allTicketDataInXColumnInfo.ticketIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, allTicketDataInXColumnInfo.ticketIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(AllTicketDataInX.class);
        long nativePtr = table.getNativePtr();
        AllTicketDataInXColumnInfo allTicketDataInXColumnInfo = (AllTicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AllTicketDataInX.class);
        long j3 = allTicketDataInXColumnInfo.idIndex;
        while (it.hasNext()) {
            AllTicketDataInX allTicketDataInX = (AllTicketDataInX) it.next();
            if (!map2.containsKey(allTicketDataInX)) {
                if (allTicketDataInX instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) allTicketDataInX;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(allTicketDataInX, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX;
                if (Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(allTicketDataInX, Long.valueOf(j4));
                TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmGet$ticket();
                if (realmGet$ticket != null) {
                    Long l = map2.get(realmGet$ticket);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.insertOrUpdate(realm2, realmGet$ticket, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, allTicketDataInXColumnInfo.ticketIndex, j4, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, allTicketDataInXColumnInfo.ticketIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static AllTicketDataInX createDetachedCopy(AllTicketDataInX allTicketDataInX, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        AllTicketDataInX allTicketDataInX2;
        if (i > i2 || allTicketDataInX == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(allTicketDataInX);
        if (cacheData == null) {
            allTicketDataInX2 = new AllTicketDataInX();
            map.put(allTicketDataInX, new RealmObjectProxy.CacheData(i, allTicketDataInX2));
        } else if (i >= cacheData.minDepth) {
            return (AllTicketDataInX) cacheData.object;
        } else {
            cacheData.minDepth = i;
            allTicketDataInX2 = (AllTicketDataInX) cacheData.object;
        }
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX2;
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2 = allTicketDataInX;
        ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmSet$ticket(ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createDetachedCopy(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2.realmGet$ticket(), i + 1, i2, map));
        ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface.realmSet$id(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2.realmGet$id());
        return allTicketDataInX2;
    }

    static AllTicketDataInX update(Realm realm, AllTicketDataInXColumnInfo allTicketDataInXColumnInfo, AllTicketDataInX allTicketDataInX, AllTicketDataInX allTicketDataInX2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface = allTicketDataInX;
        C4635x52f550c9 ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2 = allTicketDataInX2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AllTicketDataInX.class), allTicketDataInXColumnInfo.maxColumnIndexValue, set);
        TicketDataInX realmGet$ticket = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2.realmGet$ticket();
        if (realmGet$ticket == null) {
            osObjectBuilder.addNull(allTicketDataInXColumnInfo.ticketIndex);
        } else {
            TicketDataInX ticketDataInX = (TicketDataInX) map.get(realmGet$ticket);
            if (ticketDataInX != null) {
                osObjectBuilder.addObject(allTicketDataInXColumnInfo.ticketIndex, ticketDataInX);
            } else {
                osObjectBuilder.addObject(allTicketDataInXColumnInfo.ticketIndex, ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class), realmGet$ticket, true, map, set));
            }
        }
        osObjectBuilder.addInteger(allTicketDataInXColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.updateExistingObject();
        return allTicketDataInX;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AllTicketDataInX = proxy[");
        sb.append("{ticket:");
        sb.append(realmGet$ticket() != null ? ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(realmGet$id());
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
        ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy = (ru_unicorn_ujin_serviceticket_data_AllTicketDataInXRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_serviceticket_data_allticketdatainxrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
