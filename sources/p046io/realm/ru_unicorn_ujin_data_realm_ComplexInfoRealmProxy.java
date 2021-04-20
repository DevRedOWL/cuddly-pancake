package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Action;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.Mortrage;
import p035ru.unicorn.ujin.data.realm.Price;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p046io.realm.BaseRealm;
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
import p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy */
public class ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy extends ComplexInfo implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ComplexInfoColumnInfo columnInfo;
    private RealmList<byte[]> imageListBytesRealmList;
    private RealmList<String> imageListRealmList;
    private RealmList<Mortrage> mortrageListRealmList;
    private RealmList<Price> priceListRealmList;
    private ProxyState<ComplexInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ComplexInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy$ComplexInfoColumnInfo */
    static final class ComplexInfoColumnInfo extends ColumnInfo {
        long actionIndex;
        long buildProgressIndex;
        long dateEndIndex;
        long deliveryDateIndex;
        long demoFlatUidIndex;
        long descriptionIndex;
        long descriptionMoreIndex;
        long idIndex;
        long imageListBytesIndex;
        long imageListIndex;
        long maxColumnIndexValue;
        long mortrageListIndex;
        long presentationLinkIndex;
        long priceListIndex;
        long schemaLinkIndex;
        long showDemoIndex;
        long siteIndex;
        long titleIndex;
        long uidIndex;

        ComplexInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(18);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", "uid", objectSchemaInfo);
            this.imageListIndex = addColumnDetails("imageList", "imageList", objectSchemaInfo);
            this.imageListBytesIndex = addColumnDetails("imageListBytes", "imageListBytes", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.deliveryDateIndex = addColumnDetails("deliveryDate", "deliveryDate", objectSchemaInfo);
            this.priceListIndex = addColumnDetails("priceList", "priceList", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.descriptionMoreIndex = addColumnDetails("descriptionMore", "descriptionMore", objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.siteIndex = addColumnDetails("site", "site", objectSchemaInfo);
            this.buildProgressIndex = addColumnDetails("buildProgress", "buildProgress", objectSchemaInfo);
            this.mortrageListIndex = addColumnDetails("mortrageList", "mortrageList", objectSchemaInfo);
            this.actionIndex = addColumnDetails("action", "action", objectSchemaInfo);
            this.showDemoIndex = addColumnDetails("showDemo", "showDemo", objectSchemaInfo);
            this.demoFlatUidIndex = addColumnDetails("demoFlatUid", "demoFlatUid", objectSchemaInfo);
            this.presentationLinkIndex = addColumnDetails("presentationLink", "presentationLink", objectSchemaInfo);
            this.schemaLinkIndex = addColumnDetails("schemaLink", "schemaLink", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ComplexInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ComplexInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ComplexInfoColumnInfo complexInfoColumnInfo = (ComplexInfoColumnInfo) columnInfo;
            ComplexInfoColumnInfo complexInfoColumnInfo2 = (ComplexInfoColumnInfo) columnInfo2;
            complexInfoColumnInfo2.idIndex = complexInfoColumnInfo.idIndex;
            complexInfoColumnInfo2.uidIndex = complexInfoColumnInfo.uidIndex;
            complexInfoColumnInfo2.imageListIndex = complexInfoColumnInfo.imageListIndex;
            complexInfoColumnInfo2.imageListBytesIndex = complexInfoColumnInfo.imageListBytesIndex;
            complexInfoColumnInfo2.titleIndex = complexInfoColumnInfo.titleIndex;
            complexInfoColumnInfo2.deliveryDateIndex = complexInfoColumnInfo.deliveryDateIndex;
            complexInfoColumnInfo2.priceListIndex = complexInfoColumnInfo.priceListIndex;
            complexInfoColumnInfo2.descriptionIndex = complexInfoColumnInfo.descriptionIndex;
            complexInfoColumnInfo2.descriptionMoreIndex = complexInfoColumnInfo.descriptionMoreIndex;
            complexInfoColumnInfo2.dateEndIndex = complexInfoColumnInfo.dateEndIndex;
            complexInfoColumnInfo2.siteIndex = complexInfoColumnInfo.siteIndex;
            complexInfoColumnInfo2.buildProgressIndex = complexInfoColumnInfo.buildProgressIndex;
            complexInfoColumnInfo2.mortrageListIndex = complexInfoColumnInfo.mortrageListIndex;
            complexInfoColumnInfo2.actionIndex = complexInfoColumnInfo.actionIndex;
            complexInfoColumnInfo2.showDemoIndex = complexInfoColumnInfo.showDemoIndex;
            complexInfoColumnInfo2.demoFlatUidIndex = complexInfoColumnInfo.demoFlatUidIndex;
            complexInfoColumnInfo2.presentationLinkIndex = complexInfoColumnInfo.presentationLinkIndex;
            complexInfoColumnInfo2.schemaLinkIndex = complexInfoColumnInfo.schemaLinkIndex;
            complexInfoColumnInfo2.maxColumnIndexValue = complexInfoColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ComplexInfoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$uid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uidIndex);
    }

    public void realmSet$uid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.uidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.uidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.uidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.uidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$imageList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.imageListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imageListRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.imageListRealmList;
    }

    public void realmSet$imageList(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imageList"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    public RealmList<byte[]> realmGet$imageListBytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<byte[]> realmList = this.imageListBytesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imageListBytesRealmList = new RealmList<>(byte[].class, this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListBytesIndex, RealmFieldType.BINARY_LIST), this.proxyState.getRealm$realm());
        return this.imageListBytesRealmList;
    }

    public void realmSet$imageListBytes(RealmList<byte[]> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imageListBytes"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListBytesIndex, RealmFieldType.BINARY_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<byte[]> it = realmList.iterator();
                while (it.hasNext()) {
                    byte[] next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addBinary(next);
                    }
                }
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

    public String realmGet$deliveryDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deliveryDateIndex);
    }

    public void realmSet$deliveryDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deliveryDateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deliveryDateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deliveryDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deliveryDateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<Price> realmGet$priceList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Price> realmList = this.priceListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.priceListRealmList = new RealmList<>(Price.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.priceListIndex), this.proxyState.getRealm$realm());
        return this.priceListRealmList;
    }

    public void realmSet$priceList(RealmList<Price> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("priceList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Price> realmList2 = new RealmList<>();
                Iterator<Price> it = realmList.iterator();
                while (it.hasNext()) {
                    Price next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.priceListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Price price = realmList.get(i);
                    this.proxyState.checkValidObject(price);
                    modelList.addRow(((RealmObjectProxy) price).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Price price2 = realmList.get(i);
            this.proxyState.checkValidObject(price2);
            modelList.setRow((long) i, ((RealmObjectProxy) price2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
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

    public String realmGet$descriptionMore() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionMoreIndex);
    }

    public void realmSet$descriptionMore(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionMoreIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionMoreIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionMoreIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionMoreIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$dateEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateEndIndex);
    }

    public void realmSet$dateEnd(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateEndIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateEndIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateEndIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateEndIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$site() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.siteIndex);
    }

    public void realmSet$site(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.siteIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.siteIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.siteIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.siteIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Double realmGet$buildProgress() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.buildProgressIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.buildProgressIndex));
    }

    public void realmSet$buildProgress(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buildProgressIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.buildProgressIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.buildProgressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.buildProgressIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public RealmList<Mortrage> realmGet$mortrageList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Mortrage> realmList = this.mortrageListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.mortrageListRealmList = new RealmList<>(Mortrage.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.mortrageListIndex), this.proxyState.getRealm$realm());
        return this.mortrageListRealmList;
    }

    public void realmSet$mortrageList(RealmList<Mortrage> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("mortrageList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Mortrage> realmList2 = new RealmList<>();
                Iterator<Mortrage> it = realmList.iterator();
                while (it.hasNext()) {
                    Mortrage next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.mortrageListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Mortrage mortrage = realmList.get(i);
                    this.proxyState.checkValidObject(mortrage);
                    modelList.addRow(((RealmObjectProxy) mortrage).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Mortrage mortrage2 = realmList.get(i);
            this.proxyState.checkValidObject(mortrage2);
            modelList.setRow((long) i, ((RealmObjectProxy) mortrage2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Action realmGet$action() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.actionIndex)) {
            return null;
        }
        return (Action) this.proxyState.getRealm$realm().get(Action.class, this.proxyState.getRow$realm().getLink(this.columnInfo.actionIndex), false, Collections.emptyList());
    }

    public void realmSet$action(Action action) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (action == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.actionIndex);
                return;
            }
            this.proxyState.checkValidObject(action);
            this.proxyState.getRow$realm().setLink(this.columnInfo.actionIndex, ((RealmObjectProxy) action).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("action")) {
            if (action != null && !RealmObject.isManaged(action)) {
                action = (Action) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(action, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (action == null) {
                row$realm.nullifyLink(this.columnInfo.actionIndex);
                return;
            }
            this.proxyState.checkValidObject(action);
            row$realm.getTable().setLink(this.columnInfo.actionIndex, row$realm.getIndex(), ((RealmObjectProxy) action).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$showDemo() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.showDemoIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.showDemoIndex));
    }

    public void realmSet$showDemo(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.showDemoIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.showDemoIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.showDemoIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.showDemoIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public String realmGet$demoFlatUid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.demoFlatUidIndex);
    }

    public void realmSet$demoFlatUid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.demoFlatUidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.demoFlatUidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.demoFlatUidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.demoFlatUidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$presentationLink() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.presentationLinkIndex);
    }

    public void realmSet$presentationLink(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.presentationLinkIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.presentationLinkIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.presentationLinkIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.presentationLinkIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$schemaLink() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.schemaLinkIndex);
    }

    public void realmSet$schemaLink(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.schemaLinkIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.schemaLinkIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.schemaLinkIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.schemaLinkIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 18, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("uid", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("imageList", RealmFieldType.STRING_LIST, false);
        builder.addPersistedValueListProperty("imageListBytes", RealmFieldType.BINARY_LIST, false);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("title", RealmFieldType.STRING, false, false, true);
        builder3.addPersistedProperty("deliveryDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("priceList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_PriceRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder4 = builder;
        builder4.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("descriptionMore", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("site", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("buildProgress", RealmFieldType.DOUBLE, false, false, false);
        builder.addPersistedLinkProperty("mortrageList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_MortrageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("action", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_ActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder5 = builder;
        builder5.addPersistedProperty("showDemo", RealmFieldType.BOOLEAN, false, false, false);
        builder5.addPersistedProperty("demoFlatUid", RealmFieldType.STRING, false, false, false);
        builder5.addPersistedProperty("presentationLink", RealmFieldType.STRING, false, false, false);
        builder5.addPersistedProperty("schemaLink", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ComplexInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ComplexInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.ComplexInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r3 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r5 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy$ComplexInfoColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.ComplexInfoColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            java.lang.String r6 = r14.getString(r1)
            long r4 = r3.findFirstString(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r4 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "imageListBytes"
            java.lang.String r5 = "imageList"
            java.lang.String r6 = "action"
            java.lang.String r7 = "mortrageList"
            java.lang.String r8 = "priceList"
            if (r3 != 0) goto L_0x00cd
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x007c
            r0.add(r5)
        L_0x007c:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0085
            r0.add(r4)
        L_0x0085:
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x008e
            r0.add(r8)
        L_0x008e:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x0097
            r0.add(r7)
        L_0x0097:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x00a0
            r0.add(r6)
        L_0x00a0:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00c5
            boolean r3 = r14.isNull(r1)
            r9 = 1
            if (r3 == 0) goto L_0x00b7
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r1 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy) r3
            goto L_0x00cd
        L_0x00b7:
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r3 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy) r3
            goto L_0x00cd
        L_0x00c5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00cd:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface) r0
            java.lang.String r1 = "uid"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x00ea
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x00e3
            r0.realmSet$uid(r2)
            goto L_0x00ea
        L_0x00e3:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$uid(r1)
        L_0x00ea:
            io.realm.RealmList r1 = r0.realmGet$imageList()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r5)
            io.realm.RealmList r1 = r0.realmGet$imageListBytes()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r4)
            java.lang.String r1 = "title"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0111
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x010a
            r0.realmSet$title(r2)
            goto L_0x0111
        L_0x010a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x0111:
            java.lang.String r1 = "deliveryDate"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x012a
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0123
            r0.realmSet$deliveryDate(r2)
            goto L_0x012a
        L_0x0123:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$deliveryDate(r1)
        L_0x012a:
            boolean r1 = r14.has(r8)
            if (r1 == 0) goto L_0x015e
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x013a
            r0.realmSet$priceList(r2)
            goto L_0x015e
        L_0x013a:
            io.realm.RealmList r1 = r0.realmGet$priceList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r8)
            r4 = 0
        L_0x0146:
            int r5 = r1.length()
            if (r4 >= r5) goto L_0x015e
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.Price r5 = p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy.createOrUpdateUsingJsonObject(r13, r5, r15)
            io.realm.RealmList r8 = r0.realmGet$priceList()
            r8.add(r5)
            int r4 = r4 + 1
            goto L_0x0146
        L_0x015e:
            java.lang.String r1 = "description"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0177
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0170
            r0.realmSet$description(r2)
            goto L_0x0177
        L_0x0170:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x0177:
            java.lang.String r1 = "descriptionMore"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0190
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0189
            r0.realmSet$descriptionMore(r2)
            goto L_0x0190
        L_0x0189:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$descriptionMore(r1)
        L_0x0190:
            java.lang.String r1 = "dateEnd"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x01a9
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x01a2
            r0.realmSet$dateEnd(r2)
            goto L_0x01a9
        L_0x01a2:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$dateEnd(r1)
        L_0x01a9:
            java.lang.String r1 = "site"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x01c2
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x01bb
            r0.realmSet$site(r2)
            goto L_0x01c2
        L_0x01bb:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$site(r1)
        L_0x01c2:
            java.lang.String r1 = "buildProgress"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01e3
            java.lang.String r1 = "buildProgress"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01d6
            r0.realmSet$buildProgress(r2)
            goto L_0x01e3
        L_0x01d6:
            java.lang.String r1 = "buildProgress"
            double r4 = r14.getDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r4)
            r0.realmSet$buildProgress(r1)
        L_0x01e3:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0217
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x01f3
            r0.realmSet$mortrageList(r2)
            goto L_0x0217
        L_0x01f3:
            io.realm.RealmList r1 = r0.realmGet$mortrageList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r4 = 0
        L_0x01ff:
            int r5 = r1.length()
            if (r4 >= r5) goto L_0x0217
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.Mortrage r5 = p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxy.createOrUpdateUsingJsonObject(r13, r5, r15)
            io.realm.RealmList r7 = r0.realmGet$mortrageList()
            r7.add(r5)
            int r4 = r4 + 1
            goto L_0x01ff
        L_0x0217:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x0232
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0227
            r0.realmSet$action(r2)
            goto L_0x0232
        L_0x0227:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.Action r13 = p046io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$action(r13)
        L_0x0232:
            java.lang.String r13 = "showDemo"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0253
            java.lang.String r13 = "showDemo"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0246
            r0.realmSet$showDemo(r2)
            goto L_0x0253
        L_0x0246:
            java.lang.String r13 = "showDemo"
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$showDemo(r13)
        L_0x0253:
            java.lang.String r13 = "demoFlatUid"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0270
            java.lang.String r13 = "demoFlatUid"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0267
            r0.realmSet$demoFlatUid(r2)
            goto L_0x0270
        L_0x0267:
            java.lang.String r13 = "demoFlatUid"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$demoFlatUid(r13)
        L_0x0270:
            java.lang.String r13 = "presentationLink"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x028d
            java.lang.String r13 = "presentationLink"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0284
            r0.realmSet$presentationLink(r2)
            goto L_0x028d
        L_0x0284:
            java.lang.String r13 = "presentationLink"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$presentationLink(r13)
        L_0x028d:
            java.lang.String r13 = "schemaLink"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x02aa
            java.lang.String r13 = "schemaLink"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x02a1
            r0.realmSet$schemaLink(r2)
            goto L_0x02aa
        L_0x02a1:
            java.lang.String r13 = "schemaLink"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$schemaLink(r13)
        L_0x02aa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.ComplexInfo");
    }

    public static ComplexInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ComplexInfo complexInfo = new ComplexInfo();
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("uid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$uid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$uid((String) null);
                }
            } else if (nextName.equals("imageList")) {
                ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$imageList(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (nextName.equals("imageListBytes")) {
                ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$imageListBytes(ProxyUtils.createRealmListWithJsonStream(byte[].class, jsonReader));
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("deliveryDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$deliveryDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$deliveryDate((String) null);
                }
            } else if (nextName.equals("priceList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$priceList((RealmList<Price>) null);
                } else {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$priceList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList().add(ru_unicorn_ujin_data_realm_PriceRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("descriptionMore")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$descriptionMore(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$descriptionMore((String) null);
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$dateEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$dateEnd((String) null);
                }
            } else if (nextName.equals("site")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$site(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$site((String) null);
                }
            } else if (nextName.equals("buildProgress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$buildProgress(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$buildProgress((Double) null);
                }
            } else if (nextName.equals("mortrageList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$mortrageList((RealmList<Mortrage>) null);
                } else {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$mortrageList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList().add(ru_unicorn_ujin_data_realm_MortrageRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("action")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$action((Action) null);
                } else {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$action(ru_unicorn_ujin_data_realm_ActionRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("showDemo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$showDemo(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$showDemo((Boolean) null);
                }
            } else if (nextName.equals("demoFlatUid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$demoFlatUid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$demoFlatUid((String) null);
                }
            } else if (nextName.equals("presentationLink")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$presentationLink(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$presentationLink((String) null);
                }
            } else if (!nextName.equals("schemaLink")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$schemaLink(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$schemaLink((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ComplexInfo) realm.copyToRealm(complexInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy ru_unicorn_ujin_data_realm_complexinforealmproxy = new ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_complexinforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.ComplexInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.ComplexInfoColumnInfo r9, p035ru.unicorn.ujin.data.realm.ComplexInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.ComplexInfo r1 = (p035ru.unicorn.ujin.data.realm.ComplexInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.ComplexInfo> r2 = p035ru.unicorn.ujin.data.realm.ComplexInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.ComplexInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.ComplexInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy$ComplexInfoColumnInfo, ru.unicorn.ujin.data.realm.ComplexInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.ComplexInfo");
    }

    public static ComplexInfo copy(Realm realm, ComplexInfoColumnInfo complexInfoColumnInfo, ComplexInfo complexInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        ComplexInfoColumnInfo complexInfoColumnInfo2 = complexInfoColumnInfo;
        ComplexInfo complexInfo2 = complexInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(complexInfo2);
        if (realmObjectProxy != null) {
            return (ComplexInfo) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ComplexInfo.class), complexInfoColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(complexInfoColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(complexInfoColumnInfo2.uidIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$uid());
        osObjectBuilder.addStringList(complexInfoColumnInfo2.imageListIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList());
        osObjectBuilder.addByteArrayList(complexInfoColumnInfo2.imageListBytesIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes());
        osObjectBuilder.addString(complexInfoColumnInfo2.titleIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(complexInfoColumnInfo2.deliveryDateIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$deliveryDate());
        osObjectBuilder.addString(complexInfoColumnInfo2.descriptionIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(complexInfoColumnInfo2.descriptionMoreIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$descriptionMore());
        osObjectBuilder.addString(complexInfoColumnInfo2.dateEndIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$dateEnd());
        osObjectBuilder.addString(complexInfoColumnInfo2.siteIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$site());
        osObjectBuilder.addDouble(complexInfoColumnInfo2.buildProgressIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$buildProgress());
        osObjectBuilder.addBoolean(complexInfoColumnInfo2.showDemoIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$showDemo());
        osObjectBuilder.addString(complexInfoColumnInfo2.demoFlatUidIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$demoFlatUid());
        osObjectBuilder.addString(complexInfoColumnInfo2.presentationLinkIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$presentationLink());
        osObjectBuilder.addString(complexInfoColumnInfo2.schemaLinkIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$schemaLink());
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(complexInfo2, newProxyInstance);
        RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList();
        if (realmGet$priceList != null) {
            RealmList<Price> realmGet$priceList2 = newProxyInstance.realmGet$priceList();
            realmGet$priceList2.clear();
            for (int i = 0; i < realmGet$priceList.size(); i++) {
                Price price = realmGet$priceList.get(i);
                Price price2 = (Price) map2.get(price);
                if (price2 != null) {
                    realmGet$priceList2.add(price2);
                } else {
                    realmGet$priceList2.add(ru_unicorn_ujin_data_realm_PriceRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PriceRealmProxy.PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class), price, z, map, set));
                }
            }
        }
        RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList();
        if (realmGet$mortrageList != null) {
            RealmList<Mortrage> realmGet$mortrageList2 = newProxyInstance.realmGet$mortrageList();
            realmGet$mortrageList2.clear();
            for (int i2 = 0; i2 < realmGet$mortrageList.size(); i2++) {
                Mortrage mortrage = realmGet$mortrageList.get(i2);
                Mortrage mortrage2 = (Mortrage) map2.get(mortrage);
                if (mortrage2 != null) {
                    realmGet$mortrageList2.add(mortrage2);
                } else {
                    realmGet$mortrageList2.add(ru_unicorn_ujin_data_realm_MortrageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MortrageRealmProxy.MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class), mortrage, z, map, set));
                }
            }
        }
        Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$action();
        if (realmGet$action == null) {
            newProxyInstance.realmSet$action((Action) null);
        } else {
            Action action = (Action) map2.get(realmGet$action);
            if (action != null) {
                newProxyInstance.realmSet$action(action);
            } else {
                newProxyInstance.realmSet$action(ru_unicorn_ujin_data_realm_ActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ActionRealmProxy.ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class), realmGet$action, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ComplexInfo complexInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        ComplexInfo complexInfo2 = complexInfo;
        Map<RealmModel, Long> map2 = map;
        if (complexInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complexInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ComplexInfo.class);
        long nativePtr = table.getNativePtr();
        ComplexInfoColumnInfo complexInfoColumnInfo = (ComplexInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class);
        long j6 = complexInfoColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo2;
        String realmGet$id = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j6);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j6, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(complexInfo2, Long.valueOf(j2));
        String realmGet$uid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            j3 = nativePtr;
            j4 = j2;
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.uidIndex, j2, realmGet$uid, false);
        } else {
            j3 = nativePtr;
            j4 = j2;
        }
        RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList != null) {
            OsList osList = new OsList(table.getUncheckedRow(j4), complexInfoColumnInfo.imageListIndex);
            Iterator<String> it = realmGet$imageList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        RealmList<byte[]> realmGet$imageListBytes = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes();
        if (realmGet$imageListBytes != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j4), complexInfoColumnInfo.imageListBytesIndex);
            Iterator<byte[]> it2 = realmGet$imageListBytes.iterator();
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                if (next2 == null) {
                    osList2.addNull();
                } else {
                    osList2.addBinary(next2);
                }
            }
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.titleIndex, j4, realmGet$title, false);
        }
        String realmGet$deliveryDate = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$deliveryDate();
        if (realmGet$deliveryDate != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.deliveryDateIndex, j4, realmGet$deliveryDate, false);
        }
        RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList();
        if (realmGet$priceList != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j4), complexInfoColumnInfo.priceListIndex);
            Iterator<Price> it3 = realmGet$priceList.iterator();
            while (it3.hasNext()) {
                Price next3 = it3.next();
                Long l = map2.get(next3);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insert(realm2, next3, map2));
                }
                osList3.addRow(l.longValue());
            }
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.descriptionIndex, j4, realmGet$description, false);
        }
        String realmGet$descriptionMore = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$descriptionMore();
        if (realmGet$descriptionMore != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.descriptionMoreIndex, j4, realmGet$descriptionMore, false);
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.dateEndIndex, j4, realmGet$dateEnd, false);
        }
        String realmGet$site = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$site();
        if (realmGet$site != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.siteIndex, j4, realmGet$site, false);
        }
        Double realmGet$buildProgress = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$buildProgress();
        if (realmGet$buildProgress != null) {
            j5 = j4;
            Table.nativeSetDouble(j3, complexInfoColumnInfo.buildProgressIndex, j4, realmGet$buildProgress.doubleValue(), false);
        } else {
            j5 = j4;
        }
        RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList();
        if (realmGet$mortrageList != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(j5), complexInfoColumnInfo.mortrageListIndex);
            Iterator<Mortrage> it4 = realmGet$mortrageList.iterator();
            while (it4.hasNext()) {
                Mortrage next4 = it4.next();
                Long l2 = map2.get(next4);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insert(realm2, next4, map2));
                }
                osList4.addRow(l2.longValue());
            }
        }
        Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            Long l3 = map2.get(realmGet$action);
            if (l3 == null) {
                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ActionRealmProxy.insert(realm2, realmGet$action, map2));
            }
            Table.nativeSetLink(j3, complexInfoColumnInfo.actionIndex, j5, l3.longValue(), false);
        }
        Boolean realmGet$showDemo = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$showDemo();
        if (realmGet$showDemo != null) {
            Table.nativeSetBoolean(j3, complexInfoColumnInfo.showDemoIndex, j5, realmGet$showDemo.booleanValue(), false);
        }
        String realmGet$demoFlatUid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$demoFlatUid();
        if (realmGet$demoFlatUid != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.demoFlatUidIndex, j5, realmGet$demoFlatUid, false);
        }
        String realmGet$presentationLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$presentationLink();
        if (realmGet$presentationLink != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.presentationLinkIndex, j5, realmGet$presentationLink, false);
        }
        String realmGet$schemaLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$schemaLink();
        if (realmGet$schemaLink != null) {
            Table.nativeSetString(j3, complexInfoColumnInfo.schemaLinkIndex, j5, realmGet$schemaLink, false);
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ComplexInfo.class);
        long nativePtr = table.getNativePtr();
        ComplexInfoColumnInfo complexInfoColumnInfo = (ComplexInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class);
        long j11 = complexInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            ComplexInfo complexInfo = (ComplexInfo) it.next();
            if (!map2.containsKey(complexInfo)) {
                if (complexInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complexInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(complexInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo;
                String realmGet$id = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j11);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j11, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j11, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(complexInfo, Long.valueOf(j2));
                String realmGet$uid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    j4 = j2;
                    j3 = j11;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.uidIndex, j2, realmGet$uid, false);
                } else {
                    j4 = j2;
                    j3 = j11;
                }
                RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), complexInfoColumnInfo.imageListIndex);
                    Iterator<String> it2 = realmGet$imageList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                } else {
                    j5 = j4;
                }
                RealmList<byte[]> realmGet$imageListBytes = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes();
                if (realmGet$imageListBytes != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j5), complexInfoColumnInfo.imageListBytesIndex);
                    Iterator<byte[]> it3 = realmGet$imageListBytes.iterator();
                    while (it3.hasNext()) {
                        byte[] next2 = it3.next();
                        if (next2 == null) {
                            osList2.addNull();
                        } else {
                            osList2.addBinary(next2);
                        }
                    }
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j6 = j5;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.titleIndex, j5, realmGet$title, false);
                } else {
                    j6 = j5;
                }
                String realmGet$deliveryDate = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$deliveryDate();
                if (realmGet$deliveryDate != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.deliveryDateIndex, j6, realmGet$deliveryDate, false);
                }
                RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList();
                if (realmGet$priceList != null) {
                    j7 = j6;
                    OsList osList3 = new OsList(table.getUncheckedRow(j7), complexInfoColumnInfo.priceListIndex);
                    Iterator<Price> it4 = realmGet$priceList.iterator();
                    while (it4.hasNext()) {
                        Price next3 = it4.next();
                        Long l = map2.get(next3);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l.longValue());
                    }
                } else {
                    j7 = j6;
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    j8 = j7;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionIndex, j7, realmGet$description, false);
                } else {
                    j8 = j7;
                }
                String realmGet$descriptionMore = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$descriptionMore();
                if (realmGet$descriptionMore != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionMoreIndex, j8, realmGet$descriptionMore, false);
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.dateEndIndex, j8, realmGet$dateEnd, false);
                }
                String realmGet$site = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$site();
                if (realmGet$site != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.siteIndex, j8, realmGet$site, false);
                }
                Double realmGet$buildProgress = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$buildProgress();
                if (realmGet$buildProgress != null) {
                    Table.nativeSetDouble(nativePtr, complexInfoColumnInfo.buildProgressIndex, j8, realmGet$buildProgress.doubleValue(), false);
                }
                RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList();
                if (realmGet$mortrageList != null) {
                    j9 = j8;
                    OsList osList4 = new OsList(table.getUncheckedRow(j9), complexInfoColumnInfo.mortrageListIndex);
                    Iterator<Mortrage> it5 = realmGet$mortrageList.iterator();
                    while (it5.hasNext()) {
                        Mortrage next4 = it5.next();
                        Long l2 = map2.get(next4);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insert(realm2, next4, map2));
                        }
                        osList4.addRow(l2.longValue());
                    }
                } else {
                    j9 = j8;
                }
                Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    Long l3 = map2.get(realmGet$action);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ActionRealmProxy.insert(realm2, realmGet$action, map2));
                    }
                    j10 = j9;
                    table.setLink(complexInfoColumnInfo.actionIndex, j9, l3.longValue(), false);
                } else {
                    j10 = j9;
                }
                Boolean realmGet$showDemo = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$showDemo();
                if (realmGet$showDemo != null) {
                    Table.nativeSetBoolean(nativePtr, complexInfoColumnInfo.showDemoIndex, j10, realmGet$showDemo.booleanValue(), false);
                }
                String realmGet$demoFlatUid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$demoFlatUid();
                if (realmGet$demoFlatUid != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.demoFlatUidIndex, j10, realmGet$demoFlatUid, false);
                }
                String realmGet$presentationLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$presentationLink();
                if (realmGet$presentationLink != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.presentationLinkIndex, j10, realmGet$presentationLink, false);
                }
                String realmGet$schemaLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$schemaLink();
                if (realmGet$schemaLink != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.schemaLinkIndex, j10, realmGet$schemaLink, false);
                }
                j11 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ComplexInfo complexInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        ComplexInfo complexInfo2 = complexInfo;
        Map<RealmModel, Long> map2 = map;
        if (complexInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complexInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ComplexInfo.class);
        long nativePtr = table.getNativePtr();
        ComplexInfoColumnInfo complexInfoColumnInfo = (ComplexInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class);
        long j6 = complexInfoColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo2;
        String realmGet$id = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j6);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j6, realmGet$id) : j;
        map2.put(complexInfo2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$uid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.uidIndex, j2, false);
        }
        long j7 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j7), complexInfoColumnInfo.imageListIndex);
        osList.removeAll();
        RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList != null) {
            Iterator<String> it = realmGet$imageList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j7), complexInfoColumnInfo.imageListBytesIndex);
        osList2.removeAll();
        RealmList<byte[]> realmGet$imageListBytes = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes();
        if (realmGet$imageListBytes != null) {
            Iterator<byte[]> it2 = realmGet$imageListBytes.iterator();
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                if (next2 == null) {
                    osList2.addNull();
                } else {
                    osList2.addBinary(next2);
                }
            }
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j7;
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.titleIndex, j7, realmGet$title, false);
        } else {
            j3 = j7;
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.titleIndex, j3, false);
        }
        String realmGet$deliveryDate = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$deliveryDate();
        if (realmGet$deliveryDate != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.deliveryDateIndex, j3, realmGet$deliveryDate, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.deliveryDateIndex, j3, false);
        }
        long j8 = j3;
        OsList osList3 = new OsList(table.getUncheckedRow(j8), complexInfoColumnInfo.priceListIndex);
        RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList();
        if (realmGet$priceList == null || ((long) realmGet$priceList.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$priceList != null) {
                Iterator<Price> it3 = realmGet$priceList.iterator();
                while (it3.hasNext()) {
                    Price next3 = it3.next();
                    Long l = map2.get(next3);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm2, next3, map2));
                    }
                    osList3.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$priceList.size();
            for (int i = 0; i < size; i++) {
                Price price = realmGet$priceList.get(i);
                Long l2 = map2.get(price);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm2, price, map2));
                }
                osList3.setRow((long) i, l2.longValue());
            }
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            j4 = j8;
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionIndex, j8, realmGet$description, false);
        } else {
            j4 = j8;
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.descriptionIndex, j4, false);
        }
        String realmGet$descriptionMore = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$descriptionMore();
        if (realmGet$descriptionMore != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionMoreIndex, j4, realmGet$descriptionMore, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.descriptionMoreIndex, j4, false);
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.dateEndIndex, j4, realmGet$dateEnd, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.dateEndIndex, j4, false);
        }
        String realmGet$site = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$site();
        if (realmGet$site != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.siteIndex, j4, realmGet$site, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.siteIndex, j4, false);
        }
        Double realmGet$buildProgress = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$buildProgress();
        if (realmGet$buildProgress != null) {
            Table.nativeSetDouble(nativePtr, complexInfoColumnInfo.buildProgressIndex, j4, realmGet$buildProgress.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.buildProgressIndex, j4, false);
        }
        long j9 = j4;
        OsList osList4 = new OsList(table.getUncheckedRow(j9), complexInfoColumnInfo.mortrageListIndex);
        RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList();
        if (realmGet$mortrageList == null || ((long) realmGet$mortrageList.size()) != osList4.size()) {
            osList4.removeAll();
            if (realmGet$mortrageList != null) {
                Iterator<Mortrage> it4 = realmGet$mortrageList.iterator();
                while (it4.hasNext()) {
                    Mortrage next4 = it4.next();
                    Long l3 = map2.get(next4);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm2, next4, map2));
                    }
                    osList4.addRow(l3.longValue());
                }
            }
        } else {
            int size2 = realmGet$mortrageList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Mortrage mortrage = realmGet$mortrageList.get(i2);
                Long l4 = map2.get(mortrage);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm2, mortrage, map2));
                }
                osList4.setRow((long) i2, l4.longValue());
            }
        }
        Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            Long l5 = map2.get(realmGet$action);
            if (l5 == null) {
                l5 = Long.valueOf(ru_unicorn_ujin_data_realm_ActionRealmProxy.insertOrUpdate(realm2, realmGet$action, map2));
            }
            j5 = j9;
            Table.nativeSetLink(nativePtr, complexInfoColumnInfo.actionIndex, j9, l5.longValue(), false);
        } else {
            j5 = j9;
            Table.nativeNullifyLink(nativePtr, complexInfoColumnInfo.actionIndex, j5);
        }
        Boolean realmGet$showDemo = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$showDemo();
        if (realmGet$showDemo != null) {
            Table.nativeSetBoolean(nativePtr, complexInfoColumnInfo.showDemoIndex, j5, realmGet$showDemo.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.showDemoIndex, j5, false);
        }
        String realmGet$demoFlatUid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$demoFlatUid();
        if (realmGet$demoFlatUid != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.demoFlatUidIndex, j5, realmGet$demoFlatUid, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.demoFlatUidIndex, j5, false);
        }
        String realmGet$presentationLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$presentationLink();
        if (realmGet$presentationLink != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.presentationLinkIndex, j5, realmGet$presentationLink, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.presentationLinkIndex, j5, false);
        }
        String realmGet$schemaLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$schemaLink();
        if (realmGet$schemaLink != null) {
            Table.nativeSetString(nativePtr, complexInfoColumnInfo.schemaLinkIndex, j5, realmGet$schemaLink, false);
        } else {
            Table.nativeSetNull(nativePtr, complexInfoColumnInfo.schemaLinkIndex, j5, false);
        }
        return j5;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ComplexInfo.class);
        long nativePtr = table.getNativePtr();
        ComplexInfoColumnInfo complexInfoColumnInfo = (ComplexInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ComplexInfo.class);
        long j9 = complexInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            ComplexInfo complexInfo = (ComplexInfo) it.next();
            if (!map2.containsKey(complexInfo)) {
                if (complexInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complexInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(complexInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo;
                String realmGet$id = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j9);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j9, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j9, realmGet$id) : j;
                map2.put(complexInfo, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$uid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j9;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j9;
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.uidIndex, createRowWithPrimaryKey, false);
                }
                long j10 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j10), complexInfoColumnInfo.imageListIndex);
                osList.removeAll();
                RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList != null) {
                    Iterator<String> it2 = realmGet$imageList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j10), complexInfoColumnInfo.imageListBytesIndex);
                osList2.removeAll();
                RealmList<byte[]> realmGet$imageListBytes = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes();
                if (realmGet$imageListBytes != null) {
                    Iterator<byte[]> it3 = realmGet$imageListBytes.iterator();
                    while (it3.hasNext()) {
                        byte[] next2 = it3.next();
                        if (next2 == null) {
                            osList2.addNull();
                        } else {
                            osList2.addBinary(next2);
                        }
                    }
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j4 = j10;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.titleIndex, j10, realmGet$title, false);
                } else {
                    j4 = j10;
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.titleIndex, j4, false);
                }
                String realmGet$deliveryDate = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$deliveryDate();
                if (realmGet$deliveryDate != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.deliveryDateIndex, j4, realmGet$deliveryDate, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.deliveryDateIndex, j4, false);
                }
                long j11 = j4;
                OsList osList3 = new OsList(table.getUncheckedRow(j11), complexInfoColumnInfo.priceListIndex);
                RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$priceList();
                if (realmGet$priceList == null || ((long) realmGet$priceList.size()) != osList3.size()) {
                    j5 = j11;
                    osList3.removeAll();
                    if (realmGet$priceList != null) {
                        Iterator<Price> it4 = realmGet$priceList.iterator();
                        while (it4.hasNext()) {
                            Price next3 = it4.next();
                            Long l = map2.get(next3);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$priceList.size();
                    int i = 0;
                    while (i < size) {
                        Price price = realmGet$priceList.get(i);
                        Long l2 = map2.get(price);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_PriceRealmProxy.insertOrUpdate(realm2, price, map2));
                        }
                        osList3.setRow((long) i, l2.longValue());
                        i++;
                        j11 = j11;
                    }
                    j5 = j11;
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    j6 = j5;
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionIndex, j5, realmGet$description, false);
                } else {
                    j6 = j5;
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.descriptionIndex, j6, false);
                }
                String realmGet$descriptionMore = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$descriptionMore();
                if (realmGet$descriptionMore != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.descriptionMoreIndex, j6, realmGet$descriptionMore, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.descriptionMoreIndex, j6, false);
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.dateEndIndex, j6, realmGet$dateEnd, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.dateEndIndex, j6, false);
                }
                String realmGet$site = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$site();
                if (realmGet$site != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.siteIndex, j6, realmGet$site, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.siteIndex, j6, false);
                }
                Double realmGet$buildProgress = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$buildProgress();
                if (realmGet$buildProgress != null) {
                    Table.nativeSetDouble(nativePtr, complexInfoColumnInfo.buildProgressIndex, j6, realmGet$buildProgress.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.buildProgressIndex, j6, false);
                }
                long j12 = j6;
                OsList osList4 = new OsList(table.getUncheckedRow(j12), complexInfoColumnInfo.mortrageListIndex);
                RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$mortrageList();
                if (realmGet$mortrageList == null || ((long) realmGet$mortrageList.size()) != osList4.size()) {
                    j7 = j12;
                    osList4.removeAll();
                    if (realmGet$mortrageList != null) {
                        Iterator<Mortrage> it5 = realmGet$mortrageList.iterator();
                        while (it5.hasNext()) {
                            Mortrage next4 = it5.next();
                            Long l3 = map2.get(next4);
                            if (l3 == null) {
                                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm2, next4, map2));
                            }
                            osList4.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$mortrageList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Mortrage mortrage = realmGet$mortrageList.get(i2);
                        Long l4 = map2.get(mortrage);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_realm_MortrageRealmProxy.insertOrUpdate(realm2, mortrage, map2));
                        }
                        osList4.setRow((long) i2, l4.longValue());
                        i2++;
                        j12 = j12;
                    }
                    j7 = j12;
                }
                Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    Long l5 = map2.get(realmGet$action);
                    if (l5 == null) {
                        l5 = Long.valueOf(ru_unicorn_ujin_data_realm_ActionRealmProxy.insertOrUpdate(realm2, realmGet$action, map2));
                    }
                    j8 = j7;
                    Table.nativeSetLink(nativePtr, complexInfoColumnInfo.actionIndex, j7, l5.longValue(), false);
                } else {
                    j8 = j7;
                    Table.nativeNullifyLink(nativePtr, complexInfoColumnInfo.actionIndex, j8);
                }
                Boolean realmGet$showDemo = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$showDemo();
                if (realmGet$showDemo != null) {
                    Table.nativeSetBoolean(nativePtr, complexInfoColumnInfo.showDemoIndex, j8, realmGet$showDemo.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.showDemoIndex, j8, false);
                }
                String realmGet$demoFlatUid = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$demoFlatUid();
                if (realmGet$demoFlatUid != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.demoFlatUidIndex, j8, realmGet$demoFlatUid, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.demoFlatUidIndex, j8, false);
                }
                String realmGet$presentationLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$presentationLink();
                if (realmGet$presentationLink != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.presentationLinkIndex, j8, realmGet$presentationLink, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.presentationLinkIndex, j8, false);
                }
                String realmGet$schemaLink = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$schemaLink();
                if (realmGet$schemaLink != null) {
                    Table.nativeSetString(nativePtr, complexInfoColumnInfo.schemaLinkIndex, j8, realmGet$schemaLink, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexInfoColumnInfo.schemaLinkIndex, j8, false);
                }
                j9 = j2;
            }
        }
    }

    public static ComplexInfo createDetachedCopy(ComplexInfo complexInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ComplexInfo complexInfo2;
        if (i > i2 || complexInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(complexInfo);
        if (cacheData == null) {
            complexInfo2 = new ComplexInfo();
            map.put(complexInfo, new RealmObjectProxy.CacheData(i, complexInfo2));
        } else if (i >= cacheData.minDepth) {
            return (ComplexInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            complexInfo2 = (ComplexInfo) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo2;
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2 = complexInfo;
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$uid(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$uid());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$imageList(new RealmList());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageList().addAll(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$imageList());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$imageListBytes(new RealmList());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmGet$imageListBytes().addAll(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$imageListBytes());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$deliveryDate(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$deliveryDate());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$priceList((RealmList<Price>) null);
        } else {
            RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$priceList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$priceList(realmList);
            int i3 = i + 1;
            int size = realmGet$priceList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_PriceRealmProxy.createDetachedCopy(realmGet$priceList.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$description(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$descriptionMore(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$descriptionMore());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$site(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$site());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$buildProgress(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$buildProgress());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$mortrageList((RealmList<Mortrage>) null);
        } else {
            RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$mortrageList();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$mortrageList(realmList2);
            int i5 = i + 1;
            int size2 = realmGet$mortrageList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                realmList2.add(ru_unicorn_ujin_data_realm_MortrageRealmProxy.createDetachedCopy(realmGet$mortrageList.get(i6), i5, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$action(ru_unicorn_ujin_data_realm_ActionRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$action(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$showDemo(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$showDemo());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$demoFlatUid(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$demoFlatUid());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$presentationLink(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$presentationLink());
        ru_unicorn_ujin_data_realm_complexinforealmproxyinterface.realmSet$schemaLink(ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$schemaLink());
        return complexInfo2;
    }

    static ComplexInfo update(Realm realm, ComplexInfoColumnInfo complexInfoColumnInfo, ComplexInfo complexInfo, ComplexInfo complexInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ComplexInfoColumnInfo complexInfoColumnInfo2 = complexInfoColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface = complexInfo;
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxyInterface ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2 = complexInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ComplexInfo.class), complexInfoColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(complexInfoColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(complexInfoColumnInfo2.uidIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$uid());
        osObjectBuilder.addStringList(complexInfoColumnInfo2.imageListIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$imageList());
        osObjectBuilder.addByteArrayList(complexInfoColumnInfo2.imageListBytesIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$imageListBytes());
        osObjectBuilder.addString(complexInfoColumnInfo2.titleIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(complexInfoColumnInfo2.deliveryDateIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$deliveryDate());
        RealmList<Price> realmGet$priceList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$priceList();
        if (realmGet$priceList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$priceList.size(); i++) {
                Price price = realmGet$priceList.get(i);
                Price price2 = (Price) map2.get(price);
                if (price2 != null) {
                    realmList.add(price2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_PriceRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PriceRealmProxy.PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class), price, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(complexInfoColumnInfo2.priceListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(complexInfoColumnInfo2.priceListIndex, new RealmList());
        }
        osObjectBuilder.addString(complexInfoColumnInfo2.descriptionIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$description());
        osObjectBuilder.addString(complexInfoColumnInfo2.descriptionMoreIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$descriptionMore());
        osObjectBuilder.addString(complexInfoColumnInfo2.dateEndIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$dateEnd());
        osObjectBuilder.addString(complexInfoColumnInfo2.siteIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$site());
        osObjectBuilder.addDouble(complexInfoColumnInfo2.buildProgressIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$buildProgress());
        RealmList<Mortrage> realmGet$mortrageList = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$mortrageList();
        if (realmGet$mortrageList != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$mortrageList.size(); i2++) {
                Mortrage mortrage = realmGet$mortrageList.get(i2);
                Mortrage mortrage2 = (Mortrage) map2.get(mortrage);
                if (mortrage2 != null) {
                    realmList2.add(mortrage2);
                } else {
                    realmList2.add(ru_unicorn_ujin_data_realm_MortrageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MortrageRealmProxy.MortrageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Mortrage.class), mortrage, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(complexInfoColumnInfo2.mortrageListIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(complexInfoColumnInfo2.mortrageListIndex, new RealmList());
        }
        Action realmGet$action = ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$action();
        if (realmGet$action == null) {
            osObjectBuilder.addNull(complexInfoColumnInfo2.actionIndex);
        } else {
            Action action = (Action) map2.get(realmGet$action);
            if (action != null) {
                osObjectBuilder.addObject(complexInfoColumnInfo2.actionIndex, action);
            } else {
                osObjectBuilder.addObject(complexInfoColumnInfo2.actionIndex, ru_unicorn_ujin_data_realm_ActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ActionRealmProxy.ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class), realmGet$action, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(complexInfoColumnInfo2.showDemoIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$showDemo());
        osObjectBuilder.addString(complexInfoColumnInfo2.demoFlatUidIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$demoFlatUid());
        osObjectBuilder.addString(complexInfoColumnInfo2.presentationLinkIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$presentationLink());
        osObjectBuilder.addString(complexInfoColumnInfo2.schemaLinkIndex, ru_unicorn_ujin_data_realm_complexinforealmproxyinterface2.realmGet$schemaLink());
        osObjectBuilder.updateExistingObject();
        return complexInfo;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ComplexInfo = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{uid:");
        sb.append(realmGet$uid() != null ? realmGet$uid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imageList:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$imageList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{imageListBytes:");
        sb.append("RealmList<byte[]>[");
        sb.append(realmGet$imageListBytes().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title());
        sb.append("}");
        sb.append(",");
        sb.append("{deliveryDate:");
        sb.append(realmGet$deliveryDate() != null ? realmGet$deliveryDate() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{priceList:");
        sb.append("RealmList<Price>[");
        sb.append(realmGet$priceList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{descriptionMore:");
        sb.append(realmGet$descriptionMore() != null ? realmGet$descriptionMore() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateEnd:");
        sb.append(realmGet$dateEnd() != null ? realmGet$dateEnd() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{site:");
        sb.append(realmGet$site() != null ? realmGet$site() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buildProgress:");
        sb.append(realmGet$buildProgress() != null ? realmGet$buildProgress() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{mortrageList:");
        sb.append("RealmList<Mortrage>[");
        sb.append(realmGet$mortrageList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{action:");
        sb.append(realmGet$action() != null ? ru_unicorn_ujin_data_realm_ActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{showDemo:");
        sb.append(realmGet$showDemo() != null ? realmGet$showDemo() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{demoFlatUid:");
        sb.append(realmGet$demoFlatUid() != null ? realmGet$demoFlatUid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{presentationLink:");
        sb.append(realmGet$presentationLink() != null ? realmGet$presentationLink() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{schemaLink:");
        if (realmGet$schemaLink() != null) {
            str = realmGet$schemaLink();
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
        ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy ru_unicorn_ujin_data_realm_complexinforealmproxy = (ru_unicorn_ujin_data_realm_ComplexInfoRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_complexinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_complexinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_complexinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
