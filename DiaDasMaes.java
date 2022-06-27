public class DiaDasMaes extends CartaoDePresente {

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mostrarMensagem(){
        System.out.println("FELIZ DIA DAS MÃES!");
        return "";
    }

}
