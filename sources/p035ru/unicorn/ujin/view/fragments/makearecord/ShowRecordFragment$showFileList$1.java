package p035ru.unicorn.ujin.view.fragments.makearecord;

import com.facebook.common.util.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.FileData;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "file", "Lru/unicorn/ujin/data/realm/FileData;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ShowRecordFragment$showFileList$1 */
/* compiled from: ShowRecordFragment.kt */
final class ShowRecordFragment$showFileList$1<T> implements Consumer<FileData> {
    final /* synthetic */ ShowRecordFragment this$0;

    ShowRecordFragment$showFileList$1(ShowRecordFragment showRecordFragment) {
        this.this$0 = showRecordFragment;
    }

    public final void accept(FileData fileData) {
        Intrinsics.checkNotNullParameter(fileData, UriUtil.LOCAL_FILE_SCHEME);
        this.this$0.onDownloadClick(fileData);
    }
}
