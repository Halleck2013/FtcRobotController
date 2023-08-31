package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class ProgrammingBoardDW {
//Yes this is something to think about.Weeeeee!
    private DigitalChannel touchSensor;
    private DcMotor motor0;
    private DcMotor motor1;

    private Servo servo;

    private ColorSensor colorSensor;
    private DistanceSensor distanceSensor;

    private double motor0_ticksPerRotation=0;
    private double motor1_ticksPerRotation=0;



    org.firstinspires.ftc.robotcore.external.Telemetry telemetry;

    public void init(HardwareMap hwmap,org.firstinspires.ftc.robotcore.external.Telemetry tele){
        touchSensor = hwmap.get(DigitalChannel.class,"digi1");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);

        motor0 = hwmap.get(DcMotor.class,"motor0");
        motor0.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motor1 = hwmap.get(DcMotor.class,"motor1");
        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        servo = hwmap.get(Servo.class,"servo0");
        colorSensor = hwmap.get(ColorSensor.class,"color1");
        distanceSensor = hwmap.get(DistanceSensor.class,"distance0");

        motor0_ticksPerRotation= motor0.getMotorType().getTicksPerRev();
        motor1_ticksPerRotation= motor1.getMotorType().getTicksPerRev();

        telemetry = tele;

        tele.addData("Ticks per rev ",motor0.getMotorType().getTicksPerRev());
        tele.addData("Ticks per rev ",motor1.getMotorType().getTicksPerRev());

    }

    public boolean getTouchSensorState(){
        return !touchSensor.getState();
    }

    public void setMotor0Speed(double speed){
        telemetry.addData("Motor Name:",motor0.getDeviceName());
        telemetry.addData("Speed:",String.valueOf(speed));
        motor0.setPower(speed);
    }

    public void setMotor1Speed(double speed){
        telemetry.addData(motor1.getDeviceName()," Motor set to ");
        telemetry.addData(String.valueOf(speed),"!");
        motor1.setPower(speed);
    }

    public double getMotor0Rotations(){
        telemetry.addData("cur po", toString().valueOf(motor0.getCurrentPosition()));
        return motor0.getCurrentPosition()/motor0_ticksPerRotation;
    }

    public double getMotor1Rotations(){
        return motor1.getCurrentPosition()/motor1_ticksPerRotation;
    }

    public void setServoPosition(double position){
        servo.setPosition(position);
    }

    public void setServoPositionAlt(double position){
        //Reverse the entry .75 - 1 = -.25 then make it positive.
        double tmppo = (position-1)*-1;
        //Limit range of motion to half way.
        if(tmppo>.5){tmppo=.5;}
        servo.setPosition(tmppo);
    }

    public int getAmountRed(){
        return colorSensor.red();
    }

    public double getDistance(DistanceUnit du){
        return distanceSensor.getDistance(du);
    }

}


