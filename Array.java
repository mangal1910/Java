package mangal.array;
import java.util.Scanner;
public class Array
{
    private int n=0;
    private  int a[]=new int[200];
    private  int e[],o[],p[];
    Scanner sc=new Scanner(System.in);
    private void input()
    {
        int e;
        System.out.println("Enter Data into Arary:");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the value of a["+i+"]:\t");
            e=sc.nextInt();
            a[i]=e;
        }
    }
    public void create(int num)
    {
        n=num;
        input();
    }
    
    public void display()
    {
        System.out.print("[ ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("]\n");
    }

    public void evenArray()
    {
        e=new int[n];
        int k=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                e[k]=a[i];
                k++;
            }
        }
        System.out.print("[  ");
        for(int i=0; i<k; i++)
        {
            System.out.print(e[i]+"  ");
        }
        System.out.print("]\n");
    }

    public void oddArray()
    {
        o=new int[n];
        int k=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2!=0)
            {
                o[k]=a[i];
                k++;
            }
        }
         System.out.print("[  ");
        for(int i=0; i<k; i++)
        {
            System.out.print(o[i]+"  ");
        }
        System.out.print("]\n");
    }

    public int sumOfEvenNumber()
    {
        int sum=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                sum=sum+a[i];
            }
        }
        return sum;
    }
    public int sumOfOddNumber()
    {
        int sum=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2!=0)
            {
                sum=sum+a[i];
            }
        }
        return sum;
    }
    public int sumOfArray()
    {
        int sum=0; 
        for(int i=0; i<n; i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }

    public void removeDuplicateValue()
    {
        boolean ch=false;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i]==a[j])
                {
                    if(j==n-1)
                    {
                        n--;
                    }
                    else
                    {
                        for(int k=j; k<n-1; k++)
                        {
                            a[k]=a[k+1];
                        }
                        n--;
                        ch=true;
                    }
                }
            }
             if(ch==true)
             {
                i--; 
                ch=false;
             }
        }
        display();
    }

    public void sort()
    {
        int t=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        display();
    }

    public void sortreverse()
    {
        int t=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1; j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        display();
    }
    public int searchbyindex(int i)
    {
        if(i>(n-1) || i<0)
        {
            return 0;
        }
        else
        {
            return a[i];
        }
    }

    public int searchbyelement(int e)
    {
        int res=0;
        boolean ch=false;
        for(int i=0; i<n; i++)
        {
            if(a[i]==e)
            {
                res =  i;
                ch=true;
                break;
            }
        }
        if(ch==true)
            return res;
        else 
            return -1;
    }

    public void searchbyelements(int e)
    {
        int res=0;
        boolean ch=false;
        System.out.print("Index of "+e+" is ");
        for(int i=0; i<n; i++)
        {
            if(a[i]==e)
            {
                System.out.print(i+" ");
                ch=true;
            }
        }
        if(ch==false)
            System.out.print(" not found!");
        System.out.println();
    }

    public void insertelement(int e,int pos)
    {
        if(pos==n)
        {
             a[pos]=e;
             n++;
             display();
        }
        else if(pos<0)
        {
            System.out.println("Invailid index given:");
        }
        else
        {
            for(int i=n-1; i>=pos; i--)
            {
                a[i+1]=a[i];
            }
            a[pos]=e;
            n++;
            display();
        }
    }

    public void deletelementbyposition(int pos)
    {
        if(pos==n || pos<0)
        {
            System.out.println("Invailid index given:");
        }
        else 
        {
            for(int i=pos; i<n; i++)
            {
                a[i]=a[i+1];
            }
            n--;
            display();
        }
    }

    public void deletelement(int e)
    {
        for(int i=0; i<n; i++)
        {
            if(a[i]==e)
            {
                for(int j=i; j<n; j++)
                {
                    a[j]=a[j+1];
                }
                n--;
            }
        }
        display();
    }
    private boolean primeNumber(int num)
    {
        int p=0; 
        if(num==1 || num==0 || num<0)
        {
            return false;
        }
        else
        {
            for(int i=2; i<=num/2; i++)
            {
                if(num%i==0)
                {
                    p++;
                }
            }
            if(p==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public void primeArray()
    {
        p=new int[n];
        int k=0;
        boolean c=false;
        for(int i=0; i<n; i++)
        {
           c=primeNumber(a[i]);
           if(c==true)
           {
                p[k]=a[i];
                k++;
           }
           c=false;
        }
        System.out.print("[  ");
        for(int i=0; i<k; i++)
        {
            System.out.print(p[i]+"  ");
        }
        System.out.print("]\n");
    }
}