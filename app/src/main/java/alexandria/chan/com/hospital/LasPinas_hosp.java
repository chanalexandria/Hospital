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

public class LasPinas_hosp extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laspinas_hosp);
    }
    public void processLasPinas (View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnLasPinas){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.448307, 120.985822"));
            chooser = Intent.createChooser(i, "Choose Application For Maps");
            startActivity(chooser);
        }
    }
}