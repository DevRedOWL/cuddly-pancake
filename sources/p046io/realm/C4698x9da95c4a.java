package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceIndicator;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff;
import p046io.realm.BaseRealm;
import p046io.realm.C4696x936db447;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxy */
public class C4698x9da95c4a extends DomServiceTariff implements RealmObjectProxy, C4699x47c0640f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DomServiceTariffColumnInfo columnInfo;
    private RealmList<DomServiceIndicator> indicatorsRealmList;
    private ProxyState<DomServiceTariff> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DomServiceTariff";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceTariffRealmProxy$DomServiceTariffColumnInfo */
    static final class DomServiceTariffColumnInfo extends ColumnInfo {
        long connectedDtIndex;
        long description1Index;
        long description2Index;
        long imageIndex;
        long indicatorsIndex;
        long isAvailableIndex;
        long isCurrentIndex;
        long maxColumnIndexValue;
        long priceIndex;
        long tariffIdIndex;
        long titleIndex;
        long unitIndex;
        long urlFrameIndex;
        long urlIndex;

        DomServiceTariffColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.tariffIdIndex = addColumnDetails("tariffId", "tariffId", objectSchemaInfo);
            this.description1Index = addColumnDetails("description1", "description1", objectSchemaInfo);
            this.description2Index = addColumnDetails("description2", "description2", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.unitIndex = addColumnDetails("unit", "unit", objectSchemaInfo);
            this.isCurrentIndex = addColumnDetails("isCurrent", "isCurrent", objectSchemaInfo);
            this.isAvailableIndex = addColumnDetails("isAvailable", "isAvailable", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.urlFrameIndex = addColumnDetails("urlFrame", "urlFrame", objectSchemaInfo);
            this.indicatorsIndex = addColumnDetails("indicators", "indicators", objectSchemaInfo);
            this.connectedDtIndex = addColumnDetails("connectedDt", "connectedDt", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DomServiceTariffColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DomServiceTariffColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DomServiceTariffColumnInfo domServiceTariffColumnInfo = (DomServiceTariffColumnInfo) columnInfo;
            DomServiceTariffColumnInfo domServiceTariffColumnInfo2 = (DomServiceTariffColumnInfo) columnInfo2;
            domServiceTariffColumnInfo2.titleIndex = domServiceTariffColumnInfo.titleIndex;
            domServiceTariffColumnInfo2.tariffIdIndex = domServiceTariffColumnInfo.tariffIdIndex;
            domServiceTariffColumnInfo2.description1Index = domServiceTariffColumnInfo.description1Index;
            domServiceTariffColumnInfo2.description2Index = domServiceTariffColumnInfo.description2Index;
            domServiceTariffColumnInfo2.imageIndex = domServiceTariffColumnInfo.imageIndex;
            domServiceTariffColumnInfo2.priceIndex = domServiceTariffColumnInfo.priceIndex;
            domServiceTariffColumnInfo2.unitIndex = domServiceTariffColumnInfo.unitIndex;
            domServiceTariffColumnInfo2.isCurrentIndex = domServiceTariffColumnInfo.isCurrentIndex;
            domServiceTariffColumnInfo2.isAvailableIndex = domServiceTariffColumnInfo.isAvailableIndex;
            domServiceTariffColumnInfo2.urlIndex = domServiceTariffColumnInfo.urlIndex;
            domServiceTariffColumnInfo2.urlFrameIndex = domServiceTariffColumnInfo.urlFrameIndex;
            domServiceTariffColumnInfo2.indicatorsIndex = domServiceTariffColumnInfo.indicatorsIndex;
            domServiceTariffColumnInfo2.connectedDtIndex = domServiceTariffColumnInfo.connectedDtIndex;
            domServiceTariffColumnInfo2.maxColumnIndexValue = domServiceTariffColumnInfo.maxColumnIndexValue;
        }
    }

    C4698x9da95c4a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DomServiceTariffColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$tariffId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tariffIdIndex);
    }

    public void realmSet$tariffId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tariffIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tariffIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tariffIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tariffIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$description1() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.description1Index);
    }

    public void realmSet$description1(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.description1Index);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.description1Index, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.description1Index, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.description1Index, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$description2() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.description2Index);
    }

    public void realmSet$description2(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.description2Index);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.description2Index, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.description2Index, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.description2Index, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imageIndex);
    }

    public void realmSet$image(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$price() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.priceIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.priceIndex));
    }

    public void realmSet$price(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.priceIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.priceIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.priceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.priceIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$unit() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.unitIndex);
    }

    public void realmSet$unit(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.unitIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.unitIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.unitIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.unitIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$isCurrent() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isCurrentIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isCurrentIndex));
    }

    public void realmSet$isCurrent(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isCurrentIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isCurrentIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isCurrentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isCurrentIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$isAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isAvailableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isAvailableIndex));
    }

    public void realmSet$isAvailable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isAvailableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isAvailableIndex, row$realm.getIndex(), bool.booleanValue(), true);
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

    public String realmGet$urlFrame() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlFrameIndex);
    }

    public void realmSet$urlFrame(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlFrameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlFrameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlFrameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlFrameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<DomServiceIndicator> realmGet$indicators() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<DomServiceIndicator> realmList = this.indicatorsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.indicatorsRealmList = new RealmList<>(DomServiceIndicator.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.indicatorsIndex), this.proxyState.getRealm$realm());
        return this.indicatorsRealmList;
    }

    public void realmSet$indicators(RealmList<DomServiceIndicator> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("indicators")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<DomServiceIndicator> realmList2 = new RealmList<>();
                Iterator<DomServiceIndicator> it = realmList.iterator();
                while (it.hasNext()) {
                    DomServiceIndicator next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.indicatorsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    DomServiceIndicator domServiceIndicator = realmList.get(i);
                    this.proxyState.checkValidObject(domServiceIndicator);
                    modelList.addRow(((RealmObjectProxy) domServiceIndicator).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            DomServiceIndicator domServiceIndicator2 = realmList.get(i);
            this.proxyState.checkValidObject(domServiceIndicator2);
            modelList.setRow((long) i, ((RealmObjectProxy) domServiceIndicator2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Integer realmGet$connectedDt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.connectedDtIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.connectedDtIndex));
    }

    public void realmSet$connectedDt(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.connectedDtIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.connectedDtIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.connectedDtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.connectedDtIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 13, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("tariffId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description1", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description2", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("image", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("price", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("unit", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isCurrent", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("isAvailable", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("urlFrame", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("indicators", RealmFieldType.LIST, C4696x936db447.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("connectedDt", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DomServiceTariffColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DomServiceTariffColumnInfo(osSchemaInfo);
    }

    public static DomServiceTariff createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("indicators")) {
            arrayList.add("indicators");
        }
        DomServiceTariff domServiceTariff = (DomServiceTariff) realm.createObjectInternal(DomServiceTariff.class, true, arrayList);
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("tariffId")) {
            if (jSONObject.isNull("tariffId")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$tariffId((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$tariffId(jSONObject.getString("tariffId"));
            }
        }
        if (jSONObject.has("description1")) {
            if (jSONObject.isNull("description1")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description1((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description1(jSONObject.getString("description1"));
            }
        }
        if (jSONObject.has("description2")) {
            if (jSONObject.isNull("description2")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description2((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description2(jSONObject.getString("description2"));
            }
        }
        if (jSONObject.has("image")) {
            if (jSONObject.isNull("image")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$image((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$image(jSONObject.getString("image"));
            }
        }
        if (jSONObject.has("price")) {
            if (jSONObject.isNull("price")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$price((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$price(Integer.valueOf(jSONObject.getInt("price")));
            }
        }
        if (jSONObject.has("unit")) {
            if (jSONObject.isNull("unit")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$unit((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$unit(jSONObject.getString("unit"));
            }
        }
        if (jSONObject.has("isCurrent")) {
            if (jSONObject.isNull("isCurrent")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isCurrent((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isCurrent(Boolean.valueOf(jSONObject.getBoolean("isCurrent")));
            }
        }
        if (jSONObject.has("isAvailable")) {
            if (jSONObject.isNull("isAvailable")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isAvailable((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isAvailable(Boolean.valueOf(jSONObject.getBoolean("isAvailable")));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("urlFrame")) {
            if (jSONObject.isNull("urlFrame")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$urlFrame((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$urlFrame(jSONObject.getString("urlFrame"));
            }
        }
        if (jSONObject.has("indicators")) {
            if (jSONObject.isNull("indicators")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$indicators((RealmList<DomServiceIndicator>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("indicators");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators().add(C4696x936db447.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("connectedDt")) {
            if (jSONObject.isNull("connectedDt")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$connectedDt((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$connectedDt(Integer.valueOf(jSONObject.getInt("connectedDt")));
            }
        }
        return domServiceTariff;
    }

    public static DomServiceTariff createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DomServiceTariff domServiceTariff = new DomServiceTariff();
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("tariffId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$tariffId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$tariffId((String) null);
                }
            } else if (nextName.equals("description1")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description1(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description1((String) null);
                }
            } else if (nextName.equals("description2")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description2(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description2((String) null);
                }
            } else if (nextName.equals("image")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$image(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$image((String) null);
                }
            } else if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$price(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$price((Integer) null);
                }
            } else if (nextName.equals("unit")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$unit(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$unit((String) null);
                }
            } else if (nextName.equals("isCurrent")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isCurrent(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isCurrent((Boolean) null);
                }
            } else if (nextName.equals("isAvailable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isAvailable(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isAvailable((Boolean) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$url((String) null);
                }
            } else if (nextName.equals("urlFrame")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$urlFrame(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$urlFrame((String) null);
                }
            } else if (nextName.equals("indicators")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$indicators((RealmList<DomServiceIndicator>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$indicators(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators().add(C4696x936db447.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("connectedDt")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$connectedDt(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$connectedDt((Integer) null);
            }
        }
        jsonReader.endObject();
        return (DomServiceTariff) realm.copyToRealm(domServiceTariff, new ImportFlag[0]);
    }

    private static C4698x9da95c4a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class), false, Collections.emptyList());
        C4698x9da95c4a ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy = new C4698x9da95c4a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy;
    }

    public static DomServiceTariff copyOrUpdate(Realm realm, DomServiceTariffColumnInfo domServiceTariffColumnInfo, DomServiceTariff domServiceTariff, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (domServiceTariff instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceTariff;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return domServiceTariff;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(domServiceTariff);
        if (realmObjectProxy2 != null) {
            return (DomServiceTariff) realmObjectProxy2;
        }
        return copy(realm, domServiceTariffColumnInfo, domServiceTariff, z, map, set);
    }

    public static DomServiceTariff copy(Realm realm, DomServiceTariffColumnInfo domServiceTariffColumnInfo, DomServiceTariff domServiceTariff, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(domServiceTariff);
        if (realmObjectProxy != null) {
            return (DomServiceTariff) realmObjectProxy;
        }
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DomServiceTariff.class), domServiceTariffColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(domServiceTariffColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(domServiceTariffColumnInfo.tariffIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$tariffId());
        osObjectBuilder.addString(domServiceTariffColumnInfo.description1Index, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description1());
        osObjectBuilder.addString(domServiceTariffColumnInfo.description2Index, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description2());
        osObjectBuilder.addString(domServiceTariffColumnInfo.imageIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$image());
        osObjectBuilder.addInteger(domServiceTariffColumnInfo.priceIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$price());
        osObjectBuilder.addString(domServiceTariffColumnInfo.unitIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$unit());
        osObjectBuilder.addBoolean(domServiceTariffColumnInfo.isCurrentIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isCurrent());
        osObjectBuilder.addBoolean(domServiceTariffColumnInfo.isAvailableIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isAvailable());
        osObjectBuilder.addString(domServiceTariffColumnInfo.urlIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$url());
        osObjectBuilder.addString(domServiceTariffColumnInfo.urlFrameIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$urlFrame());
        osObjectBuilder.addInteger(domServiceTariffColumnInfo.connectedDtIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$connectedDt());
        C4698x9da95c4a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(domServiceTariff, newProxyInstance);
        RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators();
        if (realmGet$indicators != null) {
            RealmList<DomServiceIndicator> realmGet$indicators2 = newProxyInstance.realmGet$indicators();
            realmGet$indicators2.clear();
            for (int i = 0; i < realmGet$indicators.size(); i++) {
                DomServiceIndicator domServiceIndicator = realmGet$indicators.get(i);
                DomServiceIndicator domServiceIndicator2 = (DomServiceIndicator) map.get(domServiceIndicator);
                if (domServiceIndicator2 != null) {
                    realmGet$indicators2.add(domServiceIndicator2);
                } else {
                    realmGet$indicators2.add(C4696x936db447.copyOrUpdate(realm, (C4696x936db447.DomServiceIndicatorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceIndicator.class), domServiceIndicator, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, DomServiceTariff domServiceTariff, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        DomServiceTariff domServiceTariff2 = domServiceTariff;
        Map<RealmModel, Long> map2 = map;
        if (domServiceTariff2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceTariff2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(DomServiceTariff.class);
        long nativePtr = table.getNativePtr();
        DomServiceTariffColumnInfo domServiceTariffColumnInfo = (DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class);
        long createRow = OsObject.createRow(table);
        map2.put(domServiceTariff2, Long.valueOf(createRow));
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff2;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            j = createRow;
        }
        String realmGet$tariffId = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$tariffId();
        if (realmGet$tariffId != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, realmGet$tariffId, false);
        }
        String realmGet$description1 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description1();
        if (realmGet$description1 != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description1Index, j, realmGet$description1, false);
        }
        String realmGet$description2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description2();
        if (realmGet$description2 != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description2Index, j, realmGet$description2, false);
        }
        String realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.imageIndex, j, realmGet$image, false);
        }
        Integer realmGet$price = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.priceIndex, j, realmGet$price.longValue(), false);
        }
        String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.unitIndex, j, realmGet$unit, false);
        }
        Boolean realmGet$isCurrent = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isCurrent();
        if (realmGet$isCurrent != null) {
            Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, realmGet$isCurrent.booleanValue(), false);
        }
        Boolean realmGet$isAvailable = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isAvailable();
        if (realmGet$isAvailable != null) {
            Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, realmGet$isAvailable.booleanValue(), false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlIndex, j, realmGet$url, false);
        }
        String realmGet$urlFrame = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$urlFrame();
        if (realmGet$urlFrame != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, realmGet$urlFrame, false);
        }
        RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators();
        if (realmGet$indicators != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), domServiceTariffColumnInfo.indicatorsIndex);
            Iterator<DomServiceIndicator> it = realmGet$indicators.iterator();
            while (it.hasNext()) {
                DomServiceIndicator next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(C4696x936db447.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j2 = j;
        }
        Integer realmGet$connectedDt = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$connectedDt();
        if (realmGet$connectedDt == null) {
            return j2;
        }
        long j3 = j2;
        Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.connectedDtIndex, j2, realmGet$connectedDt.longValue(), false);
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(DomServiceTariff.class);
        long nativePtr = table.getNativePtr();
        DomServiceTariffColumnInfo domServiceTariffColumnInfo = (DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class);
        while (it.hasNext()) {
            DomServiceTariff domServiceTariff = (DomServiceTariff) it.next();
            if (!map2.containsKey(domServiceTariff)) {
                if (domServiceTariff instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceTariff;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceTariff, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceTariff, Long.valueOf(createRow));
                C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    j = createRow;
                }
                String realmGet$tariffId = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$tariffId();
                if (realmGet$tariffId != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, realmGet$tariffId, false);
                }
                String realmGet$description1 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description1();
                if (realmGet$description1 != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description1Index, j, realmGet$description1, false);
                }
                String realmGet$description2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description2();
                if (realmGet$description2 != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description2Index, j, realmGet$description2, false);
                }
                String realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.imageIndex, j, realmGet$image, false);
                }
                Integer realmGet$price = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.priceIndex, j, realmGet$price.longValue(), false);
                }
                String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.unitIndex, j, realmGet$unit, false);
                }
                Boolean realmGet$isCurrent = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isCurrent();
                if (realmGet$isCurrent != null) {
                    Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, realmGet$isCurrent.booleanValue(), false);
                }
                Boolean realmGet$isAvailable = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isAvailable();
                if (realmGet$isAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, realmGet$isAvailable.booleanValue(), false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlIndex, j, realmGet$url, false);
                }
                String realmGet$urlFrame = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$urlFrame();
                if (realmGet$urlFrame != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, realmGet$urlFrame, false);
                }
                RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators();
                if (realmGet$indicators != null) {
                    j2 = j;
                    OsList osList = new OsList(table.getUncheckedRow(j2), domServiceTariffColumnInfo.indicatorsIndex);
                    Iterator<DomServiceIndicator> it2 = realmGet$indicators.iterator();
                    while (it2.hasNext()) {
                        DomServiceIndicator next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4696x936db447.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j2 = j;
                }
                Integer realmGet$connectedDt = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$connectedDt();
                if (realmGet$connectedDt != null) {
                    Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.connectedDtIndex, j2, realmGet$connectedDt.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DomServiceTariff domServiceTariff, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        DomServiceTariff domServiceTariff2 = domServiceTariff;
        Map<RealmModel, Long> map2 = map;
        if (domServiceTariff2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceTariff2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(DomServiceTariff.class);
        long nativePtr = table.getNativePtr();
        DomServiceTariffColumnInfo domServiceTariffColumnInfo = (DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class);
        long createRow = OsObject.createRow(table);
        map2.put(domServiceTariff2, Long.valueOf(createRow));
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff2;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.titleIndex, j, false);
        }
        String realmGet$tariffId = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$tariffId();
        if (realmGet$tariffId != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, realmGet$tariffId, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, false);
        }
        String realmGet$description1 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description1();
        if (realmGet$description1 != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description1Index, j, realmGet$description1, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.description1Index, j, false);
        }
        String realmGet$description2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description2();
        if (realmGet$description2 != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description2Index, j, realmGet$description2, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.description2Index, j, false);
        }
        String realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.imageIndex, j, realmGet$image, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.imageIndex, j, false);
        }
        Integer realmGet$price = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.priceIndex, j, realmGet$price.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.priceIndex, j, false);
        }
        String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$unit();
        if (realmGet$unit != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.unitIndex, j, realmGet$unit, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.unitIndex, j, false);
        }
        Boolean realmGet$isCurrent = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isCurrent();
        if (realmGet$isCurrent != null) {
            Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, realmGet$isCurrent.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, false);
        }
        Boolean realmGet$isAvailable = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isAvailable();
        if (realmGet$isAvailable != null) {
            Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, realmGet$isAvailable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlIndex, j, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.urlIndex, j, false);
        }
        String realmGet$urlFrame = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$urlFrame();
        if (realmGet$urlFrame != null) {
            Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, realmGet$urlFrame, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, false);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), domServiceTariffColumnInfo.indicatorsIndex);
        RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators();
        if (realmGet$indicators == null || ((long) realmGet$indicators.size()) != osList.size()) {
            j2 = j3;
            osList.removeAll();
            if (realmGet$indicators != null) {
                Iterator<DomServiceIndicator> it = realmGet$indicators.iterator();
                while (it.hasNext()) {
                    DomServiceIndicator next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4696x936db447.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$indicators.size();
            int i = 0;
            while (i < size) {
                DomServiceIndicator domServiceIndicator = realmGet$indicators.get(i);
                Long l2 = map2.get(domServiceIndicator);
                if (l2 == null) {
                    l2 = Long.valueOf(C4696x936db447.insertOrUpdate(realm2, domServiceIndicator, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
                j3 = j3;
            }
            j2 = j3;
        }
        Integer realmGet$connectedDt = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$connectedDt();
        if (realmGet$connectedDt != null) {
            long j4 = domServiceTariffColumnInfo.connectedDtIndex;
            long longValue = realmGet$connectedDt.longValue();
            long j5 = j2;
            Table.nativeSetLong(nativePtr, j4, j2, longValue, false);
            return j5;
        }
        long j6 = j2;
        Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.connectedDtIndex, j6, false);
        return j6;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(DomServiceTariff.class);
        long nativePtr = table.getNativePtr();
        DomServiceTariffColumnInfo domServiceTariffColumnInfo = (DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class);
        while (it.hasNext()) {
            DomServiceTariff domServiceTariff = (DomServiceTariff) it.next();
            if (!map2.containsKey(domServiceTariff)) {
                if (domServiceTariff instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceTariff;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceTariff, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceTariff, Long.valueOf(createRow));
                C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.titleIndex, j, false);
                }
                String realmGet$tariffId = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$tariffId();
                if (realmGet$tariffId != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, realmGet$tariffId, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.tariffIdIndex, j, false);
                }
                String realmGet$description1 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description1();
                if (realmGet$description1 != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description1Index, j, realmGet$description1, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.description1Index, j, false);
                }
                String realmGet$description2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$description2();
                if (realmGet$description2 != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.description2Index, j, realmGet$description2, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.description2Index, j, false);
                }
                String realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.imageIndex, j, realmGet$image, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.imageIndex, j, false);
                }
                Integer realmGet$price = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.priceIndex, j, realmGet$price.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.priceIndex, j, false);
                }
                String realmGet$unit = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$unit();
                if (realmGet$unit != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.unitIndex, j, realmGet$unit, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.unitIndex, j, false);
                }
                Boolean realmGet$isCurrent = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isCurrent();
                if (realmGet$isCurrent != null) {
                    Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, realmGet$isCurrent.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.isCurrentIndex, j, false);
                }
                Boolean realmGet$isAvailable = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$isAvailable();
                if (realmGet$isAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, realmGet$isAvailable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.isAvailableIndex, j, false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlIndex, j, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.urlIndex, j, false);
                }
                String realmGet$urlFrame = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$urlFrame();
                if (realmGet$urlFrame != null) {
                    Table.nativeSetString(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, realmGet$urlFrame, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.urlFrameIndex, j, false);
                }
                long j3 = j;
                OsList osList = new OsList(table.getUncheckedRow(j3), domServiceTariffColumnInfo.indicatorsIndex);
                RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$indicators();
                if (realmGet$indicators == null || ((long) realmGet$indicators.size()) != osList.size()) {
                    j2 = j3;
                    osList.removeAll();
                    if (realmGet$indicators != null) {
                        Iterator<DomServiceIndicator> it2 = realmGet$indicators.iterator();
                        while (it2.hasNext()) {
                            DomServiceIndicator next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4696x936db447.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$indicators.size();
                    int i = 0;
                    while (i < size) {
                        DomServiceIndicator domServiceIndicator = realmGet$indicators.get(i);
                        Long l2 = map2.get(domServiceIndicator);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4696x936db447.insertOrUpdate(realm2, domServiceIndicator, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j3 = j3;
                    }
                    j2 = j3;
                }
                Integer realmGet$connectedDt = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmGet$connectedDt();
                if (realmGet$connectedDt != null) {
                    Table.nativeSetLong(nativePtr, domServiceTariffColumnInfo.connectedDtIndex, j2, realmGet$connectedDt.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceTariffColumnInfo.connectedDtIndex, j2, false);
                }
            }
        }
    }

    public static DomServiceTariff createDetachedCopy(DomServiceTariff domServiceTariff, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DomServiceTariff domServiceTariff2;
        if (i > i2 || domServiceTariff == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(domServiceTariff);
        if (cacheData == null) {
            domServiceTariff2 = new DomServiceTariff();
            map.put(domServiceTariff, new RealmObjectProxy.CacheData(i, domServiceTariff2));
        } else if (i >= cacheData.minDepth) {
            return (DomServiceTariff) cacheData.object;
        } else {
            cacheData.minDepth = i;
            domServiceTariff2 = (DomServiceTariff) cacheData.object;
        }
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface = domServiceTariff2;
        C4699x47c0640f ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2 = domServiceTariff;
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$tariffId(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$tariffId());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description1(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$description1());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$description2(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$description2());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$image(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$image());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$price(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$unit(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$unit());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isCurrent(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$isCurrent());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$isAvailable(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$isAvailable());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$url(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$urlFrame(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$urlFrame());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$indicators((RealmList<DomServiceIndicator>) null);
        } else {
            RealmList<DomServiceIndicator> realmGet$indicators = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$indicators();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$indicators(realmList);
            int i3 = i + 1;
            int size = realmGet$indicators.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4696x936db447.createDetachedCopy(realmGet$indicators.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface.realmSet$connectedDt(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxyinterface2.realmGet$connectedDt());
        return domServiceTariff2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DomServiceTariff = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{title:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$title()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$title()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{tariffId:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$tariffId()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r5.realmGet$tariffId()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{description1:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$description1()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$description1()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{description2:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$description2()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$description2()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{image:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$image()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r5.realmGet$image()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{price:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$price()
            if (r4 == 0) goto L_0x00af
            java.lang.Integer r4 = r5.realmGet$price()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{unit:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$unit()
            if (r4 == 0) goto L_0x00ca
            java.lang.String r4 = r5.realmGet$unit()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{isCurrent:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$isCurrent()
            if (r4 == 0) goto L_0x00e5
            java.lang.Boolean r4 = r5.realmGet$isCurrent()
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{isAvailable:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$isAvailable()
            if (r4 == 0) goto L_0x0100
            java.lang.Boolean r4 = r5.realmGet$isAvailable()
            goto L_0x0101
        L_0x0100:
            r4 = r2
        L_0x0101:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{url:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$url()
            if (r4 == 0) goto L_0x011b
            java.lang.String r4 = r5.realmGet$url()
            goto L_0x011c
        L_0x011b:
            r4 = r2
        L_0x011c:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{urlFrame:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$urlFrame()
            if (r4 == 0) goto L_0x0136
            java.lang.String r4 = r5.realmGet$urlFrame()
            goto L_0x0137
        L_0x0136:
            r4 = r2
        L_0x0137:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{indicators:"
            r0.append(r4)
            java.lang.String r4 = "RealmList<DomServiceIndicator>["
            r0.append(r4)
            io.realm.RealmList r4 = r5.realmGet$indicators()
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r4 = "]"
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{connectedDt:"
            r0.append(r3)
            java.lang.Integer r3 = r5.realmGet$connectedDt()
            if (r3 == 0) goto L_0x0171
            java.lang.Integer r2 = r5.realmGet$connectedDt()
        L_0x0171:
            r0.append(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4698x9da95c4a.toString():java.lang.String");
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
        C4698x9da95c4a ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy = (C4698x9da95c4a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicetariffrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
