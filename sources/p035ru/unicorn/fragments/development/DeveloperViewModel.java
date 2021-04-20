package p035ru.unicorn.fragments.development;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageData;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.DeveloperDayImageList;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p046io.reactivex.android.schedulers.AndroidSchedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001dJ\b\u0010$\u001a\u0004\u0018\u00010#J\u0010\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010#J\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020)0\u001bj\b\u0012\u0004\u0012\u00020)`\u001dJ\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020#0\u001bj\b\u0012\u0004\u0012\u00020#`\u001dJ\u000e\u0010\u0007\u001a\u00020&2\u0006\u0010+\u001a\u00020#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006,"}, mo51343d2 = {"Lru/unicorn/fragments/development/DeveloperViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "complex", "Lru/unicorn/ujin/data/realm/Complex;", "getComplex", "()Lru/unicorn/ujin/data/realm/Complex;", "setComplex", "(Lru/unicorn/ujin/data/realm/Complex;)V", "developerRepository", "Lru/unicorn/fragments/development/DeveloperRepository;", "getDeveloperRepository", "()Lru/unicorn/fragments/development/DeveloperRepository;", "developerRepository$delegate", "Lkotlin/Lazy;", "developmentLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "getDevelopmentLiveData", "()Landroidx/lifecycle/MutableLiveData;", "developmentLiveData$delegate", "localRepository", "Lru/unicorn/fragments/development/DeveloperLocalRepository;", "getLocalRepository", "()Lru/unicorn/fragments/development/DeveloperLocalRepository;", "localRepository$delegate", "photolist", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/DeveloperDayImageList;", "Lkotlin/collections/ArrayList;", "getPhotolist", "()Ljava/util/ArrayList;", "setPhotolist", "(Ljava/util/ArrayList;)V", "getComplexListAsStringArray", "", "getComplexName", "getDevelopmentData", "", "flatId", "getPhotoListAsPageData", "Lru/unicorn/ujin/data/developerPage/CarouselPhoto;", "getTags", "complexId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperViewModel */
/* compiled from: DeveloperViewModel.kt */
public final class DeveloperViewModel extends BaseViewModel {
    private Complex complex;
    private final Lazy developerRepository$delegate = LazyKt.lazy(DeveloperViewModel$developerRepository$2.INSTANCE);
    private final Lazy developmentLiveData$delegate = LazyKt.lazy(DeveloperViewModel$developmentLiveData$2.INSTANCE);
    private final Lazy localRepository$delegate = LazyKt.lazy(DeveloperViewModel$localRepository$2.INSTANCE);
    private ArrayList<DeveloperDayImageList> photolist = new ArrayList<>();

    private final DeveloperRepository getDeveloperRepository() {
        return (DeveloperRepository) this.developerRepository$delegate.getValue();
    }

    public final MutableLiveData<DeveloperPageData> getDevelopmentLiveData() {
        return (MutableLiveData) this.developmentLiveData$delegate.getValue();
    }

    public final DeveloperLocalRepository getLocalRepository() {
        return (DeveloperLocalRepository) this.localRepository$delegate.getValue();
    }

    public final ArrayList<DeveloperDayImageList> getPhotolist() {
        return this.photolist;
    }

    public final void setPhotolist(ArrayList<DeveloperDayImageList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.photolist = arrayList;
    }

    public final Complex getComplex() {
        return this.complex;
    }

    public final void setComplex(Complex complex2) {
        this.complex = complex2;
    }

    public final void getDevelopmentData(String str) {
        DeveloperRepository developerRepository = getDeveloperRepository();
        Complex complex2 = this.complex;
        developerRepository.requestDevelopmentData(complex2 != null ? complex2.getId() : null, str).doOnSubscribe(new DeveloperViewModel$getDevelopmentData$1(this)).doOnComplete(new DeveloperViewModel$getDevelopmentData$2(this)).observeOn(AndroidSchedulers.mainThread()).doOnError(new DeveloperViewModel$getDevelopmentData$3(this)).subscribe(new DeveloperViewModel$getDevelopmentData$4(this));
    }

    public final ArrayList<String> getComplexListAsStringArray() {
        String str;
        ArrayList<String> arrayList = new ArrayList<>();
        DeveloperLocalRepository localRepository = getLocalRepository();
        Complex complex2 = this.complex;
        if (complex2 == null || (str = complex2.getCityId()) == null) {
            str = "";
        }
        Iterable<Complex> complexList = localRepository.getComplexList(str);
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(complexList, 10));
        for (Complex title : complexList) {
            arrayList2.add(Boolean.valueOf(arrayList.add(title.getTitle())));
        }
        List list = (List) arrayList2;
        return arrayList;
    }

    public final String getComplexName() {
        Complex complex2 = this.complex;
        if (complex2 != null) {
            return complex2.getTitle();
        }
        return null;
    }

    public final void setComplex(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        this.complex = getLocalRepository().getComplexById(str);
    }

    public final ArrayList<String> getTags() {
        String str;
        ArrayList<String> arrayList = new ArrayList<>();
        DeveloperLocalRepository localRepository = getLocalRepository();
        Complex complex2 = this.complex;
        if (complex2 == null || (str = complex2.getCityId()) == null) {
            str = "";
        }
        Iterable<Complex> complexList = localRepository.getComplexList(str);
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(complexList, 10));
        for (Complex id : complexList) {
            arrayList2.add(Boolean.valueOf(arrayList.add(id.getId())));
        }
        List list = (List) arrayList2;
        return arrayList;
    }

    public final ArrayList<CarouselPhoto> getPhotoListAsPageData() {
        ArrayList<CarouselPhoto> arrayList = new ArrayList<>();
        ArrayList<DeveloperDayImageList> arrayList2 = this.photolist;
        if (arrayList2 != null) {
            Iterator<DeveloperDayImageList> it = arrayList2.iterator();
            while (it.hasNext()) {
                DeveloperDayImageList next = it.next();
                Iterable<ImageData> imageList = next.getImageList();
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(imageList, 10));
                for (ImageData imageData : imageList) {
                    arrayList3.add(Boolean.valueOf(arrayList.add(new CarouselPhoto(imageData.getImg(), imageData.getThumbnail(), next.getGroup()))));
                }
                List list = (List) arrayList3;
            }
        }
        return arrayList;
    }
}
