package sw.edu.ulima.foodtrucker;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.GetDataCallback;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseUser;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import Dao.Utils;


public class InicioActivity extends Activity {

    TextView mensaje;
    ImageView fotoPerfil;
//agregado
    TextView tviUsuario;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //agregado
        tviUsuario = (TextView) findViewById(R.id.tviUsuario);
        img=(ImageView)findViewById(R.id.fotoPerfil);


        final ParseUser currentUser = ParseUser.getCurrentUser();

        if (currentUser != null) {
            tviUsuario.setText(currentUser.getString("name"));
            ParseFile applicantResume = (ParseFile)currentUser.get("foto");
            applicantResume.getDataInBackground(new GetDataCallback() {
                public void done(byte[] data, ParseException e) {
                    if (e == null) {

                        img.setImageBitmap(BitmapFactory.decodeByteArray(data, 0, data.length));

                    } else {
                        // something went wrong

                        Toast t = Toast.makeText(InicioActivity.this, e.toString(), Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            });

        } else {
            // show the signup or login screen

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
