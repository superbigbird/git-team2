package cn.java.dao.impl;

import cn.java.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 16:19
 王二麻子到此一游
 */
public class UserDaoImpl {
    private QueryRunner qr = new QueryRunner(JdbcUtil.dataSource);

    /**
     * 查询所有数据信息
     */
    @Test
    public void selectAll() throws SQLException {
        List<Map<String, Object>> queryList = qr.query("SELECT * FROM users", new MapListHandler());
        queryList.forEach((temp)-> System.out.println(temp));

    }
}
