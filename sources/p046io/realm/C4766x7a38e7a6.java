package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p046io.realm.BaseRealm;
import p046io.realm.C4748x5c024f21;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy */
public class C4766x7a38e7a6 extends RentChildren implements RealmObjectProxy, C4767xc6e1e033 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentChildrenColumnInfo columnInfo;
    private ProxyState<RentChildren> proxyState;
    private RealmList<RentInfo> rentsRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentChildren";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy$RentChildrenColumnInfo */
    static final class RentChildrenColumnInfo extends ColumnInfo {
        long idIndex;
        long isBusyIndex;
        long maxColumnIndexValue;
        long rentsIndex;
        long titleIndex;

        RentChildrenColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.isBusyIndex = addColumnDetails("isBusy", "isBusy", objectSchemaInfo);
            this.rentsIndex = addColumnDetails("rents", "rents", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentChildrenColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentChildrenColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentChildrenColumnInfo rentChildrenColumnInfo = (RentChildrenColumnInfo) columnInfo;
            RentChildrenColumnInfo rentChildrenColumnInfo2 = (RentChildrenColumnInfo) columnInfo2;
            rentChildrenColumnInfo2.idIndex = rentChildrenColumnInfo.idIndex;
            rentChildrenColumnInfo2.titleIndex = rentChildrenColumnInfo.titleIndex;
            rentChildrenColumnInfo2.isBusyIndex = rentChildrenColumnInfo.isBusyIndex;
            rentChildrenColumnInfo2.rentsIndex = rentChildrenColumnInfo.rentsIndex;
            rentChildrenColumnInfo2.maxColumnIndexValue = rentChildrenColumnInfo.maxColumnIndexValue;
        }
    }

    C4766x7a38e7a6() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentChildrenColumnInfo) realmObjectContext.getColumnInfo();
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

    public boolean realmGet$isBusy() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isBusyIndex);
    }

    public void realmSet$isBusy(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isBusyIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isBusyIndex, row$realm.getIndex(), z, true);
        }
    }

    public RealmList<RentInfo> realmGet$rents() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentInfo> realmList = this.rentsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.rentsRealmList = new RealmList<>(RentInfo.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.rentsIndex), this.proxyState.getRealm$realm());
        return this.rentsRealmList;
    }

    public void realmSet$rents(RealmList<RentInfo> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("rents")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentInfo> realmList2 = new RealmList<>();
                Iterator<RentInfo> it = realmList.iterator();
                while (it.hasNext()) {
                    RentInfo next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.rentsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentInfo rentInfo = realmList.get(i);
                    this.proxyState.checkValidObject(rentInfo);
                    modelList.addRow(((RealmObjectProxy) rentInfo).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentInfo rentInfo2 = realmList.get(i);
            this.proxyState.checkValidObject(rentInfo2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentInfo2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isBusy", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedLinkProperty("rents", RealmFieldType.LIST, C4748x5c024f21.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentChildrenColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentChildrenColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy$RentChildrenColumnInfo r2 = (p046io.realm.C4766x7a38e7a6.RentChildrenColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy     // Catch:{ all -> 0x0064 }
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
            java.lang.String r2 = "rents"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r12)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r12)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy r1 = (p046io.realm.C4766x7a38e7a6) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            int r3 = r7.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy r1 = (p046io.realm.C4766x7a38e7a6) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxyInterface r3 = (p046io.realm.C4767xc6e1e033) r3
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
            java.lang.String r4 = "isBusy"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00df
            boolean r5 = r7.isNull(r4)
            if (r5 != 0) goto L_0x00d7
            boolean r4 = r7.getBoolean(r4)
            r3.realmSet$isBusy(r4)
            goto L_0x00df
        L_0x00d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'isBusy' to null."
            r0.<init>(r1)
            throw r0
        L_0x00df:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x0113
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x00ef
            r3.realmSet$rents(r11)
            goto L_0x0113
        L_0x00ef:
            io.realm.RealmList r4 = r3.realmGet$rents()
            r4.clear()
            org.json.JSONArray r2 = r7.getJSONArray(r2)
            r4 = 0
        L_0x00fb:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x0113
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfo r5 = p046io.realm.C4748x5c024f21.createOrUpdateUsingJsonObject(r15, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$rents()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00fb
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4766x7a38e7a6.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren");
    }

    public static RentChildren createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentChildren rentChildren = new RentChildren();
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("isBusy")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$isBusy(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isBusy' to null.");
                }
            } else if (!nextName.equals("rents")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$rents((RealmList<RentInfo>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$rents(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents().add(C4748x5c024f21.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentChildren) realm.copyToRealm(rentChildren, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4766x7a38e7a6 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class), false, Collections.emptyList());
        C4766x7a38e7a6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy = new C4766x7a38e7a6();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4766x7a38e7a6.RentChildrenColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxyInterface r5 = (p046io.realm.C4767xc6e1e033) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4766x7a38e7a6.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentChildrenRealmProxy$RentChildrenColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren");
    }

    public static RentChildren copy(Realm realm, RentChildrenColumnInfo rentChildrenColumnInfo, RentChildren rentChildren, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentChildren);
        if (realmObjectProxy != null) {
            return (RentChildren) realmObjectProxy;
        }
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentChildren.class), rentChildrenColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentChildrenColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(rentChildrenColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$title());
        osObjectBuilder.addBoolean(rentChildrenColumnInfo.isBusyIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$isBusy()));
        C4766x7a38e7a6 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentChildren, newProxyInstance);
        RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents();
        if (realmGet$rents != null) {
            RealmList<RentInfo> realmGet$rents2 = newProxyInstance.realmGet$rents();
            realmGet$rents2.clear();
            for (int i = 0; i < realmGet$rents.size(); i++) {
                RentInfo rentInfo = realmGet$rents.get(i);
                RentInfo rentInfo2 = (RentInfo) map.get(rentInfo);
                if (rentInfo2 != null) {
                    realmGet$rents2.add(rentInfo2);
                } else {
                    realmGet$rents2.add(C4748x5c024f21.copyOrUpdate(realm, (C4748x5c024f21.RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class), rentInfo, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentChildren rentChildren, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentChildren rentChildren2 = rentChildren;
        Map<RealmModel, Long> map2 = map;
        if (rentChildren2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentChildren2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentChildren.class);
        long nativePtr = table.getNativePtr();
        RentChildrenColumnInfo rentChildrenColumnInfo = (RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class);
        long j3 = rentChildrenColumnInfo.idIndex;
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j4 = j;
        map2.put(rentChildren2, Long.valueOf(j4));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, rentChildrenColumnInfo.titleIndex, j4, realmGet$title, false);
        } else {
            j2 = j4;
        }
        Table.nativeSetBoolean(nativePtr, rentChildrenColumnInfo.isBusyIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$isBusy(), false);
        RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents();
        if (realmGet$rents == null) {
            return j2;
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), rentChildrenColumnInfo.rentsIndex);
        Iterator<RentInfo> it = realmGet$rents.iterator();
        while (it.hasNext()) {
            RentInfo next = it.next();
            Long l = map2.get(next);
            if (l == null) {
                l = Long.valueOf(C4748x5c024f21.insert(realm2, next, map2));
            }
            osList.addRow(l.longValue());
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentChildren.class);
        long nativePtr = table.getNativePtr();
        RentChildrenColumnInfo rentChildrenColumnInfo = (RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class);
        long j3 = rentChildrenColumnInfo.idIndex;
        while (it.hasNext()) {
            RentChildren rentChildren = (RentChildren) it.next();
            if (!map2.containsKey(rentChildren)) {
                if (rentChildren instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentChildren;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentChildren, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(rentChildren, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, rentChildrenColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j4;
                }
                Table.nativeSetBoolean(nativePtr, rentChildrenColumnInfo.isBusyIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$isBusy(), false);
                RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents();
                if (realmGet$rents != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j2), rentChildrenColumnInfo.rentsIndex);
                    Iterator<RentInfo> it2 = realmGet$rents.iterator();
                    while (it2.hasNext()) {
                        RentInfo next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4748x5c024f21.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentChildren rentChildren, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentChildren rentChildren2 = rentChildren;
        Map<RealmModel, Long> map2 = map;
        if (rentChildren2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentChildren2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentChildren.class);
        long nativePtr = table.getNativePtr();
        RentChildrenColumnInfo rentChildrenColumnInfo = (RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class);
        long j3 = rentChildrenColumnInfo.idIndex;
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren2;
        if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()));
        }
        long j4 = j;
        map2.put(rentChildren2, Long.valueOf(j4));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, rentChildrenColumnInfo.titleIndex, j4, realmGet$title, false);
        } else {
            j2 = j4;
            Table.nativeSetNull(nativePtr, rentChildrenColumnInfo.titleIndex, j2, false);
        }
        Table.nativeSetBoolean(nativePtr, rentChildrenColumnInfo.isBusyIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$isBusy(), false);
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), rentChildrenColumnInfo.rentsIndex);
        RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents();
        if (realmGet$rents == null || ((long) realmGet$rents.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$rents != null) {
                Iterator<RentInfo> it = realmGet$rents.iterator();
                while (it.hasNext()) {
                    RentInfo next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4748x5c024f21.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$rents.size();
            for (int i = 0; i < size; i++) {
                RentInfo rentInfo = realmGet$rents.get(i);
                Long l2 = map2.get(rentInfo);
                if (l2 == null) {
                    l2 = Long.valueOf(C4748x5c024f21.insertOrUpdate(realm2, rentInfo, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j5;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentChildren.class);
        long nativePtr = table.getNativePtr();
        RentChildrenColumnInfo rentChildrenColumnInfo = (RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class);
        long j3 = rentChildrenColumnInfo.idIndex;
        while (it.hasNext()) {
            RentChildren rentChildren = (RentChildren) it.next();
            if (!map2.containsKey(rentChildren)) {
                if (rentChildren instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentChildren;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentChildren, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(rentChildren, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, rentChildrenColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, rentChildrenColumnInfo.titleIndex, j4, false);
                }
                Table.nativeSetBoolean(nativePtr, rentChildrenColumnInfo.isBusyIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$isBusy(), false);
                OsList osList = new OsList(table.getUncheckedRow(j2), rentChildrenColumnInfo.rentsIndex);
                RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmGet$rents();
                if (realmGet$rents == null || ((long) realmGet$rents.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$rents != null) {
                        Iterator<RentInfo> it2 = realmGet$rents.iterator();
                        while (it2.hasNext()) {
                            RentInfo next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4748x5c024f21.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$rents.size();
                    for (int i = 0; i < size; i++) {
                        RentInfo rentInfo = realmGet$rents.get(i);
                        Long l2 = map2.get(rentInfo);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4748x5c024f21.insertOrUpdate(realm2, rentInfo, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static RentChildren createDetachedCopy(RentChildren rentChildren, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentChildren rentChildren2;
        if (i > i2 || rentChildren == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentChildren);
        if (cacheData == null) {
            rentChildren2 = new RentChildren();
            map.put(rentChildren, new RealmObjectProxy.CacheData(i, rentChildren2));
        } else if (i >= cacheData.minDepth) {
            return (RentChildren) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentChildren2 = (RentChildren) cacheData.object;
        }
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren2;
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2 = rentChildren;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$isBusy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$isBusy());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$rents((RealmList<RentInfo>) null);
        } else {
            RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$rents();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface.realmSet$rents(realmList);
            int i3 = i + 1;
            int size = realmGet$rents.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4748x5c024f21.createDetachedCopy(realmGet$rents.get(i4), i3, i2, map));
            }
        }
        return rentChildren2;
    }

    static RentChildren update(Realm realm, RentChildrenColumnInfo rentChildrenColumnInfo, RentChildren rentChildren, RentChildren rentChildren2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface = rentChildren;
        C4767xc6e1e033 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2 = rentChildren2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentChildren.class), rentChildrenColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentChildrenColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(rentChildrenColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addBoolean(rentChildrenColumnInfo.isBusyIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$isBusy()));
        RealmList<RentInfo> realmGet$rents = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxyinterface2.realmGet$rents();
        if (realmGet$rents != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$rents.size(); i++) {
                RentInfo rentInfo = realmGet$rents.get(i);
                RentInfo rentInfo2 = (RentInfo) map.get(rentInfo);
                if (rentInfo2 != null) {
                    realmList.add(rentInfo2);
                } else {
                    realmList.add(C4748x5c024f21.copyOrUpdate(realm, (C4748x5c024f21.RentInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfo.class), rentInfo, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(rentChildrenColumnInfo.rentsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(rentChildrenColumnInfo.rentsIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return rentChildren;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentChildren = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{isBusy:");
        sb.append(realmGet$isBusy());
        sb.append("}");
        sb.append(",");
        sb.append("{rents:");
        sb.append("RealmList<RentInfo>[");
        sb.append(realmGet$rents().size());
        sb.append("]");
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
        C4766x7a38e7a6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy = (C4766x7a38e7a6) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentchildrenrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
