package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: PublicSuffixDatabase.kt */
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends MutablePropertyReference0 {
    PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase);
    }

    public String getName() {
        return "publicSuffixListBytes";
    }

    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(PublicSuffixDatabase.class);
    }

    public String getSignature() {
        return "getPublicSuffixListBytes()[B";
    }

    public Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
