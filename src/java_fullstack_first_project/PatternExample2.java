package java_fullstack_first_project;




public class PatternExample2 {

    public static void main(String[] args) {
        
        
        int i,j, lines=5;
        
        for(i=1;i<=lines;i++)
        {
            for(j=1;j<=i;j++)  //i=1 , j=1 1<=1 j=2 2<=1
            {
                System.out.print(i);
              //  System.out.print(j);
             //   System.out.print('*');
            }
            
            System.out.println();
        }

    }

}