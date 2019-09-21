import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Calc obj=new Calc();
         System.out.println("hello");
         obj.Calc(sc);
    }
}

class Calc
{
    Scanner sc;
    int n1,n2,add,sub,mult;
    float div,mod;
    String input;

    public void Calc(Scanner s1)
    {
        s1=sc;
        this.set();
    }

    public void set()
    {
        System.out.println("Kindly enter the nos ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        this.menu();
    }
    public void menu()
    {
        System.out.println("Kindly enter the operation to be performed 1:add,2:sub,3:mult,4:div,5:mod,6:exit");
        input=sc.nextLine();
        this.logic();
    }

    public void logic()
    {
        switch(input)
        {
            case "1":this.add();
                        break;
            case "2":this.sub();
                break;
            case "3":this.mult();
                break;
            case "4":this.div();
                break;
            case "5":this.mod();
                break;
            case "6": break;
            default:
                System.out.println("Kindly enter a valid operation");
        }
    }

    public void add()
    {
        add=n1+n2;
        this.dispadd();
    }
    public void sub()
    {
        sub=n1-n2;
        this.dispsub();
    }
    public void div()
    {
        div=n1/n2;
        this.dispdiv();
    }
    public void mult()
    {
        mult=n1*n2;
        this.dispmult();
    }
    public void mod()
    {
        mod=n1%n2;
        this.dispmod();
    }
    public void dispadd()
    {
        System.out.println("addition is = "+add);
        this.menu();
    }
    public void dispsub()
    {
        System.out.println("subtraction is = "+sub);
        this.menu();
    }
    public void dispdiv()
    {
        System.out.println("div is = "+div);
        this.menu();
    }
    public void dispmult()
    {
        System.out.println("mult is = "+mult);
        this.menu();
    }
    public void dispmod()
    {
        System.out.println("mod is = "+mod);
        this.menu();
    }
}