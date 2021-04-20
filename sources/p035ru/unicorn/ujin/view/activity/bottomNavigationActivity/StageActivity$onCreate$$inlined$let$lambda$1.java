package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.shortcut.AppShortcutManager;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "result", "", "Lru/unicorn/ujin/data/MyPassIn;", "kotlin.jvm.PlatformType", "invoke", "ru/unicorn/ujin/view/activity/bottomNavigationActivity/StageActivity$onCreate$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity$onCreate$$inlined$let$lambda$1 */
/* compiled from: StageActivity.kt */
final class StageActivity$onCreate$$inlined$let$lambda$1 extends Lambda implements Function1<List<? extends MyPassIn>, Unit> {
    final /* synthetic */ StageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StageActivity$onCreate$$inlined$let$lambda$1(StageActivity stageActivity) {
        super(1);
        this.this$0 = stageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<MyPassIn>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<MyPassIn> list) {
        new AppShortcutManager(this.this$0).initPassShortCut(list);
    }
}
