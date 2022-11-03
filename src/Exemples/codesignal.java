package Exemples;

public class codesignal {
    public static void main(String[] args) {
        int[] sequence = {1,3,2,4};
        System.out.println(solution(sequence));
    }
    public static boolean solution(int[] sequence) {
        boolean res = false;
        int[] aux;
        for(int i=0; i<sequence.length; i++){
            aux = eliminar(i, sequence);

            for (int a: aux) {
                System.out.print(a+", ");
            }
            System.out.println();

            for(int j=0; j<aux.length-2; j++){
                if(aux[j] < aux[j+1]){
                    res=true;
                }else{
                    res=false;
                }
            }
        }
        return res;
    }

    public static int[] eliminar(int pos, int[] sequence) {
        int[] aux2 = new int[sequence.length-1];
        for(int i=0, j=0; j<aux2.length; j++, i++){
            if(j == pos){
                System.out.println(aux2[i]+" = "+sequence[j]);
                aux2[i] = sequence[j];
            }else{
                i--;
            }
        }
        return aux2;
    }

}
