package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Pasay extends AppCompatActivity {
    String items[] = new String[]{"Pasay City General Hospital", "Adventist Medical Center"
            , "San Juan de Dios Educational Foundation", "Air Force General Hospital"
            , "FB Harrison Medical Hospital", "Mira Mar Hospital"
            , "Protacio Hospital", "St. Claire's Hospital and Nursery Dormitory"
            , "Doña Marta Health Center" , "Villamor Health Center"
            , "One Health Medical Services"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasay);

        ListView listView = (ListView) findViewById(R.id.listViewPasay);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}