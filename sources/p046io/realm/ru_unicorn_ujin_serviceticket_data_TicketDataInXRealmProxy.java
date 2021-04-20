package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.serviceticket.data.TicketDataInX;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
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

/* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy */
public class ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy extends TicketDataInX implements RealmObjectProxy, C4636x66dc8dd2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketDataInXColumnInfo columnInfo;
    private ProxyState<TicketDataInX> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketDataInX";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy$TicketDataInXColumnInfo */
    static final class TicketDataInXColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long numberIndex;
        long titleIndex;

        TicketDataInXColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.numberIndex = addColumnDetails(CardFragment.ARG_NUMBER, CardFragment.ARG_NUMBER, objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketDataInXColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketDataInXColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketDataInXColumnInfo ticketDataInXColumnInfo = (TicketDataInXColumnInfo) columnInfo;
            TicketDataInXColumnInfo ticketDataInXColumnInfo2 = (TicketDataInXColumnInfo) columnInfo2;
            ticketDataInXColumnInfo2.idIndex = ticketDataInXColumnInfo.idIndex;
            ticketDataInXColumnInfo2.numberIndex = ticketDataInXColumnInfo.numberIndex;
            ticketDataInXColumnInfo2.titleIndex = ticketDataInXColumnInfo.titleIndex;
            ticketDataInXColumnInfo2.maxColumnIndexValue = ticketDataInXColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketDataInXColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.numberIndex);
    }

    public void realmSet$number(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.numberIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.numberIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'number' to null.");
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty(CardFragment.ARG_NUMBER, RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketDataInXColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketDataInXColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.serviceticket.data.TicketDataInX createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r14 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r4 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy$TicketDataInXColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.TicketDataInXColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r2)
            r6 = -1
            if (r5 != 0) goto L_0x002e
            long r8 = r13.getLong(r2)
            long r3 = r14.findFirstLong(r3, r8)
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005c }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005c }
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r3 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy r14 = new io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy     // Catch:{ all -> 0x005c }
            r14.<init>()     // Catch:{ all -> 0x005c }
            r5.clear()
            goto L_0x0062
        L_0x005c:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0061:
            r14 = r1
        L_0x0062:
            if (r14 != 0) goto L_0x0095
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008d
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007b
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r14 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r14 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxyInterface r12 = (p046io.realm.C4636x66dc8dd2) r12
            java.lang.String r0 = "number"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00aa
            r12.realmSet$number(r1)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$number(r0)
        L_0x00b1:
            java.lang.String r0 = "title"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00ca
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00c3
            r12.realmSet$title(r1)
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$title(r13)
        L_0x00ca:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.serviceticket.data.TicketDataInX");
    }

    public static TicketDataInX createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketDataInX ticketDataInX = new TicketDataInX();
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals(CardFragment.ARG_NUMBER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$number(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$number((String) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TicketDataInX) realm.copyToRealm(ticketDataInX, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class), false, Collections.emptyList());
        ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy = new ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.serviceticket.data.TicketDataInX copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.TicketDataInXColumnInfo r9, p035ru.unicorn.ujin.serviceticket.data.TicketDataInX r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r1 = (p035ru.unicorn.ujin.serviceticket.data.TicketDataInX) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.serviceticket.data.TicketDataInX> r2 = p035ru.unicorn.ujin.serviceticket.data.TicketDataInX.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxyInterface r5 = (p046io.realm.C4636x66dc8dd2) r5
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
            io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy r1 = new io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.serviceticket.data.TicketDataInX r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy$TicketDataInXColumnInfo, ru.unicorn.ujin.serviceticket.data.TicketDataInX, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.serviceticket.data.TicketDataInX");
    }

    public static TicketDataInX copy(Realm realm, TicketDataInXColumnInfo ticketDataInXColumnInfo, TicketDataInX ticketDataInX, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketDataInX);
        if (realmObjectProxy != null) {
            return (TicketDataInX) realmObjectProxy;
        }
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketDataInX.class), ticketDataInXColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketDataInXColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(ticketDataInXColumnInfo.numberIndex, ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$number());
        osObjectBuilder.addString(ticketDataInXColumnInfo.titleIndex, ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$title());
        ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketDataInX, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketDataInX ticketDataInX, Map<RealmModel, Long> map) {
        long j;
        long j2;
        TicketDataInX ticketDataInX2 = ticketDataInX;
        if (ticketDataInX2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDataInX2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketDataInX.class);
        long nativePtr = table.getNativePtr();
        TicketDataInXColumnInfo ticketDataInXColumnInfo = (TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class);
        long j3 = ticketDataInXColumnInfo.idIndex;
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(ticketDataInX2, Long.valueOf(j2));
        String realmGet$number = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.numberIndex, j2, realmGet$number, false);
        }
        String realmGet$title = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketDataInX.class);
        long nativePtr = table.getNativePtr();
        TicketDataInXColumnInfo ticketDataInXColumnInfo = (TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class);
        long j2 = ticketDataInXColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketDataInX ticketDataInX = (TicketDataInX) it.next();
            if (!map2.containsKey(ticketDataInX)) {
                if (ticketDataInX instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDataInX;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDataInX, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(ticketDataInX, Long.valueOf(j3));
                String realmGet$number = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.numberIndex, j3, realmGet$number, false);
                }
                String realmGet$title = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.titleIndex, j3, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketDataInX ticketDataInX, Map<RealmModel, Long> map) {
        TicketDataInX ticketDataInX2 = ticketDataInX;
        if (ticketDataInX2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDataInX2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketDataInX.class);
        long nativePtr = table.getNativePtr();
        TicketDataInXColumnInfo ticketDataInXColumnInfo = (TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class);
        long j = ticketDataInXColumnInfo.idIndex;
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map.put(ticketDataInX2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$number = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDataInXColumnInfo.numberIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$title = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDataInXColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketDataInX.class);
        long nativePtr = table.getNativePtr();
        TicketDataInXColumnInfo ticketDataInXColumnInfo = (TicketDataInXColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDataInX.class);
        long j2 = ticketDataInXColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketDataInX ticketDataInX = (TicketDataInX) it.next();
            if (!map2.containsKey(ticketDataInX)) {
                if (ticketDataInX instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDataInX;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDataInX, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX;
                if (Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(ticketDataInX, Long.valueOf(j3));
                String realmGet$number = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.numberIndex, j3, realmGet$number, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDataInXColumnInfo.numberIndex, j3, false);
                }
                String realmGet$title = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketDataInXColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDataInXColumnInfo.titleIndex, j3, false);
                }
            }
        }
    }

    public static TicketDataInX createDetachedCopy(TicketDataInX ticketDataInX, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketDataInX ticketDataInX2;
        if (i > i2 || ticketDataInX == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketDataInX);
        if (cacheData == null) {
            ticketDataInX2 = new TicketDataInX();
            map.put(ticketDataInX, new RealmObjectProxy.CacheData(i, ticketDataInX2));
        } else if (i >= cacheData.minDepth) {
            return (TicketDataInX) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketDataInX2 = (TicketDataInX) cacheData.object;
        }
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX2;
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2 = ticketDataInX;
        ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$id(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$number(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$number());
        ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface.realmSet$title(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$title());
        return ticketDataInX2;
    }

    static TicketDataInX update(Realm realm, TicketDataInXColumnInfo ticketDataInXColumnInfo, TicketDataInX ticketDataInX, TicketDataInX ticketDataInX2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface = ticketDataInX;
        C4636x66dc8dd2 ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2 = ticketDataInX2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketDataInX.class), ticketDataInXColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketDataInXColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(ticketDataInXColumnInfo.numberIndex, ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$number());
        osObjectBuilder.addString(ticketDataInXColumnInfo.titleIndex, ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxyinterface2.realmGet$title());
        osObjectBuilder.updateExistingObject();
        return ticketDataInX;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "TicketDataInX = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{number:" + realmGet$number() + "}" + "," + "{title:" + realmGet$title() + "}" + "]";
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
        ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy = (ru_unicorn_ujin_serviceticket_data_TicketDataInXRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_serviceticket_data_ticketdatainxrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
