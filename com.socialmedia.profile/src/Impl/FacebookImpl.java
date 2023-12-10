package Impl;

import Profile.Facebook;
import Profile.FacebookDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FacebookImpl implements Facebook {
    @Override
    public boolean createProfile(FacebookDTO dto) {

        Connection con = null;
        PreparedStatement stmt = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("insert into facebook_info values (?,?,?,?,?)");
            stmt.setInt(1,dto.getFacebbokId());
            stmt.setString(2,dto.getUserName());
            stmt.setString(3, dto.getUserPassword());
            stmt.setLong(4,dto.getPhoneNumber());
            stmt.setString(5,dto.getAddress());

            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<FacebookDTO> getProfile() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        List<FacebookDTO> facebookDTOS = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from facebook_info");
            result = stmt.executeQuery();

            while(result.next()){
                FacebookDTO fb = new FacebookDTO();

                fb.setFacebbokId(result.getInt(1));
                fb.setUserName(result.getString(2));
                fb.setUserPassword(result.getString(3));
                fb.setPhoneNumber(result.getLong(4));
                fb.setAddress(result.getString(5));

                facebookDTOS.add(fb);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (result!=null){
                try {
                    result.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return facebookDTOS;
    }

    @Override
    public FacebookDTO getUserNameByAddress(String address) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        List<FacebookDTO> facebookDTOS = new ArrayList<>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from facebook_info where address=?");
            stmt.setString(1,address);
            result = stmt.executeQuery();

            while(result.next()){
                FacebookDTO dto = new FacebookDTO();
                dto.setFacebbokId(result.getInt(1));
                dto.setUserName(result.getString(2));
                dto.setUserPassword(result.getString(3));
                dto.setPhoneNumber(result.getLong(4));
                dto.setAddress(result.getString(5));

                facebookDTOS.add(dto);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (result!=null){
                try {
                    result.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return null;
    }

    @Override
    public boolean updateUserNameByAddress(String updatedName, String address) {

        Connection con = null;
        PreparedStatement stmt = null;
        boolean isUpdated = false;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update facebook_info set user_name=? where address=?");
            stmt.setString(1,updatedName);
            stmt.setString(2,address);

            int count = stmt.executeUpdate();
            if(count>0){
                System.out.println("updated successfully");
            }else{
                System.out.println("update failed");
            }
            con.commit();
            isUpdated = true;

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return false;
    }

    @Override
    public boolean deleteUserId(int id) {

        Connection con = null;
        PreparedStatement stmt = null;
        boolean isDeleted = false;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from facebook_info where facebbok_id=? ");
            stmt.setInt(1,id);
            stmt.executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return false;
    }

    @Override
    public FacebookDTO getFacebookIdEndsBySixByUserName(String userName) {


        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        List<FacebookDTO> facebookDTOS = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql//localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from facebook_info where facebbok_id LIKE '%6' ");
            stmt.setString(1,userName);
            result = stmt.executeQuery();

            while (result.next()){
                FacebookDTO dto = new FacebookDTO();
                dto.setFacebbokId(result.getInt(1));
                dto.setUserName(result.getString(2));
                dto.setUserPassword(result.getString(3));
                dto.setPhoneNumber(result.getLong(4));
                dto.setAddress(result.getString(5));

                facebookDTOS.add(dto);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }if (result!=null){
                try {
                    result.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return null;
    }

}
