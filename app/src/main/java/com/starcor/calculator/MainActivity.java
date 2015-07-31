package com.starcor.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.starcor.calculator.exceptions.InvalidArgumentException;


public class MainActivity extends Activity implements View.OnClickListener {
    private  static final String TAG = MainActivity.class.getSimpleName();

    private EditText mEtInputExpression;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mEtInputExpression = (EditText) findViewById(R.id.et_input_expression);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        findViewById(R.id.btn_calculate).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_calculate:
                String input = mEtInputExpression.getText().toString();
                try {
                    String result = Calculator.calculate(input);
                    mTvResult.setText(result);
                } catch (InvalidArgumentException e) {
                    Log.e(TAG, e.toString());
                    Toast.makeText(this, R.string.expression_error, Toast.LENGTH_LONG);
                }
                break;

        }
    }
}
