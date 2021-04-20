package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.News;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/NewsListResponseData;", "", "token", "", "newsList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/News;", "(Ljava/lang/String;Lio/realm/RealmList;)V", "getNewsList", "()Lio/realm/RealmList;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.NewsListResponseData */
/* compiled from: NewsListResponse.kt */
public final class NewsListResponseData {
    @SerializedName("news")
    private final RealmList<News> newsList;
    private final String token;

    public static /* synthetic */ NewsListResponseData copy$default(NewsListResponseData newsListResponseData, String str, RealmList<News> realmList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsListResponseData.token;
        }
        if ((i & 2) != 0) {
            realmList = newsListResponseData.newsList;
        }
        return newsListResponseData.copy(str, realmList);
    }

    public final String component1() {
        return this.token;
    }

    public final RealmList<News> component2() {
        return this.newsList;
    }

    public final NewsListResponseData copy(String str, RealmList<News> realmList) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new NewsListResponseData(str, realmList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsListResponseData)) {
            return false;
        }
        NewsListResponseData newsListResponseData = (NewsListResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) newsListResponseData.token) && Intrinsics.areEqual((Object) this.newsList, (Object) newsListResponseData.newsList);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        RealmList<News> realmList = this.newsList;
        if (realmList != null) {
            i = realmList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NewsListResponseData(token=" + this.token + ", newsList=" + this.newsList + ")";
    }

    public NewsListResponseData(String str, RealmList<News> realmList) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.newsList = realmList;
    }

    public final String getToken() {
        return this.token;
    }

    public final RealmList<News> getNewsList() {
        return this.newsList;
    }
}
