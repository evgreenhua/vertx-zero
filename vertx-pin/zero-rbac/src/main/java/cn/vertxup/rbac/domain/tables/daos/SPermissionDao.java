/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SPermission;
import cn.vertxup.rbac.domain.tables.records.SPermissionRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SPermissionDao extends DAOImpl<SPermissionRecord, cn.vertxup.rbac.domain.tables.pojos.SPermission, String> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.SPermissionRecord,cn.vertxup.rbac.domain.tables.pojos.SPermission,java.lang.String> {

    /**
     * Create a new SPermissionDao without any configuration
     */
    public SPermissionDao() {
        super(SPermission.S_PERMISSION, cn.vertxup.rbac.domain.tables.pojos.SPermission.class);
    }

    /**
     * Create a new SPermissionDao with an attached configuration
     */
    public SPermissionDao(Configuration configuration) {
        super(SPermission.S_PERMISSION, cn.vertxup.rbac.domain.tables.pojos.SPermission.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.rbac.domain.tables.pojos.SPermission object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByKey(String... values) {
        return fetch(SPermission.S_PERMISSION.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.rbac.domain.tables.pojos.SPermission fetchOneByKey(String value) {
        return fetchOne(SPermission.S_PERMISSION.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByName(String... values) {
        return fetch(SPermission.S_PERMISSION.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByCode(String... values) {
        return fetch(SPermission.S_PERMISSION.CODE, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchBySigma(String... values) {
        return fetch(SPermission.S_PERMISSION.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByLanguage(String... values) {
        return fetch(SPermission.S_PERMISSION.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByActive(Boolean... values) {
        return fetch(SPermission.S_PERMISSION.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByComment(String... values) {
        return fetch(SPermission.S_PERMISSION.COMMENT, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByMetadata(String... values) {
        return fetch(SPermission.S_PERMISSION.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(SPermission.S_PERMISSION.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByCreatedBy(String... values) {
        return fetch(SPermission.S_PERMISSION.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(SPermission.S_PERMISSION.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchByUpdatedBy(String... values) {
        return fetch(SPermission.S_PERMISSION.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.rbac.domain.tables.pojos.SPermission> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByNameAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.NAME,values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.CODE,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.SIGMA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SPermission.S_PERMISSION.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByCommentAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.COMMENT,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.METADATA,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SPermission.S_PERMISSION.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SPermission.S_PERMISSION.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPermission>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(SPermission.S_PERMISSION.UPDATED_BY,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
