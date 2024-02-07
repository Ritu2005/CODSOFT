import java.util.Random;
import java.util.Scanner;
class randomnumber
{
    int random(int max,int min)
    {
        Random random=new Random();
        int num=random.nextInt(max-min+1)+min;
        return(num);
    }
    int guess()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your guess between 1 and 100");
        int n=sc.nextInt();
        return(n);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maximum limit and minimum limit");
        int max=sc.nextInt();
        int min=sc.nextInt();
        randomnumber ob=new randomnumber();
        int win=0,max_attempts=5,max_rounds=3;
        for(int i=1;i<=max_rounds;i++)
          { 
              int attempts=0;
              int ran=ob.random(max,min);       
              System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, min, max,
                  max_attempts);
                  while(attempts<max_attempts)
                  {
                      int g=ob.guess();
                      attempts++;
                    if(g>ran)
                    {        
                        System.out.printf("The number is greater than %d. Attempts Left = %d.\n", g,max_attempts - attempts);
               
                            }
                            else if(g<ran)
                            {
                                System.out.printf("The number is lesser than %d. Attempts Left = %d.\n", g,max_attempts - attempts); 
           
                            }
                            else
                            {           
                                win++;
                                System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",attempts, win);
                                break;
          
                            }
                        }
                        if (attempts == max_attempts) 
                        {
                            System.out.printf("\nRound = %d\n", i);                
                            System.out.printf("The Random Number Is : %d\n\n", ran);
                        }
        }
            System.out.printf("Game Over. Total Score = %d\n",win);
            sc.close();
      
    }
}