package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Malabon extends AppCompatActivity {
    String items[] = new String[]{"San Lorenzo Ruiz Women's Hospital", "Pagamutang Bayan ng Malabon"
            , "Franco Clinic and Hospital", "Malabon City Hospital"
            , "Tita Oreta Memorial Hospital", "MGC Polyclinic"
            , "Quinto Polyclinic", "Calalang General Hospital"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.malabon);

        ListView listView = (ListView) findViewById(R.id.listViewMalabon);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}