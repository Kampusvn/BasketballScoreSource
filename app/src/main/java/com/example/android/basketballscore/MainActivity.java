package com.example.android.basketballscore;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Theo dõi điểm cho đội A
    int diemDoiA = 0;

    //Theo dõi điểm cho đội B
    int diemDoiB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hienThiDiemDoiA(0);
    }

    /**
     * Tăng thêm 3 điểm đội A.
     */
    public void themBaDiemChoDoiA(View v){
        diemDoiA = diemDoiA + 3;
        hienThiDiemDoiA(diemDoiA);
    }

    /**
     * Tăng thêm 2 điểm đội A.
     */
    public void themHaiDiemChoDoiA(View v){
        diemDoiA = diemDoiA + 2;
        hienThiDiemDoiA(diemDoiA);
    }

    /**
     * Tăng thêm 1 điểm đội A.
     */
    public void themMotDiemChoDoiA(View v){
        diemDoiA = diemDoiA + 1;
        hienThiDiemDoiA(diemDoiA);
    }

    /**
     * Tăng thêm 1 điểm đội B.
     */
    public void themMotDiemChoDoiB(View v){
        diemDoiB = diemDoiB + 1;
        hienThiDiemDoiB(diemDoiB);
    }

    /**
     * Tăng thêm 2 điểm đội B.
     */
    public void themHaiDiemChoDoiB(View v){
        diemDoiB = diemDoiB + 2;
        hienThiDiemDoiB(diemDoiB);
    }

    /**
     * Tăng thêm 3 điểm đội B.
     */
    public void themBaDiemChoDoiB(View v){
        diemDoiB = diemDoiB + 3;
        hienThiDiemDoiB(diemDoiB);
    }

    /**
     * Hiển thị điểm đội A.
     */
    public void hienThiDiemDoiA(int diem) {
        TextView diemView = (TextView) findViewById(R.id.diem_doi_a);
        diemView.setText(String.valueOf(diem));
    }

    /**
     * Hiển thị điểm đội B.
     */
    public void hienThiDiemDoiB(int diem) {
        TextView diemView = (TextView) findViewById(R.id.diem_doi_b);
        diemView.setText(String.valueOf(diem));
    }

    public void datLaiDiem(View v){
        diemDoiA = 0;
        diemDoiB = 0;
        hienThiDiemDoiA(diemDoiA);
        hienThiDiemDoiB(diemDoiB);
    }
}
