package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.FlatButtons;
import p035ru.unicorn.ujin.data.realm.FlatInfo;
import p035ru.unicorn.ujin.data.realm.ImageSize;
import p035ru.unicorn.ujin.data.realm.Pamyatka;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
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
import p046io.realm.internal.android.JsonUtils;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy */
public class ru_unicorn_ujin_data_realm_FlatRealmProxy extends Flat implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FlatRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FlatColumnInfo columnInfo;
    private RealmList<FlatInfo> flatInfoListRealmList;
    private ProxyState<Flat> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Flat";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy$FlatColumnInfo */
    static final class FlatColumnInfo extends ColumnInfo {
        long addressIndex;
        long buttonTextsIndex;
        long complexIdIndex;
        long complexTitleIndex;
        long dateEndIndex;
        long descriptionSmallIndex;
        long favoritesIndex;
        long flatIdIndex;
        long flatInfoListIndex;
        long floorIndex;
        long floorTotalIndex;
        long idIndex;
        long imageSizeIndex;
        long imgBigBytesIndex;
        long imgBigIndex;
        long imgSmallBytesIndex;
        long imgSmallIndex;
        long isActionIndex;
        long maxColumnIndexValue;
        long pamyatkaIndex;
        long phoneNumberIndex;
        long priceIndex;
        long priceOldIndex;
        long rentEnabledIndex;
        long roomsIndex;
        long sellEnabledIndex;
        long squareIndex;
        long urlIndex;

        FlatColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(27);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.flatIdIndex = addColumnDetails("flatId", "flatId", objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.imgBigIndex = addColumnDetails("imgBig", "imgBig", objectSchemaInfo);
            this.imgBigBytesIndex = addColumnDetails("imgBigBytes", "imgBigBytes", objectSchemaInfo);
            this.imgSmallIndex = addColumnDetails("imgSmall", "imgSmall", objectSchemaInfo);
            this.imgSmallBytesIndex = addColumnDetails("imgSmallBytes", "imgSmallBytes", objectSchemaInfo);
            this.phoneNumberIndex = addColumnDetails("phoneNumber", "phoneNumber", objectSchemaInfo);
            this.roomsIndex = addColumnDetails("rooms", "rooms", objectSchemaInfo);
            this.complexTitleIndex = addColumnDetails("complexTitle", "complexTitle", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.complexIdIndex = addColumnDetails("complexId", "complexId", objectSchemaInfo);
            this.squareIndex = addColumnDetails("square", "square", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.priceOldIndex = addColumnDetails("priceOld", "priceOld", objectSchemaInfo);
            this.isActionIndex = addColumnDetails("isAction", "isAction", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.floorTotalIndex = addColumnDetails("floorTotal", "floorTotal", objectSchemaInfo);
            this.descriptionSmallIndex = addColumnDetails("descriptionSmall", "descriptionSmall", objectSchemaInfo);
            this.favoritesIndex = addColumnDetails("favorites", "favorites", objectSchemaInfo);
            this.flatInfoListIndex = addColumnDetails("flatInfoList", "flatInfoList", objectSchemaInfo);
            this.imageSizeIndex = addColumnDetails("imageSize", "imageSize", objectSchemaInfo);
            this.buttonTextsIndex = addColumnDetails("buttonTexts", "buttonTexts", objectSchemaInfo);
            this.pamyatkaIndex = addColumnDetails("pamyatka", "pamyatka", objectSchemaInfo);
            this.sellEnabledIndex = addColumnDetails("sellEnabled", "sellEnabled", objectSchemaInfo);
            this.rentEnabledIndex = addColumnDetails("rentEnabled", "rentEnabled", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FlatColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FlatColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FlatColumnInfo flatColumnInfo = (FlatColumnInfo) columnInfo;
            FlatColumnInfo flatColumnInfo2 = (FlatColumnInfo) columnInfo2;
            flatColumnInfo2.idIndex = flatColumnInfo.idIndex;
            flatColumnInfo2.flatIdIndex = flatColumnInfo.flatIdIndex;
            flatColumnInfo2.dateEndIndex = flatColumnInfo.dateEndIndex;
            flatColumnInfo2.imgBigIndex = flatColumnInfo.imgBigIndex;
            flatColumnInfo2.imgBigBytesIndex = flatColumnInfo.imgBigBytesIndex;
            flatColumnInfo2.imgSmallIndex = flatColumnInfo.imgSmallIndex;
            flatColumnInfo2.imgSmallBytesIndex = flatColumnInfo.imgSmallBytesIndex;
            flatColumnInfo2.phoneNumberIndex = flatColumnInfo.phoneNumberIndex;
            flatColumnInfo2.roomsIndex = flatColumnInfo.roomsIndex;
            flatColumnInfo2.complexTitleIndex = flatColumnInfo.complexTitleIndex;
            flatColumnInfo2.addressIndex = flatColumnInfo.addressIndex;
            flatColumnInfo2.complexIdIndex = flatColumnInfo.complexIdIndex;
            flatColumnInfo2.squareIndex = flatColumnInfo.squareIndex;
            flatColumnInfo2.priceIndex = flatColumnInfo.priceIndex;
            flatColumnInfo2.priceOldIndex = flatColumnInfo.priceOldIndex;
            flatColumnInfo2.isActionIndex = flatColumnInfo.isActionIndex;
            flatColumnInfo2.floorIndex = flatColumnInfo.floorIndex;
            flatColumnInfo2.floorTotalIndex = flatColumnInfo.floorTotalIndex;
            flatColumnInfo2.descriptionSmallIndex = flatColumnInfo.descriptionSmallIndex;
            flatColumnInfo2.favoritesIndex = flatColumnInfo.favoritesIndex;
            flatColumnInfo2.flatInfoListIndex = flatColumnInfo.flatInfoListIndex;
            flatColumnInfo2.imageSizeIndex = flatColumnInfo.imageSizeIndex;
            flatColumnInfo2.buttonTextsIndex = flatColumnInfo.buttonTextsIndex;
            flatColumnInfo2.pamyatkaIndex = flatColumnInfo.pamyatkaIndex;
            flatColumnInfo2.sellEnabledIndex = flatColumnInfo.sellEnabledIndex;
            flatColumnInfo2.rentEnabledIndex = flatColumnInfo.rentEnabledIndex;
            flatColumnInfo2.urlIndex = flatColumnInfo.urlIndex;
            flatColumnInfo2.maxColumnIndexValue = flatColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FlatRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FlatColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$flatId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flatIdIndex);
    }

    public void realmSet$flatId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flatIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flatIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flatIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flatIdIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$imgBig() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgBigIndex);
    }

    public void realmSet$imgBig(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgBigIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgBigIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgBigIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgBigIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public byte[] realmGet$imgBigBytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBinaryByteArray(this.columnInfo.imgBigBytesIndex);
    }

    public void realmSet$imgBigBytes(byte[] bArr) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bArr == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgBigBytesIndex);
            } else {
                this.proxyState.getRow$realm().setBinaryByteArray(this.columnInfo.imgBigBytesIndex, bArr);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bArr == null) {
                row$realm.getTable().setNull(this.columnInfo.imgBigBytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBinaryByteArray(this.columnInfo.imgBigBytesIndex, row$realm.getIndex(), bArr, true);
            }
        }
    }

    public String realmGet$imgSmall() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgSmallIndex);
    }

    public void realmSet$imgSmall(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgSmallIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgSmallIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgSmallIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgSmallIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public byte[] realmGet$imgSmallBytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBinaryByteArray(this.columnInfo.imgSmallBytesIndex);
    }

    public void realmSet$imgSmallBytes(byte[] bArr) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bArr == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgSmallBytesIndex);
            } else {
                this.proxyState.getRow$realm().setBinaryByteArray(this.columnInfo.imgSmallBytesIndex, bArr);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bArr == null) {
                row$realm.getTable().setNull(this.columnInfo.imgSmallBytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBinaryByteArray(this.columnInfo.imgSmallBytesIndex, row$realm.getIndex(), bArr, true);
            }
        }
    }

    public String realmGet$phoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.phoneNumberIndex);
    }

    public void realmSet$phoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.phoneNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.phoneNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.phoneNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$rooms() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.roomsIndex);
    }

    public void realmSet$rooms(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.roomsIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.roomsIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.roomsIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.roomsIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$complexTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.complexTitleIndex);
    }

    public void realmSet$complexTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.complexTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.complexTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.complexTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.complexTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.addressIndex);
    }

    public void realmSet$address(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.addressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.addressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.addressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.addressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$complexId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.complexIdIndex);
    }

    public void realmSet$complexId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.complexIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.complexIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.complexIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.complexIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Double realmGet$square() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.squareIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.squareIndex));
    }

    public void realmSet$square(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.squareIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.squareIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.squareIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.squareIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
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

    public String realmGet$priceOld() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.priceOldIndex);
    }

    public void realmSet$priceOld(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.priceOldIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.priceOldIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.priceOldIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.priceOldIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$isAction() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isActionIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isActionIndex));
    }

    public void realmSet$isAction(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isActionIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isActionIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isActionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isActionIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Integer realmGet$floor() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.floorIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.floorIndex));
    }

    public void realmSet$floor(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.floorIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.floorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.floorIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$floorTotal() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.floorTotalIndex);
    }

    public void realmSet$floorTotal(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorTotalIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.floorTotalIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.floorTotalIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.floorTotalIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$descriptionSmall() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionSmallIndex);
    }

    public void realmSet$descriptionSmall(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionSmallIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionSmallIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionSmallIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionSmallIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$favorites() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.favoritesIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.favoritesIndex));
    }

    public void realmSet$favorites(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.favoritesIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.favoritesIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.favoritesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.favoritesIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public RealmList<FlatInfo> realmGet$flatInfoList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<FlatInfo> realmList = this.flatInfoListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.flatInfoListRealmList = new RealmList<>(FlatInfo.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.flatInfoListIndex), this.proxyState.getRealm$realm());
        return this.flatInfoListRealmList;
    }

    public void realmSet$flatInfoList(RealmList<FlatInfo> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("flatInfoList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<FlatInfo> realmList2 = new RealmList<>();
                Iterator<FlatInfo> it = realmList.iterator();
                while (it.hasNext()) {
                    FlatInfo next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.flatInfoListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    FlatInfo flatInfo = realmList.get(i);
                    this.proxyState.checkValidObject(flatInfo);
                    modelList.addRow(((RealmObjectProxy) flatInfo).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            FlatInfo flatInfo2 = realmList.get(i);
            this.proxyState.checkValidObject(flatInfo2);
            modelList.setRow((long) i, ((RealmObjectProxy) flatInfo2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public ImageSize realmGet$imageSize() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.imageSizeIndex)) {
            return null;
        }
        return (ImageSize) this.proxyState.getRealm$realm().get(ImageSize.class, this.proxyState.getRow$realm().getLink(this.columnInfo.imageSizeIndex), false, Collections.emptyList());
    }

    public void realmSet$imageSize(ImageSize imageSize) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (imageSize == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.imageSizeIndex);
                return;
            }
            this.proxyState.checkValidObject(imageSize);
            this.proxyState.getRow$realm().setLink(this.columnInfo.imageSizeIndex, ((RealmObjectProxy) imageSize).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imageSize")) {
            if (imageSize != null && !RealmObject.isManaged(imageSize)) {
                imageSize = (ImageSize) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(imageSize, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (imageSize == null) {
                row$realm.nullifyLink(this.columnInfo.imageSizeIndex);
                return;
            }
            this.proxyState.checkValidObject(imageSize);
            row$realm.getTable().setLink(this.columnInfo.imageSizeIndex, row$realm.getIndex(), ((RealmObjectProxy) imageSize).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public FlatButtons realmGet$buttonTexts() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.buttonTextsIndex)) {
            return null;
        }
        return (FlatButtons) this.proxyState.getRealm$realm().get(FlatButtons.class, this.proxyState.getRow$realm().getLink(this.columnInfo.buttonTextsIndex), false, Collections.emptyList());
    }

    public void realmSet$buttonTexts(FlatButtons flatButtons) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (flatButtons == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.buttonTextsIndex);
                return;
            }
            this.proxyState.checkValidObject(flatButtons);
            this.proxyState.getRow$realm().setLink(this.columnInfo.buttonTextsIndex, ((RealmObjectProxy) flatButtons).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("buttonTexts")) {
            if (flatButtons != null && !RealmObject.isManaged(flatButtons)) {
                flatButtons = (FlatButtons) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(flatButtons, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (flatButtons == null) {
                row$realm.nullifyLink(this.columnInfo.buttonTextsIndex);
                return;
            }
            this.proxyState.checkValidObject(flatButtons);
            row$realm.getTable().setLink(this.columnInfo.buttonTextsIndex, row$realm.getIndex(), ((RealmObjectProxy) flatButtons).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Pamyatka realmGet$pamyatka() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.pamyatkaIndex)) {
            return null;
        }
        return (Pamyatka) this.proxyState.getRealm$realm().get(Pamyatka.class, this.proxyState.getRow$realm().getLink(this.columnInfo.pamyatkaIndex), false, Collections.emptyList());
    }

    public void realmSet$pamyatka(Pamyatka pamyatka) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (pamyatka == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.pamyatkaIndex);
                return;
            }
            this.proxyState.checkValidObject(pamyatka);
            this.proxyState.getRow$realm().setLink(this.columnInfo.pamyatkaIndex, ((RealmObjectProxy) pamyatka).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("pamyatka")) {
            if (pamyatka != null && !RealmObject.isManaged(pamyatka)) {
                pamyatka = (Pamyatka) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(pamyatka, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (pamyatka == null) {
                row$realm.nullifyLink(this.columnInfo.pamyatkaIndex);
                return;
            }
            this.proxyState.checkValidObject(pamyatka);
            row$realm.getTable().setLink(this.columnInfo.pamyatkaIndex, row$realm.getIndex(), ((RealmObjectProxy) pamyatka).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$sellEnabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sellEnabledIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.sellEnabledIndex));
    }

    public void realmSet$sellEnabled(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sellEnabledIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.sellEnabledIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.sellEnabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.sellEnabledIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$rentEnabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.rentEnabledIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.rentEnabledIndex));
    }

    public void realmSet$rentEnabled(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentEnabledIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.rentEnabledIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.rentEnabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.rentEnabledIndex, row$realm.getIndex(), bool.booleanValue(), true);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 27, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("flatId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgBig", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgBigBytes", RealmFieldType.BINARY, false, false, false);
        builder2.addPersistedProperty("imgSmall", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgSmallBytes", RealmFieldType.BINARY, false, false, false);
        builder2.addPersistedProperty("phoneNumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rooms", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("complexTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Contact.Type.address, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("complexId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("square", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("price", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("priceOld", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isAction", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("floor", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("floorTotal", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("descriptionSmall", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("favorites", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("flatInfoList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("imageSize", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("buttonTexts", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("pamyatka", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("sellEnabled", RealmFieldType.BOOLEAN, false, false, false);
        builder3.addPersistedProperty("rentEnabled", RealmFieldType.BOOLEAN, false, false, false);
        builder3.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FlatColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FlatColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Flat createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r3 = p035ru.unicorn.ujin.data.realm.Flat.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r5 = p035ru.unicorn.ujin.data.realm.Flat.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy$FlatColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.FlatColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r4 = p035ru.unicorn.ujin.data.realm.Flat.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "pamyatka"
            java.lang.String r5 = "buttonTexts"
            java.lang.String r6 = "imageSize"
            java.lang.String r7 = "flatInfoList"
            if (r3 != 0) goto L_0x00c2
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007a
            r0.add(r7)
        L_0x007a:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0083
            r0.add(r6)
        L_0x0083:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008c
            r0.add(r5)
        L_0x008c:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0095
            r0.add(r4)
        L_0x0095:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00ba
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ac
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r1 = p035ru.unicorn.ujin.data.realm.Flat.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy) r3
            goto L_0x00c2
        L_0x00ac:
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r3 = p035ru.unicorn.ujin.data.realm.Flat.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy) r3
            goto L_0x00c2
        L_0x00ba:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00c2:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface) r0
            java.lang.String r1 = "flatId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00de
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00d7
            r0.realmSet$flatId(r2)
            goto L_0x00de
        L_0x00d7:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$flatId(r1)
        L_0x00de:
            java.lang.String r1 = "dateEnd"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00f7
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00f0
            r0.realmSet$dateEnd(r2)
            goto L_0x00f7
        L_0x00f0:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$dateEnd(r1)
        L_0x00f7:
            java.lang.String r1 = "imgBig"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0110
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0109
            r0.realmSet$imgBig(r2)
            goto L_0x0110
        L_0x0109:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$imgBig(r1)
        L_0x0110:
            java.lang.String r1 = "imgBigBytes"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x012d
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0122
            r0.realmSet$imgBigBytes(r2)
            goto L_0x012d
        L_0x0122:
            java.lang.String r1 = r14.getString(r1)
            byte[] r1 = p046io.realm.internal.android.JsonUtils.stringToBytes(r1)
            r0.realmSet$imgBigBytes(r1)
        L_0x012d:
            java.lang.String r1 = "imgSmall"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0146
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x013f
            r0.realmSet$imgSmall(r2)
            goto L_0x0146
        L_0x013f:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$imgSmall(r1)
        L_0x0146:
            java.lang.String r1 = "imgSmallBytes"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0163
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0158
            r0.realmSet$imgSmallBytes(r2)
            goto L_0x0163
        L_0x0158:
            java.lang.String r1 = r14.getString(r1)
            byte[] r1 = p046io.realm.internal.android.JsonUtils.stringToBytes(r1)
            r0.realmSet$imgSmallBytes(r1)
        L_0x0163:
            java.lang.String r1 = "phoneNumber"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x017c
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0175
            r0.realmSet$phoneNumber(r2)
            goto L_0x017c
        L_0x0175:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$phoneNumber(r1)
        L_0x017c:
            java.lang.String r1 = "rooms"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0195
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x018e
            r0.realmSet$rooms(r2)
            goto L_0x0195
        L_0x018e:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$rooms(r1)
        L_0x0195:
            java.lang.String r1 = "complexTitle"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01b2
            java.lang.String r1 = "complexTitle"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01a9
            r0.realmSet$complexTitle(r2)
            goto L_0x01b2
        L_0x01a9:
            java.lang.String r1 = "complexTitle"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$complexTitle(r1)
        L_0x01b2:
            java.lang.String r1 = "address"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = "address"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01c6
            r0.realmSet$address(r2)
            goto L_0x01cf
        L_0x01c6:
            java.lang.String r1 = "address"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$address(r1)
        L_0x01cf:
            java.lang.String r1 = "complexId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01ec
            java.lang.String r1 = "complexId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01e3
            r0.realmSet$complexId(r2)
            goto L_0x01ec
        L_0x01e3:
            java.lang.String r1 = "complexId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$complexId(r1)
        L_0x01ec:
            java.lang.String r1 = "square"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x020d
            java.lang.String r1 = "square"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0200
            r0.realmSet$square(r2)
            goto L_0x020d
        L_0x0200:
            java.lang.String r1 = "square"
            double r8 = r14.getDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            r0.realmSet$square(r1)
        L_0x020d:
            java.lang.String r1 = "price"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x022a
            java.lang.String r1 = "price"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0221
            r0.realmSet$price(r2)
            goto L_0x022a
        L_0x0221:
            java.lang.String r1 = "price"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$price(r1)
        L_0x022a:
            java.lang.String r1 = "priceOld"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0247
            java.lang.String r1 = "priceOld"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x023e
            r0.realmSet$priceOld(r2)
            goto L_0x0247
        L_0x023e:
            java.lang.String r1 = "priceOld"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$priceOld(r1)
        L_0x0247:
            java.lang.String r1 = "isAction"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0268
            java.lang.String r1 = "isAction"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x025b
            r0.realmSet$isAction(r2)
            goto L_0x0268
        L_0x025b:
            java.lang.String r1 = "isAction"
            boolean r1 = r14.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.realmSet$isAction(r1)
        L_0x0268:
            java.lang.String r1 = "floor"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0289
            java.lang.String r1 = "floor"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x027c
            r0.realmSet$floor(r2)
            goto L_0x0289
        L_0x027c:
            java.lang.String r1 = "floor"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$floor(r1)
        L_0x0289:
            java.lang.String r1 = "floorTotal"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02a6
            java.lang.String r1 = "floorTotal"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x029d
            r0.realmSet$floorTotal(r2)
            goto L_0x02a6
        L_0x029d:
            java.lang.String r1 = "floorTotal"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$floorTotal(r1)
        L_0x02a6:
            java.lang.String r1 = "descriptionSmall"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02c3
            java.lang.String r1 = "descriptionSmall"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02ba
            r0.realmSet$descriptionSmall(r2)
            goto L_0x02c3
        L_0x02ba:
            java.lang.String r1 = "descriptionSmall"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$descriptionSmall(r1)
        L_0x02c3:
            java.lang.String r1 = "favorites"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02e4
            java.lang.String r1 = "favorites"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02d7
            r0.realmSet$favorites(r2)
            goto L_0x02e4
        L_0x02d7:
            java.lang.String r1 = "favorites"
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$favorites(r1)
        L_0x02e4:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0318
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x02f4
            r0.realmSet$flatInfoList(r2)
            goto L_0x0318
        L_0x02f4:
            io.realm.RealmList r1 = r0.realmGet$flatInfoList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r7 = 0
        L_0x0300:
            int r8 = r1.length()
            if (r7 >= r8) goto L_0x0318
            org.json.JSONObject r8 = r1.getJSONObject(r7)
            ru.unicorn.ujin.data.realm.FlatInfo r8 = p046io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createOrUpdateUsingJsonObject(r13, r8, r15)
            io.realm.RealmList r9 = r0.realmGet$flatInfoList()
            r9.add(r8)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0318:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x0333
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0328
            r0.realmSet$imageSize(r2)
            goto L_0x0333
        L_0x0328:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.ImageSize r1 = p046io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$imageSize(r1)
        L_0x0333:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x034e
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0343
            r0.realmSet$buttonTexts(r2)
            goto L_0x034e
        L_0x0343:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.FlatButtons r1 = p046io.realm.ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$buttonTexts(r1)
        L_0x034e:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0369
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x035e
            r0.realmSet$pamyatka(r2)
            goto L_0x0369
        L_0x035e:
            org.json.JSONObject r1 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.Pamyatka r13 = p046io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$pamyatka(r13)
        L_0x0369:
            java.lang.String r13 = "sellEnabled"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x038a
            java.lang.String r13 = "sellEnabled"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x037d
            r0.realmSet$sellEnabled(r2)
            goto L_0x038a
        L_0x037d:
            java.lang.String r13 = "sellEnabled"
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$sellEnabled(r13)
        L_0x038a:
            java.lang.String r13 = "rentEnabled"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x03ab
            java.lang.String r13 = "rentEnabled"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x039e
            r0.realmSet$rentEnabled(r2)
            goto L_0x03ab
        L_0x039e:
            java.lang.String r13 = "rentEnabled"
            boolean r13 = r14.getBoolean(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r0.realmSet$rentEnabled(r13)
        L_0x03ab:
            java.lang.String r13 = "url"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x03cb
            java.lang.String r13 = "url"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x03c1
            r0.realmSet$url(r2)
            goto L_0x03cb
        L_0x03c1:
            java.lang.String r13 = "url"
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$url(r13)
        L_0x03cb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Flat");
    }

    public static Flat createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Flat flat = new Flat();
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("flatId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatId((String) null);
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$dateEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$dateEnd((String) null);
                }
            } else if (nextName.equals("imgBig")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBig(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBig((String) null);
                }
            } else if (nextName.equals("imgBigBytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBigBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBigBytes((byte[]) null);
                }
            } else if (nextName.equals("imgSmall")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmall(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmall((String) null);
                }
            } else if (nextName.equals("imgSmallBytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmallBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmallBytes((byte[]) null);
                }
            } else if (nextName.equals("phoneNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$phoneNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$phoneNumber((String) null);
                }
            } else if (nextName.equals("rooms")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rooms(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rooms((String) null);
                }
            } else if (nextName.equals("complexTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexTitle((String) null);
                }
            } else if (nextName.equals(Contact.Type.address)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$address(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$address((String) null);
                }
            } else if (nextName.equals("complexId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexId((String) null);
                }
            } else if (nextName.equals("square")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$square(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$square((Double) null);
                }
            } else if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$price(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$price((String) null);
                }
            } else if (nextName.equals("priceOld")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$priceOld(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$priceOld((String) null);
                }
            } else if (nextName.equals("isAction")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$isAction(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$isAction((Boolean) null);
                }
            } else if (nextName.equals("floor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floor(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floor((Integer) null);
                }
            } else if (nextName.equals("floorTotal")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floorTotal(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floorTotal((String) null);
                }
            } else if (nextName.equals("descriptionSmall")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$descriptionSmall(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$descriptionSmall((String) null);
                }
            } else if (nextName.equals("favorites")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$favorites(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$favorites((Integer) null);
                }
            } else if (nextName.equals("flatInfoList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatInfoList((RealmList<FlatInfo>) null);
                } else {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatInfoList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList().add(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("imageSize")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imageSize((ImageSize) null);
                } else {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imageSize(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("buttonTexts")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$buttonTexts((FlatButtons) null);
                } else {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$buttonTexts(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("pamyatka")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$pamyatka((Pamyatka) null);
                } else {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$pamyatka(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("sellEnabled")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$sellEnabled(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$sellEnabled((Boolean) null);
                }
            } else if (nextName.equals("rentEnabled")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rentEnabled(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rentEnabled((Boolean) null);
                }
            } else if (!nextName.equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$url(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$url((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Flat) realm.copyToRealm(flat, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_FlatRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FlatRealmProxy ru_unicorn_ujin_data_realm_flatrealmproxy = new ru_unicorn_ujin_data_realm_FlatRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_flatrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Flat copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.FlatColumnInfo r9, p035ru.unicorn.ujin.data.realm.Flat r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Flat r1 = (p035ru.unicorn.ujin.data.realm.Flat) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Flat> r2 = p035ru.unicorn.ujin.data.realm.Flat.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Flat r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Flat r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy$FlatColumnInfo, ru.unicorn.ujin.data.realm.Flat, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Flat");
    }

    public static Flat copy(Realm realm, FlatColumnInfo flatColumnInfo, Flat flat, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(flat);
        if (realmObjectProxy != null) {
            return (Flat) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Flat.class), flatColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(flatColumnInfo.idIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(flatColumnInfo.flatIdIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatId());
        osObjectBuilder.addString(flatColumnInfo.dateEndIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$dateEnd());
        osObjectBuilder.addString(flatColumnInfo.imgBigIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBig());
        osObjectBuilder.addByteArray(flatColumnInfo.imgBigBytesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBigBytes());
        osObjectBuilder.addString(flatColumnInfo.imgSmallIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmall());
        osObjectBuilder.addByteArray(flatColumnInfo.imgSmallBytesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmallBytes());
        osObjectBuilder.addString(flatColumnInfo.phoneNumberIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$phoneNumber());
        osObjectBuilder.addString(flatColumnInfo.roomsIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rooms());
        osObjectBuilder.addString(flatColumnInfo.complexTitleIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexTitle());
        osObjectBuilder.addString(flatColumnInfo.addressIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$address());
        osObjectBuilder.addString(flatColumnInfo.complexIdIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexId());
        osObjectBuilder.addDouble(flatColumnInfo.squareIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$square());
        osObjectBuilder.addString(flatColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$price());
        osObjectBuilder.addString(flatColumnInfo.priceOldIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$priceOld());
        osObjectBuilder.addBoolean(flatColumnInfo.isActionIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$isAction());
        osObjectBuilder.addInteger(flatColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floor());
        osObjectBuilder.addString(flatColumnInfo.floorTotalIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floorTotal());
        osObjectBuilder.addString(flatColumnInfo.descriptionSmallIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$descriptionSmall());
        osObjectBuilder.addInteger(flatColumnInfo.favoritesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$favorites());
        osObjectBuilder.addBoolean(flatColumnInfo.sellEnabledIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$sellEnabled());
        osObjectBuilder.addBoolean(flatColumnInfo.rentEnabledIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rentEnabled());
        osObjectBuilder.addString(flatColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$url());
        ru_unicorn_ujin_data_realm_FlatRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(flat, newProxyInstance);
        RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList();
        if (realmGet$flatInfoList != null) {
            RealmList<FlatInfo> realmGet$flatInfoList2 = newProxyInstance.realmGet$flatInfoList();
            realmGet$flatInfoList2.clear();
            for (int i = 0; i < realmGet$flatInfoList.size(); i++) {
                FlatInfo flatInfo = realmGet$flatInfoList.get(i);
                FlatInfo flatInfo2 = (FlatInfo) map.get(flatInfo);
                if (flatInfo2 != null) {
                    realmGet$flatInfoList2.add(flatInfo2);
                } else {
                    realmGet$flatInfoList2.add(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class), flatInfo, z, map, set));
                }
            }
        }
        ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imageSize();
        if (realmGet$imageSize == null) {
            newProxyInstance.realmSet$imageSize((ImageSize) null);
        } else {
            ImageSize imageSize = (ImageSize) map.get(realmGet$imageSize);
            if (imageSize != null) {
                newProxyInstance.realmSet$imageSize(imageSize);
            } else {
                newProxyInstance.realmSet$imageSize(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class), realmGet$imageSize, z, map, set));
            }
        }
        FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$buttonTexts();
        if (realmGet$buttonTexts == null) {
            newProxyInstance.realmSet$buttonTexts((FlatButtons) null);
        } else {
            FlatButtons flatButtons = (FlatButtons) map.get(realmGet$buttonTexts);
            if (flatButtons != null) {
                newProxyInstance.realmSet$buttonTexts(flatButtons);
            } else {
                newProxyInstance.realmSet$buttonTexts(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class), realmGet$buttonTexts, z, map, set));
            }
        }
        Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$pamyatka();
        if (realmGet$pamyatka == null) {
            newProxyInstance.realmSet$pamyatka((Pamyatka) null);
        } else {
            Pamyatka pamyatka = (Pamyatka) map.get(realmGet$pamyatka);
            if (pamyatka != null) {
                newProxyInstance.realmSet$pamyatka(pamyatka);
            } else {
                newProxyInstance.realmSet$pamyatka(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class), realmGet$pamyatka, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Flat flat, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Flat flat2 = flat;
        Map<RealmModel, Long> map2 = map;
        if (flat2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flat2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Flat.class);
        long nativePtr = table.getNativePtr();
        FlatColumnInfo flatColumnInfo = (FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class);
        long j6 = flatColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat2;
        String realmGet$id = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$id();
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
        map2.put(flat2, Long.valueOf(j2));
        String realmGet$flatId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatId();
        if (realmGet$flatId != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, flatColumnInfo.flatIdIndex, j2, realmGet$flatId, false);
        } else {
            j3 = j2;
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.dateEndIndex, j3, realmGet$dateEnd, false);
        }
        String realmGet$imgBig = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBig();
        if (realmGet$imgBig != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.imgBigIndex, j3, realmGet$imgBig, false);
        }
        byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBigBytes();
        if (realmGet$imgBigBytes != null) {
            Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgBigBytesIndex, j3, realmGet$imgBigBytes, false);
        }
        String realmGet$imgSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmall();
        if (realmGet$imgSmall != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.imgSmallIndex, j3, realmGet$imgSmall, false);
        }
        byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmallBytes();
        if (realmGet$imgSmallBytes != null) {
            Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgSmallBytesIndex, j3, realmGet$imgSmallBytes, false);
        }
        String realmGet$phoneNumber = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.phoneNumberIndex, j3, realmGet$phoneNumber, false);
        }
        String realmGet$rooms = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rooms();
        if (realmGet$rooms != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.roomsIndex, j3, realmGet$rooms, false);
        }
        String realmGet$complexTitle = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexTitle();
        if (realmGet$complexTitle != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.complexTitleIndex, j3, realmGet$complexTitle, false);
        }
        String realmGet$address = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.addressIndex, j3, realmGet$address, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.complexIdIndex, j3, realmGet$complexId, false);
        }
        Double realmGet$square = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetDouble(nativePtr, flatColumnInfo.squareIndex, j3, realmGet$square.doubleValue(), false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.priceIndex, j3, realmGet$price, false);
        }
        String realmGet$priceOld = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$priceOld();
        if (realmGet$priceOld != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.priceOldIndex, j3, realmGet$priceOld, false);
        }
        Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$isAction();
        if (realmGet$isAction != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.isActionIndex, j3, realmGet$isAction.booleanValue(), false);
        }
        Integer realmGet$floor = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetLong(nativePtr, flatColumnInfo.floorIndex, j3, realmGet$floor.longValue(), false);
        }
        String realmGet$floorTotal = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floorTotal();
        if (realmGet$floorTotal != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.floorTotalIndex, j3, realmGet$floorTotal, false);
        }
        String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$descriptionSmall();
        if (realmGet$descriptionSmall != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.descriptionSmallIndex, j3, realmGet$descriptionSmall, false);
        }
        Integer realmGet$favorites = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$favorites();
        if (realmGet$favorites != null) {
            Table.nativeSetLong(nativePtr, flatColumnInfo.favoritesIndex, j3, realmGet$favorites.longValue(), false);
        }
        RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList();
        if (realmGet$flatInfoList != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), flatColumnInfo.flatInfoListIndex);
            Iterator<FlatInfo> it = realmGet$flatInfoList.iterator();
            while (it.hasNext()) {
                FlatInfo next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j4 = j3;
        }
        ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imageSize();
        if (realmGet$imageSize != null) {
            Long l2 = map2.get(realmGet$imageSize);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insert(realm2, realmGet$imageSize, map2));
            }
            j5 = j4;
            Table.nativeSetLink(nativePtr, flatColumnInfo.imageSizeIndex, j4, l2.longValue(), false);
        } else {
            j5 = j4;
        }
        FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$buttonTexts();
        if (realmGet$buttonTexts != null) {
            Long l3 = map2.get(realmGet$buttonTexts);
            if (l3 == null) {
                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insert(realm2, realmGet$buttonTexts, map2));
            }
            Table.nativeSetLink(nativePtr, flatColumnInfo.buttonTextsIndex, j5, l3.longValue(), false);
        }
        Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$pamyatka();
        if (realmGet$pamyatka != null) {
            Long l4 = map2.get(realmGet$pamyatka);
            if (l4 == null) {
                l4 = Long.valueOf(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insert(realm2, realmGet$pamyatka, map2));
            }
            Table.nativeSetLink(nativePtr, flatColumnInfo.pamyatkaIndex, j5, l4.longValue(), false);
        }
        Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$sellEnabled();
        if (realmGet$sellEnabled != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.sellEnabledIndex, j5, realmGet$sellEnabled.booleanValue(), false);
        }
        Boolean realmGet$rentEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rentEnabled();
        if (realmGet$rentEnabled != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.rentEnabledIndex, j5, realmGet$rentEnabled.booleanValue(), false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.urlIndex, j5, realmGet$url, false);
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
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Flat.class);
        long nativePtr = table.getNativePtr();
        FlatColumnInfo flatColumnInfo = (FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class);
        long j7 = flatColumnInfo.idIndex;
        while (it.hasNext()) {
            Flat flat = (Flat) it.next();
            if (!map2.containsKey(flat)) {
                if (flat instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flat;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flat, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat;
                String realmGet$id = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j7);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j7, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j7, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(flat, Long.valueOf(j2));
                String realmGet$flatId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatId();
                if (realmGet$flatId != null) {
                    j4 = j2;
                    j3 = j7;
                    Table.nativeSetString(nativePtr, flatColumnInfo.flatIdIndex, j2, realmGet$flatId, false);
                } else {
                    j4 = j2;
                    j3 = j7;
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.dateEndIndex, j4, realmGet$dateEnd, false);
                }
                String realmGet$imgBig = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBig();
                if (realmGet$imgBig != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.imgBigIndex, j4, realmGet$imgBig, false);
                }
                byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBigBytes();
                if (realmGet$imgBigBytes != null) {
                    Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgBigBytesIndex, j4, realmGet$imgBigBytes, false);
                }
                String realmGet$imgSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmall();
                if (realmGet$imgSmall != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.imgSmallIndex, j4, realmGet$imgSmall, false);
                }
                byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmallBytes();
                if (realmGet$imgSmallBytes != null) {
                    Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgSmallBytesIndex, j4, realmGet$imgSmallBytes, false);
                }
                String realmGet$phoneNumber = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$phoneNumber();
                if (realmGet$phoneNumber != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.phoneNumberIndex, j4, realmGet$phoneNumber, false);
                }
                String realmGet$rooms = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rooms();
                if (realmGet$rooms != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.roomsIndex, j4, realmGet$rooms, false);
                }
                String realmGet$complexTitle = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexTitle();
                if (realmGet$complexTitle != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.complexTitleIndex, j4, realmGet$complexTitle, false);
                }
                String realmGet$address = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.addressIndex, j4, realmGet$address, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.complexIdIndex, j4, realmGet$complexId, false);
                }
                Double realmGet$square = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetDouble(nativePtr, flatColumnInfo.squareIndex, j4, realmGet$square.doubleValue(), false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.priceIndex, j4, realmGet$price, false);
                }
                String realmGet$priceOld = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$priceOld();
                if (realmGet$priceOld != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.priceOldIndex, j4, realmGet$priceOld, false);
                }
                Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$isAction();
                if (realmGet$isAction != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.isActionIndex, j4, realmGet$isAction.booleanValue(), false);
                }
                Integer realmGet$floor = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetLong(nativePtr, flatColumnInfo.floorIndex, j4, realmGet$floor.longValue(), false);
                }
                String realmGet$floorTotal = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floorTotal();
                if (realmGet$floorTotal != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.floorTotalIndex, j4, realmGet$floorTotal, false);
                }
                String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$descriptionSmall();
                if (realmGet$descriptionSmall != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.descriptionSmallIndex, j4, realmGet$descriptionSmall, false);
                }
                Integer realmGet$favorites = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$favorites();
                if (realmGet$favorites != null) {
                    Table.nativeSetLong(nativePtr, flatColumnInfo.favoritesIndex, j4, realmGet$favorites.longValue(), false);
                }
                RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList();
                if (realmGet$flatInfoList != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), flatColumnInfo.flatInfoListIndex);
                    Iterator<FlatInfo> it2 = realmGet$flatInfoList.iterator();
                    while (it2.hasNext()) {
                        FlatInfo next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j5 = j4;
                }
                ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imageSize();
                if (realmGet$imageSize != null) {
                    Long l2 = map2.get(realmGet$imageSize);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insert(realm2, realmGet$imageSize, map2));
                    }
                    j6 = j5;
                    table.setLink(flatColumnInfo.imageSizeIndex, j5, l2.longValue(), false);
                } else {
                    j6 = j5;
                }
                FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$buttonTexts();
                if (realmGet$buttonTexts != null) {
                    Long l3 = map2.get(realmGet$buttonTexts);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insert(realm2, realmGet$buttonTexts, map2));
                    }
                    table.setLink(flatColumnInfo.buttonTextsIndex, j6, l3.longValue(), false);
                }
                Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$pamyatka();
                if (realmGet$pamyatka != null) {
                    Long l4 = map2.get(realmGet$pamyatka);
                    if (l4 == null) {
                        l4 = Long.valueOf(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insert(realm2, realmGet$pamyatka, map2));
                    }
                    table.setLink(flatColumnInfo.pamyatkaIndex, j6, l4.longValue(), false);
                }
                Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$sellEnabled();
                if (realmGet$sellEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.sellEnabledIndex, j6, realmGet$sellEnabled.booleanValue(), false);
                }
                Boolean realmGet$rentEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rentEnabled();
                if (realmGet$rentEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.rentEnabledIndex, j6, realmGet$rentEnabled.booleanValue(), false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.urlIndex, j6, realmGet$url, false);
                }
                j7 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Flat flat, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Flat flat2 = flat;
        Map<RealmModel, Long> map2 = map;
        if (flat2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flat2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Flat.class);
        long nativePtr = table.getNativePtr();
        FlatColumnInfo flatColumnInfo = (FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class);
        long j4 = flatColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat2;
        String realmGet$id = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(flat2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$flatId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatId();
        if (realmGet$flatId != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, flatColumnInfo.flatIdIndex, createRowWithPrimaryKey, realmGet$flatId, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, flatColumnInfo.flatIdIndex, j2, false);
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.dateEndIndex, j2, realmGet$dateEnd, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.dateEndIndex, j2, false);
        }
        String realmGet$imgBig = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBig();
        if (realmGet$imgBig != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.imgBigIndex, j2, realmGet$imgBig, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.imgBigIndex, j2, false);
        }
        byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBigBytes();
        if (realmGet$imgBigBytes != null) {
            Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgBigBytesIndex, j2, realmGet$imgBigBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.imgBigBytesIndex, j2, false);
        }
        String realmGet$imgSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmall();
        if (realmGet$imgSmall != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.imgSmallIndex, j2, realmGet$imgSmall, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.imgSmallIndex, j2, false);
        }
        byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmallBytes();
        if (realmGet$imgSmallBytes != null) {
            Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgSmallBytesIndex, j2, realmGet$imgSmallBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.imgSmallBytesIndex, j2, false);
        }
        String realmGet$phoneNumber = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.phoneNumberIndex, j2, realmGet$phoneNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.phoneNumberIndex, j2, false);
        }
        String realmGet$rooms = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rooms();
        if (realmGet$rooms != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.roomsIndex, j2, realmGet$rooms, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.roomsIndex, j2, false);
        }
        String realmGet$complexTitle = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexTitle();
        if (realmGet$complexTitle != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.complexTitleIndex, j2, realmGet$complexTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.complexTitleIndex, j2, false);
        }
        String realmGet$address = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.addressIndex, j2, realmGet$address, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.addressIndex, j2, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.complexIdIndex, j2, realmGet$complexId, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.complexIdIndex, j2, false);
        }
        Double realmGet$square = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetDouble(nativePtr, flatColumnInfo.squareIndex, j2, realmGet$square.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.squareIndex, j2, false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.priceIndex, j2, realmGet$price, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.priceIndex, j2, false);
        }
        String realmGet$priceOld = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$priceOld();
        if (realmGet$priceOld != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.priceOldIndex, j2, realmGet$priceOld, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.priceOldIndex, j2, false);
        }
        Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$isAction();
        if (realmGet$isAction != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.isActionIndex, j2, realmGet$isAction.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.isActionIndex, j2, false);
        }
        Integer realmGet$floor = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetLong(nativePtr, flatColumnInfo.floorIndex, j2, realmGet$floor.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.floorIndex, j2, false);
        }
        String realmGet$floorTotal = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floorTotal();
        if (realmGet$floorTotal != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.floorTotalIndex, j2, realmGet$floorTotal, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.floorTotalIndex, j2, false);
        }
        String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$descriptionSmall();
        if (realmGet$descriptionSmall != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.descriptionSmallIndex, j2, realmGet$descriptionSmall, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.descriptionSmallIndex, j2, false);
        }
        Integer realmGet$favorites = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$favorites();
        if (realmGet$favorites != null) {
            Table.nativeSetLong(nativePtr, flatColumnInfo.favoritesIndex, j2, realmGet$favorites.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.favoritesIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), flatColumnInfo.flatInfoListIndex);
        RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList();
        if (realmGet$flatInfoList == null || ((long) realmGet$flatInfoList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$flatInfoList != null) {
                Iterator<FlatInfo> it = realmGet$flatInfoList.iterator();
                while (it.hasNext()) {
                    FlatInfo next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$flatInfoList.size();
            for (int i = 0; i < size; i++) {
                FlatInfo flatInfo = realmGet$flatInfoList.get(i);
                Long l2 = map2.get(flatInfo);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm2, flatInfo, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imageSize();
        if (realmGet$imageSize != null) {
            Long l3 = map2.get(realmGet$imageSize);
            if (l3 == null) {
                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insertOrUpdate(realm2, realmGet$imageSize, map2));
            }
            j3 = j5;
            Table.nativeSetLink(nativePtr, flatColumnInfo.imageSizeIndex, j5, l3.longValue(), false);
        } else {
            j3 = j5;
            Table.nativeNullifyLink(nativePtr, flatColumnInfo.imageSizeIndex, j3);
        }
        FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$buttonTexts();
        if (realmGet$buttonTexts != null) {
            Long l4 = map2.get(realmGet$buttonTexts);
            if (l4 == null) {
                l4 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insertOrUpdate(realm2, realmGet$buttonTexts, map2));
            }
            Table.nativeSetLink(nativePtr, flatColumnInfo.buttonTextsIndex, j3, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, flatColumnInfo.buttonTextsIndex, j3);
        }
        Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$pamyatka();
        if (realmGet$pamyatka != null) {
            Long l5 = map2.get(realmGet$pamyatka);
            if (l5 == null) {
                l5 = Long.valueOf(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insertOrUpdate(realm2, realmGet$pamyatka, map2));
            }
            Table.nativeSetLink(nativePtr, flatColumnInfo.pamyatkaIndex, j3, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, flatColumnInfo.pamyatkaIndex, j3);
        }
        Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$sellEnabled();
        if (realmGet$sellEnabled != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.sellEnabledIndex, j3, realmGet$sellEnabled.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.sellEnabledIndex, j3, false);
        }
        Boolean realmGet$rentEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rentEnabled();
        if (realmGet$rentEnabled != null) {
            Table.nativeSetBoolean(nativePtr, flatColumnInfo.rentEnabledIndex, j3, realmGet$rentEnabled.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.rentEnabledIndex, j3, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, flatColumnInfo.urlIndex, j3, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, flatColumnInfo.urlIndex, j3, false);
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
        Table table = realm2.getTable(Flat.class);
        long nativePtr = table.getNativePtr();
        FlatColumnInfo flatColumnInfo = (FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class);
        long j6 = flatColumnInfo.idIndex;
        while (it.hasNext()) {
            Flat flat = (Flat) it.next();
            if (!map2.containsKey(flat)) {
                if (flat instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flat;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flat, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat;
                String realmGet$id = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j6, realmGet$id) : j;
                map2.put(flat, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$flatId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatId();
                if (realmGet$flatId != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, flatColumnInfo.flatIdIndex, createRowWithPrimaryKey, realmGet$flatId, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, flatColumnInfo.flatIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.dateEndIndex, j3, realmGet$dateEnd, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.dateEndIndex, j3, false);
                }
                String realmGet$imgBig = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBig();
                if (realmGet$imgBig != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.imgBigIndex, j3, realmGet$imgBig, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.imgBigIndex, j3, false);
                }
                byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgBigBytes();
                if (realmGet$imgBigBytes != null) {
                    Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgBigBytesIndex, j3, realmGet$imgBigBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.imgBigBytesIndex, j3, false);
                }
                String realmGet$imgSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmall();
                if (realmGet$imgSmall != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.imgSmallIndex, j3, realmGet$imgSmall, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.imgSmallIndex, j3, false);
                }
                byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imgSmallBytes();
                if (realmGet$imgSmallBytes != null) {
                    Table.nativeSetByteArray(nativePtr, flatColumnInfo.imgSmallBytesIndex, j3, realmGet$imgSmallBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.imgSmallBytesIndex, j3, false);
                }
                String realmGet$phoneNumber = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$phoneNumber();
                if (realmGet$phoneNumber != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.phoneNumberIndex, j3, realmGet$phoneNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.phoneNumberIndex, j3, false);
                }
                String realmGet$rooms = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rooms();
                if (realmGet$rooms != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.roomsIndex, j3, realmGet$rooms, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.roomsIndex, j3, false);
                }
                String realmGet$complexTitle = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexTitle();
                if (realmGet$complexTitle != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.complexTitleIndex, j3, realmGet$complexTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.complexTitleIndex, j3, false);
                }
                String realmGet$address = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.addressIndex, j3, realmGet$address, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.addressIndex, j3, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.complexIdIndex, j3, realmGet$complexId, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.complexIdIndex, j3, false);
                }
                Double realmGet$square = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetDouble(nativePtr, flatColumnInfo.squareIndex, j3, realmGet$square.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.squareIndex, j3, false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.priceIndex, j3, realmGet$price, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.priceIndex, j3, false);
                }
                String realmGet$priceOld = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$priceOld();
                if (realmGet$priceOld != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.priceOldIndex, j3, realmGet$priceOld, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.priceOldIndex, j3, false);
                }
                Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$isAction();
                if (realmGet$isAction != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.isActionIndex, j3, realmGet$isAction.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.isActionIndex, j3, false);
                }
                Integer realmGet$floor = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetLong(nativePtr, flatColumnInfo.floorIndex, j3, realmGet$floor.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.floorIndex, j3, false);
                }
                String realmGet$floorTotal = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$floorTotal();
                if (realmGet$floorTotal != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.floorTotalIndex, j3, realmGet$floorTotal, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.floorTotalIndex, j3, false);
                }
                String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$descriptionSmall();
                if (realmGet$descriptionSmall != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.descriptionSmallIndex, j3, realmGet$descriptionSmall, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.descriptionSmallIndex, j3, false);
                }
                Integer realmGet$favorites = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$favorites();
                if (realmGet$favorites != null) {
                    Table.nativeSetLong(nativePtr, flatColumnInfo.favoritesIndex, j3, realmGet$favorites.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.favoritesIndex, j3, false);
                }
                long j7 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j7), flatColumnInfo.flatInfoListIndex);
                RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$flatInfoList();
                if (realmGet$flatInfoList == null || ((long) realmGet$flatInfoList.size()) != osList.size()) {
                    j4 = j7;
                    osList.removeAll();
                    if (realmGet$flatInfoList != null) {
                        Iterator<FlatInfo> it2 = realmGet$flatInfoList.iterator();
                        while (it2.hasNext()) {
                            FlatInfo next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$flatInfoList.size();
                    int i = 0;
                    while (i < size) {
                        FlatInfo flatInfo = realmGet$flatInfoList.get(i);
                        Long l2 = map2.get(flatInfo);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.insertOrUpdate(realm2, flatInfo, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j7 = j7;
                    }
                    j4 = j7;
                }
                ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$imageSize();
                if (realmGet$imageSize != null) {
                    Long l3 = map2.get(realmGet$imageSize);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.insertOrUpdate(realm2, realmGet$imageSize, map2));
                    }
                    j5 = j4;
                    Table.nativeSetLink(nativePtr, flatColumnInfo.imageSizeIndex, j4, l3.longValue(), false);
                } else {
                    j5 = j4;
                    Table.nativeNullifyLink(nativePtr, flatColumnInfo.imageSizeIndex, j5);
                }
                FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$buttonTexts();
                if (realmGet$buttonTexts != null) {
                    Long l4 = map2.get(realmGet$buttonTexts);
                    if (l4 == null) {
                        l4 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.insertOrUpdate(realm2, realmGet$buttonTexts, map2));
                    }
                    Table.nativeSetLink(nativePtr, flatColumnInfo.buttonTextsIndex, j5, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, flatColumnInfo.buttonTextsIndex, j5);
                }
                Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$pamyatka();
                if (realmGet$pamyatka != null) {
                    Long l5 = map2.get(realmGet$pamyatka);
                    if (l5 == null) {
                        l5 = Long.valueOf(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.insertOrUpdate(realm2, realmGet$pamyatka, map2));
                    }
                    Table.nativeSetLink(nativePtr, flatColumnInfo.pamyatkaIndex, j5, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, flatColumnInfo.pamyatkaIndex, j5);
                }
                Boolean realmGet$sellEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$sellEnabled();
                if (realmGet$sellEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.sellEnabledIndex, j5, realmGet$sellEnabled.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.sellEnabledIndex, j5, false);
                }
                Boolean realmGet$rentEnabled = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$rentEnabled();
                if (realmGet$rentEnabled != null) {
                    Table.nativeSetBoolean(nativePtr, flatColumnInfo.rentEnabledIndex, j5, realmGet$rentEnabled.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.rentEnabledIndex, j5, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, flatColumnInfo.urlIndex, j5, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatColumnInfo.urlIndex, j5, false);
                }
                j6 = j2;
            }
        }
    }

    public static Flat createDetachedCopy(Flat flat, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Flat flat2;
        if (i > i2 || flat == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(flat);
        if (cacheData == null) {
            flat2 = new Flat();
            map.put(flat, new RealmObjectProxy.CacheData(i, flat2));
        } else if (i >= cacheData.minDepth) {
            return (Flat) cacheData.object;
        } else {
            cacheData.minDepth = i;
            flat2 = (Flat) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat2;
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface2 = flat;
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatId(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$flatId());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBig(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgBig());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgBigBytes(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgBigBytes());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmall(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgSmall());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imgSmallBytes(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgSmallBytes());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$phoneNumber(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$phoneNumber());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rooms(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$rooms());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexTitle(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$complexTitle());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$address());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$complexId(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$complexId());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$square(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$square());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$price(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$priceOld(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$priceOld());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$isAction(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$isAction());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floor(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$floor());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$floorTotal(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$floorTotal());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$descriptionSmall(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$descriptionSmall());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$favorites(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$favorites());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatInfoList((RealmList<FlatInfo>) null);
        } else {
            RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$flatInfoList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$flatInfoList(realmList);
            int i3 = i + 1;
            int size = realmGet$flatInfoList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.createDetachedCopy(realmGet$flatInfoList.get(i4), i3, i2, map));
            }
        }
        int i5 = i + 1;
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$imageSize(ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imageSize(), i5, i2, map));
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$buttonTexts(ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$buttonTexts(), i5, i2, map));
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$pamyatka(ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$pamyatka(), i5, i2, map));
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$sellEnabled(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$sellEnabled());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$rentEnabled(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$rentEnabled());
        ru_unicorn_ujin_data_realm_flatrealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$url());
        return flat2;
    }

    static Flat update(Realm realm, FlatColumnInfo flatColumnInfo, Flat flat, Flat flat2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        FlatColumnInfo flatColumnInfo2 = flatColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface = flat;
        ru_unicorn_ujin_data_realm_FlatRealmProxyInterface ru_unicorn_ujin_data_realm_flatrealmproxyinterface2 = flat2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Flat.class), flatColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(flatColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(flatColumnInfo2.flatIdIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$flatId());
        osObjectBuilder.addString(flatColumnInfo2.dateEndIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$dateEnd());
        osObjectBuilder.addString(flatColumnInfo2.imgBigIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgBig());
        osObjectBuilder.addByteArray(flatColumnInfo2.imgBigBytesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgBigBytes());
        osObjectBuilder.addString(flatColumnInfo2.imgSmallIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgSmall());
        osObjectBuilder.addByteArray(flatColumnInfo2.imgSmallBytesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imgSmallBytes());
        osObjectBuilder.addString(flatColumnInfo2.phoneNumberIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$phoneNumber());
        osObjectBuilder.addString(flatColumnInfo2.roomsIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$rooms());
        osObjectBuilder.addString(flatColumnInfo2.complexTitleIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$complexTitle());
        osObjectBuilder.addString(flatColumnInfo2.addressIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$address());
        osObjectBuilder.addString(flatColumnInfo2.complexIdIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$complexId());
        osObjectBuilder.addDouble(flatColumnInfo2.squareIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$square());
        osObjectBuilder.addString(flatColumnInfo2.priceIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$price());
        osObjectBuilder.addString(flatColumnInfo2.priceOldIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$priceOld());
        osObjectBuilder.addBoolean(flatColumnInfo2.isActionIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$isAction());
        osObjectBuilder.addInteger(flatColumnInfo2.floorIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$floor());
        osObjectBuilder.addString(flatColumnInfo2.floorTotalIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$floorTotal());
        osObjectBuilder.addString(flatColumnInfo2.descriptionSmallIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$descriptionSmall());
        osObjectBuilder.addInteger(flatColumnInfo2.favoritesIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$favorites());
        RealmList<FlatInfo> realmGet$flatInfoList = ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$flatInfoList();
        if (realmGet$flatInfoList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$flatInfoList.size(); i++) {
                FlatInfo flatInfo = realmGet$flatInfoList.get(i);
                FlatInfo flatInfo2 = (FlatInfo) map2.get(flatInfo);
                if (flatInfo2 != null) {
                    realmList.add(flatInfo2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatInfoRealmProxy.FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class), flatInfo, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(flatColumnInfo2.flatInfoListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(flatColumnInfo2.flatInfoListIndex, new RealmList());
        }
        ImageSize realmGet$imageSize = ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$imageSize();
        if (realmGet$imageSize == null) {
            osObjectBuilder.addNull(flatColumnInfo2.imageSizeIndex);
        } else {
            ImageSize imageSize = (ImageSize) map2.get(realmGet$imageSize);
            if (imageSize != null) {
                osObjectBuilder.addObject(flatColumnInfo2.imageSizeIndex, imageSize);
            } else {
                osObjectBuilder.addObject(flatColumnInfo2.imageSizeIndex, ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class), realmGet$imageSize, true, map, set));
            }
        }
        FlatButtons realmGet$buttonTexts = ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$buttonTexts();
        if (realmGet$buttonTexts == null) {
            osObjectBuilder.addNull(flatColumnInfo2.buttonTextsIndex);
        } else {
            FlatButtons flatButtons = (FlatButtons) map2.get(realmGet$buttonTexts);
            if (flatButtons != null) {
                osObjectBuilder.addObject(flatColumnInfo2.buttonTextsIndex, flatButtons);
            } else {
                osObjectBuilder.addObject(flatColumnInfo2.buttonTextsIndex, ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.FlatButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatButtons.class), realmGet$buttonTexts, true, map, set));
            }
        }
        Pamyatka realmGet$pamyatka = ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$pamyatka();
        if (realmGet$pamyatka == null) {
            osObjectBuilder.addNull(flatColumnInfo2.pamyatkaIndex);
        } else {
            Pamyatka pamyatka = (Pamyatka) map2.get(realmGet$pamyatka);
            if (pamyatka != null) {
                osObjectBuilder.addObject(flatColumnInfo2.pamyatkaIndex, pamyatka);
            } else {
                osObjectBuilder.addObject(flatColumnInfo2.pamyatkaIndex, ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class), realmGet$pamyatka, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(flatColumnInfo2.sellEnabledIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$sellEnabled());
        osObjectBuilder.addBoolean(flatColumnInfo2.rentEnabledIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$rentEnabled());
        osObjectBuilder.addString(flatColumnInfo2.urlIndex, ru_unicorn_ujin_data_realm_flatrealmproxyinterface2.realmGet$url());
        osObjectBuilder.updateExistingObject();
        return flat;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Flat = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{flatId:");
        sb.append(realmGet$flatId() != null ? realmGet$flatId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateEnd:");
        sb.append(realmGet$dateEnd() != null ? realmGet$dateEnd() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imgBig:");
        sb.append(realmGet$imgBig() != null ? realmGet$imgBig() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imgBigBytes:");
        sb.append(realmGet$imgBigBytes() != null ? realmGet$imgBigBytes() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imgSmall:");
        sb.append(realmGet$imgSmall() != null ? realmGet$imgSmall() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imgSmallBytes:");
        sb.append(realmGet$imgSmallBytes() != null ? realmGet$imgSmallBytes() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{phoneNumber:");
        sb.append(realmGet$phoneNumber() != null ? realmGet$phoneNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rooms:");
        sb.append(realmGet$rooms() != null ? realmGet$rooms() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{complexTitle:");
        sb.append(realmGet$complexTitle() != null ? realmGet$complexTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{address:");
        sb.append(realmGet$address() != null ? realmGet$address() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{complexId:");
        sb.append(realmGet$complexId() != null ? realmGet$complexId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{square:");
        sb.append(realmGet$square() != null ? realmGet$square() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price() != null ? realmGet$price() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{priceOld:");
        sb.append(realmGet$priceOld() != null ? realmGet$priceOld() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isAction:");
        sb.append(realmGet$isAction() != null ? realmGet$isAction() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{floor:");
        sb.append(realmGet$floor() != null ? realmGet$floor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{floorTotal:");
        sb.append(realmGet$floorTotal() != null ? realmGet$floorTotal() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{descriptionSmall:");
        sb.append(realmGet$descriptionSmall() != null ? realmGet$descriptionSmall() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{favorites:");
        sb.append(realmGet$favorites() != null ? realmGet$favorites() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{flatInfoList:");
        sb.append("RealmList<FlatInfo>[");
        sb.append(realmGet$flatInfoList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{imageSize:");
        sb.append(realmGet$imageSize() != null ? ru_unicorn_ujin_data_realm_ImageSizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buttonTexts:");
        sb.append(realmGet$buttonTexts() != null ? ru_unicorn_ujin_data_realm_FlatButtonsRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{pamyatka:");
        sb.append(realmGet$pamyatka() != null ? ru_unicorn_ujin_data_realm_PamyatkaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{sellEnabled:");
        sb.append(realmGet$sellEnabled() != null ? realmGet$sellEnabled() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rentEnabled:");
        sb.append(realmGet$rentEnabled() != null ? realmGet$rentEnabled() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        if (realmGet$url() != null) {
            str = realmGet$url();
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
        ru_unicorn_ujin_data_realm_FlatRealmProxy ru_unicorn_ujin_data_realm_flatrealmproxy = (ru_unicorn_ujin_data_realm_FlatRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_flatrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_flatrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_flatrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
