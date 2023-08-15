package casting;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter

public class BoardDTO {

    private int boardId;
    private String boardName;
    private String size;
    private String place;
    private int noOfMembers;


    public String toString() {
        return "BoardDTO-( boardId= " + this.boardId + ",boardName=" + this.boardName + ",boaedSize=" + this.size + ",boardPlace=" + this.place + ",noOfMembers=" + this.noOfMembers + ")";
        // return "( boardId="+this.boardId+")";
    }
}





