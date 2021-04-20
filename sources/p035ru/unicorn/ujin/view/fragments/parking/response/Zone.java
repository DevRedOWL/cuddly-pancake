package p035ru.unicorn.ujin.view.fragments.parking.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.FileData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "", "id", "", "title", "", "plane", "Lru/unicorn/ujin/data/realm/FileData;", "schema", "(Ljava/lang/Integer;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileData;Lru/unicorn/ujin/data/realm/FileData;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlane", "()Lru/unicorn/ujin/data/realm/FileData;", "getSchema", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileData;Lru/unicorn/ujin/data/realm/FileData;)Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.Zone */
/* compiled from: MySlotsResponse.kt */
public final class Zone {

    /* renamed from: id */
    private final Integer f6940id;
    private final FileData plane;
    private final FileData schema;
    private final String title;

    public static /* synthetic */ Zone copy$default(Zone zone, Integer num, String str, FileData fileData, FileData fileData2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = zone.f6940id;
        }
        if ((i & 2) != 0) {
            str = zone.title;
        }
        if ((i & 4) != 0) {
            fileData = zone.plane;
        }
        if ((i & 8) != 0) {
            fileData2 = zone.schema;
        }
        return zone.copy(num, str, fileData, fileData2);
    }

    public final Integer component1() {
        return this.f6940id;
    }

    public final String component2() {
        return this.title;
    }

    public final FileData component3() {
        return this.plane;
    }

    public final FileData component4() {
        return this.schema;
    }

    public final Zone copy(Integer num, String str, FileData fileData, FileData fileData2) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new Zone(num, str, fileData, fileData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zone)) {
            return false;
        }
        Zone zone = (Zone) obj;
        return Intrinsics.areEqual((Object) this.f6940id, (Object) zone.f6940id) && Intrinsics.areEqual((Object) this.title, (Object) zone.title) && Intrinsics.areEqual((Object) this.plane, (Object) zone.plane) && Intrinsics.areEqual((Object) this.schema, (Object) zone.schema);
    }

    public int hashCode() {
        Integer num = this.f6940id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        FileData fileData = this.plane;
        int hashCode3 = (hashCode2 + (fileData != null ? fileData.hashCode() : 0)) * 31;
        FileData fileData2 = this.schema;
        if (fileData2 != null) {
            i = fileData2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Zone(id=" + this.f6940id + ", title=" + this.title + ", plane=" + this.plane + ", schema=" + this.schema + ")";
    }

    public Zone(Integer num, String str, FileData fileData, FileData fileData2) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.f6940id = num;
        this.title = str;
        this.plane = fileData;
        this.schema = fileData2;
    }

    public final Integer getId() {
        return this.f6940id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final FileData getPlane() {
        return this.plane;
    }

    public final FileData getSchema() {
        return this.schema;
    }
}
