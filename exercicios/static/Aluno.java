public class Aluno {
    private static double mediaMaior;
    private String nome;
    private double media;
    private double mediaFinal;

    

    public double getMediaFinal() {
        return mediaFinal;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    public Aluno(String nome, double media) {
        this.setNome(nome); 
        this.setMedia(media);
        if (media > Aluno.mediaMaior) {
            Aluno.mediaMaior = media;
          }
    //private static double mediaMaior(double media) {
    //    if (media > Aluno.mediaMaior) {
    //        return mediaMaior = media;
    //    }
    }
    public double calcularMediaFinal() {
          this.setMediaFinal((this.getMedia()/Aluno.mediaMaior)*10);
          return this.mediaFinal;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    @Override
    public String toString() {
        return "=========Aluno==========" +
        "\nNome: " + this.getNome() + 
        "\nMedia:" + this.getMedia() + 
        "\nMedia Final: " + this.getMediaFinal();
    }
    

    

}
