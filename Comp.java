import java.util.concurrent.TimeUnit;

public class Comp {
    public static void main(String[] args){
        int[] vet = new int[7500000];
        for(int i =0; i < vet.length; i++){
            vet[i] = i;
        }
        PesquisaSequencial.pesquisaSequencial(vet, 37500000);
        PesquisaBinaria.pesquisaBinariaRecursiva(vet, 37500000);
        PesquisaSequencial.pesquisaSequencial(vet[0]);
        PesquisaBinaria.pesquisaBinariaRecursiva(vet[0]); 
        PesquisaSequencial.pesquisaSequencial(vet, -1);
        PesquisaBinaria.pesquisaBinariaRecursiva(vet, -1);
    }
}
