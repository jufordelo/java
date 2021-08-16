/
package dados34;
import java.util.Scanner;
public class Dados34 {
public static void main(String[] args) {
final int QUANT = 10;
int [] v = new int[QUANT];
int [] c = new int[QUANT];
int [] e = new int[QUANT];
int j, k, u = -1, temp;
int chave, endereco;
Scanner entrada = new Scanner(System.in);
String s;
char tecla;
do {
u++;
System.out.print("Número: ");
s = entrada.nextLine();
temp = Integer.parseInt(s);
if (temp != 0) {
v[u] = temp;
}
else {
u--;
}
} while (temp != 0 && u < QUANT);
for (int i = 0;i <= u;i++) {
c[i] = v[i];
e[i] = i;
}
for (int i = 1;i <= u;i++) {
k = 0;
j = i - 1;
chave = c[i];
endereco = e[i];
while (j >= 0 && k == 0) {
if (chave < c[j]) {
c[j+1] = c[j];
e[j+1] = e[j];
j--;
}
else {
k = j + 1;
}
}
c[k] = chave;
e[k] = endereco;
}
System.out.printf(" Valores: ");
for (int i = 0;i <= u;i++) {
System.out.printf("%2d ", c[i]);
}
System.out.println();
System.out.print("Endereços: ");
for (int i = 0;i <= u;i++) {
System.out.printf("%2d ", e[i]);
}
System.out.println();
System.exit(0);
}
}