public class trutron {
    public static void main(String[] args) {
        hinhtron ht01 = new hinhtron();
        hinhtron ht02 = new hinhtron();
        hinhtron ht03 = new hinhtron();
        System.out.print("thong so hinh tron thu nhat : " );
        ht01.nhapbankinh();
        ht01.tinhchuvi();
        ht01.tinhdientich();
        ht01.inchuvi();
        ht01.indientich();
        System.out.print("thong so hinh tron thu ba : " );
        ht03.nhapbankinh();
        ht03.tinhchuvi();
        ht03.tinhdientich();
        ht03.inchuvi();
        ht03.indientich();
    }
}