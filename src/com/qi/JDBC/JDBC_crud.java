package com.qi.JDBC;

import java.sql.*;

public class JDBC_crud {

    public void jdbcQuery() {

        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //连接驱动
            con = JDBCUtil.getCon();
            //创建数据库操作对象
            statement = con.createStatement();
            //执行查询
            resultSet = statement.executeQuery("select * from category");
            //打印结果
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String cname = resultSet.getString(2);
                String cdesc = resultSet.getString(3);

                System.out.println("id="+id+"=======cname="+cname+"======+cdesc="+cdesc);
            }

            JDBCUtil.release(con,statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void jdbcInsert() {

        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            //连接驱动
            con = JDBCUtil.getCon();
            String sql = "insert into category values (null,'休闲娱乐','欢乐谷14号')";
            //创建数据库操作对象
            preparedStatement = con.prepareStatement(sql);
            //执行查询
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
            //打印结果
            if(i!=0) {
                System.out.println("添加成功！");
            }
            JDBCUtil.release(con,preparedStatement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
