package Tester;

import Impl.FacebookImpl;
import Impl.InstagramImpl;
import Profile.Facebook;
import Profile.FacebookDTO;
import Profile.Instagram;

import java.util.List;
import java.util.Scanner;

public class FacebookTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Facebook facebook = new FacebookImpl();

        FacebookDTO dto = new FacebookDTO();

//        System.out.println("Enter fb id");
//        dto.setFacebbokId(sc.nextInt());
//        System.out.println("Enter fb user name");
//        dto.setUserName(sc.next());
//        System.out.println("Enter fb password");
//        dto.setUserPassword(sc.next());
//        System.out.println("Enter phone number");
//        dto.setPhoneNumber(sc.nextLong());
//        System.out.println("Enter the address");
//        dto.setAddress(sc.next());
//
//        facebook.createProfile(dto);

        List<FacebookDTO> user =  facebook.getProfile();
        System.out.println(user.toString());

        FacebookDTO userName = facebook.getUserNameByAddress("rajajinagar");
        System.out.println(userName);

        facebook.updateUserNameByAddress("vijay","belagavi");

        facebook.deleteUserId(249);

//       facebook.getFacebookIdEndsBySixByUserName("sujay");

    }



}
