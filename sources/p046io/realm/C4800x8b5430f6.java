package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList;
import p046io.realm.BaseRealm;
import p046io.realm.C4802x9a8f8638;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy */
public class C4800x8b5430f6 extends OptionsList implements RealmObjectProxy, C4801xc5c10e3 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OptionsListColumnInfo columnInfo;
    private RealmList<Options> listRealmList;
    private ProxyState<OptionsList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "OptionsList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy$OptionsListColumnInfo */
    static final class OptionsListColumnInfo extends ColumnInfo {
        long listIndex;
        long maxColumnIndexValue;
        long scenarioIdIndex;

        OptionsListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.scenarioIdIndex = addColumnDetails("scenarioId", "scenarioId", objectSchemaInfo);
            this.listIndex = addColumnDetails("list", "list", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OptionsListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OptionsListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OptionsListColumnInfo optionsListColumnInfo = (OptionsListColumnInfo) columnInfo;
            OptionsListColumnInfo optionsListColumnInfo2 = (OptionsListColumnInfo) columnInfo2;
            optionsListColumnInfo2.scenarioIdIndex = optionsListColumnInfo.scenarioIdIndex;
            optionsListColumnInfo2.listIndex = optionsListColumnInfo.listIndex;
            optionsListColumnInfo2.maxColumnIndexValue = optionsListColumnInfo.maxColumnIndexValue;
        }
    }

    C4800x8b5430f6() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OptionsListColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$scenarioId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.scenarioIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.scenarioIdIndex));
    }

    public void realmSet$scenarioId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'scenarioId' cannot be changed after object was created.");
        }
    }

    public RealmList<Options> realmGet$list() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Options> realmList = this.listRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.listRealmList = new RealmList<>(Options.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.listIndex), this.proxyState.getRealm$realm());
        return this.listRealmList;
    }

    public void realmSet$list(RealmList<Options> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("list")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Options> realmList2 = new RealmList<>();
                Iterator<Options> it = realmList.iterator();
                while (it.hasNext()) {
                    Options next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.listIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Options options = realmList.get(i);
                    this.proxyState.checkValidObject(options);
                    modelList.addRow(((RealmObjectProxy) options).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Options options2 = realmList.get(i);
            this.proxyState.checkValidObject(options2);
            modelList.setRow((long) i, ((RealmObjectProxy) options2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedProperty("scenarioId", RealmFieldType.INTEGER, true, true, false);
        builder.addPersistedLinkProperty("list", RealmFieldType.LIST, C4802x9a8f8638.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OptionsListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OptionsListColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "scenarioId"
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy$OptionsListColumnInfo r2 = (p046io.realm.C4800x8b5430f6.OptionsListColumnInfo) r2
            long r2 = r2.scenarioIdIndex
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy     // Catch:{ all -> 0x0066 }
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
            java.lang.String r2 = "list"
            if (r1 != 0) goto L_0x00a7
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r12)
            if (r1 == 0) goto L_0x009f
            boolean r1 = r15.isNull(r12)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy r1 = (p046io.realm.C4800x8b5430f6) r1
            goto L_0x00a7
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            int r3 = r15.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy r1 = (p046io.realm.C4800x8b5430f6) r1
            goto L_0x00a7
        L_0x009f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'scenarioId'."
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxyInterface r3 = (p046io.realm.C4801xc5c10e3) r3
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00de
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00ba
            r3.realmSet$list(r11)
            goto L_0x00de
        L_0x00ba:
            io.realm.RealmList r4 = r3.realmGet$list()
            r4.clear()
            org.json.JSONArray r2 = r15.getJSONArray(r2)
            r4 = 0
        L_0x00c6:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x00de
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r5 = p046io.realm.C4802x9a8f8638.createOrUpdateUsingJsonObject(r14, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$list()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00c6
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4800x8b5430f6.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList");
    }

    public static OptionsList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        OptionsList optionsList = new OptionsList();
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("scenarioId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$scenarioId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$scenarioId((Integer) null);
                }
                z = true;
            } else if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$list((RealmList<Options>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$list(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list().add(C4802x9a8f8638.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (OptionsList) realm.copyToRealm(optionsList, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'scenarioId'.");
    }

    private static C4800x8b5430f6 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class), false, Collections.emptyList());
        C4800x8b5430f6 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy = new C4800x8b5430f6();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4800x8b5430f6.OptionsListColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.scenarioIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxyInterface r5 = (p046io.realm.C4801xc5c10e3) r5
            java.lang.Integer r5 = r5.realmGet$scenarioId()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4800x8b5430f6.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsListRealmProxy$OptionsListColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.OptionsList");
    }

    public static OptionsList copy(Realm realm, OptionsListColumnInfo optionsListColumnInfo, OptionsList optionsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(optionsList);
        if (realmObjectProxy != null) {
            return (OptionsList) realmObjectProxy;
        }
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(OptionsList.class), optionsListColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(optionsListColumnInfo.scenarioIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId());
        C4800x8b5430f6 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(optionsList, newProxyInstance);
        RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list();
        if (realmGet$list != null) {
            RealmList<Options> realmGet$list2 = newProxyInstance.realmGet$list();
            realmGet$list2.clear();
            for (int i = 0; i < realmGet$list.size(); i++) {
                Options options = realmGet$list.get(i);
                Options options2 = (Options) map.get(options);
                if (options2 != null) {
                    realmGet$list2.add(options2);
                } else {
                    realmGet$list2.add(C4802x9a8f8638.copyOrUpdate(realm, (C4802x9a8f8638.OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class), options, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, OptionsList optionsList, Map<RealmModel, Long> map) {
        long j;
        if (optionsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) optionsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(OptionsList.class);
        long nativePtr = table.getNativePtr();
        OptionsListColumnInfo optionsListColumnInfo = (OptionsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class);
        long j2 = optionsListColumnInfo.scenarioIdIndex;
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
        Integer realmGet$scenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId();
        if (realmGet$scenarioId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$scenarioId);
        }
        map.put(optionsList, Long.valueOf(j));
        RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list();
        if (realmGet$list != null) {
            OsList osList = new OsList(table.getUncheckedRow(j), optionsListColumnInfo.listIndex);
            Iterator<Options> it = realmGet$list.iterator();
            while (it.hasNext()) {
                Options next = it.next();
                Long l = map.get(next);
                if (l == null) {
                    l = Long.valueOf(C4802x9a8f8638.insert(realm, next, map));
                }
                osList.addRow(l.longValue());
            }
        }
        return j;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OptionsList.class);
        long nativePtr = table.getNativePtr();
        OptionsListColumnInfo optionsListColumnInfo = (OptionsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class);
        long j2 = optionsListColumnInfo.scenarioIdIndex;
        while (it.hasNext()) {
            OptionsList optionsList = (OptionsList) it.next();
            if (!map2.containsKey(optionsList)) {
                if (optionsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) optionsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(optionsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
                Integer realmGet$scenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId();
                if (realmGet$scenarioId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$scenarioId);
                }
                map2.put(optionsList, Long.valueOf(j));
                RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list();
                if (realmGet$list != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j), optionsListColumnInfo.listIndex);
                    Iterator<Options> it2 = realmGet$list.iterator();
                    while (it2.hasNext()) {
                        Options next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4802x9a8f8638.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, OptionsList optionsList, Map<RealmModel, Long> map) {
        long j;
        if (optionsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) optionsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(OptionsList.class);
        long nativePtr = table.getNativePtr();
        OptionsListColumnInfo optionsListColumnInfo = (OptionsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class);
        long j2 = optionsListColumnInfo.scenarioIdIndex;
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
        if (ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId());
        }
        map.put(optionsList, Long.valueOf(j));
        OsList osList = new OsList(table.getUncheckedRow(j), optionsListColumnInfo.listIndex);
        RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list();
        if (realmGet$list == null || ((long) realmGet$list.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$list != null) {
                Iterator<Options> it = realmGet$list.iterator();
                while (it.hasNext()) {
                    Options next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4802x9a8f8638.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$list.size();
            for (int i = 0; i < size; i++) {
                Options options = realmGet$list.get(i);
                Long l2 = map.get(options);
                if (l2 == null) {
                    l2 = Long.valueOf(C4802x9a8f8638.insertOrUpdate(realm, options, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OptionsList.class);
        long nativePtr = table.getNativePtr();
        OptionsListColumnInfo optionsListColumnInfo = (OptionsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OptionsList.class);
        long j2 = optionsListColumnInfo.scenarioIdIndex;
        while (it.hasNext()) {
            OptionsList optionsList = (OptionsList) it.next();
            if (!map2.containsKey(optionsList)) {
                if (optionsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) optionsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(optionsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
                if (ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$scenarioId());
                }
                map2.put(optionsList, Long.valueOf(j));
                OsList osList = new OsList(table.getUncheckedRow(j), optionsListColumnInfo.listIndex);
                RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmGet$list();
                if (realmGet$list == null || ((long) realmGet$list.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$list != null) {
                        Iterator<Options> it2 = realmGet$list.iterator();
                        while (it2.hasNext()) {
                            Options next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4802x9a8f8638.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$list.size();
                    for (int i = 0; i < size; i++) {
                        Options options = realmGet$list.get(i);
                        Long l2 = map2.get(options);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4802x9a8f8638.insertOrUpdate(realm2, options, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static OptionsList createDetachedCopy(OptionsList optionsList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        OptionsList optionsList2;
        if (i > i2 || optionsList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(optionsList);
        if (cacheData == null) {
            optionsList2 = new OptionsList();
            map.put(optionsList, new RealmObjectProxy.CacheData(i, optionsList2));
        } else if (i >= cacheData.minDepth) {
            return (OptionsList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            optionsList2 = (OptionsList) cacheData.object;
        }
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList2;
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2 = optionsList;
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$scenarioId(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2.realmGet$scenarioId());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$list((RealmList<Options>) null);
        } else {
            RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2.realmGet$list();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface.realmSet$list(realmList);
            int i3 = i + 1;
            int size = realmGet$list.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4802x9a8f8638.createDetachedCopy(realmGet$list.get(i4), i3, i2, map));
            }
        }
        return optionsList2;
    }

    static OptionsList update(Realm realm, OptionsListColumnInfo optionsListColumnInfo, OptionsList optionsList, OptionsList optionsList2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface = optionsList;
        C4801xc5c10e3 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2 = optionsList2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(OptionsList.class), optionsListColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(optionsListColumnInfo.scenarioIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2.realmGet$scenarioId());
        RealmList<Options> realmGet$list = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxyinterface2.realmGet$list();
        if (realmGet$list != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$list.size(); i++) {
                Options options = realmGet$list.get(i);
                Options options2 = (Options) map.get(options);
                if (options2 != null) {
                    realmList.add(options2);
                } else {
                    realmList.add(C4802x9a8f8638.copyOrUpdate(realm, (C4802x9a8f8638.OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class), options, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(optionsListColumnInfo.listIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(optionsListColumnInfo.listIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return optionsList;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("OptionsList = proxy[");
        sb.append("{scenarioId:");
        sb.append(realmGet$scenarioId() != null ? realmGet$scenarioId() : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{list:");
        sb.append("RealmList<Options>[");
        sb.append(realmGet$list().size());
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
        C4800x8b5430f6 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy = (C4800x8b5430f6) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionslistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
