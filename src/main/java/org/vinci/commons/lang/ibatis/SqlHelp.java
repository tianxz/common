package org.vinci.commons.lang.ibatis;

import org.vinci.commons.lang.exception.CommonException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XizeTian on 2017/10/19.
 */
public abstract class SqlHelp {
    private String  fieldName;
    private String  sqlName;
    private boolean isInclude;
    private List<Object> multiValue = new ArrayList<>();

    protected void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    protected void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getSqlName() {
        return sqlName;
    }

    public boolean isInclude() {
        return this.isInclude;
    }

    public SqlHelp setInclude(boolean include) {
        this.isInclude = include;
        return this;
    }

    public SqlHelp include() {
        this.isInclude = true;
        return this;
    }

    public SqlHelp exclude() {
        this.isInclude = false;
        return this;
    }

    public Object getValue() {
        if (this.multiValue.size() == 0) {
            throw new CommonException("SqlHelp.value is null");
        }
        return this.multiValue.get(0);
    }

    public SqlHelp setValue(Object value) {
        this.multiValue.add(value);
        return this;
    }

    public List<Object> getMultiValue() {
        return multiValue;
    }

    public SqlHelp setMultiValue(List<Object> multiValue) {
        if (multiValue == null) {
            this.multiValue = new ArrayList<>();
        } else {
            this.multiValue = multiValue;
        }
        return this;
    }

    public SqlHelp setMultiValue(Object... values) {
        this.multiValue = new ArrayList<>();

        return putMultiValue(values);
    }

    public SqlHelp putMultiValue(Object... values) {
        if (values != null && values.length > 0) {
            for (int i = 0; i < values.length; i++) {
                this.multiValue.add(values[0]);
            }
        }
        return this;
    }

    public void reset() {
        this.isInclude = false;
        this.multiValue = new ArrayList<>();
    }
}
