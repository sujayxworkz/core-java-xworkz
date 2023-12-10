package Tester;

import Impl.WhatsAppImpl;
import Profile.WhatsAppDTO;

import java.util.List;
import java.util.Scanner;

public class WhatsAppTester {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            WhatsAppImpl whatsApp = new WhatsAppImpl();

            WhatsAppDTO whatsAppDTO = new WhatsAppDTO();

//        System.out.println("Enter whats app id");
//        whatsAppDTO.setWhatsAppId(sc.nextInt());
//        System.out.println("Enter profile name");
//        whatsAppDTO.setProfileName((sc.next()));
//        System.out.println("Enter phone number");
//        whatsAppDTO.setPhoneNumber(sc.nextLong());
//        System.out.println("Enter the address");
//        whatsAppDTO.setAddress(sc.next());
//
//        whatsApp.saveProfile(whatsAppDTO);

         List<WhatsAppDTO> list = whatsApp.getWhatsInfo();
        System.out.println(list);

       boolean phNumberUpdation =  whatsApp.updatePhoneNumberByWhatsupId(8105251200L,1);
        System.out.println(phNumberUpdation);

       boolean deletion = whatsApp.deleteWhatsInfoById(3);
        System.out.println(deletion);

    }

}
