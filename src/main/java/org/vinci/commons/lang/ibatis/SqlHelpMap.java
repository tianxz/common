package org.vinci.commons.lang.ibatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 提供快速配置查询条件和更新字段Map的抽象类
 * Created by XizeTian on 2017/10/19.
 */
public abstract class SqlHelpMap<T extends SqlHelp> extends HashMap<String, T> {

    public List<T> toList() {
        List<T> lst = new ArrayList<>();
        for (String key : this.keySet()) {
            lst.add(this.get(key));
        }
        return lst;
    }

    public void resetAll() {
        for (String key : this.keySet()) {
            this.get(key).reset();
        }
    }
}