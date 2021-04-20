package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.profile.RentComplex;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy extends RentComplex implements RealmObjectProxy, C4632x6b4fd43c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentComplexColumnInfo columnInfo;
    private ProxyState<RentComplex> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentComplex";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy$RentComplexColumnInfo */
    static final class RentComplexColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        RentComplexColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentComplexColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentComplexColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentComplexColumnInfo rentComplexColumnInfo = (RentComplexColumnInfo) columnInfo;
            RentComplexColumnInfo rentComplexColumnInfo2 = (RentComplexColumnInfo) columnInfo2;
            rentComplexColumnInfo2.idIndex = rentComplexColumnInfo.idIndex;
            rentComplexColumnInfo2.titleIndex = rentComplexColumnInfo.titleIndex;
            rentComplexColumnInfo2.maxColumnIndexValue = rentComplexColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentComplexColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentComplexColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentComplexColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentComplex createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r14 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r4 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy$RentComplexColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.RentComplexColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r3 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy     // Catch:{ all -> 0x005c }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r14 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r14 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            long r4 = r13.getLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxyInterface r12 = (p046io.realm.C4632x6b4fd43c) r12
            java.lang.String r0 = "title"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00aa
            r12.realmSet$title(r1)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$title(r13)
        L_0x00b1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.RentComplex");
    }

    public static RentComplex createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentComplex rentComplex = new RentComplex();
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentComplex) realm.copyToRealm(rentComplex, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy = new ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentComplex copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.RentComplexColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.RentComplex r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.RentComplex r1 = (p035ru.unicorn.ujin.data.realm.profile.RentComplex) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentComplex> r2 = p035ru.unicorn.ujin.data.realm.profile.RentComplex.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxyInterface r5 = (p046io.realm.C4632x6b4fd43c) r5
            long r5 = r5.realmGet$id()
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.profile.RentComplex r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.RentComplex r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy$RentComplexColumnInfo, ru.unicorn.ujin.data.realm.profile.RentComplex, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.RentComplex");
    }

    public static RentComplex copy(Realm realm, RentComplexColumnInfo rentComplexColumnInfo, RentComplex rentComplex, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentComplex);
        if (realmObjectProxy != null) {
            return (RentComplex) realmObjectProxy;
        }
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentComplex.class), rentComplexColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentComplexColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(rentComplexColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$title());
        ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentComplex, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentComplex rentComplex, Map<RealmModel, Long> map) {
        long j;
        long j2;
        RentComplex rentComplex2 = rentComplex;
        if (rentComplex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentComplex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentComplex.class);
        long nativePtr = table.getNativePtr();
        RentComplexColumnInfo rentComplexColumnInfo = (RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class);
        long j3 = rentComplexColumnInfo.idIndex;
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(rentComplex2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentComplexColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentComplex.class);
        long nativePtr = table.getNativePtr();
        RentComplexColumnInfo rentComplexColumnInfo = (RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class);
        long j2 = rentComplexColumnInfo.idIndex;
        while (it.hasNext()) {
            RentComplex rentComplex = (RentComplex) it.next();
            if (!map2.containsKey(rentComplex)) {
                if (rentComplex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentComplex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentComplex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(rentComplex, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentComplexColumnInfo.titleIndex, j3, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentComplex rentComplex, Map<RealmModel, Long> map) {
        RentComplex rentComplex2 = rentComplex;
        if (rentComplex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentComplex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentComplex.class);
        long nativePtr = table.getNativePtr();
        RentComplexColumnInfo rentComplexColumnInfo = (RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class);
        long j = rentComplexColumnInfo.idIndex;
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map.put(rentComplex2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentComplexColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, rentComplexColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentComplex.class);
        long nativePtr = table.getNativePtr();
        RentComplexColumnInfo rentComplexColumnInfo = (RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class);
        long j2 = rentComplexColumnInfo.idIndex;
        while (it.hasNext()) {
            RentComplex rentComplex = (RentComplex) it.next();
            if (!map2.containsKey(rentComplex)) {
                if (rentComplex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentComplex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentComplex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(rentComplex, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentComplexColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentComplexColumnInfo.titleIndex, j3, false);
                }
            }
        }
    }

    public static RentComplex createDetachedCopy(RentComplex rentComplex, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentComplex rentComplex2;
        if (i > i2 || rentComplex == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentComplex);
        if (cacheData == null) {
            rentComplex2 = new RentComplex();
            map.put(rentComplex, new RealmObjectProxy.CacheData(i, rentComplex2));
        } else if (i >= cacheData.minDepth) {
            return (RentComplex) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentComplex2 = (RentComplex) cacheData.object;
        }
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex2;
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2 = rentComplex;
        ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2.realmGet$title());
        return rentComplex2;
    }

    static RentComplex update(Realm realm, RentComplexColumnInfo rentComplexColumnInfo, RentComplex rentComplex, RentComplex rentComplex2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface = rentComplex;
        C4632x6b4fd43c ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2 = rentComplex2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentComplex.class), rentComplexColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentComplexColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(rentComplexColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxyinterface2.realmGet$title());
        osObjectBuilder.updateExistingObject();
        return rentComplex;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentComplex = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : "null");
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
        ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy = (ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_rentcomplexrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
