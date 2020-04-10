/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.erp.domain.tables.interfaces;


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
public interface IECompany extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    public IECompany setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.KEY</code>. 「key」- 公司主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    public IECompany setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.NAME</code>. 「name」- 公司名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    public IECompany setAlias(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ALIAS</code>. 「alias」- 公司别称
     */
    public String getAlias();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    public IECompany setTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TITLE</code>. 「title」- 公司显示标题
     */
    public String getTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    public IECompany setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CODE</code>. 「code」- 公司编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    public IECompany setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMMENT</code>. 「comment」- 公司简介
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    public IECompany setTaxCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_CODE</code>. 「taxCode」- 公司税号
     */
    public String getTaxCode();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    public IECompany setTaxTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TAX_TITLE</code>. 「taxTitle」- 开票抬头
     */
    public String getTaxTitle();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    public IECompany setEmail(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.EMAIL</code>. 「email」- 企业邮箱
     */
    public String getEmail();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    public IECompany setFax(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.FAX</code>. 「fax」- 传真号
     */
    public String getFax();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    public IECompany setHomepage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.HOMEPAGE</code>. 「homepage」- 公司主页
     */
    public String getHomepage();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    public IECompany setLogo(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOGO</code>. 「logo」- 附件对应的 attachment Key
     */
    public String getLogo();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    public IECompany setPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.PHONE</code>. 「phone」- 公司座机
     */
    public String getPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    public IECompany setAddress(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ADDRESS</code>. 「address」- 公司地址
     */
    public String getAddress();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」- 启用LBS时对应的Location主键
     */
    public IECompany setLocationId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LOCATION_ID</code>. 「locationId」- 启用LBS时对应的Location主键
     */
    public String getLocationId();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>. 「corporationName」- 企业法人
     */
    public IECompany setCorporationName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_NAME</code>. 「corporationName」- 企业法人
     */
    public String getCorporationName();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>. 「corporationPhone」- 法人电话
     */
    public IECompany setCorporationPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CORPORATION_PHONE</code>. 「corporationPhone」- 法人电话
     */
    public String getCorporationPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」- 联系人电话
     */
    public IECompany setContactName(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_NAME</code>. 「contactName」- 联系人电话
     */
    public String getContactName();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>. 「contactPhone」- 联系人电话
     */
    public IECompany setContactPhone(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_PHONE</code>. 「contactPhone」- 联系人电话
     */
    public String getContactPhone();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>. 「contactOnline」- 在线联系方式
     */
    public IECompany setContactOnline(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CONTACT_ONLINE</code>. 「contactOnline」- 在线联系方式
     */
    public String getContactOnline();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」- 公司、子公司结构时需要
     */
    public IECompany setCompanyId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.COMPANY_ID</code>. 「companyId」- 公司、子公司结构时需要
     */
    public String getCompanyId();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」- 公司作为客户时的客户信息
     */
    public IECompany setCustomerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CUSTOMER_ID</code>. 「customerId」- 公司作为客户时的客户信息
     */
    public String getCustomerId();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    public IECompany setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.TYPE</code>. 「type」- 公司分类
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    public IECompany setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    public IECompany setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public IECompany setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IECompany setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IECompany setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IECompany setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IECompany setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IECompany setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.E_COMPANY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IECompany
     */
    public void from(cn.vertxup.erp.domain.tables.interfaces.IECompany from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IECompany
     */
    public <E extends cn.vertxup.erp.domain.tables.interfaces.IECompany> E into(E into);

    default IECompany fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setAlias(json.getString("ALIAS"));
        setTitle(json.getString("TITLE"));
        setCode(json.getString("CODE"));
        setComment(json.getString("COMMENT"));
        setTaxCode(json.getString("TAX_CODE"));
        setTaxTitle(json.getString("TAX_TITLE"));
        setEmail(json.getString("EMAIL"));
        setFax(json.getString("FAX"));
        setHomepage(json.getString("HOMEPAGE"));
        setLogo(json.getString("LOGO"));
        setPhone(json.getString("PHONE"));
        setAddress(json.getString("ADDRESS"));
        setLocationId(json.getString("LOCATION_ID"));
        setCorporationName(json.getString("CORPORATION_NAME"));
        setCorporationPhone(json.getString("CORPORATION_PHONE"));
        setContactName(json.getString("CONTACT_NAME"));
        setContactPhone(json.getString("CONTACT_PHONE"));
        setContactOnline(json.getString("CONTACT_ONLINE"));
        setCompanyId(json.getString("COMPANY_ID"));
        setCustomerId(json.getString("CUSTOMER_ID"));
        setType(json.getString("TYPE"));
        setMetadata(json.getString("METADATA"));
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
        json.put("ALIAS",getAlias());
        json.put("TITLE",getTitle());
        json.put("CODE",getCode());
        json.put("COMMENT",getComment());
        json.put("TAX_CODE",getTaxCode());
        json.put("TAX_TITLE",getTaxTitle());
        json.put("EMAIL",getEmail());
        json.put("FAX",getFax());
        json.put("HOMEPAGE",getHomepage());
        json.put("LOGO",getLogo());
        json.put("PHONE",getPhone());
        json.put("ADDRESS",getAddress());
        json.put("LOCATION_ID",getLocationId());
        json.put("CORPORATION_NAME",getCorporationName());
        json.put("CORPORATION_PHONE",getCorporationPhone());
        json.put("CONTACT_NAME",getContactName());
        json.put("CONTACT_PHONE",getContactPhone());
        json.put("CONTACT_ONLINE",getContactOnline());
        json.put("COMPANY_ID",getCompanyId());
        json.put("CUSTOMER_ID",getCustomerId());
        json.put("TYPE",getType());
        json.put("METADATA",getMetadata());
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
