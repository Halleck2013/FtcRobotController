package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoardDW;

@TeleOp()
public class DistanceColorOpMode extends OpMode{
    ProgrammingBoardDW board = new ProgrammingBoardDW();

    @Override
    public void init(){
        board.init(hardwareMap,telemetry);
    }

    @Override
    public void loop(){
        telemetry.addData("Red: ",board.getAmountRed());
        telemetry.addData("Distance (CM):",board.getDistance(DistanceUnit.CM));
        telemetry.addData("Distance (IN):",board.getDistance(DistanceUnit.INCH));
    }

}



