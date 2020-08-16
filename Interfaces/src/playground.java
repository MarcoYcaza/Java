public class playground {

    // First method declared and executed
    public static void main(String[] args) {
        myInterface myAnonymousClass = new myInterface() {
            @Override
            public void action1() {
                System.out.println("Im doing something 1");
            }

            @Override
            public void action2() {
                System.out.println("Im doing something 2");
            }

            @Override
            public void action3() {
                System.out.println("Im doing something 3");
            }
        };


        myAnonymousClass.action1();
        myAnonymousClass.action2();
        myAnonymousClass.action3();

        System.out.println(myAnonymousClass.myVariable1);

        myAnonymousClass.myVirus.action4(8,2);

    }


}
