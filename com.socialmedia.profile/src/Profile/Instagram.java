package Profile;

import java.util.List;

public interface Instagram {

    public boolean createProfile(InstagramDTO dto);

    public List<InstagramDTO> getUser();

    public InstagramDTO getUserByPhNumber(Long PhoneNumber);

    public boolean updateProfileNameByProfileId(String updateName,int id);

    public boolean deleteProfileByProfileId(int profileId);




}
