package com.qi.JDBC;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            /*//注册驱动
            // 第一种 DriverManager.registerDriver(new Driver());  驱动二次注册，所以修改为以下代码
            Class.forName("com.mysql.jdbc.Driver");  //第二种

            //建立连接
            con = DriverManager.getConnection("jdbc:mysql://localhost/shuju?" +
                    "user=root&password=root");*/

            //利用工具类注册驱动并建立连接
            con = JDBCUtil.getCon();

            //创建statement
            statement = con.createStatement();

            //执行操作
            String sql = "select * from category";
            resultSet = statement.executeQuery(sql);

            //遍历结果
            while(resultSet.next()){
                int cid = resultSet.getInt("cid");
                String cname = resultSet.getString("cname");
                String cdesc = resultSet.getString("cdesc");

                System.out.println("cid="+cid + "----cname="+cname + "-----cdesc="+cdesc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(con,statement,resultSet);
        }
    }
}
