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
public interface IMAttribute extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.KEY</code>. 「key」- 属性ID
     */
    public IMAttribute setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.KEY</code>. 「key」- 属性ID
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.NAME</code>. 「name」- 属性名称
     */
    public IMAttribute setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.NAME</code>. 「name」- 属性名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.ALIAS</code>. 「alias」- 属性别名（业务名）
     */
    public IMAttribute setAlias(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.ALIAS</code>. 「alias」- 属性别名（业务名）
     */
    public String getAlias();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.TYPE</code>. 「type」- INTERNAL/EXTERNAL属性
     */
    public IMAttribute setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.TYPE</code>. 「type」- INTERNAL/EXTERNAL属性
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE</code>. 「source」- 关联实体ID
     */
    public IMAttribute setSource(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE</code>. 「source」- 关联实体ID
     */
    public String getSource();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE_FIELD</code>. 「sourceField」- 可选，如果不设置则以name为主
     */
    public IMAttribute setSourceField(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SOURCE_FIELD</code>. 「sourceField」- 可选，如果不设置则以name为主
     */
    public String getSourceField();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.EXPRESSION</code>. 「expression」- 表达式
     */
    public IMAttribute setExpression(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.EXPRESSION</code>. 「expression」- 表达式
     */
    public String getExpression();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.NORMALIZE</code>. 「normalize」- 表达式
     */
    public IMAttribute setNormalize(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.NORMALIZE</code>. 「normalize」- 表达式
     */
    public String getNormalize();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IN_COMPONENT</code>. 「inComponent」- 写入插件
     */
    public IMAttribute setInComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IN_COMPONENT</code>. 「inComponent」- 写入插件
     */
    public String getInComponent();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.OUT_COMPONENT</code>. 「outComponent」- 读取插件
     */
    public IMAttribute setOutComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.OUT_COMPONENT</code>. 「outComponent」- 读取插件
     */
    public String getOutComponent();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.MODEL_ID</code>. 「modelId」- 关联的模型ID
     */
    public IMAttribute setModelId(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.MODEL_ID</code>. 「modelId」- 关联的模型ID
     */
    public String getModelId();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.COMMENTS</code>. 「comments」- 当前属性的描述信息
     */
    public IMAttribute setComments(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.COMMENTS</code>. 「comments」- 当前属性的描述信息
     */
    public String getComments();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_IN</code>. 「isSyncIn」- 是否同步读
     */
    public IMAttribute setIsSyncIn(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_IN</code>. 「isSyncIn」- 是否同步读
     */
    public Boolean getIsSyncIn();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_OUT</code>. 「isSyncOut」- 是否同步写
     */
    public IMAttribute setIsSyncOut(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_SYNC_OUT</code>. 「isSyncOut」- 是否同步写
     */
    public Boolean getIsSyncOut();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_LOCK</code>. 「isLock」- 是否锁定，锁定属性不可删除
     */
    public IMAttribute setIsLock(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_LOCK</code>. 「isLock」- 是否锁定，锁定属性不可删除
     */
    public Boolean getIsLock();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_TRACK</code>. 「isTrack」- 是否实现历史记录，如果是 isTrack 那么启用 ACTIVITY 的变更记录，对应 ITEM
     */
    public IMAttribute setIsTrack(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.IS_TRACK</code>. 「isTrack」- 是否实现历史记录，如果是 isTrack 那么启用 ACTIVITY 的变更记录，对应 ITEM
     */
    public Boolean getIsTrack();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMAttribute setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMAttribute setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.ACTIVE</code>. 「active」- 是否启用
     */
    public IMAttribute setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IMAttribute setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMAttribute setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMAttribute setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMAttribute setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMAttribute setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.M_ATTRIBUTE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IMAttribute
     */
    public void from(cn.vertxup.atom.domain.tables.interfaces.IMAttribute from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IMAttribute
     */
    public <E extends cn.vertxup.atom.domain.tables.interfaces.IMAttribute> E into(E into);

    default IMAttribute fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setAlias(json.getString("ALIAS"));
        setType(json.getString("TYPE"));
        setSource(json.getString("SOURCE"));
        setSourceField(json.getString("SOURCE_FIELD"));
        setExpression(json.getString("EXPRESSION"));
        setNormalize(json.getString("NORMALIZE"));
        setInComponent(json.getString("IN_COMPONENT"));
        setOutComponent(json.getString("OUT_COMPONENT"));
        setModelId(json.getString("MODEL_ID"));
        setComments(json.getString("COMMENTS"));
        setIsSyncIn(json.getBoolean("IS_SYNC_IN"));
        setIsSyncOut(json.getBoolean("IS_SYNC_OUT"));
        setIsLock(json.getBoolean("IS_LOCK"));
        setIsTrack(json.getBoolean("IS_TRACK"));
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
        json.put("ALIAS",getAlias());
        json.put("TYPE",getType());
        json.put("SOURCE",getSource());
        json.put("SOURCE_FIELD",getSourceField());
        json.put("EXPRESSION",getExpression());
        json.put("NORMALIZE",getNormalize());
        json.put("IN_COMPONENT",getInComponent());
        json.put("OUT_COMPONENT",getOutComponent());
        json.put("MODEL_ID",getModelId());
        json.put("COMMENTS",getComments());
        json.put("IS_SYNC_IN",getIsSyncIn());
        json.put("IS_SYNC_OUT",getIsSyncOut());
        json.put("IS_LOCK",getIsLock());
        json.put("IS_TRACK",getIsTrack());
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
