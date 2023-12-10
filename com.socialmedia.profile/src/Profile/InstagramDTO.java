package Profile;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class InstagramDTO {

    private int profileId;
    private String profileName;
    private long phNumber;
    private int age;
    private String password;
}
