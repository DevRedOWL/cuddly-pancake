package p046io.reactivex;

/* renamed from: io.reactivex.SingleTransformer */
public interface SingleTransformer<Upstream, Downstream> {
    SingleSource<Downstream> apply(Single<Upstream> single);
}
