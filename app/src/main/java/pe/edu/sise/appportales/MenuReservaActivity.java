package pe.edu.sise.appportales;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MenuReservaActivity extends AppCompatActivity {

    private static final String TAG = "MenuReservaActivity";

    private static final int ERROR_DIALOG_REQUEST = 9001;

    protected Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reserva);

        btnMap=findViewById(R.id.btnMap);

    }

    public void irMapActivity(View view)
    {
        Intent intent=new Intent(getApplicationContext(),MapActivity.class);
        startActivity(intent);
    }



    public boolean isServicesOK(){
        Log.d(TAG, "isServicesOK: checking google services version");

        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getApplicationContext());

        if(available == ConnectionResult.SUCCESS){
            //everything is fine and the user can make map requests
            Log.d(TAG, "isServicesOK: Google Play Services esta trabajando");
            return true;
        }
        else if(GoogleApiAvailability.getInstance().isUserResolvableError(available)){
            //an error occured but we can resolve it
            Log.d(TAG, "isServicesOK: ocurrió un error pero podemos arreglarlo");
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MenuReservaActivity.this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        }else{
            Toast.makeText(this, "No puedes hacer solicitudes de mapas", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

}
