package wtfjava;

import java.util.Scanner;

class wtf {
int x;
void setX(int X){
this.x = X;
}
}
public class wtfjava {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
wtf w = new wtf();
System.out.println("Hello");
double y = s.nextDouble();
w.setX(y);
System.out.println(w.x);
}
}
