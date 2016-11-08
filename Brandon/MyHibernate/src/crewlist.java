import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "crewlist")
public class crewlist {

    @Id
    @GeneratedValue
    private int idCrewList;
    private String FullName;
    private String Position;
    private String Rank;

    public crewlist() {
        this.FullName = "";
        this.Position = "";
        this.Rank = "";
    }

    @Override
    public String toString() {
        return "crewlist{" +
                "idCrewList=" + idCrewList +
                ", FullName='" + FullName + '\'' +
                ", Position='" + Position + '\'' +
                ", Rank='" + Rank + '\'' +
                '}';
    }

    public int getIdCrewList() {return idCrewList;}
    //public void setIdCrewList() { this.FullName = FullName; }

    public String getFullName() {return FullName;}
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getPosition() {
        return Position;
    }
    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getRank() {return Rank;}
    public void setRank(String Rank) { this.Rank = Rank; }
}