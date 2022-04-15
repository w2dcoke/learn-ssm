package org.example.ssm.pojo;

import java.util.List;

/**
 * @author why
 * @date 2022/4/13
 */
public class VO {
    List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "VO{" +
                "list=" + list +
                '}';
    }
}
