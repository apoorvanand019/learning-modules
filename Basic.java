import java.util.*;

public class Basic{
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
    public static void binomial(int n, int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int cr= a / (b * c);
        System.out.println(cr);

    }
    public static boolean Even(int n){
        boolean result=false;
        if(n%2==0){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }

    public static void Eveninrange(int  n){
        for(int i=2;i<n;i++){
            if(Even(i)==true){
                System.out.println(i);
            }
        }
    }
    public static boolean prime(int n){
        

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
          if(prime(i)==true){
            System.out.println(i);
          }
        }
    }
    public static void dec(int n){
        int decimal=0;
        int pow=0;
        int m=n;
        while(n>0){
            int  lastdigit=n%10;
            decimal=decimal + lastdigit * (int) Math.pow(2,pow);
            pow ++;
            n=n/10;

        }
        System.out.println(decimal + " is the decimal for binary " + m);
    }
    public static void binary(int n){
        int pow=0;
        int binary=0;
        while(n>0){
            int rem=n%2;
            binary=binary + rem * (int) Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println(binary);
    }
    public static void palindrome(int n){
        int m=n;
        int result=0;
        while(n>0){
            int lastdigit=n%10;
            result= result * 10 + lastdigit;
            n=n/10;
        }
        if(m==result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void sumofdigit(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void largestarray(int arr[]){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        System.out.println("Largest Element  in the array is " + min);
    }
    public static void linearsearch(int arr[],int k){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Element" + k + " is found at index " + i);
                found=true;
                break;
            }
            
        }
        if(!found){
            System.out.println("Element" + k + " is not found");

        }
    }
    public static int binarysearch(int arr[],int k){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            int mid= (start + end) / 2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }public static void reversearray(int  arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        printarray(arr);
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int r=sc.nextInt();
       // int result=fact(n);
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        //System.out.println("Factorial of " + n + " is : " + result); 
       // binomial(n, r);
       //Even(n);
       /*
       if(prime(n)==true){
        System.out.println(n + " is prime");
       }
       else{
        System.out.println(n + " is not Prime");
       }
*/
       //primeinrange(n);
       //dec(n);
       //binary(r);
       //palindrome(n);
      // sumofdigit(n);
      //largestarray(arr);
      //linearsearch(arr, 8);
     /* int result=binarysearch(arr, 16);
      if(result !=-1){
        System.out.println("Element is found at the index number " + result);
      }
      else{
        System.out.println("Element not found in the array");
      }*/
     reversearray(arr);
    }
}