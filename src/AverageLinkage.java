import java.util.Collections;

public class AverageLinkage implements IDistanceStrategy {
    public int determineDistance(Cluster c1, Cluster c2){
        Collections.sort(c1.getData());
        Collections.sort(c2.getData());

        int distanceSum=0;
        int count=0;
        for(int i=0;i<c1.getData().size();i++){
            for(int j=0;j<c2.getData().size();j++){
                int distance= c1.getData().get(i).getValue() - c2.getData().get(j).getValue();
                if(distance<0){
                    distance=c2.getData().get(j).getValue() - c1.getData().get(i).getValue();
                }
                distanceSum+=distance;
                count++;
            }
        }
        return distanceSum/count;
    }
}
