package p035ru.unicorn.ujin.market.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p046io.realm.ImportFlag;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/market/repository/MarketLocalRepository$updateRedeemedCoupon$1$1$1", "ru/unicorn/ujin/market/repository/MarketLocalRepository$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketLocalRepository$updateRedeemedCoupon$$inlined$let$lambda$1 */
/* compiled from: MarketLocalRepository.kt */
final class MarketLocalRepository$updateRedeemedCoupon$$inlined$let$lambda$1 implements Realm.Transaction {
    final /* synthetic */ RedeemedCode $code$inlined;
    final /* synthetic */ Coupon $coupon$inlined;
    final /* synthetic */ MarketLocalRepository this$0;

    MarketLocalRepository$updateRedeemedCoupon$$inlined$let$lambda$1(MarketLocalRepository marketLocalRepository, RedeemedCode redeemedCode, Coupon coupon) {
        this.this$0 = marketLocalRepository;
        this.$code$inlined = redeemedCode;
        this.$coupon$inlined = coupon;
    }

    public final void execute(Realm realm) {
        this.$coupon$inlined.setRedeemedCode((RedeemedCode) this.this$0.realm.copyToRealmOrUpdate(this.$code$inlined, new ImportFlag[0]));
        this.this$0.realm.insertOrUpdate((RealmModel) this.$coupon$inlined);
    }
}
