import java.io.IOException;

public class Age {
    public static void main(String[] args) throws IOException {
        int vasyAge = 45;
        int katyaAge = 17;
        int mishaAge = 17;


        int min = -1;
        int middle = -1;
        int max = -1;

        if (katyaAge <= vasyAge && katyaAge <=mishaAge) {
            min = katyaAge;
            if (vasyAge>mishaAge) {
                max = vasyAge;
                middle = mishaAge;
            } else {
                max = mishaAge;
                middle = vasyAge;
            }
        }
        if (vasyAge <= katyaAge && vasyAge <= mishaAge){
            min = vasyAge;
            if (katyaAge>mishaAge) {
                max = katyaAge;
                middle = mishaAge;
            }else{
                middle = katyaAge;
                max = mishaAge;

            }
        }
        if (mishaAge <= katyaAge && mishaAge <= vasyAge){
            min = mishaAge;
            if (vasyAge>katyaAge) {
                max = vasyAge;
                middle = katyaAge;
            }else {
                max = katyaAge;
                middle = vasyAge;





            }
        }

            System.out.println("minimall age :" +min);
            System.out.println("Middle age :" +middle);
            System.out.println("Maximal age :" +max);
        }
    }



// if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
//                    min = katyaAge;
//                    if (vasyaAge > mishaAge){
//                        max = vasyaAge;
//                        middle = mishaAge;
//                    }
//                    else {
//                        max = mishaAge;
//                        middle = vasyaAge;
//                    }
//
//
//                }
//                if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
//                    min = vasyaAge;
//                    if (katyaAge > mishaAge){
//                        max = katyaAge;
//                        middle = mishaAge;
//                    }
//                    else {
//                        max = mishaAge;
//                        middle = katyaAge;
//
//                    }
//                }
//                if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
//                    min = mishaAge;
//                    if (katyaAge > vasyaAge){
//                        max = katyaAge;
//                        middle = vasyaAge;
//                    }
//                    else {
//                        max = mishaAge;
//                        middle = katyaAge;
//
//                    }
//                }
//
//                System.out.println("Младший возраст: " + min);
//                System.out.println("Средний возраст: " + middle);
//                System.out.println("Старший возраст: " + max);
//
//            }
//        }