package cn.java.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author：丁鹏
 * @Description：暂无
 * @Date：创建于 16:21
 */
public class JdbcUtil {
    //数据库连接池
    public static DataSource dataSource = null;

    static{
        try {
            Properties props = new Properties();
            InputStream ins = JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            props.load(ins);
            dataSource = DruidDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
