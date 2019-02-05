package frc.robot.classes;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * PneumaticsClaw
 */
public class PneumaticsClaw {
    
    private Solenoid claw;
   
    /**
     * Controls the Solenoid to open or close the claw
     * @param pneumaticsPort
     */
    public PneumaticsClaw (Solenoid doubleSolenoid){
        
        this.claw = doubleSolenoid;
    }
    
    /**
     * Opens the claw
     */
    public void openClaw() {
        SmartDashboard.putString("claw", "opening");
/* changed from portOpen to claw*/ 
        this.claw.set(true);
    }
    
    /**
     * Closes the claw
     */
    public void closeClaw() {
        SmartDashboard.putString("claw", "closing");
/* Changed from portClose to claw*/
        this.claw.set(false);

    }
}