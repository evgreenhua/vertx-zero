/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.atom.domain;


import cn.vertxup.atom.domain.tables.MAttribute;
import cn.vertxup.atom.domain.tables.MEntity;
import cn.vertxup.atom.domain.tables.MField;
import cn.vertxup.atom.domain.tables.MIndex;
import cn.vertxup.atom.domain.tables.MJoin;
import cn.vertxup.atom.domain.tables.MKey;
import cn.vertxup.atom.domain.tables.MModel;
import cn.vertxup.atom.domain.tables.MRelation;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index M_ATTRIBUTE_NAME = Indexes0.M_ATTRIBUTE_NAME;
    public static final Index M_ATTRIBUTE_PRIMARY = Indexes0.M_ATTRIBUTE_PRIMARY;
    public static final Index M_ENTITY_NAMESPACE = Indexes0.M_ENTITY_NAMESPACE;
    public static final Index M_ENTITY_NAMESPACE_2 = Indexes0.M_ENTITY_NAMESPACE_2;
    public static final Index M_ENTITY_PRIMARY = Indexes0.M_ENTITY_PRIMARY;
    public static final Index M_ENTITY_SIGMA = Indexes0.M_ENTITY_SIGMA;
    public static final Index M_FIELD_NAME = Indexes0.M_FIELD_NAME;
    public static final Index M_FIELD_PRIMARY = Indexes0.M_FIELD_PRIMARY;
    public static final Index M_INDEX_NAME = Indexes0.M_INDEX_NAME;
    public static final Index M_INDEX_PRIMARY = Indexes0.M_INDEX_PRIMARY;
    public static final Index M_JOIN_PRIMARY = Indexes0.M_JOIN_PRIMARY;
    public static final Index M_KEY_NAME = Indexes0.M_KEY_NAME;
    public static final Index M_KEY_PRIMARY = Indexes0.M_KEY_PRIMARY;
    public static final Index M_MODEL_NAMESPACE = Indexes0.M_MODEL_NAMESPACE;
    public static final Index M_MODEL_NAMESPACE_2 = Indexes0.M_MODEL_NAMESPACE_2;
    public static final Index M_MODEL_PRIMARY = Indexes0.M_MODEL_PRIMARY;
    public static final Index M_RELATION_PRIMARY = Indexes0.M_RELATION_PRIMARY;
    public static final Index M_RELATION_TYPE = Indexes0.M_RELATION_TYPE;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index M_ATTRIBUTE_NAME = Internal.createIndex("NAME", MAttribute.M_ATTRIBUTE, new OrderField[] { MAttribute.M_ATTRIBUTE.NAME, MAttribute.M_ATTRIBUTE.MODEL_ID }, true);
        public static Index M_ATTRIBUTE_PRIMARY = Internal.createIndex("PRIMARY", MAttribute.M_ATTRIBUTE, new OrderField[] { MAttribute.M_ATTRIBUTE.KEY }, true);
        public static Index M_ENTITY_NAMESPACE = Internal.createIndex("NAMESPACE", MEntity.M_ENTITY, new OrderField[] { MEntity.M_ENTITY.NAMESPACE, MEntity.M_ENTITY.IDENTIFIER }, true);
        public static Index M_ENTITY_NAMESPACE_2 = Internal.createIndex("NAMESPACE_2", MEntity.M_ENTITY, new OrderField[] { MEntity.M_ENTITY.NAMESPACE, MEntity.M_ENTITY.NAME }, true);
        public static Index M_ENTITY_PRIMARY = Internal.createIndex("PRIMARY", MEntity.M_ENTITY, new OrderField[] { MEntity.M_ENTITY.KEY }, true);
        public static Index M_ENTITY_SIGMA = Internal.createIndex("SIGMA", MEntity.M_ENTITY, new OrderField[] { MEntity.M_ENTITY.SIGMA, MEntity.M_ENTITY.TABLE_NAME }, true);
        public static Index M_FIELD_NAME = Internal.createIndex("NAME", MField.M_FIELD, new OrderField[] { MField.M_FIELD.NAME, MField.M_FIELD.ENTITY_ID }, true);
        public static Index M_FIELD_PRIMARY = Internal.createIndex("PRIMARY", MField.M_FIELD, new OrderField[] { MField.M_FIELD.KEY }, true);
        public static Index M_INDEX_NAME = Internal.createIndex("NAME", MIndex.M_INDEX, new OrderField[] { MIndex.M_INDEX.NAME, MIndex.M_INDEX.ENTITY_ID }, true);
        public static Index M_INDEX_PRIMARY = Internal.createIndex("PRIMARY", MIndex.M_INDEX, new OrderField[] { MIndex.M_INDEX.KEY }, true);
        public static Index M_JOIN_PRIMARY = Internal.createIndex("PRIMARY", MJoin.M_JOIN, new OrderField[] { MJoin.M_JOIN.MODEL, MJoin.M_JOIN.ENTITY, MJoin.M_JOIN.ENTITY_KEY, MJoin.M_JOIN.NAMESPACE }, true);
        public static Index M_KEY_NAME = Internal.createIndex("NAME", MKey.M_KEY, new OrderField[] { MKey.M_KEY.NAME, MKey.M_KEY.ENTITY_ID }, true);
        public static Index M_KEY_PRIMARY = Internal.createIndex("PRIMARY", MKey.M_KEY, new OrderField[] { MKey.M_KEY.KEY }, true);
        public static Index M_MODEL_NAMESPACE = Internal.createIndex("NAMESPACE", MModel.M_MODEL, new OrderField[] { MModel.M_MODEL.NAMESPACE, MModel.M_MODEL.IDENTIFIER }, true);
        public static Index M_MODEL_NAMESPACE_2 = Internal.createIndex("NAMESPACE_2", MModel.M_MODEL, new OrderField[] { MModel.M_MODEL.NAMESPACE, MModel.M_MODEL.NAME }, true);
        public static Index M_MODEL_PRIMARY = Internal.createIndex("PRIMARY", MModel.M_MODEL, new OrderField[] { MModel.M_MODEL.KEY }, true);
        public static Index M_RELATION_PRIMARY = Internal.createIndex("PRIMARY", MRelation.M_RELATION, new OrderField[] { MRelation.M_RELATION.KEY }, true);
        public static Index M_RELATION_TYPE = Internal.createIndex("TYPE", MRelation.M_RELATION, new OrderField[] { MRelation.M_RELATION.TYPE, MRelation.M_RELATION.UPSTREAM, MRelation.M_RELATION.DOWNSTREAM, MRelation.M_RELATION.SIGMA }, true);
    }
}
