package com.example.master.lamor_multichannel.abcde;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class IHttpManager {


    public static <T> void doRequest(Observable<HttpReseult<T>> observable, final IResponseListener<T> listener) {

        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new HttpResultFunc<T>())
                .subscribe(new Observer<T>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(T t) {
                        if (listener != null) {
                            listener.onSuccess(t);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (listener != null) {
                            listener.onFail(e);
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static class HttpResultFunc<T> implements Function<HttpReseult<T>, T> {
        @Override
        public T apply(HttpReseult<T> httpReseult) throws Exception {
            if (httpReseult.getCode() != 1) {
                throw new ApiException("code == " + httpReseult.getCode() + "\n+message == " + httpReseult.getMessage());
            }
            return httpReseult.getData();
        }
    }


    private static class ApiException extends Exception {
        public ApiException(String message) {
            super(message);
        }
    }


    public interface IResponseListener<T> {
        void onSuccess(T data);

        void onFail(Throwable e);
    }


}
