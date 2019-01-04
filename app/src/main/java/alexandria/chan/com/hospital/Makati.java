package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Makati extends AppCompatActivity {
    String items[] = new String[]{"St. Clair's Medical Center", "Ospital ng Makati"
            , "Makati Medical Center", "Healthkard Hospital"
            , "Centuria Medical Makati", "Tokyo Healthlink Inc."
            , "St. Therese Hospital", "SuperCare Medical Services, Inc. Makati"
            , "Makati Genitourinary and Prostatis Center", "Medical Towers Makati"
            , "Medmax Medical Laboratory, Pharmacy, and Diagnostic Center"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makati);

        ListView listView = (ListView) findViewById(R.id.listViewMakati);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}