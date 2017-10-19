package org.vinci.commons.lang.ibatis;

public class SqlQuery extends SqlHelp {
    private SqlOperator operator = SqlOperator.EQ;

    public SqlQuery(String fieldName, String sqlName) {
        super.setFieldName(fieldName);
        super.setSqlName(sqlName);
    }

    @Override
    public void reset() {
        super.reset();
        this.operator = SqlOperator.EQ;
    }
}