package biz.bixer.bixer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import biz.bixer.bixer.R;


public class SixthFragment extends Fragment {
    private Button buttonSend;
    private EditText textTo;
    private EditText textSubject;
    private EditText textMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sixth, container, false);
        Button buttonSend=(Button)view.findViewById(R.id.buttonSend);
       // buttonSend = (Button) findViewById(R.id.buttonSend);
       // final EditText textTo=(EditText)view.findViewById(R.id.editTextTo);
       // textTo = (EditText) findViewById(R.id.editTextTo);
      final  EditText textSubject=(EditText)view.findViewById(R.id.editTextSubject);
        final EditText textMessage=(EditText)view.findViewById(R.id.editTextMessage);
       // textSubject = (EditText) findViewById(R.id.editTextSubject);
     //   textMessage = (EditText) findViewById(R.id.editTextMessage);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               // String to = textTo.getText().toString();
                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();
                Intent email = new Intent(Intent.ACTION_SEND);
//Указываем получателя
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"bixersupport@protonmail.com"});
//Устанавливаем Тему сообщения
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
//Устанавливаем само сообщение
                email.putExtra(Intent.EXTRA_TEXT, message);
//тип отправляемого сообщения
                email.setType("message/rfc822");
//Вызываем intent выбора клиента для отправки сообщения
                startActivity(Intent.createChooser(email, "Выберите email клиент :"));
            }

        });
        return view;
    }
}




