
package org.usfirst.frc.team5839.robot.subsystems;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	ArrayList<CANTalon> talons = new ArrayList<CANTalon>();
	Talon t;
	
	public ExampleSubsystem(){
		for(int i = 1; i < 5; i++){
			CANTalon talon;
			talon = new CANTalon(i);
			talons.add(talon);
		}
		t = new Talon(0);
	}
	
	public void moveCAN(int i ){
		talons.get(i - 1).set(Math.pow(-1, i));
	}
	
	public void moveTalon(double val){
		t.set(val);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

