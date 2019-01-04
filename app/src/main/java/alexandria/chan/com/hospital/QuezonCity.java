package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class QuezonCity extends AppCompatActivity {
    String items[] = new String[]{"Fe del Mundo Medical Center", "Capitol Medical Center"
            , "UERM Memorial Hospital", "Providence Hospital"
            , "Quezon City General Hospital", "National Children's Hospital"
            , "Dr. Jesus Delgado Memorial Hospital", "De Los Santos Medical Center"
            , "Sta. Teresita General Hospital", "Philippine Children's Medical Center"
            , "National Children's Hospital", "East Avenue Medical Center"
            , "Quirino Memorial Medical Center", "United Doctors Medical Center"
            , "New Era General Hospital", "World Citi Medical Center"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quezon);

        ListView listView = (ListView) findViewById(R.id.listViewQuezon);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}
