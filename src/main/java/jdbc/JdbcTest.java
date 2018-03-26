package jdbc;

import java.sql.*;

/**
 * @author simple_huang@foxmail.com on 2018/3/26.
 */
public class JdbcTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cloud_partner?characterEncoding=utf8", "root", "111111");
            stat = conn.createStatement();
            String sql = "select id, name from partner";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                System.out.println("id " + id + " name " + name);
            }

            rs.close();
            stat.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stat!=null)
                    stat.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
    }
}
