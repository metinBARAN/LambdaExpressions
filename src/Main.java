public class Main {

    public static void main(String[] args) {

        Matematik toplam=(a,b) ->a+b;
        Matematik cikarma=(a,b) ->a-b;
        Matematik carpma=(a,b) ->a*b;
        Matematik bolme=(a,b) ->{
            if(b==0){
                b=1;
            }
           return a/b;
        };

        System.out.println(toplam.transaction(20,5));
        System.out.println(cikarma.transaction(20,5));
        System.out.println(carpma.transaction(20,5));
        System.out.println(bolme.transaction(20,5));




    }
}
