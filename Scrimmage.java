package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Scrimmage", group="Robot")
public class Scrimmage extends OpMode {

    DcMotor LeftDrive, RightDrive, grabber, grabber2;

    @Override
    public void init() {
        LeftDrive = hardwareMap.dcMotor.get("LeftDrive");
        LeftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        RightDrive = hardwareMap.dcMotor.get("RightDrive");
        grabber = hardwareMap.dcMotor.get("Grabber");
        grabber.setDirection(DcMotorSimple.Direction.REVERSE);
        grabber2 = hardwareMap.dcMotor.get("Grabber2");
        grabber2.setDirection(DcMotorSimple.Direction.REVERSE);
        telemetry.speak("I, am, Stu");
    }

    @Override
    public void loop() {
        LeftDrive.setPower(-gamepad1.left_stick_y);
        RightDrive.setPower(-gamepad1.right_stick_y);
        grabber.setPower(gamepad1.right_trigger);
        grabber2.setPower(gamepad1.left_trigger);


    }

}