/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.lbs.domain.tables.interfaces;


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
public interface ILCountry extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.KEY</code>. 「key」- 国家主键
     */
    public ILCountry setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.KEY</code>. 「key」- 国家主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.NAME</code>. 「name」- 国家名称
     */
    public ILCountry setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.NAME</code>. 「name」- 国家名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.CODE</code>. 「code」- 国家编号
     */
    public ILCountry setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.CODE</code>. 「code」- 国家编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.FLAG</code>. 「flag」- 国旗
     */
    public ILCountry setFlag(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.FLAG</code>. 「flag」- 国旗
     */
    public String getFlag();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.PHONE_PREFIX</code>. 「phonePrefix」- 电话前缀
     */
    public ILCountry setPhonePrefix(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.PHONE_PREFIX</code>. 「phonePrefix」- 电话前缀
     */
    public String getPhonePrefix();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.CURRENCY</code>. 「currency」- 使用货币
     */
    public ILCountry setCurrency(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.CURRENCY</code>. 「currency」- 使用货币
     */
    public String getCurrency();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.METADATA</code>. 「metadata」- 附加配置
     */
    public ILCountry setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.ORDER</code>. 「order」- 排序
     */
    public ILCountry setOrder(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.ORDER</code>. 「order」- 排序
     */
    public Integer getOrder();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.ACTIVE</code>. 「active」- 是否启用
     */
    public ILCountry setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.SIGMA</code>. 「sigma」- 统一标识
     */
    public ILCountry setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ILCountry setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ILCountry setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ILCountry setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ILCountry setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.L_COUNTRY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ILCountry setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.L_COUNTRY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ILCountry
     */
    public void from(cn.vertxup.lbs.domain.tables.interfaces.ILCountry from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ILCountry
     */
    public <E extends cn.vertxup.lbs.domain.tables.interfaces.ILCountry> E into(E into);

    default ILCountry fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setFlag(json.getString("FLAG"));
        setPhonePrefix(json.getString("PHONE_PREFIX"));
        setCurrency(json.getString("CURRENCY"));
        setMetadata(json.getString("METADATA"));
        setOrder(json.getInteger("ORDER"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
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
        json.put("CODE",getCode());
        json.put("FLAG",getFlag());
        json.put("PHONE_PREFIX",getPhonePrefix());
        json.put("CURRENCY",getCurrency());
        json.put("METADATA",getMetadata());
        json.put("ORDER",getOrder());
        json.put("ACTIVE",getActive());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
