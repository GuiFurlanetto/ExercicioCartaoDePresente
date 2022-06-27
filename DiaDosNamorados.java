public class DiaDosNamorados extends CartaoDePresente{
    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mostrarMensagem(){
        System.out.println("FELIZ DIA DOS NAMORADOS s2");
        return "";
    }

}
