package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

import java.util.function.DoubleSupplier;

public class DriveTrainCommand extends CommandBase {
    DriveTrain m_driveTrain;
    DoubleSupplier speed;
    DoubleSupplier rot;

    public DriveTrainCommand(DriveTrain driveTrain, DoubleSupplier speed, DoubleSupplier rot){
        m_driveTrain = driveTrain;
        addRequirements(driveTrain);
        this.speed = speed;
        this.rot = rot;

    }


    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        m_driveTrain.drive(speed.getAsDouble(), rot.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        m_driveTrain.drive(0,0);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
