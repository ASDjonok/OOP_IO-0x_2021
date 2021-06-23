package lab6;

public class Main {
    public static void main(String[] args) {
        Sweets toffelini = new Toffelini(4,40);
        Sweets konafetto = new Konafetto(3,10);
        Sweets toffelini1 = new Toffelini(2,45);
        Sweets konafetto1 = new Konafetto(1,11);

        SweetsBox pack1 = new SweetsBox(new Sweets[]{toffelini,konafetto,konafetto1,toffelini1});
        Client taras = new Client(pack1);
        taras.startProgram();

//        System.out.println(pack1);
//        pack1.sortSweetsInBoxByPrice();
//        System.out.println(pack1);
//        pack1.findSweetsTypeByChocolate();
//
//
//        Sweets bimbom = new BimBom(3,40);
//        Sweets bimbom3 = new BimBom(3,62);
//        System.out.println(bimbom3);
//        Sweets bimbom2 = new BimBom(6,11);
//        Sweets candunut = new CandyNut(3,64);
//        SweetsBox pack2 = new SweetsBox(new Sweets[]{toffelini,bimbom,bimbom2,candunut});
//        System.out.println(pack2);
    }
}
