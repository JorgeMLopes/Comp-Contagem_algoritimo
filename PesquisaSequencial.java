import java.util.concurrent.TimeUnit;


public class PesquisaSequencial {
    public static int 
        comparacoes = 0;

    public static boolean
    pesquisaSequencial(int[] vet, int x){
        boolean resp = false;
        comparacoes = 0;

        int n = vet.length;
        long startTime = 
        System.nanoTime();
    
    for (int i = 0; i<n; i++){
        comparacoes++;
        if (vet[i] == x) {
            resp = true;
            break;
        }
    }
    long endTime = 
    System.nanoTime();
    long tempoExecucao =
    endTime - startTime;
    System.out.println("Comparacoes Sequencial:" + comparacoes);
    System.out.println("Tempo de execucao Sequencial: " + tempoExecucao);
    return resp;
    }
    
}
