public class DiaDosPais extends CartaoDePresente{
    public DiaDosPais(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }


    @Override
    public String mostrarMensagem(){
        return ("FELIZ DIA DOS PAIS :D");
    }
}
