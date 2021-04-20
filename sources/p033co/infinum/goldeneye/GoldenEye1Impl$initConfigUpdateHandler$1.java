package p033co.infinum.goldeneye;

import android.view.TextureView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.extensions.TextureViewKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$initConfigUpdateHandler$1 */
/* compiled from: GoldenEye1Impl.kt */
final class GoldenEye1Impl$initConfigUpdateHandler$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TextureView $textureView;
    final /* synthetic */ GoldenEye1Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoldenEye1Impl$initConfigUpdateHandler$1(GoldenEye1Impl goldenEye1Impl, TextureView textureView) {
        super(0);
        this.this$0 = goldenEye1Impl;
        this.$textureView = textureView;
    }

    public final void invoke() {
        TextureViewKt.onSurfaceUpdate(this.$textureView, new Function1<TextureView, Unit>(this) {
            final /* synthetic */ GoldenEye1Impl$initConfigUpdateHandler$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextureView) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(TextureView textureView) {
                Intrinsics.checkParameterIsNotNull(textureView, "it");
                GoldenEye1Impl.startPreview$default(this.this$0.this$0, (InitCallback) null, 1, (Object) null);
            }
        }, new Function1<TextureView, Unit>(this) {
            final /* synthetic */ GoldenEye1Impl$initConfigUpdateHandler$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextureView) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(TextureView textureView) {
                Intrinsics.checkParameterIsNotNull(textureView, "it");
                GoldenEye1Impl.startPreview$default(this.this$0.this$0, (InitCallback) null, 1, (Object) null);
            }
        });
    }
}
