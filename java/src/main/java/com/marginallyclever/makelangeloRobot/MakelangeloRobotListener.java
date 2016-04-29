package com.marginallyclever.makelangeloRobot;

public interface MakelangeloRobotListener {
	// called when live robot is ready to receive more commands.
	public void connectionReady(MakelangeloRobot r);
	// called whenever data arrives from serial connection, regardless of confirmation.
	public void dataAvailable(MakelangeloRobot r,String data);
	// called when robot connection is disconnected
	public void disconnected(MakelangeloRobot r);
	// called when live robot has detected an error in the transmission
	public void lineError(MakelangeloRobot r,int lineNumber);
	// called when robot connection is confirmed
	public void portConfirmed(MakelangeloRobot r);
}
