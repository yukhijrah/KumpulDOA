package rakhadiasry.app.kumpulandoa.Model;

/**
 * Created by Rakha Diasry on 16/01/2019.
 */

public class ModelHome {
    private String jadwal;
    private String waktu;

    /* *Constructor * Menginisialisasikan Variable  */
    public ModelHome(String jadwal, String waktu) {
        this.jadwal = jadwal;
        this.waktu = waktu;
    }

    public String getJadwal() {
        return jadwal;
    }

    public String getWaktu() {
        return waktu;
    }
}
