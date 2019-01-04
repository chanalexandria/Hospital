package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Pasig extends AppCompatActivity {
    String items[] = new String[]{"Pasig City General Hospital", "Rizal Medical Center"
            , "St. Therese of Lisieux Doctors Hospital", "Alfonso Specialist Hospital"
            , "Tricity Medical Center", "Sabater Hospital"
            , "The Medical City Hospital", "St. Camillus Medical Center"
            , "Mission Hospital", "Salve Regina General Hospital"
            , "Pasig City Children's Hospital", "Pasig Dcctors Medical Center"
            , "Holy Life Hospital", "St. Christina Maternity Hospital"
            , "Metro Psych Facility"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasig);

        ListView listView = (ListView) findViewById(R.id.listViewPasig);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}