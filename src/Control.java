import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;

public class Control {
     static String ConnectionURL="jdbc:derby://localhost:1527/LibraryMS";
     static void addbookK(Book b){
        
        try {
           Connection conn= DriverManager.getConnection(ConnectionURL,"LibraryMS","12345");
       Statement st= conn.createStatement();
       String sql = "INSERT INTO BOOK VALUES ('"+b.Title+"','"+b.Subject+"',"+b.numberOfPages+","+b.Price+",'"+b.Author+"','"+b.Language+"')";
            System.out.println(sql);
  st.executeUpdate(sql);
st.close(); conn.close(); }
catch (SQLException ex) {System.out.println("Connect failed ! "+ex);}     
     } 
     
     static ResultSet search(String Title) {
        
       
           try{
             Connection conn= DriverManager.getConnection(ConnectionURL,"LibraryMS","12345");
              Statement st= conn.createStatement();
               String sql ="SELECT PRICE,SUBJECT,AUTHOR FROM BOOK WHERE TITLE='"+Title+"'";
                       System.out.println(sql);
       ResultSet rs = st.executeQuery(sql);
        return rs;
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
              return null;
           }
     }
           static void makeAReservation(RoomReservation r){
        
        try {
           Connection conn= DriverManager.getConnection(ConnectionURL,"LibraryMS","12345");
       Statement st= conn.createStatement();
      
       String sql = "INSERT INTO ROOMRESERVATION VALUES ("+r.ReservationId+","+r.numOfStudents+",'"+r.Time+"',"+r.Duration+",'"+r.roomReservationLetter+"')";
            System.out.println(sql);
    st.executeUpdate(sql);
    st.close(); conn.close(); }
      catch (SQLException ex) {System.out.println("Connect failed ! "+ex);}     
     } 
          
      static void Rigester(Account A){
      

        try {
           Connection conn= DriverManager.getConnection(ConnectionURL,"LibraryMS","12345");
          
       Statement st= conn.createStatement();
       
      ResultSet rs = st.executeQuery("SELECT ID FROM ACCOUNT ORDER BY ID DESC ");
       
            rs.next();
            
            int counter = rs.getInt("ID");
            counter++;

                
        String sql = "INSERT INTO ACCOUNT VALUES ("+counter+",'"+A.Password+"','"+A.Name+"','"+A.Email+"','"+A.Address+"','"+A.Phone+"')";
        
            System.out.println(sql);
    st.executeUpdate(sql);
    st.close(); conn.close(); }
      catch (SQLException ex) {System.out.println("Connect failed ! "+ex);}     
     } ;
     
      

        static boolean LogIN (String Username,String Password){
      try {

            Connection conn = DriverManager.getConnection(ConnectionURL, "LibraryMS", "12345");
            Statement st = conn.createStatement();
      
            String sql ="SELECT NAME,PASSWORD FROM ACCOUNT WHERE NAME = '"+Username+"' AND PASSWORD = '"+Password+"'";
                
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
            return false;
        }
}
} 
  
    
        

