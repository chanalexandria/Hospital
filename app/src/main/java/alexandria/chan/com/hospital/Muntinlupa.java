package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Muntinlupa extends AppCompatActivity {
    String items[] = new String[]{"Asian Hospital and Medical Center"
            , "Ospital ng Muntinlupa", "Beato-Cauilan Hospital"
            , "Alabang Medical Center", "Hillside General Hospital"
            , "Tokyo Healthlink", "Alabang Medical Clinic"
            , "Muntinlupa Central Hospital", "Intellicare"
            , "Vets in Practice Alabang", "Muntinlupa Social Hygiene Clinic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muntinlupa);

        ListView listView = (ListView) findViewById(R.id.listViewMuntinlupa);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}