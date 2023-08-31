package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;

@TeleOp()
public class MotorTriggerOpMode extends OpMode {
    ProgrammingBoardDW board = new ProgrammingBoardDW();
    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }
    @Override
    public void loop(){
        board.setMotor0Speed(gamepad1.right_trigger);
        board.setMotor1Speed(gamepad1.left_trigger);
    }
}