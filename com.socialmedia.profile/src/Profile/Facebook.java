package Profile;

import java.util.List;

public interface Facebook {

    public boolean createProfile(FacebookDTO dto);

    public List<FacebookDTO> getProfile();

    public FacebookDTO getUserNameByAddress(String address);

    public boolean updateUserNameByAddress(String updatedName,String address);

    public boolean deleteUserId(int id);

    public FacebookDTO getFacebookIdEndsBySixByUserName(String userName);



}
