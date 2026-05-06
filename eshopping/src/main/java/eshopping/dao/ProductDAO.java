package eshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import eshopping.model.Product;
import eshopping.util.DBConnection;

public class ProductDAO {

    public void addProduct(Product p)
    {
        String sql = "insert into product(name ,price) values(? ,?)";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());

            ps.executeUpdate();

            System.out.println("Data added");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public void getAllProducts()
    {
        String sql = "select * from product";

        try(Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql))
        {
            while(rs.next())
            {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getDouble("price")
                );
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void updateProduct(Product p)
    {
        String sql = "update product set name=?, price=? where id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getId());

            ps.executeUpdate();

            System.out.println("Product updated successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(int id)
    {
        String sql = "delete from product where id=?";

        try(Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Product deleted successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}