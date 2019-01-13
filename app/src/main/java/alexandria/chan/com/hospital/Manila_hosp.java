package alexandria.chan.com.hospital;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.github.chrisbanes.photoview.PhotoView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class Manila_hosp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manila_hosp);
    }

        public void processManila (View v){
            Intent i = null, chooser=null;
            if (v.getId()==R.id.btnManila){
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:14.607902, 120.996722"));
                chooser = Intent.createChooser(i, "Choose Application For Maps");
                startActivity(chooser);
        }
    }
}