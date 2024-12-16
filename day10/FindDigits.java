public static int findDigits(int n) {
    int count = 0;
while(n>0){
    int rem = n%10;
    if(rem!=0){
        if (n%rem == 0){
        count++; 
        }        
    }
    n = n/10;
}
return count;
}
