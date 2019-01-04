package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Mandaluyong extends AppCompatActivity {
    String items[] = new String[]{"Unciano General Hospital", "VRP Medical Center"
            , "National Center for Mental Health", "Our Lady of Lourdes Hospital"
            , "Mandaluyong City Medical Center", "St. Patrick's Healthcare System"
            , "ACE Medical Center", "Annette General Hospital"
            , "St. Michaels Medical Center", "Cardinal Santos Medical Canter"
            , "St. Martin de Porres Charity Hospital", "Trinity Hospital"
            , "Haemonetics Corporation", "Dr. Geraldine Michelle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandaluyong);

        ListView listView = (ListView) findViewById(R.id.listViewMandaluyong);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}