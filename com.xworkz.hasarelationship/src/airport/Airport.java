package airport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Airport {


    // Has A Relationship
   private Terminal terminal;
   private int airportId;

}
