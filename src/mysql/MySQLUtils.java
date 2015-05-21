import java.lang.Exception;
import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Map;

public class MySQLUtils {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public MySQLUtils(){
        connectDB("root", "passwd" , "08geolookup", "localhost");
    }

    public void connectDB(String userName, String passwd, String dbName, String host){
        // This will load the MySQL driver, each DB has its own driver
        Class.forName("com.mysql.jdbc.Driver");

        // Setup the connection with the DB
        connect = DriverManager.getConnection("jdbc:mysql://" + host + "/" + dbName + "?user=" + userName + "&password=" + passwd);
    }

    public getwhere (String where) {

    }

    public insert (Map<String, String> row) {

    }

    public void readDataBase() throws Exception {
        try {

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from test_comments");
            handleResultSet(resultSet);

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect.prepareStatement("insert into  test_comments values (default, ?, ?, ?, ? , ?, ?)");
            // "myuser, webpage, datum, summery, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setString(1, "Test");
            preparedStatement.setString(2, "TestEmail");
            preparedStatement.setString(3, "TestWebpage");
            preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
            preparedStatement.setString(5, "TestSummary");
            preparedStatement.setString(6, "TestComment");
            preparedStatement.executeUpdate();

            preparedStatement = connect.prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from test_comments");

            resultSet = preparedStatement.executeQuery();
            handleResultSet(resultSet);

            // Remove again the insert comment
            preparedStatement = connect.prepareStatement("delete from test_comments where myuser= ? ; ");
            preparedStatement.setString(1, "Test");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("select * from test_comments");
            writeMetaData(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //   Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
        }
    }

    private void handleResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String user     = resultSet.getString("myuser");
            String website  = resultSet.getString("webpage");
            String summery  = resultSet.getString("summary");
            Date date       = resultSet.getDate("datum");
            String comment  = resultSet.getString("comments");

            System.out.println("User: "     + user);
            System.out.println("Website: "  + website);
            System.out.println("Summery: "  + summery);
            System.out.println("Date: "     + date);
            System.out.println("Comment: "  + comment);
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
     public static void main(String[] args) throws Exception{
         MySQLUtils dao = new MySQLUtils();
         dao.readDataBase();
     }

}