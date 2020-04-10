/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain.tables;


import cn.vertxup.graphic.domain.Db;
import cn.vertxup.graphic.domain.Indexes;
import cn.vertxup.graphic.domain.Keys;
import cn.vertxup.graphic.domain.tables.records.GClusterRecord;
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
public class GCluster extends TableImpl<GClusterRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.G_CLUSTER</code>
     */
    public static final GCluster G_CLUSTER = new GCluster();
    private static final long serialVersionUID = 1703922930;
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.KEY</code>. 「key」- 组ID
     */
    public final TableField<GClusterRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 组ID");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.NAME</code>. 「name」- 组呈现名称
     */
    public final TableField<GClusterRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 组呈现名称");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.X</code>. 「x」- 当前组在图上的x坐标
     */
    public final TableField<GClusterRecord, Integer> X = createField("X", org.jooq.impl.SQLDataType.INTEGER, this, "「x」- 当前组在图上的x坐标");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.Y</code>. 「y」- 当前组在图上的y坐标
     */
    public final TableField<GClusterRecord, Integer> Y = createField("Y", org.jooq.impl.SQLDataType.INTEGER, this, "「y」- 当前组在图上的y坐标");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.GRAPHIC_ID</code>. 「graphicId」- 它所关联的图实例ID
     */
    public final TableField<GClusterRecord, String> GRAPHIC_ID = createField("GRAPHIC_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「graphicId」- 它所关联的图实例ID");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.UI</code>. 「ui」- ui配置专用
     */
    public final TableField<GClusterRecord, String> UI = createField("UI", org.jooq.impl.SQLDataType.CLOB, this, "「ui」- ui配置专用");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.RECORD_KEY</code>. 「recordKey」- 记录主键
     */
    public final TableField<GClusterRecord, String> RECORD_KEY = createField("RECORD_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「recordKey」- 记录主键");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.RECORD_DATA</code>. 「recordData」- 组中存储的数据信息
     */
    public final TableField<GClusterRecord, String> RECORD_DATA = createField("RECORD_DATA", org.jooq.impl.SQLDataType.CLOB, this, "「recordData」- 组中存储的数据信息");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<GClusterRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<GClusterRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<GClusterRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<GClusterRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<GClusterRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<GClusterRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<GClusterRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.G_CLUSTER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<GClusterRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.G_CLUSTER</code> table reference
     */
    public GCluster() {
        this(DSL.name("G_CLUSTER"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_CLUSTER</code> table reference
     */
    public GCluster(String alias) {
        this(DSL.name(alias), G_CLUSTER);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.G_CLUSTER</code> table reference
     */
    public GCluster(Name alias) {
        this(alias, G_CLUSTER);
    }

    private GCluster(Name alias, Table<GClusterRecord> aliased) {
        this(alias, aliased, null);
    }

    private GCluster(Name alias, Table<GClusterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GClusterRecord> getRecordType() {
        return GClusterRecord.class;
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
        return Arrays.<Index>asList(Indexes.G_CLUSTER_NAME, Indexes.G_CLUSTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GClusterRecord> getPrimaryKey() {
        return Keys.KEY_G_CLUSTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GClusterRecord>> getKeys() {
        return Arrays.<UniqueKey<GClusterRecord>>asList(Keys.KEY_G_CLUSTER_PRIMARY, Keys.KEY_G_CLUSTER_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GCluster as(String alias) {
        return new GCluster(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GCluster as(Name alias) {
        return new GCluster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GCluster rename(String name) {
        return new GCluster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GCluster rename(Name name) {
        return new GCluster(name, null);
    }
}
