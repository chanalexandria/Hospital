package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Taguig extends AppCompatActivity {
    String items[] = new String[]{"Taguig District Hospital", "Cruz-Rabe General Hospital"
            , "Taguig Doctors Hospital", "Dr. Sabili General Hospital"
            , "Army General Hospital", "Medical Center Taguig"
            , "Recuenco General Hospital", "Holy Mary Family Hospital"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taguig);

        ListView listView = (ListView) findViewById(R.id.listViewTaguig);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}