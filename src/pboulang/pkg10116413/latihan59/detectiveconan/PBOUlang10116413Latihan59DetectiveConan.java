/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan59.detectiveconan;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : Membuat Program Mengenai Tokoh-Tokoh Serial Detective Conan
 */
public class PBOUlang10116413Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TokohUtama conan = new TokohUtama("Conan Edogawa/Shinichi Kudo",
                "Detektif", "Memecahkan/Menyelesaikan Kasus ",
                "Detektif Cilik");
        conan.tampilTokohUtama();

        TokohUtama ran = new TokohUtama("Ran Mouri", "Ahli Beladiri Karate",
                "Ingin Menjadi Ahli Karate di Seluruh Jepang",
                "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilTokohUtama();

        TokohUtama kogoro = new TokohUtama("Kogoro Mouri", "Detektif Swasta",
                "Memecahkan/Menyelesaikan Kasus", "Detektif Swasta");
        kogoro.tampilTokohUtama();

        TokohPendukung eri = new TokohPendukung("Eri Kisaki", "Pengacara",
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilTokohPendukung();

        TokohPendukung sonoko = new TokohPendukung("Sonoko Suzuki",
                "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilTokohPendukung();

        TokohPendukung heiji = new TokohPendukung("Heiji Hattori",
                "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilTokohPendukung();

        TokohPendukung kazuha = new TokohPendukung("Kazuha Tayoma",
                "Ahli Aikido", "Temannya Ran Mouri dan Suka pada "
                + "Heiji Hattori");
        kazuha.tampilTokohPendukung();

        TokohPendukung agasa = new TokohPendukung("Hiroshi Agasa", "Profesor",
                "Memberikan bantuan kepada Conan berupa alat "
                + "dalam memecahkan/menyelesaikan kasus dan "
                + "kepada Detektif Cilik");
        agasa.tampilTokohPendukung();

        TokohPendukung ai = new TokohPendukung("Ai Haibara/Shiho Miyano",
                "Peneliti/Detektif Cilik", "Memberikan bantuan kepada Conan "
                + "dan salah satu Detektif Cilik");
        ai.tampilTokohPendukung();

    }

}
