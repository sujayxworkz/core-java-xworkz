package teamplayers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Players {

    private String teamName;
    private String matchVenue;
    private double seatCapacity;

    public void getTheDetails(){
        System.out.println(teamName);
        System.out.println(matchVenue);
        System.out.println(seatCapacity);

    }
}
