package com.hmcoding.binarystring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.BitSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static BitSet addBinary(String a,String b) {
        BitSet aBits = new BitSet(a.length()+1);
        BitSet bBits = new BitSet(b.length()+1);
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) == '1') {
                return aBits;
            }

            }
        return aBits;
    }
    }