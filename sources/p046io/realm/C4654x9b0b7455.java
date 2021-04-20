package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State;
import p046io.realm.BaseRealm;
import p046io.realm.C4656xbdeaa6ca;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy */
public class C4654x9b0b7455 extends Scenario implements RealmObjectProxy, C4655x9a612864 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<String> audioRealmList;
    private ScenarioColumnInfo columnInfo;
    private ProxyState<Scenario> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Scenario";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy$ScenarioColumnInfo */
    static final class ScenarioColumnInfo extends ColumnInfo {
        long audioIndex;
        long childIndex;
        long descriptionIndex;
        long fullimageIndex;
        long icoIndex;
        long idIndex;
        long imgIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long parentIdIndex;
        long stateIndex;

        ScenarioColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.parentIdIndex = addColumnDetails("parentId", "parentId", objectSchemaInfo);
            this.imgIndex = addColumnDetails("img", "img", objectSchemaInfo);
            this.fullimageIndex = addColumnDetails("fullimage", "fullimage", objectSchemaInfo);
            this.icoIndex = addColumnDetails("ico", "ico", objectSchemaInfo);
            this.childIndex = addColumnDetails("child", "child", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.audioIndex = addColumnDetails("audio", "audio", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ScenarioColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ScenarioColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ScenarioColumnInfo scenarioColumnInfo = (ScenarioColumnInfo) columnInfo;
            ScenarioColumnInfo scenarioColumnInfo2 = (ScenarioColumnInfo) columnInfo2;
            scenarioColumnInfo2.idIndex = scenarioColumnInfo.idIndex;
            scenarioColumnInfo2.nameIndex = scenarioColumnInfo.nameIndex;
            scenarioColumnInfo2.parentIdIndex = scenarioColumnInfo.parentIdIndex;
            scenarioColumnInfo2.imgIndex = scenarioColumnInfo.imgIndex;
            scenarioColumnInfo2.fullimageIndex = scenarioColumnInfo.fullimageIndex;
            scenarioColumnInfo2.icoIndex = scenarioColumnInfo.icoIndex;
            scenarioColumnInfo2.childIndex = scenarioColumnInfo.childIndex;
            scenarioColumnInfo2.descriptionIndex = scenarioColumnInfo.descriptionIndex;
            scenarioColumnInfo2.audioIndex = scenarioColumnInfo.audioIndex;
            scenarioColumnInfo2.stateIndex = scenarioColumnInfo.stateIndex;
            scenarioColumnInfo2.maxColumnIndexValue = scenarioColumnInfo.maxColumnIndexValue;
        }
    }

    C4654x9b0b7455() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ScenarioColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$parentId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.parentIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.parentIdIndex));
    }

    public void realmSet$parentId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.parentIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.parentIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.parentIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.parentIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$img() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgIndex);
    }

    public void realmSet$img(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fullimage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullimageIndex);
    }

    public void realmSet$fullimage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fullimageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullimageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fullimageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fullimageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ico() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.icoIndex);
    }

    public void realmSet$ico(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.icoIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.icoIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.icoIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.icoIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$child() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.childIndex);
    }

    public void realmSet$child(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.childIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.childIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.childIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.childIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionIndex);
    }

    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$audio() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.audioRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.audioRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.audioIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.audioRealmList;
    }

    public void realmSet$audio(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("audio"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.audioIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next != null) {
                        valueList.addString(next);
                    } else {
                        throw new IllegalArgumentException("Storing 'null' into audio' is not allowed by the schema.");
                    }
                }
            }
        }
    }

    public State realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.stateIndex)) {
            return null;
        }
        return (State) this.proxyState.getRealm$realm().get(State.class, this.proxyState.getRow$realm().getLink(this.columnInfo.stateIndex), false, Collections.emptyList());
    }

    public void realmSet$state(State state) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (state == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.stateIndex);
                return;
            }
            this.proxyState.checkValidObject(state);
            this.proxyState.getRow$realm().setLink(this.columnInfo.stateIndex, ((RealmObjectProxy) state).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("state")) {
            if (state != null && !RealmObject.isManaged(state)) {
                state = (State) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(state, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (state == null) {
                row$realm.nullifyLink(this.columnInfo.stateIndex);
                return;
            }
            this.proxyState.checkValidObject(state);
            row$realm.getTable().setLink(this.columnInfo.stateIndex, row$realm.getIndex(), ((RealmObjectProxy) state).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("parentId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("img", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fullimage", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ico", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("child", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("audio", RealmFieldType.STRING_LIST, true);
        builder.addPersistedLinkProperty("state", RealmFieldType.OBJECT, C4656xbdeaa6ca.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ScenarioColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ScenarioColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r5 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy$ScenarioColumnInfo r4 = (p046io.realm.C4654x9b0b7455.ScenarioColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            long r6 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "audio"
            java.lang.String r5 = "state"
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0076
            r0.add(r4)
        L_0x0076:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x007f
            r0.add(r5)
        L_0x007f:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a8
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0096
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy r3 = (p046io.realm.C4654x9b0b7455) r3
            goto L_0x00b0
        L_0x0096:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy r3 = (p046io.realm.C4654x9b0b7455) r3
            goto L_0x00b0
        L_0x00a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b0:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxyInterface r0 = (p046io.realm.C4655x9a612864) r0
            java.lang.String r1 = "name"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c5
            r0.realmSet$name(r2)
            goto L_0x00cc
        L_0x00c5:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$name(r1)
        L_0x00cc:
            java.lang.String r1 = "parentId"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00e9
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00de
            r0.realmSet$parentId(r2)
            goto L_0x00e9
        L_0x00de:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$parentId(r1)
        L_0x00e9:
            java.lang.String r1 = "img"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0102
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00fb
            r0.realmSet$img(r2)
            goto L_0x0102
        L_0x00fb:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$img(r1)
        L_0x0102:
            java.lang.String r1 = "fullimage"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x011b
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0114
            r0.realmSet$fullimage(r2)
            goto L_0x011b
        L_0x0114:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$fullimage(r1)
        L_0x011b:
            java.lang.String r1 = "ico"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0134
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x012d
            r0.realmSet$ico(r2)
            goto L_0x0134
        L_0x012d:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ico(r1)
        L_0x0134:
            java.lang.String r1 = "child"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x014d
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0146
            r0.realmSet$child(r2)
            goto L_0x014d
        L_0x0146:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$child(r1)
        L_0x014d:
            java.lang.String r1 = "description"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0166
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x015f
            r0.realmSet$description(r2)
            goto L_0x0166
        L_0x015f:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x0166:
            io.realm.RealmList r1 = r0.realmGet$audio()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r4)
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0188
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x017d
            r0.realmSet$state(r2)
            goto L_0x0188
        L_0x017d:
            org.json.JSONObject r14 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.State r13 = p046io.realm.C4656xbdeaa6ca.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$state(r13)
        L_0x0188:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4654x9b0b7455.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario");
    }

    public static Scenario createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Scenario scenario = new Scenario();
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("parentId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$parentId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$parentId((Integer) null);
                }
            } else if (nextName.equals("img")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$img(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$img((String) null);
                }
            } else if (nextName.equals("fullimage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$fullimage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$fullimage((String) null);
                }
            } else if (nextName.equals("ico")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$ico(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$ico((String) null);
                }
            } else if (nextName.equals("child")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$child(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$child((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("audio")) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$audio(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (!nextName.equals("state")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$state((State) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$state(C4656xbdeaa6ca.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Scenario) realm.copyToRealm(scenario, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4654x9b0b7455 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class), false, Collections.emptyList());
        C4654x9b0b7455 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy = new C4654x9b0b7455();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4654x9b0b7455.ScenarioColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxyInterface r5 = (p046io.realm.C4655x9a612864) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4654x9b0b7455.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_ScenarioRealmProxy$ScenarioColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.scenario.Scenario");
    }

    public static Scenario copy(Realm realm, ScenarioColumnInfo scenarioColumnInfo, Scenario scenario, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(scenario);
        if (realmObjectProxy != null) {
            return (Scenario) realmObjectProxy;
        }
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Scenario.class), scenarioColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(scenarioColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(scenarioColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$name());
        osObjectBuilder.addInteger(scenarioColumnInfo.parentIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$parentId());
        osObjectBuilder.addString(scenarioColumnInfo.imgIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$img());
        osObjectBuilder.addString(scenarioColumnInfo.fullimageIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$fullimage());
        osObjectBuilder.addString(scenarioColumnInfo.icoIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$ico());
        osObjectBuilder.addString(scenarioColumnInfo.childIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$child());
        osObjectBuilder.addString(scenarioColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$description());
        osObjectBuilder.addStringList(scenarioColumnInfo.audioIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio());
        C4654x9b0b7455 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(scenario, newProxyInstance);
        State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$state();
        if (realmGet$state == null) {
            newProxyInstance.realmSet$state((State) null);
        } else {
            State state = (State) map.get(realmGet$state);
            if (state != null) {
                newProxyInstance.realmSet$state(state);
            } else {
                newProxyInstance.realmSet$state(C4656xbdeaa6ca.copyOrUpdate(realm, (C4656xbdeaa6ca.StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class), realmGet$state, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Scenario scenario, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Scenario scenario2 = scenario;
        Map<RealmModel, Long> map2 = map;
        if (scenario2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) scenario2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Scenario.class);
        long nativePtr = table.getNativePtr();
        ScenarioColumnInfo scenarioColumnInfo = (ScenarioColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class);
        long j4 = scenarioColumnInfo.idIndex;
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j4, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        long j5 = j;
        map2.put(scenario2, Long.valueOf(j5));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j2 = j5;
            Table.nativeSetString(nativePtr, scenarioColumnInfo.nameIndex, j5, realmGet$name, false);
        } else {
            j2 = j5;
        }
        Integer realmGet$parentId = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$parentId();
        if (realmGet$parentId != null) {
            Table.nativeSetLong(nativePtr, scenarioColumnInfo.parentIdIndex, j2, realmGet$parentId.longValue(), false);
        }
        String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.imgIndex, j2, realmGet$img, false);
        }
        String realmGet$fullimage = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$fullimage();
        if (realmGet$fullimage != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.fullimageIndex, j2, realmGet$fullimage, false);
        }
        String realmGet$ico = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$ico();
        if (realmGet$ico != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.icoIndex, j2, realmGet$ico, false);
        }
        String realmGet$child = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$child();
        if (realmGet$child != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.childIndex, j2, realmGet$child, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        RealmList<String> realmGet$audio = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio();
        if (realmGet$audio != null) {
            j3 = j2;
            OsList osList = new OsList(table.getUncheckedRow(j3), scenarioColumnInfo.audioIndex);
            Iterator<String> it = realmGet$audio.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        } else {
            j3 = j2;
        }
        State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$state();
        if (realmGet$state == null) {
            return j3;
        }
        Long l = map2.get(realmGet$state);
        if (l == null) {
            l = Long.valueOf(C4656xbdeaa6ca.insert(realm2, realmGet$state, map2));
        }
        long j6 = j3;
        Table.nativeSetLink(nativePtr, scenarioColumnInfo.stateIndex, j3, l.longValue(), false);
        return j6;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Scenario.class);
        long nativePtr = table.getNativePtr();
        ScenarioColumnInfo scenarioColumnInfo = (ScenarioColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class);
        long j5 = scenarioColumnInfo.idIndex;
        while (it.hasNext()) {
            Scenario scenario = (Scenario) it.next();
            if (!map2.containsKey(scenario)) {
                if (scenario instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) scenario;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(scenario, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j5, (long) ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j5, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j6 = j;
                map2.put(scenario, Long.valueOf(j6));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j3 = j6;
                    j2 = j5;
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.nameIndex, j6, realmGet$name, false);
                } else {
                    j3 = j6;
                    j2 = j5;
                }
                Integer realmGet$parentId = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$parentId();
                if (realmGet$parentId != null) {
                    Table.nativeSetLong(nativePtr, scenarioColumnInfo.parentIdIndex, j3, realmGet$parentId.longValue(), false);
                }
                String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.imgIndex, j3, realmGet$img, false);
                }
                String realmGet$fullimage = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$fullimage();
                if (realmGet$fullimage != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.fullimageIndex, j3, realmGet$fullimage, false);
                }
                String realmGet$ico = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$ico();
                if (realmGet$ico != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.icoIndex, j3, realmGet$ico, false);
                }
                String realmGet$child = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$child();
                if (realmGet$child != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.childIndex, j3, realmGet$child, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
                RealmList<String> realmGet$audio = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio();
                if (realmGet$audio != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), scenarioColumnInfo.audioIndex);
                    Iterator<String> it2 = realmGet$audio.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                } else {
                    j4 = j3;
                }
                State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Long l = map2.get(realmGet$state);
                    if (l == null) {
                        l = Long.valueOf(C4656xbdeaa6ca.insert(realm2, realmGet$state, map2));
                    }
                    table.setLink(scenarioColumnInfo.stateIndex, j4, l.longValue(), false);
                }
                j5 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Scenario scenario, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Scenario scenario2 = scenario;
        Map<RealmModel, Long> map2 = map;
        if (scenario2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) scenario2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Scenario.class);
        long nativePtr = table.getNativePtr();
        ScenarioColumnInfo scenarioColumnInfo = (ScenarioColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class);
        long j3 = scenarioColumnInfo.idIndex;
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario2;
        if (ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id());
        }
        long j4 = j;
        map2.put(scenario2, Long.valueOf(j4));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, scenarioColumnInfo.nameIndex, j4, realmGet$name, false);
        } else {
            j2 = j4;
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.nameIndex, j2, false);
        }
        Integer realmGet$parentId = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$parentId();
        if (realmGet$parentId != null) {
            Table.nativeSetLong(nativePtr, scenarioColumnInfo.parentIdIndex, j2, realmGet$parentId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.parentIdIndex, j2, false);
        }
        String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.imgIndex, j2, realmGet$img, false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.imgIndex, j2, false);
        }
        String realmGet$fullimage = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$fullimage();
        if (realmGet$fullimage != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.fullimageIndex, j2, realmGet$fullimage, false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.fullimageIndex, j2, false);
        }
        String realmGet$ico = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$ico();
        if (realmGet$ico != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.icoIndex, j2, realmGet$ico, false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.icoIndex, j2, false);
        }
        String realmGet$child = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$child();
        if (realmGet$child != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.childIndex, j2, realmGet$child, false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.childIndex, j2, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, scenarioColumnInfo.descriptionIndex, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, scenarioColumnInfo.descriptionIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), scenarioColumnInfo.audioIndex);
        osList.removeAll();
        RealmList<String> realmGet$audio = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio();
        if (realmGet$audio != null) {
            Iterator<String> it = realmGet$audio.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Long l = map2.get(realmGet$state);
            if (l == null) {
                l = Long.valueOf(C4656xbdeaa6ca.insertOrUpdate(realm2, realmGet$state, map2));
            }
            long j6 = j5;
            Table.nativeSetLink(nativePtr, scenarioColumnInfo.stateIndex, j5, l.longValue(), false);
            return j6;
        }
        long j7 = j5;
        Table.nativeNullifyLink(nativePtr, scenarioColumnInfo.stateIndex, j7);
        return j7;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Scenario.class);
        long nativePtr = table.getNativePtr();
        ScenarioColumnInfo scenarioColumnInfo = (ScenarioColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Scenario.class);
        long j4 = scenarioColumnInfo.idIndex;
        while (it.hasNext()) {
            Scenario scenario = (Scenario) it.next();
            if (!map2.containsKey(scenario)) {
                if (scenario instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) scenario;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(scenario, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario;
                if (ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j4, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$id());
                }
                long j5 = j;
                map2.put(scenario, Long.valueOf(j5));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j3 = j5;
                    j2 = j4;
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.nameIndex, j5, realmGet$name, false);
                } else {
                    j3 = j5;
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.nameIndex, j5, false);
                }
                Integer realmGet$parentId = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$parentId();
                if (realmGet$parentId != null) {
                    Table.nativeSetLong(nativePtr, scenarioColumnInfo.parentIdIndex, j3, realmGet$parentId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.parentIdIndex, j3, false);
                }
                String realmGet$img = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.imgIndex, j3, realmGet$img, false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.imgIndex, j3, false);
                }
                String realmGet$fullimage = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$fullimage();
                if (realmGet$fullimage != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.fullimageIndex, j3, realmGet$fullimage, false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.fullimageIndex, j3, false);
                }
                String realmGet$ico = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$ico();
                if (realmGet$ico != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.icoIndex, j3, realmGet$ico, false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.icoIndex, j3, false);
                }
                String realmGet$child = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$child();
                if (realmGet$child != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.childIndex, j3, realmGet$child, false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.childIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, scenarioColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, scenarioColumnInfo.descriptionIndex, j3, false);
                }
                long j6 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j6), scenarioColumnInfo.audioIndex);
                osList.removeAll();
                RealmList<String> realmGet$audio = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio();
                if (realmGet$audio != null) {
                    Iterator<String> it2 = realmGet$audio.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Long l = map2.get(realmGet$state);
                    if (l == null) {
                        l = Long.valueOf(C4656xbdeaa6ca.insertOrUpdate(realm2, realmGet$state, map2));
                    }
                    Table.nativeSetLink(nativePtr, scenarioColumnInfo.stateIndex, j6, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, scenarioColumnInfo.stateIndex, j6);
                }
                j4 = j2;
            }
        }
    }

    public static Scenario createDetachedCopy(Scenario scenario, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Scenario scenario2;
        if (i > i2 || scenario == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(scenario);
        if (cacheData == null) {
            scenario2 = new Scenario();
            map.put(scenario, new RealmObjectProxy.CacheData(i, scenario2));
        } else if (i >= cacheData.minDepth) {
            return (Scenario) cacheData.object;
        } else {
            cacheData.minDepth = i;
            scenario2 = (Scenario) cacheData.object;
        }
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario2;
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2 = scenario;
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$parentId(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$parentId());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$img(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$img());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$fullimage(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$fullimage());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$ico(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$ico());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$child(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$child());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$audio(new RealmList());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmGet$audio().addAll(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$audio());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface.realmSet$state(C4656xbdeaa6ca.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$state(), i + 1, i2, map));
        return scenario2;
    }

    static Scenario update(Realm realm, ScenarioColumnInfo scenarioColumnInfo, Scenario scenario, Scenario scenario2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface = scenario;
        C4655x9a612864 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2 = scenario2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Scenario.class), scenarioColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(scenarioColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(scenarioColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$name());
        osObjectBuilder.addInteger(scenarioColumnInfo.parentIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$parentId());
        osObjectBuilder.addString(scenarioColumnInfo.imgIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$img());
        osObjectBuilder.addString(scenarioColumnInfo.fullimageIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$fullimage());
        osObjectBuilder.addString(scenarioColumnInfo.icoIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$ico());
        osObjectBuilder.addString(scenarioColumnInfo.childIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$child());
        osObjectBuilder.addString(scenarioColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$description());
        osObjectBuilder.addStringList(scenarioColumnInfo.audioIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$audio());
        State realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxyinterface2.realmGet$state();
        if (realmGet$state == null) {
            osObjectBuilder.addNull(scenarioColumnInfo.stateIndex);
        } else {
            State state = (State) map.get(realmGet$state);
            if (state != null) {
                osObjectBuilder.addObject(scenarioColumnInfo.stateIndex, state);
            } else {
                osObjectBuilder.addObject(scenarioColumnInfo.stateIndex, C4656xbdeaa6ca.copyOrUpdate(realm, (C4656xbdeaa6ca.StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class), realmGet$state, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return scenario;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Scenario = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{parentId:");
        sb.append(realmGet$parentId() != null ? realmGet$parentId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{img:");
        sb.append(realmGet$img() != null ? realmGet$img() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fullimage:");
        sb.append(realmGet$fullimage() != null ? realmGet$fullimage() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ico:");
        sb.append(realmGet$ico() != null ? realmGet$ico() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{child:");
        sb.append(realmGet$child() != null ? realmGet$child() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{audio:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$audio().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{state:");
        if (realmGet$state() != null) {
            str = C4656xbdeaa6ca.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4654x9b0b7455 ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy = (C4654x9b0b7455) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_scenario_scenariorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
