package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;

@TeleOp()
public class ServoOpsMode extends OpMode{
    ProgrammingBoardDW board = new ProgrammingBoardDW();

    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }

    @Override
    public void loop(){
        if(gamepad1.a){
            board.setServoPosition(1.0);
        }

        if(gamepad1.b){
            board.setServoPosition(0.0);
        }

        if(gamepad1.x){
            board.setServoPositionAlt(1.0);
        }

        if(gamepad1.y){
            board.setServoPositionAlt(0);
        }

        if(gamepad1.left_trigger>0){
            board.setServoPosition(gamepad1.left_trigger);
        }


    }
}

