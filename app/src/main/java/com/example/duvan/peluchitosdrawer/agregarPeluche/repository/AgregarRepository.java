package com.example.duvan.peluchitosdrawer.agregarPeluche.repository;

import com.example.duvan.peluchitosdrawer.agregarPeluche.interactor.IAgregarInteractor;
import com.example.duvan.peluchitosdrawer.buscarPeluche.interactor.IBuscarInteractor;

public class AgregarRepository implements IAgregarRepository {

 private IAgregarInteractor agregarInteractor;

 public AgregarRepository(IAgregarInteractor agregarInteractor) {
  this.agregarInteractor = agregarInteractor;
 }

    @Override
    public void agregarContacto(int codigo, String nombre, int cantidad, int precio) {
       // agregar la conexion con la base de datos
        //buscarInteractor.enviardatosencontrados
    }
}


/**
 public class MainActivity extends AppCompatActivity {

 private ContactosSQLiteHelper contactosSQLiteHelper;  //1
 private SQLiteDatabase sqLiteDatabase;  //2
 private EditText eNombre,eTelefono, eCorreo;  //3
 private ContentValues dataBD;  // 5. SIMILAR AL BUNDLE DONDE GUARDAMOS LA INFORMACION
 private Cursor cursor; //ESPECIE DE ARREGLO

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);

 eNombre = findViewById(R.id.eNombre);  //3
 eTelefono = findViewById(R.id.eTelefono);
 eCorreo = findViewById(R.id.eCorreo);

 contactosSQLiteHelper = new ContactosSQLiteHelper(this, // 1
 "contactosBD",
 null,
 1);
 sqLiteDatabase = contactosSQLiteHelper.getWritableDatabase();  //2, LUEGO HACEMOS LA INTERFAZ EN ACTIVITY MAIN
 }

 public void guardarClicked(View view) {  //GUARDAR LA INFORMACION
 dataBD = new ContentValues();
 dataBD.put("nombre",eNombre.getText().toString());
 dataBD.put("telefono",eTelefono.getText().toString());
 dataBD.put("correo",eCorreo.getText().toString());
 sqLiteDatabase.insert("contactos",null,dataBD);
 Toast.makeText(this, "Contacto Guardado", Toast.LENGTH_SHORT).show();
 limpiarWidgets();
 }

 public void buscarClicked(View view) {  // 5
 cursor = sqLiteDatabase.rawQuery("SELECT * FROM contactos WHERE nombre='"+eNombre.getText().toString()+"'",null);

 if (cursor.moveToFirst()){
 eTelefono.setText(cursor.getString(2));
 eCorreo.setText(cursor.getString(3));
 } else {
 Toast.makeText(this, "Contacto no encontrado", Toast.LENGTH_SHORT).show();
 }
 }

 public void actualizarClicked(View view) {
 dataBD = new ContentValues();
 dataBD.put("telefono",eTelefono.getText().toString());
 dataBD.put("correo",eCorreo.getText().toString());
 int band = sqLiteDatabase.update("contactos",dataBD,"nombre='"+eNombre.getText().toString()+"'",null);
 Log.d("band",String.valueOf(band));
 limpiarWidgets();
 if (band!=0) {
 Toast.makeText(this, "Contacto Actualizado", Toast.LENGTH_SHORT).show();
 } else {
 Toast.makeText(this, "Contacto no existe", Toast.LENGTH_SHORT).show();
 }
 }

 public void eliminarClicked(View view) {
 int band = sqLiteDatabase.delete("contactos","nombre='"+eNombre.getText().toString()+"'",null);
 if (band == 0){
 Toast.makeText(this, "Contacto no existe", Toast.LENGTH_SHORT).show();
 } else {
 Toast.makeText(this, "Contacto eliminado", Toast.LENGTH_SHORT).show();
 }
 Log.d("band",String.valueOf(band));
 limpiarWidgets();
 }

 public void limpicarClicked(View view) {
 limpiarWidgets();
 }

 private void limpiarWidgets() {  //4 LIMPIAR DATOS
 eNombre.setText("");
 eTelefono.setText("");
 eCorreo.setText("");
 }

 @Override
 protected void onDestroy() {
 super.onDestroy();
 sqLiteDatabase.close();
 }
 }
*/