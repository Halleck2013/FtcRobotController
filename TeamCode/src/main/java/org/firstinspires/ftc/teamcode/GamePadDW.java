package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamePadDW extends OpMode {

    @Override
    public void init(){

    }
    @Override
    public void loop(){
        //Test
        telemetry.addData("Left stick x",gamepad1.left_stick_x);
        telemetry.addData("Left stick x",gamepad1.left_stick_y);
        telemetry.addData("Right Trigger",gamepad1.left_trigger);
        telemetry.addData("Left Trigger",gamepad1.right_trigger);

        double speedForward = -gamepad1.left_stick_y/2.0;
        telemetry.addData("speed Forward",speedForward);

        telemetry.addData("Right stick x",gamepad1.right_stick_x);
        telemetry.addData("Right stick y",gamepad1.right_stick_y);

        if(gamepad1.a){
            telemetry.addData("You DID it ","A Bomb!");
        }

    }


}
