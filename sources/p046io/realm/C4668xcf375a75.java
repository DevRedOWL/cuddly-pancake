package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services;
import p046io.realm.BaseRealm;
import p046io.realm.C4658x6180a4a3;
import p046io.realm.C4660xccbea62f;
import p046io.realm.C4662xc0a23e3a;
import p046io.realm.C4664x5395ce9a;
import p046io.realm.C4672xd5d6cbb2;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy */
public class C4668xcf375a75 extends Schema implements RealmObjectProxy, C4669x6b662644 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SchemaColumnInfo columnInfo;
    private RealmList<DialogButtons> dialogButtonsRealmList;
    private ProxyState<Schema> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Schema";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy$SchemaColumnInfo */
    static final class SchemaColumnInfo extends ColumnInfo {
        long actionIndex;
        long actionValueIndex;
        long alertMessageIndex;
        long descriptionIndex;
        long dialogButtonsIndex;
        long domRuIdIndex;
        long guardIndex;
        long iconUrlIndex;
        long idIndex;
        long isActiveIndex;
        long maxColumnIndexValue;
        long minVersionIndex;
        long productStateIndex;
        long providerIconUrlIndex;
        long providerIndex;
        long schemaCallbackIndex;
        long sectionIdIndex;
        long sectionSlugIndex;
        long sectionTitleIndex;
        long serviceIdIndex;
        long servicesIndex;
        long titleIndex;
        long urlIndex;

        SchemaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(22);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.actionIndex = addColumnDetails("action", "action", objectSchemaInfo);
            this.actionValueIndex = addColumnDetails("actionValue", "actionValue", objectSchemaInfo);
            this.iconUrlIndex = addColumnDetails("iconUrl", "iconUrl", objectSchemaInfo);
            this.providerIconUrlIndex = addColumnDetails("providerIconUrl", "providerIconUrl", objectSchemaInfo);
            this.providerIndex = addColumnDetails("provider", "provider", objectSchemaInfo);
            this.serviceIdIndex = addColumnDetails("serviceId", "serviceId", objectSchemaInfo);
            this.productStateIndex = addColumnDetails("productState", "productState", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.domRuIdIndex = addColumnDetails("domRuId", "domRuId", objectSchemaInfo);
            this.guardIndex = addColumnDetails("guard", "guard", objectSchemaInfo);
            this.servicesIndex = addColumnDetails(ReactConst.SERVICETAB, ReactConst.SERVICETAB, objectSchemaInfo);
            this.alertMessageIndex = addColumnDetails("alertMessage", "alertMessage", objectSchemaInfo);
            this.minVersionIndex = addColumnDetails("minVersion", "minVersion", objectSchemaInfo);
            this.schemaCallbackIndex = addColumnDetails("schemaCallback", "schemaCallback", objectSchemaInfo);
            this.dialogButtonsIndex = addColumnDetails("dialogButtons", "dialogButtons", objectSchemaInfo);
            this.sectionIdIndex = addColumnDetails("sectionId", "sectionId", objectSchemaInfo);
            this.sectionSlugIndex = addColumnDetails("sectionSlug", "sectionSlug", objectSchemaInfo);
            this.sectionTitleIndex = addColumnDetails("sectionTitle", "sectionTitle", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.isActiveIndex = addColumnDetails("isActive", "isActive", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SchemaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SchemaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SchemaColumnInfo schemaColumnInfo = (SchemaColumnInfo) columnInfo;
            SchemaColumnInfo schemaColumnInfo2 = (SchemaColumnInfo) columnInfo2;
            schemaColumnInfo2.idIndex = schemaColumnInfo.idIndex;
            schemaColumnInfo2.actionIndex = schemaColumnInfo.actionIndex;
            schemaColumnInfo2.actionValueIndex = schemaColumnInfo.actionValueIndex;
            schemaColumnInfo2.iconUrlIndex = schemaColumnInfo.iconUrlIndex;
            schemaColumnInfo2.providerIconUrlIndex = schemaColumnInfo.providerIconUrlIndex;
            schemaColumnInfo2.providerIndex = schemaColumnInfo.providerIndex;
            schemaColumnInfo2.serviceIdIndex = schemaColumnInfo.serviceIdIndex;
            schemaColumnInfo2.productStateIndex = schemaColumnInfo.productStateIndex;
            schemaColumnInfo2.titleIndex = schemaColumnInfo.titleIndex;
            schemaColumnInfo2.descriptionIndex = schemaColumnInfo.descriptionIndex;
            schemaColumnInfo2.domRuIdIndex = schemaColumnInfo.domRuIdIndex;
            schemaColumnInfo2.guardIndex = schemaColumnInfo.guardIndex;
            schemaColumnInfo2.servicesIndex = schemaColumnInfo.servicesIndex;
            schemaColumnInfo2.alertMessageIndex = schemaColumnInfo.alertMessageIndex;
            schemaColumnInfo2.minVersionIndex = schemaColumnInfo.minVersionIndex;
            schemaColumnInfo2.schemaCallbackIndex = schemaColumnInfo.schemaCallbackIndex;
            schemaColumnInfo2.dialogButtonsIndex = schemaColumnInfo.dialogButtonsIndex;
            schemaColumnInfo2.sectionIdIndex = schemaColumnInfo.sectionIdIndex;
            schemaColumnInfo2.sectionSlugIndex = schemaColumnInfo.sectionSlugIndex;
            schemaColumnInfo2.sectionTitleIndex = schemaColumnInfo.sectionTitleIndex;
            schemaColumnInfo2.urlIndex = schemaColumnInfo.urlIndex;
            schemaColumnInfo2.isActiveIndex = schemaColumnInfo.isActiveIndex;
            schemaColumnInfo2.maxColumnIndexValue = schemaColumnInfo.maxColumnIndexValue;
        }
    }

    C4668xcf375a75() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SchemaColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$action() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionIndex);
    }

    public void realmSet$action(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$actionValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionValueIndex);
    }

    public void realmSet$actionValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionValueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionValueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionValueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionValueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$iconUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.iconUrlIndex);
    }

    public void realmSet$iconUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.iconUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.iconUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.iconUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.iconUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$providerIconUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.providerIconUrlIndex);
    }

    public void realmSet$providerIconUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.providerIconUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.providerIconUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.providerIconUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.providerIconUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$provider() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.providerIndex);
    }

    public void realmSet$provider(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.providerIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.providerIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.providerIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.providerIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$serviceId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.serviceIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.serviceIdIndex));
    }

    public void realmSet$serviceId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.serviceIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.serviceIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.serviceIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.serviceIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$productState() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.productStateIndex);
    }

    public void realmSet$productState(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.productStateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.productStateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.productStateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.productStateIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$domRuId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.domRuIdIndex);
    }

    public void realmSet$domRuId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.domRuIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.domRuIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.domRuIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.domRuIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Guard realmGet$guard() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.guardIndex)) {
            return null;
        }
        return (Guard) this.proxyState.getRealm$realm().get(Guard.class, this.proxyState.getRow$realm().getLink(this.columnInfo.guardIndex), false, Collections.emptyList());
    }

    public void realmSet$guard(Guard guard) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (guard == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.guardIndex);
                return;
            }
            this.proxyState.checkValidObject(guard);
            this.proxyState.getRow$realm().setLink(this.columnInfo.guardIndex, ((RealmObjectProxy) guard).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("guard")) {
            if (guard != null && !RealmObject.isManaged(guard)) {
                guard = (Guard) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(guard, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (guard == null) {
                row$realm.nullifyLink(this.columnInfo.guardIndex);
                return;
            }
            this.proxyState.checkValidObject(guard);
            row$realm.getTable().setLink(this.columnInfo.guardIndex, row$realm.getIndex(), ((RealmObjectProxy) guard).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Services realmGet$services() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.servicesIndex)) {
            return null;
        }
        return (Services) this.proxyState.getRealm$realm().get(Services.class, this.proxyState.getRow$realm().getLink(this.columnInfo.servicesIndex), false, Collections.emptyList());
    }

    public void realmSet$services(Services services) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (services == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.servicesIndex);
                return;
            }
            this.proxyState.checkValidObject(services);
            this.proxyState.getRow$realm().setLink(this.columnInfo.servicesIndex, ((RealmObjectProxy) services).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(ReactConst.SERVICETAB)) {
            if (services != null && !RealmObject.isManaged(services)) {
                services = (Services) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(services, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (services == null) {
                row$realm.nullifyLink(this.columnInfo.servicesIndex);
                return;
            }
            this.proxyState.checkValidObject(services);
            row$realm.getTable().setLink(this.columnInfo.servicesIndex, row$realm.getIndex(), ((RealmObjectProxy) services).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$alertMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.alertMessageIndex);
    }

    public void realmSet$alertMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.alertMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.alertMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.alertMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.alertMessageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public MinVersion realmGet$minVersion() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.minVersionIndex)) {
            return null;
        }
        return (MinVersion) this.proxyState.getRealm$realm().get(MinVersion.class, this.proxyState.getRow$realm().getLink(this.columnInfo.minVersionIndex), false, Collections.emptyList());
    }

    public void realmSet$minVersion(MinVersion minVersion) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (minVersion == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.minVersionIndex);
                return;
            }
            this.proxyState.checkValidObject(minVersion);
            this.proxyState.getRow$realm().setLink(this.columnInfo.minVersionIndex, ((RealmObjectProxy) minVersion).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("minVersion")) {
            if (minVersion != null && !RealmObject.isManaged(minVersion)) {
                minVersion = (MinVersion) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(minVersion, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (minVersion == null) {
                row$realm.nullifyLink(this.columnInfo.minVersionIndex);
                return;
            }
            this.proxyState.checkValidObject(minVersion);
            row$realm.getTable().setLink(this.columnInfo.minVersionIndex, row$realm.getIndex(), ((RealmObjectProxy) minVersion).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaCallback realmGet$schemaCallback() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.schemaCallbackIndex)) {
            return null;
        }
        return (SchemaCallback) this.proxyState.getRealm$realm().get(SchemaCallback.class, this.proxyState.getRow$realm().getLink(this.columnInfo.schemaCallbackIndex), false, Collections.emptyList());
    }

    public void realmSet$schemaCallback(SchemaCallback schemaCallback) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaCallback == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.schemaCallbackIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaCallback);
            this.proxyState.getRow$realm().setLink(this.columnInfo.schemaCallbackIndex, ((RealmObjectProxy) schemaCallback).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("schemaCallback")) {
            if (schemaCallback != null && !RealmObject.isManaged(schemaCallback)) {
                schemaCallback = (SchemaCallback) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaCallback, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaCallback == null) {
                row$realm.nullifyLink(this.columnInfo.schemaCallbackIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaCallback);
            row$realm.getTable().setLink(this.columnInfo.schemaCallbackIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaCallback).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<DialogButtons> realmGet$dialogButtons() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<DialogButtons> realmList = this.dialogButtonsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.dialogButtonsRealmList = new RealmList<>(DialogButtons.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.dialogButtonsIndex), this.proxyState.getRealm$realm());
        return this.dialogButtonsRealmList;
    }

    public void realmSet$dialogButtons(RealmList<DialogButtons> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("dialogButtons")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<DialogButtons> realmList2 = new RealmList<>();
                Iterator<DialogButtons> it = realmList.iterator();
                while (it.hasNext()) {
                    DialogButtons next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.dialogButtonsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    DialogButtons dialogButtons = realmList.get(i);
                    this.proxyState.checkValidObject(dialogButtons);
                    modelList.addRow(((RealmObjectProxy) dialogButtons).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            DialogButtons dialogButtons2 = realmList.get(i);
            this.proxyState.checkValidObject(dialogButtons2);
            modelList.setRow((long) i, ((RealmObjectProxy) dialogButtons2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public String realmGet$sectionId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sectionIdIndex);
    }

    public void realmSet$sectionId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sectionIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sectionIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sectionIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sectionIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$sectionSlug() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sectionSlugIndex);
    }

    public void realmSet$sectionSlug(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sectionSlugIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sectionSlugIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sectionSlugIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sectionSlugIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$sectionTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sectionTitleIndex);
    }

    public void realmSet$sectionTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sectionTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sectionTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sectionTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sectionTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlIndex);
    }

    public void realmSet$url(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$isActive() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isActiveIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isActiveIndex));
    }

    public void realmSet$isActive(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isActiveIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isActiveIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isActiveIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isActiveIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 22, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("action", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("actionValue", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("iconUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("providerIconUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("provider", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("serviceId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("productState", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("domRuId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("guard", RealmFieldType.OBJECT, C4660xccbea62f.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(ReactConst.SERVICETAB, RealmFieldType.OBJECT, C4672xd5d6cbb2.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("alertMessage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("minVersion", RealmFieldType.OBJECT, C4662xc0a23e3a.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("schemaCallback", RealmFieldType.OBJECT, C4664x5395ce9a.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("dialogButtons", RealmFieldType.LIST, C4658x6180a4a3.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("sectionId", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("sectionSlug", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("sectionTitle", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("isActive", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SchemaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SchemaColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r5 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy$SchemaColumnInfo r4 = (p046io.realm.C4668xcf375a75.SchemaColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "dialogButtons"
            java.lang.String r5 = "schemaCallback"
            java.lang.String r6 = "minVersion"
            java.lang.String r7 = "services"
            java.lang.String r8 = "guard"
            if (r3 != 0) goto L_0x00d2
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x007c
            r0.add(r8)
        L_0x007c:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x0085
            r0.add(r7)
        L_0x0085:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x008e
            r0.add(r6)
        L_0x008e:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0097
            r0.add(r5)
        L_0x0097:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x00a0
            r0.add(r4)
        L_0x00a0:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r14.isNull(r1)
            if (r3 == 0) goto L_0x00b7
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            r3 = 1
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r3, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy r3 = (p046io.realm.C4668xcf375a75) r3
            goto L_0x00d2
        L_0x00b7:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9 = 1
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy r3 = (p046io.realm.C4668xcf375a75) r3
            goto L_0x00d2
        L_0x00ca:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00d2:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxyInterface r0 = (p046io.realm.C4669x6b662644) r0
            java.lang.String r1 = "action"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x00ee
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x00e7
            r0.realmSet$action(r2)
            goto L_0x00ee
        L_0x00e7:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$action(r1)
        L_0x00ee:
            java.lang.String r1 = "actionValue"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0107
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0100
            r0.realmSet$actionValue(r2)
            goto L_0x0107
        L_0x0100:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$actionValue(r1)
        L_0x0107:
            java.lang.String r1 = "iconUrl"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0120
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0119
            r0.realmSet$iconUrl(r2)
            goto L_0x0120
        L_0x0119:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$iconUrl(r1)
        L_0x0120:
            java.lang.String r1 = "providerIconUrl"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0139
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0132
            r0.realmSet$providerIconUrl(r2)
            goto L_0x0139
        L_0x0132:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$providerIconUrl(r1)
        L_0x0139:
            java.lang.String r1 = "provider"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0152
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x014b
            r0.realmSet$provider(r2)
            goto L_0x0152
        L_0x014b:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$provider(r1)
        L_0x0152:
            java.lang.String r1 = "serviceId"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x016f
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0164
            r0.realmSet$serviceId(r2)
            goto L_0x016f
        L_0x0164:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$serviceId(r1)
        L_0x016f:
            java.lang.String r1 = "productState"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0188
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0181
            r0.realmSet$productState(r2)
            goto L_0x0188
        L_0x0181:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$productState(r1)
        L_0x0188:
            java.lang.String r1 = "title"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x01a1
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x019a
            r0.realmSet$title(r2)
            goto L_0x01a1
        L_0x019a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x01a1:
            java.lang.String r1 = "description"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = "description"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01b5
            r0.realmSet$description(r2)
            goto L_0x01be
        L_0x01b5:
            java.lang.String r1 = "description"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x01be:
            java.lang.String r1 = "domRuId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01db
            java.lang.String r1 = "domRuId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01d2
            r0.realmSet$domRuId(r2)
            goto L_0x01db
        L_0x01d2:
            java.lang.String r1 = "domRuId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$domRuId(r1)
        L_0x01db:
            boolean r1 = r14.has(r8)
            if (r1 == 0) goto L_0x01f6
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x01eb
            r0.realmSet$guard(r2)
            goto L_0x01f6
        L_0x01eb:
            org.json.JSONObject r1 = r14.getJSONObject(r8)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard r1 = p046io.realm.C4660xccbea62f.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$guard(r1)
        L_0x01f6:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0211
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0206
            r0.realmSet$services(r2)
            goto L_0x0211
        L_0x0206:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Services r1 = p046io.realm.C4672xd5d6cbb2.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$services(r1)
        L_0x0211:
            java.lang.String r1 = "alertMessage"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x022e
            java.lang.String r1 = "alertMessage"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0225
            r0.realmSet$alertMessage(r2)
            goto L_0x022e
        L_0x0225:
            java.lang.String r1 = "alertMessage"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$alertMessage(r1)
        L_0x022e:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x0249
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x023e
            r0.realmSet$minVersion(r2)
            goto L_0x0249
        L_0x023e:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion r1 = p046io.realm.C4662xc0a23e3a.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$minVersion(r1)
        L_0x0249:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0264
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0259
            r0.realmSet$schemaCallback(r2)
            goto L_0x0264
        L_0x0259:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r1 = p046io.realm.C4664x5395ce9a.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$schemaCallback(r1)
        L_0x0264:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0298
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0274
            r0.realmSet$dialogButtons(r2)
            goto L_0x0298
        L_0x0274:
            io.realm.RealmList r1 = r0.realmGet$dialogButtons()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r4)
            r4 = 0
        L_0x0280:
            int r5 = r1.length()
            if (r4 >= r5) goto L_0x0298
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons r5 = p046io.realm.C4658x6180a4a3.createOrUpdateUsingJsonObject(r13, r5, r15)
            io.realm.RealmList r6 = r0.realmGet$dialogButtons()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x0280
        L_0x0298:
            java.lang.String r13 = "sectionId"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x02b5
            java.lang.String r13 = "sectionId"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x02ac
            r0.realmSet$sectionId(r2)
            goto L_0x02b5
        L_0x02ac:
            java.lang.String r13 = "sectionId"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$sectionId(r13)
        L_0x02b5:
            java.lang.String r13 = "sectionSlug"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x02d2
            java.lang.String r13 = "sectionSlug"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x02c9
            r0.realmSet$sectionSlug(r2)
            goto L_0x02d2
        L_0x02c9:
            java.lang.String r13 = "sectionSlug"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$sectionSlug(r13)
        L_0x02d2:
            java.lang.String r13 = "sectionTitle"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x02ef
            java.lang.String r13 = "sectionTitle"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x02e6
            r0.realmSet$sectionTitle(r2)
            goto L_0x02ef
        L_0x02e6:
            java.lang.String r13 = "sectionTitle"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$sectionTitle(r13)
        L_0x02ef:
            java.lang.String r13 = "url"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x030f
            java.lang.String r13 = "url"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0305
            r0.realmSet$url(r2)
            goto L_0x030f
        L_0x0305:
            java.lang.String r13 = "url"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$url(r13)
        L_0x030f:
            java.lang.String r13 = "isActive"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0330
            java.lang.String r13 = "isActive"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0323
            r0.realmSet$isActive(r2)
            goto L_0x0330
        L_0x0323:
            java.lang.String r13 = "isActive"
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$isActive(r13)
        L_0x0330:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema");
    }

    public static Schema createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Schema schema = new Schema();
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("action")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$action(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$action((String) null);
                }
            } else if (nextName.equals("actionValue")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$actionValue(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$actionValue((String) null);
                }
            } else if (nextName.equals("iconUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$iconUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$iconUrl((String) null);
                }
            } else if (nextName.equals("providerIconUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$providerIconUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$providerIconUrl((String) null);
                }
            } else if (nextName.equals("provider")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$provider(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$provider((String) null);
                }
            } else if (nextName.equals("serviceId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$serviceId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$serviceId((Integer) null);
                }
            } else if (nextName.equals("productState")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$productState(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$productState((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("domRuId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$domRuId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$domRuId((String) null);
                }
            } else if (nextName.equals("guard")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$guard((Guard) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$guard(C4660xccbea62f.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals(ReactConst.SERVICETAB)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$services((Services) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$services(C4672xd5d6cbb2.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("alertMessage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$alertMessage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$alertMessage((String) null);
                }
            } else if (nextName.equals("minVersion")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$minVersion((MinVersion) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$minVersion(C4662xc0a23e3a.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("schemaCallback")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$schemaCallback((SchemaCallback) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$schemaCallback(C4664x5395ce9a.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("dialogButtons")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$dialogButtons((RealmList<DialogButtons>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$dialogButtons(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons().add(C4658x6180a4a3.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("sectionId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionId((String) null);
                }
            } else if (nextName.equals("sectionSlug")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionSlug(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionSlug((String) null);
                }
            } else if (nextName.equals("sectionTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionTitle((String) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$url((String) null);
                }
            } else if (!nextName.equals("isActive")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$isActive(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$isActive((Boolean) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Schema) realm.copyToRealm(schema, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4668xcf375a75 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), false, Collections.emptyList());
        C4668xcf375a75 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy = new C4668xcf375a75();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4668xcf375a75.SchemaColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxyInterface r5 = (p046io.realm.C4669x6b662644) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4668xcf375a75.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemaRealmProxy$SchemaColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema");
    }

    public static Schema copy(Realm realm, SchemaColumnInfo schemaColumnInfo, Schema schema, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(schema);
        if (realmObjectProxy != null) {
            return (Schema) realmObjectProxy;
        }
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Schema.class), schemaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(schemaColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(schemaColumnInfo.actionIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$action());
        osObjectBuilder.addString(schemaColumnInfo.actionValueIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$actionValue());
        osObjectBuilder.addString(schemaColumnInfo.iconUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$iconUrl());
        osObjectBuilder.addString(schemaColumnInfo.providerIconUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$providerIconUrl());
        osObjectBuilder.addString(schemaColumnInfo.providerIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$provider());
        osObjectBuilder.addInteger(schemaColumnInfo.serviceIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$serviceId());
        osObjectBuilder.addString(schemaColumnInfo.productStateIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$productState());
        osObjectBuilder.addString(schemaColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(schemaColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(schemaColumnInfo.domRuIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$domRuId());
        osObjectBuilder.addString(schemaColumnInfo.alertMessageIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$alertMessage());
        osObjectBuilder.addString(schemaColumnInfo.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionId());
        osObjectBuilder.addString(schemaColumnInfo.sectionSlugIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionSlug());
        osObjectBuilder.addString(schemaColumnInfo.sectionTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionTitle());
        osObjectBuilder.addString(schemaColumnInfo.urlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$url());
        osObjectBuilder.addBoolean(schemaColumnInfo.isActiveIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$isActive());
        C4668xcf375a75 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(schema, newProxyInstance);
        Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$guard();
        if (realmGet$guard == null) {
            newProxyInstance.realmSet$guard((Guard) null);
        } else {
            Guard guard = (Guard) map.get(realmGet$guard);
            if (guard != null) {
                newProxyInstance.realmSet$guard(guard);
            } else {
                newProxyInstance.realmSet$guard(C4660xccbea62f.copyOrUpdate(realm, (C4660xccbea62f.GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class), realmGet$guard, z, map, set));
            }
        }
        Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$services();
        if (realmGet$services == null) {
            newProxyInstance.realmSet$services((Services) null);
        } else {
            Services services = (Services) map.get(realmGet$services);
            if (services != null) {
                newProxyInstance.realmSet$services(services);
            } else {
                newProxyInstance.realmSet$services(C4672xd5d6cbb2.copyOrUpdate(realm, (C4672xd5d6cbb2.ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class), realmGet$services, z, map, set));
            }
        }
        MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$minVersion();
        if (realmGet$minVersion == null) {
            newProxyInstance.realmSet$minVersion((MinVersion) null);
        } else {
            MinVersion minVersion = (MinVersion) map.get(realmGet$minVersion);
            if (minVersion != null) {
                newProxyInstance.realmSet$minVersion(minVersion);
            } else {
                newProxyInstance.realmSet$minVersion(C4662xc0a23e3a.copyOrUpdate(realm, (C4662xc0a23e3a.MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class), realmGet$minVersion, z, map, set));
            }
        }
        SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$schemaCallback();
        if (realmGet$schemaCallback == null) {
            newProxyInstance.realmSet$schemaCallback((SchemaCallback) null);
        } else {
            SchemaCallback schemaCallback = (SchemaCallback) map.get(realmGet$schemaCallback);
            if (schemaCallback != null) {
                newProxyInstance.realmSet$schemaCallback(schemaCallback);
            } else {
                newProxyInstance.realmSet$schemaCallback(C4664x5395ce9a.copyOrUpdate(realm, (C4664x5395ce9a.SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class), realmGet$schemaCallback, z, map, set));
            }
        }
        RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons();
        if (realmGet$dialogButtons != null) {
            RealmList<DialogButtons> realmGet$dialogButtons2 = newProxyInstance.realmGet$dialogButtons();
            realmGet$dialogButtons2.clear();
            for (int i = 0; i < realmGet$dialogButtons.size(); i++) {
                DialogButtons dialogButtons = realmGet$dialogButtons.get(i);
                DialogButtons dialogButtons2 = (DialogButtons) map.get(dialogButtons);
                if (dialogButtons2 != null) {
                    realmGet$dialogButtons2.add(dialogButtons2);
                } else {
                    realmGet$dialogButtons2.add(C4658x6180a4a3.copyOrUpdate(realm, (C4658x6180a4a3.DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class), dialogButtons, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Schema schema, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Schema schema2 = schema;
        Map<RealmModel, Long> map2 = map;
        if (schema2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schema2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Schema.class);
        long nativePtr = table.getNativePtr();
        SchemaColumnInfo schemaColumnInfo = (SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class);
        long j5 = schemaColumnInfo.idIndex;
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j5);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j5, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j5, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        long j6 = j;
        map2.put(schema2, Long.valueOf(j6));
        String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            j2 = j6;
            Table.nativeSetString(nativePtr, schemaColumnInfo.actionIndex, j6, realmGet$action, false);
        } else {
            j2 = j6;
        }
        String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$actionValue();
        if (realmGet$actionValue != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.actionValueIndex, j2, realmGet$actionValue, false);
        }
        String realmGet$iconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$iconUrl();
        if (realmGet$iconUrl != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.iconUrlIndex, j2, realmGet$iconUrl, false);
        }
        String realmGet$providerIconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$providerIconUrl();
        if (realmGet$providerIconUrl != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.providerIconUrlIndex, j2, realmGet$providerIconUrl, false);
        }
        String realmGet$provider = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$provider();
        if (realmGet$provider != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.providerIndex, j2, realmGet$provider, false);
        }
        Integer realmGet$serviceId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$serviceId();
        if (realmGet$serviceId != null) {
            Table.nativeSetLong(nativePtr, schemaColumnInfo.serviceIdIndex, j2, realmGet$serviceId.longValue(), false);
        }
        String realmGet$productState = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$productState();
        if (realmGet$productState != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.productStateIndex, j2, realmGet$productState, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        String realmGet$domRuId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$domRuId();
        if (realmGet$domRuId != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.domRuIdIndex, j2, realmGet$domRuId, false);
        }
        Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$guard();
        if (realmGet$guard != null) {
            Long l = map2.get(realmGet$guard);
            if (l == null) {
                l = Long.valueOf(C4660xccbea62f.insert(realm2, realmGet$guard, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.guardIndex, j2, l.longValue(), false);
        }
        Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$services();
        if (realmGet$services != null) {
            Long l2 = map2.get(realmGet$services);
            if (l2 == null) {
                l2 = Long.valueOf(C4672xd5d6cbb2.insert(realm2, realmGet$services, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.servicesIndex, j2, l2.longValue(), false);
        }
        String realmGet$alertMessage = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$alertMessage();
        if (realmGet$alertMessage != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.alertMessageIndex, j2, realmGet$alertMessage, false);
        }
        MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$minVersion();
        if (realmGet$minVersion != null) {
            Long l3 = map2.get(realmGet$minVersion);
            if (l3 == null) {
                l3 = Long.valueOf(C4662xc0a23e3a.insert(realm2, realmGet$minVersion, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.minVersionIndex, j2, l3.longValue(), false);
        }
        SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$schemaCallback();
        if (realmGet$schemaCallback != null) {
            Long l4 = map2.get(realmGet$schemaCallback);
            if (l4 == null) {
                l4 = Long.valueOf(C4664x5395ce9a.insert(realm2, realmGet$schemaCallback, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.schemaCallbackIndex, j2, l4.longValue(), false);
        }
        RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons();
        if (realmGet$dialogButtons != null) {
            j3 = j2;
            OsList osList = new OsList(table.getUncheckedRow(j3), schemaColumnInfo.dialogButtonsIndex);
            Iterator<DialogButtons> it = realmGet$dialogButtons.iterator();
            while (it.hasNext()) {
                DialogButtons next = it.next();
                Long l5 = map2.get(next);
                if (l5 == null) {
                    l5 = Long.valueOf(C4658x6180a4a3.insert(realm2, next, map2));
                }
                osList.addRow(l5.longValue());
            }
        } else {
            j3 = j2;
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            j4 = j3;
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionIdIndex, j3, realmGet$sectionId, false);
        } else {
            j4 = j3;
        }
        String realmGet$sectionSlug = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionSlug();
        if (realmGet$sectionSlug != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionSlugIndex, j4, realmGet$sectionSlug, false);
        }
        String realmGet$sectionTitle = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionTitle();
        if (realmGet$sectionTitle != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionTitleIndex, j4, realmGet$sectionTitle, false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.urlIndex, j4, realmGet$url, false);
        }
        Boolean realmGet$isActive = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$isActive();
        if (realmGet$isActive != null) {
            Table.nativeSetBoolean(nativePtr, schemaColumnInfo.isActiveIndex, j4, realmGet$isActive.booleanValue(), false);
        }
        return j4;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Schema.class);
        long nativePtr = table.getNativePtr();
        SchemaColumnInfo schemaColumnInfo = (SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class);
        long j6 = schemaColumnInfo.idIndex;
        while (it.hasNext()) {
            Schema schema = (Schema) it.next();
            if (!map2.containsKey(schema)) {
                if (schema instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schema;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schema, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j6, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j7 = j;
                map2.put(schema, Long.valueOf(j7));
                String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, schemaColumnInfo.actionIndex, j7, realmGet$action, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                }
                String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$actionValue();
                if (realmGet$actionValue != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.actionValueIndex, j3, realmGet$actionValue, false);
                }
                String realmGet$iconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$iconUrl();
                if (realmGet$iconUrl != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.iconUrlIndex, j3, realmGet$iconUrl, false);
                }
                String realmGet$providerIconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$providerIconUrl();
                if (realmGet$providerIconUrl != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.providerIconUrlIndex, j3, realmGet$providerIconUrl, false);
                }
                String realmGet$provider = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$provider();
                if (realmGet$provider != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.providerIndex, j3, realmGet$provider, false);
                }
                Integer realmGet$serviceId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$serviceId();
                if (realmGet$serviceId != null) {
                    Table.nativeSetLong(nativePtr, schemaColumnInfo.serviceIdIndex, j3, realmGet$serviceId.longValue(), false);
                }
                String realmGet$productState = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$productState();
                if (realmGet$productState != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.productStateIndex, j3, realmGet$productState, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
                String realmGet$domRuId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$domRuId();
                if (realmGet$domRuId != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.domRuIdIndex, j3, realmGet$domRuId, false);
                }
                Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$guard();
                if (realmGet$guard != null) {
                    Long l = map2.get(realmGet$guard);
                    if (l == null) {
                        l = Long.valueOf(C4660xccbea62f.insert(realm2, realmGet$guard, map2));
                    }
                    table.setLink(schemaColumnInfo.guardIndex, j3, l.longValue(), false);
                }
                Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$services();
                if (realmGet$services != null) {
                    Long l2 = map2.get(realmGet$services);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4672xd5d6cbb2.insert(realm2, realmGet$services, map2));
                    }
                    table.setLink(schemaColumnInfo.servicesIndex, j3, l2.longValue(), false);
                }
                String realmGet$alertMessage = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$alertMessage();
                if (realmGet$alertMessage != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.alertMessageIndex, j3, realmGet$alertMessage, false);
                }
                MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$minVersion();
                if (realmGet$minVersion != null) {
                    Long l3 = map2.get(realmGet$minVersion);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4662xc0a23e3a.insert(realm2, realmGet$minVersion, map2));
                    }
                    table.setLink(schemaColumnInfo.minVersionIndex, j3, l3.longValue(), false);
                }
                SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$schemaCallback();
                if (realmGet$schemaCallback != null) {
                    Long l4 = map2.get(realmGet$schemaCallback);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4664x5395ce9a.insert(realm2, realmGet$schemaCallback, map2));
                    }
                    table.setLink(schemaColumnInfo.schemaCallbackIndex, j3, l4.longValue(), false);
                }
                RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons();
                if (realmGet$dialogButtons != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), schemaColumnInfo.dialogButtonsIndex);
                    Iterator<DialogButtons> it2 = realmGet$dialogButtons.iterator();
                    while (it2.hasNext()) {
                        DialogButtons next = it2.next();
                        Long l5 = map2.get(next);
                        if (l5 == null) {
                            l5 = Long.valueOf(C4658x6180a4a3.insert(realm2, next, map2));
                        }
                        osList.addRow(l5.longValue());
                    }
                } else {
                    j4 = j3;
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionIdIndex, j4, realmGet$sectionId, false);
                } else {
                    j5 = j4;
                }
                String realmGet$sectionSlug = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionSlug();
                if (realmGet$sectionSlug != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionSlugIndex, j5, realmGet$sectionSlug, false);
                }
                String realmGet$sectionTitle = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionTitle();
                if (realmGet$sectionTitle != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionTitleIndex, j5, realmGet$sectionTitle, false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.urlIndex, j5, realmGet$url, false);
                }
                Boolean realmGet$isActive = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$isActive();
                if (realmGet$isActive != null) {
                    Table.nativeSetBoolean(nativePtr, schemaColumnInfo.isActiveIndex, j5, realmGet$isActive.booleanValue(), false);
                }
                j6 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Schema schema, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Schema schema2 = schema;
        Map<RealmModel, Long> map2 = map;
        if (schema2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schema2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Schema.class);
        long nativePtr = table.getNativePtr();
        SchemaColumnInfo schemaColumnInfo = (SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class);
        long j4 = schemaColumnInfo.idIndex;
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema2;
        if (ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j4, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id());
        }
        long j5 = j;
        map2.put(schema2, Long.valueOf(j5));
        String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            j2 = j5;
            Table.nativeSetString(nativePtr, schemaColumnInfo.actionIndex, j5, realmGet$action, false);
        } else {
            j2 = j5;
            Table.nativeSetNull(nativePtr, schemaColumnInfo.actionIndex, j2, false);
        }
        String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$actionValue();
        if (realmGet$actionValue != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.actionValueIndex, j2, realmGet$actionValue, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.actionValueIndex, j2, false);
        }
        String realmGet$iconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$iconUrl();
        if (realmGet$iconUrl != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.iconUrlIndex, j2, realmGet$iconUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.iconUrlIndex, j2, false);
        }
        String realmGet$providerIconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$providerIconUrl();
        if (realmGet$providerIconUrl != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.providerIconUrlIndex, j2, realmGet$providerIconUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.providerIconUrlIndex, j2, false);
        }
        String realmGet$provider = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$provider();
        if (realmGet$provider != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.providerIndex, j2, realmGet$provider, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.providerIndex, j2, false);
        }
        Integer realmGet$serviceId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$serviceId();
        if (realmGet$serviceId != null) {
            Table.nativeSetLong(nativePtr, schemaColumnInfo.serviceIdIndex, j2, realmGet$serviceId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.serviceIdIndex, j2, false);
        }
        String realmGet$productState = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$productState();
        if (realmGet$productState != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.productStateIndex, j2, realmGet$productState, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.productStateIndex, j2, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.titleIndex, j2, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.descriptionIndex, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.descriptionIndex, j2, false);
        }
        String realmGet$domRuId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$domRuId();
        if (realmGet$domRuId != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.domRuIdIndex, j2, realmGet$domRuId, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.domRuIdIndex, j2, false);
        }
        Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$guard();
        if (realmGet$guard != null) {
            Long l = map2.get(realmGet$guard);
            if (l == null) {
                l = Long.valueOf(C4660xccbea62f.insertOrUpdate(realm2, realmGet$guard, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.guardIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, schemaColumnInfo.guardIndex, j2);
        }
        Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$services();
        if (realmGet$services != null) {
            Long l2 = map2.get(realmGet$services);
            if (l2 == null) {
                l2 = Long.valueOf(C4672xd5d6cbb2.insertOrUpdate(realm2, realmGet$services, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.servicesIndex, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, schemaColumnInfo.servicesIndex, j2);
        }
        String realmGet$alertMessage = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$alertMessage();
        if (realmGet$alertMessage != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.alertMessageIndex, j2, realmGet$alertMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.alertMessageIndex, j2, false);
        }
        MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$minVersion();
        if (realmGet$minVersion != null) {
            Long l3 = map2.get(realmGet$minVersion);
            if (l3 == null) {
                l3 = Long.valueOf(C4662xc0a23e3a.insertOrUpdate(realm2, realmGet$minVersion, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.minVersionIndex, j2, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, schemaColumnInfo.minVersionIndex, j2);
        }
        SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$schemaCallback();
        if (realmGet$schemaCallback != null) {
            Long l4 = map2.get(realmGet$schemaCallback);
            if (l4 == null) {
                l4 = Long.valueOf(C4664x5395ce9a.insertOrUpdate(realm2, realmGet$schemaCallback, map2));
            }
            Table.nativeSetLink(nativePtr, schemaColumnInfo.schemaCallbackIndex, j2, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, schemaColumnInfo.schemaCallbackIndex, j2);
        }
        long j6 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j6), schemaColumnInfo.dialogButtonsIndex);
        RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons();
        if (realmGet$dialogButtons == null || ((long) realmGet$dialogButtons.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$dialogButtons != null) {
                Iterator<DialogButtons> it = realmGet$dialogButtons.iterator();
                while (it.hasNext()) {
                    DialogButtons next = it.next();
                    Long l5 = map2.get(next);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4658x6180a4a3.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l5.longValue());
                }
            }
        } else {
            int size = realmGet$dialogButtons.size();
            for (int i = 0; i < size; i++) {
                DialogButtons dialogButtons = realmGet$dialogButtons.get(i);
                Long l6 = map2.get(dialogButtons);
                if (l6 == null) {
                    l6 = Long.valueOf(C4658x6180a4a3.insertOrUpdate(realm2, dialogButtons, map2));
                }
                osList.setRow((long) i, l6.longValue());
            }
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            j3 = j6;
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionIdIndex, j6, realmGet$sectionId, false);
        } else {
            j3 = j6;
            Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionIdIndex, j3, false);
        }
        String realmGet$sectionSlug = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionSlug();
        if (realmGet$sectionSlug != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionSlugIndex, j3, realmGet$sectionSlug, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionSlugIndex, j3, false);
        }
        String realmGet$sectionTitle = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionTitle();
        if (realmGet$sectionTitle != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.sectionTitleIndex, j3, realmGet$sectionTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionTitleIndex, j3, false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, schemaColumnInfo.urlIndex, j3, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.urlIndex, j3, false);
        }
        Boolean realmGet$isActive = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$isActive();
        if (realmGet$isActive != null) {
            Table.nativeSetBoolean(nativePtr, schemaColumnInfo.isActiveIndex, j3, realmGet$isActive.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, schemaColumnInfo.isActiveIndex, j3, false);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Schema.class);
        long nativePtr = table.getNativePtr();
        SchemaColumnInfo schemaColumnInfo = (SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class);
        long j6 = schemaColumnInfo.idIndex;
        while (it.hasNext()) {
            Schema schema = (Schema) it.next();
            if (!map2.containsKey(schema)) {
                if (schema instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schema;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schema, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema;
                if (ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j6, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$id());
                }
                long j7 = j;
                map2.put(schema, Long.valueOf(j7));
                String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, schemaColumnInfo.actionIndex, j7, realmGet$action, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.actionIndex, j7, false);
                }
                String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$actionValue();
                if (realmGet$actionValue != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.actionValueIndex, j3, realmGet$actionValue, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.actionValueIndex, j3, false);
                }
                String realmGet$iconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$iconUrl();
                if (realmGet$iconUrl != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.iconUrlIndex, j3, realmGet$iconUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.iconUrlIndex, j3, false);
                }
                String realmGet$providerIconUrl = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$providerIconUrl();
                if (realmGet$providerIconUrl != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.providerIconUrlIndex, j3, realmGet$providerIconUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.providerIconUrlIndex, j3, false);
                }
                String realmGet$provider = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$provider();
                if (realmGet$provider != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.providerIndex, j3, realmGet$provider, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.providerIndex, j3, false);
                }
                Integer realmGet$serviceId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$serviceId();
                if (realmGet$serviceId != null) {
                    Table.nativeSetLong(nativePtr, schemaColumnInfo.serviceIdIndex, j3, realmGet$serviceId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.serviceIdIndex, j3, false);
                }
                String realmGet$productState = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$productState();
                if (realmGet$productState != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.productStateIndex, j3, realmGet$productState, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.productStateIndex, j3, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.titleIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.descriptionIndex, j3, false);
                }
                String realmGet$domRuId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$domRuId();
                if (realmGet$domRuId != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.domRuIdIndex, j3, realmGet$domRuId, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.domRuIdIndex, j3, false);
                }
                Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$guard();
                if (realmGet$guard != null) {
                    Long l = map2.get(realmGet$guard);
                    if (l == null) {
                        l = Long.valueOf(C4660xccbea62f.insertOrUpdate(realm2, realmGet$guard, map2));
                    }
                    Table.nativeSetLink(nativePtr, schemaColumnInfo.guardIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, schemaColumnInfo.guardIndex, j3);
                }
                Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$services();
                if (realmGet$services != null) {
                    Long l2 = map2.get(realmGet$services);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4672xd5d6cbb2.insertOrUpdate(realm2, realmGet$services, map2));
                    }
                    Table.nativeSetLink(nativePtr, schemaColumnInfo.servicesIndex, j3, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, schemaColumnInfo.servicesIndex, j3);
                }
                String realmGet$alertMessage = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$alertMessage();
                if (realmGet$alertMessage != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.alertMessageIndex, j3, realmGet$alertMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.alertMessageIndex, j3, false);
                }
                MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$minVersion();
                if (realmGet$minVersion != null) {
                    Long l3 = map2.get(realmGet$minVersion);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4662xc0a23e3a.insertOrUpdate(realm2, realmGet$minVersion, map2));
                    }
                    Table.nativeSetLink(nativePtr, schemaColumnInfo.minVersionIndex, j3, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, schemaColumnInfo.minVersionIndex, j3);
                }
                SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$schemaCallback();
                if (realmGet$schemaCallback != null) {
                    Long l4 = map2.get(realmGet$schemaCallback);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4664x5395ce9a.insertOrUpdate(realm2, realmGet$schemaCallback, map2));
                    }
                    Table.nativeSetLink(nativePtr, schemaColumnInfo.schemaCallbackIndex, j3, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, schemaColumnInfo.schemaCallbackIndex, j3);
                }
                long j8 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j8), schemaColumnInfo.dialogButtonsIndex);
                RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$dialogButtons();
                if (realmGet$dialogButtons == null || ((long) realmGet$dialogButtons.size()) != osList.size()) {
                    j4 = j8;
                    osList.removeAll();
                    if (realmGet$dialogButtons != null) {
                        Iterator<DialogButtons> it2 = realmGet$dialogButtons.iterator();
                        while (it2.hasNext()) {
                            DialogButtons next = it2.next();
                            Long l5 = map2.get(next);
                            if (l5 == null) {
                                l5 = Long.valueOf(C4658x6180a4a3.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size = realmGet$dialogButtons.size();
                    int i = 0;
                    while (i < size) {
                        DialogButtons dialogButtons = realmGet$dialogButtons.get(i);
                        Long l6 = map2.get(dialogButtons);
                        if (l6 == null) {
                            l6 = Long.valueOf(C4658x6180a4a3.insertOrUpdate(realm2, dialogButtons, map2));
                        }
                        osList.setRow((long) i, l6.longValue());
                        i++;
                        j8 = j8;
                    }
                    j4 = j8;
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionIdIndex, j4, realmGet$sectionId, false);
                } else {
                    j5 = j4;
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionIdIndex, j5, false);
                }
                String realmGet$sectionSlug = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionSlug();
                if (realmGet$sectionSlug != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionSlugIndex, j5, realmGet$sectionSlug, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionSlugIndex, j5, false);
                }
                String realmGet$sectionTitle = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$sectionTitle();
                if (realmGet$sectionTitle != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.sectionTitleIndex, j5, realmGet$sectionTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.sectionTitleIndex, j5, false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, schemaColumnInfo.urlIndex, j5, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.urlIndex, j5, false);
                }
                Boolean realmGet$isActive = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmGet$isActive();
                if (realmGet$isActive != null) {
                    Table.nativeSetBoolean(nativePtr, schemaColumnInfo.isActiveIndex, j5, realmGet$isActive.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, schemaColumnInfo.isActiveIndex, j5, false);
                }
                j6 = j2;
            }
        }
    }

    public static Schema createDetachedCopy(Schema schema, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Schema schema2;
        if (i > i2 || schema == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(schema);
        if (cacheData == null) {
            schema2 = new Schema();
            map.put(schema, new RealmObjectProxy.CacheData(i, schema2));
        } else if (i >= cacheData.minDepth) {
            return (Schema) cacheData.object;
        } else {
            cacheData.minDepth = i;
            schema2 = (Schema) cacheData.object;
        }
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema2;
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2 = schema;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$action(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$action());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$actionValue(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$actionValue());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$iconUrl(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$iconUrl());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$providerIconUrl(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$providerIconUrl());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$provider(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$provider());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$serviceId(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$serviceId());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$productState(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$productState());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$domRuId(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$domRuId());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$guard(C4660xccbea62f.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$guard(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$services(C4672xd5d6cbb2.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$services(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$alertMessage(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$alertMessage());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$minVersion(C4662xc0a23e3a.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$minVersion(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$schemaCallback(C4664x5395ce9a.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$schemaCallback(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$dialogButtons((RealmList<DialogButtons>) null);
        } else {
            RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$dialogButtons();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$dialogButtons(realmList);
            int size = realmGet$dialogButtons.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4658x6180a4a3.createDetachedCopy(realmGet$dialogButtons.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionId(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionId());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionSlug(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionSlug());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$sectionTitle(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionTitle());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$url(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface.realmSet$isActive(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$isActive());
        return schema2;
    }

    static Schema update(Realm realm, SchemaColumnInfo schemaColumnInfo, Schema schema, Schema schema2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        SchemaColumnInfo schemaColumnInfo2 = schemaColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface = schema;
        C4669x6b662644 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2 = schema2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Schema.class), schemaColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(schemaColumnInfo2.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(schemaColumnInfo2.actionIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$action());
        osObjectBuilder.addString(schemaColumnInfo2.actionValueIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$actionValue());
        osObjectBuilder.addString(schemaColumnInfo2.iconUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$iconUrl());
        osObjectBuilder.addString(schemaColumnInfo2.providerIconUrlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$providerIconUrl());
        osObjectBuilder.addString(schemaColumnInfo2.providerIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$provider());
        osObjectBuilder.addInteger(schemaColumnInfo2.serviceIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$serviceId());
        osObjectBuilder.addString(schemaColumnInfo2.productStateIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$productState());
        osObjectBuilder.addString(schemaColumnInfo2.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(schemaColumnInfo2.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$description());
        osObjectBuilder.addString(schemaColumnInfo2.domRuIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$domRuId());
        Guard realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$guard();
        if (realmGet$guard == null) {
            osObjectBuilder.addNull(schemaColumnInfo2.guardIndex);
        } else {
            Guard guard = (Guard) map2.get(realmGet$guard);
            if (guard != null) {
                osObjectBuilder.addObject(schemaColumnInfo2.guardIndex, guard);
            } else {
                osObjectBuilder.addObject(schemaColumnInfo2.guardIndex, C4660xccbea62f.copyOrUpdate(realm, (C4660xccbea62f.GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class), realmGet$guard, true, map, set));
            }
        }
        Services realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$services();
        if (realmGet$services == null) {
            osObjectBuilder.addNull(schemaColumnInfo2.servicesIndex);
        } else {
            Services services = (Services) map2.get(realmGet$services);
            if (services != null) {
                osObjectBuilder.addObject(schemaColumnInfo2.servicesIndex, services);
            } else {
                osObjectBuilder.addObject(schemaColumnInfo2.servicesIndex, C4672xd5d6cbb2.copyOrUpdate(realm, (C4672xd5d6cbb2.ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class), realmGet$services, true, map, set));
            }
        }
        osObjectBuilder.addString(schemaColumnInfo2.alertMessageIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$alertMessage());
        MinVersion realmGet$minVersion = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$minVersion();
        if (realmGet$minVersion == null) {
            osObjectBuilder.addNull(schemaColumnInfo2.minVersionIndex);
        } else {
            MinVersion minVersion = (MinVersion) map2.get(realmGet$minVersion);
            if (minVersion != null) {
                osObjectBuilder.addObject(schemaColumnInfo2.minVersionIndex, minVersion);
            } else {
                osObjectBuilder.addObject(schemaColumnInfo2.minVersionIndex, C4662xc0a23e3a.copyOrUpdate(realm, (C4662xc0a23e3a.MinVersionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MinVersion.class), realmGet$minVersion, true, map, set));
            }
        }
        SchemaCallback realmGet$schemaCallback = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$schemaCallback();
        if (realmGet$schemaCallback == null) {
            osObjectBuilder.addNull(schemaColumnInfo2.schemaCallbackIndex);
        } else {
            SchemaCallback schemaCallback = (SchemaCallback) map2.get(realmGet$schemaCallback);
            if (schemaCallback != null) {
                osObjectBuilder.addObject(schemaColumnInfo2.schemaCallbackIndex, schemaCallback);
            } else {
                osObjectBuilder.addObject(schemaColumnInfo2.schemaCallbackIndex, C4664x5395ce9a.copyOrUpdate(realm, (C4664x5395ce9a.SchemaCallbackColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaCallback.class), realmGet$schemaCallback, true, map, set));
            }
        }
        RealmList<DialogButtons> realmGet$dialogButtons = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$dialogButtons();
        if (realmGet$dialogButtons != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$dialogButtons.size(); i++) {
                DialogButtons dialogButtons = realmGet$dialogButtons.get(i);
                DialogButtons dialogButtons2 = (DialogButtons) map2.get(dialogButtons);
                if (dialogButtons2 != null) {
                    realmList.add(dialogButtons2);
                } else {
                    realmList.add(C4658x6180a4a3.copyOrUpdate(realm, (C4658x6180a4a3.DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class), dialogButtons, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemaColumnInfo2.dialogButtonsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(schemaColumnInfo2.dialogButtonsIndex, new RealmList());
        }
        osObjectBuilder.addString(schemaColumnInfo2.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionId());
        osObjectBuilder.addString(schemaColumnInfo2.sectionSlugIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionSlug());
        osObjectBuilder.addString(schemaColumnInfo2.sectionTitleIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$sectionTitle());
        osObjectBuilder.addString(schemaColumnInfo2.urlIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$url());
        osObjectBuilder.addBoolean(schemaColumnInfo2.isActiveIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxyinterface2.realmGet$isActive());
        osObjectBuilder.updateExistingObject();
        return schema;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v80, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v87, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v88, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r6)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Schema = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.Integer r1 = r6.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r1 = r6.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{action:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$action()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r6.realmGet$action()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{actionValue:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$actionValue()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r6.realmGet$actionValue()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{iconUrl:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$iconUrl()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r6.realmGet$iconUrl()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{providerIconUrl:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$providerIconUrl()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r6.realmGet$providerIconUrl()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{provider:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$provider()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r6.realmGet$provider()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{serviceId:"
            r0.append(r4)
            java.lang.Integer r4 = r6.realmGet$serviceId()
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r4 = r6.realmGet$serviceId()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{productState:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$productState()
            if (r4 == 0) goto L_0x00e5
            java.lang.String r4 = r6.realmGet$productState()
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{title:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$title()
            if (r4 == 0) goto L_0x0100
            java.lang.String r4 = r6.realmGet$title()
            goto L_0x0101
        L_0x0100:
            r4 = r2
        L_0x0101:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{description:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$description()
            if (r4 == 0) goto L_0x011b
            java.lang.String r4 = r6.realmGet$description()
            goto L_0x011c
        L_0x011b:
            r4 = r2
        L_0x011c:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{domRuId:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$domRuId()
            if (r4 == 0) goto L_0x0136
            java.lang.String r4 = r6.realmGet$domRuId()
            goto L_0x0137
        L_0x0136:
            r4 = r2
        L_0x0137:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{guard:"
            r0.append(r4)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard r4 = r6.realmGet$guard()
            if (r4 == 0) goto L_0x014f
            java.lang.String r4 = "Guard"
            goto L_0x0150
        L_0x014f:
            r4 = r2
        L_0x0150:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{services:"
            r0.append(r4)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Services r4 = r6.realmGet$services()
            if (r4 == 0) goto L_0x0168
            java.lang.String r4 = "Services"
            goto L_0x0169
        L_0x0168:
            r4 = r2
        L_0x0169:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{alertMessage:"
            r0.append(r4)
            java.lang.String r4 = r6.realmGet$alertMessage()
            if (r4 == 0) goto L_0x0183
            java.lang.String r4 = r6.realmGet$alertMessage()
            goto L_0x0184
        L_0x0183:
            r4 = r2
        L_0x0184:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{minVersion:"
            r0.append(r4)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.MinVersion r4 = r6.realmGet$minVersion()
            if (r4 == 0) goto L_0x019c
            java.lang.String r4 = "MinVersion"
            goto L_0x019d
        L_0x019c:
            r4 = r2
        L_0x019d:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{schemaCallback:"
            r0.append(r4)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaCallback r4 = r6.realmGet$schemaCallback()
            if (r4 == 0) goto L_0x01b5
            java.lang.String r4 = "SchemaCallback"
            goto L_0x01b6
        L_0x01b5:
            r4 = r2
        L_0x01b6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{dialogButtons:"
            r0.append(r4)
            java.lang.String r4 = "RealmList<DialogButtons>["
            r0.append(r4)
            io.realm.RealmList r4 = r6.realmGet$dialogButtons()
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r4 = "]"
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = "{sectionId:"
            r0.append(r5)
            java.lang.String r5 = r6.realmGet$sectionId()
            if (r5 == 0) goto L_0x01f1
            java.lang.String r5 = r6.realmGet$sectionId()
            goto L_0x01f2
        L_0x01f1:
            r5 = r2
        L_0x01f2:
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = "{sectionSlug:"
            r0.append(r5)
            java.lang.String r5 = r6.realmGet$sectionSlug()
            if (r5 == 0) goto L_0x020c
            java.lang.String r5 = r6.realmGet$sectionSlug()
            goto L_0x020d
        L_0x020c:
            r5 = r2
        L_0x020d:
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = "{sectionTitle:"
            r0.append(r5)
            java.lang.String r5 = r6.realmGet$sectionTitle()
            if (r5 == 0) goto L_0x0227
            java.lang.String r5 = r6.realmGet$sectionTitle()
            goto L_0x0228
        L_0x0227:
            r5 = r2
        L_0x0228:
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r5 = "{url:"
            r0.append(r5)
            java.lang.String r5 = r6.realmGet$url()
            if (r5 == 0) goto L_0x0242
            java.lang.String r5 = r6.realmGet$url()
            goto L_0x0243
        L_0x0242:
            r5 = r2
        L_0x0243:
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{isActive:"
            r0.append(r3)
            java.lang.Boolean r3 = r6.realmGet$isActive()
            if (r3 == 0) goto L_0x025c
            java.lang.Boolean r2 = r6.realmGet$isActive()
        L_0x025c:
            r0.append(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4668xcf375a75.toString():java.lang.String");
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
        C4668xcf375a75 ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy = (C4668xcf375a75) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_schemarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
