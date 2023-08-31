package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;


@TeleOp()
public class OneMotorOpModeDW extends  OpMode{
    ProgrammingBoardDW board = new ProgrammingBoardDW();
    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }
    @Override
    public void loop(){
        board.setMotor0Speed(0.5);
    }
}