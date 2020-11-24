
package converter_fabioalexandre;
import java.util.Scanner;
public class Converter_FabioAlexandre {

    public static void main(String[] args) {
       { Scanner entrada;
           double c, f;
        entrada = new Scanner (System.in);
        System.out.println("Digite a temperatura em Celsius");
        c = entrada.nextDouble();
        f = (c *1.8 + 32);
        System.out.println("A temperatura em  Fahrenheit é:\n" +f);
        int i=0;
        do
        {f=f+10;
        i++;
        if(i<=10){
        System.out.println("Temperatura subindo de 10 em 10 \n"+f);}
        } while (i<=10);
    }
    
    }}
