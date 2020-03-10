import java.util.ArrayList;
import java.util.List;

public class Cluster {
    private List<Data> data;
    private boolean empty;

    public Cluster(Data data){
        this.data=new ArrayList<Data>();
        this.data.add(data);
        this.empty=false;
    }

    public List<Data> getData() {
        return data;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public void combineWith(Cluster cluster){
        for (Data data:cluster.getData())
        {
            this.data.add(data);
        }
        cluster.setEmpty(true);
    }
}
