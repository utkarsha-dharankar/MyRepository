package java_fullstack_first_project;


public class JumpStatements {

    public static void main(String[] args) {
        
        int i=1,limit=100;
        
        
        for(;i<=limit;i++)
        {
            if(i==50)
            {
                break;//continue;
            }
            System.out.println(i);
        }
    }

}
