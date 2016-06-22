package com.plexxoo.android.test;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class MyOnItemSelectedListener implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent,
        View view, int pos, long id) {
    	String text="";
    	if(!parent.getItemAtPosition(pos).toString().equals(R.string.none_item)) {
    		text="The planet is " +
  		          parent.getItemAtPosition(pos).toString();
    	}else{
    		text="Select a Planet";
    	}
    	Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();
      
    }

    public void onNothingSelected(@SuppressWarnings("rawtypes") AdapterView parent) {
    	Toast.makeText(parent.getContext(), "Select the planet", Toast.LENGTH_LONG).show();
    }
}
