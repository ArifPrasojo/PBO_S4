package Jobsheet11;

public class Sarjana extends Mahasiswa implements Cumlaude, Berprestasi {
    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void lulus(){
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3.5");
    }

    @Override
    public void menjuaraiKompetisi(){
        kuliahDiKampus();
        System.out.println("Saya sudah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel dijurnal INTERNASIONAL");
    }

}
