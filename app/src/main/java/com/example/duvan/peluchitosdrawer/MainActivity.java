package com.example.duvan.peluchitosdrawer;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private ArrayList<Peluchito> peluchitoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        AgregarFragment agregarFragment = new AgregarFragment();
        fragmentTransaction.add(R.id.framelayout, agregarFragment).commit();

        peluchitoArrayList = new ArrayList<>();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (id == R.id.dAgregar) {
            AgregarFragment agregarFragment = new AgregarFragment();
            fragmentTransaction.replace(R.id.framelayout, agregarFragment).commit();

        } else if (id == R.id.dBuscar) {
            BuscarFragment buscarFragment = new BuscarFragment();
            fragmentTransaction.replace(R.id.framelayout, buscarFragment).commit();

        } else if (id == R.id.dEliminar) {
            EliminarFragment eliminarFragment = new EliminarFragment();
            fragmentTransaction.replace(R.id.framelayout, eliminarFragment).commit();

        } else if (id == R.id.dInventario) {
            InventarioFragment inventarioFragment = new InventarioFragment();
            fragmentTransaction.replace(R.id.framelayout, inventarioFragment).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
