import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialClustering {
    public static List<Cluster> cluster(int amountOfClusters, int[] data, IDistanceStrategy distanceStrategy){
        List<Cluster> clusters= new ArrayList<Cluster>();
        for(int i=0;i<data.length;i++){
            clusters.add(new Cluster(new Data(data[i])));
        }

        while((clusters.size()>amountOfClusters)&&(clusters.size()>1)){
            int smallestDist=Integer.MAX_VALUE;
            int [] clusterCombination=new int[2];
            for(int i=0; i<clusters.size()-1;i++)
            {
                for(int j=i+1; j<clusters.size();j++){
                    int distance=distanceStrategy.determineDistance(clusters.get(i), clusters.get(j));
                    if(distance<smallestDist){
                        smallestDist=distance;
                        clusterCombination[0]=i;
                        clusterCombination[1]=j;
                    }
                }
            }

            clusters.get(clusterCombination[0]).combineWith(clusters.get(clusterCombination[1]));
            if(clusters.get(clusterCombination[1]).isEmpty()){
                clusters.remove(clusterCombination[1]);
            }
        }




        return clusters;
    }

}
