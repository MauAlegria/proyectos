public class Huevo {

    //CONSTRUCTOR
    // Se ejecutan despues de los bloques de inicializacion
    public Huevo(){
         numero = 5;

    }

    //MAIN
    public static void main(String[] args) {
        Huevo huevo = new Huevo();
        System.out.println(huevo.numero);
    }
    //Bloques de inicializacion se ejecutan primero
    private int numero = 3;
    {
        numero =4;
    }

}
