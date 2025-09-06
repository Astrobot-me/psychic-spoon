public class Program {

    // bactracked 1 to n : do nt do n + 1
    void print_backtracked(int n) { 

        if(n < 1) return; 
        print_backtracked(n-1); 
        System.out.println(n); 


    }


    // backtracked n to 1 : dont do  n - 1  
    void print_backtrackedv2(int i , int n ) { 
        if (i > n) return; 
        print_backtrackedv2(i+1, n); 
        System.out.println(i); 

    }



    // n to 1 
    void print(int n) { 
        if(n < 1) return; 
        System.out.println(n); 
        print(n-1); 

    }
    
   

    public static void main(String[] args) {
        
         Program p = new Program() ; 
        //  p.print_reverse(7) ; 
         p.print_backtrackedv2(1,7); 
    }
} 