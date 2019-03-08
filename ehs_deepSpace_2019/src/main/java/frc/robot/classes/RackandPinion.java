package frc.robot.classes;

import edu.wpi.first.wpilibj.Spark;

/**
 * RackandPinion
 */
public class RackandPinion {

    private Spark rackMotorController;

    public RackandPinion(Spark rackpSpeedController) {
        this.rackMotorController = rackpSpeedController;

    }

    /**
     * It will retract rack and pinion in whatever speed between -1 and 1
     * 
     * @param speed
     */
    public void retract(double speed) {
        this.rackMotorController.set(speed);
    }

    /**
     * it will extend rack and pinion in whatevr speed between -1 and 1
     * 
     * @param speed
     */
    public void extend(double speed) {
        this.rackMotorController.set(speed);
    }

    /**
     * Stop the rack and pinion motor
     */
    public void stopRackAndPinion() {
        this.rackMotorController.stopMotor();

    }

    /**
     * Returns if motor is running forward (positive)
     * 
     * @return
     */
    public boolean isMovingForward() {
        return this.rackMotorController.getSpeed() > 0;
    }
}