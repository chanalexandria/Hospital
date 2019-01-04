package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Marikina extends AppCompatActivity {
    String items[] = new String[]{"Marikina Valley Medical Center", "St. Anthony Medical Center"
            , "Amang Rodriguez Memorial Medical Center", "St. Victoria Hospital"
            , "Garcia General Hospital", "SDS Medical Center"
            , "St. Vincent Hospital", "Sta. Monica Hospital"
            , "San Ramon Hospital", "Manila Doctors Hospital"
            , "P. Gonzales Memorial Hospital", "Immaculate Conception Hospital"
            , "Salve Regina General Hospital", "The Medical City"
            , "Marikina Veterinary Hospital"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marikina);

        ListView listView = (ListView) findViewById(R.id.listViewMarikina);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}