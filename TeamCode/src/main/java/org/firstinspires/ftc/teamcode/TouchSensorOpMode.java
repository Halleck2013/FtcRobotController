package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;

@TeleOp()
public class TouchSensorOpMode extends OpMode{
    ProgrammingBoardDW board = new ProgrammingBoardDW();
    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }
    @Override
    public void loop(){
        telemetry.addData("It is ",board.getTouchSensorState());
        if(board.getTouchSensorState()){
            telemetry.addData("Ouch! ","Quit it!");
        }else{
            telemetry.addData("Thank ","You!");
        }
    }
}
