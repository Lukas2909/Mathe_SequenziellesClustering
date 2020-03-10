import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SingleLinkage implements IDistanceStrategy{

    public int determineDistance(Cluster c1, Cluster c2){
        Collections.sort(c1.getData());
        Collections.sort(c2.getData());

        int distance= c1.getData().get(0).getValue() - c2.getData().get(c2.getData().size()-1).getValue();
        if(distance<0){
            distance=c2.getData().get(0).getValue() - c1.getData().get(c1.getData().size()-1).getValue();
        }
        return distance;
    }
}
