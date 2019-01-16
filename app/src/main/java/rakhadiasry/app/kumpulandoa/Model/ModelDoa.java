package rakhadiasry.app.kumpulandoa.Model;

import java.io.Serializable;

/**
 * Created by Rakha Diasry on 16/01/2019.
 */


public class ModelDoa implements Serializable {

    private String doaTitle;
    private String doaSubtitle;
    private String doaSurah;


    public ModelDoa(String doaTitle, String doaSubtitle, String doaSurah) {
        this.doaTitle = doaTitle;
        this.doaSubtitle = doaSubtitle;
        this.doaSurah = doaSurah;
    }

    public String getDoaTitle() {
        return doaTitle;
    }

    public String getDoaSubtitle() {
        return doaSubtitle;
    }

    public String getDoaSurah() {
        return doaSurah;
    }
}
