import java.util.concurrent.TimeUnit;

public class PesquisaBinaria {
    public static int comparacoes = 0;
    public static boolean 
    pesquisaBinariaRecursiva(int[] vet, int x){
        comparacoes = 0;
        long startTime = 
        System.nanoTime();
        boolean result = pesquisaBinariaRecursiva(vet, x, 0, vet.length - 1);
        long endTime = 
        System.nanoTime();
        long tempoExecucao =
        endTime - startTime;
        System.out.println("Comparacoes Binaria:" + comparacoes);
        System.out.println("Tempo de execucao Binaria" + tempoExecucao + "Nanosegundos");

        return result;
    }
    public static pesquisaBinariaRecursiva(int[], vet, int x, int esq, int dir){
        if (esq > dir) {
            return false;
        }
        int meio = (esq + dir) /2;
        comparacoes++;
        if (vet[meio] == x) {
            return true;
        }else if (x > vet[meio]) {
            return PesquisaBinariaRecursiva(vet, x, meio +1, dir);
        }else {
            return PesquisaBinariaRecursiva(vet, x, esq, meio -1);
        }
    }
}
