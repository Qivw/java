package com.qi.JDBC;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


/**
 * JDBC工具类
 */
public class JDBCUtil {

    static String url = null;
    static String driverClass = null;

    //利用静态代码块加载配置文件
    static {
        try {
            //创建属性配置对象
            Properties properties = new Properties();
            //创建输入流  对应文件位于项目根目录下
            //InputStream is =  new FileInputStream("jdbc.properties");
            //使用类加载器，去读取src下的资源文件（对应文件位于src目录）
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            //加载配置文件
            properties.load(is);
            //读取属性
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取连接对象
     * */
    public static Connection getCon() {

        Connection con = null;
        try {
            //JDBC4.0 之后会帮我们注册驱动可以省略（加上也无所谓）
            //Class.forName(driverClass);
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    /**
     * JDBC释放资源Util
     */
    public static void release(Connection connection, Statement statement, ResultSet resultSet) {

        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(connection);
    }

    private static void closeResultSet(ResultSet resultSet) {
       if(resultSet != null) {
           try {
               resultSet.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
           resultSet = null;
       }
    }

    private static void closeStatement(Statement statement) {
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement = null;
        }
    }

    private static void closeConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection = null;
        }
    }
}
