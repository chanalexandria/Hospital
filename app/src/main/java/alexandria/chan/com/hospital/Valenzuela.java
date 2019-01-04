package alexandria.chan.com.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Valenzuela extends AppCompatActivity {
    String items[] = new String[]{"Valenzuela City Medical Center", "Fatima University Medical Center"
            , "Calalang General Hospital", "Valenzuela Citicare Medical Center"
            , "Santissimo Rosario General Hospital", "Valenzuela City Emergency Hospital"
            , "ACE Valenzuela", "Vian Family Hospital"
            , "M.V. Romano General Hospital", "San Lorenzo Ruiz Women's Hospital"
            , "Dalandanan Health Center", "Express Medical Center"
            , "Tugatog Health Center"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valenzuela);

        ListView listView = (ListView) findViewById(R.id.listViewValenzuela);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}