package com.example.fullstack.appfoody.model;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FullStack on 9/20/2017.
 */

public class QuanAnModel {


    boolean giaohang;
    String giomocua;
    String giogiaohang;
    String giatoithieu;
    String tenquaan;
    String diachi;
    String videogioithieu;
    String maquaan;
    List<String> tienich;
    long luotthich;

    public String getGiatoithieu() {
        return giatoithieu;
    }

    public void setGiatoithieu(String giatoithieu) {
        this.giatoithieu = giatoithieu;
    }

    public long getLuotthich() {
        return luotthich;
    }

    public void setLuotthich(long luotthich) {
        this.luotthich = luotthich;
    }


    DatabaseReference databaseReference;

    public QuanAnModel() {
        databaseReference = FirebaseDatabase.getInstance().getReference();
    }

    public boolean isGiaohang() {
        return giaohang;
    }

    public void setGiaohang(boolean giaohang) {
        this.giaohang = giaohang;
    }

    public String getGiomocua() {
        return giomocua;
    }

    public void setGiomocua(String giomocua) {
        this.giomocua = giomocua;
    }

    public String getGiogiaohang() {
        return giogiaohang;
    }

    public void setGiogiaohang(String giogiaohang) {
        this.giogiaohang = giogiaohang;
    }

    public String getTenquaan() {
        return tenquaan;
    }

    public void setTenquaan(String tenquaan) {
        this.tenquaan = tenquaan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getVideogioithieu() {
        return videogioithieu;
    }

    public void setVideogioithieu(String videogioithieu) {
        this.videogioithieu = videogioithieu;
    }

    public String getMaquaan() {
        return maquaan;
    }

    public void setMaquaan(String maquaan) {
        this.maquaan = maquaan;
    }

    public List<String> getTienich() {
        return tienich;
    }

    public void setTienich(List<String> tienich) {
        this.tienich = tienich;
    }


    public void getListQuanAn() {
        final List<QuanAnModel> quanAnModels = new ArrayList<>();
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //Log.d("kiemtra", dataSnapshot + "");
                DataSnapshot mSnapshot = dataSnapshot.child("quanans");
                for (DataSnapshot values : mSnapshot.getChildren()) {
                    QuanAnModel quanAnModel = values.getValue(QuanAnModel.class);
                    Log.d("daik", quanAnModel.getTenquaan());
                    quanAnModels.add(quanAnModel);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        databaseReference.addValueEventListener(valueEventListener);
    }

}
