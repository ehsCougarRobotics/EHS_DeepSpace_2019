package frc.robot.classes;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 * PneumaticsClaw
 */
public class PneumaticsClaw {
    
    private Solenoid portOpen;
    private Solenoid portClose;
   
    /**
     * Controls the Solenoid to open or close the claw
     * @param pneumaticsPort
     */
    public PneumaticsClaw (Solenoid solenoidPortOpen, Solenoid solenoidPortClose){
        
        this.portOpen = solenoidPortOpen;
        this.portClose = solenoidPortClose;
    }
    
    /**
     * Opens the claw
     */
    public void openClaw() {
        SmartDashboard.putString("claw", "opening");

        this.portOpen.set(true);
    }
    
    /**
     * Closes the claw
     */
    public void closeClaw() {
        SmartDashboard.putString("claw", "closing");

        this.portClose.set(false);

    }

    /**
     * Returns wether claw is open 
     * @return
     */
    public boolean getOpenValue() {
        return this.portOpen.get();
    }

    /**
     * Returns wether claw is closed
     * @return
     */
    public boolean getCloseValue() {
        return this.portClose.get();
    }
}