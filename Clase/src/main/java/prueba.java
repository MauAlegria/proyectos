public class prueba {
    private  String name ="mauricio";

    {
        System.out.println("1");
    }
    public prueba(){
        name= "mau2";
        System.out.println("2");

    }

    public static void main(String[] args) {
        prueba prueba= new prueba();
        System.out.println(prueba.name);
    }
}
