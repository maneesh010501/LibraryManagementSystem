import java.sql.*;



public class App {
    public static void main(String[] args) throws Exception{
        
       
        String url="jdbc:mysql://localhost:3306/library";
        String uname= "root";
        String password= "root";
        String query="SELECT * FROM books ";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
       
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
           
           
            int BookId = rs.getInt("BookId");
            String Title = rs.getString("Title");
            String Author = rs.getString("Author");
            System.out.println("[Title:"+Title+" Author:"+Author+"]"); 
           
        }
        

        st.close();
        con.close();
    }
    
}
