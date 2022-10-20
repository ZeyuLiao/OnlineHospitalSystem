/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
/**
 *
 * @author Ruolin
 */
public class UserDao {
    	//用户的添加与删除

    private Connection conn = null;
     // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
 
    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //localhost:3306/+database name
    static final String DB_URL = "jdbc:mysql://localhost:3306/neu?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
 
 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123";
	
    //数据库连接
//    public void initConnection() throws Exception{
//		
//	Class.forName(JDBC_DRIVER);  
//    	String url = "jdbc:mysql://localhost:3306/javaweb?serverTimezone=CTT";  
//    	conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	//System.out.println(conn);	//
//	}
//	
//	//通过Account检索Client
//    public Client getClientByAccount(String account) throws Exception{
//		
//	Client cli = null;
//	initConnection();
//	String sql = "SELECT Account,Password,Name FROM Client WHERE Account=?";
//	PreparedStatement ps = conn.prepareStatement(sql);
//	ps.setString(1, account);
//	ResultSet rs = ps.executeQuery();
//	if (rs.next()){
//            cli = new Client();
//            cli.setAccount(rs.getString("Account"));
//            cli.setPassword(rs.getString("Password"));
//            cli.setName(rs.getString("Name"));
//	}
//	closeConnection();
//	return cli;
//	}
//	
//	//关闭数据库连接
//	public void closeConnection() throws Exception{
//		conn.close();
//	}

 
    public void test() {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
        
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM login";
            ResultSet rs = stmt.executeQuery(sql);
        
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("id");
                String name = rs.getString("name");
    
                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
    
}
