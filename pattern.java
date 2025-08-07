import java.util.*;

public class pattern
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("------STAR PATTERN------");
        System.out.println("1. NUMBER TRIANGLE");
        System.out.println("2. DIAMOND NUMBER PATTERN");
        System.out.println("3. ZERO ONE TRIANGLE");
        System.out.println("4. PALINDROME TRIANGLE");
        System.out.println("5. HOLLOW TRIANGLE PATTERN");
        System.out.println("6. HOLLOW HOUR GLASS PATTERN");
        System.out.println("7. HOLLOW DIAMOND PYRAMID");
        System.out.println("8. REVERSE NUMBER TRIANGLE PATTERN");
        System.out.println("9. REVERSE TRIANGLE PATTERN");
        System.out.println("10. TRIANGLE PATTERN");
        System.out.print("Choose your Star Pattern: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i==1){
            do{
                System.out.print("1. NUMBER TRIANGLE\n\n");
                pattern1();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==2){
            do{
                System.out.print("2. DIAMOND NUMBER PATTERN\n\n");
                pattern2();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==3){
            do{
                System.out.print("3. ZERO ONE TRIANGLE\n\n");
                pattern3();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==4){
            do{
                System.out.print("4. PALINDROME TRIANGLE\n\n");
                pattern4();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==5){
            do{
                System.out.print("5. HOLLOW TRIANGLE PATTERN\n\n");
                pattern5();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==6){
            do{
                System.out.print("6. HOLLOW HOUR GLASS PATTERN\n\n");
                pattern6();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==7){
            do{
                System.out.print("7. HOLLOW DIAMOND PYRAMID\n\n");
                pattern7();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==8){
            do{
                System.out.print("8. REVERSE NUMBER TRIANGLE PATTERN\n\n");
                pattern8();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==9){
            do{
                System.out.print("9. REVERSE TRIANGLE PATTERN\n\n");
                pattern9();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
        else if(i==10){
            do{
                System.out.print("10. TRIANGLE PATTERN\n\n");
                pattern10();
                System.out.print("Do you want to continue? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();
            }while(choice.equals("yes"));
        }
    }
    public static void pattern1(){
        int i, j, r=4,s=0;
        for(i=1; i<=r; i++){
            for (j=1; j<r+i; j++){
                System.out.print(j<=r-i?" ":j>r?--s:++s);
            }
            s=0;
            System.out.println();
        }
    }
    public static void pattern2(){
        int i, j, s=0, r=7,m=r/2+1;
        for(i=1; i<=r; i++){
            for (j=1; i<=m?j<m+i:j<=(r-i)+m; j++){
                if(i<m+1)
                    System.out.print(j<=m-i?" ":j>m?(--s):(++s));
                else
                    System.out.print(j<=i-m?" ":j>m?(--s):(++s));
            }
            s=0;
            System.out.println();
        }
    }
    public static void pattern3(){
        int i, j, r=4;
        for (i=1; i<=r; i++){
            for(j=1; j<=i; j++){
                System.out.print((i+j)%2==0?"1":"0");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        int i, j, s=0, r=4;
        for(i=1; i<=r; i++){
            s=i+1;
            for (j=1; j<r+i; j++){
                System.out.print(j<=r-i?" ":j<=r?--s:++s);
            }
            System.out.println();
        }
    }
    public static void pattern5(){
        int i, j, r=5;
        for (i=1; i<=r; i++){
            for (j=1; j<(r+i); j++){
                if(j==((r-i)+1) || j==((r+i)-1) || i==r)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern6(){
        int i, j, r=7, c=7;
        for (i=1; i<=r; i++){
            for (j=1; j<=c; j++){
                if(i==1 || i==r || j==i || j==(r-i)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern7(){
        int i, j, r=7, m=(r/2)+1;
        for (i=1; i<=r; i++){
            for (j=1; i<=m?j<(m+i):j<=(r-i)+m; j++){
                if(i<m+1)
                    System.out.print(j==((m-i)+1) || j==((m+i)-1)?"* ":"  ");
                else
                    System.out.print(j==(i-m+1) || j==(r-i+m)?"* ":"  ");
            }
            System.out.println();
        }
    }
    public static void pattern8(){
        int i, j, r=4, c=7, s=0;
        for (i=1; i<=r; i++){
            s=i-1;
            for(j=1; j<=c-i+1; j++){
                System.out.print((i+j)%2==0 && j>=i?++s:" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(){
        int i, j, r=4, c=7;
        for (i=1; i<=r; i++){
            for (j=1; j<=c+1-i; j++){
                System.out.print(j>=i?"* ":"  ");
            }
            System.out.println();
        }
    }
    public static void pattern10(){
        int i, j, r=4;
        for (i=1; i<=r; i++){
            for (j=1; j<r+i; j++){
                System.out.print(j<=r-i?"  ":"* ");
            }
            System.out.println();
        }
    }
}