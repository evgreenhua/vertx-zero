/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables;


import cn.vertxup.atom.domain.Db;
import cn.vertxup.atom.domain.Indexes;
import cn.vertxup.atom.domain.Keys;
import cn.vertxup.atom.domain.tables.records.MRelationRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MRelation extends TableImpl<MRelationRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.M_RELATION</code>
     */
    public static final MRelation M_RELATION = new MRelation();
    private static final long serialVersionUID = -503320324;
    /**
     * The column <code>DB_ETERNAL.M_RELATION.KEY</code>. 「key」- 关系定义的主键
     */
    public final TableField<MRelationRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 关系定义的主键");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.TYPE</code>. 「type」- 关系类型 - 来自（字典）
     */
    public final TableField<MRelationRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「type」- 关系类型 - 来自（字典）");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.UPSTREAM</code>. 「upstream」- 当前关系是 upstream，表示上级
     */
    public final TableField<MRelationRecord, String> UPSTREAM = createField("UPSTREAM", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「upstream」- 当前关系是 upstream，表示上级");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.DOWNSTREAM</code>. 「downstream」- 当前关系是 downstream，表示下级
     */
    public final TableField<MRelationRecord, String> DOWNSTREAM = createField("DOWNSTREAM", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「downstream」- 当前关系是 downstream，表示下级");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.COMMENTS</code>. 「comments」- 关系定义的描述信息
     */
    public final TableField<MRelationRecord, String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.CLOB, this, "「comments」- 关系定义的描述信息");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MRelationRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MRelationRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MRelationRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MRelationRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MRelationRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MRelationRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MRelationRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.M_RELATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MRelationRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.M_RELATION</code> table reference
     */
    public MRelation() {
        this(DSL.name("M_RELATION"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_RELATION</code> table reference
     */
    public MRelation(String alias) {
        this(DSL.name(alias), M_RELATION);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.M_RELATION</code> table reference
     */
    public MRelation(Name alias) {
        this(alias, M_RELATION);
    }

    private MRelation(Name alias, Table<MRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MRelation(Name alias, Table<MRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MRelationRecord> getRecordType() {
        return MRelationRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.M_RELATION_PRIMARY, Indexes.M_RELATION_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MRelationRecord> getPrimaryKey() {
        return Keys.KEY_M_RELATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<MRelationRecord>>asList(Keys.KEY_M_RELATION_PRIMARY, Keys.KEY_M_RELATION_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MRelation as(String alias) {
        return new MRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MRelation as(Name alias) {
        return new MRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MRelation rename(String name) {
        return new MRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MRelation rename(Name name) {
        return new MRelation(name, null);
    }
}
