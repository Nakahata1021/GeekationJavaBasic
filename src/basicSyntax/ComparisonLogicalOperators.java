package basicSyntax;

public class ComparisonLogicalOperators {

    public static void main(String[] args) {
    	//課題1
        int a = 10;
        int b = 5;

        System.out.println(a > b);
        
        //課題2
        boolean isSunny = true;  
        boolean isWarm = true;

        boolean andResultA = isSunny && isWarm;
        
        System.out.println(andResultA);
        
        //課題3
        int x = 5;
        int y = 4;

        boolean andResultB = (x >= 0) && (y % 2 == 0);

        System.out.println(andResultB);
        
        //課題4
        boolean hasPermission = false;

        boolean notResult = !(hasPermission);
        
        System.out.println(notResult);
        
    }
}