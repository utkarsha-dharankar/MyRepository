package java_fullstack_first_project;


public class PatternExample1 {

    public static void main(String[] args) {
        
        
        int i,j, lines=5;
        
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)  //i=1 , j=1 1<=1 j=2 2<=1   //for(j=i;j>=1;j--)
            {
                System.out.print(i);
             
            }
            
            System.out.println();
        }

    }

}