package frc.robot.classes;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * PneumaticsClaw
 */
public class PneumaticsClaw {
    
    private DoubleSolenoid claw;
   
    /**
     * Controls the Solenoid to open or close the claw
     * @param pneumaticsPort
     */
    public PneumaticsClaw (DoubleSolenoid doubleSolenoid){
        
        this.claw = doubleSolenoid;
    }
    
    /**
     * Opens the claw
     */
    public void openClaw() {
        SmartDashboard.putString("claw", "opening");
/* changed from portOpen to claw*/ 
        this.claw.set(DoubleSolenoid.Value.kForward);
    }
    
    /**
     * Closes the claw
     */
    public void closeClaw() {
        SmartDashboard.putString("claw", "closing");
/* Changed from portClose to claw*/
        this.claw.set(DoubleSolenoid.Value.kReverse);

    }
}