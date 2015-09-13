import java.util.Scanner;

/**
 * Created by Simeon on 9/13/2015.
 */
public class StuckNumbers {
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);

        Integer count = reader.nextInt();

        reader.nextLine();
        
        String[] numbers = new String[count];

        String[] input = reader.nextLine().split(" ");

        for(Integer i = 0; i < input.length;i++){
            numbers[i] = input[i];
        }

        Integer counter = 0;

        for(Integer a = 0; a < numbers.length;a++){
            for(Integer b = 0; b < numbers.length;b++){
                for(Integer c = 0; c < numbers.length;c++){
                    for(Integer d = 0; d < numbers.length;d++){

                        if(a != b && a != c && a != d && b != c && b != d && c != d){

                            String leftHand = numbers[a] + "" + numbers[b];
                            String rightHand = numbers[c] + "" + numbers[d];

                            if(leftHand.equals(rightHand)){
                                System.out.printf("%s|%s==%s|%s", numbers[a],numbers[b],numbers[c],numbers[d]).println();
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        
        if(counter == 0){
            System.out.println("No");
        }
    }
}
