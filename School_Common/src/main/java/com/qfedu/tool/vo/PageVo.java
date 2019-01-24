package com.qfedu.tool.vo;

import java.util.List;

public class PageVo<T> {
    private Integer count;//总数据
    private Integer currpage; //当前页码
    private Integer size;//每页显示的数量
    private List<T> data; //查询到的数据

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCurrpage() {
        return currpage;
    }

    public void setCurrpage(Integer currpage) {
        this.currpage = currpage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
