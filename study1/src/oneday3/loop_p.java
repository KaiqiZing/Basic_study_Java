package oneday3;

public class loop_p {
    public static void main(String[] args) {


        // continue break
        for (int i = 0; i <5 ; i++) {
            if (i==4){
                System.out.println("continue params1:"+i);
                continue;
            }
            System.out.println(i);
        }
        System.out.println("====");
        for (int i = 0; i <10 ; i++) {
            if (i ==2){
                System.out.println("break参数"+i);
                break;
            }
            System.out.println(i);

        }

//        int weekday = 6;
//        switch (weekday){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            case 6:
//                System.out.println("6");
//                break;
//        }











    }

}
