public class playground {
    //La declaración del método main , el primero que se ejecuta
    public static void main(String[] args) {
        myInterface myAnonimousclass = new myInterface() {
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


        myAnonimousclass.action1();

        myAnonimousclass.action2();

        myAnonimousclass.action3();

        System.out.println(myAnonimousclass.myVariable1);

    }


}
