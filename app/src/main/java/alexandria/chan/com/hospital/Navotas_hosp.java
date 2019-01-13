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

public class Navotas_hosp extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navotas_hosp);
    }

    public void processNavotas (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnNavotas){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.660254 120.946052"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}