package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.Telemetry;

@TeleOp(name="HellowWorld", group="Experiments")

public class HelloWorld extends OpMode {
    @Override
    public void init(){
        telemetry.addLine("Hello, World");
        telemetry.speak("Hello, World");
        telemetry.update();
    }
    public void loop(){

    }
}