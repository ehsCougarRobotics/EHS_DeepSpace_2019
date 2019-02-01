package frc.robot.classes;

import edu.wpi.first.cameraserver.CameraServer;

/**
 * RobotCameraSever
 */
public class RobotCameraSever {

    public RobotCameraSever (){
        CameraServer.getInstance().startAutomaticCapture();
    }
    
}