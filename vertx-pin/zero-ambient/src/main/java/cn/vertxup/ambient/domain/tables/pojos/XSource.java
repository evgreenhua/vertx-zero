/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXSource;

import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public class XSource implements IXSource {

    private static final long serialVersionUID = -147594909;

    private String        key;
    private String        ipV4;
    private String        ipV6;
    private String        hostname;
    private Integer       port;
    private String        category;
    private String        driverClassName;
    private String        jdbcUrl;
    private String        jdbcConfig;
    private String        instance;
    private String        username;
    private String        password;
    private String        appId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public XSource() {}

    public XSource(XSource value) {
        this.key = value.key;
        this.ipV4 = value.ipV4;
        this.ipV6 = value.ipV6;
        this.hostname = value.hostname;
        this.port = value.port;
        this.category = value.category;
        this.driverClassName = value.driverClassName;
        this.jdbcUrl = value.jdbcUrl;
        this.jdbcConfig = value.jdbcConfig;
        this.instance = value.instance;
        this.username = value.username;
        this.password = value.password;
        this.appId = value.appId;
        this.active = value.active;
        this.sigma = value.sigma;
        this.metadata = value.metadata;
        this.language = value.language;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public XSource(
        String        key,
        String        ipV4,
        String        ipV6,
        String        hostname,
        Integer       port,
        String        category,
        String        driverClassName,
        String        jdbcUrl,
        String        jdbcConfig,
        String        instance,
        String        username,
        String        password,
        String        appId,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.ipV4 = ipV4;
        this.ipV6 = ipV6;
        this.hostname = hostname;
        this.port = port;
        this.category = category;
        this.driverClassName = driverClassName;
        this.jdbcUrl = jdbcUrl;
        this.jdbcConfig = jdbcConfig;
        this.instance = instance;
        this.username = username;
        this.password = password;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public XSource setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getIpV4() {
        return this.ipV4;
    }

    @Override
    public XSource setIpV4(String ipV4) {
        this.ipV4 = ipV4;
        return this;
    }

    @Override
    public String getIpV6() {
        return this.ipV6;
    }

    @Override
    public XSource setIpV6(String ipV6) {
        this.ipV6 = ipV6;
        return this;
    }

    @Override
    public String getHostname() {
        return this.hostname;
    }

    @Override
    public XSource setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    @Override
    public Integer getPort() {
        return this.port;
    }

    @Override
    public XSource setPort(Integer port) {
        this.port = port;
        return this;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public XSource setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String getDriverClassName() {
        return this.driverClassName;
    }

    @Override
    public XSource setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

    @Override
    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    @Override
    public XSource setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }

    @Override
    public String getJdbcConfig() {
        return this.jdbcConfig;
    }

    @Override
    public XSource setJdbcConfig(String jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
        return this;
    }

    @Override
    public String getInstance() {
        return this.instance;
    }

    @Override
    public XSource setInstance(String instance) {
        this.instance = instance;
        return this;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public XSource setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public XSource setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String getAppId() {
        return this.appId;
    }

    @Override
    public XSource setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public XSource setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public XSource setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public XSource setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public XSource setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public XSource setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public XSource setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public XSource setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public XSource setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XSource (");

        sb.append(key);
        sb.append(", ").append(ipV4);
        sb.append(", ").append(ipV6);
        sb.append(", ").append(hostname);
        sb.append(", ").append(port);
        sb.append(", ").append(category);
        sb.append(", ").append(driverClassName);
        sb.append(", ").append(jdbcUrl);
        sb.append(", ").append(jdbcConfig);
        sb.append(", ").append(instance);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(appId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IXSource from) {
        setKey(from.getKey());
        setIpV4(from.getIpV4());
        setIpV6(from.getIpV6());
        setHostname(from.getHostname());
        setPort(from.getPort());
        setCategory(from.getCategory());
        setDriverClassName(from.getDriverClassName());
        setJdbcUrl(from.getJdbcUrl());
        setJdbcConfig(from.getJdbcConfig());
        setInstance(from.getInstance());
        setUsername(from.getUsername());
        setPassword(from.getPassword());
        setAppId(from.getAppId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IXSource> E into(E into) {
        into.from(this);
        return into;
    }

    public XSource(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
