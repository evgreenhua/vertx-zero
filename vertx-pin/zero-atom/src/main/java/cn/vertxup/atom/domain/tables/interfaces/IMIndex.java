/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain.tables.interfaces;


import java.io.Serializable;
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
public interface IMIndex extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.KEY</code>. 「key」- 索引ID
     */
    public IMIndex setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.KEY</code>. 「key」- 索引ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.NAME</code>. 「name」- 索引名称
     */
    public IMIndex setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.NAME</code>. 「name」- 索引名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.TYPE</code>. 「type」- 索引类型
     */
    public IMIndex setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.TYPE</code>. 「type」- 索引类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.CLUSTERED</code>. 「clustered」- 是否聚集索引
     */
    public IMIndex setClustered(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.CLUSTERED</code>. 「clustered」- 是否聚集索引
     */
    public Boolean getClustered();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.COLUMNS</code>. 「columns」- JsonArray格式，索引覆盖的列集合
     */
    public IMIndex setColumns(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.COLUMNS</code>. 「columns」- JsonArray格式，索引覆盖的列集合
     */
    public String getColumns();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.ENTITY_ID</code>. 「entityId」- 关联的实体ID
     */
    public IMIndex setEntityId(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.ENTITY_ID</code>. 「entityId」- 关联的实体ID
     */
    public String getEntityId();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.COMMENTS</code>. 「comments」- 当前索引的描述信息
     */
    public IMIndex setComments(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.COMMENTS</code>. 「comments」- 当前索引的描述信息
     */
    public String getComments();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMIndex setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMIndex setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.ACTIVE</code>. 「active」- 是否启用
     */
    public IMIndex setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IMIndex setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMIndex setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMIndex setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMIndex setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_INDEX.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMIndex setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_INDEX.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMIndex
     */
    public void from(cn.vertxup.atom.domain.tables.interfaces.IMIndex from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMIndex
     */
    public <E extends cn.vertxup.atom.domain.tables.interfaces.IMIndex> E into(E into);

    default IMIndex fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setType(json.getString("TYPE"));
        setClustered(json.getBoolean("CLUSTERED"));
        setColumns(json.getString("COLUMNS"));
        setEntityId(json.getString("ENTITY_ID"));
        setComments(json.getString("COMMENTS"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("NAME",getName());
        json.put("TYPE",getType());
        json.put("CLUSTERED",getClustered());
        json.put("COLUMNS",getColumns());
        json.put("ENTITY_ID",getEntityId());
        json.put("COMMENTS",getComments());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
