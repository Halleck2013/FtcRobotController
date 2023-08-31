package org.firstinspires.ftc.teamcode;
 import com.qualcomm.robotcore.eventloop.opmode.OpMode;
 import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
 public class HelloWorld extends OpMode {

    @Override
    public void init(){
        String myName;
        myName ="Darin";
        telemetry.addData("Hello",myName);
    }
    @Override
    public void loop(){}

}
