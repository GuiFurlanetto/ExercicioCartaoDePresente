public class Main {

    public static void main (String[] args){

        DiaDasMaes cartaoDiaDasMaes = new DiaDasMaes("Guilherme","Geralda");
        System.out.println("De: " + cartaoDiaDasMaes.nomeRemetente);
        System.out.println("Para: " + cartaoDiaDasMaes.nomeDestinatario);
        System.out.println(cartaoDiaDasMaes.mostrarMensagem());

        DiaDosNamorados cartaoDiaDosNamorados = new DiaDosNamorados("Guilherme","Bárbara");
        System.out.println("De: " + cartaoDiaDosNamorados.nomeRemetente);
        System.out.println("Para: " + cartaoDiaDosNamorados.nomeDestinatario);
        System.out.println(cartaoDiaDosNamorados.mostrarMensagem());

        DiaDosPais cartaoDiaDosPais = new DiaDosPais("Guilherme","Ilton");
        System.out.println("De: " + cartaoDiaDosPais.nomeRemetente);
        System.out.println("Para: " + cartaoDiaDosPais.nomeDestinatario);
        System.out.println(cartaoDiaDosPais.mostrarMensagem());

        DiaDasCriancas cartaoDiaDasCriancas = new DiaDasCriancas("Guilherme","crianca");
        System.out.println("De: " + cartaoDiaDasCriancas.nomeRemetente);
        System.out.println("Para: " + cartaoDiaDasCriancas.nomeDestinatario);
        System.out.println(cartaoDiaDasCriancas.mostrarMensagem());


    }

}
