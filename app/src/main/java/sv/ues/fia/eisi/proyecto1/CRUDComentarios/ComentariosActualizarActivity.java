package sv.ues.fia.eisi.proyecto1.CRUDComentarios;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import sv.ues.fia.eisi.proyecto1.BD_Controlador;
import sv.ues.fia.eisi.proyecto1.R;

public class ComentariosActualizarActivity extends Activity {
    BD_Controlador helper;
    EditText editIdComentario;
    EditText editIdUsuarioComentario;
    EditText editIdLocalComentario;
    EditText editTextComentario;
    EditText editFechaComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios_actualizar);
        helper = new BD_Controlador(this);
        editIdComentario = (EditText) findViewById(R.id.editIdComentario);
        editIdUsuarioComentario = (EditText) findViewById(R.id.editIdUsuarioComentario);
        editIdLocalComentario = (EditText) findViewById(R.id.editIdLocalComentario);
        editTextComentario = (EditText) findViewById(R.id.editTextComentario);
        editFechaComentario = (EditText) findViewById(R.id.editFechaComentario);
    }

    public void actualizarComentarios(View v){

    }

    public void limpiarTexto(View v){

    }
}