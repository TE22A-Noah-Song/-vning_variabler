public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 10;
        int tal2 = 20;
        int summa = tal1+tal2;
        int differens = tal2-tal1;
        int produkt = tal1*tal2;
        int kvot = tal2/tal1;
        System.out.println("Summan av tal1 + tal 2 ="+summa);   
        System.out.println("Differensen av tal2 - tal 1 ="+differens);   
        System.out.println("Produkten av tal1 * tal 2 ="+produkt);   
        System.out.println("Kvoten av tal1 / tal 2 ="+kvot);   

        int rest1 = 15%2;
        int rest2 = 8%3;
        System.out.println("Resten av 15/2 är "+rest1);
        System.out.println("Resten av 8/3 är "+rest2);

        double dectal1=5.4;
        double dectal2=3.2;
        double decsumma=dectal1+dectal2;
        double decdifferens=dectal1-dectal2;
        System.out.println("Summan av dectal1+dectal2 ="+decsumma);
        System.out.println("Differensen av dectal1-dectal2="+decdifferens);
    }
}
