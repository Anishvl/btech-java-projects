import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      for(int i=0;i<=60;i++)
        {
        int a, b, c, ini;
         i=100;
        Scanner s = new Scanner(System.in);
        Main m = new Main();
        System.out.println("1. View Account balance\n2. Deposit Amount\n3. Withdrawal Amount\n4. Exit");
        a = s.nextInt();
        ini = m.initial(a);
      if(a==4)
      {
        //int i=1;
        m.ends(a);
        return;
      }
        if (ini == 1)
        {
          //
        }
        else {
            m.ends(ini);
            return; 
        }
        System.out.println("enter the account number");
        b = s.nextInt();
        if((1000<=b)||(b>=9999))
        {

        }
        else
        {
          m.ends(i);
          return;
        }
        System.out.println("enter the pin for account " + b);
        c = s.nextInt();
        m.pin(a, b, c);
        }
    }

    void ends(int inti) {
        switch (inti) {
            case 0:
                System.out.println("Invalid option\nThank you, visit again");
                break;
          case 4:
            System.out.println("Thank you, visit again");
            break;

          case 100:
            System.out.println("Please enter 4 digits");

        }
    }

    int initial(int a) {
        switch (a) {
            case 1:
            case 2:
            case 3:
          case 4:
                return 1;
            default:
               // System.out.println("The option is not available");
                //System.out.println("Thank you, visit again");
                return 0;
        }
    }

    void pin(int a, int b, int c) {
        Main m = new Main();
        switch (b) {
            case 6301:
                int temp1 = 1922;
                if (c == temp1) {
                    System.out.println("Welcome Anishvl" + "\n");
                    m.verify(a, b);
                    break;
                } else {
                    System.out.println("You had entered a wrong pin" + "\n");
                    break;
                }

            case 1581:
                int temp2 = 1111;
                if (c == temp2) {
                    System.out.println("Welcome Akash" + "\n");
                    m.verify(a, b);
                    break;
                } else {
                    System.out.println("You had entered a wrong pin" + "\n");
                    break;
                }

            default:
                System.out.println(b + " account not found" + "\n");
                System.out.println("Thank you, visit again");
        }
    }

    void verify(int a, int b) {
        Main m = new Main();

        switch (a) {
            case 1:
            int amount=0;
            int i=0;
                m.view_bal(b,amount,i);
                break;
            case 2:
                deposit(b);
                break;
            case 3:
                withdrawal(b);
                break;
            default:
                System.out.println("You had entered a wrong option" + "\n");
                System.out.println("Thank you, visit again");
        }
    }

    void view_bal(int b,int amount,int i) {
        int bal;
        switch (b) {
            case 6301:
            bal = 16000;
            if(i==101)
            {
              int newbal=bal+amount;
              bal=newbal;
            }
             else if(i==102)
              {
              int newbal=bal-amount;
              bal=newbal;
              }


                System.out.println("Balance for account " + b + ": " + bal + "\n");
                System.out.println("Thank you, visit again");
                break;
            case 1581:
                bal = 2575;
                  if(i==101)
                  {
                    int newbal=bal+amount;
                    bal=newbal;
                  }
               else if(i==102)
                 {
                 int newbal=bal-amount;
                 bal=newbal;
                 }
                System.out.println("Balance for account " + b + ": " + bal + "\n");
                System.out.println("Thank you, visit again");
                break;
            default:
                System.out.println("Account not found");
                System.out.println("Thank you, visit again");
        }
    }
void deposit(int b)
  {
    int amount;
    Main m=new Main();
    Scanner s=new Scanner(System.in);
    System.out.println("enter the amount to deposit");
    amount=s.nextInt();
    int i=101;
    m.view_bal(b, amount, i);
  }
void  withdrawal(int b)
  {
    int amount;
    System.out.println("enter the amount to withdrawal");
    Scanner s=new Scanner(System.in);
    amount=s.nextInt();
    Main m=new Main();
    int i=102;
    m.view_bal(b, amount, i);
  }
}
