package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.News;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$updateNewspiecePicture$1 */
/* compiled from: RealmRepository.kt */
final class RealmRepository$updateNewspiecePicture$1 implements Realm.Transaction {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ News $newspiece;

    RealmRepository$updateNewspiecePicture$1(News news, byte[] bArr) {
        this.$newspiece = news;
        this.$bytes = bArr;
    }

    public final void execute(Realm realm) {
        News news = this.$newspiece;
        ImageData imageData = (ImageData) realm.createObject(ImageData.class);
        ImageData imageData2 = this.$newspiece.getImageData();
        imageData.setSource(imageData2 != null ? imageData2.getSource() : null);
        imageData.setImageBytes(this.$bytes);
        Unit unit = Unit.INSTANCE;
        news.setImageData(imageData);
        realm.insertOrUpdate((RealmModel) this.$newspiece);
    }
}
