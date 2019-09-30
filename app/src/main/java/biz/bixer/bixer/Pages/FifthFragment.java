package biz.bixer.bixer.Pages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import biz.bixer.bixer.R;


public class FifthFragment extends Fragment {
     Button bt;
     ImageButton imageButton3;
     ImageButton imageButton2;
     ImageButton imageButton5;
     ImageButton imageButton6;
     ImageButton imageButton7;
     ImageButton imageButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fifth, container, false);
        Button bt=(Button)view.findViewById(R.id.button);
        ImageButton imageButton2=(ImageButton)view.findViewById(R.id.imageButton2);
        ImageButton imageButton3=(ImageButton)view.findViewById(R.id.imageButton3);
        ImageButton imageButton5=(ImageButton)view.findViewById(R.id.imageButton5);
        ImageButton imageButton6=(ImageButton)view.findViewById(R.id.imageButton6);
        ImageButton imageButton7=(ImageButton)view.findViewById(R.id.imageButton7);
        ImageButton imageButton=(ImageButton)view.findViewById(R.id.imageButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody="bixer.biz";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
               // myIntent.putExtra(Intent.EXTRA_TEXT,shareSub);
                startActivity(Intent.createChooser(myIntent,"Share using"));
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener()
        { @Override
            public void onClick(View v)
            {
                Uri address = Uri.parse("http://t.me/Vladdosiik");
                Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openlinkIntent);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        {
            Uri address = Uri.parse("https://www.instagram.com/vladdosiik/");
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);
        }
        });
        imageButton5.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        {
            Uri address = Uri.parse("https://twitter.com/Bixer5");
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);
        }
        });
        imageButton6.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        {
            Uri address = Uri.parse("http://vladdosiik.ru/");
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);
        }
        });
        imageButton7.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        {
            Uri address = Uri.parse("https://github.com/Bixxxer");
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);
        }
        });
          imageButton.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        {
            Uri address = Uri.parse("https://www.facebook.com/vladdosiik");
            Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
            startActivity(openlinkIntent);
        }
        });
return view;
    }
}


