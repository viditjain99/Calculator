package com.example.vidit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,badd,bsub,bmul,bdiv,beq,bclear,bper;
    boolean add=false,sub=false,mul=false,div=false,per=false,equal=false,ans=false,decAdded=false,error=false;
    double num1,num2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.one);
        b2=(Button) findViewById(R.id.two);
        b3=(Button) findViewById(R.id.three);
        b4=(Button) findViewById(R.id.four);
        b5=(Button) findViewById(R.id.five);
        b6=(Button) findViewById(R.id.six);
        b7=(Button) findViewById(R.id.seven);
        b8=(Button) findViewById(R.id.eight);
        b9=(Button) findViewById(R.id.nine);
        b0=(Button) findViewById(R.id.zero);
        bdec=(Button) findViewById(R.id.decimal);
        badd=(Button) findViewById(R.id.plus);
        bsub=(Button) findViewById(R.id.minus);
        bmul=(Button) findViewById(R.id.multiply);
        bdiv=(Button) findViewById(R.id.divide);
        beq=(Button) findViewById(R.id.equal);
        bper=(Button) findViewById(R.id.percent);
        bclear=(Button) findViewById(R.id.clear);
        text=(TextView) findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(ans==true)
                {
                    text.setText("");
                    ans=false;
                }
                text.setText(text.getText()+"0");
            }
        });

        bclear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    return;
                }
                else if(error==true)
                {
                    error=false;
                    text.setText("");
                    return;
                }
                if(equal==false)
                {
                    String str = text.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    text.setText(str);
                }
                else
                {
                    String str = text.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    text.setText(str);
                }
            }
        });

        bclear.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Nothing to clear!!",Toast.LENGTH_SHORT).show();
                    return false;
                }
                text.setText("");
                return true;
            }
        });

        bdec.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(decAdded==true)
                {
                    return;
                }
                if(text.getText().toString().length()==0)
                {
                    text.setText("0");
                }
                decAdded=true;
                text.setText(text.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                add=true;
                decAdded=false;
                num1=Double.parseDouble(text.getText()+"");
                text.setText("");
            }
        });

        bsub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    text.setText("-");
                    return;
                }
                sub=true;
                decAdded=false;
                num1=Double.parseDouble(text.getText()+"");
                text.setText("");
            }
        });

        bmul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                mul=true;
                decAdded=false;
                num1=Double.parseDouble(text.getText()+"");
                text.setText("");
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                div=true;
                decAdded=false;
                num1=Double.parseDouble(text.getText()+"");
                text.setText("");
            }
        });

        bper.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                per=true;
                decAdded=false;
                num1=Double.parseDouble(text.getText()+"");
                text.setText("");
            }
        });

        beq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(text.getText().toString().length()==0)
                {
                    Toast.makeText(MainActivity.this,"Enter a number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(equal==true)
                {
                    equal=false;
                    return;
                }
                equal=true;
                decAdded=false;
                num2=Double.parseDouble(text.getText()+"");
                if(add==true && equal==true)
                {
                    String str=String.valueOf((num1+num2));
                    if(str.length()>8)
                    {
                        str=str.substring(0,9);
                    }
                    text.setText(str);
                    add=false;
                    equal=false;
                    ans=true;
                }
                else if(sub==true && equal==true)
                {
                    String str=String.valueOf((num1-num2));
                    if(str.length()>8)
                    {
                        str=str.substring(0,9);
                    }
                    text.setText(str);
                    sub=false;
                    equal=false;
                    ans=true;
                }
                else if(mul==true && equal==true)
                {
                    String str=String.valueOf((num1*num2));
                    if(str.length()>8)
                    {
                        str=str.substring(0,9);
                    }
                    text.setText(str);
                    mul=false;
                    equal=false;
                    ans=true;
                }
                else if(div==true && equal==true)
                {
                    if(num2==0)
                    {
                        text.setText("Error");
                        error=true;
                    }
                    else
                    {
                        String str = String.valueOf(num1 / num2);
                        if(str.length()>8)
                        {
                            str=str.substring(0,9);
                        }
                        text.setText(str);
                    }
                    div=false;
                    equal=false;
                    ans=true;
                }
                else if(per==true && equal==true)
                {
                    String str=String.valueOf(((num1/100)*num2));
                    if(str.length()>8)
                    {
                        str=str.substring(0,9);
                    }
                    text.setText(str);
                    per=false;
                    equal=false;
                    ans=true;
                }
            }
        });
    }
}
