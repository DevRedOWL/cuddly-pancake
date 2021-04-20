package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy extends Offer implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OfferColumnInfo columnInfo;
    private RealmList<FileData> imagesRealmList;
    private ProxyState<Offer> proxyState;
    private RealmList<Integer> tagsRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Offer";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy$OfferColumnInfo */
    static final class OfferColumnInfo extends ColumnInfo {
        long accentColorIndex;
        long companyIdIndex;
        long descriptionIndex;
        long idIndex;
        long imageIndex;
        long imagesIndex;
        long importOfferLinkIndex;
        long isPaymentEnabledIndex;
        long isPriceRangeIndex;
        long maxColumnIndexValue;
        long oldPriceIndex;
        long priceIndex;
        long summaryIndex;
        long tagsIndex;
        long titleIndex;
        long typeIndex;
        long unitsIndex;

        OfferColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(16);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.companyIdIndex = addColumnDetails("companyId", "companyId", objectSchemaInfo);
            this.unitsIndex = addColumnDetails("units", "units", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.oldPriceIndex = addColumnDetails("oldPrice", "oldPrice", objectSchemaInfo);
            this.summaryIndex = addColumnDetails("summary", "summary", objectSchemaInfo);
            this.tagsIndex = addColumnDetails("tags", "tags", objectSchemaInfo);
            this.imagesIndex = addColumnDetails(GalleryField.JsonFields.imageList, GalleryField.JsonFields.imageList, objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.isPriceRangeIndex = addColumnDetails("isPriceRange", "isPriceRange", objectSchemaInfo);
            this.isPaymentEnabledIndex = addColumnDetails("isPaymentEnabled", "isPaymentEnabled", objectSchemaInfo);
            this.accentColorIndex = addColumnDetails("accentColor", "accentColor", objectSchemaInfo);
            this.importOfferLinkIndex = addColumnDetails("importOfferLink", "importOfferLink", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OfferColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OfferColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OfferColumnInfo offerColumnInfo = (OfferColumnInfo) columnInfo;
            OfferColumnInfo offerColumnInfo2 = (OfferColumnInfo) columnInfo2;
            offerColumnInfo2.idIndex = offerColumnInfo.idIndex;
            offerColumnInfo2.titleIndex = offerColumnInfo.titleIndex;
            offerColumnInfo2.typeIndex = offerColumnInfo.typeIndex;
            offerColumnInfo2.companyIdIndex = offerColumnInfo.companyIdIndex;
            offerColumnInfo2.unitsIndex = offerColumnInfo.unitsIndex;
            offerColumnInfo2.imageIndex = offerColumnInfo.imageIndex;
            offerColumnInfo2.priceIndex = offerColumnInfo.priceIndex;
            offerColumnInfo2.oldPriceIndex = offerColumnInfo.oldPriceIndex;
            offerColumnInfo2.summaryIndex = offerColumnInfo.summaryIndex;
            offerColumnInfo2.tagsIndex = offerColumnInfo.tagsIndex;
            offerColumnInfo2.imagesIndex = offerColumnInfo.imagesIndex;
            offerColumnInfo2.descriptionIndex = offerColumnInfo.descriptionIndex;
            offerColumnInfo2.isPriceRangeIndex = offerColumnInfo.isPriceRangeIndex;
            offerColumnInfo2.isPaymentEnabledIndex = offerColumnInfo.isPaymentEnabledIndex;
            offerColumnInfo2.accentColorIndex = offerColumnInfo.accentColorIndex;
            offerColumnInfo2.importOfferLinkIndex = offerColumnInfo.importOfferLinkIndex;
            offerColumnInfo2.maxColumnIndexValue = offerColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OfferColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$companyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyIdIndex);
    }

    public void realmSet$companyId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.companyIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.companyIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.companyIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.companyIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$units() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.unitsIndex);
    }

    public void realmSet$units(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.unitsIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.unitsIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.unitsIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.unitsIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public FileData realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.imageIndex)) {
            return null;
        }
        return (FileData) this.proxyState.getRealm$realm().get(FileData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.imageIndex), false, Collections.emptyList());
    }

    public void realmSet$image(FileData fileData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.imageIndex, ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("image")) {
            if (fileData != null && !RealmObject.isManaged(fileData)) {
                fileData = (FileData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileData == null) {
                row$realm.nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            row$realm.getTable().setLink(this.columnInfo.imageIndex, row$realm.getIndex(), ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$price() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.priceIndex);
    }

    public void realmSet$price(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.priceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.priceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.priceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.priceIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$oldPrice() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.oldPriceIndex);
    }

    public void realmSet$oldPrice(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.oldPriceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.oldPriceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.oldPriceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.oldPriceIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$summary() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.summaryIndex);
    }

    public void realmSet$summary(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.summaryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.summaryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.summaryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.summaryIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<Integer> realmGet$tags() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Integer> realmList = this.tagsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.tagsRealmList = new RealmList<>(Integer.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.tagsIndex, RealmFieldType.INTEGER_LIST), this.proxyState.getRealm$realm());
        return this.tagsRealmList;
    }

    public void realmSet$tags(RealmList<Integer> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("tags"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.tagsIndex, RealmFieldType.INTEGER_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<Integer> it = realmList.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addLong(next.longValue());
                    }
                }
            }
        }
    }

    public RealmList<FileData> realmGet$images() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<FileData> realmList = this.imagesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imagesRealmList = new RealmList<>(FileData.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.imagesIndex), this.proxyState.getRealm$realm());
        return this.imagesRealmList;
    }

    public void realmSet$images(RealmList<FileData> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains(GalleryField.JsonFields.imageList)) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<FileData> realmList2 = new RealmList<>();
                Iterator<FileData> it = realmList.iterator();
                while (it.hasNext()) {
                    FileData next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.imagesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    FileData fileData = realmList.get(i);
                    this.proxyState.checkValidObject(fileData);
                    modelList.addRow(((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            FileData fileData2 = realmList.get(i);
            this.proxyState.checkValidObject(fileData2);
            modelList.setRow((long) i, ((RealmObjectProxy) fileData2).realmGet$proxyState().getRow$realm().getIndex());
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

    public Boolean realmGet$isPriceRange() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isPriceRangeIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isPriceRangeIndex));
    }

    public void realmSet$isPriceRange(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isPriceRangeIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isPriceRangeIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isPriceRangeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isPriceRangeIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$isPaymentEnabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isPaymentEnabledIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isPaymentEnabledIndex));
    }

    public void realmSet$isPaymentEnabled(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isPaymentEnabledIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isPaymentEnabledIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isPaymentEnabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isPaymentEnabledIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public String realmGet$accentColor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accentColorIndex);
    }

    public void realmSet$accentColor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accentColorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accentColorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accentColorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accentColorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$importOfferLink() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.importOfferLinkIndex);
    }

    public void realmSet$importOfferLink(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.importOfferLinkIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.importOfferLinkIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.importOfferLinkIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.importOfferLinkIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 16, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("companyId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("units", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("image", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("price", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("oldPrice", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("summary", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("tags", RealmFieldType.INTEGER_LIST, false);
        builder.addPersistedLinkProperty(GalleryField.JsonFields.imageList, RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder4 = builder;
        builder4.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("isPriceRange", RealmFieldType.BOOLEAN, false, false, false);
        builder4.addPersistedProperty("isPaymentEnabled", RealmFieldType.BOOLEAN, false, false, false);
        builder4.addPersistedProperty("accentColor", RealmFieldType.STRING, false, false, false);
        builder4.addPersistedProperty("importOfferLink", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OfferColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OfferColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Offer createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r5 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy$OfferColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.OfferColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "tags"
            java.lang.String r5 = "images"
            java.lang.String r6 = "image"
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0078
            r0.add(r6)
        L_0x0078:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0081
            r0.add(r4)
        L_0x0081:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008a
            r0.add(r5)
        L_0x008a:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00af
            boolean r3 = r14.isNull(r1)
            r7 = 1
            if (r3 == 0) goto L_0x00a1
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy) r3
            goto L_0x00b7
        L_0x00a1:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy) r3
            goto L_0x00b7
        L_0x00af:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b7:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface) r0
            java.lang.String r1 = "title"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00d3
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00cc
            r0.realmSet$title(r2)
            goto L_0x00d3
        L_0x00cc:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00d3:
            java.lang.String r1 = "type"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00e6
            r0.realmSet$type(r2)
            goto L_0x00ed
        L_0x00e6:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$type(r1)
        L_0x00ed:
            java.lang.String r1 = "companyId"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0106
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00ff
            r0.realmSet$companyId(r2)
            goto L_0x0106
        L_0x00ff:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$companyId(r1)
        L_0x0106:
            java.lang.String r1 = "units"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0120
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0119
            r0.realmSet$units(r2)
            goto L_0x0120
        L_0x0119:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$units(r1)
        L_0x0120:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x013b
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0130
            r0.realmSet$image(r2)
            goto L_0x013b
        L_0x0130:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.FileData r1 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$image(r1)
        L_0x013b:
            java.lang.String r1 = "price"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0154
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x014d
            r0.realmSet$price(r2)
            goto L_0x0154
        L_0x014d:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$price(r1)
        L_0x0154:
            java.lang.String r1 = "oldPrice"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x016d
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0166
            r0.realmSet$oldPrice(r2)
            goto L_0x016d
        L_0x0166:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$oldPrice(r1)
        L_0x016d:
            java.lang.String r1 = "summary"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0186
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x017f
            r0.realmSet$summary(r2)
            goto L_0x0186
        L_0x017f:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$summary(r1)
        L_0x0186:
            io.realm.RealmList r1 = r0.realmGet$tags()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r4)
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01c1
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x019d
            r0.realmSet$images(r2)
            goto L_0x01c1
        L_0x019d:
            io.realm.RealmList r1 = r0.realmGet$images()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r5)
            r4 = 0
        L_0x01a9:
            int r5 = r1.length()
            if (r4 >= r5) goto L_0x01c1
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.FileData r5 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r5, r15)
            io.realm.RealmList r6 = r0.realmGet$images()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x01a9
        L_0x01c1:
            java.lang.String r13 = "description"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x01da
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01d3
            r0.realmSet$description(r2)
            goto L_0x01da
        L_0x01d3:
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$description(r13)
        L_0x01da:
            java.lang.String r13 = "isPriceRange"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x01f7
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01ec
            r0.realmSet$isPriceRange(r2)
            goto L_0x01f7
        L_0x01ec:
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$isPriceRange(r13)
        L_0x01f7:
            java.lang.String r13 = "isPaymentEnabled"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0218
            java.lang.String r13 = "isPaymentEnabled"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x020b
            r0.realmSet$isPaymentEnabled(r2)
            goto L_0x0218
        L_0x020b:
            java.lang.String r13 = "isPaymentEnabled"
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$isPaymentEnabled(r13)
        L_0x0218:
            java.lang.String r13 = "accentColor"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0235
            java.lang.String r13 = "accentColor"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x022c
            r0.realmSet$accentColor(r2)
            goto L_0x0235
        L_0x022c:
            java.lang.String r13 = "accentColor"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$accentColor(r13)
        L_0x0235:
            java.lang.String r13 = "importOfferLink"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0252
            java.lang.String r13 = "importOfferLink"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0249
            r0.realmSet$importOfferLink(r2)
            goto L_0x0252
        L_0x0249:
            java.lang.String r13 = "importOfferLink"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$importOfferLink(r13)
        L_0x0252:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Offer");
    }

    public static Offer createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Offer offer = new Offer();
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("companyId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$companyId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$companyId((String) null);
                }
            } else if (nextName.equals("units")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$units(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$units((String) null);
                }
            } else if (nextName.equals("image")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$image((FileData) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$price(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$price((String) null);
                }
            } else if (nextName.equals("oldPrice")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$oldPrice(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$oldPrice((String) null);
                }
            } else if (nextName.equals("summary")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$summary(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$summary((String) null);
                }
            } else if (nextName.equals("tags")) {
                ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$tags(ProxyUtils.createRealmListWithJsonStream(Integer.class, jsonReader));
            } else if (nextName.equals(GalleryField.JsonFields.imageList)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$images((RealmList<FileData>) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$images(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images().add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("isPriceRange")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPriceRange(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPriceRange((Boolean) null);
                }
            } else if (nextName.equals("isPaymentEnabled")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPaymentEnabled(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPaymentEnabled((Boolean) null);
                }
            } else if (nextName.equals("accentColor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$accentColor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$accentColor((String) null);
                }
            } else if (!nextName.equals("importOfferLink")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$importOfferLink(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$importOfferLink((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Offer) realm.copyToRealm(offer, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Offer copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.OfferColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Offer r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Offer r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Offer) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Offer> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Offer.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Offer r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Offer r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy$OfferColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Offer, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Offer");
    }

    public static Offer copy(Realm realm, OfferColumnInfo offerColumnInfo, Offer offer, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(offer);
        if (realmObjectProxy != null) {
            return (Offer) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Offer.class), offerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(offerColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(offerColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(offerColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(offerColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$companyId());
        osObjectBuilder.addString(offerColumnInfo.unitsIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$units());
        osObjectBuilder.addString(offerColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$price());
        osObjectBuilder.addString(offerColumnInfo.oldPriceIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$oldPrice());
        osObjectBuilder.addString(offerColumnInfo.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$summary());
        osObjectBuilder.addIntegerList(offerColumnInfo.tagsIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags());
        osObjectBuilder.addString(offerColumnInfo.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$description());
        osObjectBuilder.addBoolean(offerColumnInfo.isPriceRangeIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPriceRange());
        osObjectBuilder.addBoolean(offerColumnInfo.isPaymentEnabledIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPaymentEnabled());
        osObjectBuilder.addString(offerColumnInfo.accentColorIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$accentColor());
        osObjectBuilder.addString(offerColumnInfo.importOfferLinkIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$importOfferLink());
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(offer, newProxyInstance);
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$image();
        if (realmGet$image == null) {
            newProxyInstance.realmSet$image((FileData) null);
        } else {
            FileData fileData = (FileData) map.get(realmGet$image);
            if (fileData != null) {
                newProxyInstance.realmSet$image(fileData);
            } else {
                newProxyInstance.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$image, z, map, set));
            }
        }
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images();
        if (realmGet$images != null) {
            RealmList<FileData> realmGet$images2 = newProxyInstance.realmGet$images();
            realmGet$images2.clear();
            for (int i = 0; i < realmGet$images.size(); i++) {
                FileData fileData2 = realmGet$images.get(i);
                FileData fileData3 = (FileData) map.get(fileData2);
                if (fileData3 != null) {
                    realmGet$images2.add(fileData3);
                } else {
                    realmGet$images2.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData2, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Offer offer, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Offer offer2 = offer;
        Map<RealmModel, Long> map2 = map;
        if (offer2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) offer2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Offer.class);
        long nativePtr = table.getNativePtr();
        OfferColumnInfo offerColumnInfo = (OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class);
        long j6 = offerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$id();
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
        map2.put(offer2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, offerColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.typeIndex, j3, realmGet$type, false);
        }
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.companyIdIndex, j3, realmGet$companyId, false);
        }
        String realmGet$units = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$units();
        if (realmGet$units != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.unitsIndex, j3, realmGet$units, false);
        }
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, offerColumnInfo.imageIndex, j3, l.longValue(), false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.priceIndex, j3, realmGet$price, false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.oldPriceIndex, j3, realmGet$oldPrice, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.summaryIndex, j3, realmGet$summary, false);
        }
        RealmList<Integer> realmGet$tags = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags();
        if (realmGet$tags != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), offerColumnInfo.tagsIndex);
            Iterator<Integer> it = realmGet$tags.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        } else {
            j4 = j3;
        }
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images();
        if (realmGet$images != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j4), offerColumnInfo.imagesIndex);
            Iterator<FileData> it2 = realmGet$images.iterator();
            while (it2.hasNext()) {
                FileData next2 = it2.next();
                Long l2 = map2.get(next2);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next2, map2));
                }
                osList2.addRow(l2.longValue());
            }
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            j5 = j4;
            Table.nativeSetString(nativePtr, offerColumnInfo.descriptionIndex, j4, realmGet$description, false);
        } else {
            j5 = j4;
        }
        Boolean realmGet$isPriceRange = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPriceRange();
        if (realmGet$isPriceRange != null) {
            Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPriceRangeIndex, j5, realmGet$isPriceRange.booleanValue(), false);
        }
        Boolean realmGet$isPaymentEnabled = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPaymentEnabled();
        if (realmGet$isPaymentEnabled != null) {
            Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j5, realmGet$isPaymentEnabled.booleanValue(), false);
        }
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.accentColorIndex, j5, realmGet$accentColor, false);
        }
        String realmGet$importOfferLink = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$importOfferLink();
        if (realmGet$importOfferLink != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.importOfferLinkIndex, j5, realmGet$importOfferLink, false);
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Offer.class);
        long nativePtr = table.getNativePtr();
        OfferColumnInfo offerColumnInfo = (OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class);
        long j6 = offerColumnInfo.idIndex;
        while (it.hasNext()) {
            Offer offer = (Offer) it.next();
            if (!map2.containsKey(offer)) {
                if (offer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) offer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(offer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$id();
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
                map2.put(offer, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j2;
                    Table.nativeSetString(nativePtr, offerColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j2;
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.typeIndex, j3, realmGet$type, false);
                }
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.companyIdIndex, j3, realmGet$companyId, false);
                }
                String realmGet$units = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$units();
                if (realmGet$units != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.unitsIndex, j3, realmGet$units, false);
                }
                FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$image, map2));
                    }
                    table.setLink(offerColumnInfo.imageIndex, j3, l.longValue(), false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.priceIndex, j3, realmGet$price, false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.oldPriceIndex, j3, realmGet$oldPrice, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.summaryIndex, j3, realmGet$summary, false);
                }
                RealmList<Integer> realmGet$tags = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags();
                if (realmGet$tags != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), offerColumnInfo.tagsIndex);
                    Iterator<Integer> it2 = realmGet$tags.iterator();
                    while (it2.hasNext()) {
                        Integer next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                } else {
                    j4 = j3;
                }
                RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images();
                if (realmGet$images != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j4), offerColumnInfo.imagesIndex);
                    Iterator<FileData> it3 = realmGet$images.iterator();
                    while (it3.hasNext()) {
                        FileData next2 = it3.next();
                        Long l2 = map2.get(next2);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l2.longValue());
                    }
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, offerColumnInfo.descriptionIndex, j4, realmGet$description, false);
                } else {
                    j5 = j4;
                }
                Boolean realmGet$isPriceRange = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPriceRange();
                if (realmGet$isPriceRange != null) {
                    Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPriceRangeIndex, j5, realmGet$isPriceRange.booleanValue(), false);
                }
                Boolean realmGet$isPaymentEnabled = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPaymentEnabled();
                if (realmGet$isPaymentEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j5, realmGet$isPaymentEnabled.booleanValue(), false);
                }
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.accentColorIndex, j5, realmGet$accentColor, false);
                }
                String realmGet$importOfferLink = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$importOfferLink();
                if (realmGet$importOfferLink != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.importOfferLinkIndex, j5, realmGet$importOfferLink, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Offer offer, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Offer offer2 = offer;
        Map<RealmModel, Long> map2 = map;
        if (offer2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) offer2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Offer.class);
        long nativePtr = table.getNativePtr();
        OfferColumnInfo offerColumnInfo = (OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class);
        long j4 = offerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(offer2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, offerColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, offerColumnInfo.titleIndex, j2, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.typeIndex, j2, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.typeIndex, j2, false);
        }
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.companyIdIndex, j2, realmGet$companyId, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.companyIdIndex, j2, false);
        }
        String realmGet$units = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$units();
        if (realmGet$units != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.unitsIndex, j2, realmGet$units, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.unitsIndex, j2, false);
        }
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, offerColumnInfo.imageIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, offerColumnInfo.imageIndex, j2);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.priceIndex, j2, realmGet$price, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.priceIndex, j2, false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.oldPriceIndex, j2, realmGet$oldPrice, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.oldPriceIndex, j2, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.summaryIndex, j2, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.summaryIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), offerColumnInfo.tagsIndex);
        osList.removeAll();
        RealmList<Integer> realmGet$tags = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags();
        if (realmGet$tags != null) {
            Iterator<Integer> it = realmGet$tags.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j5), offerColumnInfo.imagesIndex);
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images();
        if (realmGet$images == null || ((long) realmGet$images.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$images != null) {
                Iterator<FileData> it2 = realmGet$images.iterator();
                while (it2.hasNext()) {
                    FileData next2 = it2.next();
                    Long l2 = map2.get(next2);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$images.size();
            for (int i = 0; i < size; i++) {
                FileData fileData = realmGet$images.get(i);
                Long l3 = map2.get(fileData);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                }
                osList2.setRow((long) i, l3.longValue());
            }
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            j3 = j5;
            Table.nativeSetString(nativePtr, offerColumnInfo.descriptionIndex, j5, realmGet$description, false);
        } else {
            j3 = j5;
            Table.nativeSetNull(nativePtr, offerColumnInfo.descriptionIndex, j3, false);
        }
        Boolean realmGet$isPriceRange = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPriceRange();
        if (realmGet$isPriceRange != null) {
            Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPriceRangeIndex, j3, realmGet$isPriceRange.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.isPriceRangeIndex, j3, false);
        }
        Boolean realmGet$isPaymentEnabled = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPaymentEnabled();
        if (realmGet$isPaymentEnabled != null) {
            Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j3, realmGet$isPaymentEnabled.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j3, false);
        }
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.accentColorIndex, j3, realmGet$accentColor, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.accentColorIndex, j3, false);
        }
        String realmGet$importOfferLink = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$importOfferLink();
        if (realmGet$importOfferLink != null) {
            Table.nativeSetString(nativePtr, offerColumnInfo.importOfferLinkIndex, j3, realmGet$importOfferLink, false);
        } else {
            Table.nativeSetNull(nativePtr, offerColumnInfo.importOfferLinkIndex, j3, false);
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
        Table table = realm2.getTable(Offer.class);
        long nativePtr = table.getNativePtr();
        OfferColumnInfo offerColumnInfo = (OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class);
        long j6 = offerColumnInfo.idIndex;
        while (it.hasNext()) {
            Offer offer = (Offer) it.next();
            if (!map2.containsKey(offer)) {
                if (offer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) offer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(offer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j6, realmGet$id) : j;
                map2.put(offer, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, offerColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, offerColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.typeIndex, j3, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.typeIndex, j3, false);
                }
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.companyIdIndex, j3, realmGet$companyId, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.companyIdIndex, j3, false);
                }
                String realmGet$units = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$units();
                if (realmGet$units != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.unitsIndex, j3, realmGet$units, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.unitsIndex, j3, false);
                }
                FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
                    }
                    Table.nativeSetLink(nativePtr, offerColumnInfo.imageIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, offerColumnInfo.imageIndex, j3);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.priceIndex, j3, realmGet$price, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.priceIndex, j3, false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.oldPriceIndex, j3, realmGet$oldPrice, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.oldPriceIndex, j3, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.summaryIndex, j3, realmGet$summary, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.summaryIndex, j3, false);
                }
                long j7 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j7), offerColumnInfo.tagsIndex);
                osList.removeAll();
                RealmList<Integer> realmGet$tags = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags();
                if (realmGet$tags != null) {
                    Iterator<Integer> it2 = realmGet$tags.iterator();
                    while (it2.hasNext()) {
                        Integer next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j7), offerColumnInfo.imagesIndex);
                RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$images();
                if (realmGet$images == null || ((long) realmGet$images.size()) != osList2.size()) {
                    j4 = j7;
                    osList2.removeAll();
                    if (realmGet$images != null) {
                        Iterator<FileData> it3 = realmGet$images.iterator();
                        while (it3.hasNext()) {
                            FileData next2 = it3.next();
                            Long l2 = map2.get(next2);
                            if (l2 == null) {
                                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$images.size();
                    int i = 0;
                    while (i < size) {
                        FileData fileData = realmGet$images.get(i);
                        Long l3 = map2.get(fileData);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                        }
                        osList2.setRow((long) i, l3.longValue());
                        i++;
                        j7 = j7;
                    }
                    j4 = j7;
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, offerColumnInfo.descriptionIndex, j4, realmGet$description, false);
                } else {
                    j5 = j4;
                    Table.nativeSetNull(nativePtr, offerColumnInfo.descriptionIndex, j5, false);
                }
                Boolean realmGet$isPriceRange = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPriceRange();
                if (realmGet$isPriceRange != null) {
                    Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPriceRangeIndex, j5, realmGet$isPriceRange.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.isPriceRangeIndex, j5, false);
                }
                Boolean realmGet$isPaymentEnabled = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$isPaymentEnabled();
                if (realmGet$isPaymentEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j5, realmGet$isPaymentEnabled.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.isPaymentEnabledIndex, j5, false);
                }
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.accentColorIndex, j5, realmGet$accentColor, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.accentColorIndex, j5, false);
                }
                String realmGet$importOfferLink = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$importOfferLink();
                if (realmGet$importOfferLink != null) {
                    Table.nativeSetString(nativePtr, offerColumnInfo.importOfferLinkIndex, j5, realmGet$importOfferLink, false);
                } else {
                    Table.nativeSetNull(nativePtr, offerColumnInfo.importOfferLinkIndex, j5, false);
                }
                j6 = j2;
            }
        }
    }

    public static Offer createDetachedCopy(Offer offer, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Offer offer2;
        if (i > i2 || offer == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(offer);
        if (cacheData == null) {
            offer2 = new Offer();
            map.put(offer, new RealmObjectProxy.CacheData(i, offer2));
        } else if (i >= cacheData.minDepth) {
            return (Offer) cacheData.object;
        } else {
            cacheData.minDepth = i;
            offer2 = (Offer) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer2;
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2 = offer;
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$companyId(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$companyId());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$units(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$units());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$image(), i3, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$price(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$oldPrice(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$oldPrice());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$summary(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$summary());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$tags(new RealmList());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmGet$tags().addAll(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$tags());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$images((RealmList<FileData>) null);
        } else {
            RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$images();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$images(realmList);
            int size = realmGet$images.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(realmGet$images.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$description(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPriceRange(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$isPriceRange());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$isPaymentEnabled(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$isPaymentEnabled());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$accentColor(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$accentColor());
        ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface.realmSet$importOfferLink(ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$importOfferLink());
        return offer2;
    }

    static Offer update(Realm realm, OfferColumnInfo offerColumnInfo, Offer offer, Offer offer2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        OfferColumnInfo offerColumnInfo2 = offerColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface = offer;
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2 = offer2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Offer.class), offerColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(offerColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(offerColumnInfo2.titleIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(offerColumnInfo2.typeIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$type());
        osObjectBuilder.addString(offerColumnInfo2.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$companyId());
        osObjectBuilder.addString(offerColumnInfo2.unitsIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$units());
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.addNull(offerColumnInfo2.imageIndex);
        } else {
            FileData fileData = (FileData) map2.get(realmGet$image);
            if (fileData != null) {
                osObjectBuilder.addObject(offerColumnInfo2.imageIndex, fileData);
            } else {
                osObjectBuilder.addObject(offerColumnInfo2.imageIndex, ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$image, true, map, set));
            }
        }
        osObjectBuilder.addString(offerColumnInfo2.priceIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$price());
        osObjectBuilder.addString(offerColumnInfo2.oldPriceIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$oldPrice());
        osObjectBuilder.addString(offerColumnInfo2.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$summary());
        osObjectBuilder.addIntegerList(offerColumnInfo2.tagsIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$tags());
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$images();
        if (realmGet$images != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$images.size(); i++) {
                FileData fileData2 = realmGet$images.get(i);
                FileData fileData3 = (FileData) map2.get(fileData2);
                if (fileData3 != null) {
                    realmList.add(fileData3);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData2, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(offerColumnInfo2.imagesIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(offerColumnInfo2.imagesIndex, new RealmList());
        }
        osObjectBuilder.addString(offerColumnInfo2.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$description());
        osObjectBuilder.addBoolean(offerColumnInfo2.isPriceRangeIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$isPriceRange());
        osObjectBuilder.addBoolean(offerColumnInfo2.isPaymentEnabledIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$isPaymentEnabled());
        osObjectBuilder.addString(offerColumnInfo2.accentColorIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$accentColor());
        osObjectBuilder.addString(offerColumnInfo2.importOfferLinkIndex, ru_unicorn_ujin_data_realm_marketplace_offerrealmproxyinterface2.realmGet$importOfferLink());
        osObjectBuilder.updateExistingObject();
        return offer;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Offer = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{companyId:");
        sb.append(realmGet$companyId() != null ? realmGet$companyId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{units:");
        sb.append(realmGet$units() != null ? realmGet$units() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        sb.append(realmGet$image() != null ? ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price() != null ? realmGet$price() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{oldPrice:");
        sb.append(realmGet$oldPrice() != null ? realmGet$oldPrice() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{summary:");
        sb.append(realmGet$summary() != null ? realmGet$summary() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{tags:");
        sb.append("RealmList<Integer>[");
        sb.append(realmGet$tags().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{images:");
        sb.append("RealmList<FileData>[");
        sb.append(realmGet$images().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isPriceRange:");
        sb.append(realmGet$isPriceRange() != null ? realmGet$isPriceRange() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isPaymentEnabled:");
        sb.append(realmGet$isPaymentEnabled() != null ? realmGet$isPaymentEnabled() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{accentColor:");
        sb.append(realmGet$accentColor() != null ? realmGet$accentColor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{importOfferLink:");
        if (realmGet$importOfferLink() != null) {
            str = realmGet$importOfferLink();
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
        ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_offerrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
