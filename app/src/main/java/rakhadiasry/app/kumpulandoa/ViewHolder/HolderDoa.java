package rakhadiasry.app.kumpulandoa.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import rakhadiasry.app.kumpulandoa.R;

/**
 * Created by Rakha Diasry on 17/01/2019.
 */
public class HolderDoa extends RecyclerView.ViewHolder {
    public TextView title, subtitle ;

    public HolderDoa(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.doaTitle);
        subtitle = (TextView) itemView.findViewById(R.id.doaSubtitle);
    }
}
