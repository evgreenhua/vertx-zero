/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.records;


import cn.vertxup.rbac.domain.tables.SResource;
import cn.vertxup.rbac.domain.tables.interfaces.ISResource;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SResourceRecord extends UpdatableRecordImpl<SResourceRecord> implements Record19<String, String, String, String, String, String, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, ISResource {

    private static final long serialVersionUID = -382651366;

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public SResourceRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public SResourceRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public SResourceRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public SResourceRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.IDENTIFIER</code>. 「identifier」- 当前资源所属的Model的标识
     */
    @Override
    public SResourceRecord setIdentifier(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.IDENTIFIER</code>. 「identifier」- 当前资源所属的Model的标识
     */
    @Override
    public String getIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public SResourceRecord setComment(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public SResourceRecord setLevel(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public Integer getLevel() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public SResourceRecord setModeRole(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public String getModeRole() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public SResourceRecord setModeGroup(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public String getModeGroup() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.MODE_TREE</code>. 「modeTree」- 该资源处理树（用户组）的模式
     */
    @Override
    public SResourceRecord setModeTree(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.MODE_TREE</code>. 「modeTree」- 该资源处理树（用户组）的模式
     */
    @Override
    public String getModeTree() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SResourceRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public SResourceRecord setCategory(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public String getCategory() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SResourceRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SResourceRecord setActive(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SResourceRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SResourceRecord setCreatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SResourceRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SResourceRecord setUpdatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SResourceRecord setUpdatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, String, String, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, String, String, Integer, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SResource.S_RESOURCE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SResource.S_RESOURCE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SResource.S_RESOURCE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SResource.S_RESOURCE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SResource.S_RESOURCE.IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SResource.S_RESOURCE.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return SResource.S_RESOURCE.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SResource.S_RESOURCE.MODE_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SResource.S_RESOURCE.MODE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SResource.S_RESOURCE.MODE_TREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SResource.S_RESOURCE.SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SResource.S_RESOURCE.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SResource.S_RESOURCE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return SResource.S_RESOURCE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SResource.S_RESOURCE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field16() {
        return SResource.S_RESOURCE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SResource.S_RESOURCE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field18() {
        return SResource.S_RESOURCE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SResource.S_RESOURCE.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getModeRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getModeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getModeTree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component16() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component18() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getModeRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getModeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getModeTree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value16() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value18() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value5(String value) {
        setIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value6(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value7(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value8(String value) {
        setModeRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value9(String value) {
        setModeGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value10(String value) {
        setModeTree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value11(String value) {
        setSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value12(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value13(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value14(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value16(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value18(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value19(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8, String value9, String value10, String value11, String value12, String value13, Boolean value14, String value15, LocalDateTime value16, String value17, LocalDateTime value18, String value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISResource from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setIdentifier(from.getIdentifier());
        setComment(from.getComment());
        setLevel(from.getLevel());
        setModeRole(from.getModeRole());
        setModeGroup(from.getModeGroup());
        setModeTree(from.getModeTree());
        setSigma(from.getSigma());
        setCategory(from.getCategory());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISResource> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SResourceRecord
     */
    public SResourceRecord() {
        super(SResource.S_RESOURCE);
    }

    /**
     * Create a detached, initialised SResourceRecord
     */
    public SResourceRecord(String key, String code, String name, String type, String identifier, String comment, Integer level, String modeRole, String modeGroup, String modeTree, String sigma, String category, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(SResource.S_RESOURCE);

        set(0, key);
        set(1, code);
        set(2, name);
        set(3, type);
        set(4, identifier);
        set(5, comment);
        set(6, level);
        set(7, modeRole);
        set(8, modeGroup);
        set(9, modeTree);
        set(10, sigma);
        set(11, category);
        set(12, language);
        set(13, active);
        set(14, metadata);
        set(15, createdAt);
        set(16, createdBy);
        set(17, updatedAt);
        set(18, updatedBy);
    }
}
