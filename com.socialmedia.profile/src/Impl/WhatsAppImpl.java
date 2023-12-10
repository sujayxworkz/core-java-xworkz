package Impl;

import Profile.WhatsApp;
import Profile.WhatsAppDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WhatsAppImpl implements WhatsApp {
    @Override
    public void saveProfile(WhatsAppDTO dto) {

        Connection con = null;
        PreparedStatement stmt = null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("insert into whatsapp_info values(?,?,?,?)");
            stmt.setInt(1,dto.getWhatsAppId());
            stmt.setString(2,dto.getProfileName());
            stmt.setLong(3,dto.getPhoneNumber());
            stmt.setString(4, dto.getAddress());

            stmt.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<WhatsAppDTO> getWhatsInfo() {
        Connection con = null;
        PreparedStatement stmt = null;

        List<WhatsAppDTO> whatsAppList = new ArrayList<>();

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("select * from whatsapp_info");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()){
                WhatsAppDTO dto = new WhatsAppDTO();
                dto.setWhatsAppId(resultSet.getInt(1));
                dto.setProfileName(resultSet.getString(2));
                dto.setPhoneNumber(resultSet.getLong(3));
                dto.setAddress(resultSet.getString(4));

                whatsAppList.add(dto);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return whatsAppList;
    }

    @Override
    public boolean updatePhoneNumberByWhatsupId(Long updatedPhNumber, int id) {

        boolean isUpdated = false;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt = con.prepareStatement("update whatsapp_info set phone_number=? where whatsapp_id=?");
            stmt.setLong(1,updatedPhNumber);
            stmt.setInt(2,id);
            stmt.executeUpdate();
            isUpdated = true;
        }catch (SQLException e){
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean deleteWhatsInfoById(int id) {

        boolean isDeleted = false;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_app","root","Xworkzodc@123");
            stmt  = con.prepareStatement("delete from whatsapp_info where whatsapp_id=?");
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return isDeleted = true;
    }


}