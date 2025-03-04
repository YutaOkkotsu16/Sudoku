package sudoku.userinterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sudoku.problemdomain.SudokuGame;

public class UserInterfaceImpl implements IUserInterfaceContract.View,
EventHandler<KeyEvent>{

    private final Stage stage;
    private final Group root;

    private final HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
    





    @Override
    public void handle(KeyEvent keyEvent){
    }
   
    @Override
    public void setListener(IUserInterfaceContract.EventListener listener){
    }

    @Override
    public void updateSquare(int x, int y, int input){
    }
    
}
