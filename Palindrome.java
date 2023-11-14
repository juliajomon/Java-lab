class Palindrome{
    public static void main(String args[]){
        String str="malayalam";
        int n=str.length(),flag=0;
        for(int i=0; i<(n/2);i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                flag++;
            }
        }
        if(flag!=0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        }
}  
