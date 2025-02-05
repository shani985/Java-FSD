public class bubble{
    public static void main(String[] args) {
        
        int[]arr={55,77,26,48};
        print(arr);
        Bubblesort(arr);
        print(arr);

        
    }
    static void print(int[] arr)
    {
        for(int value:arr)
        {
            System.out.print(value+" ");

        }
        System.out.println();
    }


    

static void Bubblesort(int[] arr )
{
    int n=arr.length;
    int temp;
    boolean flag=false;
    for(int i=0;i<n-1;i++)
    {
        flag=false;
        for(int j=1;j<n-i;j++)
        {
            if(arr[j-1]>arr[i])
            {
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                flag=true;

            }
        }
        if(!flag)
        {
            break;

        }

    }

    }

 }