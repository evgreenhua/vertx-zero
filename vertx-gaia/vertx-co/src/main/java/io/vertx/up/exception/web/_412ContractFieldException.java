package io.vertx.up.exception.web;

import io.vertx.core.http.HttpStatusCode;
import io.vertx.up.exception.WebException;

public class _412ContractFieldException extends WebException {
    public _412ContractFieldException(final Class<?> clazz,
                                      final Class<?> fieldType,
                                      final Class<?> target,
                                      final Integer times) {
        super(clazz, fieldType, target, times);
    }

    @Override
    public int getCode() {
        return -60040;
    }

    @Override
    public HttpStatusCode getStatus() {
        return HttpStatusCode.PRECONDITION_FAILED;
    }
}
