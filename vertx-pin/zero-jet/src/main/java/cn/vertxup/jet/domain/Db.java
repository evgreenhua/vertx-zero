/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.jet.domain;


import cn.vertxup.jet.domain.tables.IApi;
import cn.vertxup.jet.domain.tables.IJob;
import cn.vertxup.jet.domain.tables.IService;
import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
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
public class Db extends SchemaImpl {

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();
    private static final long serialVersionUID = -1304652200;
    /**
     * The table <code>DB_ETERNAL.I_API</code>.
     */
    public final IApi I_API = cn.vertxup.jet.domain.tables.IApi.I_API;

    /**
     * The table <code>DB_ETERNAL.I_JOB</code>.
     */
    public final IJob I_JOB = cn.vertxup.jet.domain.tables.IJob.I_JOB;

    /**
     * The table <code>DB_ETERNAL.I_SERVICE</code>.
     */
    public final IService I_SERVICE = cn.vertxup.jet.domain.tables.IService.I_SERVICE;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                IApi.I_API,
                IJob.I_JOB,
                IService.I_SERVICE);
    }
}
