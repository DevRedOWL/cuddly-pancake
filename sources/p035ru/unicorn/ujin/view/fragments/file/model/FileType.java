package p035ru.unicorn.ujin.view.fragments.file.model;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/file/model/FileType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "FILE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.file.model.FileType */
/* compiled from: SendFileOut.kt */
public enum FileType {
    FILE(UriUtil.LOCAL_FILE_SCHEME);

    private FileType(String str) {
    }
}
