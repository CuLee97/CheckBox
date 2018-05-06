package lv.dong.radiobuttoncheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // Khai bao cac object
    private TextView tvName;
    private RadioButton rbtnGay;
    private RadioButton rbtnLess;

    private CheckBox cbMauTim;
    private CheckBox cbMauHong;
    private CheckBox cbNoiTam;
    private CheckBox cbKhocTham;

    private ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

        // Gan su kien onClick vao view nao do
        imgButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String sologan = "";
                sologan = String.valueOf(tvName.getText());

                // isChecked() kiem tra xem da chon chua 
                if(cbMauTim.isChecked())
                    sologan += cbMauTim.getText() + " - ";
                if(cbMauHong.isChecked())
                    sologan += cbMauHong.getText() + " - ";
                if(cbNoiTam.isChecked())
                    sologan += cbNoiTam.getText() + " - ";
                if(cbKhocTham.isChecked())
                    sologan += cbKhocTham.getText() + " - ";
                if(rbtnGay.isChecked())
                    sologan += rbtnGay.getText();
                else
                    sologan += rbtnLess.getText();

                Toast.makeText(MainActivity.this, sologan, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initWidget(){
        tvName = (TextView) findViewById(R.id.tv_name);
        rbtnGay = (RadioButton) findViewById(R.id.rbtn_gay);
        rbtnLess = (RadioButton) findViewById(R.id.rbtn_less);

        cbMauTim = (CheckBox) findViewById(R.id.cb_mautim);
        cbMauHong = (CheckBox) findViewById((R.id.cbmau_hong));
        cbNoiTam = (CheckBox) findViewById(R.id.cb_noitam);
        cbKhocTham = (CheckBox) findViewById(R.id.cb_khoctam);
        imgButton = (ImageButton) findViewById(R.id.img_button);
    }
}
