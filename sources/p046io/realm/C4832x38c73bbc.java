package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p046io.realm.BaseRealm;
import p046io.realm.C4830x6d8ab071;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy */
public class C4832x38c73bbc extends BusinessCenterDTO implements RealmObjectProxy, C4833x9f81c4dd {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<BusinessBuildings> buildingsRealmList;
    private BusinessCenterDTOColumnInfo columnInfo;
    private ProxyState<BusinessCenterDTO> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BusinessCenterDTO";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy$BusinessCenterDTOColumnInfo */
    static final class BusinessCenterDTOColumnInfo extends ColumnInfo {
        long buildingsIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        BusinessCenterDTOColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.buildingsIndex = addColumnDetails("buildings", "buildings", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BusinessCenterDTOColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BusinessCenterDTOColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo = (BusinessCenterDTOColumnInfo) columnInfo;
            BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo2 = (BusinessCenterDTOColumnInfo) columnInfo2;
            businessCenterDTOColumnInfo2.idIndex = businessCenterDTOColumnInfo.idIndex;
            businessCenterDTOColumnInfo2.titleIndex = businessCenterDTOColumnInfo.titleIndex;
            businessCenterDTOColumnInfo2.buildingsIndex = businessCenterDTOColumnInfo.buildingsIndex;
            businessCenterDTOColumnInfo2.maxColumnIndexValue = businessCenterDTOColumnInfo.maxColumnIndexValue;
        }
    }

    C4832x38c73bbc() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BusinessCenterDTOColumnInfo) realmObjectContext.getColumnInfo();
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

    public RealmList<BusinessBuildings> realmGet$buildings() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<BusinessBuildings> realmList = this.buildingsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.buildingsRealmList = new RealmList<>(BusinessBuildings.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.buildingsIndex), this.proxyState.getRealm$realm());
        return this.buildingsRealmList;
    }

    public void realmSet$buildings(RealmList<BusinessBuildings> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("buildings")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<BusinessBuildings> realmList2 = new RealmList<>();
                Iterator<BusinessBuildings> it = realmList.iterator();
                while (it.hasNext()) {
                    BusinessBuildings next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.buildingsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    BusinessBuildings businessBuildings = realmList.get(i);
                    this.proxyState.checkValidObject(businessBuildings);
                    modelList.addRow(((RealmObjectProxy) businessBuildings).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            BusinessBuildings businessBuildings2 = realmList.get(i);
            this.proxyState.checkValidObject(businessBuildings2);
            modelList.setRow((long) i, ((RealmObjectProxy) businessBuildings2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, true);
        builder.addPersistedLinkProperty("buildings", RealmFieldType.LIST, C4830x6d8ab071.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BusinessCenterDTOColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BusinessCenterDTOColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r1 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r3 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy$BusinessCenterDTOColumnInfo r2 = (p046io.realm.C4832x38c73bbc.BusinessCenterDTOColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r2 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy r1 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy     // Catch:{ all -> 0x0064 }
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
            java.lang.String r2 = "buildings"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r12)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r12)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r1 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy r1 = (p046io.realm.C4832x38c73bbc) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r1 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            int r3 = r7.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy r1 = (p046io.realm.C4832x38c73bbc) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxyInterface r3 = (p046io.realm.C4833x9f81c4dd) r3
            java.lang.String r4 = "title"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ba
            r3.realmSet$title(r11)
            goto L_0x00c1
        L_0x00ba:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$title(r4)
        L_0x00c1:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x00f5
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x00d1
            r3.realmSet$buildings(r11)
            goto L_0x00f5
        L_0x00d1:
            io.realm.RealmList r4 = r3.realmGet$buildings()
            r4.clear()
            org.json.JSONArray r2 = r7.getJSONArray(r2)
            r4 = 0
        L_0x00dd:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x00f5
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings r5 = p046io.realm.C4830x6d8ab071.createOrUpdateUsingJsonObject(r15, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$buildings()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00dd
        L_0x00f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4832x38c73bbc.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO");
    }

    public static BusinessCenterDTO createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BusinessCenterDTO businessCenterDTO = new BusinessCenterDTO();
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("buildings")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$buildings((RealmList<BusinessBuildings>) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$buildings(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings().add(C4830x6d8ab071.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BusinessCenterDTO) realm.copyToRealm(businessCenterDTO, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4832x38c73bbc newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class), false, Collections.emptyList());
        C4832x38c73bbc ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy = new C4832x38c73bbc();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4832x38c73bbc.BusinessCenterDTOColumnInfo r9, p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r1 = (p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO> r2 = p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxyInterface r5 = (p046io.realm.C4833x9f81c4dd) r5
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
            io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy r1 = new io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4832x38c73bbc.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessCenterDTORealmProxy$BusinessCenterDTOColumnInfo, ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO");
    }

    public static BusinessCenterDTO copy(Realm realm, BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo, BusinessCenterDTO businessCenterDTO, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(businessCenterDTO);
        if (realmObjectProxy != null) {
            return (BusinessCenterDTO) realmObjectProxy;
        }
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BusinessCenterDTO.class), businessCenterDTOColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(businessCenterDTOColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(businessCenterDTOColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$title());
        C4832x38c73bbc newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(businessCenterDTO, newProxyInstance);
        RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings();
        if (realmGet$buildings != null) {
            RealmList<BusinessBuildings> realmGet$buildings2 = newProxyInstance.realmGet$buildings();
            realmGet$buildings2.clear();
            for (int i = 0; i < realmGet$buildings.size(); i++) {
                BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                BusinessBuildings businessBuildings2 = (BusinessBuildings) map.get(businessBuildings);
                if (businessBuildings2 != null) {
                    realmGet$buildings2.add(businessBuildings2);
                } else {
                    realmGet$buildings2.add(C4830x6d8ab071.copyOrUpdate(realm, (C4830x6d8ab071.BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), businessBuildings, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, BusinessCenterDTO businessCenterDTO, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        BusinessCenterDTO businessCenterDTO2 = businessCenterDTO;
        Map<RealmModel, Long> map2 = map;
        if (businessCenterDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessCenterDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(BusinessCenterDTO.class);
        long nativePtr = table.getNativePtr();
        BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo = (BusinessCenterDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class);
        long j2 = businessCenterDTOColumnInfo.idIndex;
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j3 = j;
        map2.put(businessCenterDTO2, Long.valueOf(j3));
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, businessCenterDTOColumnInfo.titleIndex, j3, realmGet$title, false);
        }
        RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings();
        if (realmGet$buildings != null) {
            OsList osList = new OsList(table.getUncheckedRow(j3), businessCenterDTOColumnInfo.buildingsIndex);
            Iterator<BusinessBuildings> it = realmGet$buildings.iterator();
            while (it.hasNext()) {
                BusinessBuildings next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(C4830x6d8ab071.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(BusinessCenterDTO.class);
        long nativePtr = table.getNativePtr();
        BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo = (BusinessCenterDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class);
        long j3 = businessCenterDTOColumnInfo.idIndex;
        while (it.hasNext()) {
            BusinessCenterDTO businessCenterDTO = (BusinessCenterDTO) it.next();
            if (!map2.containsKey(businessCenterDTO)) {
                if (businessCenterDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessCenterDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(businessCenterDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(businessCenterDTO, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, businessCenterDTOColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j4;
                }
                RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings();
                if (realmGet$buildings != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j2), businessCenterDTOColumnInfo.buildingsIndex);
                    Iterator<BusinessBuildings> it2 = realmGet$buildings.iterator();
                    while (it2.hasNext()) {
                        BusinessBuildings next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4830x6d8ab071.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BusinessCenterDTO businessCenterDTO, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        BusinessCenterDTO businessCenterDTO2 = businessCenterDTO;
        Map<RealmModel, Long> map2 = map;
        if (businessCenterDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessCenterDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(BusinessCenterDTO.class);
        long nativePtr = table.getNativePtr();
        BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo = (BusinessCenterDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class);
        long j2 = businessCenterDTOColumnInfo.idIndex;
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO2;
        if (Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()));
        }
        long j3 = j;
        map2.put(businessCenterDTO2, Long.valueOf(j3));
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, businessCenterDTOColumnInfo.titleIndex, j3, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, businessCenterDTOColumnInfo.titleIndex, j3, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(j3), businessCenterDTOColumnInfo.buildingsIndex);
        RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings();
        if (realmGet$buildings == null || ((long) realmGet$buildings.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$buildings != null) {
                Iterator<BusinessBuildings> it = realmGet$buildings.iterator();
                while (it.hasNext()) {
                    BusinessBuildings next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$buildings.size();
            for (int i = 0; i < size; i++) {
                BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                Long l2 = map2.get(businessBuildings);
                if (l2 == null) {
                    l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, businessBuildings, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(BusinessCenterDTO.class);
        long nativePtr = table.getNativePtr();
        BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo = (BusinessCenterDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessCenterDTO.class);
        long j3 = businessCenterDTOColumnInfo.idIndex;
        while (it.hasNext()) {
            BusinessCenterDTO businessCenterDTO = (BusinessCenterDTO) it.next();
            if (!map2.containsKey(businessCenterDTO)) {
                if (businessCenterDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessCenterDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(businessCenterDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO;
                if (Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(businessCenterDTO, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, businessCenterDTOColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, businessCenterDTOColumnInfo.titleIndex, j4, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j2), businessCenterDTOColumnInfo.buildingsIndex);
                RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmGet$buildings();
                if (realmGet$buildings == null || ((long) realmGet$buildings.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$buildings != null) {
                        Iterator<BusinessBuildings> it2 = realmGet$buildings.iterator();
                        while (it2.hasNext()) {
                            BusinessBuildings next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$buildings.size();
                    for (int i = 0; i < size; i++) {
                        BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                        Long l2 = map2.get(businessBuildings);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, businessBuildings, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static BusinessCenterDTO createDetachedCopy(BusinessCenterDTO businessCenterDTO, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BusinessCenterDTO businessCenterDTO2;
        if (i > i2 || businessCenterDTO == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(businessCenterDTO);
        if (cacheData == null) {
            businessCenterDTO2 = new BusinessCenterDTO();
            map.put(businessCenterDTO, new RealmObjectProxy.CacheData(i, businessCenterDTO2));
        } else if (i >= cacheData.minDepth) {
            return (BusinessCenterDTO) cacheData.object;
        } else {
            cacheData.minDepth = i;
            businessCenterDTO2 = (BusinessCenterDTO) cacheData.object;
        }
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO2;
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2 = businessCenterDTO;
        ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$title());
        if (i == i2) {
            ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$buildings((RealmList<BusinessBuildings>) null);
        } else {
            RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$buildings();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface.realmSet$buildings(realmList);
            int i3 = i + 1;
            int size = realmGet$buildings.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4830x6d8ab071.createDetachedCopy(realmGet$buildings.get(i4), i3, i2, map));
            }
        }
        return businessCenterDTO2;
    }

    static BusinessCenterDTO update(Realm realm, BusinessCenterDTOColumnInfo businessCenterDTOColumnInfo, BusinessCenterDTO businessCenterDTO, BusinessCenterDTO businessCenterDTO2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface = businessCenterDTO;
        C4833x9f81c4dd ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2 = businessCenterDTO2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BusinessCenterDTO.class), businessCenterDTOColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(businessCenterDTOColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(businessCenterDTOColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$title());
        RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxyinterface2.realmGet$buildings();
        if (realmGet$buildings != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$buildings.size(); i++) {
                BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                BusinessBuildings businessBuildings2 = (BusinessBuildings) map.get(businessBuildings);
                if (businessBuildings2 != null) {
                    realmList.add(businessBuildings2);
                } else {
                    realmList.add(C4830x6d8ab071.copyOrUpdate(realm, (C4830x6d8ab071.BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), businessBuildings, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(businessCenterDTOColumnInfo.buildingsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(businessCenterDTOColumnInfo.buildingsIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return businessCenterDTO;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "BusinessCenterDTO = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{title:" + realmGet$title() + "}" + "," + "{buildings:" + "RealmList<BusinessBuildings>[" + realmGet$buildings().size() + "]" + "}" + "]";
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
        C4832x38c73bbc ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy = (C4832x38c73bbc) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_businesscenterdtorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
