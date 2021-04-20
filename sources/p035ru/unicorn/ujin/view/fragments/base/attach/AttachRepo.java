package p035ru.unicorn.ujin.view.fragments.base.attach;

import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.AttachFileData;
import p046io.reactivex.Observable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/base/attach/AttachRepo;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "createFileObject", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "filePath", "", "type", "getFileName", "getRequestBody", "Lokhttp3/MultipartBody;", "fileName", "fileData", "Lokhttp3/RequestBody;", "dataType", "upload", "Lio/reactivex/Observable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/AttachFileData;", "filepath", "comment", "uploadFile", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.base.attach.AttachRepo */
/* compiled from: AttachRepo.kt */
public final class AttachRepo extends BaseRemoteRepository {
    public final Observable<Resource<AttachFileData>> uploadFile(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "filepath");
        Intrinsics.checkNotNullParameter(str2, "fileName");
        Observable<R> onErrorReturn = getApi().uploadFile(getToken(), getRequestBody(str2, RequestBody.Companion.create(MultipartBody.FORM, new File(str)), UriUtil.LOCAL_FILE_SCHEME)).map(AttachRepo$uploadFile$1.INSTANCE).onErrorReturn(AttachRepo$uploadFile$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.uploadFile(getToken(…Ошибка загрузки файла\") }");
        return onErrorReturn;
    }

    public final Observable<Resource<AttachFileData>> upload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "filepath");
        Intrinsics.checkNotNullParameter(str2, "comment");
        Observable<R> onErrorReturn = getApi().uploadFile(getToken(), getRequestBody("name", RequestBody.Companion.create(MultipartBody.FORM, new File(str)), (StringsKt.endsWith$default(str, "png", false, 2, (Object) null) || StringsKt.endsWith$default(str, "jpg", false, 2, (Object) null) || StringsKt.endsWith$default(str, "jpeg", false, 2, (Object) null)) ? "image" : UriUtil.LOCAL_FILE_SCHEME)).map(new AttachRepo$upload$1(str2)).onErrorReturn(AttachRepo$upload$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.uploadFile(getToken(…Ошибка загрузки файла\") }");
        return onErrorReturn;
    }

    private final MultipartBody getRequestBody(String str, RequestBody requestBody, String str2) {
        return new MultipartBody.Builder((String) null, 1, (DefaultConstructorMarker) null).setType(MultipartBody.FORM).addFormDataPart("data[type]", str2).addFormDataPart("data[file]", str, requestBody).addFormDataPart("auth[token]", getToken()).build();
    }

    public final AttachablePreview createFileObject(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(str2, "type");
        return new AttachableImpl(str, getFileName(str), str2);
    }

    public final String getFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        String substring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, "/", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
