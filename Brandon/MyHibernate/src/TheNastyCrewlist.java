import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "crewlist")
public class TheNastyCrewlist {

    @Id
    @GeneratedValue
    private int idCrewList;
    private double FullName;  //Declaring a different data type than the table
    private String Position;
    private String Rank;

    public TheNastyCrewlist() {
        //this.FullName = ""; //neglecting an initiating String
        this.Position = "";
        this.Rank = "";
    }

    @Override                 //Forgetting to override a toString() method
    public String toString() {
        return "crewlist{" +
                "idCrewList=" + idCrewList +
                ", FullName='" + FullName + '\'' +
                ", Position='" + Position + '\'' +
                ", Rank='" + Rank + '\'' +
                '}';
    }

    public int getIdCrewList() {return idCrewList;}
    public void setIdCrewList() { this.FullName = FullName; }  //ignoring an auto-incrementing primary key

    public String getFullName() {return FullName;}
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
//Forgetting a table column get/set method
    //public String getPosition() {
    //    return Position;
    //}
    //public void setPosition(String Position) {
    //    this.Position = Position;
    //}

    public String getRank() {return Rank;}
    public void setRank(String Rank) { this.Rank = Rank; }
}