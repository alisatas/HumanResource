package homework12.JDBC;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.PreparedBatch;
import org.jdbi.v3.core.statement.StatementException;

import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String server = "sql11.freemysqlhosting.net";
        String dbName = "sql11683450";
        String username = "sql11683450";
        String password = "zJJDHznSQU";
        int port = 3306;

        String dbURL = "jdbc:mysql://" + server + ":" + port + "/" + dbName;
        Jdbi jdbi = Jdbi.create ( dbURL, username, password );
        try (Handle handle = jdbi.open ( )) {
            handle.execute ( "CREATE TABLE IF NOT EXISTS ad_soyad (id serial primary key, name , surnam" );
            System.out.println ( "Table 'ad_soyad' created successfully." );
            PreparedBatch batch = handle.prepareBatch ( "INSERT INTO ad_soyad  (name, surname) VALUES (?, ?)" );
            batch.add ( "Ali", "Tas" );
            batch.add ( "Veli", "ruzgar" );
            batch.add ( "bali", "dag" );
            batch.execute ( );
            System.out.println ( "Items added successfully." );
            handle.createUpdate ( "UPDATE ad_soyad SET name = :name WHERE id = :id" ).bind ( "name", "William" ).bind ( "id", 2 )
             .execute ( );
            System.out.println ( "Item updated successfully!" );
            handle.createUpdate ( "DELETE FROM ad_soyad WHERE id = :id" ).bind ( "id", 3 )  // Delete the record with the provided ID
             .execute ( );
            System.out.println ( "Item deleted successfully!" );
        }
        catch ( StatementException e) {
            e.printStackTrace();
        }
    }
}
