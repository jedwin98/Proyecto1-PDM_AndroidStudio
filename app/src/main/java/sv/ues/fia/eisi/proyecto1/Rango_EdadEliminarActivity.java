package sv.ues.fia.eisi.proyecto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rango_EdadEliminarActivity extends Activity {
    BD_Controlador helper;
    EditText editIdRangoEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rango_edad_eliminar);
        helper = new BD_Controlador(this);
        editIdRangoEdad = (EditText) findViewById(R.id.editIdRangoEdad);
    }

    public void eliminarRangoEdad(View v){

    }

    public void limpiarTexto(View v){

    }
}