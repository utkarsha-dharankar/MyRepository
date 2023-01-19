package java_fullstack_first_project;




public class WhileLoopExample {

    public static void main(String[] args) {
        
        int i=1, limit=100;
        
        
        while(i<=100)
        {
            System.out.println(i);
            i=i+1;
        }
        
        System.out.println("==========================================");
        
        
        for(i=1;i<=limit;i++)
        {
            System.out.println(i);
        }
        
        System.out.println("==========================================");

        i=101;
        do
        {
            System.out.println(i);
            i=i+1;
            
        }
        while(i<=100);// 101<=100 F
    }

}