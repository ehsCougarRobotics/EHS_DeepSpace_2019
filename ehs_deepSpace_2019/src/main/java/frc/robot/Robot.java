/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.classes.PneumaticsClaw;
import frc.robot.classes.RackandPinion;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DoubleSolenoid;

// Work on class implementation for future games
// import frc.robot.classes.RobotCameraSever;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
  
  public static DoubleSolenoid doubleSolenoidId = new DoubleSolenoid(3, 4); 
  private PneumaticsClaw claw = new PneumaticsClaw(doubleSolenoidId);
  private RackandPinion rack = new RackandPinion(new Spark(2));
    
  


  



  private final DifferentialDrive m_robotDrive
      = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
  private final Joystick m_stick = new Joystick(0);




  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    CameraServer.getInstance().startAutomaticCapture();
  }

  /**
   * This function is run once each time the robot enters autonomous mode.
   */
  @Override
  public void autonomousInit() {
  this.rack.sandstormInit(1);


  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {

    // m_stick.getRawButtonReleased(button)
  }

  /**
   * This function is called once each time the robot enters teleoperated mode.
   */
  @Override
  public void teleopInit() {
  }

  /**
   * This function is called periodically during teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {
    m_robotDrive.arcadeDrive(-m_stick.getY(), m_stick.getX());


    // Opens Pnuematic Claw
 if (m_stick.getRawButton(2)) {
  SmartDashboard.putString("btn", "2");
  // open claw
  this.claw.openClaw();
 } 


    // Closes Pnuematic Claw
    if (m_stick.getRawButton(3)) {
      SmartDashboard.putString("btn", "3");
      // open claw
      this.claw.closeClaw();
     } 
     

// Extend Rack and Pinion
 if (m_stick.getRawButton(7)) {
   this.rack.extend(0.5);
 }

 
// Retract Rack n Pinion
if (m_stick.getRawButton(8)) {
 this.rack.retract(-0.5);
}

// Stop Rack n pinion
if (m_stick.getRawButton(9)){
  this.rack.stopRackAndPinion();
}

}




  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
