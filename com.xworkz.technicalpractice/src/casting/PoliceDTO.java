package casting;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PoliceDTO {

    private int policeId;
    private String name;
    private String type;
    private String dressCode;

    public String toString(){
        return  "Police-( policeid= " + this.policeId + ",name=" + this.name + ",type=" + this.type  + ",dresscode="+this.dressCode+")";

    }
}
