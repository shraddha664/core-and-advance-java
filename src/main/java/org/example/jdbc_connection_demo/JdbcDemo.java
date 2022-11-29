package org.example.jdbc_connection_demo;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
/*
* import---->java.sql
* load and register the driver-->com.mysql.jdbc.Driver
* create connection
* create a statement
* execute the query
* process the results
* close
 */
//        mysql : default user :root pswrd :spmysql port:3306
        String url="jdbc:mysql://localhost:3306/abc";
        String uname="root";
        String pass="spmysql";
        String userName="Saru";
        int userId=20;
        int userAge=24;
        float userMarks=90;

      Class.forName("com.mysql.jdbc.Driver");
      Connection conn=DriverManager.getConnection(url,uname,pass);
//      ------Statements in JBDC Connection-------
//        String query="select * from student ";
//        String insertQuery="insert into student values(11,'Shraddha',90,24)";
//      Statement st=conn.createStatement();
//
//      ResultSet rs=st.executeQuery(query);
//      while(rs.next()) {
//    String name = rs.getString("stud_name");
//    int id=rs.getInt("stud_id");
//
//    System.out.println("name:" + name+" id: "+id);
//}
//     int rs2=st.executeUpdate(insertQuery);
//        System.out.println(rs2+" row/s affected");
//        st.close();
//        conn.close();


//        ---Prepared Statements in JDBC------
        String query="insert into student values (?,?,?,?) ";
        PreparedStatement st=conn.prepareStatement(query);
        st.setInt(1,userId);
        st.setString(2,userName);
        st.setFloat(3,userMarks);
        st.setInt(4,userAge);


        int count=st.executeUpdate();
        System.out.println(count+" row/s affected");
    }
}
