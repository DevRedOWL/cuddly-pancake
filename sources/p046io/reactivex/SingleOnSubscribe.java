package p046io.reactivex;

/* renamed from: io.reactivex.SingleOnSubscribe */
public interface SingleOnSubscribe<T> {
    void subscribe(SingleEmitter<T> singleEmitter) throws Exception;
}
