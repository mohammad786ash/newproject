public class DecisionMaking {
    public static void main(String[] args){
        //if-else
//
//      int a=10;
//      int b=20;
//
//      if(a>b){
//          System.out.println(a+" is larger");
//      }
//      else{
//          System.out.println(b+" is larger");
//      }

        //if-else-if
//
//        int a=10;
//        int b=10;
//
//        if(a>b){
//            System.out.println(a+" is larger");
//        }
//        else if(b>a){
//            System.out.println(b+" is larger");
//        }
//        else
//        {
//            System.out.println(a+ " and "+b+" are equal");
//        }

        //nested-if

//        int a=10;
//        int b=20;
//        int c=30;
//
//        if(a<b)
//        {
//            if(a<c)
//            {
//                System.out.println(a+" is smaller then both "+b+" and " +c);
//            }
//        }
//        else
//        {
//            System.out.println(a+" is not smaller than both "+b+" and "+c);
//        }

        //Switch Statement

        int a=4;
        switch (a)
        {
            case 1: System.out.println("one");
            break;
            case 2: System.out.println("two");
            break;
            case 3: System.out.println("three");
            break;
            case 4: System.out.println("four");
            case 5: System.out.println("five");
            default: System.out.println("enter a number smaller then 6");
        }
    }
}
