package Tester;

import Impl.InstagramImpl;
import Profile.Instagram;
import Profile.InstagramDTO;

import java.util.List;
import java.util.Scanner;

public class InstaTester {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Instagram insta = new InstagramImpl();

        InstagramDTO dto = new InstagramDTO();

//        System.out.println("Enter insta Id");
//        dto.setProfileId(sc.nextInt());
//        System.out.println("Enter insta profile name");
//        dto.setProfileName(sc.next());
//        System.out.println("Enter phone number");
//        dto.setPhNumber(sc.nextLong());
//        System.out.println("Enter age");
//        dto.setAge(sc.nextInt());
//        System.out.println("Enter the password");
//        dto.setPassword(sc.next());
//
//        insta.createProfile(dto);

        List<InstagramDTO> user = insta.getUser();
        System.out.println(user.toString());

//        insta.getUserByPhNumber(7845123658l);

        boolean isUpdated = insta.updateProfileNameByProfileId("gill",249);
        System.out.println(isUpdated);

        boolean isDeleted = insta.deleteProfileByProfileId(248);
        System.out.println(isDeleted);


    }

}
