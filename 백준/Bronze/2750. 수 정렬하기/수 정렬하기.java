import java.util.Arrays;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] list = new int[N];

    for(int i=0; i<N; i++){
        list[i] = sc.nextInt();
    }
    for(int j=0; j<N; j++){
        Arrays.sort(list);
        System.out.println(list[j]);
    }
    sc.close();
    }
}