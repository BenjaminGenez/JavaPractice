package Practice;
    import java.util.Scanner;

    public class max
    {
        public static void main(String args[])
        {

            int arr[] = {5, 6, 7, 8, 9, 10};

            int max = arr[0];

            for (int i=0; i<arr.length; i++)
            {
                if(max < arr[i])
                {
                    max = arr[i];
                }

            }

            System.out.print(max);
        }
    }

