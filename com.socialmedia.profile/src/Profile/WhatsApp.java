package Profile;

import java.util.List;

public interface WhatsApp {

    public void saveProfile(WhatsAppDTO dto);

    public List<WhatsAppDTO> getWhatsInfo();

    public boolean updatePhoneNumberByWhatsupId(Long updatedPhNumber,int id);

    public  boolean deleteWhatsInfoById(int id);

}
