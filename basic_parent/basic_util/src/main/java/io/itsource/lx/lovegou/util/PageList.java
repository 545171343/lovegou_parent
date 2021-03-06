package io.itsource.lx.lovegou.util;

import java.util.ArrayList;
import java.util.List;

public class PageList<T> {
    private Long total;
    private List<T> rows = new ArrayList<>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageList() {
    }

    @Override
    public String toString() {
        return "PageList{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
