class Lc1{
    static void pallindrome(int x){
        int r=0;
        int num=x;
        int rev=0;
        while(x>0){
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev==num) System.out.println("yes it is");
        else System.out.println("no");
    }
    public static void main(String[] args){
        pallindrome(121);
    }
}