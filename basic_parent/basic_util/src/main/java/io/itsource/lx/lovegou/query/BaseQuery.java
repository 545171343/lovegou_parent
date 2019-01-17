package io.itsource.lx.lovegou.query;
//基础查询
public class BaseQuery {
    private String keyword;
    //有公共属性-分页
    private Integer page = 1; //当前页
    private Integer rows = 10; //每页显示多少条

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

}