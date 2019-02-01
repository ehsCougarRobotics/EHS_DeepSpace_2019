package frc.robot.classes;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * PneumaticsClaw
 */
public class PneumaticsClaw {
    
    private Solenoid pneumaticsClaws;
   
    /**
     * Controls the Solenoid to open or close the claw
     * @param pneumaticsPort
     */
    public PneumaticsClaw (Solenoid pneumaticsPort){
        
        this.pneumaticsClaws = pneumaticsPort;
    }
    
    /**
     * Opens the claw
     */
    public void openClaw() {
        SmartDashboard.putString("claw", "opening");

        this.pneumaticsClaws.set(true);
    }
    
    /**
     * Closes the claw
     */
    public void closeClaw() {
        SmartDashboard.putString("claw", "closing");

        this.pneumaticsClaws.set(false);

    }

    /**
     * Returns wether claw is open or closed
     * @return
     */
    public boolean getValue() {
        return this.pneumaticsClaws.get();
    }
}