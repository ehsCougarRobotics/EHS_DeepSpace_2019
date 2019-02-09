package frc.robot.classes;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * RackandPinion
 */
public class RackandPinion {

    private Spark rackMotorController;
    private final Timer m_timer = new Timer();

    public RackandPinion(Spark rackpSpeedController) {
        this.rackMotorController = rackpSpeedController;
        
    }

    /**
     * When Sandstorms starts robot turns and for 2 seconds rack and pinion exstends at speed is 0.5 then stops.
     */
    public void sandstormInit(double seconds){
       SmartDashboard.putString("function", "sandstormInit");
        m_timer.reset(); // Reset Timer
        m_timer.start(); // Start Timer

        if (m_timer.get() < seconds) {
            this.rackMotorController.set(0.1);
        } else {
            this.rackMotorController.stopMotor();
            SmartDashboard.putString("function", "sandstormInit Ends");
        }
    
    }
    /**
     * It will retract rack and pinion in whatever speed between -1 and 1
    * @param speed
    */
    public void retract(double speed) {
        SmartDashboard.putString("RnP", "retracting");

        this.rackMotorController.set(speed);
    }
/**
 * it will extend rack and pinion in whatevr speed between -1 and 1
 * @param speed
 */
    public void extend(double speed) {
        SmartDashboard.putString("RnP", "extending");

        this.rackMotorController.set(speed);
    }

/**
 * Stop the rack and pinion motor
 */
    public void stopRackAndPinion() {
        SmartDashboard.putString("RnP", "stopRnP");

        this.rackMotorController.stopMotor();
        
    }
    public boolean isMovingForward() {
        return this.rackMotorController.getSpeed() > 0;
    } 
}