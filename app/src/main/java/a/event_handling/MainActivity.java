package a.event_handling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.bt_cl:
                Intent intent = new Intent(this, Bt_Cl.class);
                startActivity(intent);
                break;
            case R.id.cm_gs:
                intent = new Intent(this, Cm_Gs.class);
                startActivity(intent);
                break;
            case R.id.mt_ev:
                intent = new Intent(this, Mt_Ev.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
