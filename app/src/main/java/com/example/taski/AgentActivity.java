package com.example.taski;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.dhaval2404.imagepicker.ImagePicker;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AgentActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    private static final int YOUR_REQUEST_CODE = 45;
    Spinner s1;
    CircleImageView vimg;
    ImageView imv1;
    TextView t19;
    EditText et1,et2;
    private ActivityResultLauncher<Intent> galleryLauncher;
    private static final int REQUEST_PICK_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);
        et1=findViewById(R.id.editTextText11);
        et2=findViewById(R.id.editTextText12);
        t19=findViewById(R.id.textViewlog);
        ImageView img = findViewById(R.id.eyeee);
        ImageView img2 = findViewById(R.id.eyeee1);
        s1 = findViewById(R.id.spinner);
        imv1 = findViewById(R.id.image);
        vimg= findViewById(R.id.profile_image);

        img.setImageResource(R.drawable.eye_hide);
        img2.setImageResource(R.drawable.eye_hide);
        vimg.setImageResource(R.drawable.icon_profile);


        List<String> country = new ArrayList<>();
        country.add(0, "Select an Item");
        country.add("Cuddalore");
        country.add("Panruti");
        country.add("villupuram");
        country.add("pondy");
        country.add("coimbatore");
        country.add("chennai");
        country.add("Dharmapuri");
        country.add("Karur");

        s1.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner

        s1.setAdapter(aa);




        imv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {



                openGallery();
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    et1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_show);
                } else {
                    et1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img.setImageResource(R.drawable.eye_hide);
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2.getTransformationMethod() == PasswordTransformationMethod.getInstance()) {
                    et2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    img2.setImageResource(R.drawable.eye_show);
                } else {
                    et1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    img2.setImageResource(R.drawable.eye_hide);
                }
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AgentActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void openGallery() {
        ImagePicker.with(AgentActivity.this)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start();
    }

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
    {
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == YOUR_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            // Get the URI of the selected image
            Uri uri = data.getData();
            if (uri != null) {
                // Set the URI to the circle image view
                vimg.setImageURI(uri);
                // Make the circle image view visible
                vimg.setVisibility(View.VISIBLE);
            } else {
                // If URI is null, clear the image from the circle image view
                vimg.setImageURI(null);
                // Hide the circle image view
                vimg.setVisibility(View.VISIBLE);
            }
        }
    }

}


