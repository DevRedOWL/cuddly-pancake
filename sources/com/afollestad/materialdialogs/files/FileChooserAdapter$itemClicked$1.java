package com.afollestad.materialdialogs.files;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: FileChooserAdapter.kt */
final class FileChooserAdapter$itemClicked$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FileChooserAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FileChooserAdapter$itemClicked$1(FileChooserAdapter fileChooserAdapter) {
        super(0);
        this.this$0 = fileChooserAdapter;
    }

    public final void invoke() {
        FileChooserAdapter fileChooserAdapter = this.this$0;
        fileChooserAdapter.switchDirectory(fileChooserAdapter.currentFolder);
    }
}
