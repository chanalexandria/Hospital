package alexandria.chan.com.hospital;

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

        imageView = (ImageView)findViewById(R.id.img_navotas);
        PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
        photoView.update();
    }
}