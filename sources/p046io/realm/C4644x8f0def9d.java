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
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.HardwareSignal;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareSignalRealmProxy */
public class C4644x8f0def9d extends HardwareSignal implements RealmObjectProxy, C4645x6a0de1c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private HardwareSignalColumnInfo columnInfo;
    private ProxyState<HardwareSignal> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareSignalRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "HardwareSignal";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_HardwareSignalRealmProxy$HardwareSignalColumnInfo */
    static final class HardwareSignalColumnInfo extends ColumnInfo {
        long counterMaxIndex;
        long counterMinIndex;
        long dtIndex;
        long idIndex;
        long maxColumnIndexValue;
        long measureIndex;
        long nameIndex;
        long readonlyLabelIndex;
        long readonlyValueIndex;
        long showSmallWindowIndex;
        long signalIdIndex;
        long titleIndex;
        long typeControlIndex;
        long valueIndex;

        HardwareSignalColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.showSmallWindowIndex = addColumnDetails("showSmallWindow", "showSmallWindow", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.signalIdIndex = addColumnDetails("signalId", "signalId", objectSchemaInfo);
            this.dtIndex = addColumnDetails("dt", "dt", objectSchemaInfo);
            this.measureIndex = addColumnDetails("measure", "measure", objectSchemaInfo);
            this.typeControlIndex = addColumnDetails("typeControl", "typeControl", objectSchemaInfo);
            this.readonlyLabelIndex = addColumnDetails("readonlyLabel", "readonlyLabel", objectSchemaInfo);
            this.readonlyValueIndex = addColumnDetails("readonlyValue", "readonlyValue", objectSchemaInfo);
            this.counterMinIndex = addColumnDetails("counterMin", "counterMin", objectSchemaInfo);
            this.counterMaxIndex = addColumnDetails("counterMax", "counterMax", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        HardwareSignalColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new HardwareSignalColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            HardwareSignalColumnInfo hardwareSignalColumnInfo = (HardwareSignalColumnInfo) columnInfo;
            HardwareSignalColumnInfo hardwareSignalColumnInfo2 = (HardwareSignalColumnInfo) columnInfo2;
            hardwareSignalColumnInfo2.nameIndex = hardwareSignalColumnInfo.nameIndex;
            hardwareSignalColumnInfo2.titleIndex = hardwareSignalColumnInfo.titleIndex;
            hardwareSignalColumnInfo2.idIndex = hardwareSignalColumnInfo.idIndex;
            hardwareSignalColumnInfo2.showSmallWindowIndex = hardwareSignalColumnInfo.showSmallWindowIndex;
            hardwareSignalColumnInfo2.valueIndex = hardwareSignalColumnInfo.valueIndex;
            hardwareSignalColumnInfo2.signalIdIndex = hardwareSignalColumnInfo.signalIdIndex;
            hardwareSignalColumnInfo2.dtIndex = hardwareSignalColumnInfo.dtIndex;
            hardwareSignalColumnInfo2.measureIndex = hardwareSignalColumnInfo.measureIndex;
            hardwareSignalColumnInfo2.typeControlIndex = hardwareSignalColumnInfo.typeControlIndex;
            hardwareSignalColumnInfo2.readonlyLabelIndex = hardwareSignalColumnInfo.readonlyLabelIndex;
            hardwareSignalColumnInfo2.readonlyValueIndex = hardwareSignalColumnInfo.readonlyValueIndex;
            hardwareSignalColumnInfo2.counterMinIndex = hardwareSignalColumnInfo.counterMinIndex;
            hardwareSignalColumnInfo2.counterMaxIndex = hardwareSignalColumnInfo.counterMaxIndex;
            hardwareSignalColumnInfo2.maxColumnIndexValue = hardwareSignalColumnInfo.maxColumnIndexValue;
        }
    }

    C4644x8f0def9d() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (HardwareSignalColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$showSmallWindow() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.showSmallWindowIndex);
    }

    public void realmSet$showSmallWindow(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.showSmallWindowIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.showSmallWindowIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.showSmallWindowIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.showSmallWindowIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.valueIndex);
    }

    public void realmSet$value(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.valueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.valueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$signalId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.signalIdIndex);
    }

    public void realmSet$signalId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.signalIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.signalIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.signalIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.signalIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$dt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dtIndex);
    }

    public void realmSet$dt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$measure() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.measureIndex);
    }

    public void realmSet$measure(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.measureIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.measureIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.measureIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.measureIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$typeControl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeControlIndex);
    }

    public void realmSet$typeControl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeControlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeControlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeControlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeControlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$readonlyLabel() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.readonlyLabelIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.readonlyLabelIndex));
    }

    public void realmSet$readonlyLabel(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.readonlyLabelIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.readonlyLabelIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.readonlyLabelIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.readonlyLabelIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$readonlyValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.readonlyValueIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.readonlyValueIndex));
    }

    public void realmSet$readonlyValue(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.readonlyValueIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.readonlyValueIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.readonlyValueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.readonlyValueIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$counterMin() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.counterMinIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.counterMinIndex));
    }

    public void realmSet$counterMin(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.counterMinIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.counterMinIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.counterMinIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.counterMinIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$counterMax() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.counterMaxIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.counterMaxIndex));
    }

    public void realmSet$counterMax(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.counterMaxIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.counterMaxIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.counterMaxIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.counterMaxIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 13, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("showSmallWindow", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("signalId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("dt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("measure", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("typeControl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("readonlyLabel", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("readonlyValue", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("counterMin", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("counterMax", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static HardwareSignalColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new HardwareSignalColumnInfo(osSchemaInfo);
    }

    public static HardwareSignal createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        HardwareSignal hardwareSignal = (HardwareSignal) realm.createObjectInternal(HardwareSignal.class, true, Collections.emptyList());
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("showSmallWindow")) {
            if (jSONObject.isNull("showSmallWindow")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$showSmallWindow((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$showSmallWindow(jSONObject.getString("showSmallWindow"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        if (jSONObject.has("signalId")) {
            if (jSONObject.isNull("signalId")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$signalId((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$signalId(jSONObject.getString("signalId"));
            }
        }
        if (jSONObject.has("dt")) {
            if (jSONObject.isNull("dt")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$dt((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$dt(jSONObject.getString("dt"));
            }
        }
        if (jSONObject.has("measure")) {
            if (jSONObject.isNull("measure")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$measure((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$measure(jSONObject.getString("measure"));
            }
        }
        if (jSONObject.has("typeControl")) {
            if (jSONObject.isNull("typeControl")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$typeControl((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$typeControl(jSONObject.getString("typeControl"));
            }
        }
        if (jSONObject.has("readonlyLabel")) {
            if (jSONObject.isNull("readonlyLabel")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyLabel((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyLabel(Integer.valueOf(jSONObject.getInt("readonlyLabel")));
            }
        }
        if (jSONObject.has("readonlyValue")) {
            if (jSONObject.isNull("readonlyValue")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyValue((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyValue(Integer.valueOf(jSONObject.getInt("readonlyValue")));
            }
        }
        if (jSONObject.has("counterMin")) {
            if (jSONObject.isNull("counterMin")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMin((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMin(Integer.valueOf(jSONObject.getInt("counterMin")));
            }
        }
        if (jSONObject.has("counterMax")) {
            if (jSONObject.isNull("counterMax")) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMax((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMax(Integer.valueOf(jSONObject.getInt("counterMax")));
            }
        }
        return hardwareSignal;
    }

    public static HardwareSignal createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        HardwareSignal hardwareSignal = new HardwareSignal();
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("showSmallWindow")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$showSmallWindow(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$showSmallWindow((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$value((String) null);
                }
            } else if (nextName.equals("signalId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$signalId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$signalId((String) null);
                }
            } else if (nextName.equals("dt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$dt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$dt((String) null);
                }
            } else if (nextName.equals("measure")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$measure(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$measure((String) null);
                }
            } else if (nextName.equals("typeControl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$typeControl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$typeControl((String) null);
                }
            } else if (nextName.equals("readonlyLabel")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyLabel(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyLabel((Integer) null);
                }
            } else if (nextName.equals("readonlyValue")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyValue(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyValue((Integer) null);
                }
            } else if (nextName.equals("counterMin")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMin(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMin((Integer) null);
                }
            } else if (!nextName.equals("counterMax")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMax(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMax((Integer) null);
            }
        }
        jsonReader.endObject();
        return (HardwareSignal) realm.copyToRealm(hardwareSignal, new ImportFlag[0]);
    }

    private static C4644x8f0def9d newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class), false, Collections.emptyList());
        C4644x8f0def9d ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy = new C4644x8f0def9d();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy;
    }

    public static HardwareSignal copyOrUpdate(Realm realm, HardwareSignalColumnInfo hardwareSignalColumnInfo, HardwareSignal hardwareSignal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (hardwareSignal instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardwareSignal;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return hardwareSignal;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(hardwareSignal);
        if (realmObjectProxy2 != null) {
            return (HardwareSignal) realmObjectProxy2;
        }
        return copy(realm, hardwareSignalColumnInfo, hardwareSignal, z, map, set);
    }

    public static HardwareSignal copy(Realm realm, HardwareSignalColumnInfo hardwareSignalColumnInfo, HardwareSignal hardwareSignal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(hardwareSignal);
        if (realmObjectProxy != null) {
            return (HardwareSignal) realmObjectProxy;
        }
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(HardwareSignal.class), hardwareSignalColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(hardwareSignalColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(hardwareSignalColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(hardwareSignalColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(hardwareSignalColumnInfo.showSmallWindowIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$showSmallWindow());
        osObjectBuilder.addString(hardwareSignalColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(hardwareSignalColumnInfo.signalIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$signalId());
        osObjectBuilder.addString(hardwareSignalColumnInfo.dtIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$dt());
        osObjectBuilder.addString(hardwareSignalColumnInfo.measureIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$measure());
        osObjectBuilder.addString(hardwareSignalColumnInfo.typeControlIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$typeControl());
        osObjectBuilder.addInteger(hardwareSignalColumnInfo.readonlyLabelIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyLabel());
        osObjectBuilder.addInteger(hardwareSignalColumnInfo.readonlyValueIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyValue());
        osObjectBuilder.addInteger(hardwareSignalColumnInfo.counterMinIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMin());
        osObjectBuilder.addInteger(hardwareSignalColumnInfo.counterMaxIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMax());
        C4644x8f0def9d newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(hardwareSignal, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, HardwareSignal hardwareSignal, Map<RealmModel, Long> map) {
        HardwareSignal hardwareSignal2 = hardwareSignal;
        if (hardwareSignal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardwareSignal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(HardwareSignal.class);
        long nativePtr = table.getNativePtr();
        HardwareSignalColumnInfo hardwareSignalColumnInfo = (HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class);
        long createRow = OsObject.createRow(table);
        map.put(hardwareSignal2, Long.valueOf(createRow));
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal2;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$showSmallWindow();
        if (realmGet$showSmallWindow != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        String realmGet$signalId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$signalId();
        if (realmGet$signalId != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, realmGet$signalId, false);
        }
        String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, realmGet$dt, false);
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, realmGet$measure, false);
        }
        String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$typeControl();
        if (realmGet$typeControl != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
        }
        Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyLabel();
        if (realmGet$readonlyLabel != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
        }
        Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyValue();
        if (realmGet$readonlyValue != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
        }
        Integer realmGet$counterMin = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMin();
        if (realmGet$counterMin != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, realmGet$counterMin.longValue(), false);
        }
        Integer realmGet$counterMax = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMax();
        if (realmGet$counterMax != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, realmGet$counterMax.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(HardwareSignal.class);
        long nativePtr = table.getNativePtr();
        HardwareSignalColumnInfo hardwareSignalColumnInfo = (HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class);
        while (it.hasNext()) {
            HardwareSignal hardwareSignal = (HardwareSignal) it.next();
            if (!map2.containsKey(hardwareSignal)) {
                if (hardwareSignal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardwareSignal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(hardwareSignal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(hardwareSignal, Long.valueOf(createRow));
                C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$showSmallWindow();
                if (realmGet$showSmallWindow != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
                String realmGet$signalId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$signalId();
                if (realmGet$signalId != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, realmGet$signalId, false);
                }
                String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$dt();
                if (realmGet$dt != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, realmGet$dt, false);
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, realmGet$measure, false);
                }
                String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$typeControl();
                if (realmGet$typeControl != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
                }
                Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyLabel();
                if (realmGet$readonlyLabel != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
                }
                Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyValue();
                if (realmGet$readonlyValue != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
                }
                Integer realmGet$counterMin = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMin();
                if (realmGet$counterMin != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, realmGet$counterMin.longValue(), false);
                }
                Integer realmGet$counterMax = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMax();
                if (realmGet$counterMax != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, realmGet$counterMax.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, HardwareSignal hardwareSignal, Map<RealmModel, Long> map) {
        HardwareSignal hardwareSignal2 = hardwareSignal;
        if (hardwareSignal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardwareSignal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(HardwareSignal.class);
        long nativePtr = table.getNativePtr();
        HardwareSignalColumnInfo hardwareSignalColumnInfo = (HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class);
        long createRow = OsObject.createRow(table);
        map.put(hardwareSignal2, Long.valueOf(createRow));
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal2;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, false);
        }
        String realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$showSmallWindow();
        if (realmGet$showSmallWindow != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$signalId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$signalId();
        if (realmGet$signalId != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, realmGet$signalId, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, false);
        }
        String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, realmGet$dt, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, false);
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, realmGet$measure, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, false);
        }
        String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$typeControl();
        if (realmGet$typeControl != null) {
            Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, false);
        }
        Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyLabel();
        if (realmGet$readonlyLabel != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, false);
        }
        Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyValue();
        if (realmGet$readonlyValue != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, false);
        }
        Integer realmGet$counterMin = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMin();
        if (realmGet$counterMin != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, realmGet$counterMin.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, false);
        }
        Integer realmGet$counterMax = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMax();
        if (realmGet$counterMax != null) {
            Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, realmGet$counterMax.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(HardwareSignal.class);
        long nativePtr = table.getNativePtr();
        HardwareSignalColumnInfo hardwareSignalColumnInfo = (HardwareSignalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) HardwareSignal.class);
        while (it.hasNext()) {
            HardwareSignal hardwareSignal = (HardwareSignal) it.next();
            if (!map2.containsKey(hardwareSignal)) {
                if (hardwareSignal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) hardwareSignal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(hardwareSignal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(hardwareSignal, Long.valueOf(createRow));
                C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.idIndex, createRow, false);
                }
                String realmGet$showSmallWindow = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$showSmallWindow();
                if (realmGet$showSmallWindow != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, realmGet$showSmallWindow, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.showSmallWindowIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$signalId = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$signalId();
                if (realmGet$signalId != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, realmGet$signalId, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.signalIdIndex, createRow, false);
                }
                String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$dt();
                if (realmGet$dt != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, realmGet$dt, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.dtIndex, createRow, false);
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, realmGet$measure, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.measureIndex, createRow, false);
                }
                String realmGet$typeControl = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$typeControl();
                if (realmGet$typeControl != null) {
                    Table.nativeSetString(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, realmGet$typeControl, false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.typeControlIndex, createRow, false);
                }
                Integer realmGet$readonlyLabel = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyLabel();
                if (realmGet$readonlyLabel != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, realmGet$readonlyLabel.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.readonlyLabelIndex, createRow, false);
                }
                Integer realmGet$readonlyValue = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$readonlyValue();
                if (realmGet$readonlyValue != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, realmGet$readonlyValue.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.readonlyValueIndex, createRow, false);
                }
                Integer realmGet$counterMin = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMin();
                if (realmGet$counterMin != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, realmGet$counterMin.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.counterMinIndex, createRow, false);
                }
                Integer realmGet$counterMax = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmGet$counterMax();
                if (realmGet$counterMax != null) {
                    Table.nativeSetLong(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, realmGet$counterMax.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, hardwareSignalColumnInfo.counterMaxIndex, createRow, false);
                }
            }
        }
    }

    public static HardwareSignal createDetachedCopy(HardwareSignal hardwareSignal, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        HardwareSignal hardwareSignal2;
        if (i > i2 || hardwareSignal == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(hardwareSignal);
        if (cacheData == null) {
            hardwareSignal2 = new HardwareSignal();
            map.put(hardwareSignal, new RealmObjectProxy.CacheData(i, hardwareSignal2));
        } else if (i >= cacheData.minDepth) {
            return (HardwareSignal) cacheData.object;
        } else {
            cacheData.minDepth = i;
            hardwareSignal2 = (HardwareSignal) cacheData.object;
        }
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface = hardwareSignal2;
        C4645x6a0de1c ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2 = hardwareSignal;
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$showSmallWindow(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$showSmallWindow());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$signalId(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$signalId());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$dt(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$dt());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$measure(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$measure());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$typeControl(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$typeControl());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyLabel(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$readonlyLabel());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$readonlyValue(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$readonlyValue());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMin(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$counterMin());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface.realmSet$counterMax(ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxyinterface2.realmGet$counterMax());
        return hardwareSignal2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("HardwareSignal = proxy[");
        sb.append("{name:");
        Object obj = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        sb.append(realmGet$id() != null ? realmGet$id() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{showSmallWindow:");
        sb.append(realmGet$showSmallWindow() != null ? realmGet$showSmallWindow() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{signalId:");
        sb.append(realmGet$signalId() != null ? realmGet$signalId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{dt:");
        sb.append(realmGet$dt() != null ? realmGet$dt() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{measure:");
        sb.append(realmGet$measure() != null ? realmGet$measure() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{typeControl:");
        sb.append(realmGet$typeControl() != null ? realmGet$typeControl() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{readonlyLabel:");
        sb.append(realmGet$readonlyLabel() != null ? realmGet$readonlyLabel() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{readonlyValue:");
        sb.append(realmGet$readonlyValue() != null ? realmGet$readonlyValue() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{counterMin:");
        sb.append(realmGet$counterMin() != null ? realmGet$counterMin() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{counterMax:");
        if (realmGet$counterMax() != null) {
            obj = realmGet$counterMax();
        }
        sb.append(obj);
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
        C4644x8f0def9d ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy = (C4644x8f0def9d) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_hardware_hardwaresignalrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
