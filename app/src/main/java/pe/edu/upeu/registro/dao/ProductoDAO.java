package pe.edu.upeu.registro.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


import pe.edu.upeu.registro.bean.Producto;

/**
 * Created by Alumnos on 02/05/2017.
 */

public class ProductoDAO extends SQLiteOpenHelper {

    private static final String DATABASE = "RegisterTest";
    private static final int VERSION =2;

    public ProductoDAO(Context context) {
        super(context, DATABASE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String ddl="CREATE TABLE Producto (" +
                " id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                " codProducto TEXT," +
                " desProducto TEXT," +
                " cantidad TEXT," +
                " precioReal REAL," +
                " total REAL," +
                ");";

        db.execSQL(ddl);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String ddl = "DROP TABLE IF EXISTS Producto";
        db.execSQL(ddl);
        this.onCreate(db);
    }
    public void  saveproducto(Producto producto) {

        ContentValues values= new ContentValues();
        values.put("codigo", producto.getCodProducto());
        values.put("descripcion", producto.getDesProducto());
        values.put("cantidad", producto.getCantidad());
        values.put("precio", producto.getPrecioReal());
        values.put("precio", producto.getTotal());
        getWritableDatabase().insert("Producto",null,values);
    }

    public List<Producto> findProductoAll() {
        List<Producto> listProducto = new ArrayList<Producto>();
        String column[] = {"id", "codigo", "descripcion", "cantidad", "precio", "total"};
        String where = null;

        Cursor cursor = getReadableDatabase().query("Producto", column, where, null, null, null, null);
        Producto producto= null;

        while (cursor.moveToNext()){
            producto=new Producto();
            producto.setId(cursor.getLong(0));
            producto.setCodProducto(cursor.getInt(1));
            producto.setDesProducto(cursor.getString(2));
            producto.setCantidad(cursor.getInt(3));
            producto.setPrecioReal(cursor.getDouble(4));
            producto.setTotal(cursor.getDouble(5));
            listProducto.add(producto);
        }
        cursor.close();
        return listProducto;
    }

}