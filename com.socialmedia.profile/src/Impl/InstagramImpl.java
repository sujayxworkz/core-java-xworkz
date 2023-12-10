package Impl;

import Profile.Instagram;
import Profile.InstagramDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InstagramImpl implements Instagram {

    public static void finallyBlock(){

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        if(con!=null){
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(stmt!=null){
            try {
                stmt.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(result!=null){
            try {
                result.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public boolean createProfile(InstagramDTO dto) {
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("insert into facebook_info values(?,?,?,?,?)");
            stmt.setInt(1,dto.getProfileId());
            stmt.setString(2,dto.getProfileName());
            stmt.setLong(3,dto.getPhNumber());
            stmt.setInt(4,dto.getAge());
            stmt.setString(5,dto.getPassword());
//          stmt.executeUpdate("delete from profile_info where profile_id = 247");
//            String sql="delete from profile_info where id=0";
//            stmt =con.prepareStatement(sql);
//            stmt.execute();
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return  false;
    }

    @Override
    public List<InstagramDTO> getUser() {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        List<InstagramDTO> instaDTO = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select * from profile_info");

            result = stmt.executeQuery();
            while (result.next()) {
                InstagramDTO insta = new InstagramDTO();
                insta.setProfileId(result.getInt(1));
                insta.setProfileName(result.getString(2));
                insta.setPhNumber(result.getLong(3));
                insta.setAge(result.getInt(4));
                insta.setPassword(result.getString(5));

                instaDTO.add(insta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }if(result!=null){
            try {
                result.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return instaDTO;

    }

    @Override
    public InstagramDTO getUserByPhNumber(Long phoneNumber) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet result = null;

        List instagramDTOS = new ArrayList<>();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from profile_info where ph_number=?");
            stmt.setLong(1,phoneNumber);
            result = stmt.executeQuery();

            while (result.next()) {

                InstagramDTO insta = new InstagramDTO();
                insta.setProfileId(result.getInt(1));
                insta.setProfileName(result.getString(2));
                insta.setPhNumber(result.getLong(3));
                insta.setAge(result.getInt(4));
                insta.setPassword(result.getString(5));

                instagramDTOS.add(insta);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
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

        return null;
    }

    @Override
    public boolean updateProfileNameByProfileId(String updateName,int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        boolean isUpdated = false;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("update profile_info set profile_name=? where profile_id=?");
            stmt.setString(1,updateName);
            stmt.setInt(2,id);

            int rs = stmt.executeUpdate();
            con.commit();
            isUpdated = true;

        }catch (SQLException e){
            e.printStackTrace();
            try {
                con.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return isUpdated;
    }

    @Override
    public boolean deleteProfileByProfileId(int profileId) {

        Connection con  =null;
        PreparedStatement stmt = null;
        boolean isDeleted = false;


        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt = con.prepareStatement("delete from profile_info where profile_id=?");
            stmt.setInt(1,profileId);
            stmt.executeUpdate();

            con.commit();
            isDeleted = true;

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            finallyBlock();
        }

        return true;

    }


}
