import java.util.Scanner;
public class Solution
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int lower_bound = sc.nextInt();sc.nextLine();
      int upper_bound = sc.nextInt();sc.nextLine();
      int sum = 0;

      for(int i= lower_bound; i <= upper_bound; i++)
        {
          if(i%2 == 0 && i%3 == 0)
          {
            sum += i;
          }
        }
      System.out.println(sum);
    }
  }
