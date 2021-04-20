package p035ru.unicorn.ujin.data.api.request.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/Consumer;", "", "surname", "", "name", "patronymic", "phone", "email", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getEmail", "getName", "getPatronymic", "getPhone", "getSurname", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.Consumer */
/* compiled from: CreateOrderBody.kt */
public final class Consumer {
    private final String address;
    private final String email;
    private final String name;
    private final String patronymic;
    private final String phone;
    private final String surname;

    public static /* synthetic */ Consumer copy$default(Consumer consumer, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consumer.surname;
        }
        if ((i & 2) != 0) {
            str2 = consumer.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = consumer.patronymic;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = consumer.phone;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = consumer.email;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = consumer.address;
        }
        return consumer.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.surname;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.patronymic;
    }

    public final String component4() {
        return this.phone;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.address;
    }

    public final Consumer copy(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "patronymic");
        Intrinsics.checkNotNullParameter(str4, "phone");
        Intrinsics.checkNotNullParameter(str5, "email");
        Intrinsics.checkNotNullParameter(str6, Contact.Type.address);
        return new Consumer(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Consumer)) {
            return false;
        }
        Consumer consumer = (Consumer) obj;
        return Intrinsics.areEqual((Object) this.surname, (Object) consumer.surname) && Intrinsics.areEqual((Object) this.name, (Object) consumer.name) && Intrinsics.areEqual((Object) this.patronymic, (Object) consumer.patronymic) && Intrinsics.areEqual((Object) this.phone, (Object) consumer.phone) && Intrinsics.areEqual((Object) this.email, (Object) consumer.email) && Intrinsics.areEqual((Object) this.address, (Object) consumer.address);
    }

    public int hashCode() {
        String str = this.surname;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.patronymic;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.phone;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.address;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "Consumer(surname=" + this.surname + ", name=" + this.name + ", patronymic=" + this.patronymic + ", phone=" + this.phone + ", email=" + this.email + ", address=" + this.address + ")";
    }

    public Consumer(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "patronymic");
        Intrinsics.checkNotNullParameter(str4, "phone");
        Intrinsics.checkNotNullParameter(str5, "email");
        Intrinsics.checkNotNullParameter(str6, Contact.Type.address);
        this.surname = str;
        this.name = str2;
        this.patronymic = str3;
        this.phone = str4;
        this.email = str5;
        this.address = str6;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPatronymic() {
        return this.patronymic;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getAddress() {
        return this.address;
    }
}
