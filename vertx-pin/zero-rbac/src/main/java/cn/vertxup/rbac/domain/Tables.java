/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain;


import cn.vertxup.rbac.domain.tables.OAccessToken;
import cn.vertxup.rbac.domain.tables.OUser;
import cn.vertxup.rbac.domain.tables.RGroupRole;
import cn.vertxup.rbac.domain.tables.RRolePerm;
import cn.vertxup.rbac.domain.tables.RUserGroup;
import cn.vertxup.rbac.domain.tables.RUserRole;
import cn.vertxup.rbac.domain.tables.SAction;
import cn.vertxup.rbac.domain.tables.SGroup;
import cn.vertxup.rbac.domain.tables.SPermission;
import cn.vertxup.rbac.domain.tables.SResource;
import cn.vertxup.rbac.domain.tables.SRole;
import cn.vertxup.rbac.domain.tables.SUser;
import cn.vertxup.rbac.domain.tables.SView;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in DB_ETERNAL
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>DB_ETERNAL.O_ACCESS_TOKEN</code>.
     */
    public static final OAccessToken O_ACCESS_TOKEN = cn.vertxup.rbac.domain.tables.OAccessToken.O_ACCESS_TOKEN;

    /**
     * The table <code>DB_ETERNAL.O_USER</code>.
     */
    public static final OUser O_USER = cn.vertxup.rbac.domain.tables.OUser.O_USER;

    /**
     * The table <code>DB_ETERNAL.R_GROUP_ROLE</code>.
     */
    public static final RGroupRole R_GROUP_ROLE = cn.vertxup.rbac.domain.tables.RGroupRole.R_GROUP_ROLE;

    /**
     * The table <code>DB_ETERNAL.R_ROLE_PERM</code>.
     */
    public static final RRolePerm R_ROLE_PERM = cn.vertxup.rbac.domain.tables.RRolePerm.R_ROLE_PERM;

    /**
     * The table <code>DB_ETERNAL.R_USER_GROUP</code>.
     */
    public static final RUserGroup R_USER_GROUP = cn.vertxup.rbac.domain.tables.RUserGroup.R_USER_GROUP;

    /**
     * The table <code>DB_ETERNAL.R_USER_ROLE</code>.
     */
    public static final RUserRole R_USER_ROLE = cn.vertxup.rbac.domain.tables.RUserRole.R_USER_ROLE;

    /**
     * The table <code>DB_ETERNAL.S_ACTION</code>.
     */
    public static final SAction S_ACTION = cn.vertxup.rbac.domain.tables.SAction.S_ACTION;

    /**
     * The table <code>DB_ETERNAL.S_GROUP</code>.
     */
    public static final SGroup S_GROUP = cn.vertxup.rbac.domain.tables.SGroup.S_GROUP;

    /**
     * The table <code>DB_ETERNAL.S_PERMISSION</code>.
     */
    public static final SPermission S_PERMISSION = cn.vertxup.rbac.domain.tables.SPermission.S_PERMISSION;

    /**
     * The table <code>DB_ETERNAL.S_RESOURCE</code>.
     */
    public static final SResource S_RESOURCE = cn.vertxup.rbac.domain.tables.SResource.S_RESOURCE;

    /**
     * The table <code>DB_ETERNAL.S_ROLE</code>.
     */
    public static final SRole S_ROLE = cn.vertxup.rbac.domain.tables.SRole.S_ROLE;

    /**
     * The table <code>DB_ETERNAL.S_USER</code>.
     */
    public static final SUser S_USER = cn.vertxup.rbac.domain.tables.SUser.S_USER;

    /**
     * The table <code>DB_ETERNAL.S_VIEW</code>.
     */
    public static final SView S_VIEW = cn.vertxup.rbac.domain.tables.SView.S_VIEW;
}
