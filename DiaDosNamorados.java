public class DiaDosNamorados extends CartaoDePresente{
    public DiaDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mostrarMensagem(){
        return ("FELIZ DIA DOS NAMORADOS s2");
    }

}
