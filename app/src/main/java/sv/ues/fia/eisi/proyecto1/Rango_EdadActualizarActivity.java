package sv.ues.fia.eisi.proyecto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rango_EdadActualizarActivity extends Activity {
    BD_Controlador helper;
    EditText editIdRangoEdad;
    EditText editNombreRangoEdad;
    EditText editEdadMenor;
    EditText editEdadMayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rango_edad_actualizar);
        helper = new BD_Controlador(this);
        editIdRangoEdad = (EditText) findViewById(R.id.editIdRangoEdad);
        editNombreRangoEdad = (EditText) findViewById(R.id.editNombreRangoEdad);
        editEdadMenor = (EditText) findViewById(R.id.editEdadMenor);
        editEdadMayor = (EditText) findViewById(R.id.editEdadMayor);
    }

    public void actualizarRangoEdad(View v){

    }

    public void limpiarTexto(View v){

    }
}