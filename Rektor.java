package Jobsheet11;

public class Rektor {

    public void beriSertifikatCumlaude(Cumlaude mahasiswa) {
        System. out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda .. ");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System. out.println("------------------------");
    }

    public void beriSertifikatMawapres(Berprestasi mahasiswa){

    System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
    System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

    mahasiswa.menjuaraiKompetisi();
    mahasiswa.membuatPublikasiIlmiah();

    System.out.println("-----------------------------------");
    }
}
