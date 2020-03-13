import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        // Eingabe Datensatz
        System.out.println("Bitte geben Sie ihre Daten mit , getrennt ein! Also im Format: 1,2,3,4,5 usw.");
        Scanner scanner = new Scanner(System.in);
        String [] input =scanner.next().split(",");
        int [] x = new int[input.length];
        for(int i=0;i<input.length;i++){
            x[i]=Integer.parseInt(input[i]);
        }

        // Eingabe viele Viele Cluster erwünscht
        System.out.println("Bitte geben Sie nun an, wie in wie viele Cluster Sie aufteilen möchten!");
        int n = scanner.nextInt();

        System.out.println("\nMinimalabstand:");
        List<Cluster> list= SequentialClustering.cluster(n,x,new SingleLinkage());
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

        System.out.println("\nMaximalabstand:");
        list= SequentialClustering.cluster(n,x,new CompleteLinkage());
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

        System.out.println("\nDurchschnittsabstand:");
        list= SequentialClustering.cluster(n,x,new AverageLinkage());
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
