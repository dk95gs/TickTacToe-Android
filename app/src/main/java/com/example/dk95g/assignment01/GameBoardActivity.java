package com.example.dk95g.assignment01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import org.w3c.dom.Text;

public class GameBoardActivity extends AppCompatActivity implements OnEditorActionListener, OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private TextView turnTextView;
    private Button newGameButton;
    private Button[][] grid;
    Button[][] arr = {{btn1, btn2, btn3}, {btn4,btn5,btn6}, {btn7,btn8,btn9}};
    private boolean turnX = true;
    private String winningPlayer;
    private  int counter = 0;
    private boolean gameOver = false;

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int counter = 1;
        if(savedInstanceState != null) {
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length; y++) {
                    String tempKey = "btn" + counter;
                    String btnText = savedInstanceState.getString(tempKey);
                    arr[x][y].setText(btnText);
                    counter++;
                    if (savedInstanceState.getString("buttonState").equals("false")) {
                        arr[x][y].setEnabled(false);
                    }
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_board);



        arr[0][0]  = findViewById(R.id.btn1);
        arr[0][1]  = findViewById(R.id.btn2);
        arr[0][2]  = findViewById(R.id.btn3);
        arr[1][0]  = findViewById(R.id.btn4);
        arr[1][1]  = findViewById(R.id.btn5);
        arr[1][2]  = findViewById(R.id.btn6);
        arr[2][0] = findViewById(R.id.btn7);
        arr[2][1]  = findViewById(R.id.btn8);
        arr[2][2]  = findViewById(R.id.btn9);
        newGameButton = findViewById(R.id.newGameBtn);
        turnTextView = (TextView) findViewById(R.id.turnTextView);

        arr[0][0].setOnClickListener(this);
        arr[0][1].setOnClickListener(this);
        arr[0][2].setOnClickListener(this);
        arr[1][0].setOnClickListener(this);
        arr[1][1].setOnClickListener(this);
        arr[1][2].setOnClickListener(this);
        arr[2][0].setOnClickListener(this);
        arr[2][1].setOnClickListener(this);
        arr[2][2].setOnClickListener(this);
        newGameButton.setOnClickListener(this);
        turnTextView.setText("Player X Turn");


    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

        return false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int counter = 1;
        for(int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                String tempKey = "btn" + counter;
                counter++;
                outState.putString(tempKey, arr[x][y].getText().toString());
                outState.putString("buttonState", "true");
            }
        }
        if (gameOver) {
            outState.putString("buttonState", "false");
        }

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                if(arr[0][0].getText() == "") {
                    if (turnX) {
                        arr[0][0].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[0][0].setText("O");
                        turnX = true;
                        turnTextView.setText("Player X Turn");
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn2:
                if(arr[0][1].getText() == "") {
                    if (turnX) {
                        arr[0][1].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[0][1].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn3:
                if(arr[0][2].getText() == "") {
                    if (turnX) {
                        arr[0][2].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[0][2].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn4:
                if(arr[1][0].getText() == "") {
                    if (turnX) {
                        arr[1][0].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[1][0].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn5:
                if(arr[1][1].getText() == "") {
                    if (turnX) {
                        arr[1][1].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[1][1].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn6:
                if(arr[1][2].getText() == "") {
                    if (turnX) {
                        arr[1][2].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[1][2].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn7:
                if(arr[2][0].getText() == "") {
                    if (turnX) {
                        arr[2][0].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[2][0].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn8:
                if(arr[2][1].getText() == "") {
                    if (turnX) {
                        arr[2][1].setText("X");
                        turnTextView.setText("Player X Turn");
                        turnX = false;
                    } else {
                        arr[2][1].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.btn9:
                if(arr[2][2].getText() == "") {
                    if (turnX) {
                        arr[2][2].setText("X");
                        turnTextView.setText("Player O Turn");
                        turnX = false;
                    } else {
                        arr[2][2].setText("O");
                        turnTextView.setText("Player X Turn");
                        turnX = true;
                    }
                    counter++;
                }
                UpdateGame();
                break;
            case R.id.newGameBtn:
                ResetBoard();
                break;
            case R.id.menuNewGame:
                ResetBoard();
                break;
        }
    }
    public Boolean checkForWinner(){
        String win = "";
        for (int x=0; x < arr.length; x++) {
            for (int y=0; y < arr.length; y++) {
                win = win.concat((String) arr[x][y].getText());
            }

            if(win.equals("XXX") || win.equals("OOO")) {
                if(win.equals("XXX")) {
                    winningPlayer =  "Player X Won!";
                    DisableButtons();
                } else {
                    winningPlayer = "Player O Won!";
                    DisableButtons();
                }
                return true;
            } else {
                win = "";
            }
        }
        for (int x=0; x < arr.length; x++) {
            for (int y=0; y < arr.length; y++) {
                win = win.concat((String) arr[y][x].getText());
            }

            if(win.equals("XXX") || win.equals("OOO")) {
                if(win.equals("XXX")) {
                    winningPlayer =  "Player X Won!";
                    DisableButtons();
                } else {
                    winningPlayer = "Player O Won!";
                    DisableButtons();
                }
                return true;
            } else {
                win = "";
            }
        }
        if (arr[0][0].getText().equals("X") && arr[1][1].getText().equals("X") && arr[2][2].getText().equals("X")) {
            winningPlayer = "Player X Won!";
            DisableButtons();
            return true;
        }
        if (arr[0][0].getText().equals("O") && arr[1][1].getText().equals("O") && arr[2][2].getText().equals("O")) {
            winningPlayer = "Player O Won!";
            DisableButtons();
            return true;
        }
        if (arr[0][2].getText().equals("X") && arr[1][1].getText().equals("X") && arr[2][0].getText().equals("X")) {
            winningPlayer = "Player X Won!";
            DisableButtons();
            return true;
        }
        if (arr[0][2].getText().equals("O") && arr[1][1].getText().equals("O") && arr[2][0].getText().equals("O")) {
            winningPlayer = "Player O Won!";
            DisableButtons();
            return true;
        }
        if (counter >= 9 ){
            winningPlayer = "Tie Game!";
            return true;
        }
        return false;
    }
    public void UpdateGame(){
        if(checkForWinner()) {
            turnTextView.setText(winningPlayer);
        }
    }
    public void ResetBoard(){
        for(int x = 0; x < arr.length; x++){
            for (int y = 0; y < arr.length; y++) {
                arr[x][y].setText("");
            }
        }
        EnableButtons();
        turnTextView.setText("Player X Turn");
        winningPlayer = "";
        counter = 0;
        gameOver = false;
    }
    public void DisableButtons(){
        for(int x = 0; x < arr.length; x++){
            for (int y = 0; y < arr.length; y++) {
                arr[x][y].setEnabled(false);
            }
        }
        gameOver = true;
    }
    public void EnableButtons(){
        for(int x = 0; x < arr.length; x++){
            for (int y = 0; y < arr.length; y++) {
                arr[x][y].setEnabled(true);
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menuNewGame:
                ResetBoard();
                return true;
        }
        return true;
    }
}
