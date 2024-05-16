package Jobsheet11;

public class PascaSarjana extends Mahasiswa implements Cumlaude, Berprestasi{

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        kuliahDiKampus();
        System. out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}


