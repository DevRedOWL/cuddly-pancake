package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.android.JsonUtils;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy */
public class ru_unicorn_ujin_data_realm_FavouriteRealmProxy extends Favourite implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FavouriteColumnInfo columnInfo;
    private ProxyState<Favourite> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Favourite";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy$FavouriteColumnInfo */
    static final class FavouriteColumnInfo extends ColumnInfo {
        long complexTitleIndex;
        long dateEndIndex;
        long descriptionSmallIndex;
        long favoritesIndex;
        long floorIndex;
        long floorTotalIndex;
        long idIndex;
        long imgBigBytesIndex;
        long imgBigIndex;
        long imgSmallBytesIndex;
        long imgSmallIndex;
        long isActionIndex;
        long maxColumnIndexValue;
        long numberIndex;
        long priceIndex;
        long priceOldIndex;
        long roomsIndex;
        long squareIndex;

        FavouriteColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(17);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.imgBigIndex = addColumnDetails("imgBig", "imgBig", objectSchemaInfo);
            this.imgBigBytesIndex = addColumnDetails("imgBigBytes", "imgBigBytes", objectSchemaInfo);
            this.imgSmallIndex = addColumnDetails("imgSmall", "imgSmall", objectSchemaInfo);
            this.imgSmallBytesIndex = addColumnDetails("imgSmallBytes", "imgSmallBytes", objectSchemaInfo);
            this.numberIndex = addColumnDetails(CardFragment.ARG_NUMBER, CardFragment.ARG_NUMBER, objectSchemaInfo);
            this.roomsIndex = addColumnDetails("rooms", "rooms", objectSchemaInfo);
            this.squareIndex = addColumnDetails("square", "square", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.priceOldIndex = addColumnDetails("priceOld", "priceOld", objectSchemaInfo);
            this.isActionIndex = addColumnDetails("isAction", "isAction", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.floorTotalIndex = addColumnDetails("floorTotal", "floorTotal", objectSchemaInfo);
            this.descriptionSmallIndex = addColumnDetails("descriptionSmall", "descriptionSmall", objectSchemaInfo);
            this.favoritesIndex = addColumnDetails("favorites", "favorites", objectSchemaInfo);
            this.complexTitleIndex = addColumnDetails("complexTitle", "complexTitle", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FavouriteColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FavouriteColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FavouriteColumnInfo favouriteColumnInfo = (FavouriteColumnInfo) columnInfo;
            FavouriteColumnInfo favouriteColumnInfo2 = (FavouriteColumnInfo) columnInfo2;
            favouriteColumnInfo2.idIndex = favouriteColumnInfo.idIndex;
            favouriteColumnInfo2.dateEndIndex = favouriteColumnInfo.dateEndIndex;
            favouriteColumnInfo2.imgBigIndex = favouriteColumnInfo.imgBigIndex;
            favouriteColumnInfo2.imgBigBytesIndex = favouriteColumnInfo.imgBigBytesIndex;
            favouriteColumnInfo2.imgSmallIndex = favouriteColumnInfo.imgSmallIndex;
            favouriteColumnInfo2.imgSmallBytesIndex = favouriteColumnInfo.imgSmallBytesIndex;
            favouriteColumnInfo2.numberIndex = favouriteColumnInfo.numberIndex;
            favouriteColumnInfo2.roomsIndex = favouriteColumnInfo.roomsIndex;
            favouriteColumnInfo2.squareIndex = favouriteColumnInfo.squareIndex;
            favouriteColumnInfo2.priceIndex = favouriteColumnInfo.priceIndex;
            favouriteColumnInfo2.priceOldIndex = favouriteColumnInfo.priceOldIndex;
            favouriteColumnInfo2.isActionIndex = favouriteColumnInfo.isActionIndex;
            favouriteColumnInfo2.floorIndex = favouriteColumnInfo.floorIndex;
            favouriteColumnInfo2.floorTotalIndex = favouriteColumnInfo.floorTotalIndex;
            favouriteColumnInfo2.descriptionSmallIndex = favouriteColumnInfo.descriptionSmallIndex;
            favouriteColumnInfo2.favoritesIndex = favouriteColumnInfo.favoritesIndex;
            favouriteColumnInfo2.complexTitleIndex = favouriteColumnInfo.complexTitleIndex;
            favouriteColumnInfo2.maxColumnIndexValue = favouriteColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FavouriteRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FavouriteColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.numberIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.numberIndex));
    }

    public void realmSet$number(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.numberIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.numberIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.numberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.numberIndex, row$realm.getIndex(), (long) num.intValue(), true);
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

    public String realmGet$square() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.squareIndex);
    }

    public void realmSet$square(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.squareIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.squareIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.squareIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.squareIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$floor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.floorIndex);
    }

    public void realmSet$floor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.floorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.floorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.floorIndex, row$realm.getIndex(), str, true);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 17, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgBig", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgBigBytes", RealmFieldType.BINARY, false, false, false);
        builder2.addPersistedProperty("imgSmall", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("imgSmallBytes", RealmFieldType.BINARY, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_NUMBER, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("rooms", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("square", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("price", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("priceOld", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isAction", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("floor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("floorTotal", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("descriptionSmall", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("favorites", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("complexTitle", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FavouriteColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FavouriteColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Favourite createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r14 = p035ru.unicorn.ujin.data.realm.Favourite.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r4 = p035ru.unicorn.ujin.data.realm.Favourite.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy$FavouriteColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.FavouriteColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r1)
            long r3 = r14.findFirstString(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r3 = p035ru.unicorn.ujin.data.realm.Favourite.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0095
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x008d
            boolean r14 = r13.isNull(r1)
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r14 = p035ru.unicorn.ujin.data.realm.Favourite.class
            r1 = 1
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r1, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy) r14
            goto L_0x0095
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r14 = p035ru.unicorn.ujin.data.realm.Favourite.class
            java.lang.String r1 = r13.getString(r1)
            r3 = 1
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface) r12
            java.lang.String r0 = "dateEnd"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b1
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00aa
            r12.realmSet$dateEnd(r2)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$dateEnd(r0)
        L_0x00b1:
            java.lang.String r0 = "imgBig"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c3
            r12.realmSet$imgBig(r2)
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$imgBig(r0)
        L_0x00ca:
            java.lang.String r0 = "imgBigBytes"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00dc
            r12.realmSet$imgBigBytes(r2)
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r0 = r13.getString(r0)
            byte[] r0 = p046io.realm.internal.android.JsonUtils.stringToBytes(r0)
            r12.realmSet$imgBigBytes(r0)
        L_0x00e7:
            java.lang.String r0 = "imgSmall"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0100
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f9
            r12.realmSet$imgSmall(r2)
            goto L_0x0100
        L_0x00f9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$imgSmall(r0)
        L_0x0100:
            java.lang.String r0 = "imgSmallBytes"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x011d
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0112
            r12.realmSet$imgSmallBytes(r2)
            goto L_0x011d
        L_0x0112:
            java.lang.String r0 = r13.getString(r0)
            byte[] r0 = p046io.realm.internal.android.JsonUtils.stringToBytes(r0)
            r12.realmSet$imgSmallBytes(r0)
        L_0x011d:
            java.lang.String r0 = "number"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x013a
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x012f
            r12.realmSet$number(r2)
            goto L_0x013a
        L_0x012f:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$number(r0)
        L_0x013a:
            java.lang.String r0 = "rooms"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0153
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x014c
            r12.realmSet$rooms(r2)
            goto L_0x0153
        L_0x014c:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$rooms(r0)
        L_0x0153:
            java.lang.String r0 = "square"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x016c
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0165
            r12.realmSet$square(r2)
            goto L_0x016c
        L_0x0165:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$square(r0)
        L_0x016c:
            java.lang.String r0 = "price"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0185
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x017e
            r12.realmSet$price(r2)
            goto L_0x0185
        L_0x017e:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$price(r0)
        L_0x0185:
            java.lang.String r0 = "priceOld"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x019e
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0197
            r12.realmSet$priceOld(r2)
            goto L_0x019e
        L_0x0197:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$priceOld(r0)
        L_0x019e:
            java.lang.String r0 = "isAction"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01bb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x01b0
            r12.realmSet$isAction(r2)
            goto L_0x01bb
        L_0x01b0:
            boolean r0 = r13.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.realmSet$isAction(r0)
        L_0x01bb:
            java.lang.String r0 = "floor"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01d4
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x01cd
            r12.realmSet$floor(r2)
            goto L_0x01d4
        L_0x01cd:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$floor(r0)
        L_0x01d4:
            java.lang.String r0 = "floorTotal"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01ed
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x01e6
            r12.realmSet$floorTotal(r2)
            goto L_0x01ed
        L_0x01e6:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$floorTotal(r0)
        L_0x01ed:
            java.lang.String r0 = "descriptionSmall"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = "descriptionSmall"
            boolean r0 = r13.isNull(r0)
            if (r0 == 0) goto L_0x0201
            r12.realmSet$descriptionSmall(r2)
            goto L_0x020a
        L_0x0201:
            java.lang.String r0 = "descriptionSmall"
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$descriptionSmall(r0)
        L_0x020a:
            java.lang.String r0 = "favorites"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "favorites"
            boolean r0 = r13.isNull(r0)
            if (r0 == 0) goto L_0x021e
            r12.realmSet$favorites(r2)
            goto L_0x022b
        L_0x021e:
            java.lang.String r0 = "favorites"
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$favorites(r0)
        L_0x022b:
            java.lang.String r0 = "complexTitle"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = "complexTitle"
            boolean r0 = r13.isNull(r0)
            if (r0 == 0) goto L_0x023f
            r12.realmSet$complexTitle(r2)
            goto L_0x0248
        L_0x023f:
            java.lang.String r0 = "complexTitle"
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$complexTitle(r13)
        L_0x0248:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Favourite");
    }

    public static Favourite createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Favourite favourite = new Favourite();
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$dateEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$dateEnd((String) null);
                }
            } else if (nextName.equals("imgBig")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBig(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBig((String) null);
                }
            } else if (nextName.equals("imgBigBytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBigBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBigBytes((byte[]) null);
                }
            } else if (nextName.equals("imgSmall")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmall(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmall((String) null);
                }
            } else if (nextName.equals("imgSmallBytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmallBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmallBytes((byte[]) null);
                }
            } else if (nextName.equals(CardFragment.ARG_NUMBER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$number(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$number((Integer) null);
                }
            } else if (nextName.equals("rooms")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$rooms(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$rooms((String) null);
                }
            } else if (nextName.equals("square")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$square(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$square((String) null);
                }
            } else if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$price(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$price((String) null);
                }
            } else if (nextName.equals("priceOld")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$priceOld(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$priceOld((String) null);
                }
            } else if (nextName.equals("isAction")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$isAction(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$isAction((Boolean) null);
                }
            } else if (nextName.equals("floor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floor((String) null);
                }
            } else if (nextName.equals("floorTotal")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floorTotal(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floorTotal((String) null);
                }
            } else if (nextName.equals("descriptionSmall")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$descriptionSmall(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$descriptionSmall((String) null);
                }
            } else if (nextName.equals("favorites")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$favorites(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$favorites((Integer) null);
                }
            } else if (!nextName.equals("complexTitle")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$complexTitle(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$complexTitle((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Favourite) realm.copyToRealm(favourite, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_FavouriteRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FavouriteRealmProxy ru_unicorn_ujin_data_realm_favouriterealmproxy = new ru_unicorn_ujin_data_realm_FavouriteRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_favouriterealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Favourite copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.FavouriteColumnInfo r9, p035ru.unicorn.ujin.data.realm.Favourite r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Favourite r1 = (p035ru.unicorn.ujin.data.realm.Favourite) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Favourite> r2 = p035ru.unicorn.ujin.data.realm.Favourite.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Favourite r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Favourite r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_FavouriteRealmProxy$FavouriteColumnInfo, ru.unicorn.ujin.data.realm.Favourite, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Favourite");
    }

    public static Favourite copy(Realm realm, FavouriteColumnInfo favouriteColumnInfo, Favourite favourite, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(favourite);
        if (realmObjectProxy != null) {
            return (Favourite) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Favourite.class), favouriteColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(favouriteColumnInfo.idIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(favouriteColumnInfo.dateEndIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$dateEnd());
        osObjectBuilder.addString(favouriteColumnInfo.imgBigIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBig());
        osObjectBuilder.addByteArray(favouriteColumnInfo.imgBigBytesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBigBytes());
        osObjectBuilder.addString(favouriteColumnInfo.imgSmallIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmall());
        osObjectBuilder.addByteArray(favouriteColumnInfo.imgSmallBytesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmallBytes());
        osObjectBuilder.addInteger(favouriteColumnInfo.numberIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$number());
        osObjectBuilder.addString(favouriteColumnInfo.roomsIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$rooms());
        osObjectBuilder.addString(favouriteColumnInfo.squareIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$square());
        osObjectBuilder.addString(favouriteColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$price());
        osObjectBuilder.addString(favouriteColumnInfo.priceOldIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$priceOld());
        osObjectBuilder.addBoolean(favouriteColumnInfo.isActionIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$isAction());
        osObjectBuilder.addString(favouriteColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floor());
        osObjectBuilder.addString(favouriteColumnInfo.floorTotalIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floorTotal());
        osObjectBuilder.addString(favouriteColumnInfo.descriptionSmallIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$descriptionSmall());
        osObjectBuilder.addInteger(favouriteColumnInfo.favoritesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$favorites());
        osObjectBuilder.addString(favouriteColumnInfo.complexTitleIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$complexTitle());
        ru_unicorn_ujin_data_realm_FavouriteRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(favourite, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Favourite favourite, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Favourite favourite2 = favourite;
        if (favourite2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) favourite2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Favourite.class);
        long nativePtr = table.getNativePtr();
        FavouriteColumnInfo favouriteColumnInfo = (FavouriteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class);
        long j3 = favouriteColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite2;
        String realmGet$id = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(favourite2, Long.valueOf(j2));
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.dateEndIndex, j2, realmGet$dateEnd, false);
        }
        String realmGet$imgBig = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBig();
        if (realmGet$imgBig != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.imgBigIndex, j2, realmGet$imgBig, false);
        }
        byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBigBytes();
        if (realmGet$imgBigBytes != null) {
            Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgBigBytesIndex, j2, realmGet$imgBigBytes, false);
        }
        String realmGet$imgSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmall();
        if (realmGet$imgSmall != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.imgSmallIndex, j2, realmGet$imgSmall, false);
        }
        byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmallBytes();
        if (realmGet$imgSmallBytes != null) {
            Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, j2, realmGet$imgSmallBytes, false);
        }
        Integer realmGet$number = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetLong(nativePtr, favouriteColumnInfo.numberIndex, j2, realmGet$number.longValue(), false);
        }
        String realmGet$rooms = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$rooms();
        if (realmGet$rooms != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.roomsIndex, j2, realmGet$rooms, false);
        }
        String realmGet$square = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.squareIndex, j2, realmGet$square, false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.priceIndex, j2, realmGet$price, false);
        }
        String realmGet$priceOld = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$priceOld();
        if (realmGet$priceOld != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.priceOldIndex, j2, realmGet$priceOld, false);
        }
        Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$isAction();
        if (realmGet$isAction != null) {
            Table.nativeSetBoolean(nativePtr, favouriteColumnInfo.isActionIndex, j2, realmGet$isAction.booleanValue(), false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.floorIndex, j2, realmGet$floor, false);
        }
        String realmGet$floorTotal = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floorTotal();
        if (realmGet$floorTotal != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.floorTotalIndex, j2, realmGet$floorTotal, false);
        }
        String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$descriptionSmall();
        if (realmGet$descriptionSmall != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.descriptionSmallIndex, j2, realmGet$descriptionSmall, false);
        }
        Integer realmGet$favorites = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$favorites();
        if (realmGet$favorites != null) {
            Table.nativeSetLong(nativePtr, favouriteColumnInfo.favoritesIndex, j2, realmGet$favorites.longValue(), false);
        }
        String realmGet$complexTitle = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$complexTitle();
        if (realmGet$complexTitle != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.complexTitleIndex, j2, realmGet$complexTitle, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Favourite.class);
        long nativePtr = table.getNativePtr();
        FavouriteColumnInfo favouriteColumnInfo = (FavouriteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class);
        long j4 = favouriteColumnInfo.idIndex;
        while (it.hasNext()) {
            Favourite favourite = (Favourite) it.next();
            if (!map2.containsKey(favourite)) {
                if (favourite instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) favourite;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(favourite, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite;
                String realmGet$id = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(favourite, Long.valueOf(j2));
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.dateEndIndex, j2, realmGet$dateEnd, false);
                } else {
                    j3 = j4;
                }
                String realmGet$imgBig = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBig();
                if (realmGet$imgBig != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.imgBigIndex, j2, realmGet$imgBig, false);
                }
                byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBigBytes();
                if (realmGet$imgBigBytes != null) {
                    Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgBigBytesIndex, j2, realmGet$imgBigBytes, false);
                }
                String realmGet$imgSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmall();
                if (realmGet$imgSmall != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.imgSmallIndex, j2, realmGet$imgSmall, false);
                }
                byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmallBytes();
                if (realmGet$imgSmallBytes != null) {
                    Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, j2, realmGet$imgSmallBytes, false);
                }
                Integer realmGet$number = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetLong(nativePtr, favouriteColumnInfo.numberIndex, j2, realmGet$number.longValue(), false);
                }
                String realmGet$rooms = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$rooms();
                if (realmGet$rooms != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.roomsIndex, j2, realmGet$rooms, false);
                }
                String realmGet$square = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.squareIndex, j2, realmGet$square, false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.priceIndex, j2, realmGet$price, false);
                }
                String realmGet$priceOld = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$priceOld();
                if (realmGet$priceOld != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.priceOldIndex, j2, realmGet$priceOld, false);
                }
                Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$isAction();
                if (realmGet$isAction != null) {
                    Table.nativeSetBoolean(nativePtr, favouriteColumnInfo.isActionIndex, j2, realmGet$isAction.booleanValue(), false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.floorIndex, j2, realmGet$floor, false);
                }
                String realmGet$floorTotal = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floorTotal();
                if (realmGet$floorTotal != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.floorTotalIndex, j2, realmGet$floorTotal, false);
                }
                String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$descriptionSmall();
                if (realmGet$descriptionSmall != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.descriptionSmallIndex, j2, realmGet$descriptionSmall, false);
                }
                Integer realmGet$favorites = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$favorites();
                if (realmGet$favorites != null) {
                    Table.nativeSetLong(nativePtr, favouriteColumnInfo.favoritesIndex, j2, realmGet$favorites.longValue(), false);
                }
                String realmGet$complexTitle = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$complexTitle();
                if (realmGet$complexTitle != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.complexTitleIndex, j2, realmGet$complexTitle, false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Favourite favourite, Map<RealmModel, Long> map) {
        long j;
        Favourite favourite2 = favourite;
        if (favourite2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) favourite2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Favourite.class);
        long nativePtr = table.getNativePtr();
        FavouriteColumnInfo favouriteColumnInfo = (FavouriteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class);
        long j2 = favouriteColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite2;
        String realmGet$id = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(favourite2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.dateEndIndex, createRowWithPrimaryKey, realmGet$dateEnd, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.dateEndIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$imgBig = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBig();
        if (realmGet$imgBig != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.imgBigIndex, createRowWithPrimaryKey, realmGet$imgBig, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgBigIndex, createRowWithPrimaryKey, false);
        }
        byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBigBytes();
        if (realmGet$imgBigBytes != null) {
            Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgBigBytesIndex, createRowWithPrimaryKey, realmGet$imgBigBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgBigBytesIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$imgSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmall();
        if (realmGet$imgSmall != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.imgSmallIndex, createRowWithPrimaryKey, realmGet$imgSmall, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgSmallIndex, createRowWithPrimaryKey, false);
        }
        byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmallBytes();
        if (realmGet$imgSmallBytes != null) {
            Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, createRowWithPrimaryKey, realmGet$imgSmallBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$number = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetLong(nativePtr, favouriteColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.numberIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$rooms = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$rooms();
        if (realmGet$rooms != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.roomsIndex, createRowWithPrimaryKey, realmGet$rooms, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.roomsIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$square = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.squareIndex, createRowWithPrimaryKey, realmGet$square, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.squareIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.priceIndex, createRowWithPrimaryKey, realmGet$price, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.priceIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$priceOld = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$priceOld();
        if (realmGet$priceOld != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.priceOldIndex, createRowWithPrimaryKey, realmGet$priceOld, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.priceOldIndex, createRowWithPrimaryKey, false);
        }
        Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$isAction();
        if (realmGet$isAction != null) {
            Table.nativeSetBoolean(nativePtr, favouriteColumnInfo.isActionIndex, createRowWithPrimaryKey, realmGet$isAction.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.isActionIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.floorIndex, createRowWithPrimaryKey, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.floorIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$floorTotal = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floorTotal();
        if (realmGet$floorTotal != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.floorTotalIndex, createRowWithPrimaryKey, realmGet$floorTotal, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.floorTotalIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$descriptionSmall();
        if (realmGet$descriptionSmall != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.descriptionSmallIndex, createRowWithPrimaryKey, realmGet$descriptionSmall, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.descriptionSmallIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$favorites = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$favorites();
        if (realmGet$favorites != null) {
            Table.nativeSetLong(nativePtr, favouriteColumnInfo.favoritesIndex, createRowWithPrimaryKey, realmGet$favorites.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.favoritesIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$complexTitle = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$complexTitle();
        if (realmGet$complexTitle != null) {
            Table.nativeSetString(nativePtr, favouriteColumnInfo.complexTitleIndex, createRowWithPrimaryKey, realmGet$complexTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, favouriteColumnInfo.complexTitleIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Favourite.class);
        long nativePtr = table.getNativePtr();
        FavouriteColumnInfo favouriteColumnInfo = (FavouriteColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Favourite.class);
        long j3 = favouriteColumnInfo.idIndex;
        while (it.hasNext()) {
            Favourite favourite = (Favourite) it.next();
            if (!map2.containsKey(favourite)) {
                if (favourite instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) favourite;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(favourite, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite;
                String realmGet$id = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(favourite, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.dateEndIndex, createRowWithPrimaryKey, realmGet$dateEnd, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.dateEndIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$imgBig = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBig();
                if (realmGet$imgBig != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.imgBigIndex, createRowWithPrimaryKey, realmGet$imgBig, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgBigIndex, createRowWithPrimaryKey, false);
                }
                byte[] realmGet$imgBigBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgBigBytes();
                if (realmGet$imgBigBytes != null) {
                    Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgBigBytesIndex, createRowWithPrimaryKey, realmGet$imgBigBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgBigBytesIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$imgSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmall();
                if (realmGet$imgSmall != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.imgSmallIndex, createRowWithPrimaryKey, realmGet$imgSmall, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgSmallIndex, createRowWithPrimaryKey, false);
                }
                byte[] realmGet$imgSmallBytes = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$imgSmallBytes();
                if (realmGet$imgSmallBytes != null) {
                    Table.nativeSetByteArray(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, createRowWithPrimaryKey, realmGet$imgSmallBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.imgSmallBytesIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$number = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetLong(nativePtr, favouriteColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.numberIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$rooms = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$rooms();
                if (realmGet$rooms != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.roomsIndex, createRowWithPrimaryKey, realmGet$rooms, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.roomsIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$square = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.squareIndex, createRowWithPrimaryKey, realmGet$square, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.squareIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.priceIndex, createRowWithPrimaryKey, realmGet$price, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.priceIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$priceOld = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$priceOld();
                if (realmGet$priceOld != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.priceOldIndex, createRowWithPrimaryKey, realmGet$priceOld, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.priceOldIndex, createRowWithPrimaryKey, false);
                }
                Boolean realmGet$isAction = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$isAction();
                if (realmGet$isAction != null) {
                    Table.nativeSetBoolean(nativePtr, favouriteColumnInfo.isActionIndex, createRowWithPrimaryKey, realmGet$isAction.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.isActionIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.floorIndex, createRowWithPrimaryKey, realmGet$floor, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.floorIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$floorTotal = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$floorTotal();
                if (realmGet$floorTotal != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.floorTotalIndex, createRowWithPrimaryKey, realmGet$floorTotal, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.floorTotalIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$descriptionSmall = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$descriptionSmall();
                if (realmGet$descriptionSmall != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.descriptionSmallIndex, createRowWithPrimaryKey, realmGet$descriptionSmall, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.descriptionSmallIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$favorites = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$favorites();
                if (realmGet$favorites != null) {
                    Table.nativeSetLong(nativePtr, favouriteColumnInfo.favoritesIndex, createRowWithPrimaryKey, realmGet$favorites.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.favoritesIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$complexTitle = ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmGet$complexTitle();
                if (realmGet$complexTitle != null) {
                    Table.nativeSetString(nativePtr, favouriteColumnInfo.complexTitleIndex, createRowWithPrimaryKey, realmGet$complexTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, favouriteColumnInfo.complexTitleIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static Favourite createDetachedCopy(Favourite favourite, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Favourite favourite2;
        if (i > i2 || favourite == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(favourite);
        if (cacheData == null) {
            favourite2 = new Favourite();
            map.put(favourite, new RealmObjectProxy.CacheData(i, favourite2));
        } else if (i >= cacheData.minDepth) {
            return (Favourite) cacheData.object;
        } else {
            cacheData.minDepth = i;
            favourite2 = (Favourite) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite2;
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2 = favourite;
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBig(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgBig());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgBigBytes(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgBigBytes());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmall(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgSmall());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$imgSmallBytes(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgSmallBytes());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$number(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$number());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$rooms(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$rooms());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$square(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$square());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$price(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$priceOld(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$priceOld());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$isAction(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$isAction());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floor(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$floor());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$floorTotal(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$floorTotal());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$descriptionSmall(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$descriptionSmall());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$favorites(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$favorites());
        ru_unicorn_ujin_data_realm_favouriterealmproxyinterface.realmSet$complexTitle(ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$complexTitle());
        return favourite2;
    }

    static Favourite update(Realm realm, FavouriteColumnInfo favouriteColumnInfo, Favourite favourite, Favourite favourite2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface = favourite;
        ru_unicorn_ujin_data_realm_FavouriteRealmProxyInterface ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2 = favourite2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Favourite.class), favouriteColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(favouriteColumnInfo.idIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(favouriteColumnInfo.dateEndIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$dateEnd());
        osObjectBuilder.addString(favouriteColumnInfo.imgBigIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgBig());
        osObjectBuilder.addByteArray(favouriteColumnInfo.imgBigBytesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgBigBytes());
        osObjectBuilder.addString(favouriteColumnInfo.imgSmallIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgSmall());
        osObjectBuilder.addByteArray(favouriteColumnInfo.imgSmallBytesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$imgSmallBytes());
        osObjectBuilder.addInteger(favouriteColumnInfo.numberIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$number());
        osObjectBuilder.addString(favouriteColumnInfo.roomsIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$rooms());
        osObjectBuilder.addString(favouriteColumnInfo.squareIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$square());
        osObjectBuilder.addString(favouriteColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$price());
        osObjectBuilder.addString(favouriteColumnInfo.priceOldIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$priceOld());
        osObjectBuilder.addBoolean(favouriteColumnInfo.isActionIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$isAction());
        osObjectBuilder.addString(favouriteColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$floor());
        osObjectBuilder.addString(favouriteColumnInfo.floorTotalIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$floorTotal());
        osObjectBuilder.addString(favouriteColumnInfo.descriptionSmallIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$descriptionSmall());
        osObjectBuilder.addInteger(favouriteColumnInfo.favoritesIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$favorites());
        osObjectBuilder.addString(favouriteColumnInfo.complexTitleIndex, ru_unicorn_ujin_data_realm_favouriterealmproxyinterface2.realmGet$complexTitle());
        osObjectBuilder.updateExistingObject();
        return favourite;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Favourite = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
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
        sb.append("{number:");
        sb.append(realmGet$number() != null ? realmGet$number() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rooms:");
        sb.append(realmGet$rooms() != null ? realmGet$rooms() : str);
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
        sb.append("{complexTitle:");
        if (realmGet$complexTitle() != null) {
            str = realmGet$complexTitle();
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
        ru_unicorn_ujin_data_realm_FavouriteRealmProxy ru_unicorn_ujin_data_realm_favouriterealmproxy = (ru_unicorn_ujin_data_realm_FavouriteRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_favouriterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_favouriterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_favouriterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
