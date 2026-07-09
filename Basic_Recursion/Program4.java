import java.util.Scanner;
// Print N to 1 using Recursion using Backtrack
public class Program4 {
    public void backtracking(int i,int n){
        if(i>n){
            return;
    }
    backtracking(i+1,n);
    System.out.println(i+"");
}
public static void main(String[] args) {
    Program4 a=new Program4();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number :");
    int n=sc.nextInt();
    //sc.nextLine();
    a.backtracking(1,n);
}
}