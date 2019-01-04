package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Paranaque extends AppCompatActivity {
    String items[] = new String[]{"Unihealth-Parañaque Hospital & Medical Center", "Protacio Hospital"
            , "Parañaque Doctor's Hospital", "Olivarez General Hospital"
            , "The Premier Medical Center", "Medical Center Parañaque"
            , "Parañaque Community Hospital", "Ospital ng Parañaque"
            , "Our Lady of Peace Hospital", "Santa Rita de Baclaran Hospital"
            , "South Superhighway Medical Center", "Nuga Hospital"
            , "South Med Dialysis Center", "Doña Maura Pascual Health Center"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paranaque);

        ListView listView = (ListView) findViewById(R.id.listViewParanaque);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}