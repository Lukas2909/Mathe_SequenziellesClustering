import java.util.List;

public class Application {

    public static void main(String[] args){
        // Eingabe Datensatz

        // Eingabe viele Viele Cluster erwünscht

        int [] x = {1,8,15,123,187,200,10,9,4,2,5};
        List<Cluster> list= SequentialClustering.cluster(3,x,new CompleteLinkage());
        for (Cluster c:list
             ) {
            System.out.print("{  ");
            for (Data d:c.getData()
                 ) {
                System.out.print(d.getValue()+"  ");
            }
            System.out.print("}");
            System.out.println();

        }
    }
}
