package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy */
public class C4834x9fbcbe06 extends CityDTO implements RealmObjectProxy, C4835x24d935d3 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CityDTOColumnInfo columnInfo;
    private ProxyState<CityDTO> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CityDTO";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy$CityDTOColumnInfo */
    static final class CityDTOColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;

        CityDTOColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CityDTOColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CityDTOColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CityDTOColumnInfo cityDTOColumnInfo = (CityDTOColumnInfo) columnInfo;
            CityDTOColumnInfo cityDTOColumnInfo2 = (CityDTOColumnInfo) columnInfo2;
            cityDTOColumnInfo2.idIndex = cityDTOColumnInfo.idIndex;
            cityDTOColumnInfo2.nameIndex = cityDTOColumnInfo.nameIndex;
            cityDTOColumnInfo2.maxColumnIndexValue = cityDTOColumnInfo.maxColumnIndexValue;
        }
    }

    C4834x9fbcbe06() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CityDTOColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CityDTOColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CityDTOColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r14 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r4 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy$CityDTOColumnInfo r3 = (p046io.realm.C4834x9fbcbe06.CityDTOColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r3 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy r14 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy     // Catch:{ all -> 0x005c }
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
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r14 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy r14 = (p046io.realm.C4834x9fbcbe06) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r14 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy r14 = (p046io.realm.C4834x9fbcbe06) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxyInterface r12 = (p046io.realm.C4835x24d935d3) r12
            java.lang.String r0 = "name"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00aa
            r12.realmSet$name(r1)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$name(r13)
        L_0x00b1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4834x9fbcbe06.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO");
    }

    public static CityDTO createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CityDTO cityDTO = new CityDTO();
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("name")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmSet$name(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmSet$name((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CityDTO) realm.copyToRealm(cityDTO, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4834x9fbcbe06 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class), false, Collections.emptyList());
        C4834x9fbcbe06 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy = new C4834x9fbcbe06();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4834x9fbcbe06.CityDTOColumnInfo r9, p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r1 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO> r2 = p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxyInterface r5 = (p046io.realm.C4835x24d935d3) r5
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
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy r1 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4834x9fbcbe06.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_CityDTORealmProxy$CityDTOColumnInfo, ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO");
    }

    public static CityDTO copy(Realm realm, CityDTOColumnInfo cityDTOColumnInfo, CityDTO cityDTO, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cityDTO);
        if (realmObjectProxy != null) {
            return (CityDTO) realmObjectProxy;
        }
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CityDTO.class), cityDTOColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(cityDTOColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(cityDTOColumnInfo.nameIndex, ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$name());
        C4834x9fbcbe06 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cityDTO, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CityDTO cityDTO, Map<RealmModel, Long> map) {
        long j;
        long j2;
        CityDTO cityDTO2 = cityDTO;
        if (cityDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CityDTO.class);
        long nativePtr = table.getNativePtr();
        CityDTOColumnInfo cityDTOColumnInfo = (CityDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class);
        long j3 = cityDTOColumnInfo.idIndex;
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(cityDTO2, Long.valueOf(j2));
        String realmGet$name = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, cityDTOColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CityDTO.class);
        long nativePtr = table.getNativePtr();
        CityDTOColumnInfo cityDTOColumnInfo = (CityDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class);
        long j2 = cityDTOColumnInfo.idIndex;
        while (it.hasNext()) {
            CityDTO cityDTO = (CityDTO) it.next();
            if (!map2.containsKey(cityDTO)) {
                if (cityDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cityDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(cityDTO, Long.valueOf(j3));
                String realmGet$name = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, cityDTOColumnInfo.nameIndex, j3, realmGet$name, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CityDTO cityDTO, Map<RealmModel, Long> map) {
        CityDTO cityDTO2 = cityDTO;
        if (cityDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CityDTO.class);
        long nativePtr = table.getNativePtr();
        CityDTOColumnInfo cityDTOColumnInfo = (CityDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class);
        long j = cityDTOColumnInfo.idIndex;
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map.put(cityDTO2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$name = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, cityDTOColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, cityDTOColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CityDTO.class);
        long nativePtr = table.getNativePtr();
        CityDTOColumnInfo cityDTOColumnInfo = (CityDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityDTO.class);
        long j2 = cityDTOColumnInfo.idIndex;
        while (it.hasNext()) {
            CityDTO cityDTO = (CityDTO) it.next();
            if (!map2.containsKey(cityDTO)) {
                if (cityDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cityDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO;
                if (Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(cityDTO, Long.valueOf(j3));
                String realmGet$name = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, cityDTOColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, cityDTOColumnInfo.nameIndex, j3, false);
                }
            }
        }
    }

    public static CityDTO createDetachedCopy(CityDTO cityDTO, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CityDTO cityDTO2;
        if (i > i2 || cityDTO == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cityDTO);
        if (cacheData == null) {
            cityDTO2 = new CityDTO();
            map.put(cityDTO, new RealmObjectProxy.CacheData(i, cityDTO2));
        } else if (i >= cacheData.minDepth) {
            return (CityDTO) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cityDTO2 = (CityDTO) cacheData.object;
        }
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO2;
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2 = cityDTO;
        ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2.realmGet$name());
        return cityDTO2;
    }

    static CityDTO update(Realm realm, CityDTOColumnInfo cityDTOColumnInfo, CityDTO cityDTO, CityDTO cityDTO2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface = cityDTO;
        C4835x24d935d3 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2 = cityDTO2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CityDTO.class), cityDTOColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(cityDTOColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(cityDTOColumnInfo.nameIndex, ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxyinterface2.realmGet$name());
        osObjectBuilder.updateExistingObject();
        return cityDTO;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "CityDTO = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{name:" + realmGet$name() + "}" + "]";
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
        C4834x9fbcbe06 ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy = (C4834x9fbcbe06) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_citydtorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
