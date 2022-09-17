public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));   // birleştirme
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));   // a'nın kaçıncı eleman oldugunu verir. aramaya baştan başlar.
        System.out.println(mesaj.lastIndexOf('a'));  // aramaya sondan başlar ama index numarası olarak baştan sayıyormuş gibi verir */

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);  // ilgili metindeki karakterleri değiştirme ve ilgili metni değiştimez.
        System.out.println(mesaj.substring(2,5));// metnin içinden parça alır. 2 den başla 4 e kadar.

        // cümleyi parçalar. genelde boşluk baz alarak parçalarnır.
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());   // harfleri küçük harfe çevirir ve arama ifadelerinde kullanılır.(uygulama büyük küçük harf duarlı olduğu için)
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());    // başta ve sondaki boşlukları alır.
    }
}