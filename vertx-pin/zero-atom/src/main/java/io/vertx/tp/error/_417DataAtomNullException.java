package io.vertx.tp.error;

import io.vertx.core.http.HttpStatusCode;
import io.vertx.up.exception.WebException;

public class _417DataAtomNullException extends WebException {

    public _417DataAtomNullException(final Class<?> clazz) {
        super(clazz);
    }

    @Override
    public int getCode() {
        return -80517;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.EXPECTATION_FAILED;
    }
}
