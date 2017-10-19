package org.vinci.commons.lang.ibatis;

public class SqlUpdate extends SqlHelp {
    public SqlUpdate(String fieldName, String sqlName) {
        super.setFieldName(fieldName);
        super.setSqlName(sqlName);
    }
}