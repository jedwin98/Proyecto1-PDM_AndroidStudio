package sv.ues.fia.eisi.proyecto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UsuarioInsertarActivity extends Activity {
    BD_Controlador helper;
    EditText editIdUsuario;
    EditText editIdTipoUsuario;
    EditText editIdEmpresa;
    EditText editNomUsuario;
    EditText editContraUsuario;
    EditText editCorreoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_insertar);
        helper = new BD_Controlador(this);
        editIdUsuario = (EditText) findViewById(R.id.editIdUsuario);
        editIdTipoUsuario = (EditText) findViewById(R.id.editIdTipoUsuario);
        editIdEmpresa = (EditText) findViewById(R.id.editIdEmpresa);
        editNomUsuario = (EditText) findViewById(R.id.editNomUsuario);
        editContraUsuario = (EditText) findViewById(R.id.editContraUsuario);
        editCorreoUsuario = (EditText) findViewById(R.id.editCorreoUsuario);
    }

    public void insertarUsuario(View v){

    }

    public void limpiarTexto(View v){

    }
}