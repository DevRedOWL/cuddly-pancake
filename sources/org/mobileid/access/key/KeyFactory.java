package org.mobileid.access.key;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo51343d2 = {"Lorg/mobileid/access/key/KeyFactory;", "", "storageId", "savedValued", "Lorg/mobileid/access/key/Key;", "getKeyFromStorage", "(Ljava/lang/String;Ljava/lang/String;)Lorg/mobileid/access/key/Key;", "prefix", "mobileId", "Lorg/mobileid/access/key/SimpleKey;", "getSimpleKeyByPrefix", "(Ljava/lang/String;Ljava/lang/String;)Lorg/mobileid/access/key/SimpleKey;", "", "isDefault", "getSimpleKeyByStorageId", "(Ljava/lang/String;Ljava/lang/String;Z)Lorg/mobileid/access/key/SimpleKey;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class KeyFactory {
    public final Key getKeyFromStorage(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "storageId");
        Intrinsics.checkNotNullParameter(str2, "savedValued");
        return TimeKey.Companion.isStorageTimeKeyId(str) ? TimeKey.Companion.fromStorage(str, str2) : NetworkKey.Companion.isNetworkStorageKeyId(str) ? NetworkKey.Companion.fromStorage(str, str2) : EncryptedKey.Companion.isEncryptedStorageKeyId(str) ? EncryptedKey.Companion.fromStorage(str, str2) : PersonalKey.Companion.isPersonalStorageKeyId(str) ? PersonalKey.Companion.fromStorage(str, str2) : CompanyKey.Companion.fromStorage(str, str2);
    }

    public final SimpleKey getSimpleKeyByPrefix(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        return NetworkKey.Companion.isNetworkKeyPrefix(str) ? new NetworkKey((String) null, str2, (String) null, 0, false, 29, (DefaultConstructorMarker) null) : EncryptedKey.Companion.isEncryptedKeyPrefix(str) ? new EncryptedKey((String) null, str2, (String) null, 0, false, 29, (DefaultConstructorMarker) null) : PersonalKey.Companion.isPersonalKeyPrefix(str) ? new PersonalKey((String) null, str2, (String) null, 0, false, 29, (DefaultConstructorMarker) null) : new CompanyKey((String) null, str, 0, str2, false, 21, (DefaultConstructorMarker) null);
    }

    public final SimpleKey getSimpleKeyByStorageId(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "storageId");
        Intrinsics.checkNotNullParameter(str2, "mobileId");
        return NetworkKey.Companion.isNetworkStorageKeyId(str) ? new NetworkKey((String) null, str2, (String) null, 0, z, 13, (DefaultConstructorMarker) null) : EncryptedKey.Companion.isEncryptedStorageKeyId(str) ? new EncryptedKey((String) null, str2, (String) null, 0, z, 13, (DefaultConstructorMarker) null) : PersonalKey.Companion.isPersonalStorageKeyId(str) ? new PersonalKey((String) null, str2, (String) null, 0, z, 13, (DefaultConstructorMarker) null) : new CompanyKey((String) null, str, 0, str2, z, 5, (DefaultConstructorMarker) null);
    }
}
