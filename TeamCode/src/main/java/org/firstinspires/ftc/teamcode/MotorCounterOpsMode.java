package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;

@TeleOp()
public class MotorCounterOpsMode extends OpMode{
    ProgrammingBoardDW board = new ProgrammingBoardDW();

    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }
    @Override
    public void loop(){
        //board.setMotor0Speed(gamepad1.right_trigger);
        //board.setMotor1Speed(gamepad1.left_trigger);

        if(board.getTouchSensorState()){
            board.setMotor0Speed(.5);
            board.setMotor1Speed(.15);
        }else{
            board.setMotor0Speed(0);
            board.setMotor1Speed(0);
        }

        telemetry.addData("Motor0 Rotations", String.valueOf(board.getMotor0Rotations()));
        telemetry.addData("Motor1 Rotations",board.getMotor1Rotations());

    }
}
