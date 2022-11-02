package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;
public class Shooter extends SubsystemBase{
    WPI_TalonFX rightshooter = new WPI_TalonFX(Constants.right_shooter_motor);
    WPI_TalonFX leftshooter = new WPI_TalonFX(Constants.left_shooter_motor);

    public Shooter (){
        leftshooter.setInverted(true);
    }
    private MotorControllerGroup shooterMotor = new MotorControllerGroup(rightshooter, leftshooter);
    public void set_speed(int speed){
        shooterMotor.set(speed);
    }
        
    
    
}

