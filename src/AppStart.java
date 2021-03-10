public class AppStart {

    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        System.out.println("Name         : " + size.getDescription());
        System.out.println("toString()   : " + size);
        System.out.println("Ordem:       : 1" );
        System.out.println("Valor minimo : " + size.getMinValue());
        System.out.println("Valor maximo : " + size.getMaxValue());
        System.out.println("Codigo       : " + size.getCode());
        System.out.println("Versao modificada2");
    }
}
